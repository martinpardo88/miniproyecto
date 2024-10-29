/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproyectofinal;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author martin
 */
public class BuscarFrame extends javax.swing.JFrame {

    
    private PRINCIPAL principal;
    
    
    
    public BuscarFrame(PRINCIPAL principal) {
        initComponents();
        this.principal = principal;
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campobuscarnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        camponumerobuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botonbuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuitembuscar_buscar = new javax.swing.JMenuItem();
        menuitemsalir_buscar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese el nombre del contacto que quiere buscar");

        jLabel2.setText("Ingrese el el numero del contacto que quiere buscar");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        botonbuscar.setText("Buscar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        jMenu1.setText("Ayuda");

        menuitembuscar_buscar.setText("Buscar");
        menuitembuscar_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitembuscar_buscarActionPerformed(evt);
            }
        });
        jMenu1.add(menuitembuscar_buscar);

        menuitemsalir_buscar.setText("Salir");
        menuitemsalir_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemsalir_buscarActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemsalir_buscar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campobuscarnombre)
                            .addComponent(camponumerobuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
                .addGap(97, 97, 97)
                .addComponent(botonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campobuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(camponumerobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botonbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 //////////////////////////////////////////////////////////////////////////////////////////// PARA QUE EL BOON BUSCAR SIRVA Y EL MENUBAR IGUAL//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
    
    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        
        String nombreBuscar = campobuscarnombre.getText();
        String numeroBuscar = camponumerobuscar.getText();

        DefaultTableModel model = principal.getTablaContenidoModel();

    
            if (model == null || model.getRowCount() == 0) {
                jTextArea1.setText("No hay contactos en la tabla.");
                
                return; 
            }

            
            
        boolean encontrado = false;

   
        jTextArea1.setText("");

    
            for (int i = 0; i < model.getRowCount(); i++) {
                String nombre = (String) model.getValueAt(i, 0); 
                String telefono = (String) model.getValueAt(i, 3);

       
            if ((nombre != null && nombre.equalsIgnoreCase(nombreBuscar)) ||
                (telefono != null && telefono.equals(numeroBuscar))) {
            
                String apellido = (String) model.getValueAt(i, 1);
                String correo = (String) model.getValueAt(i, 2);
                String direccion = (String) model.getValueAt(i, 4);
                String estadoCivil = (String) model.getValueAt(i, 5);

           
        jTextArea1.setText("Nombre: " + (nombre != null ? nombre : "") + "\n"
            + "Apellido: " + (apellido != null ? apellido : "") + "\n"
            + "Correo: " + (correo != null ? correo : "") + "\n"
            + "Teléfono: " + (telefono != null ? telefono : "") + "\n"
            + "Dirección: " + (direccion != null ? direccion : "") + "\n"
            + "Estado Civil: " + (estadoCivil != null ? estadoCivil : ""));
           
            encontrado = true;
                break;
                }
            
            
        }

            
            
            
            if (!encontrado) {
                jTextArea1.setText("este contacto no existe.");
                }
        
        
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void menuitembuscar_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitembuscar_buscarActionPerformed
    
        String nombreBuscar = campobuscarnombre.getText();
        String numeroBuscar = camponumerobuscar.getText();

        DefaultTableModel model = principal.getTablaContenidoModel();

    
            if (model == null || model.getRowCount() == 0) {
                jTextArea1.setText("No hay contactos en la tabla.");
                
                return; 
            }

            
            
        boolean encontrado = false;

   
        jTextArea1.setText("");

    
            for (int i = 0; i < model.getRowCount(); i++) {
                String nombre = (String) model.getValueAt(i, 0); 
                String telefono = (String) model.getValueAt(i, 3);

       
            if ((nombre != null && nombre.equalsIgnoreCase(nombreBuscar)) ||
                (telefono != null && telefono.equals(numeroBuscar))) {
            
                String apellido = (String) model.getValueAt(i, 1);
                String correo = (String) model.getValueAt(i, 2);
                String direccion = (String) model.getValueAt(i, 4);
                String estadoCivil = (String) model.getValueAt(i, 5);

           
        jTextArea1.setText("Nombre: " + (nombre != null ? nombre : "") + "\n"
            + "Apellido: " + (apellido != null ? apellido : "") + "\n"
            + "Correo: " + (correo != null ? correo : "") + "\n"
            + "Teléfono: " + (telefono != null ? telefono : "") + "\n"
            + "Dirección: " + (direccion != null ? direccion : "") + "\n"
            + "Estado Civil: " + (estadoCivil != null ? estadoCivil : ""));
           
            encontrado = true;
                break;
                }
            
            
        }

            
            
            
            if (!encontrado) {
                jTextArea1.setText("este contacto no existe.");
                }    
        
      
        
        
    }//GEN-LAST:event_menuitembuscar_buscarActionPerformed

    
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    private void menuitemsalir_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemsalir_buscarActionPerformed
       
         dispose();
          
    }//GEN-LAST:event_menuitemsalir_buscarActionPerformed

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(BuscarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new BuscarFrame(new PRINCIPAL()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscar;
    private javax.swing.JTextField campobuscarnombre;
    private javax.swing.JTextField camponumerobuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem menuitembuscar_buscar;
    private javax.swing.JMenuItem menuitemsalir_buscar;
    // End of variables declaration//GEN-END:variables
}
