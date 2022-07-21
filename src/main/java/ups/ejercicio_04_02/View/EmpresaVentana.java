/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ups.ejercicio_04_02.View;

import java.time.LocalDate;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import ups.ejercicio_04_02.Controller.EmpresaController;
import ups.ejercicio_04_02.Model.Empresa;

/**
 *
 * @author Diego
 */
public class EmpresaVentana extends javax.swing.JInternalFrame {

    
    final EmpresaController empresaController;
    private TableModel modeloTablaEmpresas;
    public final JDesktopPane jDesktopPane;
    
    
    public EmpresaVentana(JDesktopPane jDesktopPane1) {
        initComponents();
        empresaController = new EmpresaController();
        this.jDesktopPane = jDesktopPane1;
        this.jButtonEditar.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldCodigoEmpresa = new javax.swing.JTextField();
        jTextFieldNombreEmpresa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldFundadorEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPaisesEmpresa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDireccionEmpresa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxAnioEmpresa = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxMesEmpresa = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxDiaEmpresa = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonAgregarEmpresa = new javax.swing.JButton();
        jButtonMostrarEmpresas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpresas = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empresa");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EMPRESAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.black)); // NOI18N

        jTextFieldCodigoEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoEmpresaKeyReleased(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Fundador");

        jComboBoxPaisesEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alemania", "Argentina", "Belgica", "Brasil", "Bolivia", "Canada", "Chile", "Colombia", "Corea", "Cuba", "Dinamarca", "Ecuador", "Egipto", "España", "Estados Unidos", "Francia", "Honduras", "Inglaterra", "Italia", "Japon", "Mexico", "Paraguay", "Peru", "Uruguay" }));

        jLabel4.setText("Pais");

        jLabel5.setText("Direccion principal");

        jLabel6.setText("Fecha Fundacion");

        jLabel8.setText("año");

        jComboBoxAnioEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        jLabel9.setText("mes");

        jComboBoxMesEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel10.setText("dia");

        jComboBoxDiaEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jButtonAgregarEmpresa.setText("Agregar");
        jButtonAgregarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarEmpresaActionPerformed(evt);
            }
        });

        jButtonMostrarEmpresas.setText("Mostrar");
        jButtonMostrarEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarEmpresasActionPerformed(evt);
            }
        });

        jTableEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Fundador", "Pais", "Direccion", "Fecha Fundacion"
            }
        ));
        jScrollPane1.setViewportView(jTableEmpresas);

        jButtonEditar.setText("Editar/Eliminar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombreEmpresa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldFundadorEmpresa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxAnioEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxMesEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDiaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldCodigoEmpresa)
                    .addComponent(jComboBoxPaisesEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDireccionEmpresa)))
            .addComponent(jSeparator1)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAgregarEmpresa)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMostrarEmpresas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldFundadorEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPaisesEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxAnioEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxMesEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxDiaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarEmpresa)
                    .addComponent(jButtonMostrarEmpresas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoEmpresaKeyReleased
        if(!empresaController.validarSoloNumeros(evt.getKeyChar())){
            // se elimina el careacter que no sea un numero del jTextfield
            if (jTextFieldCodigoEmpresa.getText().length() > 0){
                String temp = jTextFieldCodigoEmpresa.getText().substring(0,jTextFieldCodigoEmpresa.getText().length()-1);
                jTextFieldCodigoEmpresa.setText(temp);
            }

        }
    }//GEN-LAST:event_jTextFieldCodigoEmpresaKeyReleased

    private void jButtonAgregarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarEmpresaActionPerformed
        agregarEmpresa();
        
        mostrarTablaEmpresas();
        
    }//GEN-LAST:event_jButtonAgregarEmpresaActionPerformed

    private void jButtonMostrarEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarEmpresasActionPerformed

        
        try {
            System.out.println("EMPRESAS:\n");
            for (Empresa empresa : empresaController.listarEmpresas()) {
                // se aniade fecha actual para mostrar la inforamacion de la empresa que incluye la antiguedad de la misma
                System.out.println(empresa.mostrarInformacion(LocalDate.now().getYear()));
                System.out.println("");
            }
            System.out.println("----------------------------------------------------------------");

            mostrarTablaEmpresas(); 
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_jButtonMostrarEmpresasActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        editar(jTableEmpresas.getSelectedRow());
    }//GEN-LAST:event_jButtonEditarActionPerformed

    // METODOS
    
    private void agregarEmpresa(){
        
        try {
            empresaController.crearEmpresa(Integer.parseInt(jTextFieldCodigoEmpresa.getText()), jTextFieldNombreEmpresa.getText(),
                    jTextFieldFundadorEmpresa.getText(), jComboBoxPaisesEmpresa.getSelectedItem().toString(), jTextFieldDireccionEmpresa.getText(),
                    Integer.parseInt(jComboBoxAnioEmpresa.getSelectedItem().toString()), (jComboBoxMesEmpresa.getSelectedIndex() + 1),
                    (jComboBoxDiaEmpresa.getSelectedIndex() + 1));
            System.out.println("Empresa agregada !");
            JOptionPane.showMessageDialog(this, "Empresa Agregada!");
            clearDataEmpresa();
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }catch (NumberFormatException e){
             JOptionPane.showMessageDialog(this, "Debe ingresar un Codigo ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        } 
        
        
     }
    
    public void clearDataEmpresa(){
        jTextFieldCodigoEmpresa.setText("");
        jTextFieldNombreEmpresa.setText("");
        jTextFieldDireccionEmpresa.setText("");
        jTextFieldFundadorEmpresa.setText("");
    }    
    
    public void mostrarTablaEmpresas(){
        
        var header = new String[6];
        
        header[0] = "Codigo";
        header[1] = "Nombre";
        header[2] = "Fundador";
        header[3] = "Pais";
        header[4] = "Direccion";
        header[5] = "Fundacion";
        
        var data = new Object[this.empresaController.listarEmpresas().size()][6];
        
        for (int i = 0; i < this.empresaController.listarEmpresas().size(); i++) {
            
            data[i][0] = this.empresaController.listarEmpresas().get(i).getCodigo();
            data[i][1] = this.empresaController.listarEmpresas().get(i).getNombre();
            data[i][2] = this.empresaController.listarEmpresas().get(i).getNombreFundador();
            data[i][3] = this.empresaController.listarEmpresas().get(i).getPais();
            data[i][4] = this.empresaController.listarEmpresas().get(i).getDireccion();
            data[i][5] = this.empresaController.listarEmpresas().get(i).getFechaFundacion();
             
        }
        
        this.modeloTablaEmpresas = new DefaultTableModel(data,header);
        this.jTableEmpresas.setModel(modeloTablaEmpresas);
        
        // habilita el boton de Edicion si hay elementos agregados, caso contrario lo deshabilita
        if(!this.empresaController.listarEmpresas().isEmpty()){
            this.jButtonEditar.setEnabled(true);
        } else{
            this.jButtonEditar.setEnabled(false);
        }
    }
    
    
    private void editar(int posicion){
        EmpresaVentanaEdicion empresaVentanaEdicion = new EmpresaVentanaEdicion(this.empresaController.listarEmpresas().get(posicion));
        
        this.jDesktopPane.add(empresaVentanaEdicion);
        empresaVentanaEdicion.setIconifiable(true);
        empresaVentanaEdicion.setClosable(true);
        empresaVentanaEdicion.setResizable(true);
        empresaVentanaEdicion.setVisible(true);
         
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarEmpresa;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonMostrarEmpresas;
    private javax.swing.JComboBox<String> jComboBoxAnioEmpresa;
    private javax.swing.JComboBox<String> jComboBoxDiaEmpresa;
    private javax.swing.JComboBox<String> jComboBoxMesEmpresa;
    private javax.swing.JComboBox<String> jComboBoxPaisesEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableEmpresas;
    private javax.swing.JTextField jTextFieldCodigoEmpresa;
    private javax.swing.JTextField jTextFieldDireccionEmpresa;
    private javax.swing.JTextField jTextFieldFundadorEmpresa;
    private javax.swing.JTextField jTextFieldNombreEmpresa;
    // End of variables declaration//GEN-END:variables
}
