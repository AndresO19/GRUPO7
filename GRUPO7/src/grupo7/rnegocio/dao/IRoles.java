
package grupo7.rnegocio.dao;

import java.util.*;
import grupo7.rnegocio.entidades.*;


public interface IRoles {
   public int insertar (Roles roles) throws Exception;
    public int modificar (Roles roles) throws Exception;
    public int eliminar (Roles roles) throws Exception;
    public Roles obtener(String codigo) throws Exception;
    public ArrayList<Roles> obtener () throws Exception; 
}
