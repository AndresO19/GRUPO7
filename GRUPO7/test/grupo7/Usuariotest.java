
package grupo7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.sql.*;
import grupo7.rnegocio.dao.*;
import grupo7.rnegocio.entidades.*;
import grupo7.rnegocio.impl.*;
import grupo7.accesodatos.*;


public class Usuariotest {
    
    public Usuariotest() {
    }
    @Test 
    public  void testGeneral(){
        IUsuarios usdao = new UsuariosImpl();
        //// test insertat
        
        int filas=0;
        
        Roles rol=new Roles(1, "enero", new java.util.Date(), new java.util.Date());
        Usuarios us=new Usuarios(1, "Daniel", "ao@gmail.com", "1295", rol, new java.util.Date(), new java.util.Date());
        
           try {
            filas=usdao.insertar(us);
            System.out.println("Filas insertadas: "+filas);
        } catch (Exception e) {
              System.out.println("Error: " + e.getMessage());
        }
        assertEquals(filas>0, true);
        
        
        //////test listado
        
        Usuarios user=new Usuarios();
        try {
            user=usdao.obtener(1);
            System.out.println(user.getId_u()+" "+user.getNombre()+" "+user.getEmail()+" "+user.getPasword()+" "+user.getRoles().getId_r()+" "+user.getCreado()+" "+user.getActualizado());
        } catch (Exception e) {
        }
        
        //// test listado
        
        ArrayList<Usuarios> usuarioss = new ArrayList<>();
        
        try{
            usuarioss = usdao.obtener();
            for (Usuarios usuarios : usuarioss) {
                 System.out.println(user.getId_u()+" "+user.getNombre()+" "+user.getEmail()+" "+user.getPasword()+" "+user.getRoles().getId_r()+" "+user.getCreado()+" "+user.getActualizado());
            }
        }catch (Exception e){            
        }
        assertEquals(usuarioss!= null, true);
        
        
        
        
    }
    
}
