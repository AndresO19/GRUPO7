package grupo7.rnegocio.impl;

import grupo7.rnegocio.impl.*;
import grupo7.rnegocio.entidades.*;
import grupo7.rnegocio.dao.*;
import grupo7.accesodatos.*;
import java.util.*;
import java.sql.*;

public class UsuariosImpl implements IUsuarios {

    @Override
    public int insertar(Usuarios usuarios) throws Exception {
        int numFilas = 0;
        String sqlC = "insert into usuarios (id_u, nombre, email, pasword, id_r, creado, actualizado) VALUES (?,?,?,?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, usuarios.getId_u()));
        lisParametros.add(new Parametro(2, usuarios.getNombre()));
        lisParametros.add(new Parametro(3, usuarios.getEmail()));
        lisParametros.add(new Parametro(4, usuarios.getPasword()));
        lisParametros.add(new Parametro(5, usuarios.getRoles()));
        if (usuarios.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(6, new java.sql.Date(((java.util.Date) usuarios.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(6, usuarios.getCreado()));
        }
        if (usuarios.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(7, new java.sql.Date(((java.util.Date) usuarios.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(7, usuarios.getActualizado()));
        }

        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int modificar(Usuarios usuarios) throws Exception {
        int numFilas = 0;
        String sqlC = "UPDATE usuarios SET id_u=?, nombre=?, email=?, pasword=?, id_r=?, creado=?, actualizado=? WHERE id_u=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, usuarios.getId_u()));
        lisParametros.add(new Parametro(2, usuarios.getNombre()));
        lisParametros.add(new Parametro(3, usuarios.getEmail()));
        lisParametros.add(new Parametro(4, usuarios.getPasword()));
        lisParametros.add(new Parametro(5, usuarios.getRoles()));
        if (usuarios.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(6, new java.sql.Date(((java.util.Date) usuarios.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(6, usuarios.getCreado()));
        }
        if (usuarios.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(7, new java.sql.Date(((java.util.Date) usuarios.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(7, usuarios.getActualizado()));
        }

        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int eliminar(Usuarios usuarios) throws Exception {
        int numFilas = 0;
        String sqlC = "DELETE FROM usuarios WHERE id_u=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, usuarios.getId_u()));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public Usuarios obtener(int codigo) throws Exception {
        Usuarios nUsuario = null;
        Roles rol = null;
        IRoles roldao = new RolesImpl();
        String sqlC = "SELECT id_u, nombre, email, pasword, id_r, creado, actualizado FROM id_ur";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            ResultSet rst = con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()) {
                rol = new Roles();
                rol = roldao.obtener(rst.getInt(5));
                nUsuario.setId_u(rst.getInt(1));
                nUsuario.setNombre(rst.getString(2));
                nUsuario.setEmail(rst.getString(3));
                nUsuario.setPasword(rst.getString(4));
                nUsuario.setCreado(rst.getDate(6));
                nUsuario.setActualizado(rst.getDate(7));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return nUsuario;
    }

    @Override
    public ArrayList<Usuarios> obtener() throws Exception {
        ArrayList<Usuarios> listUsuario = new ArrayList<>();
        String sqlC = "SELECT id_u, nombre, email, pasword, id_r, creado, actualizado FROM usuarios";
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, null);
            Roles rol = null;
            IRoles roldao = new RolesImpl();
            Usuarios user = null;
            while (rst.next()) {
                rol = new Roles();              
                user = new Usuarios();
                user.setId_u(rst.getInt(1));
                user.setNombre(rst.getString(2));
                user.setEmail(rst.getString(3));
                user.setPasword(rst.getString(4));
                rol = roldao.obtener(rst.getInt(5));
                user.setCreado(rst.getDate(6));
                user.setActualizado(rst.getDate(7));
                listUsuario.add(user);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return listUsuario;
    }
}
