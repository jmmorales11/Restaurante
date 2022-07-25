
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import java.util.*;

public class PlatoDAO {
            public ArrayList obtenerPlato(){
        ArrayList<Plato> listaPlato= new ArrayList<Plato>();
        Plato aux1;
        Conexion objCon= new Conexion();
        DBCursor cursor= objCon.coleccionPlato.find();
        while (cursor.hasNext()){
            aux1= new Plato((String) cursor.next().get("nombre"),
             (ArrayList)cursor.curr().get("Ingredientes")); 
            listaPlato.add(aux1);
        }
        return listaPlato;
    }
    public Plato buscarPlato(String nombre) {
        ArrayList<Plato> listaPlato= new ArrayList<Plato>();  
        listaPlato=obtenerPlato();
        Plato p=new Plato();
        for (int i=0; i< listaPlato.size(); i++){
            if(listaPlato.get(i).getNombre().equalsIgnoreCase(nombre)){
               p= listaPlato.get(i);
                System.out.println("obtener plato if"+p.getNombre()+"\n");
            }
            
        }
        return p;
    }
}
