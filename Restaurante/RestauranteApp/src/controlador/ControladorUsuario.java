/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.FrmEscogeTuSabor;
import vista.FrmLogin;
import vista.FrmMenu;
import vista.FrmPerfil;
import vista.FrmRegistrar;

/**
 *
 * @author camilo
 */
public class ControladorUsuario implements ActionListener, KeyListener{
    UsuarioDAO objetoDAO= new UsuarioDAO();
    FrmRegistrar objetoRegistrar=new FrmRegistrar();
    FrmLogin objetoLogin = new FrmLogin();
    FrmPerfil objetoPerfil = new FrmPerfil();
    FrmMenu menu = new FrmMenu();
    FrmEscogeTuSabor menu2 = new FrmEscogeTuSabor();
    Usuario objetoUsuario= new Usuario();
    
    public ControladorUsuario(FrmRegistrar vista,UsuarioDAO dao){
        objetoRegistrar= vista;
        objetoDAO= dao;
        objetoRegistrar.btnRegistrar.addActionListener(this);
        objetoRegistrar.btnLogin.addActionListener(this);
        objetoRegistrar.txtNombre.addKeyListener(this);
        objetoRegistrar.txtApellido.addKeyListener(this);
        objetoRegistrar.txtID.addKeyListener(this);
        objetoRegistrar.txtContraseña.addKeyListener(this);
        objetoRegistrar.txtRepetirContraseña.addKeyListener(this);
        objetoRegistrar.txtEmail.addKeyListener(this);
        objetoRegistrar.txtNumeroCelular.addKeyListener(this);
        objetoRegistrar.txtDia.addKeyListener(this);
        objetoRegistrar.txtMes.addKeyListener(this);
        objetoRegistrar.txtAño.addKeyListener(this);
    }
    public ControladorUsuario(FrmLogin vista,UsuarioDAO dao){
        objetoLogin = vista;
        objetoDAO= dao;
        objetoLogin.btnLogin.addActionListener(this);
        objetoLogin.btnCancelar.addActionListener(this);
        objetoLogin.txtID.addKeyListener(this);
        objetoLogin.txtContraseña.addKeyListener(this);
    }

    public ControladorUsuario(FrmPerfil vista,UsuarioDAO dao){
        objetoPerfil = vista;
        objetoDAO= dao;
        objetoPerfil.btnEditar.addActionListener(this);
        objetoPerfil.btnModificar.addActionListener(this);
        objetoPerfil.txtNombre.addKeyListener(this);
        objetoPerfil.txtApellido.addKeyListener(this);
        objetoPerfil.txtContraseña.addKeyListener(this);
        objetoPerfil.txtEmail.addKeyListener(this);
        objetoPerfil.txtNumeroCelular.addKeyListener(this);
        objetoPerfil.txtDia.addKeyListener(this);
        objetoPerfil.txtMes.addKeyListener(this);
        objetoPerfil.txtAño.addKeyListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==objetoRegistrar.btnRegistrar){
                String nombre= objetoRegistrar.txtNombre.getText();
                String apellido= objetoRegistrar.txtApellido.getText();
                String id= objetoRegistrar.txtID.getText();
                String contraseña= objetoRegistrar.txtContraseña.getText();
                String email= objetoRegistrar.txtEmail.getText();
                String numeroCelular= objetoRegistrar.txtNumeroCelular.getText();
                String dia= objetoRegistrar.txtDia.getText();
                String mes= objetoRegistrar.txtMes.getText();
                String año= objetoRegistrar.txtAño.getText();
                Usuario objetoUsuario= new Usuario(nombre,apellido,id,contraseña,email,numeroCelular,dia,mes,año);
                objetoDAO.insertarUsuario(objetoUsuario);
        }
            if(e.getSource()== objetoLogin.btnLogin){
                String id = "";
                String contraseña = "";
                id=objetoLogin.txtID.getText();
                contraseña=objetoLogin.txtContraseña.getText();
                if(objetoDAO.validarLogin(id, contraseña)){
                    objetoLogin.setVisible(false);
                    menu.setVisible(true);
                }
            }
    }
    public static void goToMainScreen(JFrame jFrameToClose){
        FrmMenu menu = new FrmMenu();
        jFrameToClose.setVisible(false);
        menu.setVisible(true);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
