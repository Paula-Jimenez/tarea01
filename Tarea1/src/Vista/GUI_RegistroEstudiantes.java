/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author PaulaJCh
 */
public class GUI_RegistroEstudiantes extends javax.swing.JPanel {

    /**
     * Creates new form GUI_Botones
     */
    public GUI_RegistroEstudiantes() {
        initComponents();
        
    }
      public String[] devolverInformacion()
    {
        String arreglo[];
        arreglo=new String[2];
        arreglo[0]=this.jt_Carnet.getText();
        arreglo[1]=this.jt_Nombre.getText();
        
        return arreglo;
    }
      public String devolverCarnet()
      {
          return jt_Carnet.getText();
      }
      public void mostrarInformacion(String arreglo[])
      {
          this.jt_Carnet.setText(arreglo[0]);
          this.jt_Nombre.setText(arreglo[1]);
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Nombre = new javax.swing.JLabel();
        jl_Carnet = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jt_Carnet = new javax.swing.JTextField();

        jl_Nombre.setText("Nombre");

        jl_Carnet.setText("Carnet");

        jt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_NombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jl_Carnet)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jl_Nombre)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_Carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Carnet)
                    .addComponent(jt_Carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Nombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_NombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Carnet;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JTextField jt_Carnet;
    private javax.swing.JTextField jt_Nombre;
    // End of variables declaration//GEN-END:variables
}