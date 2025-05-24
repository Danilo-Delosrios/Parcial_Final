
package Formularios;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class FrmMatriz extends javax.swing.JFrame {
private int[][] matriz = new int[6][6];
private static final String ARCHIVO_MATRIZ = "matriz.txt";
    public FrmMatriz() {
        initComponents();
        btn_guardar.addActionListener(this::guardarMatriz);
        btn_listar.addActionListener(this::listarMatriz);
        inicializarMatriz();
    }
        private void inicializarMatriz() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    private void guardarMatriz(ActionEvent evt) {
        try {
            matriz[0][0] = Integer.parseInt(txt_f1_c1.getText());
            matriz[0][1] = Integer.parseInt(txt_f1_c2.getText());
            matriz[0][2] = Integer.parseInt(txt_f1_c3.getText());
            matriz[0][3] = Integer.parseInt(txt_f1_c4.getText());
            matriz[0][4] = Integer.parseInt(txt_f1_c5.getText());
            matriz[0][5] = Integer.parseInt(txt_f1_c6.getText());
            
            matriz[1][0] = Integer.parseInt(txt_f2_c1.getText());
            matriz[1][1] = Integer.parseInt(txt_f2_c2.getText());
            matriz[1][2] = Integer.parseInt(txt_f2_c3.getText());
            matriz[1][3] = Integer.parseInt(txt_f2_c4.getText());
            matriz[1][4] = Integer.parseInt(txt_f2_c5.getText());
            matriz[1][5] = Integer.parseInt(txt_f2_c6.getText());
            
            matriz[2][0] = Integer.parseInt(txt_f3_c1.getText());
            matriz[2][1] = Integer.parseInt(txt_f3_c2.getText());
            matriz[2][2] = Integer.parseInt(txt_f3_c3.getText());
            matriz[2][3] = Integer.parseInt(txt_f3_c4.getText());
            matriz[2][4] = Integer.parseInt(txt_f3_c5.getText());
            matriz[2][5] = Integer.parseInt(txt_f3_c6.getText());
            
            matriz[3][0] = Integer.parseInt(txt_f4_c1.getText());
            matriz[3][1] = Integer.parseInt(txt_f4_c2.getText());
            matriz[3][2] = Integer.parseInt(txt_f4_c3.getText());
            matriz[3][3] = Integer.parseInt(txt_f4_c4.getText());
            matriz[3][4] = Integer.parseInt(txt_f4_c5.getText());
            matriz[3][5] = Integer.parseInt(txt_f4_c6.getText());
            
            matriz[4][0] = Integer.parseInt(txt_f5_c1.getText());
            matriz[4][1] = Integer.parseInt(txt_f5_c2.getText());
            matriz[4][2] = Integer.parseInt(txt_f5_c3.getText());
            matriz[4][3] = Integer.parseInt(txt_f5_c4.getText());
            matriz[4][4] = Integer.parseInt(txt_f5_c5.getText());
            matriz[4][5] = Integer.parseInt(txt_f5_c6.getText());
            
            matriz[5][0] = Integer.parseInt(txt_f6_c1.getText());
            matriz[5][1] = Integer.parseInt(txt_f6_c2.getText());
            matriz[5][2] = Integer.parseInt(txt_f6_c3.getText());
            matriz[5][3] = Integer.parseInt(txt_f6_c4.getText());
            matriz[5][4] = Integer.parseInt(txt_f6_c5.getText());
            matriz[5][5] = Integer.parseInt(txt_f6_c6.getText());
            
            guardarMatrizEnArchivo();
            
            JOptionPane.showMessageDialog(this, "Matriz guardada correctamente");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese solo números enteros", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void guardarMatrizEnArchivo() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_MATRIZ))) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    writer.print(matriz[i][j] + (j < 5 ? "," : ""));
                }
                writer.println();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void listarMatriz(ActionEvent evt) {
        try {
            leerMatrizDesdeArchivo();
            mostrarMatrizEnTextArea();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void leerMatrizDesdeArchivo() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_MATRIZ))) {
            String linea;
            int fila = 0;
            while ((linea = reader.readLine()) != null && fila < 6) {
                String[] valores = linea.split(",");
                for (int col = 0; col < 6 && col < valores.length; col++) {
                    matriz[fila][col] = Integer.parseInt(valores[col].trim());
                }
                fila++;
            }
        }
    }
    
    private void mostrarMatrizEnTextArea() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                sb.append(String.format("%5d", matriz[i][j]));
            }
            sb.append("\n");
        }
        txt_listar.setText(sb.toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField37 = new javax.swing.JTextField();
        txt_f1_c2 = new javax.swing.JTextField();
        txt_f1_c1 = new javax.swing.JTextField();
        txt_f2_c2 = new javax.swing.JTextField();
        txt_f2_c1 = new javax.swing.JTextField();
        txt_f2_c3 = new javax.swing.JTextField();
        txt_f2_c4 = new javax.swing.JTextField();
        txt_f1_c4 = new javax.swing.JTextField();
        txt_f1_c3 = new javax.swing.JTextField();
        txt_f1_c5 = new javax.swing.JTextField();
        txt_f1_c6 = new javax.swing.JTextField();
        txt_f3_c1 = new javax.swing.JTextField();
        txt_f3_c2 = new javax.swing.JTextField();
        txt_f2_c5 = new javax.swing.JTextField();
        txt_f2_c6 = new javax.swing.JTextField();
        txt_f4_c1 = new javax.swing.JTextField();
        txt_f4_c2 = new javax.swing.JTextField();
        txt_f6_c1 = new javax.swing.JTextField();
        txt_f5_c1 = new javax.swing.JTextField();
        txt_f5_c6 = new javax.swing.JTextField();
        txt_f6_c5 = new javax.swing.JTextField();
        txt_f6_c6 = new javax.swing.JTextField();
        txt_f5_c2 = new javax.swing.JTextField();
        txt_f6_c2 = new javax.swing.JTextField();
        txt_f6_c3 = new javax.swing.JTextField();
        txt_f6_c4 = new javax.swing.JTextField();
        txt_f5_c4 = new javax.swing.JTextField();
        txt_f5_c3 = new javax.swing.JTextField();
        txt_f5_c5 = new javax.swing.JTextField();
        txt_f3_c5 = new javax.swing.JTextField();
        txt_f3_c6 = new javax.swing.JTextField();
        txt_f4_c5 = new javax.swing.JTextField();
        txt_f4_c6 = new javax.swing.JTextField();
        txt_f4_c3 = new javax.swing.JTextField();
        txt_f4_c4 = new javax.swing.JTextField();
        txt_f3_c4 = new javax.swing.JTextField();
        txt_f3_c3 = new javax.swing.JTextField();
        txt_listar = new javax.swing.JTextField();
        btn_listar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();

        jTextField37.setText("jTextField37");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_f1_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f1_c2ActionPerformed(evt);
            }
        });

        txt_f1_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f1_c1ActionPerformed(evt);
            }
        });

        txt_f2_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f2_c2ActionPerformed(evt);
            }
        });

        txt_f2_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f2_c1ActionPerformed(evt);
            }
        });

        txt_f2_c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f2_c3ActionPerformed(evt);
            }
        });

        txt_f2_c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f2_c4ActionPerformed(evt);
            }
        });

        txt_f1_c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f1_c4ActionPerformed(evt);
            }
        });

        txt_f1_c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f1_c3ActionPerformed(evt);
            }
        });

        txt_f1_c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f1_c5ActionPerformed(evt);
            }
        });

        txt_f1_c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f1_c6ActionPerformed(evt);
            }
        });

        txt_f3_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f3_c1ActionPerformed(evt);
            }
        });

        txt_f3_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f3_c2ActionPerformed(evt);
            }
        });

        txt_f2_c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f2_c5ActionPerformed(evt);
            }
        });

        txt_f2_c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f2_c6ActionPerformed(evt);
            }
        });

        txt_f4_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f4_c1ActionPerformed(evt);
            }
        });

        txt_f4_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f4_c2ActionPerformed(evt);
            }
        });

        txt_f6_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f6_c1ActionPerformed(evt);
            }
        });

        txt_f5_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f5_c1ActionPerformed(evt);
            }
        });

        txt_f5_c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f5_c6ActionPerformed(evt);
            }
        });

        txt_f6_c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f6_c5ActionPerformed(evt);
            }
        });

        txt_f6_c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f6_c6ActionPerformed(evt);
            }
        });

        txt_f5_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f5_c2ActionPerformed(evt);
            }
        });

        txt_f6_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f6_c2ActionPerformed(evt);
            }
        });

        txt_f6_c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f6_c3ActionPerformed(evt);
            }
        });

        txt_f6_c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f6_c4ActionPerformed(evt);
            }
        });

        txt_f5_c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f5_c4ActionPerformed(evt);
            }
        });

        txt_f5_c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f5_c3ActionPerformed(evt);
            }
        });

        txt_f5_c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f5_c5ActionPerformed(evt);
            }
        });

        txt_f3_c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f3_c5ActionPerformed(evt);
            }
        });

        txt_f3_c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f3_c6ActionPerformed(evt);
            }
        });

        txt_f4_c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f4_c5ActionPerformed(evt);
            }
        });

        txt_f4_c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f4_c6ActionPerformed(evt);
            }
        });

        txt_f4_c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f4_c3ActionPerformed(evt);
            }
        });

        txt_f4_c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f4_c4ActionPerformed(evt);
            }
        });

        txt_f3_c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f3_c4ActionPerformed(evt);
            }
        });

        txt_f3_c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f3_c3ActionPerformed(evt);
            }
        });

        btn_listar.setText("Listar");
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_f2_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_f2_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_f1_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_f1_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_f2_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_f2_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_f1_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_f1_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_f2_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_f2_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_f1_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_f1_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_f3_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_f3_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(180, 180, 180)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_f6_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_f5_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_f4_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_f4_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_f4_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_f4_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_f3_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_f3_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_f4_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_f4_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_f3_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_f3_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_f6_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_f5_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_f6_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_f6_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_f5_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_f5_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_f6_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_f6_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_f5_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_f5_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(txt_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_listar)
                            .addComponent(btn_guardar))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_f1_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_f1_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_f2_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_f2_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_f1_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_f1_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_f2_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_f2_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_f1_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_f1_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_f2_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_f2_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_f3_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_f3_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_f4_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_f4_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_f3_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_f3_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_f4_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_f4_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_f5_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_f6_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_f5_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_f5_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_f6_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_f6_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_f5_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_f5_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_f6_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_f6_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_f5_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_f6_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_f3_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_f3_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btn_guardar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_f4_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_f4_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btn_listar)))))
                .addGap(18, 18, 18)
                .addComponent(txt_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_f1_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f1_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f1_c2ActionPerformed

    private void txt_f1_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f1_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f1_c1ActionPerformed

    private void txt_f2_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f2_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f2_c2ActionPerformed

    private void txt_f2_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f2_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f2_c1ActionPerformed

    private void txt_f2_c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f2_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f2_c3ActionPerformed

    private void txt_f2_c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f2_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f2_c4ActionPerformed

    private void txt_f1_c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f1_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f1_c4ActionPerformed

    private void txt_f1_c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f1_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f1_c3ActionPerformed

    private void txt_f1_c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f1_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f1_c5ActionPerformed

    private void txt_f1_c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f1_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f1_c6ActionPerformed

    private void txt_f3_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f3_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f3_c1ActionPerformed

    private void txt_f3_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f3_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f3_c2ActionPerformed

    private void txt_f2_c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f2_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f2_c5ActionPerformed

    private void txt_f2_c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f2_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f2_c6ActionPerformed

    private void txt_f4_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f4_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f4_c1ActionPerformed

    private void txt_f4_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f4_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f4_c2ActionPerformed

    private void txt_f6_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f6_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f6_c1ActionPerformed

    private void txt_f5_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f5_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f5_c1ActionPerformed

    private void txt_f5_c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f5_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f5_c6ActionPerformed

    private void txt_f6_c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f6_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f6_c5ActionPerformed

    private void txt_f6_c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f6_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f6_c6ActionPerformed

    private void txt_f5_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f5_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f5_c2ActionPerformed

    private void txt_f6_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f6_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f6_c2ActionPerformed

    private void txt_f6_c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f6_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f6_c3ActionPerformed

    private void txt_f6_c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f6_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f6_c4ActionPerformed

    private void txt_f5_c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f5_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f5_c4ActionPerformed

    private void txt_f5_c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f5_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f5_c3ActionPerformed

    private void txt_f5_c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f5_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f5_c5ActionPerformed

    private void txt_f3_c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f3_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f3_c5ActionPerformed

    private void txt_f3_c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f3_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f3_c6ActionPerformed

    private void txt_f4_c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f4_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f4_c5ActionPerformed

    private void txt_f4_c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f4_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f4_c6ActionPerformed

    private void txt_f4_c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f4_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f4_c3ActionPerformed

    private void txt_f4_c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f4_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f4_c4ActionPerformed

    private void txt_f3_c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f3_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f3_c4ActionPerformed

    private void txt_f3_c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f3_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f3_c3ActionPerformed

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_listarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMatriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField txt_f1_c1;
    private javax.swing.JTextField txt_f1_c2;
    private javax.swing.JTextField txt_f1_c3;
    private javax.swing.JTextField txt_f1_c4;
    private javax.swing.JTextField txt_f1_c5;
    private javax.swing.JTextField txt_f1_c6;
    private javax.swing.JTextField txt_f2_c1;
    private javax.swing.JTextField txt_f2_c2;
    private javax.swing.JTextField txt_f2_c3;
    private javax.swing.JTextField txt_f2_c4;
    private javax.swing.JTextField txt_f2_c5;
    private javax.swing.JTextField txt_f2_c6;
    private javax.swing.JTextField txt_f3_c1;
    private javax.swing.JTextField txt_f3_c2;
    private javax.swing.JTextField txt_f3_c3;
    private javax.swing.JTextField txt_f3_c4;
    private javax.swing.JTextField txt_f3_c5;
    private javax.swing.JTextField txt_f3_c6;
    private javax.swing.JTextField txt_f4_c1;
    private javax.swing.JTextField txt_f4_c2;
    private javax.swing.JTextField txt_f4_c3;
    private javax.swing.JTextField txt_f4_c4;
    private javax.swing.JTextField txt_f4_c5;
    private javax.swing.JTextField txt_f4_c6;
    private javax.swing.JTextField txt_f5_c1;
    private javax.swing.JTextField txt_f5_c2;
    private javax.swing.JTextField txt_f5_c3;
    private javax.swing.JTextField txt_f5_c4;
    private javax.swing.JTextField txt_f5_c5;
    private javax.swing.JTextField txt_f5_c6;
    private javax.swing.JTextField txt_f6_c1;
    private javax.swing.JTextField txt_f6_c2;
    private javax.swing.JTextField txt_f6_c3;
    private javax.swing.JTextField txt_f6_c4;
    private javax.swing.JTextField txt_f6_c5;
    private javax.swing.JTextField txt_f6_c6;
    private javax.swing.JTextField txt_listar;
    // End of variables declaration//GEN-END:variables
}
