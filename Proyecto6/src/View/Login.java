package View;

import Controller.LoginChecker;
import Model.User;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JPanel {

    private static Login loginPane = new Login();
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    public static Login getPane() {
        return loginPane;
    }
    
    public static void init() {
        loginPane.user.grabFocus();
        
        // Credenciales para comprobar el programa
        loginPane.user.setText("51600278");
        loginPane.pw.setText("7wSSt0v");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        user = new javax.swing.JFormattedTextField();
        pw = new javax.swing.JPasswordField();

        title.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        title.setText("DaviiExpress");

        login.setBackground(new java.awt.Color(96, 224, 164));
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("Log in");
        login.setNextFocusableComponent(exit);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });

        exit.setText("Exit");
        exit.setNextFocusableComponent(user);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exitKeyPressed(evt);
            }
        });

        user.setText("user");
        user.setFocusCycleRoot(true);
        user.setNextFocusableComponent(pw);
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
        });

        pw.setText("password");
        pw.setToolTipText("");
        pw.setNextFocusableComponent(login);
        pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(title)
                .addContainerGap(379, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(login))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(pw))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(title)
                .addGap(71, 71, 71)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Event Listeners">
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // Cierra el programa
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        logIn();
    }//GEN-LAST:event_loginMouseClicked

    private void pwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyPressed
        // Si se presiona intro en el campo de la contraseña se intenta iniciar sesión
        if (evt.getKeyChar() == '\n') {
            logIn();
        }
    }//GEN-LAST:event_pwKeyPressed

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
        // Comodidad: selecciona todo el texto cuando se selecciona el elemento
        this.user.selectAll();
    }//GEN-LAST:event_userFocusGained

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
        // Si se presiona intro al tener seleccionado el botón "login" se inicia sesión.
        if (evt.getKeyChar() == '\n') {
            logIn();
        }
    }//GEN-LAST:event_loginKeyPressed

    private void exitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitKeyPressed
        if (evt.getKeyChar() == '\n') {
            System.exit(0);
        }
    }//GEN-LAST:event_exitKeyPressed
    
    private void logIn() {
        // Realiza una comprobación de inicio de sesión.
        User usr = LoginChecker.login(user.getText(), pw.getPassword());
        if (user.getText().equals("admin") && String.valueOf(pw.getPassword()).equals("admin")) {
            (MainFrame.getMainFrame()).changePanel(MainFrame.getProfilePanel());
            MainFrame.changeUserAccess(true);
            MainFrame.setAdmin(true);
        }
        else if (usr != null) {
            (MainFrame.getMainFrame()).changePanel(MainFrame.getProfilePanel());
            MainFrame.changeUserAccess(true);
            MainFrame.setAdmin(false);
            MainFrame.setUser(usr);
        }
        else {
            JOptionPane.showMessageDialog(MainFrame.getMainFrame(), "Wrong credentials\nPlease try again.");
        }
        
        if (MainFrame.getUserAccess()) {
            this.user.setText("user");
            this.pw.setText("password");
            Profile.init();
        }
    }
// </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pw;
    private javax.swing.JLabel title;
    private javax.swing.JFormattedTextField user;
    // End of variables declaration//GEN-END:variables
}