/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Conexion.Conexion;
import javax.swing.table.DefaultTableModel;
import Modelos.ModeloEmpleado;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author yairf
 */
public class Empleados extends javax.swing.JPanel {
    private TableRowSorter trsFiltro;

    private Conexion conexion = Conexion.getInstance();
    DefaultTableModel modelo;

    /**
     * Creates new form Empleados
     */
    public Empleados() {
        initComponents();

        conexion.establecerConexion();
        Object[][] x = ModeloEmpleado.llenarEmpleados(conexion.getConection());
        String[] nombreColumnas = {"ID", "Nombre", "Primer apellido", "Segundo apellido", "# Telefono", "Fecha nacimiento", "Domicilio", "Sexo"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaEmpleado.setModel(modelo);
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
        nombreEmpleado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        primerApellido = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        segundoApellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        nTelefono = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        fechaNacimiento = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        domicilio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnAgregarEmpleado = new Componentes.BotonesAzules();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        btnEliminar = new Componentes.BotonesAzules();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(218, 217, 217));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 3, 20)); // NOI18N
        jLabel1.setText("Agregar Empleado");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 190, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel10.setText("Nombre:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, 10));

        nombreEmpleado.setBackground(new java.awt.Color(218, 217, 217));
        nombreEmpleado.setForeground(new java.awt.Color(102, 153, 255));
        nombreEmpleado.setBorder(null);
        nombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmpleadoActionPerformed(evt);
            }
        });
        jPanel5.add(nombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 170, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel13.setText("Apellido M:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, 20));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 170, 10));

        primerApellido.setBackground(new java.awt.Color(218, 217, 217));
        primerApellido.setForeground(new java.awt.Color(102, 153, 255));
        primerApellido.setBorder(null);
        primerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerApellidoActionPerformed(evt);
            }
        });
        jPanel5.add(primerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 170, 40));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 170, 10));

        segundoApellido.setBackground(new java.awt.Color(218, 217, 217));
        segundoApellido.setForeground(new java.awt.Color(102, 153, 255));
        segundoApellido.setBorder(null);
        segundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoApellidoActionPerformed(evt);
            }
        });
        jPanel5.add(segundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 170, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel14.setText("Apellido P:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel12.setText("ID:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        id.setBackground(new java.awt.Color(218, 217, 217));
        id.setForeground(new java.awt.Color(102, 153, 255));
        id.setBorder(null);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel5.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, 40));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 10));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel11.setText("Sexo:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, 20));

        nTelefono.setBackground(new java.awt.Color(218, 217, 217));
        nTelefono.setForeground(new java.awt.Color(102, 153, 255));
        nTelefono.setBorder(null);
        nTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nTelefonoActionPerformed(evt);
            }
        });
        jPanel5.add(nTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 170, 40));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 170, 10));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel16.setText("Fecha Nacimiento:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, 20));

        fechaNacimiento.setBackground(new java.awt.Color(218, 217, 217));
        fechaNacimiento.setForeground(new java.awt.Color(102, 153, 255));
        fechaNacimiento.setBorder(null);
        fechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacimientoActionPerformed(evt);
            }
        });
        jPanel5.add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 120, 40));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 120, 10));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 370, 10));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel17.setText("Domicilio:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        domicilio.setBackground(new java.awt.Color(218, 217, 217));
        domicilio.setBorder(null);
        domicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domicilioActionPerformed(evt);
            }
        });
        jPanel5.add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 370, 40));

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

        btnAgregarEmpleado.setText("Agregar");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });
        jPanel5.add(btnAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 120, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 300));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gadugi", 3, 20)); // NOI18N
        jLabel2.setText("Buscar Empleado");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 14, 170, 30));

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
        jPanel4.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 270, 40));

        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido P", "Apellido M", "Telefono", "Fecha ", "Domicilio", "Sexo"
            }
        ));
        jScrollPane2.setViewportView(tablaEmpleado);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 890, 90));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 120, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 890, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void nombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpleadoActionPerformed

    private void primerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerApellidoActionPerformed

    private void segundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segundoApellidoActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nTelefonoActionPerformed

    private void fechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaNacimientoActionPerformed

    private void domicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domicilioActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed

        ModeloEmpleado u = new ModeloEmpleado(nombreEmpleado.getText(), primerApellido.getText(), segundoApellido.getText(), 12345, "9511899442", "2018-02-19", "Sn Pablo Huitzo", "Hombre");

        conexion.establecerConexion();
        int resultado = u.guardarRegistroUsuario(conexion.getConection(), u);
        conexion.cerrarConexion();

        if (resultado == 1) {
            System.out.println("Agregado correctamente");
        }

        conexion.establecerConexion();
        Object[][] x = ModeloEmpleado.llenarEmpleados(conexion.getConection());
        String[] nombreColumnas = {"ID", "Nombre", "Primer apellido", "Segundo apellido", "# Telefono", "Fecha nacimiento", "Domicilio", "Sexo"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaEmpleado.setModel(modelo);
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel tm = (DefaultTableModel) tablaEmpleado.getModel();
        String dato = String.valueOf(tm.getValueAt(tablaEmpleado.getSelectedRow(),0));
        int celda = Integer.parseInt(dato);
        System.out.println(dato);
        
        conexion.establecerConexion();
        ModeloEmpleado.eliminarUsuario(conexion.getConection(), celda);
        
        Object[][] x = ModeloEmpleado.llenarEmpleados(conexion.getConection());
        String[] nombreColumnas = {"ID", "Nombre", "Primer apellido", "Segundo apellido", "# Telefono", "Fecha nacimiento", "Domicilio", "Sexo"};
        modelo = new DefaultTableModel(x, nombreColumnas);
        this.tablaEmpleado.setModel(modelo);        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
        txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText());
                txtBuscar.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablaEmpleado.getModel());
        tablaEmpleado.setRowSorter(trsFiltro);

    }//GEN-LAST:event_txtBuscarKeyTyped

    public void filtro() {
        int columnaABuscar = 1;
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), columnaABuscar));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.BotonesAzules btnAgregarEmpleado;
    private javax.swing.JButton btnBuscar;
    private Componentes.BotonesAzules btnEliminar;
    private javax.swing.JTextField domicilio;
    private javax.swing.JTextField fechaNacimiento;
    private javax.swing.JTextField id;
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
    private javax.swing.JTextField nTelefono;
    private javax.swing.JTextField nombreEmpleado;
    private javax.swing.JTextField primerApellido;
    private javax.swing.JTextField segundoApellido;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
