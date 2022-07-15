
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
     public static void main(String args[]){
<<<<<<< HEAD
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

       
    

=======
        FrmLogin lo= new FrmLogin();
        FrmRegistrar re= new FrmRegistrar();
        FrmConfirmacion co= new FrmConfirmacion();
        PedidosDAO ped= new PedidosDAO();
        FrmPostre postre= new FrmPostre();
        UsuarioDAO usu= new UsuarioDAO();
        FrmEscogeTuSabor m2= new FrmEscogeTuSabor();
        ControladorRestaurante c3= new ControladorRestaurante(lo,usu);
        ControladorRestaurante c4= new ControladorRestaurante(co,ped);
        ControladorRestaurante c5= new ControladorRestaurante(postre,ped);
        postre.setVisible(true);
        
     }
}
>>>>>>> 82c1c6b78b1b69387ade5d433c081a955042b418

