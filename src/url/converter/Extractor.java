package url.converter;

import org.jsoup.Jsoup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class Extractor extends javax.swing.JFrame {
public Connection conn = null;
public Connection conn1 = null;
public Connection conn2 = null;
public Connection conn3 = null;
public Connection conn4 = null;

public Connection getConn(){
     try {
           Class.forName("org.postgresql.Driver");
      }catch (ClassNotFoundException classNotFoundException){
           JOptionPane.showMessageDialog(null, classNotFoundException);
       }
           try {
               String url = "jdbc:postgresql://localhost:5432/postgres";
               String user = "postgres";
               String password = "12345";
               conn = DriverManager.getConnection(url, user, password);
           } catch (SQLException ex) {
               Logger.getLogger(Extractor.class.getName()).log(Level.SEVERE, null, ex);
        }
         return conn;
    }
 public Extractor() {
        initComponents();
        getConn();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ten10 = new javax.swing.JTextField();
        nine9 = new javax.swing.JTextField();
        eight8 = new javax.swing.JTextField();
        seven7 = new javax.swing.JTextField();
        six6 = new javax.swing.JTextField();
        five5 = new javax.swing.JTextField();
        four4 = new javax.swing.JTextField();
        three3 = new javax.swing.JTextField();
        two2 = new javax.swing.JTextField();
        one1 = new javax.swing.JTextField();
        eleven11 = new javax.swing.JTextField();
        twelve12 = new javax.swing.JTextField();
        thirteen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        fourteen = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        T1 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        urlinserted = new javax.swing.JTextField();
        OK_Button = new javax.swing.JButton();
        CLEAR_Button = new javax.swing.JButton();
        URL = new javax.swing.JLabel();

        two2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two2ActionPerformed(evt);
            }
        });

        one1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane7.setViewportView(jTextArea7);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        urlinserted.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        OK_Button.setText("OK");
        OK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_ButtonActionPerformed(evt);
            }
        });

        CLEAR_Button.setText("CLEAR");
        CLEAR_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEAR_ButtonActionPerformed(evt);
            }
        });

        URL.setText("URL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(233, 233, 233)
                            .addComponent(URL))
                        .addComponent(urlinserted, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(OK_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CLEAR_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(urlinserted, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(URL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK_Button)
                    .addComponent(CLEAR_Button))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
//          org.jsoup.nodes.Document doc = Jsoup.connect("https://wc.e.com.ph/V4search.asp?msgtype=view&mbox=111142&docfile=ORDERS_WBD01_1498992_17134669.xmlviewed8-15-2018-9h28m").get();
            String text = urlinserted.getText();
        try{
            String unit = "", qty = "", barcode = "", desc = "", uprice = "", amt = "";
            String s = "";
            org.jsoup.nodes.Document doc = Jsoup.connect(text).get();
            org.jsoup.select.Elements rows = doc.select("tr");
            for (org.jsoup.nodes.Element row : rows) {
            org.jsoup.select.Elements columns = row.select("td");
                int l = 1;
                for (org.jsoup.nodes.Element column : columns){
                    s += column.text();
                    if(columns.size() != l){
                        s+= ":_:";
                    }
                    l++;
                }
                s+="\n";
                l = 1;
            }
            String s1[] = s.split("\n");         
            String s4a23[] = s1[1].split(":_:"); 
            String output4 = "";
            String s4na23[] = s4a23[1].split(" ");
            String first4 = s4na23[0];
            String second4 = s4na23[1];
            String third4 =  s4na23[2];
            output4 = first4 + " " + second4 + " " + third4;
//          System.out.println(output4);
            
            String s2[] = s.split("\n");
//          System.out.println("" +  s2[2]);
            
            String s2a1[] = s2[3].split(":_:");
            String s2na1[] = s2a1[0].split(" ");
//          System.out.println(s2na1[3]);
            
            String s2a[] = s2[3].split(":_:");
            String s2na[] = s2a[1].split(" ");
//          System.out.println(s2na[1]);
            
            String s4a[] = s2[4].split(":_:");
            String s4na[] = s4a[0].split(" ");
//          System.out.println(s4na[2]);
            
            String s4a1[] = s2[4].split(":_:");
            String s4na1[] = s4a1[0].split(" ");
//          System.out.println(s4na1[6]);
            
            String s4a232[] = s2[8].split(":_:"); 
            String output42 = "";
            String s4na232[] = s4a232[0].split(" ");
            String first42 = s4na232[1];
            String second42 = s4na232[2];
            String third42 =  s4na232[3];
            String fourth42 =  s4na232[4];
            String five42 =  s4na232[5];
            output42 = first42 + " " + second42 + " " + third42 + " " + fourth42 + " " + five42;
//          System.out.println(output42);
            
            String s4a2[] = s2[10].split(":_:"); 
            String output = "";
            String s4na2[] = s4a2[0].split(" ");
            String first1 = s4na2[2];
            String second = s4na2[3];
            String third =  s4na2[4];
            String fourth = s4na2[5];
            String five =  s4na2[6];
            output = first1 + " " + second + " " + third + " " + fourth + " " + five;
//          System.out.println(output);
            
            String s4a9[] = s2[12].split(":_:");
            String s4na9[] = s4a9[0].split(" ");
//          System.out.println(s4na9[1]);
            
            String s4a4[] = s2[12].split(":_:");
//          System.out.println(s4a4[2]);
            
            String s4a44[] = s2[0].split(":_:");
            System.out.println(s4a44[0]);
            
            int blnFindTotal = 0;
            int blnServices = 0;
            int POSTOTAL = 0;
            
            for(int k=0; k < s1.length; k++){
               if(s1[k].contains("Nothing Follows")){
                   blnFindTotal = k;
               }
                if(s1[k].contains("following articles")){
                   blnServices = k;
               }
               if(s1[k].contains("TOTAL P")){
                   POSTOTAL = k;
               }
             }           
             for(int k=  blnServices + 2; k < blnFindTotal - 1; k++){
               String article[] = s1[k].split(":_:");
               for(int h=0; h< article.length; h++){
                   if(h == 0){
                       String first = article[h];
                       String arrFirst[] = first.split(" ");
                       for(int a=0; a< arrFirst.length; a++){
                           if(a == 0){
                               qty = arrFirst[a];
                           }
                           if(a == 1){
                               unit = arrFirst[a];
                           }
                       }
                   }
                   if(h == 1){
                       barcode = article[h];
                   }
                   if(h == 2){
                       desc = article[h];
                   }
                   if(h == 3){
                       uprice = article[h];
                   }
                   if(h == 4){
                       amt = article[h];
                   }
               }
             String text1 = jTextArea1.getText();
             fourteen.setText(text1);
             jTextArea1.append("qty:" + qty + "  unit: " + unit + "  barcode: " + barcode + "  desc: " + desc + " uprice: " + uprice + "  amount: " + amt);
           
             
             ////////////////////////////////////////////
             String text2 = jTextArea2.getText();
             T1.setText(text2);
             jTextArea2.append(qty + "\n" + "\n" + "\n" + "\n" + " ");
             
             String text3 = jTextArea3.getText();
             T2.setText(text3);
             jTextArea3.append(unit + "\n" + "\n" + "\n" + "\n" + " ");
             
             String text4 = jTextArea4.getText();
             T3.setText(text4);
             jTextArea4.append(barcode + "\n" + "\n" + "\n" + "\n" + " ");
             
             String text5 = jTextArea5.getText();
             T4.setText(text5);
             jTextArea5.append(desc + "\n" + "\n" + "\n" + "\n" + " ");
             
             String text6 = jTextArea6.getText();
             T5.setText(text6);
             jTextArea6.append(uprice + "\n" + "\n" + "\n" + "\n" + " ");
             
             String text7 = jTextArea7.getText();
             T6.setText(text7);
             jTextArea7.append(amt + "\n" + "\n" + "\n" + "\n" + " ");
          ///////////////////////////////////////////////////////
             
             
           }
            int blnFindTotal1 = 0;
            int blnServices22 = 0;
            for(int k=0; k < s1.length; k++){
               if(s1[k].contains("Nothing Follows")){
                   blnFindTotal1 = k;
               }
                if(s1[k].contains("following articles")){
                   blnServices22 = k;
               }
            }
            String s01[] = s.split("\n");       
            System.out.println("" +  s01[0]);
            String total="";
            String s28[] = s01[POSTOTAL].split(":_:");    
                       for(int a=0; a< s28.length; a++){  
                           if(a == 3){
                               total = s28[a];
                           }
                       }
            String s25[] = s.split("\n");
//          System.out.println(""+s25[25]);
            
            String tab[] = s.split("\n");
            System.out.println("" +  tab[0]);               
//          System.out.println("total  " + total);
            
            one1.setText(output4);
            two2.setText("" +  s2[2]);
            three3.setText(s2na1[3]);
            four4.setText(s2na[1]);
            five5.setText(s4na[2]);
            six6.setText(s4na1[6]);
            seven7.setText(output42);
            eight8.setText(output);
            nine9.setText(s4na9[1]);
            ten10.setText(s4a4[2]);
            eleven11.setText(""+s25[25]);
            twelve12.setText(total);   
            thirteen.setText(s);
            
    try{  
        String sqlQuery = "INSERT INTO report1(Quantity, unit, barcode, description, uprice, amount) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sqlQuery);
        pst.setString(1, T1.getText());
        pst.setString(2, T2.getText());
        pst.setString(3, T3.getText());
        pst.setString(4, T4.getText());
        pst.setString(5, T5.getText());
        pst.setString(6, T6.getText());
        pst.executeUpdate();
    }catch (Exception e){
  }      

    try{    
        String sqlQuery = "INSERT INTO report(one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sqlQuery);
        pst.setString(1, one1.getText());
        pst.setString(2, two2.getText());
        pst.setString(3, three3.getText());
        pst.setString(4, four4.getText());
        pst.setString(5, five5.getText());
        pst.setString(6, six6.getText());
        pst.setString(7, seven7.getText());
        pst.setString(8, eight8.getText());
        pst.setString(9, nine9.getText());
        pst.setString(10, ten10.getText());
        pst.setString(11, eleven11.getText());
        pst.setString(12, twelve12.getText());
        pst.setString(13, fourteen.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Saved");
        urlinserted.setText("");
        }catch (SQLException SQLException){
     }  
            }catch(Exception e){
            e.printStackTrace();
        }
    }                                         

    private void one1ActionPerformed(java.awt.event.ActionEvent evt) {                                     

    }                                    

    private void two2ActionPerformed(java.awt.event.ActionEvent evt) {                                     

    }                                    

    private void CLEAR_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        urlinserted.setText("");
    }                                            
        public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new Extractor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton CLEAR_Button;
    private javax.swing.JButton OK_Button;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JLabel URL;
    private javax.swing.JTextField eight8;
    private javax.swing.JTextField eleven11;
    private javax.swing.JTextField five5;
    private javax.swing.JTextField four4;
    private javax.swing.JTextField fourteen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextField nine9;
    private javax.swing.JTextField one1;
    private javax.swing.JTextField seven7;
    private javax.swing.JTextField six6;
    private javax.swing.JTextField ten10;
    private javax.swing.JTextField thirteen;
    private javax.swing.JTextField three3;
    private javax.swing.JTextField twelve12;
    private javax.swing.JTextField two2;
    private javax.swing.JTextField urlinserted;
    // End of variables declaration                   
}