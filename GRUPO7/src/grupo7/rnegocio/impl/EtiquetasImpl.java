
package grupo7.rnegocio.impl;

import grupo7.accesodatos.*;
import grupo7.rnegocio.dao.*;
import grupo7.rnegocio.entidades.*;
import java.util.*;
import java.sql.*;

public class EtiquetasImpl implements IEtiquetas {
    
    
    @Override
    public int insertar(Etiquetas etiquetas) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO Etiqueta (id_e, nombre, creado, actualizado ) VALUES (?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, etiquetas.getId_e()));
        lisParametros.add(new Parametro(2, etiquetas.getNombre()));
        lisParametros.add(new Parametro(3, etiquetas.getCreado()));
        lisParametros.add(new Parametro(4, etiquetas.getActualizado()));
      
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
    public int modificar(Etiquetas etiquetas) throws Exception {
        int numFilas = 0;
        String sqlC="UPDATE etiquetas SET id_e=?, nombre=?, creado=? actualizado=?  WHERE id_e=?";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, etiquetas.getId_e()));
        lisParametros.add(new Parametro(2, etiquetas.getNombre()));
        lisParametros.add(new Parametro(3, etiquetas.getCreado()));
        lisParametros.add(new Parametro(4, etiquetas.getActualizado()));
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
    public int eliminar(Etiquetas etiquetas) throws Exception {
        int numFilas = 0;
        String sqlC="DELETE FROM etiquetas WHERE id_e=?";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, etiquetas.getId_e()));
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
    public Etiquetas obtener(String codigo) throws Exception {
        Etiquetas nEtiqueta = null;
        String sqlC="SELECT id_e, nombre, creado, actualizado, FROM etiquetas";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, codigo));
        Conexion con=null;
        try {
            con=new Conexion();
            ResultSet rst=con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()){
                nEtiqueta.setId_e(rst.getInt(1));
                nEtiqueta.setNombre(rst.getString(2));
                nEtiqueta.setCreado(rst.getDate(3));
                nEtiqueta.setActualizado(rst.getDate(4));
              
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
    public ArrayList<Etiquetas> obtener() throws Exception {
        ArrayList<Etiquetas> listEtiqueta = new ArrayList<>();
        String sqlC="SELECT id_e, nombre, creado, actualizado FROM etiquetas";
        Conexion con=null;
        try {
            con=new Conexion();
            ResultSet rst=con.ejecutarQuery(sqlC, null);
            
            while (rst.next()){
                Etiquetas nEtiquetas=new Etiquetas();
                nEtiquetas.setId_e(rst.getInt(1));
                  nEtiquetas.setNombre(rst.getString(2));
                  nEtiquetas.setCreado(rst.getDate(3));
                  nEtiquetas.setActualizado(rst.getDate(4));
              
                listEtiqueta.add(  nEtiquetas);
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
