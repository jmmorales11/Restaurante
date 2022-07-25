
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;

/**
 *
 * @author Jeimy
 */
public class ClienteDAO {
    public void insertarCliente(Cliente cliente1){
        Conexion objCon= new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("nPedido", cliente1.getnPedido());
        documento.put("nombre", cliente1.getNombreCliente());
        documento.put("Total", cliente1.getPrecioTotal());
        objCon.coleccionCliente.insert(documento);
    }
    public ArrayList obtenerCliente(){
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        Cliente aux1= null;
        Conexion objCon= new Conexion();
        DBCursor cursor= objCon.coleccionCliente.find();
        while ( cursor.hasNext()){
            aux1= new Cliente((String) cursor.next().get("nPedido"),
                    (String)cursor.curr().get("nombre"),
                    (String)cursor.curr().get("Total"));
            listaCliente.add(aux1);
        }
        return listaCliente;
    }
}
