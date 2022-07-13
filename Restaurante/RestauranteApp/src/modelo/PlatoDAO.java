
package modelo;

import com.mongodb.DBCursor;
import java.util.ArrayList;
import java.util.*;

public class PlatoDAO {
    public ArrayList obtenerPedidos(){
        ArrayList<Plato> listaPlato= new ArrayList<Plato>();
        Plato aux1= null;
        Conexion objCon= new Conexion();
        DBCursor cursor= objCon.coleccionPedido.find();
        while (cursor.hasNext()){
            aux1= new Plato((String) cursor.next().get("nombre"),
             (ArrayList)cursor.next().get("Ingredientes")); 
            listaPlato.add(aux1);
        }
        return listaPlato;
    }
}
