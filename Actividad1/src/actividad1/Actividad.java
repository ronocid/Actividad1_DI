package actividad1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Actividad extends javax.swing.JFrame {
    private ArrayList <String> elementos;
    
    public void initElementos(){//leo un ficher con el que relleno un arraylist que contendra los datos de la lista y el combo
        elementos=new ArrayList<>();
        File fichero=new File ("elementos.txt");
        if(fichero.exists()){
            BufferedReader br=null;
            try{
                br=new BufferedReader(new FileReader(fichero));
                String s;
                while((s=br.readLine())!=null){
                    elementos.add(s);
                }
            }catch(Exception e){
                System.out.println("Error");
            }finally{
                if(br!=null){
                    try{
                        br.close();
                    }catch(Exception e){
                        System.out.println("Error");
                    }
                }
            }
        }
    }

    public Actividad() {
        initComponents();
        this.borrar.setText("Borrar");//Mofifico el texto de los botones añadir y borrar
        this.anadir.setText("Añadir");
        initElementos();//inicializo el arrayList que contienen los datos de la lista y el combo llamando al metodo que que lo crea
        this.lista.setModel(new ModeloLista(elementos));//modifico el modelo por defecto de la lista por el modelo propio y le paso el arrayList con los datos a mostrar
        this.combo.setModel(new ModeloCombo(elementos));//modifico el modelo por defecto del combo por el modelo propio y le paso el arrayList con los datos a mostrar
        this.combo.setSelectedIndex(0);//le indico que valor debe tener el combo al iniciarse
        
        this.combo.addActionListener(new ActionListener(){//creo un evento en el combo que el elemento seleccionado se muestre en el textfield
            public void actionPerformed(ActionEvent e) {
                elemento.setText((String)combo.getSelectedItem());
            }
        });
        
        this.borrar.addActionListener(new ActionListener(){//creo la accion del boton de borrar que llama al metodo del modelo con el dato que se encuentra en el textfield
            public void actionPerformed(ActionEvent e) {
                ((ModeloLista)lista.getModel()).removeElement((Object)elemento.getText());//se debe castear el modelo al modelo que estamos utilizando, si no en vez de añadir elementos añadimos componentes
                //((ModeloCombo)combo.getModel()).removeElement((Object)elemento.getText());
            }
        });
        
        this.anadir.addActionListener(new ActionListener(){//creo la accion del boton de añadir que llama al metodo del modelo con el dato que se encuentra en el textfield
            public void actionPerformed(ActionEvent e) {
              ((ModeloLista)lista.getModel()).addElement((Object)elemento.getText());//se debe castear el modelo al modelo que estamos utilizando, si no en vez de añadir elementos añadimos componentes
              //((ModeloCombo)combo.getModel()).addElement((Object)elemento.getText());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo = new javax.swing.JComboBox();
        elemento = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        anadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        borrar.setText("jButton2");

        anadir.setText("jButton1");

        lista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo, 0, 217, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(anadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrar))
                    .addComponent(elemento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(198, Short.MAX_VALUE)
                        .addComponent(elemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(borrar)
                            .addComponent(anadir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );

        combo.getAccessibleContext().setAccessibleName("combo");
        elemento.getAccessibleContext().setAccessibleName("elemento");
        borrar.getAccessibleContext().setAccessibleName("borrar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividad().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadir;
    private javax.swing.JButton borrar;
    private javax.swing.JComboBox combo;
    private javax.swing.JTextField elemento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista;
    // End of variables declaration//GEN-END:variables
}
