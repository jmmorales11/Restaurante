//Este sirve 23:36 repositorio
package controlador;

import vista.FrmConfirmacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Pedido;
import modelo.PedidosDAO;
import vista.FrmBebidas;
import vista.FrmEntradas;
import vista.FrmFuerte;
import vista.FrmPostre;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.FrmEscogeTuSabor;
import vista.FrmLogin;
import vista.FrmMenu;
import vista.FrmPerfil;
import vista.FrmRegistrar;

public class ControladorRestaurante implements ActionListener, KeyListener  {
    Pedido ped= new Pedido();
    PedidosDAO pedDAO= new PedidosDAO();
    FrmBebidas objetoVistaBebidas= new FrmBebidas();
    FrmEntradas objetoVistaEntradas= new FrmEntradas();
    FrmFuerte objetoVistaFuerte= new FrmFuerte();
    FrmPostre objetoVistaPostre= new FrmPostre();
    FrmConfirmacion objetoVistaConfirmacion= new FrmConfirmacion();
    UsuarioDAO objetoDAO= new UsuarioDAO();
    FrmRegistrar objetoRegistrar=new FrmRegistrar();
    FrmLogin objetoLogin = new FrmLogin();
    FrmPerfil objetoPerfil = new FrmPerfil();
    FrmMenu menu = new FrmMenu();
    FrmEscogeTuSabor menu2 = new FrmEscogeTuSabor();
    Usuario objetoUsuario= new Usuario();
    
    //Camilo
    public ControladorRestaurante(FrmEscogeTuSabor vista){
        menu2= vista;
        menu2.miRegistrarse.addActionListener(this);
        menu2.miLogin.addActionListener(this);
    }
    public ControladorRestaurante(FrmRegistrar vista,UsuarioDAO dao){
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
    public ControladorRestaurante(FrmLogin vista,UsuarioDAO dao){
        objetoLogin = vista;
        objetoDAO= dao;
        objetoLogin.btnLogin.addActionListener(this);
        objetoLogin.btnCancelar.addActionListener(this);
        objetoLogin.txtID.addKeyListener(this);
        objetoLogin.txtContraseña.addKeyListener(this);
    }

    public ControladorRestaurante(FrmPerfil vista,UsuarioDAO dao){
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

    
//Jeimy no tocar 

    public ControladorRestaurante(FrmBebidas vistab ,PedidosDAO dao ) {
        objetoVistaBebidas=vistab;
        pedDAO= dao;
        objetoVistaBebidas.rbCoca.addActionListener(this);
        objetoVistaBebidas.txtCoca.addKeyListener(this);
        objetoVistaBebidas.rbFanta.addActionListener(this);
        objetoVistaBebidas.rbSprite.addActionListener(this);
        objetoVistaBebidas.txtSprite.addActionListener(this);
        objetoVistaBebidas.txtPedidoBebidas.addKeyListener(this);
        objetoVistaBebidas.btnAgregarBebidas.addActionListener(this);
        objetoVistaConfirmacion.btnConfirmar.addActionListener(this);
        
    }
    public ControladorRestaurante(FrmPostre vistap ,PedidosDAO dao ) {
        objetoVistaPostre = vistap;
        pedDAO= dao;
        objetoVistaPostre.rbCoco.addActionListener(this);
        objetoVistaPostre.rbDulceGuayaba.addActionListener(this);
        objetoVistaPostre.rbEspumillaNaranjilla.addActionListener(this);
        objetoVistaPostre.btnAgregarPostre.addActionListener(this);
        objetoVistaPostre.txtCantidadCoco.addKeyListener(this);
        objetoVistaPostre.txtCantidadDGuayaba.addKeyListener(this);
        objetoVistaPostre.txtCatidadEspumilla.addKeyListener(this);
        objetoVistaPostre.txtPedidoPostre.addKeyListener(this);
    }
    
    public ControladorRestaurante(FrmFuerte vistaF,PedidosDAO dao ){
        objetoVistaFuerte = vistaF;
        pedDAO= dao;
        objetoVistaFuerte.rbArroz.addActionListener(this);
        objetoVistaFuerte.rbChurrasco.addActionListener(this);
        objetoVistaFuerte.rbEncebollado.addActionListener(this);
        objetoVistaFuerte.txtCantidadArroz.addKeyListener(this);
        objetoVistaFuerte.txtCantidadChurrasco.addKeyListener(this);
        objetoVistaFuerte.txtCantidadEncebollado.addKeyListener(this);
        objetoVistaFuerte.btnAgregarFuerte.addActionListener(this);
        objetoVistaFuerte.jlArrosPrecio.addKeyListener(this);
        objetoVistaFuerte.jlChurrascoPrecio.addKeyListener(this);
        objetoVistaFuerte.jlEncebollado.addKeyListener(this);
        
    }
    public  ControladorRestaurante(FrmMenu menu1 ){
        menu= menu1;
        menu.btnBebidas.addActionListener(this);
        menu.btnEntrada.addActionListener(this);
        menu.btnFuerte.addActionListener(this);
        menu.btnPostre.addActionListener(this);
        menu.mHistorial.addActionListener(this);
        
    }
    public ControladorRestaurante(FrmEntradas vistaE,PedidosDAO dao ){
        objetoVistaEntradas = vistaE;
        pedDAO= dao;
        objetoVistaEntradas.btnAgregarEntrada.addActionListener(this);
        objetoVistaEntradas.rbBolonVerde.addActionListener(this);
        objetoVistaEntradas.rbEmpanadaMorocho.addActionListener(this);
        objetoVistaEntradas.rbPanYuca.addActionListener(this);
        objetoVistaEntradas.txtCantidadBolon.addKeyListener(this);
        objetoVistaEntradas.txtCantidadEmpanadasMorocho.addKeyListener(this);
        objetoVistaEntradas.txtCantidadPan.addKeyListener(this);
        
    }
    public ControladorRestaurante(FrmConfirmacion confirmacion,PedidosDAO dao ){
        objetoVistaConfirmacion = confirmacion;
        pedDAO= dao;
        objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.addKeyListener(this);
        objetoVistaConfirmacion.btnEliminar.addActionListener(this);
    }
     public void llenarTabla(JTable tablaD){
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("Descripcion ");
        modeloT.addColumn("Cantidad");
        modeloT.addColumn("Precio");
        Object[] columna = new Object[3];
        int numReg= pedDAO.obtenerPedidos().size();
        for( int i=0; i<numReg;i++){
            ped =(Pedido)pedDAO.obtenerPedidos().get(i);
            columna[0]= ped.getNombrePedido();
            columna[1]= ped.getCantidad();
            columna[2]= ped.getPrecio();
            modeloT.addRow(columna);      
        }
    }
        @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==menu2.miLogin){
            menu2.setVisible(false);
            objetoLogin.setVisible(true);
        }
        if(e.getSource()==menu2.miRegistrarse){
            menu2.setVisible(false);
            objetoRegistrar.setVisible(true);
        }
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
            
        if(e.getSource()==objetoVistaBebidas.btnAgregarBebidas){
            String numPedido=objetoVistaBebidas.txtPedidoBebidas.getText();
            if(objetoVistaBebidas.rbCoca.getLabel().equalsIgnoreCase("Coca cola")){ 
                String nombrePed=objetoVistaBebidas.rbCoca.getLabel();
                String cantidad= objetoVistaBebidas.txtCoca.getText();
                float precio = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaBebidas.jlCoca.getText());
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio);
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaBebidas.rbFanta.getLabel().equalsIgnoreCase("Fanta")){
                String nombrePed=objetoVistaBebidas.rbFanta.getLabel();
                String cantidad= objetoVistaBebidas.txtFanta.getText();
                float precio = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaBebidas.jlFanta.getText());
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio);
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaBebidas.rbSprite.getLabel().equalsIgnoreCase("Sprite")){
                String nombrePed=objetoVistaBebidas.rbSprite.getLabel();
                String cantidad= objetoVistaBebidas.txtSprite.getText();
                float precio = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaBebidas.jlSprite.getText());
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio);

                pedDAO.insertarPedidos(objPed);
            }
        }
//        if(e.getSource()==objetoVistaPostre.btnAgregarPostre){
//            String numPedido=objetoVistaPostre.txtPedidoPostre.getText();
//            
//            if(objetoVistaPostre.rbDulceGuayaba.getLabel().equalsIgnoreCase("Dulce de Guayaba")){
//                String nombrePed=objetoVistaPostre.rbDulceGuayaba.getLabel();
//                String cantidad= objetoVistaPostre.txtCantidadDGuayaba.getText();
//                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
//                pedDAO.insertarPedidos(objPed);
//            }
//            if(objetoVistaPostre.rbEspumillaNaranjilla.getLabel().equalsIgnoreCase("Espumilla de Naranjilla")){
//                String nombrePed=objetoVistaPostre.rbEspumillaNaranjilla.getLabel();
//                String cantidad= objetoVistaPostre.txtCatidadEspumilla.getText();
//                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
//                pedDAO.insertarPedidos(objPed);
//            }
//            if(objetoVistaPostre.rbCoco.getLabel().equalsIgnoreCase("Bien me sabe de Coco")){ 
//                String nombrePed=objetoVistaPostre.rbCoco.getLabel();
//                String cantidad= objetoVistaPostre.txtCantidadCoco.getText();
//                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
//                pedDAO.insertarPedidos(objPed);
//            }
//        }
//        if(e.getSource()==objetoVistaFuerte.btnAgregarFuerte){
//            String numPedido=objetoVistaFuerte.txtPedidoFuertes.getText();
//            if(objetoVistaFuerte.rbArroz.getLabel().equalsIgnoreCase("Arroz con Conchas")){ 
//                String nombrePed=objetoVistaFuerte.rbArroz.getLabel();
//                String cantidad= objetoVistaFuerte.txtCantidadArroz.getText();
//                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
//                pedDAO.insertarPedidos(objPed);
//            }
//            if(objetoVistaFuerte.rbChurrasco.getLabel().equalsIgnoreCase("Churrasco")){
//                String nombrePed=objetoVistaFuerte.rbChurrasco.getLabel();
//                String cantidad= objetoVistaFuerte.txtCantidadChurrasco.getText();
//                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
//                pedDAO.insertarPedidos(objPed);
//            }
//            if(objetoVistaFuerte.rbEncebollado.getLabel().equalsIgnoreCase("Encebollado")){
//                String nombrePed=objetoVistaFuerte.rbChurrasco.getLabel();
//                String cantidad= objetoVistaFuerte.txtCantidadEncebollado.getText();
//                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
//                pedDAO.insertarPedidos(objPed);
//            }
//        }
//        if(e.getSource()==objetoVistaEntradas.btnAgregarEntrada){
//            String numPedido=objetoVistaEntradas.txtPedidoEntrada.getText();
//            if(objetoVistaEntradas.rbBolonVerde.getLabel().equalsIgnoreCase("Bolon de Verde")){ 
//                String nombrePed=objetoVistaEntradas.rbBolonVerde.getLabel();
//                String cantidad= objetoVistaEntradas.txtCantidadBolon.getText();
//                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
//                pedDAO.insertarPedidos(objPed);
//            }
//            if(objetoVistaEntradas.rbEmpanadaMorocho.getLabel().equalsIgnoreCase("Empanadas de morocho")){
//                String nombrePed=objetoVistaEntradas.rbEmpanadaMorocho.getLabel();
//                String cantidad= objetoVistaEntradas.txtCantidadEmpanadasMorocho.getText();
//                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
//                pedDAO.insertarPedidos(objPed);
//            }
//            if(objetoVistaEntradas.rbPanYuca.getLabel().equalsIgnoreCase("Pan de Yuca")){
//                String nombrePed=objetoVistaEntradas.rbPanYuca.getLabel();
//                String cantidad= objetoVistaEntradas.txtCantidadEmpanadasMorocho.getText();
//                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
//                pedDAO.insertarPedidos(objPed);
//            }
//        }
        if(e.getSource()==objetoVistaConfirmacion.btnEliminar){
            int filaInicio=objetoVistaConfirmacion.jlPedidos.getSelectedRow();
            int numFS= objetoVistaConfirmacion.jlPedidos.getSelectedRowCount();
            ArrayList<String> lista= new ArrayList();
            String nom="";
            if(filaInicio>0){
                for(int i=0;1<numFS;i++){
                    nom=String.valueOf(objetoVistaConfirmacion.jlPedidos.getValueAt(i+filaInicio,0 ));
                    lista.add(nom);
                }
                for(int i=0;i<numFS;i++){
                    int respuesta= JOptionPane.showConfirmDialog(null,"Quiere eliminar el pedido:\n"+nom+"?");
                    if (respuesta==0){
                        pedDAO.eliminarPedidos(nom);
                    }
                    llenarTabla(objetoVistaConfirmacion.jlPedidos);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila a eliminar");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    if (e.getSource()== objetoRegistrar.txtNombre) 
        {
            char c= e.getKeyChar();
            if ((c<'a' || c>'z') && (c< 'A'|| c >'Z'))
            {
                e.consume();
            }
        }
          if (e.getSource()== objetoRegistrar.txtApellido) 
        {
            char c= e.getKeyChar();
            if ((c<'a' || c>'z') && (c< 'A'|| c >'Z'))
            {
                e.consume();
            }
        }
         if (e.getSource()== objetoRegistrar.txtID) 
        {
            char c= e.getKeyChar();
            if ((c<'0' || c>'9') )
            {
                e.consume();
            }
        }
         if (e.getSource()== objetoRegistrar.txtNumeroCelular) 
        {
            char c= e.getKeyChar();
            if ((c<'0' || c>'9') )
            {
                e.consume();
            }
        }
         if (e.getSource()== objetoPerfil.txtNombre) 
        {
            char c= e.getKeyChar();
            if ((c<'a' || c>'z') && (c< 'A'|| c >'Z'))
            {
                e.consume();
            }
        }
          if (e.getSource()== objetoPerfil.txtApellido) 
        {
            char c= e.getKeyChar();
            if ((c<'a' || c>'z') && (c< 'A'|| c >'Z'))
            {
                e.consume();
            }
        }
         if (e.getSource()== objetoPerfil.txtNumeroCelular) 
        {
            char c= e.getKeyChar();
            if ((c<'0' || c>'9') )
            {
                e.consume();
            }
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        String id= objetoRegistrar.txtID.getText();
        int lenght1 = id.length();
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if (lenght1<10){
                objetoRegistrar.txtID.setEditable(true);
            }else{
                objetoRegistrar.txtID.setEditable(false);
            }
        }
        String numeroCelular1= objetoRegistrar.txtNumeroCelular.getText();
        int lenght2 = numeroCelular1.length();
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if (lenght2<10){
                objetoRegistrar.txtNumeroCelular.setEditable(true);
            }else{
                objetoRegistrar.txtNumeroCelular.setEditable(false);
            }
        }
        String numeroCelular2= objetoPerfil.txtNumeroCelular.getText();
        int lenght3 = id.length();
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if (lenght3<10){
                objetoPerfil.txtNumeroCelular.setEditable(true);
            }else{
                objetoPerfil.txtNumeroCelular.setEditable(false);
            }
        }
        String id2= objetoRegistrar.txtID.getText();
        int lenght4 = id.length();
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if (lenght1<10){
                objetoRegistrar.txtID.setEditable(true);
            }else{
                objetoRegistrar.txtID.setEditable(false);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       if(e.getSource()==objetoVistaConfirmacion.txtBuscarPedidoconfirmacion){
           String pedido=objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.getText();
           DefaultTableModel modeloT= new DefaultTableModel();
            objetoVistaConfirmacion.jlPedidos.setModel(modeloT);
            modeloT.addColumn("Descripcion");
            modeloT.addColumn("Cantidad");
            modeloT.addColumn("Precio");
            Object [] columna= new Object[3];
            int numReg= pedDAO.buscarPedido(pedido).size();
            for(int i=0;i<numReg;i++){
                ped= (Pedido) pedDAO.buscarPedido(pedido).get(i);
                System.out.println(ped);
                columna[0]=ped.getNombrePedido();
                columna[1]=ped.getCantidad();
                columna[2]= ped.getPrecio();
                modeloT.addRow(columna);
            }
       }
    }  
}
