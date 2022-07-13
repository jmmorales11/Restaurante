
package controlador;
import modelo.Conexion;
import modelo.Ingrediente;
import modelo.PedidosDAO;
import modelo.Plato;
import vista.FrmBebidas;
import vista.FrmConfirmacion;
import modelo.UsuarioDAO;
import vista.FrmBebidas;
import vista.FrmConfirmacion;
import vista.FrmRegistrar;
import modelo.Ingrediente;
import modelo.Plato;
import vista.FrmBebidas;
import vista.FrmConfirmacion;
import modelo.Ingrediente;
import modelo.PlatoDAO;
import vista.FrmBebidas;
import vista.FrmConfirmacion;
import vista.FrmEntradas;
import vista.FrmEscogeTuSabor;
import vista.FrmFuerte;
import vista.FrmLogin;
import vista.FrmMenu;
import vista.FrmPostre;
import vista.FrmVisualisarInformacionPedido;

public class GestorRestaurante {
    //Camilo 
     public static void main(String args[]){
<<<<<<< HEAD
        FrmBebidas bebidas= new FrmBebidas();
        FrmFuerte fuerte= new FrmFuerte();
        FrmPostre postres= new FrmPostre();
        FrmConfirmacion confirmacion =new FrmConfirmacion();
        FrmEntradas entradas= new FrmEntradas();
        FrmMenu menu1= new FrmMenu();
        PedidosDAO ped= new PedidosDAO();
        ControladorRestaurante c= new ControladorRestaurante(bebidas,ped);//Marley       
        ControladorRestaurante c1= new ControladorRestaurante(fuerte,ped);//Marley      
        ControladorRestaurante c3= new ControladorRestaurante(postres,ped);//Marley
        ControladorRestaurante c2= new ControladorRestaurante(entradas,ped);//Marley
        ControladorRestaurante c4= new ControladorRestaurante(confirmacion,ped);//Marley
        
        menu1.setVisible(true);
//entradas.setVisible(true);
        confirmacion.setVisible(false);
=======
//        FrmBebidas bebidas= new FrmBebidas();
//        FrmFuerte fuerte= new FrmFuerte();
//        FrmPostre postres= new FrmPostre();
//        FrmConfirmacion confirmacion =new FrmConfirmacion();
//        FrmEntradas entradas= new FrmEntradas();
//        PedidosDAO ped= new PedidosDAO();
//        ControladorRestaurante c= new ControladorRestaurante(bebidas,ped);       
//        ControladorRestaurante c1= new ControladorRestaurante(fuerte,ped);       
//        ControladorRestaurante c3= new ControladorRestaurante(postres,ped);
//        ControladorRestaurante c2= new ControladorRestaurante(entradas,ped);
        //entradas.setVisible(true);
        //confirmacion.setVisible(true);
>>>>>>> cc5ebd3418f8f5cb7147424fcbf051e1b3df896d
        //fuerte.setVisible(true);
        bebidas.setVisible(false);
       // postres.setVisible(true);

  
<<<<<<< HEAD
        //f1.setVisible(true);
        //datoQuemados();//kleber
=======
//f1.setVisible(true);

        
//        FrmRegistrar r1= new FrmRegistrar();
//        FrmVisualisarInformacionPedido rv = new FrmVisualisarInformacionPedido();//kleber
//        ControladorVisualisarIngredientes cVerin =new ControladorVisualisarIngredientes(rv);//kleber
//        UsuarioDAO pDAO = new UsuarioDAO();
//        ControladorUsuario cUsuario= new ControladorUsuario(r1,pDAO);
//        r1.setVisible(true);

>>>>>>> cc5ebd3418f8f5cb7147424fcbf051e1b3df896d
        FrmRegistrar r1= new FrmRegistrar();//Camilo
        FrmLogin l1= new FrmLogin();
        FrmVisualisarInformacionPedido rv = new FrmVisualisarInformacionPedido();//kleber
        ControladorVisualisarIngredientes cVerin =new ControladorVisualisarIngredientes(rv);//kleber
        UsuarioDAO pDAO = new UsuarioDAO();
        FrmEscogeTuSabor menu = new FrmEscogeTuSabor();
<<<<<<< HEAD
        ControladorRestaurante cUsuario= new ControladorRestaurante(r1,pDAO);//Camilo
        ControladorRestaurante cUsuario1= new ControladorRestaurante(l1,pDAO);//Camilo
        //menu.setVisible(true);//Camilo
        //        r1.setVisible(true);
        //        r1.setLocationRelativeTo(r1);
=======

        ControladorRestaurante c4= new ControladorRestaurante(r1,pDAO);//Camilo
        ControladorRestaurante c5= new ControladorRestaurante(l1,pDAO);//Camilo
        ControladorRestaurante c6= new ControladorRestaurante(menu);//Camilo
        menu.setVisible(true);//Camilo


//        r1.setVisible(true);
//        r1.setLocationRelativeTo(r1);
>>>>>>> cc5ebd3418f8f5cb7147424fcbf051e1b3df896d
//         FrmBebidas fBebidas=new FrmBebidas();
//         FrmConfirmacion fConfirmacion= new FrmConfirmacion();
//         ControladorRestaurante cRestaurante= new ControladorRestaurante();
//         fBebidas.setVisible(true);
//         fConfirmacion.setVisible(true);

     }

    

}