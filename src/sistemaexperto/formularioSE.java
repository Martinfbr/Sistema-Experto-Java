/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemaexperto;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author Chass
 */
public class formularioSE extends javax.swing.JFrame {

    /**
     * Creates new form formularioSE
     */
    public formularioSE() {
        initComponents();
        setTitle("Sistema Experto");
        setResizable(false);
        this.setLocationRelativeTo(null);
        texto.setEditable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.gray));

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenido al Sistema Experto");

        jLabel2.setFont(new java.awt.Font("Freestyle Script", 0, 30)); // NOI18N
        jLabel2.setText("Diagnostico de Plantas Electricas");

        jLabel5.setFont(new java.awt.Font("Freestyle Script", 0, 24)); // NOI18N
        jLabel5.setText("Mantenimientos de equipos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(36, 36, 36))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.gray));

        jButton1.setText("Empezar ");
        jButton1.setToolTipText("Clic para comenzar el examen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        jLabel6.setText("Para visualizar donde esta el error");

        jLabel3.setText("darle al boton empezar ");

        jLabel7.setText("para hacer un diagnostico");

        jLabel8.setText("para saber donde esta fallando");

        jButton2.setText("Salir");
        jButton2.setToolTipText("Clic para salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int u,d,t,e,w,s,z,x;
          
        u = JOptionPane.showConfirmDialog(rootPane,"??Presenta un error en la linea de tipo mecanica e electica?", null, YES_NO_OPTION);
                
        if(u == 0){
            linea_no_funciona();
        }
        else if(u == 1){
          d = JOptionPane.showConfirmDialog(rootPane, "??Presenta un error por tipo de incendio?", null, YES_NO_OPTION);  
            if(d == 0){
                incendio();
            }
            else if(d==1){
                t = JOptionPane.showConfirmDialog(rootPane, "??Presenta problemas de sobrecalentamiento?", null, YES_NO_OPTION);
                    if(t == 0){
                        sobrecalentamiento();
                    }
                    else if(t == 1){
                        JOptionPane.showMessageDialog(rootPane, "Presenta ninguno de los 3 fallos", null, YES_NO_OPTION);
                    }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void linea_no_funciona(){
      int u,d,t,c,ci,se;
      
      u = JOptionPane.showConfirmDialog(rootPane, "?? presenta error en la linea electica por sobre carga?", null, YES_NO_OPTION);
      d = JOptionPane.showConfirmDialog(rootPane, "?? presenta error en la linea electica por punto caliente?", null, YES_NO_OPTION);
      t = JOptionPane.showConfirmDialog(rootPane, "?? presenta error en la linea electica por bajo nivel de aceite?", null, YES_NO_OPTION);
      c = JOptionPane.showConfirmDialog(rootPane, "?? presenta error en la linea mecanica por falla en la cimentacion de la estrutura de la torre?", null, YES_NO_OPTION);
      ci = JOptionPane.showConfirmDialog(rootPane, "?? presenta error en la linea mecanica por rotura del conductor?", null, YES_NO_OPTION);
      se = JOptionPane.showConfirmDialog(rootPane, "?? presenta error en la linea mecanica por perforaciones del conductor?", null, YES_NO_OPTION);
      
      if((u==0) && (d==0) && (t==0) && (c==0) && (ci==0) && (se==0)){
           String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de diagnostico                   \n"
                     + "-    ingenieria de sistemas                         \n"
                     + "----------------------------------------------------\n"
                     + "-         DIAGNOSTICO                               \n"
                     + "----------------------------------------------------\n"
                     + "- El error de la maquina se presenta en             \n"
                     + "----------------------------------------------------";
           
           texto.setText(dg);
      }
      else{
          incendio();
      }
    }
    
    private void incendio(){
      int u,d,t,c,ci,se,si,oc ;  
      
      u = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema en la estructura por parte de una presion interna ?", null, YES_NO_OPTION);
      d = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema en la estructura por parte de una rotura de la cuba?", null, YES_NO_OPTION);
      t = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun error por parte de aceites y gases?", null, YES_NO_OPTION);
      c = JOptionPane.showConfirmDialog(rootPane, "?? presenta alguna falla de refrigeracion forzda por parte de etileno, etano y acetileno", null, YES_NO_OPTION);
      
      
      if((u==0) && (d==0) && (t==0) && (c==0)){
           String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de diagnostico                   \n"
                     + "-    ingenieria de sistemas                         \n"
                     + "----------------------------------------------------\n"
                     + "-         DIAGNOSTICO                               \n"
                     + "----------------------------------------------------\n"
                     + "-  No funciona el transformacdor\n"
                     + "----------------------------------------------------";
           
          texto.setText(dg);
      }
      else{
          sobrecalentamiento();
      }
    }
    
    private void sobrecalentamiento(){
       int u,d,t,c,ci,se;
       
       u = JOptionPane.showConfirmDialog(rootPane, "?? presenta alguna sobrecarga?", null, YES_NO_OPTION);
       d = JOptionPane.showConfirmDialog(rootPane, "?? presenta una falla de refrigeracion por parte de la electrica de los ventiladores?", null, YES_NO_OPTION);
       t = JOptionPane.showConfirmDialog(rootPane, "?? presenta una falla de refrigeracion por parte de alguna falla mecanica en los ventiladores?", null, YES_NO_OPTION);
       c = JOptionPane.showConfirmDialog(rootPane, "?? presenta un punto caliente por un desajuste en los puntos de conexion?", null, YES_NO_OPTION);
       ci = JOptionPane.showConfirmDialog(rootPane, "?? presenta bajos niveles de aceite por parte de los empaques deteriorados?", null, YES_NO_OPTION); 
       se = JOptionPane.showConfirmDialog(rootPane, "?? presenta bajos niveles de aceite por parte de impactos de vandalismo?", null, YES_NO_OPTION);
       
       if((u==0) && (d==0) && (t==0) && (c==0) && (ci==0) && (se==0)){
            String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de diagnostico                    \n"
                     + "-    ingenieria de sistemas                          \n"
                     + "-----------------------------------------------------\n"
                     + "-         DIAGNOSTICO                                \n"
                     + "-----------------------------------------------------\n"
                     + "- lo que  presenta es Sobre calentamiento       \n"
                     + "-----------------------------------------------------";
            
           texto.setText(dg); 
       }
       else{
           cambiar_tomas_carga_fallado();
       }
    }

  private void cambiar_tomas_carga_fallado(){
   int u,d,t;
   
   u = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun disparo por nivel aceito OLTC?", null, YES_NO_OPTION);
   d = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun disparo por sobrepresion de OLTC?", null, YES_NO_OPTION);
   t = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun disparo por presion subita OLTC?", null, YES_NO_OPTION);

       if((u==0) && (d==0) && (t==0) ){
            String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de diagnostico                    \n"
                     + "-    ingenieria de sistemas                          \n"
                     + "-----------------------------------------------------\n"
                     + "-         DIAGNOSTICO                                \n"
                     + "-----------------------------------------------------\n"
                     + "- lo que  presenta es cambiar las tomas         \n"
                     + "-----------------------------------------------------";
            
           texto.setText(dg); 
}
       else{
falla_a_tierra();
}     
}

private void falla_a_tierra(){
int u,d,t,c;
   
   u = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema en las bujes por algun punto caliente?", null, YES_NO_OPTION);
   d = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problrma en las bujes por disminucion de aislamiento inter del buje?", null, YES_NO_OPTION);
   t = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema en las bujes por deformacion por impactos vandalicos?", null, YES_NO_OPTION);
   c = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema en las bujes por deformacion por sobreajustes en maniobras de mantenimiento?", null, YES_NO_OPTION);
       if((u==0) && (d==0) && (t==0) && (c==0) ){
            String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de diagnostico                    \n"
                     + "-    ingenieria de sistemas                          \n"
                     + "-----------------------------------------------------\n"
                     + "-         DIAGNOSTICO                                \n"
                     + "-----------------------------------------------------\n"
                     + "- lo que  presenta es falla a tierra            \n"
                     + "-----------------------------------------------------";
           texto.setText(dg); 
}
else{
cambiar_tomas_sin_carga();
}     
}

private void cambiar_tomas_sin_carga(){
int u,d,t,c;
u = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema en el cambiador de tomas ?", null, YES_NO_OPTION);
   d = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema en la deformacion de cambiar las tomas por un desajuste en la operacion?", null, YES_NO_OPTION);
   t = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema por una fuga de aceite, por malos ajustes?", null, YES_NO_OPTION);
   c = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema en el punto caliente por dalsos contactos?", null, YES_NO_OPTION);
       if((u==0) && (d==0) && (t==0)){
            String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de diagnostico                    \n"
                     + "-    ingenieria de sistemas                          \n"
                     + "-----------------------------------------------------\n"
                     + "-         DIAGNOSTICO                                \n"
                     + "-----------------------------------------------------\n"
                     + "- lo que  presenta es cambiar las tomas sin carga\n"
                     + "-----------------------------------------------------";
           texto.setText(dg); 
}
else{
barraje();
}
}
private void barraje(){
int u,d;
u = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema electrico por sobrecalentamiento ?", null, YES_NO_OPTION);
   d = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema mecanico por sobrecarga?", null, YES_NO_OPTION);
   
   
       if((u==0) && (d==0)  ){
            String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de diagnostico                    \n"
                     + "-    ingenieria de sistemas                          \n"
                     + "-----------------------------------------------------\n"
                     + "-         DIAGNOSTICO                                \n"
                     + "-----------------------------------------------------\n"
                     + "- lo que  presenta es problema en barraje       \n"
                     + "-----------------------------------------------------";
           texto.setText(dg); 
}
else{
circuitos();
}
}

private void circuitos(){
int u,d,t;
   u = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema en la parte electrica por un corto circuito por sobretension?", null, YES_NO_OPTION);
   d = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema en la parte electrica por un sobrecalentamiento por sobrecarga?", null, YES_NO_OPTION);
   t = JOptionPane.showConfirmDialog(rootPane, "?? presenta algun problema por mecanica por una falla en la estructural?", null, YES_NO_OPTION);
  
       if((u==0) && (d==0) && (t==0)){
String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de diagnostico                    \n"
                     + "-    ingenieria de sistemas                          \n"
                     + "-----------------------------------------------------\n"
                     + "-         DIAGNOSTICO                                \n"
                     + "-----------------------------------------------------\n"
                     + "- lo que  presenta es problemas en circuitos    \n"
                     + "-----------------------------------------------------";
           texto.setText(dg); 
}
else{
linea_no_funciona();
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
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioSE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
