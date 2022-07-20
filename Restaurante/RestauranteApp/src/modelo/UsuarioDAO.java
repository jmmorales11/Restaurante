
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

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
    
    public void modificar(String nombre1,
            String apellido1,
            String id1,
            String contraseña1,
            String email1,
            String numeroCelular1,
            String dia1,
            String mes1, 
            String anio1){
        DBObject buscado= new BasicDBObject("id",id1);
        DBObject nombre= new BasicDBObject().append("$set",new BasicDBObject().append("nombre",nombre1));
        DBObject apellido= new BasicDBObject().append("$set",new BasicDBObject().append("apellido",apellido1));
        DBObject contraseñaNuevo= new BasicDBObject().append("$set",new BasicDBObject().append("contraseña",contraseña1));
        DBObject correo= new BasicDBObject().append("$set",new BasicDBObject().append("email",email1));
        DBObject nCelular= new BasicDBObject().append("$set",new BasicDBObject().append("numeroCelular",numeroCelular1));
        DBObject dia= new BasicDBObject().append("$set",new BasicDBObject().append("dia",dia1));
        DBObject mes= new BasicDBObject().append("$set",new BasicDBObject().append("mes",mes1));
        DBObject anio= new BasicDBObject().append("$set",new BasicDBObject().append("año",anio1));
        objCon.coleccion.update(buscado, nombre);
        objCon.coleccion.update(buscado, apellido);
        objCon.coleccion.update(buscado, contraseñaNuevo);
        objCon.coleccion.update(buscado, correo);
        objCon.coleccion.update(buscado, nCelular);
        objCon.coleccion.update(buscado, dia);
        objCon.coleccion.update(buscado, mes);
        objCon.coleccion.update(buscado, anio);
//        DBObject nombreNuevo = new BasicDBObject ("nombre", nombre);
//        DBObject apellidoNuevo = new BasicDBObject ("apellido", apellido);
//        DBObject nuevo= new BasicDBObject().append("$set", new BasicDBObject().append("id", id));
//        DBObject contraseñaNuevo = new BasicDBObject ("contraseña", contraseña);
//        DBObject emailNuevo = new BasicDBObject ("email", email);
//        DBObject numeroCelularNuevo = new BasicDBObject ("numeroCelular", numeroCelular);
//        DBObject diaNuevo = new BasicDBObject ("dia", dia);
//        DBObject mesNuevo = new BasicDBObject ("mes", mes);
//        DBObject añoNuevo = new BasicDBObject ("año", año);
//        objCon.coleccion.update(nombreNuevo,nuevo);
//        objCon.coleccion.update(apellidoNuevo, nuevo);
//        objCon.coleccion.update(contraseñaNuevo, nuevo);
//        objCon.coleccion.update(emailNuevo, nuevo);
//        objCon.coleccion.update(numeroCelularNuevo, nuevo);
//        objCon.coleccion.update(diaNuevo, nuevo);
//        objCon.coleccion.update(mesNuevo, nuevo);
//        objCon.coleccion.update(buscado, nuevo);
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
