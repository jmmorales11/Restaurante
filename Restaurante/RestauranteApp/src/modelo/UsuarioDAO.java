/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 *
 * @author Jeimy
 */
public class UsuarioDAO {
    
    private Conexion objCon;
    
    public UsuarioDAO() {
        objCon=new Conexion();
    }
    
    public void insertarUsuario(Usuario p){ 
        BasicDBObject documento= new BasicDBObject();
        documento.put("nombre", p.getNombre());
        documento.put("apellido", p.getApellido());
        documento.put("id", p.getId());
        documento.put("contraseña", p.getContraseña());
        documento.put("email", p.getEmail());
        documento.put("numeroCelular", p.getNumeroCelular());
        documento.put("dia", p.getDia());
        documento.put("mes", p.getMes());
        documento.put("año", p.getAño());
        objCon.coleccion.insert(documento);
    }
    
    public Usuario obtenerUsuario(String id) {
       DBCursor cursor = objCon.coleccion.find();
       
       while (cursor.hasNext()){
           DBObject dbObject = cursor.next();
           if (((String)dbObject.get("id")).equals(id)){
               return new Usuario(
                       (String)dbObject.get("nombre"),
                       (String)dbObject.get("apellido"),
                       (String)dbObject.get("id"),
                       (String)dbObject.get("contraseña"),
                       (String)dbObject.get("email"),
                       (String)dbObject.get("numeroCelular"),
                       (String)dbObject.get("dia"),
                       (String)dbObject.get("mes"),
                       (String)dbObject.get("año")
               );
           }
       }
       
       throw new IllegalArgumentException();
    }
    
    public void modificar(String nombre,
            String apellido,
            String id,
            String contraseña,
            String email,
            String numeroCelular,
            String dia,
            String mes, 
            String año){
        DBObject nombreNuevo = new BasicDBObject ("nombre", nombre);
        DBObject apellidoNuevo = new BasicDBObject ("apellido", apellido);
        DBObject nuevo= new BasicDBObject().append("$set", new BasicDBObject().append("id", id));
        DBObject contraseñaNuevo = new BasicDBObject ("contraseña", contraseña);
        DBObject emailNuevo = new BasicDBObject ("email", email);
        DBObject numeroCelularNuevo = new BasicDBObject ("numeroCelular", numeroCelular);
        DBObject diaNuevo = new BasicDBObject ("dia", dia);
        DBObject mesNuevo = new BasicDBObject ("mes", mes);
        DBObject añoNuevo = new BasicDBObject ("año", año);
        objCon.coleccion.update(nombreNuevo,nuevo);
        objCon.coleccion.update(apellidoNuevo, nuevo);
        objCon.coleccion.update(contraseñaNuevo, nuevo);
        objCon.coleccion.update(emailNuevo, nuevo);
        objCon.coleccion.update(numeroCelularNuevo, nuevo);
        objCon.coleccion.update(diaNuevo, nuevo);
        objCon.coleccion.update(mesNuevo, nuevo);
        objCon.coleccion.update(añoNuevo, nuevo);
    }
    
   public boolean validarLogin(String id,String contraseña){
       Usuario aux = new Usuario();
       DBCursor cursor = objCon.coleccion.find();
       boolean abrir= false;
       while (cursor.hasNext()){
           aux = new Usuario((String) cursor.next().get("id"),(String)cursor.curr().get("contraseña"));
           if (aux.getId().equals(id) && aux.getContraseña().equals(contraseña)){
               abrir = true;
           }
       }
       return abrir;
   }
    
}
