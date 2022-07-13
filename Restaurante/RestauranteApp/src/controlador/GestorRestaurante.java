
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
        bebidas.setVisible(true);
        confirmacion.setVisible(true);

     }
    

}