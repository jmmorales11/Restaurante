/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jeimy
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String id;
    private String contraseña;
    private String email;
    private String numeroCelular;
    private String dia;
    private String mes;
    private String año;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String id, String contraseña, String email, String numeroCelular, String dia, String mes, String año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.contraseña = contraseña;
        this.email = email;
        this.numeroCelular = numeroCelular;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAño() {
        return año;
    }

}
