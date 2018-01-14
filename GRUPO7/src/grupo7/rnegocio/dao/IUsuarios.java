
package grupo7.rnegocio.dao;

import java.util.*;
import grupo7.rnegocio.entidades.*;


public interface IUsuarios {
    public int insertar (Usuarios usuarios) throws Exception;
    public int modificar (Usuarios usuarios) throws Exception;
    public int eliminar (Usuarios usuarios) throws Exception;
    public Usuarios obtener(int codigo) throws Exception;
    public ArrayList<Usuarios> obtener () throws Exception;
}
