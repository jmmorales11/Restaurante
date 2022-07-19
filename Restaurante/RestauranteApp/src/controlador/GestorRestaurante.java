
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
import vista.FrmPerfil;
import vista.FrmPostre;
import vista.FrmVisualisarInformacionPedido;

public class GestorRestaurante {
    //Camilo 
     public static void main(String args[]){
         
        FrmEscogeTuSabor menuPrimario= new FrmEscogeTuSabor();
        FrmRegistrar r = new FrmRegistrar();
        FrmLogin login = new FrmLogin();
        FrmMenu menuSecundario = new FrmMenu();
        UsuarioDAO dao = new UsuarioDAO();
        FrmPerfil perfil = new FrmPerfil();
        FrmBebidas bebidas = new FrmBebidas();
        PedidosDAO pedDAO = new PedidosDAO();
        FrmEntradas entradas = new FrmEntradas();
        FrmConfirmacion frmConfirmar = new FrmConfirmacion();
        ControladorRestaurante c = new ControladorRestaurante(
                menuPrimario, 
                login, 
                r, 
                menuSecundario, 
                dao,
                perfil,
                bebidas,
                pedDAO,
                entradas
        );
        menuPrimario.setVisible(true);
     
     ControladorRestaurante c1 = new ControladorRestaurante(frmConfirmar,pedDAO);
     frmConfirmar.setVisible(true);
     };
     }

    

