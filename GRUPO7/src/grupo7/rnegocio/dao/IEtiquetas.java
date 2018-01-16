   


package grupo7.rnegocio.dao;

import java.util.*;
import grupo7.rnegocio.entidades.*;


public interface IEtiquetas {
   public int insertar (Etiquetas etiquetas) throws Exception;
    public int modificar (Etiquetas etiquetas) throws Exception;
    public int eliminar (Etiquetas etiquetas) throws Exception;
    public Etiquetas obtener(int codigo) throws Exception;
    public ArrayList<Etiquetas> obtener () throws Exception; 
}
