
package grupo7.rnegocio.impl;
import grupo7.accesodatos.Conexion;
import grupo7.accesodatos.Parametro;
import grupo7.rnegocio.entidades.*;
import grupo7.rnegocio.impl.*;
import grupo7.rnegocio.dao.*;
import java.sql.*;
import java.util.*;


public class NivelesImpl implements INiveles {
    @Override
    public int insertar(Niveles niveles) throws Exception {
        int numFilas = 0;
      String sqlC = "INSERT INTO niveles (id_n, nombre,creado, actualizado) VALUES (?,?,?,?)";
      ArrayList<Parametro> lisParametros = new ArrayList<>();
      lisParametros.add(new Parametro(1, niveles.getId_n()));
      lisParametros.add(new Parametro(2, niveles.getNombre()));
      lisParametros.add(new Parametro(3, niveles.getCreado()));
      lisParametros.add(new Parametro(4, niveles.getActualizado()));
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
   public int modificar(Niveles niveles) throws Exception {
      int numFilas = 0;
      String sqlC="UPDATE niveles SET id_n=?, nombre=?, creado=? actualizado=? WHERE id_n=?";
      ArrayList<Parametro> lisParametros=new ArrayList<>();
      lisParametros.add(new Parametro(1, niveles.getId_n()));
      lisParametros.add(new Parametro(2, niveles.getNombre()));
      lisParametros.add(new Parametro(3, niveles.getCreado()));
      lisParametros.add(new Parametro(4, niveles.getActualizado()));
      Conexion con = null;
      try {
          con=new Conexion();
          con.conectar();
          numFilas=con.ejecutarComando(sqlC, lisParametros);
      } catch (Exception e) {
          System.out.println("Error: "+e.getMessage());
      } finally {
          if (con!=null) {
              con.desconectar();
          }
       }
      return numFilas;
  }

   @Override
   public int eliminar(Niveles niveles) throws Exception {
      int numFilas = 0;
      String sqlC="DELETE FROM niveles WHERE id_n=?";
      ArrayList<Parametro> lisParametros=new ArrayList<>();
      lisParametros.add(new Parametro(1, niveles.getId_n()));
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
   public Niveles obtener(String codigo) throws Exception {
       Niveles elNiveles = null;
       String sqlC="SELECT id_n, nombre, creado, actualizado FROM niveles";
       ArrayList<Parametro> lisParametros=new ArrayList<>();
       lisParametros.add(new Parametro(1, codigo));
       Conexion con=null;
       try {
           con=new Conexion();
           ResultSet rst=con.ejecutarQuery(sqlC, lisParametros);
           while (rst.next()){
              elNiveles.setId_n(rst.getInt(1));
              elNiveles.setNombre(rst.getString(2));
              elNiveles.setCreado(rst.getDate(3));
              elNiveles.setActualizado(rst.getDate(4));
           }
      } catch (Exception e) {
          System.out.println("Error: "+e.getMessage());
       } finally {
          if (con != null) {
              con.desconectar();
          }
      }
      return elNiveles;
  }

  @Override
  public ArrayList<Niveles> obtener() throws Exception {
       ArrayList<Niveles> listNiveles = new ArrayList<>();
       String sqlC="SELECT id_n, nombre, creado,actualizado FROM niveles";
       Conexion con=null;
       try {
           con=new Conexion();
           ResultSet rst=con.ejecutarQuery(sqlC, null);
           
           while (rst.next()){
               Niveles nNiveles=new Niveles();
               nNiveles.setId_n(rst.getInt(1));
               nNiveles.setNombre(rst.getString(2));
               nNiveles.setCreado(rst.getDate(3));
               nNiveles.setActualizado(rst.getDate (4));
              
           }
       } catch (Exception e) {
           System.out.println("Error: "+e.getMessage());
       } finally {
           if (con != null) {
               con.desconectar();
           }
       }
       return listNiveles;
   }
}
