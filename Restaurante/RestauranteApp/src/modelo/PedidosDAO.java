
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;

public class PedidosDAO {
    public void insertarPedidos(Pedido ped){
        Conexion objCon = new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("npedido",ped.getNumeroPedido());
        documento.put("nombrePedido",ped.getNombrePedido());
        documento.put("cantidad",ped.getCantidad());
        objCon.coleccionPedido.insert(documento);
    }
    public ArrayList obtenerPedidos(){
        ArrayList<Pedido> listaPedidos= new ArrayList<Pedido>();
        Pedido aux1= null;
        Conexion objCon= new Conexion();
        DBCursor cursor= objCon.coleccionPedido.find();
        while (cursor.hasNext()){
            aux1= new Pedido((String) cursor.next().get("npedido"),
            (String) cursor.next().get("nombrePedido"),
            (int) cursor.next().get("cantidad")); 
            listaPedidos.add(aux1);
           
        }
        return listaPedidos;
    }
//    public ArrayList buscarProveedorPais(String pais) {
//        ArrayList<Pedido> listProv = new ArrayList();
//        Pedido p1;
//        Conexion objCon = new Conexion(); 
//        BasicDBObject buscado = new BasicDBObject ("npedido", pais);
//        DBCursor cursor = objCon.coleccion.find(buscado);
//        while(cursor.hasNext()){
//            p1 = new Pedido((String)cursor.next().get("nombre"), (String)cursor.curr().get("pais"));
//            System.out.println("datos: " + p1);
//            listProv.add(p1);
//        }
//        return listProv;
//    }
    
}
