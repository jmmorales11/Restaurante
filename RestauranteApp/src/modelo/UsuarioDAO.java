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
    public void insertarUsuario(Usuario p){
        Conexion objCon=new Conexion();
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
   public boolean validarLogin(String id,String contraseña){
       Conexion objCon = new Conexion();
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
