
package controlador;

import vista.FrmConfirmacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Pedido;
import modelo.PedidosDAO;
import vista.FrmBebidas;
import vista.FrmEntradas;
import vista.FrmFuerte;
import vista.FrmPostre;

public class ControladorRestaurante implements ActionListener, KeyListener  {
    Pedido ped= new Pedido();
    PedidosDAO pedDAO= new PedidosDAO();
    FrmBebidas objetoVistaBebidas= new FrmBebidas();
    FrmEntradas objetoVistaEntradas= new FrmEntradas();
    FrmFuerte objetoVistaFuerte= new FrmFuerte();
    FrmPostre objetoVistaPostre= new FrmPostre();
    FrmConfirmacion objetoVistaConfirmacion= new FrmConfirmacion();
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
    public void llenarTablaEntrada(JTable tablaD){
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("Numero de pedido");
        modeloT.addColumn("Descripcion");
        modeloT.addColumn("Cantidad");
        modeloT.addColumn("Total");
        Object [] columna = new Object[4];
        int numReg = pedDAO.obtenerPedidos().size();
        for(int i=0; i<numReg ;i++){
           ped=(Pedido)pedDAO.obtenerPedidos().get(i);
           if(objetoVistaFuerte.rbArroz.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
           }
           if(objetoVistaFuerte.rbChurrasco.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
           }
           if(objetoVistaFuerte.rbEncebollado.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
           }
        }     
    }
    public void llenarTablaFuerte(JTable tablaD){
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("Numero de pedido");
        modeloT.addColumn("Descripcion");
        modeloT.addColumn("Cantidad");
        modeloT.addColumn("Total");
        Object [] columna = new Object[4];
        int numReg = pedDAO.obtenerPedidos().size();
        for(int i=0; i<numReg ;i++){
           ped=(Pedido)pedDAO.obtenerPedidos().get(i);
           if(objetoVistaFuerte.rbArroz.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
           }
           if(objetoVistaFuerte.rbChurrasco.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
           }
           if(objetoVistaFuerte.rbEncebollado.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
           }
        }     
    }
    



    public void llenarTabla(JTable tablaD){
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("Numero de pedido");
        modeloT.addColumn("Descripcion");
        modeloT.addColumn("Cantidad");
        modeloT.addColumn("Total");
        Object [] columna = new Object[4];
        int numReg = pedDAO.obtenerPedidos().size();
        for(int i=0; i<numReg ;i++){
           ped=(Pedido)pedDAO.obtenerPedidos().get(i);
           if(objetoVistaBebidas.rbCoca.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
                modeloT.addRow(columna);
           }
           if(objetoVistaBebidas.rbFanta.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
                modeloT.addRow(columna);
           }
           if(objetoVistaBebidas.rbSprite.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
                modeloT.addRow(columna);
           }
        }
    }
    public void llenarTablaPostre(JTable tablaD){
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("Numero de pedido");
        modeloT.addColumn("Descripcion");
        modeloT.addColumn("Cantidad");
        modeloT.addColumn("Total");
        Object [] columna = new Object[4];
        int numReg = pedDAO.obtenerPedidos().size();
        for(int i=0; i<numReg ;i++){
           ped=(Pedido)pedDAO.obtenerPedidos().get(i);
           if(objetoVistaPostre.rbCoco.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
                modeloT.addRow(columna);
           }
           if(objetoVistaPostre.rbDulceGuayaba.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
                modeloT.addRow(columna);
           }
           if(objetoVistaPostre.rbEspumillaNaranjilla.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
                modeloT.addRow(columna);
           }
        }
    }
        @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVistaBebidas.btnAgregarBebidas){
            String numPedido=objetoVistaBebidas.txtPedidoBebidas.getText();
            if(objetoVistaBebidas.rbCoca.getLabel().equalsIgnoreCase("Coca cola")){ 
                String nombrePed=objetoVistaBebidas.rbCoca.getLabel();
                String cantidad= objetoVistaBebidas.txtCoca.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaBebidas.rbFanta.getLabel().equalsIgnoreCase("Fanta")){
                String nombrePed=objetoVistaBebidas.rbFanta.getLabel();
                String cantidad= objetoVistaBebidas.txtFanta.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaBebidas.rbSprite.getLabel().equalsIgnoreCase("Sprite")){
                String nombrePed=objetoVistaBebidas.rbSprite.getLabel();
                String cantidad= objetoVistaBebidas.txtSprite.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }

        }
        if(e.getSource()==objetoVistaPostre.btnAgregarPostre){
            String numPedido=objetoVistaPostre.txtPedidoPostre.getText();
            
            if(objetoVistaPostre.rbDulceGuayaba.getLabel().equalsIgnoreCase("Dulce de Guayaba")){
                String nombrePed=objetoVistaPostre.rbDulceGuayaba.getLabel();
                String cantidad= objetoVistaPostre.txtCantidadDGuayaba.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaPostre.rbEspumillaNaranjilla.getLabel().equalsIgnoreCase("Espumilla de Naranjilla")){
                String nombrePed=objetoVistaPostre.rbEspumillaNaranjilla.getLabel();
                String cantidad= objetoVistaPostre.txtCatidadEspumilla.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaPostre.rbCoco.getLabel().equalsIgnoreCase("Bien me sabe de Coco")){ 
                String nombrePed=objetoVistaPostre.rbCoco.getLabel();
                String cantidad= objetoVistaPostre.txtCantidadCoco.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
        }
        if(e.getSource()==objetoVistaFuerte.btnAgregarFuerte){
            String numPedido=objetoVistaFuerte.txtPedidoFuertes.getText();
            if(objetoVistaFuerte.rbArroz.getLabel().equalsIgnoreCase("Arroz con Conchas")){ 
                String nombrePed=objetoVistaFuerte.rbArroz.getLabel();
                String cantidad= objetoVistaFuerte.txtCantidadArroz.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaFuerte.rbChurrasco.getLabel().equalsIgnoreCase("Churrasco")){
                String nombrePed=objetoVistaFuerte.rbChurrasco.getLabel();
                String cantidad= objetoVistaFuerte.txtCantidadChurrasco.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaFuerte.rbEncebollado.getLabel().equalsIgnoreCase("Encebollado")){
                String nombrePed=objetoVistaFuerte.rbChurrasco.getLabel();
                String cantidad= objetoVistaFuerte.txtCantidadEncebollado.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
        }
        if(e.getSource()==objetoVistaEntradas.btnAgregarEntrada){
            String numPedido=objetoVistaEntradas.txtPedidoEntrada.getText();
            if(objetoVistaEntradas.rbBolonVerde.getLabel().equalsIgnoreCase("Bolon de Verde")){ 
                String nombrePed=objetoVistaEntradas.rbBolonVerde.getLabel();
                String cantidad= objetoVistaEntradas.txtCantidadBolon.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaEntradas.rbEmpanadaMorocho.getLabel().equalsIgnoreCase("Empanadas de morocho")){
                String nombrePed=objetoVistaEntradas.rbEmpanadaMorocho.getLabel();
                String cantidad= objetoVistaEntradas.txtCantidadEmpanadasMorocho.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaEntradas.rbPanYuca.getLabel().equalsIgnoreCase("Pan de Yuca")){
                String nombrePed=objetoVistaEntradas.rbPanYuca.getLabel();
                String cantidad= objetoVistaEntradas.txtCantidadEmpanadasMorocho.getText();
                Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
                pedDAO.insertarPedidos(objPed);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
