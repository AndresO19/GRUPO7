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

public class Publicacionestest {

    public Publicacionestest() {
    }

    @Test
    public void testGeneral() {
        IPublicaciones puDao = new PublicacionesImpl();
        ///////////INSERTAR TEST
//        int filas = 0;
//
//        Niveles nivels = new Niveles(1, "Bryan", new java.util.Date(), new java.util.Date());
//        Roles rols = new Roles(1, "Michu", new java.util.Date(), new java.util.Date());
//        Usuarios user = new Usuarios(3, "Daniel", "ao@gmail.com", "1295", rols, new java.util.Date(), new java.util.Date());
//        Publicaciones per = new Publicaciones(1, user, nivels, "casa", "ropa", 1, 1, 1.5, new java.util.Date(), new java.util.Date());
//        
//
//        try {
//            filas = puDao.insertar(per);
//            System.out.println("Filas insertadas: " + filas);
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        assertEquals(filas > 0, true);

        ////LISTAR POR CODIGO TEST
//        Publicaciones up = new Publicaciones();
//
//        try {
//            up = puDao.obtener(1);
//            System.out.println("CODIGO_P " + " CODIGO_U" + " CODIGO_N" + " TITULO " + " CONTENIDO " + " VISTAS " + " VOTOS " + " CREADO " + "      ACTUALIZADO ");
//            System.out.println(up.getId_p() + "             " + up.getUsuarios().getId_u() + "        " + up.getNiveles().getId_n() + "     " + up.getTitulo() + "      " + up.getContenido() + "     " + up.getVistas() + "      " + up.getVotos() + "    " + up.getCreado() + "   " + up.getActualizado());
//        } catch (Exception e) {
//            System.out.println("error: " + e.getMessage());
//        }
//        assertEquals(up != null, true);
//////////        //// test listado
//       
        ArrayList<Publicaciones> ups = new ArrayList<>();
        try {
            ups = puDao.obtener();
            for (Publicaciones nup : ups) {
                System.out.println("CODIGO_P " + " CODIGO_U" + " CODIGO_N" + " TITULO " + " CONTENIDO " + " VISTAS " + " VOTOS " + " CREADO " + "      ACTUALIZADO ");
                System.out.println(nup.getId_p() + "             " + nup.getUsuarios().getId_u() + "        " + nup.getNiveles().getId_n() + "     " + nup.getTitulo() + "      " + nup.getContenido() + "     " + nup.getVistas() + "      " + nup.getVotos() + "    " + nup.getCreado() + "   " + nup.getActualizado());
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        assertEquals(ups != null, true);

    }
}
