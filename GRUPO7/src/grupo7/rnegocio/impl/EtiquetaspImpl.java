package grupo7.rnegocio.impl;

import grupo7.rnegocio.impl.*;
import grupo7.rnegocio.entidades.*;
import grupo7.rnegocio.dao.*;
import grupo7.accesodatos.*;
import java.util.*;
import java.sql.*;

public class EtiquetaspImpl implements IEtiquetas_publicaciones {
   @Override
    public int insertar(Etiquetas_publicaciones ep) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO Etiquetas_publicaciones (id_ep, id_e,id_p, creado, actualizado ) VALUES (?,?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, ep.getId_ep()));
        lisParametros.add(new Parametro(2, ep.getEtiquetas().getId_e()));
        lisParametros.add(new Parametro(3, ep.getPublicaciones().getId_p()));
        if(ep.getCreado()instanceof java.util.Date)
        {
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) ep.getCreado()).getTime())));
        }
        else
        
        {
            lisParametros.add(new Parametro(4, ep.getCreado()));
        }
        
         if(ep.getActualizado()instanceof java.util.Date)
        {
            lisParametros.add(new Parametro(5, new java.sql.Date(((java.util.Date) ep.getActualizado()).getTime())));
        }
        else
        
        {
            lisParametros.add(new Parametro(5, ep.getActualizado()));
        }
        Conexion con = null;
        try {
            con=new Conexion();
            con.conectar();
            numFilas=con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        } finally {
            if(con!=null){
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int modificar(Etiquetas_publicaciones ep) throws Exception {
        int numFilas = 0;
        String sqlC="UPDATE etiquetas_publicaciones SET id_ep=?, id_e=?,id_p=?, creado=? actualizado=?  WHERE id_ep=?";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, ep.getId_ep()));
        lisParametros.add(new Parametro(2, ep.getEtiquetas().getId_e()));
        lisParametros.add(new Parametro(3, ep.getPublicaciones().getId_p()));
        lisParametros.add(new Parametro(4, ep.getCreado()));
        lisParametros.add(new Parametro(5, ep.getActualizado()));
        Conexion con=null;
        try {
            con=new Conexion();
            con.conectar();
            numFilas=con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int eliminar(Etiquetas_publicaciones ep) throws Exception {
        int numFilas = 0;
        String sqlC="DELETE FROM etiquetas_publicaciones WHERE id_ep=?";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, ep.getId_ep()));
        Conexion con=null;
        try {
            con=new Conexion();
            con.conectar();
            numFilas=con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public Etiquetas_publicaciones obtener(String codigo) throws Exception {
        Etiquetas_publicaciones nEtiqueta = null;
        Etiquetas etiquetas=null;
        IEtiquetas etiquetasdao=new EtiquetasImpl();
        Publicaciones publicaciones=null;
        IPublicaciones publicacionesdao=new PublicacionesImpl();
        String sqlC="SELECT id_ep, id_e, id_p, creado, actualizado, FROM Etiquetas_publicaciones";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, codigo));
        Conexion con=null;
        try {
            con=new Conexion();
            con.conectar();
            ResultSet rst=con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()){
                nEtiqueta.setId_ep(rst.getInt(1));
                etiquetas = new Etiquetas();
                etiquetas = etiquetasdao.obtener(rst.getString(2));
                publicaciones = new Publicaciones();
                publicaciones = publicacionesdao.obtener(rst.getInt(3));
                nEtiqueta.setCreado(rst.getDate(4));
                nEtiqueta.setActualizado(rst.getDate(5));
              
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return nEtiqueta;
    }

    @Override
    public ArrayList<Etiquetas_publicaciones> obtener() throws Exception {
        ArrayList<Etiquetas_publicaciones> listEtiqueta = new ArrayList<>();
        Etiquetas etiquetas=null;
        IEtiquetas etiquetasdao=new EtiquetasImpl();
        Publicaciones publicaciones=null;
        IPublicaciones publicacionesdao=new PublicacionesImpl();
        String sqlC="SELECT id_ep, id_e, id_p, creado, actualizado FROM Etiquetas_publicaciones";
        Conexion con=null;
        try {
            con=new Conexion();
            con.conectar();
            ResultSet rst=con.ejecutarQuery(sqlC, null);
            Etiquetas_publicaciones ep=null;
            while (rst.next()){
                ep = new Etiquetas_publicaciones();
                ep.setId_ep(rst.getInt(1));
                etiquetas = new Etiquetas();
                etiquetas = etiquetasdao.obtener(rst.getString(2));
                publicaciones = new Publicaciones();
                publicaciones = publicacionesdao.obtener(rst.getInt(3));
                ep.setCreado(rst.getDate(4));
                ep.setActualizado(rst.getDate(5));
              
                listEtiqueta.add(ep);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return listEtiqueta;
    } 
}
