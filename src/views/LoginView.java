package views;

import controllers.LoginController;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import models.Employees;
import models.EmployeesDao;

public class LoginView extends javax.swing.JFrame {

    //Instanciamos la clase Empleados
    Employees employee = new Employees();
    //Instanciamos a la clase EmployeesDao
    EmployeesDao employee_dao = new EmployeesDao();

    public LoginView() {
        initComponents();
        //Llamar al controlador del login
        LoginController employee_login = new LoginController(employee, employee_dao, this);
        //Asignar medidas desde el código
        setSize(985, 515);
        //Evitar que el usuario modifique las dimensiones de la interfaz
        setResizable(false);
        //Título de la interfaz
        setTitle("Ingresar al sistema");
        //Centrar interfaz en la pantalla
        setLocationRelativeTo(null);
        //Colocar imagen de fondo

        //Colocar imagen de fondo
        ImageIcon wallpaper = new ImageIcon("src/image/wallpaper.jpg");
        //Adaptar imagen de fondo al tamaño del JLabel Wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(Wallpaper.getWidth(), Wallpaper.getHeight(),
                Image.SCALE_DEFAULT));
        //Colocar la imagen escalable en el JLabel_Wallpaper
        Wallpaper.setIcon(icono);
        //Para que se noten los cambios
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Wallpaper = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_enter = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 340, 250));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contraseña:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 114, -1, -1));

        txt_username.setToolTipText("");
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 58, 210, 35));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 111, 210, 35));

        btn_enter.setText("Ingresar");
        jPanel1.add(btn_enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 164, 210, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 61, 67, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 480, 250));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INICIAR SESIÓN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    public javax.swing.JButton btn_enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField txt_password;
    public javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
