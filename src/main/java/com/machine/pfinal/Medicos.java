/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.machine.pfinal;

import com.formdev.flatlaf.FlatDarkLaf;
import com.machine.database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diegodgv11
 */
public class Medicos extends javax.swing.JFrame {

    /**
     * Creates new form Medicos
     */
    public Medicos() {
        initComponents();

        DefaultTableModel tableModel = (DefaultTableModel) tableMedicos.getModel();

        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPanelPersonal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDpi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnAgregarTelefono = new javax.swing.JButton();
        comboTelefonos = new javax.swing.JComboBox<>();
        btnRemoverTelefono = new javax.swing.JButton();
        btnAgregarEmail = new javax.swing.JButton();
        comboEmails = new javax.swing.JComboBox<>();
        btnRemoverEmail = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtLicencia = new javax.swing.JTextField();
        btnAgregarPaciente = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        btnActualizarTabla = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Médicos");

        JPanelPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.background")), "Información personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 18), javax.swing.UIManager.getDefaults().getColor("Actions.Grey"))); // NOI18N
        JPanelPersonal.setForeground(new java.awt.Color(204, 204, 204));
        JPanelPersonal.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DPI:");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dirección:");

        txtDpi.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIT:");

        txtNit.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtApellido.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido:");

        txtDireccion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Teléfono:");

        txtTelefono.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        btnAgregarTelefono.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnAgregarTelefono.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnAgregarTelefono.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarTelefono.setText("+");
        btnAgregarTelefono.setToolTipText("");
        btnAgregarTelefono.setPreferredSize(new java.awt.Dimension(198, 102));
        btnAgregarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTelefonoActionPerformed(evt);
            }
        });

        comboTelefonos.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        btnRemoverTelefono.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        btnRemoverTelefono.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnRemoverTelefono.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverTelefono.setText("-");
        btnRemoverTelefono.setToolTipText("");
        btnRemoverTelefono.setPreferredSize(new java.awt.Dimension(198, 102));
        btnRemoverTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverTelefonoActionPerformed(evt);
            }
        });

        btnAgregarEmail.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnAgregarEmail.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnAgregarEmail.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEmail.setText("+");
        btnAgregarEmail.setToolTipText("");
        btnAgregarEmail.setPreferredSize(new java.awt.Dimension(198, 102));
        btnAgregarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmailActionPerformed(evt);
            }
        });

        comboEmails.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        btnRemoverEmail.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        btnRemoverEmail.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnRemoverEmail.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverEmail.setText("-");
        btnRemoverEmail.setToolTipText("");
        btnRemoverEmail.setPreferredSize(new java.awt.Dimension(198, 102));
        btnRemoverEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverEmailActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email:");

        txtEmail.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sexo:");

        comboSexo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        comboSexo.setToolTipText("");

        javax.swing.GroupLayout JPanelPersonalLayout = new javax.swing.GroupLayout(JPanelPersonal);
        JPanelPersonal.setLayout(JPanelPersonalLayout);
        JPanelPersonalLayout.setHorizontalGroup(
            JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPersonalLayout.createSequentialGroup()
                .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelPersonalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPanelPersonalLayout.createSequentialGroup()
                                .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(JPanelPersonalLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDpi))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelPersonalLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelPersonalLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelPersonalLayout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNit))))
                            .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelPersonalLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDireccion))
                                    .addGroup(JPanelPersonalLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(btnAgregarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(comboEmails, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(btnRemoverEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPanelPersonalLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(btnAgregarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(comboTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(btnRemoverTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(JPanelPersonalLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        JPanelPersonalLayout.setVerticalGroup(
            JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPersonalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRemoverTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboEmails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(btnRemoverEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.background")), "Información sanitaria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Licencia médica:");

        txtLicencia.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtLicencia)
                .addGap(198, 198, 198))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnAgregarPaciente.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnAgregarPaciente.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnAgregarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPaciente.setText("Agregar");
        btnAgregarPaciente.setToolTipText("");
        btnAgregarPaciente.setPreferredSize(new java.awt.Dimension(198, 102));
        btnAgregarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPacienteActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        btnLimpiar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(198, 102));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JPanelPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tableMedicos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tableMedicos.setForeground(new java.awt.Color(255, 255, 255));
        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DPI", "NIT", "Licencia", "Nombre", "Apellido", "Sexo", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMedicos.setShowGrid(true);
        tableMedicos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableMedicos);

        btnActualizarTabla.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnActualizarTabla.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnActualizarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTabla.setText("Actualizar");
        btnActualizarTabla.setToolTipText("");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Información General");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnClose.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        btnClose.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnClose.setText("x");
        btnClose.setBorderPainted(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPacienteActionPerformed

        if (txtDpi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El DPI es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtNit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El NIT es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apellido es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection connection = Database.getConnection();

        String pacienteQuery = "INSERT INTO Medicos(DPI, NIT, Licencia_Sanitaria, Nombre, Apellido, Direccion, Sexo) VALUES(?,?,?,?,?,?,?)";
        String telefonosQuery = "INSERT INTO Telefonos_Medicos(ID_Medico, Telefono) VALUES(?, ?)";
        String emailsQuery = "INSERT INTO Correos_Medicos(ID_Medico, Correo) VALUES(?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(pacienteQuery);
            statement.setString(1, txtDpi.getText());
            statement.setString(2, txtNit.getText());
            statement.setString(3, txtLicencia.getText());
            statement.setString(4, txtNombre.getText());
            statement.setString(5, txtApellido.getText());
            statement.setString(6, txtDireccion.getText());
            statement.setString(7, comboSexo.getSelectedItem().toString());
            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                long last_id = result.getLong(1);

                PreparedStatement telefonosStatement = connection.prepareStatement(telefonosQuery);
                for (int i = 0; i < comboTelefonos.getItemCount(); i++) {
                    telefonosStatement.setLong(1, last_id);
                    telefonosStatement.setString(2, comboTelefonos.getItemAt(i));
                    telefonosStatement.executeUpdate();
                }
                telefonosStatement.close();

                PreparedStatement emailsStatement = connection.prepareStatement(emailsQuery);
                for (int i = 0; i < comboEmails.getItemCount(); i++) {
                    emailsStatement.setLong(1, last_id);
                    emailsStatement.setString(2, comboEmails.getItemAt(i));
                    emailsStatement.executeUpdate();
                }
                emailsStatement.close();
            } else {
                JOptionPane.showMessageDialog(null, "Medico no agregado", "Error", JOptionPane.ERROR_MESSAGE);
            }

            statement.close();

            JOptionPane.showMessageDialog(null, "Medico agregado correctamente", "Éxito", JOptionPane.OK_OPTION);

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Error inesperado", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarPacienteActionPerformed

    private void limpiar() {

        txtDpi.setText("");
        txtNit.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        txtLicencia.setText("");

        comboTelefonos.removeAllItems();
        comboEmails.removeAllItems();

        comboSexo.setSelectedIndex(0);

    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTelefonoActionPerformed
        if (!txtTelefono.getText().isEmpty()) {
            comboTelefonos.addItem(txtTelefono.getText());
            txtTelefono.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Campo vacío", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarTelefonoActionPerformed

    private void btnRemoverTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverTelefonoActionPerformed
        if (comboTelefonos.getItemCount() > 0) {
            comboTelefonos.removeItemAt(comboTelefonos.getSelectedIndex());
        }
    }//GEN-LAST:event_btnRemoverTelefonoActionPerformed

    private void btnAgregarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmailActionPerformed
        if (!txtEmail.getText().isEmpty()) {
            comboEmails.addItem(txtEmail.getText());
            txtEmail.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Campo vacío", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarEmailActionPerformed

    private void btnRemoverEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverEmailActionPerformed
        if (comboEmails.getItemCount() > 0) {
            comboEmails.removeItemAt(comboEmails.getSelectedIndex());
        }
    }//GEN-LAST:event_btnRemoverEmailActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        Connection connection = Database.getConnection();
        DefaultTableModel tableModel = (DefaultTableModel) tableMedicos.getModel();

        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
        }

        String query = "SELECT ID_Medico, DPI, NIT, Licencia_Sanitaria, Nombre, Apellido, Sexo, Direccion FROM Medicos";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet results = statement.executeQuery();

            while (results.next()) {

                tableModel.addRow(new String[]{
                    results.getString("ID_Medico"),
                    results.getString("DPI"),
                    results.getString("NIT"),
                    results.getString("Licencia_Sanitaria"),
                    results.getString("Nombre"),
                    results.getString("Apellido"),
                    results.getString("Sexo"),
                    results.getString("Direccion")
                });

            }

            tableMedicos.setModel(tableModel);

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    public static void main(String args[]) {
        FlatDarkLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelPersonal;
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnAgregarEmail;
    private javax.swing.JButton btnAgregarPaciente;
    private javax.swing.JButton btnAgregarTelefono;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRemoverEmail;
    private javax.swing.JButton btnRemoverTelefono;
    private javax.swing.JComboBox<String> comboEmails;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JComboBox<String> comboTelefonos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableMedicos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDpi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLicencia;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
