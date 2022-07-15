
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import java.util.*;

public class PlatoDAO {
    public ArrayList obtenerPlato(){
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
    public ArrayList buscarPlato(String nombre) {
        ArrayList<Plato> listPe = new ArrayList();
        Plato p1;
        Conexion objCon = new Conexion(); 
        BasicDBObject buscado = new BasicDBObject ("nombre", nombre);
        DBCursor cursor = objCon.coleccionPedido.find(buscado);
        while(cursor.hasNext()){
            //primero se utiliza el next  y luego los curr
            p1 = new Plato((String)cursor.next().get("nombre"), 
                    (List)cursor.curr().get("Ingredientes"));
            listPe.add(p1);
            listPe.toString();
        }
        return listPe;
    }
    
}
