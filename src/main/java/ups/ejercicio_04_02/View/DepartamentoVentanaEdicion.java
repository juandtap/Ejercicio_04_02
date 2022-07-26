/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ups.ejercicio_04_02.View;

import javax.swing.JOptionPane;
import ups.ejercicio_04_02.Controller.DepartamentoController;
import ups.ejercicio_04_02.Model.Departamento;
import ups.ejercicio_04_02.Model.Empresa;

/**
 *
 * @author Diego
 */
public class DepartamentoVentanaEdicion extends javax.swing.JInternalFrame {

    private Departamento departamento;
    private final DepartamentoController departamentoController = new DepartamentoController();
    
    public DepartamentoVentanaEdicion(Departamento departamento) {
        initComponents();
        this.departamento = departamento;
        cargarDatos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldNombreDepartamento = new javax.swing.JTextField();
        jTextFieldGerenteDepartamento = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxEmpresasDepartamento = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldUbicacionDepartamento = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edicion Departamento");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DEPARTAMENTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.black)); // NOI18N

        jLabel14.setText("Codigo");

        jLabel15.setText("Nombre");

        jLabel16.setText("Gerente");

        jTextFieldGerenteDepartamento.setToolTipText("cedula empleado (OPCIONAL)");

        jButtonActualizar.setText("Guardar Cambios");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setForeground(java.awt.Color.red);
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel17.setText("Empresa");

        jComboBoxEmpresasDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Datos" }));
        jComboBoxEmpresasDepartamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxEmpresasDepartamentoFocusGained(evt);
            }
        });

        jLabel18.setText("Ubicacion");

        jLabelCodigo.setText("codigo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldGerenteDepartamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNombreDepartamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldUbicacionDepartamento)
                            .addComponent(jComboBoxEmpresasDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonActualizar)
                                .addGap(36, 36, 36)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabelCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldNombreDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldGerenteDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBoxEmpresasDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldUbicacionDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
       
        int opt = JOptionPane.showConfirmDialog(this, "Esta seguro de guardar los cambios?",
                "Actualizar Departamento", JOptionPane.YES_NO_OPTION);
        
        if (opt == 0) {
            actualizar();
            
        }
        
       
       
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        
        int opt = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar el elemento",
                "Eliminar!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (opt == 0) {
            departamentoController.eliminarDepartamento(this.departamento.getCodigo());
            System.out.println("Deparatemento Eliminado");
            JOptionPane.showMessageDialog(this, "Departamento Eliminado!");
            this.dispose();
        }
        
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jComboBoxEmpresasDepartamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxEmpresasDepartamentoFocusGained
        cargarEmpresaCombo();
    }//GEN-LAST:event_jComboBoxEmpresasDepartamentoFocusGained

     private void cargarEmpresaCombo(){
        jComboBoxEmpresasDepartamento.removeAllItems();
        for(var empresa: departamentoController.empresaService.listarEmpresas()){
            jComboBoxEmpresasDepartamento.addItem(empresa.getNombre());
        }
    }
    
    private void cargarDatos(){
        
        cargarEmpresaCombo();
        jLabelCodigo.setText(String.valueOf(this.departamento.getCodigo()));
        jTextFieldNombreDepartamento.setText(this.departamento.getNombre());
        
        if(this.departamento.getGerente() == null){
            jTextFieldGerenteDepartamento.setText("cedula empleado (OPCIONAL)");
        }else{
            jTextFieldGerenteDepartamento.setText(this.departamento.getGerente().getNombre());
        }
        
        jTextFieldUbicacionDepartamento.setText(this.departamento.getUbicacion());
        jComboBoxEmpresasDepartamento.setSelectedItem(this.departamento.getEmpresa().getNombre());
    }
    
    
    
    
    private void actualizar(){
       
        
        try {
            var departamentoNuevo = new Departamento(this.departamento.getCodigo(), jTextFieldNombreDepartamento.getText(),
                    getEmpresaFromComboBox(), jTextFieldUbicacionDepartamento.getText());

            departamentoController.actualizarDepartamento(this.departamento.getCodigo(), departamentoNuevo);
            // Si se tiene cedula del empleado en el campo gerente se le asigna a departamento
            if (!jTextFieldGerenteDepartamento.getText().trim().equals("cedula empleado (OPCIONAL)")) {

                var gerente = departamentoController.empleadoService.getEmpleadoByCedula(jTextFieldGerenteDepartamento.getText());
                if (gerente != null) {

                    departamentoController.asignarGerenteDepartamento(departamentoNuevo.getCodigo(), gerente);
                    // a empleado gerente tambien se le asigna el departamento 
                    departamentoController.empleadoService.asignarDepartamento(gerente.getCedula(), departamentoNuevo);

                    System.out.println("Empleado: " + gerente.getCedula() + " : " + gerente.getNombre() + " asignado como gerente en el departamento : "
                            + departamentoNuevo.getNombre());

                } else {
                    System.out.println("Empleado no existe");
                    JOptionPane.showMessageDialog(this, "Empleado no existe","Error",JOptionPane.ERROR_MESSAGE);
                }

            }
            
            
            System.out.println("departamento actualizado!");

            JOptionPane.showMessageDialog(this, "Departamento Actualizado!");
            this.dispose();
            
        } catch (NullPointerException e) {
             JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }
    
    private Empresa getEmpresaFromComboBox(){
        if (!this.jComboBoxEmpresasDepartamento.getSelectedItem().toString().equalsIgnoreCase("Sin Datos")){
            Empresa em = departamentoController.empresaService.listarEmpresas().get(jComboBoxEmpresasDepartamento.getSelectedIndex());
            return em;
        }
        
        return null;
    }
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JComboBox<String> jComboBoxEmpresasDepartamento;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldGerenteDepartamento;
    private javax.swing.JTextField jTextFieldNombreDepartamento;
    private javax.swing.JTextField jTextFieldUbicacionDepartamento;
    // End of variables declaration//GEN-END:variables
}
