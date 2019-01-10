package url.converter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class DBConnection extends javax.swing.JFrame {

    public Connection conn = null;
    public Connection getConn(){
        
       try {
           Class.forName("org.postgresql.Driver");
     } catch (ClassNotFoundException classNotFoundException){
           JOptionPane.showMessageDialog(null, classNotFoundException);
       }
           try {
               String url = "jdbc:postgresql://localhost:5432/postgres";
               String user = "postgres";
               String password = "12345";
               
               conn = DriverManager.getConnection(url, user, password);
             JOptionPane.showMessageDialog(null, "Connected");
           } catch (SQLException ex) {
               Logger.getLogger(Extractor.class.getName()).log(Level.SEVERE, null, ex);
           }
            return conn;
   }
    public DBConnection() {
                getConn();
    }
        public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new DBConnection().setVisible(false);
            }
        });
    }                
}