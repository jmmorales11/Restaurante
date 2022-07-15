
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
         
FrmLogin lo= new FrmLogin();
        FrmRegistrar re= new FrmRegistrar();
        FrmConfirmacion co= new FrmConfirmacion();
        FrmMenu menu = new FrmMenu();
        ControladorRestaurante controladorMenu= new ControladorRestaurante(menu);
        PedidosDAO ped= new PedidosDAO();
        FrmPostre postre= new FrmPostre();
        UsuarioDAO usu= new UsuarioDAO();
        FrmEscogeTuSabor m2= new FrmEscogeTuSabor();
        ControladorRestaurante c3= new ControladorRestaurante(lo,usu);
        ControladorRestaurante c4= new ControladorRestaurante(co,ped);
        ControladorRestaurante c5= new ControladorRestaurante(postre,ped);
        co.setVisible(true);

     }

    

}