/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appcontrolesimagesfilechooser;

import java.awt.Component;
import java.awt.Image;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author biank
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        modeloDeDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        imgPhoto = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cal = new javax.swing.JSpinner();
        cmbParciales = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMaterias = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAlumno = new javax.swing.JTable();
        btnInsertar = new javax.swing.JButton();
        btnProm = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        imgPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 255)));

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre: ");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cal.");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Parcial");

        cal.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        cmbParciales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Materias");

        lstMaterias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1-ANDROID", "2-IOS", "3-MACOS", "4-WINDOWS" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstMaterias);

        tbAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbAlumno);

        btnInsertar.setText("Insertar");
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarMouseClicked(evt);
            }
        });

        btnProm.setText("Promedio");
        btnProm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPromMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbParciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProm, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imgPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSeleccionar)
                                    .addComponent(btnInsertar)
                                    .addComponent(btnProm)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(cmbParciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel model;
    
    private void modeloDeDatos()
    {
        model = new DefaultTableModel();
        model.addColumn("Image");
        model.addColumn("Nombre");
        model.addColumn("Calificaci??n");
        model.addColumn("Parcial");
        model.addColumn("Materia");
        
        tbAlumno.setModel(model);
    }
    JFileChooser fc;
    String archivo;
    
    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        fc = new JFileChooser();
        fc.setDialogTitle("Buscar foto o imagen");
        
        if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            archivo = fc.getSelectedFile().toString();
            //rsscalelabel.RSScaleLabel.setScaleLabel(imgPhoto,fc.getSelectedFile().toString());
            escalarImage(archivo);
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void escalarImage(String urlFile)
    {
        Image img = new ImageIcon(urlFile).getImage();
        Image newImg = img.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newImg);
        
        imgPhoto.setIcon(imageIcon);
    }
    
    private void btnInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseClicked
        // TODO add your handling code here:
        int df = 0, ig = 0;
        JLabel imgLabel = new JLabel();
        Image img = new ImageIcon(archivo).getImage();
        Image newImg = img.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newImg);
        
        imgLabel.setIcon(imageIcon);
        
        tbAlumno.getColumn("Image").setCellRenderer(new LabelRendar());
        
        String name = txtName.getText();
        int cali =  Integer.parseInt(cal.getValue().toString());
        int parcial = Integer.parseInt(cmbParciales.getSelectedItem().toString());
        String materia = lstMaterias.getSelectedValue();
        
        if(name.isEmpty() || cali == 0 || parcial == 0 || materia.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Se requiere el nombre, calificacion, materia y parcial para ingresar uno nuevo");
        }
        else
        {
            int rowCount = tbAlumno.getRowCount();
        
        if(rowCount > 0)
        {
            for(int row = 0; row < rowCount; row++)
            {
                String _name = tbAlumno.getValueAt(row,1).toString();
                int _parcial = Integer.parseInt(tbAlumno.getValueAt(row, 3).toString());
                String _materia = tbAlumno.getValueAt(row, 4).toString();
                if(name.equals(_name) && _parcial == parcial && _materia.equals(materia))
                {
                    JOptionPane.showMessageDialog(null, "No se admiten datos duplicados");
                    ig++;
                    row = rowCount;
                }
                else
                {
                    df++;
                }
            }
            
            if(ig < 1)
            {
                model.addRow(new Object[]{imgLabel, name, cali, parcial, materia});
                tbAlumno.setModel(model);
            }
        }
        
        if(rowCount == 0)
        {
            model.addRow(new Object[]{imgLabel, name, cali, parcial, materia});
            tbAlumno.setModel(model);
        }
        updateRowHeights();
        }
        txtName.setText("");
        cmbParciales.setSelectedIndex(0);
        cal.setValue(0);
    }//GEN-LAST:event_btnInsertarMouseClicked

    private void btnPromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromMouseClicked
        // TODO add your handling code here:
        int cal01 = 0, cal02 = 0, cal03 = 0;
        double calificaciones;
        
        if(((txtName.getText() == null || txtName.getText().isEmpty()) && (lstMaterias.getSelectedValue() == null || lstMaterias.getSelectedValue().isEmpty())) || 
                ((txtName.getText() == null || txtName.getText().isEmpty()) || (lstMaterias.getSelectedValue() == null || lstMaterias.getSelectedValue().isEmpty()))) JOptionPane.showMessageDialog(null, "Se necesita un nombre y matereia para consultar el promedio");
        else
        {
            for(int row = 0; row < tbAlumno.getRowCount(); row++)
        {
            if(tbAlumno.getValueAt(row, 1).equals(txtName.getText()) && tbAlumno.getValueAt(row, 3).equals(1) && tbAlumno.getValueAt(row, 4).equals(lstMaterias.getSelectedValue()))
            {
                cal01= Integer.parseInt(tbAlumno.getValueAt(row, 2).toString());
            }
            if(tbAlumno.getValueAt(row, 1).equals(txtName.getText()) && tbAlumno.getValueAt(row, 3).equals(2) && tbAlumno.getValueAt(row, 4).equals(lstMaterias.getSelectedValue()))
            {
                cal02= Integer.parseInt(tbAlumno.getValueAt(row, 2).toString());
            }
            if(tbAlumno.getValueAt(row, 1).equals(txtName.getText()) && tbAlumno.getValueAt(row, 3).equals(3) && tbAlumno.getValueAt(row, 4).equals(lstMaterias.getSelectedValue()))
            {
                cal03= Integer.parseInt(tbAlumno.getValueAt(row, 2).toString());
            }
        }
        
        if(cal01 == 0 || cal02 == 0 || cal03 == 0) JOptionPane.showMessageDialog(null,"Se requiere la calificacion de los tres parciales");
        else
        {
            calificaciones = cal01 + cal02 + cal03;
            calificaciones = calificaciones / 3;
            JOptionPane.showMessageDialog(null,"El promedio de "+txtName.getText()+" es: "+calificaciones);
        }
        }
    }//GEN-LAST:event_btnPromMouseClicked

    private void updateRowHeights()
    {
      JTable table  =  tbAlumno;
      
        for (int row = 0; row < table.getRowCount(); row++)
        {
            int rowHeight = table.getRowHeight();

            for (int column = 0; column < table.getColumnCount(); column++)
            {
                Component comp = table.prepareRenderer(table.getCellRenderer(row, column), row, column);
                rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
            }

            table.setRowHeight(row, rowHeight);
        }
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnProm;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JSpinner cal;
    private javax.swing.JComboBox<String> cmbParciales;
    private javax.swing.JLabel imgPhoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> lstMaterias;
    private javax.swing.JTable tbAlumno;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

class LabelRendar implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return (Component)value;  
    }
    
}