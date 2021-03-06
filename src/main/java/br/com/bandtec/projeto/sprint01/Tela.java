/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.sprint01;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author AngeloBr12
 */
public class Tela extends javax.swing.JFrame {
    
    Valores Cpu = new Valores();
    Valores Disco = new Valores();
    Valores Memoria = new Valores();
    Integer cont = 0;
    
    void atualizar( ){
        cont++;
        
        Integer CpuInt = ThreadLocalRandom.current().nextInt(0, 350);
        Integer DiscoInt = ThreadLocalRandom.current().nextInt(0, 3000);
        Integer MemoriaInt = ThreadLocalRandom.current().nextInt(0, 120);
        
        Cpu.valorAtual = CpuInt.doubleValue() / 100;
        Disco.valorAtual = DiscoInt.doubleValue() / 10;
        Memoria.valorAtual = MemoriaInt.doubleValue() / 10;
        
        pbCpu.setString(Cpu.valorAtual.toString() + " GHz");
        pbDisco.setString(Disco.valorAtual.toString() + " GB");
        pbMemoria.setString(Memoria.valorAtual.toString() + " GB");
        
        pbCpu.setValue(CpuInt);
        pbDisco.setValue(DiscoInt);
        pbMemoria.setValue(MemoriaInt);
        
        Cpu.valorTotal = Cpu.valorTotal + Cpu.valorAtual;
        Disco.valorTotal = Disco.valorTotal + Disco.valorAtual;
        Memoria.valorTotal = Memoria.valorTotal + Memoria.valorAtual;
        
        Cpu.ValorMedia = Cpu.valorTotal / cont;
        Disco.ValorMedia = Disco.valorTotal / cont;
        Memoria.ValorMedia = Memoria.valorTotal / cont;
        
        lbMediaCpu.setText(String.format("%.1f",Cpu.ValorMedia));
        lbMediaDisco.setText(String.format("%.1f",Disco.ValorMedia));
        lbMediaMemoria.setText(String.format("%.1f",Memoria.ValorMedia));
        
        if (Cpu.valorAtual < Cpu.ValorMin) {
            Cpu.ValorMin = Cpu.valorAtual;
        }
        if (Disco.valorAtual < Disco.ValorMin) {
            Disco.ValorMin = Disco.valorAtual;
        }
        if (Memoria.valorAtual < Memoria.ValorMin) {
            Memoria.ValorMin = Memoria.valorAtual;
        }
        
        lbMinCpu.setText(String.format("%.1f",Cpu.ValorMin));
        lbMinDisco.setText(String.format("%.1f",Disco.ValorMin));
        lbMinMemoria.setText(String.format("%.1f",Memoria.ValorMin));
        
        if (Cpu.valorAtual > Cpu.ValorMax) {
            Cpu.ValorMax = Cpu.valorAtual;
        }
        if (Disco.valorAtual > Disco.ValorMax) {
            Disco.ValorMax = Disco.valorAtual;
        }
        if (Memoria.valorAtual > Memoria.ValorMax) {
            Memoria.ValorMax = Memoria.valorAtual;
        }
        
        lbMaxCpu.setText(String.format("%.1f",Cpu.ValorMax));
        lbMaxDisco.setText(String.format("%.1f",Disco.ValorMax));
        lbMaxMemoria.setText(String.format("%.1f",Memoria.ValorMax));
    
    }
    
    public Tela() {
        initComponents();
    }
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbCpu = new javax.swing.JProgressBar();
        pbDisco = new javax.swing.JProgressBar();
        pbMemoria = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLeitura = new javax.swing.JButton();
        lbMinMemoria = new javax.swing.JLabel();
        lbMediaMemoria = new javax.swing.JLabel();
        lbMaxMemoria = new javax.swing.JLabel();
        lbMaxDisco = new javax.swing.JLabel();
        lbMediaDisco = new javax.swing.JLabel();
        lbMinDisco = new javax.swing.JLabel();
        lbMinCpu = new javax.swing.JLabel();
        lbMediaCpu = new javax.swing.JLabel();
        lbMaxCpu = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Uso do computador");

        jLabel2.setText("Cpu");

        jLabel3.setText("Disco");

        jLabel4.setText("Memoria");

        btnLeitura.setText("Fazer leitura dos dados");
        btnLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeituraActionPerformed(evt);
            }
        });

        lbMinMemoria.setText("0");

        lbMediaMemoria.setText("0");

        lbMaxMemoria.setText("0");

        lbMaxDisco.setText("0");

        lbMediaDisco.setText("0");

        lbMinDisco.setText("0");

        lbMinCpu.setText("0");

        lbMediaCpu.setText("0");

        lbMaxCpu.setText("0");

        jLabel14.setText("Min");

        jLabel15.setText("Media");

        jLabel16.setText("Max");

        jLabel17.setText("Min");

        jLabel18.setText("Media");

        jLabel19.setText("Max");

        jLabel20.setText("Min");

        jLabel21.setText("Media");

        jLabel22.setText("Max");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnLeitura)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMinMemoria)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMediaMemoria)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(lbMaxMemoria)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMinDisco)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMediaDisco)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(lbMaxDisco)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMinCpu)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMediaCpu)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(lbMaxCpu))))
                        .addContainerGap())))
            .addComponent(pbMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pbDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pbCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbMinCpu)
                    .addComponent(lbMediaCpu)
                    .addComponent(lbMaxCpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbMinDisco)
                    .addComponent(lbMediaDisco)
                    .addComponent(lbMaxDisco))
                .addGap(8, 8, 8)
                .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbMinMemoria)
                    .addComponent(lbMediaMemoria)
                    .addComponent(lbMaxMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLeitura))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeituraActionPerformed
        pbCpu.setMaximum(350);
        pbDisco.setMaximum(3000);
        pbMemoria.setMaximum(120);
        
        pbCpu.setStringPainted(true);
        pbDisco.setStringPainted(true);
        pbMemoria.setStringPainted(true);
        
        atualizar();
    }//GEN-LAST:event_btnLeituraActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeitura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbMaxCpu;
    private javax.swing.JLabel lbMaxDisco;
    private javax.swing.JLabel lbMaxMemoria;
    private javax.swing.JLabel lbMediaCpu;
    private javax.swing.JLabel lbMediaDisco;
    private javax.swing.JLabel lbMediaMemoria;
    private javax.swing.JLabel lbMinCpu;
    private javax.swing.JLabel lbMinDisco;
    private javax.swing.JLabel lbMinMemoria;
    private javax.swing.JProgressBar pbCpu;
    private javax.swing.JProgressBar pbDisco;
    private javax.swing.JProgressBar pbMemoria;
    // End of variables declaration//GEN-END:variables
}
