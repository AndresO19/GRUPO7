/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import grupo7.accesodatos.*;
import grupo7.rnegocio.dao.*;
import grupo7.rnegocio.entidades.*;
import grupo7.rnegocio.impl.*;
import java.util.*;
import java.sql.*;

public class RolesTest {

    public RolesTest() {
    }

    @Test
    public void testGeneral() {
        IRoles rolesDao = new RolesImpl();
        // TEST INSERTAR
////
////            int filas = 0;
////            Roles rol=new Roles(3, "Michu", new java.util.Date(), new java.util.Date());
////            try {
////                filas = rolesDao.insertar(rol);
////                System.out.println("Ingreso de " + filas + " Filas Correctas");
////            } catch (Exception e) {
////                System.out.println("Error: " + e.getMessage());
////            }
////            assertEquals(filas > 0, true);
////
////          ///  TEST OBTENER POR CODIGO
////        
//            
        Roles roless=new Roles();
        
        try {
            roless=rolesDao.obtener(3);
            System.out.println("            "+roless.getId_r()+"    "+roless.getNombre()+"    "+roless.getCreado()+"    "+roless.getActualizado());
        } catch (Exception e) {
        }
        
          
//        //*------------------------------------------------------------------------------------------------------------------------------------*
////////        
//            //TEST LISTADO
//        ArrayList<Roles> roless = new ArrayList<>();
//        try {
//            roless = rolesDao.obtener();
//            for (Roles rolt : roless) {
//                System.out.println(rolt.getId_r() + " " + rolt.getNombre() + " " + rolt.getCreado() + " " + rolt.getActualizado());
//            }
//        } catch (Exception e) {
//        }
//        assertEquals(roless != null, true);
    }
}
