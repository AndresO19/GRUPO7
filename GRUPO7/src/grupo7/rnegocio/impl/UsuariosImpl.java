//
//package grupo7.rnegocio.impl;
//
//
//import grupo7.rnegocio.dao.*;
//import grupo7.rnegocio.entidades.*;
//import java.util.*;
//import java.sql.*;
//
//public class UsuariosImpl {
//    @Override
//    public int insertar(Usuarios usuarios) throws Exception {
//        int numFilas = 0;
//        String sqlC = "INSERT INTO usuarios (id_u, nombre,email,pasword,id_r,creado, actualizado) VALUES (?,?,?,?,?,?,?,?)";
//        ArrayList<Parametro> lisParametros = new ArrayList<>();
//        lisParametros.add(new Parametro(1, usuarios.getCodigoD()));
//        lisParametros.add(new Parametro(2, usuarios.getNombre()));
//        lisParametros.add(new Parametro(3, usuarios.getApellido()));
//        lisParametros.add(new Parametro(4, usuarios.gettEspecialidad()));
//        lisParametros.add(new Parametro(5, usuarios.getHorarioC()));
//        Conexion con = null;
//        try {
//            con=new Conexion();
//            con.conectar();
//            numFilas=con.ejecutarComando(sqlC, lisParametros);
//        } catch (Exception e) {
//            System.out.println("error: "+e.getMessage());
//        } finally {
//            if(con!=null){
//                con.desconectar();
//            }
//        }
//        return numFilas;
//    }
//
//    @Override
//    public int modificar(Usuario usuario) throws Exception {
//        int numFilas = 0;
////        String sqlC="UPDATE Doctor SET codigoD=?, nombre=?, apellido=? tEspecialidad=? horarioC=? WHERE codigo=?";
////        ArrayList<Parametro> lisParametros=new ArrayList<>();
////        lisParametros.add(new Parametro(1, doctor.getCodigoD()));
////        lisParametros.add(new Parametro(2, doctor.getNombre()));
////        lisParametros.add(new Parametro(3, doctor.getApellido()));
////        lisParametros.add(new Parametro(4, doctor.gettEspecialidad()));
////        lisParametros.add(new Parametro(5, doctor.getHorarioC()));
////        lisParametros.add(new Parametro(6, doctor.getCodigoD()));
////        Conexion con=null;
////        try {
////            con=new Conexion();
////            con.conectar();
////            numFilas=con.ejecutarComando(sqlC, lisParametros);
////        } catch (Exception e) {
////            System.out.println("Error: "+e.getMessage());
////        } finally {
////            if (con != null) {
////                con.desconectar();
////            }
////        }
//        return numFilas;
//    }
//
//    @Override
//    public int eliminar(Usuario usuario) throws Exception {
//        int numFilas = 0;
////        String sqlC="DELETE FROM Doctor WHERE codigo=?";
////        ArrayList<Parametro> lisParametros=new ArrayList<>();
////        lisParametros.add(new Parametro(1, doctor.getCodigoD()));
////        Conexion con=null;
////        try {
////            con=new Conexion();
////            con.conectar();
////            numFilas=con.ejecutarComando(sqlC, lisParametros);
////        } catch (Exception e) {
////            System.out.println("Error: "+e.getMessage());
////        } finally {
////            if (con != null) {
////                con.desconectar();
////            }
////        }
//        return numFilas;
//    }
//
//    @Override
//    public Usuario obtener(String codigo) throws Exception {
//        Usuario nUsuario = null;
////        String sqlC="SELECT codigoD, nombre, apellido, tEspecialidad, horarioC FROM Doctor";
////        ArrayList<Parametro> lisParametros=new ArrayList<>();
////        lisParametros.add(new Parametro(1, codigo));
////        Conexion con=null;
////        try {
////            con=new Conexion();
////            ResultSet rst=con.ejecutarQuery(sqlC, lisParametros);
////            while (rst.next()){
////                nDoctor.setCodigoD(rst.getString(1));
////                nDoctor.setNombre(rst.getString(2));
////                nDoctor.setApellido(rst.getString(3));
////                nDoctor.settEspecialidad(rst.getString(4));
////                nDoctor.setHorarioC(rst.getString(5));
////            }
////        } catch (Exception e) {
////            System.out.println("Error: "+e.getMessage());
////        } finally {
////            if (con != null) {
////                con.desconectar();
////            }
////        }
//        return nUsuario;
//    }
//
//    @Override
//    public ArrayList<Usuario> obtener() throws Exception {
//        ArrayList<Usuario> listUsuario = new ArrayList<>();
////        String sqlC="SELECT codigoD, nombre, apellido, tEspecialidad, horarioC FROM Doctor";
////        Conexion con=null;
////        try {
////            con=new Conexion();
////            ResultSet rst=con.ejecutarQuery(sqlC, null);
////            
////            while (rst.next()){
////                Doctor nDoctor=new Doctor();
////                nDoctor.setCodigoD(rst.getString(1));
////                nDoctor.setNombre(rst.getString(2));
////                nDoctor.setApellido(rst.getString(3));
////                nDoctor.settEspecialidad(rst.getString(4));
////                nDoctor.setHorarioC(rst.getString(5));
////                listDoctor.add(nDoctor);
////            }
////        } catch (Exception e) {
////            System.out.println("Error: "+e.getMessage());
////        } finally {
////            if (con != null) {
////                con.desconectar();
////            }
////        }
//        return listUsuario;
//    }
//}
