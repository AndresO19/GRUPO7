/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo7;
import grupo7.accesodatos.*;
import grupo7.rnegocio.impl.*;
import grupo7.rnegocio.dao.*;
import grupo7.rnegocio.entidades.*;
import java.sql.*;
import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SONY
 */
public class etiquetastest {

    public etiquetastest() {
        
    }

        @Test
        public void testGeneral(){
        
            
        IEtiquetas etiquetasDao = new EtiquetasImpl();
            // TEST INSERTAR

            int filas = 0;
            Etiquetas etiqueta=new Etiquetas(5, "Mishell", new java.util.Date(), new java.util.Date());
            try {
                filas = etiquetasDao.insertar(etiqueta);
                System.out.println("Ingreso de " + filas + " Filas Correctas");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            assertEquals(filas > 0, true);

            //TEST OBTENER POR CODIGO
//        
//        Etiquetas etiqueta=new Etiquetas();
//        try {
//            etiqueta=etiquetasDao.obtener("1");
//            System.out.println("            "+etiqueta.getId_e()+"    "+etiqueta.getNombre()+"    "+etiqueta.getCreado()+"    "+etiqueta.getActualizado());
//        } catch (Exception e) {
//        }
//        //*------------------------------------------------------------------------------------------------------------------------------------*
////        
//            //TEST LISTADO
//            ArrayList<Etiquetas> etiquetass = new ArrayList<>();
//            try {
//                etiquetass = etiquetasDao.obtener();
//                for (Etiquetas etiquetat : etiquetass) {
//                    System.out.println(etiquetat.getId_e() + " " + etiquetat.getNombre() + " " + etiquetat.getCreado() + " " + etiquetat.getActualizado());
//                }
//            } catch (Exception e) {
//            }
//            assertEquals(etiquetass != null, true);
//        }
    }


}
