
package javajtablemodel;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class JavaJTableModel {

    public static void main(String[] args) {
        JFrame ventanita = new JFrame("ventana");
        ventanita.setVisible(true);
        ventanita.setBounds(0,0,700,700);
        ventanita.setDefaultCloseOperation(3);  
        
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Nombre");
        model.addColumn("Edad");

        model.addRow(new Object[]{"Juan", 25});
        model.addRow(new Object[]{"María", 30});
        model.addRow(new Object[]{"Pedro", 28});
        
        JTable tabla = new JTable(model);

        System.out.println(tabla.getSelectedColumn());
        
        JScrollPane panel = new JScrollPane(tabla);
        ventanita.add(panel);
        ventanita.setVisible(true);
    }   
}

    