
package grupo7.rnegocio.dao;

import java.util.ArrayList;
import grupo7.rnegocio.entidades.*;


public interface IEtiquetas_publicaciones {
   public int insertar (Etiquetas_publicaciones ep) throws Exception;
    public int modificar (Etiquetas_publicaciones ep) throws Exception;
    public int eliminar (Etiquetas_publicaciones ep) throws Exception;
    public Etiquetas_publicaciones obtener(String codigo) throws Exception;
    public ArrayList<Etiquetas_publicaciones> obtener () throws Exception; 
}
