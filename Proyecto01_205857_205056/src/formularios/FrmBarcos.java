/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import accesoDatos.BarcosDAO;
import accesoDatos.SociosDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetosNegocios.Barco;
import objetosNegocios.Socio;

/**
 *
 * @author miran
 */
public class FrmBarcos extends javax.swing.JFrame {

    private SociosDAO sociosDAO;
    private BarcosDAO barcosDAO;
    List<Barco> listaBarcos;

    /**
     * Creates new form Barcos
     */
    public FrmBarcos() {
        initComponents();
//        this.obtenerSocios();
        this.setTitle("FrmBarcos");
        this.sociosDAO = new SociosDAO();
        this.barcosDAO = new BarcosDAO();
        listaBarcos = new ArrayList<>();
        this.obtenerBarcosTabla();
        this.llenarCbox();
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        idBarco = new javax.swing.JLabel();
        txtIdBarco = new javax.swing.JTextField();
        lbMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lbNombe = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbNumamarre = new javax.swing.JLabel();
        txtNumamarre = new javax.swing.JTextField();
        lbCuota = new javax.swing.JLabel();
        txtCuota = new javax.swing.JTextField();
        lbSocio = new javax.swing.JLabel();
        cboxSocios = new javax.swing.JComboBox<>();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarcos = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        barcos = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        flechaRegresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 51, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de barcos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 1, 24), new java.awt.Color(204, 0, 0))); // NOI18N

        idBarco.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        idBarco.setForeground(new java.awt.Color(0, 51, 102));
        idBarco.setText("ID");

        txtIdBarco.setEditable(false);

        lbMatricula.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lbMatricula.setForeground(new java.awt.Color(0, 51, 102));
        lbMatricula.setText("Matrícula");

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyTyped(evt);
            }
        });

        lbNombe.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lbNombe.setForeground(new java.awt.Color(0, 51, 102));
        lbNombe.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lbNumamarre.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lbNumamarre.setForeground(new java.awt.Color(0, 51, 102));
        lbNumamarre.setText("Num. Amarre");

        txtNumamarre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumamarreActionPerformed(evt);
            }
        });
        txtNumamarre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumamarreKeyTyped(evt);
            }
        });

        lbCuota.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lbCuota.setForeground(new java.awt.Color(0, 51, 102));
        lbCuota.setText("Cuota");

        txtCuota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuotaKeyTyped(evt);
            }
        });

        lbSocio.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lbSocio.setForeground(new java.awt.Color(0, 51, 102));
        lbSocio.setText("Socio");

        btGuardar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btGuardar.setForeground(new java.awt.Color(0, 51, 102));
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(0, 51, 102));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNumamarre)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbSocio)
                                .addComponent(lbCuota)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCuota)
                            .addComponent(cboxSocios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumamarre)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCancelar)
                                .addGap(116, 116, 116))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idBarco)
                            .addComponent(lbMatricula)
                            .addComponent(lbNombe))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtIdBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 274, Short.MAX_VALUE))
                            .addComponent(txtNombre)
                            .addComponent(txtMatricula))))
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBarco)
                    .addComponent(txtIdBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombe)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumamarre)
                    .addComponent(txtNumamarre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCuota)
                    .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSocio)
                    .addComponent(cboxSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 1, 24), new java.awt.Color(204, 0, 0))); // NOI18N

        btAceptar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btAceptar.setForeground(new java.awt.Color(0, 51, 102));
        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });

        jScrollPane1.setEnabled(false);

        tblBarcos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        tblBarcos.setForeground(new java.awt.Color(0, 51, 102));
        tblBarcos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Matrícula", "Nombre", "Num. Amarre", "Cuota", "ID Socio", "Socio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBarcos);

        btEditar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btEditar.setForeground(new java.awt.Color(0, 51, 102));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btEliminar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btEliminar.setForeground(new java.awt.Color(0, 51, 102));
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btSalir.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btSalir.setForeground(new java.awt.Color(0, 51, 102));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barcos.setFont(new java.awt.Font("Ebrima", 0, 36)); // NOI18N
        barcos.setForeground(new java.awt.Color(255, 255, 255));
        barcos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boteBlanco.png"))); // NOI18N
        barcos.setText("Barcos");

        lblMenu.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/homeBlanco.png"))); // NOI18N
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        flechaRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaBlanco.png"))); // NOI18N
        flechaRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(barcos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flechaRegresar)
                .addGap(42, 42, 42))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barcos)
                            .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(flechaRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        if (txtIdBarco.getText().isEmpty()) {
            guardarBarcos();
        } else {
            actualizar();
        }
        limpiarBarcos();
        obtenerBarcosTabla();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limpiarBarcos();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        this.eliminarBarcos();
        this.obtenerBarcosTabla();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        this.cargarBarco();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        if (txtBuscar.getText().isEmpty()) {
            obtenerBarcosTabla();
        } else {
            concordancia();
        }
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        int salir = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea salir?", "¡¡Atención!!", JOptionPane.WARNING_MESSAGE);
        if (salir == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btSalirActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed

    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyTyped
        if (txtMatricula.getText().length() == 10) {
            evt.consume();
        }
        if (!Character.isDigit(evt.getKeyChar())) {
            if (!Character.isLetter(evt.getKeyChar())) {
                if ((int) evt.getKeyChar() != 45) {
                    evt.consume();
                }

            }
        }
    }//GEN-LAST:event_txtMatriculaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() == 100) {
            evt.consume();
        }
        if (!Character.isLetter(evt.getKeyChar())) {
            if (!Character.isSpaceChar(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNumamarreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumamarreActionPerformed

    }//GEN-LAST:event_txtNumamarreActionPerformed

    private void txtNumamarreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumamarreKeyTyped
        if (txtNumamarre.getText().length() == 11) {
            evt.consume();
        }
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumamarreKeyTyped

    private void txtCuotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuotaKeyTyped
        if (txtCuota.getText().length() == 11) {
            evt.consume();
        }
        if (!Character.isDigit(evt.getKeyChar())) {
            if ((int) evt.getKeyChar() != 46) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCuotaKeyTyped

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        FrmMenu menu= new FrmMenu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void flechaRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaRegresarMouseClicked
        FrmMenu menu= new FrmMenu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_flechaRegresarMouseClicked

    public void concordancia() {
        if (txtBuscar.getText().matches("^[0-9]*$")) {
            this.cargarTablaID(Integer.parseInt(txtBuscar.getText()));
        } else {
            obtenerBarcosTabla();
        }
    }

    public void cargarTablaID(int id) {
        Barco barco = barcosDAO.consultar(id);
        DefaultTableModel modelo = (DefaultTableModel) tblBarcos.getModel();
        modelo.setRowCount(0);
        if (barco != null) {
            modelo.addRow(barco.toArray());
        } else {
            JOptionPane.showMessageDialog(this, "No existe ningún barco con ese ID", "Información", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limpiarBarcos() {
        this.txtCuota.setText("");
        this.txtIdBarco.setText("");
        this.txtMatricula.setText("");
        this.txtNombre.setText("");
        this.txtNumamarre.setText("");
        this.cboxSocios.setSelectedIndex(0);

    }

    private void actualizar() {
        int idBarco = Integer.parseInt(txtIdBarco.getText());
        String nombre = txtNombre.getText();
        String matricula = txtMatricula.getText();
        Integer numamarre = Integer.parseInt(txtNumamarre.getText());
        Float cuota = Float.parseFloat(txtCuota.getText());
        Socio socio = (Socio) cboxSocios.getSelectedItem();
        Barco barco = new Barco(idBarco, matricula, nombre, numamarre, cuota, socio);
        barcosDAO.actualizar(barco);
    }

    private void eliminarBarcos() {
        int fila = this.tblBarcos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un barco.",
                    "Precaución", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblBarcos.getModel();
            Integer idBarco = (Integer) modelo.getValueAt(fila, 0);
            boolean eliminado = barcosDAO.eliminar(idBarco);
            if (eliminado == true) {
                JOptionPane.showMessageDialog(this, "Barco eliminado correctamente.",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el barco.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void guardarBarcos() {
        if (!txtNombre.getText().isEmpty() && !txtMatricula.getText().isEmpty() && !txtNumamarre.getText().isEmpty()
                && !txtCuota.getText().isEmpty() && cboxSocios.getSelectedIndex() != 0) {
            String nombre = txtNombre.getText();
            String matricula = txtMatricula.getText();
            Integer numamarre = Integer.parseInt(txtNumamarre.getText());
            Float cuota = Float.parseFloat(txtCuota.getText());
            Socio socio = (Socio) cboxSocios.getSelectedItem();
            Barco barco = new Barco(matricula, nombre, numamarre, cuota, socio);
            barcosDAO.guardar(barco);
            JOptionPane.showMessageDialog(this, "Se ha guardado con éxito.",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Llene todos los campos.",
                    "Información", JOptionPane.WARNING_MESSAGE);
        }
    }
    
   

    public void obtenerBarcosTabla() {
        List<Barco> barcos = barcosDAO.consultar(txtBuscar.getText());
        if (barcos != null) {
            DefaultTableModel modelo = (DefaultTableModel) tblBarcos.getModel();
            modelo.setRowCount(0);
            for (Barco c : barcos) {
                modelo.addRow(c.toArray());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Sin resultados.",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void llenarCbox() {
        Socio seleccioneP = new Socio();
        seleccioneP.setNombre("Seleccione...");
        
        cboxSocios.addItem(seleccioneP);
        List<Socio> socios = this.sociosDAO.consultar("");
        for (Socio socio : socios) {
            cboxSocios.addItem(socio);
        }
    }

    public void cargarBarco() {
        int fila = this.tblBarcos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un barco.",
                    "Precaución", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblBarcos.getModel();
            Integer idBarco = (Integer) modelo.getValueAt(fila, 0);
            Barco barco = barcosDAO.consultar(idBarco);
            if (barco != null) {
                txtIdBarco.setText(String.valueOf(barco.getIdBarco()));
                txtMatricula.setText(barco.getMatricula());
                txtNombre.setText(barco.getNombre());
                txtNumamarre.setText(String.valueOf(barco.getNumamarre()));
                txtCuota.setText(String.valueOf(barco.getCuota()));
                cboxSocios.setSelectedItem(barco.getSocio());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el barco.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
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
            java.util.logging.Logger.getLogger(FrmBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBarcos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barcos;
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Socio> cboxSocios;
    private javax.swing.JLabel flechaRegresar;
    private javax.swing.JLabel idBarco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCuota;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbNombe;
    private javax.swing.JLabel lbNumamarre;
    private javax.swing.JLabel lbSocio;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tblBarcos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCuota;
    private javax.swing.JTextField txtIdBarco;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumamarre;
    // End of variables declaration//GEN-END:variables
}
