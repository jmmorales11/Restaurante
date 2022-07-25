
package controlador;
import modelo.ClienteDAO;
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
import vista.FrmVerIngredientes;
import vista.FrmVersion;
import vista.FrmVisualisarInformacionPedido;
import vista.FrmhistorialOrdenes;

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
        FrmVisualisarInformacionPedido factura = new FrmVisualisarInformacionPedido();
        FrmVerIngredientes ingrediente = new FrmVerIngredientes ();
        PlatoDAO plato = new PlatoDAO ();
        FrmFuerte frmFuerte= new FrmFuerte();
        FrmPostre frmPostre= new FrmPostre();
        FrmVersion frmVersion= new FrmVersion();
        FrmhistorialOrdenes frmhistorialOrdenes= new FrmhistorialOrdenes();
        ClienteDAO clienteDAO= new ClienteDAO();
        ControladorRestaurante c = new ControladorRestaurante(
                menuPrimario, 
                login, 
                r, 
                menuSecundario, 
                dao,
                perfil,
                bebidas,
                pedDAO,
                frmConfirmar,
                factura,
                ingrediente,
                plato,
                entradas,
                frmFuerte,
                frmPostre,
                frmVersion,
                frmhistorialOrdenes,
                clienteDAO
        );
        menuPrimario.setVisible(true);

     };
     }

    

