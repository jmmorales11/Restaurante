
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
import vista.FrmBebidas;
import vista.FrmConfirmacion;
import vista.FrmEntradas;
import vista.FrmEscogeTuSabor;
import vista.FrmFuerte;
import vista.FrmLogin;
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
        PedidosDAO ped= new PedidosDAO();
        ControladorRestaurante c= new ControladorRestaurante(bebidas,ped);       
        ControladorRestaurante c1= new ControladorRestaurante(fuerte,ped);       
        ControladorRestaurante c3= new ControladorRestaurante(postres,ped);
        ControladorRestaurante c2= new ControladorRestaurante(entradas,ped);
        //entradas.setVisible(true);
        confirmacion.setVisible(true);
        //fuerte.setVisible(true);
        //bebidas.setVisible(true);
       // postres.setVisible(true);

  
//f1.setVisible(true);
        //datoQuemados();//kleber
        FrmRegistrar r1= new FrmRegistrar();//Camilo
        FrmLogin l1= new FrmLogin();
        FrmVisualisarInformacionPedido rv = new FrmVisualisarInformacionPedido();//kleber
        ControladorVisualisarIngredientes cVerin =new ControladorVisualisarIngredientes(rv);//kleber
        UsuarioDAO pDAO = new UsuarioDAO();
        FrmEscogeTuSabor menu = new FrmEscogeTuSabor();

        ControladorRestaurante c4= new ControladorRestaurante(r1,pDAO);//Camilo
        ControladorRestaurante c5= new ControladorRestaurante(l1,pDAO);//Camilo
        ControladorRestaurante c6= new ControladorRestaurante(menu);//Camilo
        menu.setVisible(true);//Camilo

//        r1.setVisible(true);
//        r1.setLocationRelativeTo(r1);
//         FrmBebidas fBebidas=new FrmBebidas();
//         FrmConfirmacion fConfirmacion= new FrmConfirmacion();
//         ControladorRestaurante cRestaurante= new ControladorRestaurante();
//         fBebidas.setVisible(true);
//         fConfirmacion.setVisible(true);

     }

//    public static void datoQuemados(){
//       //BOLONES 6
//    Ingrediente in1 = new Ingrediente("verde_(Platanos_verdes)",1200f);
//    Ingrediente in2 = new Ingrediente("manteca ",100f);
//    Ingrediente in3 = new Ingrediente("queso",250f);
//    Ingrediente in4 = new Ingrediente("chicaron",250f);
//    //arroz con conchas   
//    Ingrediente in5 = new Ingrediente("arroz",1000f);
//    Ingrediente in6 = new Ingrediente("conchas ",1000f);
//    Ingrediente in7 = new Ingrediente("cebolla",250f);
//    Ingrediente in8 = new Ingrediente("pimiento",125f);
//    //bien me sabe de coco
//    Ingrediente in9 = new Ingrediente("azucar",500f);
//    Ingrediente in10 = new Ingrediente("leche_de_coco",500f);
//    Ingrediente in11 = new Ingrediente("ralladura_de_coco",50f);
//    Ingrediente in12 = new Ingrediente("yemas_de_huevos",50f);
//    Ingrediente in13 = new Ingrediente("ralladura_de_coco",50f);
//    Ingrediente in14 = new Ingrediente("agua",125f);
//    Ingrediente in15 = new Ingrediente("biscocho",1200f);
//    Plato bolones = new Plato("Bolon");
//    Plato arrozConchas = new Plato("Arroz con conchas");
//    Plato sabeCoco = new Plato("Bien me sabe de coco");
//    bolones.addIn(in1);
//    bolones.addIn(in2);
//    bolones.addIn(in3);
//    bolones.addIn(in4);
//    arrozConchas.addIn(in5);
//    arrozConchas.addIn(in6);
//    arrozConchas.addIn(in7);
//    arrozConchas.addIn(in8);
//    sabeCoco.addIn(in9);
//    sabeCoco.addIn(in10);
//    sabeCoco.addIn(in11);
//    sabeCoco.addIn(in12);
//    sabeCoco.addIn(in13);
//    sabeCoco.addIn(in14);
//    sabeCoco.addIn(in15);
//        System.out.println(bolones.toString());
//        System.out.println(bolones.calcularCantidad());
//     }

}