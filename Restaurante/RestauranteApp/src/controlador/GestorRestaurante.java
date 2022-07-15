
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
//      FrmEscogeTuSabor m2= new FrmEscogeTuSabor();
        FrmVisualisarInformacionPedido f= new FrmVisualisarInformacionPedido();
//        ControladorRestaurante c3= new ControladorRestaurante(m2);
//       FrmMenu m= new FrmMenu();
//       ControladorRestaurante c3= new ControladorRestaurante(m);
//         m2.setVisible(true);
        PlatoDAO dao= new PlatoDAO();
        ControladorRestaurante c3= new ControladorRestaurante(f,dao);
        f.setVisible(true);
     }
    }

       
    


