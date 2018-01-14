
package grupo7.rnegocio.dao;

import java.util.*;
import grupo7.rnegocio.entidades.*;


public interface INiveles {
    public int insertar (Niveles niveles) throws Exception;
    public int modificar (Niveles niveles) throws Exception;
    public int eliminar (Niveles niveles) throws Exception;
    public Niveles obtener(int  codigo) throws Exception;
    public ArrayList<Niveles> obtener () throws Exception;
}
