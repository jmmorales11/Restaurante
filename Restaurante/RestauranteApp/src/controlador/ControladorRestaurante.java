//Este sirve 23:36 repositorio
package controlador;

import vista.FrmConfirmacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.String.valueOf;
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
    PedidosDAO pedDAO;
    FrmBebidas objetoVistaBebidas;
    FrmEntradas objetoVistaEntradas;
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
    public ControladorRestaurante(
            FrmEscogeTuSabor vista, 
            FrmLogin frmLogin, 
            FrmRegistrar frmRegistrar,
            FrmMenu frmMenu,
            UsuarioDAO usuarioDao,
            FrmPerfil frmPerfil,
            FrmBebidas frmBebidas,
            PedidosDAO pedidosDAO,
            FrmEntradas frmEntradas
    ){
        menu2= vista;
        menu2.miRegistrarse.addActionListener(this);
        menu2.miLogin.addActionListener(this);
        
        this.objetoLogin = frmLogin;
        this.objetoLogin.btnLogin.addActionListener(this);
        this.objetoLogin.btnCancelar.addActionListener(this);
        this.objetoLogin.txtID.addKeyListener(this);
        this.objetoLogin.txtContraseña.addKeyListener(this);
        
        this.objetoRegistrar= frmRegistrar;
        this.objetoRegistrar.btnRegistrar.addActionListener(this);
        this.objetoRegistrar.btnLogin.addActionListener(this);
        this.objetoRegistrar.txtNombre.addKeyListener(this);
        this.objetoRegistrar.txtApellido.addKeyListener(this);
        this.objetoRegistrar.txtID.addKeyListener(this);
        this.objetoRegistrar.txtContraseña.addKeyListener(this);
        this.objetoRegistrar.txtRepetirContraseña.addKeyListener(this);
        this.objetoRegistrar.txtEmail.addKeyListener(this);
        this.objetoRegistrar.txtNumeroCelular.addKeyListener(this);
        this.objetoRegistrar.txtDia.addKeyListener(this);
        this.objetoRegistrar.txtMes.addKeyListener(this);
        this.objetoRegistrar.txtAño.addKeyListener(this);
        
        this.menu = frmMenu;
        this.menu.miPerfil.addActionListener(this);
        this.menu.btnBebidas.addActionListener(this);
        this.menu.btnEntrada.addActionListener(this);
        this.menu.btnFuerte.addActionListener(this);
        this.menu.btnPostre.addActionListener(this);
        this.menu.mHistorial.addActionListener(this);
        this.menu.txtNumeroPedido.addKeyListener(this);
        
        this.objetoDAO = usuarioDao;
        
        this.objetoPerfil = frmPerfil;
        this.objetoPerfil.btnEditar.addActionListener(this);
        this.objetoPerfil.btnModificar.addActionListener(this);
        this.objetoPerfil.txtNombre.addKeyListener(this);
        this.objetoPerfil.txtApellido.addKeyListener(this);
        this.objetoPerfil.txtContraseña.addKeyListener(this);
        this.objetoPerfil.txtEmail.addKeyListener(this);
        this.objetoPerfil.txtNumeroCelular.addKeyListener(this);
        this.objetoPerfil.txtDia.addKeyListener(this);
        this.objetoPerfil.txtMes.addKeyListener(this);
        this.objetoPerfil.txtAño.addKeyListener(this);
        
        this.objetoVistaBebidas=frmBebidas;
        this.objetoVistaBebidas.rbCoca.addActionListener(this);
        this.objetoVistaBebidas.txtCoca.addKeyListener(this);
        this.objetoVistaBebidas.rbFanta.addActionListener(this);
        this.objetoVistaBebidas.rbSprite.addActionListener(this);
        this.objetoVistaBebidas.txtSprite.addActionListener(this);
        this.objetoVistaBebidas.txtPedidoBebidas.addKeyListener(this);
        this.objetoVistaBebidas.btnAgregarBebidas.addActionListener(this);
        this.objetoVistaBebidas.btnRegresar.addActionListener(this);
        this.objetoVistaConfirmacion.btnConfirmar.addActionListener(this);
        
        this.pedDAO = pedidosDAO;
        
        this.objetoVistaEntradas = frmEntradas;
        this.objetoVistaEntradas.btnAgregarEntrada.addActionListener(this);
        this.objetoVistaEntradas.rbBolonVerde.addActionListener(this);
        this.objetoVistaEntradas.rbEmpanadaMorocho.addActionListener(this);
        this.objetoVistaEntradas.rbPanYuca.addActionListener(this);
        this.objetoVistaEntradas.txtCantidadBolon.addKeyListener(this);
        this.objetoVistaEntradas.txtCantidadEmpanadasMorocho.addKeyListener(this);
        this.objetoVistaEntradas.txtCantidadPan.addKeyListener(this);
    }
    
    
//Jeimy no tocar 
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
        if(e.getSource()==objetoRegistrar.btnLogin){
            objetoRegistrar.setVisible(false);
            objetoLogin.setVisible(true);
        }

        if(e.getSource()== objetoLogin.btnLogin){
                String id = "";
                String contraseña = "";
                id=objetoLogin.txtID.getText();
                contraseña=objetoLogin.txtContraseña.getText();
                if(objetoDAO.validarLogin(id, contraseña)){
                    objetoUsuario = objetoDAO.obtenerUsuario(id);
                    objetoLogin.setVisible(false);
                    menu.setVisible(true);
                }
            }
        
        if(e.getSource()==menu.miPerfil){
            menu.setVisible(false);
            objetoPerfil.setVisible(true);
            objetoPerfil.txtNombre.setText(objetoUsuario.getNombre());
            objetoPerfil.txtApellido.setText(objetoUsuario.getApellido());
            objetoPerfil.txtContraseña.setText(objetoUsuario.getContraseña());
            objetoPerfil.txtEmail.setText(objetoUsuario.getEmail());
            objetoPerfil.txtNumeroCelular.setText(objetoUsuario.getNumeroCelular());
            objetoPerfil.txtDia.setText(objetoUsuario.getDia());
            objetoPerfil.txtMes.setText(objetoUsuario.getMes());
            objetoPerfil.txtAño.setText(objetoUsuario.getAño());
        }
        
        if(e.getSource()==objetoPerfil.btnMenu){
            objetoPerfil.setVisible(false);
            menu.setVisible(true);
        }
        
        if(e.getSource()==menu.btnBebidas){
            menu.setVisible(false);
            objetoVistaBebidas.setVisible(true);
            objetoVistaBebidas.txtPedidoBebidas.setText(menu.txtNumeroPedido.getText());
        }
        
        if(e.getSource()==menu.btnEntrada){
            menu.setVisible(false);
            objetoVistaEntradas.setVisible(true);
            objetoVistaEntradas.txtPedidoEntrada.setText(menu.txtNumeroPedido.getText());
        }
            
        if(e.getSource()==objetoVistaBebidas.btnAgregarBebidas){
            String numPedido=objetoVistaBebidas.txtPedidoBebidas.getText();
            if(objetoVistaBebidas.rbCoca.getLabel().equalsIgnoreCase("Coca cola")){
                String nombrePed=objetoVistaBebidas.rbCoca.getLabel();
                String cantidad= objetoVistaBebidas.txtCoca.getText();
                String precio= objetoVistaBebidas.jlCoca.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaBebidas.jlCoca.getText());
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaBebidas.rbFanta.getLabel().equalsIgnoreCase("Fanta")){
                String nombrePed=objetoVistaBebidas.rbFanta.getLabel();
                String cantidad= objetoVistaBebidas.txtFanta.getText();
                String precio= objetoVistaBebidas.jlFanta.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaBebidas.jlFanta.getText());
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaBebidas.rbSprite.getLabel().equalsIgnoreCase("Sprite")){
                String nombrePed=objetoVistaBebidas.rbSprite.getLabel();
                String cantidad= objetoVistaBebidas.txtSprite.getText();
                String precio=objetoVistaBebidas.jlSprite.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaBebidas.jlSprite.getText());
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                
                pedDAO.insertarPedidos(objPed);
            }
        }
        
        if(e.getSource()==objetoVistaBebidas.btnRegresar){
            objetoVistaBebidas.setVisible(false);
            menu.setVisible(true);
        }
        
        if(e.getSource()==objetoVistaPostre.btnAgregarPostre){
            String numPedido=objetoVistaPostre.txtPedidoPostre.getText();

            if(objetoVistaPostre.rbDulceGuayaba.getLabel().equalsIgnoreCase("Dulce de Guayaba")){
                String nombrePed=objetoVistaPostre.rbDulceGuayaba.getLabel();
                String cantidad= objetoVistaPostre.txtCantidadDGuayaba.getText();
                String precio=objetoVistaPostre.jlPrecioGuayaba.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(precio);
               Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                 pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaPostre.rbEspumillaNaranjilla.getLabel().equalsIgnoreCase("Espumilla de Naranjilla")){
                String nombrePed=objetoVistaPostre.rbEspumillaNaranjilla.getLabel();
                String cantidad= objetoVistaPostre.txtCatidadEspumilla.getText();
                String precio=objetoVistaPostre.jlPrecioEspumilla.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(precio);
               Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaPostre.rbCoco.getLabel().equalsIgnoreCase("Bien me sabe de Coco")){ 
                String nombrePed=objetoVistaPostre.rbCoco.getLabel();
                String cantidad= objetoVistaPostre.txtCantidadCoco.getText();
                String precio=objetoVistaPostre.jlPrecioBienCoco.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(precio);
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                 pedDAO.insertarPedidos(objPed);
            }
        }
        if(e.getSource()==objetoVistaFuerte.btnAgregarFuerte){
            String numPedido=objetoVistaFuerte.txtPedidoFuertes.getText();
            if(objetoVistaFuerte.rbArroz.getLabel().equalsIgnoreCase("Arroz con Conchas")){ 
                String nombrePed=objetoVistaFuerte.rbArroz.getLabel();
                String cantidad= objetoVistaFuerte.txtCantidadArroz.getText();
                String precio=objetoVistaFuerte.jlArrosPrecio.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaFuerte.jlArrosPrecio.getText());
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaFuerte.rbChurrasco.getLabel().equalsIgnoreCase("Churrasco")){
                String nombrePed=objetoVistaFuerte.rbChurrasco.getLabel();
                String cantidad= objetoVistaFuerte.txtCantidadChurrasco.getText();
                String precio=objetoVistaFuerte.jlChurrascoPrecio.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaFuerte.jlChurrascoPrecio.getText());
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaFuerte.rbEncebollado.getLabel().equalsIgnoreCase("Encebollado")){
                String nombrePed=objetoVistaFuerte.rbChurrasco.getLabel();
                String cantidad= objetoVistaFuerte.txtCantidadEncebollado.getText();
                String precio=objetoVistaFuerte.jlEncebollado.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaFuerte.jlEncebollado.getText());
               Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                pedDAO.insertarPedidos(objPed);
            }
        }
        if(e.getSource()==objetoVistaEntradas.btnAgregarEntrada){
            String numPedido=objetoVistaEntradas.txtPedidoEntrada.getText();
            if(objetoVistaEntradas.rbBolonVerde.getLabel().equalsIgnoreCase("Bolon de Verde")){ 
                String nombrePed=objetoVistaEntradas.rbBolonVerde.getLabel();
                String cantidad= objetoVistaEntradas.txtCantidadBolon.getText();
                String precio=objetoVistaEntradas.jlPrecioBolon.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaEntradas.jlPrecioBolon.getText());
               Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                 pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaEntradas.rbEmpanadaMorocho.getLabel().equalsIgnoreCase("Empanadas de morocho")){
                String nombrePed=objetoVistaEntradas.rbEmpanadaMorocho.getLabel();
                String cantidad= objetoVistaEntradas.txtCantidadEmpanadasMorocho.getText();
                String precio=objetoVistaEntradas.jlPrecioEmpanadas.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaEntradas.jlPrecioEmpanadas.getText());
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaEntradas.rbPanYuca.getLabel().equalsIgnoreCase("Pan de Yuca")){
                String nombrePed=objetoVistaEntradas.rbPanYuca.getLabel();
                String cantidad= objetoVistaEntradas.txtCantidadPan.getText();
                String precio=objetoVistaEntradas.jlPanYuca.getText();
                float total = Integer.parseInt(cantidad)*Float.parseFloat(objetoVistaEntradas.jlPanYuca.getText());
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                pedDAO.insertarPedidos(objPed);
            }
        }

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
            modeloT.addColumn("Total");
            Object [] columna= new Object[4];
            int numReg= pedDAO.buscarPedido(pedido).size();
            for(int i=0;i<numReg;i++){
                ped= (Pedido) pedDAO.buscarPedido(pedido).get(i);
                System.out.println(ped);
                columna[0]=ped.getNombrePedido();
                columna[1]=ped.getCantidad();
                columna[2]= ped.getPrecio();
                columna[3]= ped.getTotal();
                modeloT.addRow(columna);
            }
       }
    }  
}
