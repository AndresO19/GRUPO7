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

public class testeos {

    public testeos() {
    }

    @Test
    public void testGeneral() {
        IEtiquetas etiquetasDao = new EtiquetasImpl();
//            // TEST INSERTAR
//
//            int filas = 0;
//            Etiquetas etiqueta=new Etiquetas(1, "Mishell", new java.util.Date(), new java.util.Date());
//            try {
//                filas = etiquetasDao.insertar(etiqueta);
//                System.out.println("Ingreso de " + filas + " Filas Correctas");
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//            }
//            assertEquals(filas > 0, true);

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
            ArrayList<Etiquetas> etiquetass = new ArrayList<>();
            try {
                etiquetass = etiquetasDao.obtener();
                for (Etiquetas etiquetat : etiquetass) {
                    System.out.println(etiquetat.getId_e() + " " + etiquetat.getNombre() + " " + etiquetat.getCreado() + " " + etiquetat.getActualizado());
                }
            } catch (Exception e) {
            }
            assertEquals(etiquetass!= null, true);
    }
}
