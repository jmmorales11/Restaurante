
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Ingrediente;
import modelo.Plato;
import vista.FrmVerIngredientes;
import vista.FrmVisualisarInformacionPedido;

public class ControladorVisualisarIngredientes implements ActionListener {
    FrmVerIngredientes vering = new FrmVerIngredientes();
    FrmVisualisarInformacionPedido verInfo = new FrmVisualisarInformacionPedido();
    Ingrediente in= new Ingrediente();
    Plato plato= new Plato();

    public ControladorVisualisarIngredientes(FrmVisualisarInformacionPedido info ) {
        verInfo = info;
        verInfo.btnVerIngredientes.addActionListener(this);
               
    }
    public void llenarTabla(JTable Table) {
        DefaultTableModel modeloT = new DefaultTableModel();
        Table.setModel(modeloT);
        modeloT.addColumn("NOMBRE DEL PLATO");
        modeloT.addColumn("INGREDIEBTES");
        modeloT.addColumn("CANTIDAD");
        modeloT.addColumn("UNIDADES DE PLATO");
        modeloT.addColumn("TOTAL DE INGREDINTES");

        Object[] columna = new Object[5];
//        int numReg = .size();
//        for (int i = 0; i < numReg; i++) {
//            ObjetoEmp = (Empleado) objEmpDAO.obtenerEmpleados().get(i);
//                    columna[0] = ObjetoEmp.getNombre();
//                    columna[1] = calcularIMC();
//                    columna[2] = ObjetoEmp.getProvincia();
//                    modeloT.addRow(columna);
//            
//            
////         }
//            
//        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == verInfo.btnVerIngredientes) {
            llenarTabla(vering.jtVerIn);
        }
    }
    
    
}
