/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Natalia
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCalculadora
     */
    public VentanaCalculadora() {
        initComponents();
    }

    private void numeroPulsado(String numero) {
        if (pantalla.getText() == "0") {
            pantalla.setText(numero);
        } else {
            pantalla.setText(pantalla.getText() + numero);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JLabel();
        boton007 = new javax.swing.JButton();
        boton08 = new javax.swing.JButton();
        boton008 = new javax.swing.JButton();
        boton04 = new javax.swing.JButton();
        boton05 = new javax.swing.JButton();
        boton06 = new javax.swing.JButton();
        boton01 = new javax.swing.JButton();
        boton02 = new javax.swing.JButton();
        boton03 = new javax.swing.JButton();
        boton00 = new javax.swing.JButton();
        botonMas = new javax.swing.JButton();
        boton = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setBackground(new java.awt.Color(51, 0, 51));
        pantalla.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        pantalla.setForeground(new java.awt.Color(153, 0, 153));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        pantalla.setOpaque(true);

        boton007.setBackground(new java.awt.Color(204, 204, 255));
        boton007.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton007.setText("7");
        boton007.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton007MousePressed(evt);
            }
        });
        boton007.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton007ActionPerformed(evt);
            }
        });

        boton08.setBackground(new java.awt.Color(204, 204, 255));
        boton08.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton08.setText("+");
        boton08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton08MousePressed(evt);
            }
        });

        boton008.setBackground(new java.awt.Color(204, 204, 255));
        boton008.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton008.setText("8");
        boton008.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton008MousePressed(evt);
            }
        });
        boton008.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton008ActionPerformed(evt);
            }
        });

        boton04.setBackground(new java.awt.Color(204, 204, 255));
        boton04.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton04.setText("9");
        boton04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton04MousePressed(evt);
            }
        });

        boton05.setBackground(new java.awt.Color(204, 204, 255));
        boton05.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton05.setText("5");
        boton05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton05MousePressed(evt);
            }
        });
        boton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton05ActionPerformed(evt);
            }
        });

        boton06.setBackground(new java.awt.Color(204, 204, 255));
        boton06.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton06.setText("-");
        boton06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton06MousePressed(evt);
            }
        });

        boton01.setBackground(new java.awt.Color(204, 204, 255));
        boton01.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton01.setText("4");
        boton01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton01MousePressed(evt);
            }
        });

        boton02.setBackground(new java.awt.Color(204, 204, 255));
        boton02.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton02.setText("3");
        boton02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton02MousePressed(evt);
            }
        });

        boton03.setBackground(new java.awt.Color(204, 204, 255));
        boton03.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton03.setText("1");
        boton03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton03MousePressed(evt);
            }
        });

        boton00.setBackground(new java.awt.Color(204, 204, 255));
        boton00.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton00.setText("#");
        boton00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton00MousePressed(evt);
            }
        });
        boton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton00ActionPerformed(evt);
            }
        });

        botonMas.setBackground(new java.awt.Color(204, 204, 255));
        botonMas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonMas.setText("*");
        botonMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMasMousePressed(evt);
            }
        });

        boton.setBackground(new java.awt.Color(204, 204, 255));
        boton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton.setText("2");
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMousePressed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(204, 204, 255));
        jButton17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton17.setText("6");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton17MousePressed(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(204, 204, 255));
        jButton19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton19.setText("<");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton19MousePressed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(204, 204, 255));
        jButton21.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton21.setText("0");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton21MousePressed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(204, 204, 255));
        jButton22.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton22.setText("%");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton22MousePressed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(204, 204, 255));
        jButton23.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton23.setText(">");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton23MousePressed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(204, 204, 255));
        jButton24.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton24.setText("/");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton24MousePressed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(204, 204, 255));
        jButton25.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton25.setText("=");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton25MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(boton03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boton007, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(boton01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton008, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton04, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton08, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boton05, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boton02, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(botonMas, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(boton06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boton00, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton04, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton008, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton08, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton007, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton06, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton05, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton01, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton02, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton00, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton03, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton007MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton007MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton007MousePressed

    private void boton08MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton08MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton08MousePressed

    private void boton008MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton008MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton008MousePressed

    private void boton04MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton04MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton04MousePressed

    private void boton05MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton05MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton05MousePressed

    private void boton06MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton06MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton06MousePressed

    private void boton01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton01MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton01MousePressed

    private void boton02MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton02MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton02MousePressed

    private void boton03MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton03MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton03MousePressed

    private void boton00MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton00MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton00MousePressed

    private void botonMasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMasMousePressed

    private void botonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMousePressed

    private void jButton17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17MousePressed

    private void jButton19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19MousePressed

    private void jButton21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21MousePressed

    private void jButton22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22MousePressed

    private void jButton23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23MousePressed

    private void jButton24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24MousePressed

    private void jButton25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25MousePressed

    private void boton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton05ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void boton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton00ActionPerformed

    private void boton007ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton007ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton007ActionPerformed

    private void boton008ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton008ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton008ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JButton boton00;
    private javax.swing.JButton boton007;
    private javax.swing.JButton boton008;
    private javax.swing.JButton boton01;
    private javax.swing.JButton boton02;
    private javax.swing.JButton boton03;
    private javax.swing.JButton boton04;
    private javax.swing.JButton boton05;
    private javax.swing.JButton boton06;
    private javax.swing.JButton boton08;
    private javax.swing.JButton botonMas;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
