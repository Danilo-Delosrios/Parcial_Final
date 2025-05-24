/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class frmMatriz extends javax.swing.JFrame {
/**
 *
 * @author emjuc
 */
    private JTextField[][] txtMatriz = new JTextField[6][6];
    private JPanel panelMatriz;
    
    public frmMatriz() {
        setTitle("Matriz 6x6");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);
        
        panelMatriz = new JPanel(new GridLayout(6,6,2,2));
        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                txtMatriz[i][j] = new JTextField();
                txtMatriz[i][j].setPreferredSize(new Dimension(50,50));
                txtMatriz[i][j].setHorizontalAlignment(JTextField.CENTER);
                panelMatriz.add(txtMatriz[i][j]);
            }
        }
        

        btnGuardar = new javax.swing.JButton("Guardar");
        btnListar = new javax.swing.JButton("Listar");
        
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);
        btnListar.addActionListener(this::btnListarActionPerformed);
        
 
        javax.swing.JPanel panelBotones = new javax.swing.JPanel();
        panelBotones.add(btnGuardar);
        panelBotones.add(btnListar);
        

        add(panelMatriz, java.awt.BorderLayout.CENTER);
        add(panelBotones, java.awt.BorderLayout.SOUTH);
        
        pack();
    }
    


    @SuppressWarnings("unchecked")

    private void initComponents() {

        txtMatriz00 = new javax.swing.JTextField();
        txtMatriz01 = new javax.swing.JTextField();
        txtMatriz02 = new javax.swing.JTextField();
        txtMatriz03 = new javax.swing.JTextField();
        txtMatriz04 = new javax.swing.JTextField();
        txtMatriz05 = new javax.swing.JTextField();
        txtMatriz06 = new javax.swing.JTextField();
        txtMatriz07 = new javax.swing.JTextField();
        txtMatriz08 = new javax.swing.JTextField();
        txtMatriz09 = new javax.swing.JTextField();
        txtMatriz10 = new javax.swing.JTextField();
        txtMatriz11 = new javax.swing.JTextField();
        txtMatriz12 = new javax.swing.JTextField();
        txtMatriz13 = new javax.swing.JTextField();
        txtMatriz14 = new javax.swing.JTextField();
        txtMatriz15 = new javax.swing.JTextField();
        txtMatriz16 = new javax.swing.JTextField();
        txtMatriz17 = new javax.swing.JTextField();
        txtMatriz18 = new javax.swing.JTextField();
        txtMatriz19 = new javax.swing.JTextField();
        txtMatriz20 = new javax.swing.JTextField();
        txtMatriz21 = new javax.swing.JTextField();
        txtMatriz22 = new javax.swing.JTextField();
        txtMatriz23 = new javax.swing.JTextField();
        txtMatriz24 = new javax.swing.JTextField();
        txtMatriz25 = new javax.swing.JTextField();
        txtMatriz26 = new javax.swing.JTextField();
        txtMatriz27 = new javax.swing.JTextField();
        txtMatriz28 = new javax.swing.JTextField();
        txtMatriz29 = new javax.swing.JTextField();
        txtMatriz30 = new javax.swing.JTextField();
        txtMatriz31 = new javax.swing.JTextField();
        txtMatriz32 = new javax.swing.JTextField();
        txtMatriz33 = new javax.swing.JTextField();
        txtMatriz34 = new javax.swing.JTextField();
        txtMatriz35 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMatriz00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz00.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz00.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz00.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz00.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz01.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz01.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz01.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz02.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz02.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz02.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz03.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz03.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz03.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz04.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz04.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz04.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz04.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz05.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz05.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz05.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz05.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz06.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz06.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz06.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz06.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz07.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz07.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz07.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz07.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz08.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz08.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz08.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz08.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz09.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz09.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz09.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz09.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz10.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz10.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz10.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz11.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz11.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz11.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz12.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz12.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz12.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz13.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz13.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz13.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz14.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz14.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz14.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz15.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz15.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz15.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz16.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz16.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz16.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz17.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz17.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz17.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz18.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz18.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz18.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz19.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz19.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz19.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz20.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz20.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz20.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz21.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz21.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz21.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz22.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz22.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz22.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz23.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz23.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz23.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz24.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz24.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz24.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz25.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz25.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz25.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz26.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz26.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz26.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz27.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz27.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz27.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz28.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz28.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz28.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz29.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz29.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz29.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz30.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz30.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz30.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz31.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz31.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz31.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz32.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz32.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz32.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz33.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz33.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz33.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz34.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz34.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz34.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMatriz35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatriz35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtMatriz35.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMatriz35.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMatriz35.setPreferredSize(new java.awt.Dimension(50, 50));

        btnGuardar.setText("Guardar");
        btnGuardar.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btnListar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMatriz24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMatriz18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMatriz12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtMatriz06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatriz07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatriz08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatriz09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatriz10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatriz11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtMatriz00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatriz01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatriz02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatriz03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatriz04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatriz05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMatriz30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatriz00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatriz06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatriz12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatriz18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatriz24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatriz30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatriz35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    try {

        StringBuilder contenido = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                JTextField campo = txtMatriz[i][j];
                String valor = campo.getText().trim();
                contenido.append(valor.isEmpty() ? "0" : valor); 
                if (j < 5) contenido.append(","); 
            }
            contenido.append("\n"); 
        }

 
        Files.write(Paths.get("matrix.txt"), contenido.toString().getBytes());
        

        JOptionPane.showMessageDialog(this, 
            "Matriz guardada exitosamente en matrix.txt", 
            "Éxito", 
            JOptionPane.INFORMATION_MESSAGE);
            
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this,
            "Error al guardar: " + ex.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
    StringBuilder contenido = new StringBuilder();
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                contenido.append("Fila ").append(i)
                       .append(", Col ").append(j)
                       .append(": ").append(txtMatriz[i][j].getText())
                       .append("\n");
            }
        }
        JOptionPane.showMessageDialog(this, contenido.toString());


    }//GEN-LAST:event_btnListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtMatriz00;
    private javax.swing.JTextField txtMatriz01;
    private javax.swing.JTextField txtMatriz02;
    private javax.swing.JTextField txtMatriz03;
    private javax.swing.JTextField txtMatriz04;
    private javax.swing.JTextField txtMatriz05;
    private javax.swing.JTextField txtMatriz06;
    private javax.swing.JTextField txtMatriz07;
    private javax.swing.JTextField txtMatriz08;
    private javax.swing.JTextField txtMatriz09;
    private javax.swing.JTextField txtMatriz10;
    private javax.swing.JTextField txtMatriz11;
    private javax.swing.JTextField txtMatriz12;
    private javax.swing.JTextField txtMatriz13;
    private javax.swing.JTextField txtMatriz14;
    private javax.swing.JTextField txtMatriz15;
    private javax.swing.JTextField txtMatriz16;
    private javax.swing.JTextField txtMatriz17;
    private javax.swing.JTextField txtMatriz18;
    private javax.swing.JTextField txtMatriz19;
    private javax.swing.JTextField txtMatriz20;
    private javax.swing.JTextField txtMatriz21;
    private javax.swing.JTextField txtMatriz22;
    private javax.swing.JTextField txtMatriz23;
    private javax.swing.JTextField txtMatriz24;
    private javax.swing.JTextField txtMatriz25;
    private javax.swing.JTextField txtMatriz26;
    private javax.swing.JTextField txtMatriz27;
    private javax.swing.JTextField txtMatriz28;
    private javax.swing.JTextField txtMatriz29;
    private javax.swing.JTextField txtMatriz30;
    private javax.swing.JTextField txtMatriz31;
    private javax.swing.JTextField txtMatriz32;
    private javax.swing.JTextField txtMatriz33;
    private javax.swing.JTextField txtMatriz34;
    private javax.swing.JTextField txtMatriz35;
    // End of variables declaration//GEN-END:variables
}
