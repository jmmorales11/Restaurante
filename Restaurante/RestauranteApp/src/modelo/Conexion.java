
package modelo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Conexion {
    DB baseDatos;
    DBCollection coleccion;
    DBCollection coleccionPedido;
    DBCollection coleccionPlato;
    DBCollection coleccionIngre;
    DBCollection coleccionCliente;
    
    //Constructor
    public Conexion(){
        MongoClient mongo=new MongoClient("localhost",27017);
        baseDatos= mongo.getDB("Restaurante");
        coleccion= baseDatos.getCollection("Usuario");
        coleccionPedido=baseDatos.getCollection("Pedidos");
        coleccionPlato=baseDatos.getCollection("Plato");
        coleccionIngre=baseDatos.getCollection("Ingrediente");
        coleccionCliente=baseDatos.getCollection("Cliente");
        System.out.println("Conexion aBD ok");
    }
}

