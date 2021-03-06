/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Conexion.Conexion;
import Modelos.ModeloCliente;
import Modelos.ModeloProductos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author yairf
 */
public class Clientes extends javax.swing.JPanel {

    private TableRowSorter trsFiltro;

    private Conexion conexion = Conexion.getInstance();
    DefaultTableModel modelo;
    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        
        conexion.establecerConexion();
        Object[][] x = ModeloCliente.llenarClientes(conexion.getConection());
        String[] nombreColumnas = {"ID","Nombre", "Primer apellido", "Segundo apellido" ,"Fecha nacimiento", "Sexo", "Domicilio", "# Telefono", "RFC"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaClientes.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        etiNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        etiPrimerApellido = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        etiSeApellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        etiRFC = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        etiTelefono = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        etiFeca = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        etiDomicilio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnAgregar = new Componentes.BotonesAzules();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnEliminar = new Componentes.BotonesAzules();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(218, 217, 217));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel1.setText("Agregar Cliente");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 160, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel10.setText("Nombre:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, 10));

        etiNombre.setBackground(new java.awt.Color(218, 217, 217));
        etiNombre.setForeground(new java.awt.Color(102, 153, 255));
        etiNombre.setBorder(null);
        etiNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiNombreActionPerformed(evt);
            }
        });
        jPanel5.add(etiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 170, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel13.setText("Apellido M:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, 20));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 170, 10));

        etiPrimerApellido.setBackground(new java.awt.Color(218, 217, 217));
        etiPrimerApellido.setForeground(new java.awt.Color(102, 153, 255));
        etiPrimerApellido.setBorder(null);
        etiPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiPrimerApellidoActionPerformed(evt);
            }
        });
        jPanel5.add(etiPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 170, 40));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 170, 10));

        etiSeApellido.setBackground(new java.awt.Color(218, 217, 217));
        etiSeApellido.setForeground(new java.awt.Color(102, 153, 255));
        etiSeApellido.setBorder(null);
        etiSeApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiSeApellidoActionPerformed(evt);
            }
        });
        jPanel5.add(etiSeApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 170, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel14.setText("Apellido P:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel12.setText("RFC:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        etiRFC.setBackground(new java.awt.Color(218, 217, 217));
        etiRFC.setForeground(new java.awt.Color(102, 153, 255));
        etiRFC.setBorder(null);
        etiRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiRFCActionPerformed(evt);
            }
        });
        jPanel5.add(etiRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, 40));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 10));

        jLabel11.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        jLabel11.setText("Sexo:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, 20));

        etiTelefono.setBackground(new java.awt.Color(218, 217, 217));
        etiTelefono.setForeground(new java.awt.Color(102, 153, 255));
        etiTelefono.setBorder(null);
        etiTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiTelefonoActionPerformed(evt);
            }
        });
        jPanel5.add(etiTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 170, 40));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 170, 10));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel16.setText("Fecha Nacimiento:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, 20));

        etiFeca.setBackground(new java.awt.Color(218, 217, 217));
        etiFeca.setForeground(new java.awt.Color(102, 153, 255));
        etiFeca.setBorder(null);
        etiFeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiFecaActionPerformed(evt);
            }
        });
        jPanel5.add(etiFeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 120, 40));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 120, 10));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 370, 10));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel17.setText("Domicilio:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        etiDomicilio.setBackground(new java.awt.Color(218, 217, 217));
        etiDomicilio.setBorder(null);
        etiDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiDomicilioActionPerformed(evt);
            }
        });
        jPanel5.add(etiDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 370, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel15.setText("Telefono:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, 20));

        jRadioButton1.setBackground(new java.awt.Color(218, 217, 217));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 20, 20));

        jRadioButton2.setBackground(new java.awt.Color(218, 217, 217));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 20, 20));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel5.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 120, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 300));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel2.setText("Buscar Cliente");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 160, 30));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel4.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 270, 40));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido M", "Apellido P", "RFC", "Telefono", "Sexo", "Fecha", "Domicilio"
            }
        ));
        jScrollPane2.setViewportView(tablaClientes);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 890, 180));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 120, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 890, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void etiNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etiNombreActionPerformed

    private void etiPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etiPrimerApellidoActionPerformed

    private void etiSeApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiSeApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etiSeApellidoActionPerformed

    private void etiRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etiRFCActionPerformed

    private void etiTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etiTelefonoActionPerformed

    private void etiFecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiFecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etiFecaActionPerformed

    private void etiDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etiDomicilioActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      
        // TODO add your handling code here:
        ModeloCliente c = new ModeloCliente(etiNombre.getText(), etiPrimerApellido.getText(), etiSeApellido.getText(),etiFeca.getText(),  "Hombre" ,  etiDomicilio.getText(),etiTelefono.getText(),etiRFC.getText());

        conexion.establecerConexion();
        int resultado = c.guardarRegistroCliente(conexion.getConection(), c);
        conexion.cerrarConexion();

        if (resultado == 1) {
            System.out.println("Agregado correctamente");
        }

        conexion.establecerConexion();
        Object[][] x = ModeloCliente .llenarClientes(conexion.getConection());
        String[] nombreColumnas = {"ID", "Nombre", "Primer apellido", "Segundo apellido", "# Telefono", "Fecha nacimiento", "Domicilio", "Sexo"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaClientes.setModel(modelo);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm = (DefaultTableModel) tablaClientes.getModel();
        String dato = String.valueOf(tm.getValueAt(tablaClientes.getSelectedRow(), 0));
        int celda = Integer.parseInt(dato);
        System.out.println(dato);

        conexion.establecerConexion();
        ModeloCliente.eliminarCliente(conexion.getConection(), celda);

        Object[][] x = ModeloCliente.llenarClientes(conexion.getConection());
        String[] nombreColumnas = {"ID","Nombre", "Primer apellido", "Segundo apellido" ,"Fecha nacimiento", "Sexo", "Domicilio", "# Telefono", "RFC"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaClientes.setModel(modelo);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
        txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText());
                txtBuscar.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablaClientes.getModel());
        tablaClientes.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped

    public void filtro() {
        int columnaABuscar = 1;
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), columnaABuscar));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.BotonesAzules btnAgregar;
    private Componentes.BotonesAzules btnEliminar;
    private javax.swing.JTextField etiDomicilio;
    private javax.swing.JTextField etiFeca;
    private javax.swing.JTextField etiNombre;
    private javax.swing.JTextField etiPrimerApellido;
    private javax.swing.JTextField etiRFC;
    private javax.swing.JTextField etiSeApellido;
    private javax.swing.JTextField etiTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
