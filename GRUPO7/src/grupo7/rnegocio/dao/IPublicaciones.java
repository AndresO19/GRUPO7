
package grupo7.rnegocio.dao;

import java.util.*;
import grupo7.rnegocio.entidades.*;


public interface IPublicaciones {
   public int insertar (Publicaciones publicaciones) throws Exception;
    public int modificar (Publicaciones publicaciones) throws Exception;
    public int eliminar (Publicaciones publicaciones) throws Exception;
    public Publicaciones obtener(int codigo) throws Exception;
    public ArrayList<Publicaciones> obtener () throws Exception; 
}
