
package eew;

import java.sql.*;
import javax.swing.JOptionPane;
//import java.sql.Connection;
//import java.awt.*;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chamikara
 */
public class Student extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pstmt;
    String b;
    public JButton btn[]; 
    private int i;
    //right_button.addActionListener(this);
    //private JButton a[] = new JButton[4];
    /**
     * Creates new form Student
     */
    public Student() {
        super("Student");
        initComponents();
        conn=connector.ConnecrDb();
        
        
        
        /*for(int i=1;i<11;i++){
        btn[i].addActionListener((ActionListener) this);
        }*/
        /*for(i=0;i<11;i++){
            if(btn[i].getModel().isPressed()){
            
            }
        }*/
        //app();
    
    
    
        
        /*for(int i=0; i<btn.length; i++){
            add(a[i]);
        }*/
    
    }
   
/*public void actionPerformed(ActionEvent e){
// TODO Auto-generated method stub
try {
if(e.getSource()==item1){
System.out.println(“\n”);
System.out.println(“You have Clicked on JMenu item”);
System.out.println(“Put Your Menu Item Action Condition here”);
}
else if(e.getSource()==myButton){
System.out.println(“\n”);
System.out.println(“You have Clicked on Button item”);
System.out.println(“Put Your Button Action Condition here”);
}
}*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
         
      
    /**
     *
     * @return
     */
   /* public String app(){
        
        for(int i=1; i< btn.length; i++){
            btn[i] = new JButton();
                                                     
        try{
            String sql;
            sql = "select * from question";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                String a = rs.getString("question");
                quest.setText(a);
            }
            
        } catch (SQLException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(quest, ex);
        }
    } 
            
            //add(btn[i]);
        
        return null;
    }*/
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        quest = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setText("Back");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(950, 440, 140, 30);

        quest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quest.setForeground(new java.awt.Color(255, 255, 255));
        quest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(quest);
        quest.setBounds(210, 80, 890, 130);

        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setText("Question 1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(30, 80, 140, 31);

        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setText("Question 2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(30, 120, 140, 31);

        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setText("Question 3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);
        btn3.setBounds(30, 160, 140, 31);

        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setText("Question 4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);
        btn4.setBounds(30, 200, 140, 31);

        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5.setText("Question 5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);
        btn5.setBounds(30, 240, 140, 31);

        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn7.setText("Question 7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);
        btn7.setBounds(30, 320, 140, 31);

        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn8.setText("Question 8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);
        btn8.setBounds(30, 360, 140, 31);

        btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn9.setText("Question 9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);
        btn9.setBounds(30, 400, 140, 31);

        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn6.setText("Question 6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);
        btn6.setBounds(30, 280, 140, 31);

        btn10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn10.setText("Question 10");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel1.add(btn10);
        btn10.setBounds(30, 440, 140, 31);

        a1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel1.add(a1);
        a1.setBounds(250, 290, 390, 40);

        a2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        jPanel1.add(a2);
        a2.setBounds(700, 290, 390, 40);

        a3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        jPanel1.add(a3);
        a3.setBounds(250, 370, 390, 40);

        a4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        jPanel1.add(a4);
        a4.setBounds(700, 370, 390, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Exercise:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 14, 120, 40);

        exname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(exname);
        exname.setBounds(220, 10, 870, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("B");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(670, 300, 16, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("C");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 370, 20, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("A");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 290, 34, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("D");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(670, 370, 18, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\EEW\\Images\\adminpage.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        try{
            String sql;
            String value = exname.getText().toString();
            sql = "select Question,A1,A2,A3,A4 from question where que_no='10' AND Ex_Name='"+value+"'";
            if(sql != null ){
            i=10;
            }
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            //pstmt.setString(1,btn2.getText());

            while(rs.next()){
                String a = rs.getString("Question");
                quest.setText(a);
                String c1 = rs.getString("A1");
                a1.setText(c1);
                String c2 = rs.getString("A2");
                a2.setText(c2);
                String c3 = rs.getString("A3");
                a3.setText(c3);
                String c4 = rs.getString("A4");
                a4.setText(c4);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(quest, ex);
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        try{
            String sql;
            String value = exname.getText().toString();
            sql = "select Question,A1,A2,A3,A4 from question where que_no='9' AND Ex_Name='"+value+"'";
            if(sql != null ){
            i=9;
            }
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            //pstmt.setString(1,btn2.getText());

            while(rs.next()){
                String a = rs.getString("Question");
                quest.setText(a);
                String c1 = rs.getString("A1");
                a1.setText(c1);
                String c2 = rs.getString("A2");
                a2.setText(c2);
                String c3 = rs.getString("A3");
                a3.setText(c3);
                String c4 = rs.getString("A4");
                a4.setText(c4);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(quest, ex);
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        try{
            String sql;
            String value = exname.getText().toString();
            sql = "select Question,A1,A2,A3,A4 from question where que_no='8' AND Ex_Name='"+value+"'";
            if(sql != null ){
            i=8;
            }
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            //pstmt.setString(1,btn2.getText());

            while(rs.next()){
                String a = rs.getString("Question");
                quest.setText(a);
                String c1 = rs.getString("A1");
                a1.setText(c1);
                String c2 = rs.getString("A2");
                a2.setText(c2);
                String c3 = rs.getString("A3");
                a3.setText(c3);
                String c4 = rs.getString("A4");
                a4.setText(c4);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(quest, ex);
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        try{
            String sql;
            String value = exname.getText().toString();
            sql = "select Question,A1,A2,A3,A4 from question where que_no='7' AND Ex_Name='"+value+"'";
            if(sql != null ){
            i=7;
            }
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            //pstmt.setString(1,btn2.getText());

            while(rs.next()){
                String a = rs.getString("Question");
                quest.setText(a);
                String c1 = rs.getString("A1");
                a1.setText(c1);
                String c2 = rs.getString("A2");
                a2.setText(c2);
                String c3 = rs.getString("A3");
                a3.setText(c3);
                String c4 = rs.getString("A4");
                a4.setText(c4);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(quest, ex);
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        try{
            String sql;
            String value = exname.getText().toString();
            sql = "select Question,A1,A2,A3,A4 from question where que_no='6' AND Ex_Name='"+value+"'";
            if(sql != null ){
            i=6;
            }
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            //pstmt.setString(1,btn2.getText());

            while(rs.next()){
                String a = rs.getString("Question");
                quest.setText(a);
                String c1 = rs.getString("A1");
                a1.setText(c1);
                String c2 = rs.getString("A2");
                a2.setText(c2);
                String c3 = rs.getString("A3");
                a3.setText(c3);
                String c4 = rs.getString("A4");
                a4.setText(c4);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(quest, ex);
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        try{
            String sql;
            String value = exname.getText().toString();
            sql = "select Question,A1,A2,A3,A4 from question where que_no='5' AND Ex_Name='"+value+"'";
            if(sql != null ){
            i=5;
            }
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            //pstmt.setString(1,btn2.getText());s

            while(rs.next()){
                String a = rs.getString("Question");
                quest.setText(a);
                String c1 = rs.getString("A1");
                a1.setText(c1);
                String c2 = rs.getString("A2");
                a2.setText(c2);
                String c3 = rs.getString("A3");
                a3.setText(c3);
                String c4 = rs.getString("A4");
                a4.setText(c4);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(quest, ex);
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        try{
            String sql;
            String value = exname.getText().toString();
            sql = "select Question,A1,A2,A3,A4 from question where que_no='4' AND Ex_Name='"+value+"'";
            if(sql != null ){
            i=4;
            }
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            //pstmt.setString(1,btn2.getText());

            while(rs.next()){
                String a = rs.getString("Question");
                quest.setText(a);
                String c1 = rs.getString("A1");
                a1.setText(c1);
                String c2 = rs.getString("A2");
                a2.setText(c2);
                String c3 = rs.getString("A3");
                a3.setText(c3);
                String c4 = rs.getString("A4");
                a4.setText(c4);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(quest, ex);
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        try{
            String sql;
            String value = exname.getText().toString();
            sql = "select Question,A1,A2,A3,A4 from question where que_no='3' AND Ex_Name='"+value+"'";
            if(sql != null ){
            i=3;
            }
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            //pstmt.setString(1,btn2.getText());

            while(rs.next()){
                String a = rs.getString("Question");
                quest.setText(a);
                String c1 = rs.getString("A1");
                a1.setText(c1);
                String c2 = rs.getString("A2");
                a2.setText(c2);
                String c3 = rs.getString("A3");
                a3.setText(c3);
                String c4 = rs.getString("A4");
                a4.setText(c4);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(quest, ex);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        try{
            String sql;
            String value = exname.getText().toString();
            sql = "select Question,A1,A2,A3,A4 from question where que_no='2' AND Ex_Name='"+value+"'";
            if(sql != null ){
            i=2;
            }
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            //pstmt.setString(1,btn2.getText());

            while(rs.next()){
                String a = rs.getString("Question");
                quest.setText(a);
                String c1 = rs.getString("A1");
                a1.setText(c1);
                String c2 = rs.getString("A2");
                a2.setText(c2);
                String c3 = rs.getString("A3");
                a3.setText(c3);
                String c4 = rs.getString("A4");
                a4.setText(c4);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(quest, ex);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
        try{
                       
            String sql;
            String value = exname.getText().toString();
            sql = "select Question,A1,A2,A3,A4 from question where Que_No='1' AND Ex_Name='"+value+"'";
            if(sql != null ){
            i=1;
            }
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                String a = rs.getString("Question");
                quest.setText(a);
                String c1 = rs.getString("A1");
                a1.setText(c1);
                String c2 = rs.getString("A2");
                a2.setText(c2);
                String c3 = rs.getString("A3");
                a3.setText(c3);
                String c4 = rs.getString("A4");
                a4.setText(c4);
            }
        } catch (Exception e) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        try{
            String sql = null;
            String pk = exname.getText().toString();
            switch (i) {
                case 1:
                    sql = "select correct_answer from question where Que_NO='1' and Ex_Name='"+pk+"' ";
                    break;
                case 2:
                    sql = "select correct_answer from question where Que_NO='2' and Ex_Name='"+pk+"' ";
                    break;
                case 3:
                    sql = "select correct_answer from question where Que_NO='3' and Ex_Name='"+pk+"' ";
                    break;
                case 4:
                    sql = "select correct_answer from question where Que_NO='4' and Ex_Name='"+pk+"' ";
                    break;
                case 5:
                    sql = "select correct_answer from question where Que_NO='5' and Ex_Name='"+pk+"' ";
                    break;
                case 6:
                    sql = "select correct_answer from question where Que_NO='6' and Ex_Name='"+pk+"' ";
                    break;
                case 7:
                    sql = "select correct_answer from question where Que_NO='7' and Ex_Name='"+pk+"' ";
                    break;
                case 8:
                    sql = "select correct_answer from question where Que_NO='8' and Ex_Name='"+pk+"' ";
                    break;
                case 9:
                    sql = "select correct_answer from question where Que_NO='9' and Ex_Name='"+pk+"' ";
                    break;
                case 10:
                    sql = "select correct_answer from question where Que_NO='10' and Ex_Name='"+pk+"' ";
                    break;
                default:
                    break;
            }
            //pstmt.setString(1,exname.getText());
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                String c1 = "D";
                //a3.setText(c1);
                String c2 = rs.getString("correct_Answer");
                if( c2.equals(c1)){
                    JOptionPane.showMessageDialog(null, "Correct");
                }else{
                    JOptionPane.showMessageDialog(null, "Wrong");
                }
            }
        } catch (Exception e) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_a4ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        try{
            String sql = null;
            String pk = exname.getText().toString();
            switch (i) {
                case 1:
                    sql = "select correct_answer from question where Que_NO='1' and Ex_Name='"+pk+"' ";
                    break;
                case 2:
                    sql = "select correct_answer from question where Que_NO='2' and Ex_Name='"+pk+"' ";
                    break;
                case 3:
                    sql = "select correct_answer from question where Que_NO='3' and Ex_Name='"+pk+"' ";
                    break;
                case 4:
                    sql = "select correct_answer from question where Que_NO='4' and Ex_Name='"+pk+"' ";
                    break;
                case 5:
                    sql = "select correct_answer from question where Que_NO='5' and Ex_Name='"+pk+"' ";
                    break;
                case 6:
                    sql = "select correct_answer from question where Que_NO='6' and Ex_Name='"+pk+"' ";
                    break;
                case 7:
                    sql = "select correct_answer from question where Que_NO='7' and Ex_Name='"+pk+"' ";
                    break;
                case 8:
                    sql = "select correct_answer from question where Que_NO='8' and Ex_Name='"+pk+"' ";
                    break;
                case 9:
                    sql = "select correct_answer from question where Que_NO='9' and Ex_Name='"+pk+"' ";
                    break;
                case 10:
                    sql = "select correct_answer from question where Que_NO='10' and Ex_Name='"+pk+"' ";
                    break;
                default:
                    break;
            }
            //pstmt.setString(1,exname.getText());
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                String c1 = "C";
                //a3.setText(c1);
                String c2 = rs.getString("correct_Answer");
                if( c2.equals(c1)){
                    JOptionPane.showMessageDialog(null, "Correct");
                }else{
                    JOptionPane.showMessageDialog(null, "Wrong");
                }
            }
        } catch (Exception e) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_a3ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        try{
            String sql = null;
            String pk = exname.getText().toString();
            switch (i) {
                case 1:
                    sql = "select correct_answer from question where Que_NO='1' and Ex_Name='"+pk+"' ";
                    break;
                case 2:
                    sql = "select correct_answer from question where Que_NO='2' and Ex_Name='"+pk+"' ";
                    break;
                case 3:
                    sql = "select correct_answer from question where Que_NO='3' and Ex_Name='"+pk+"' ";
                    break;
                case 4:
                    sql = "select correct_answer from question where Que_NO='4' and Ex_Name='"+pk+"' ";
                    break;
                case 5:
                    sql = "select correct_answer from question where Que_NO='5' and Ex_Name='"+pk+"' ";
                    break;
                case 6:
                    sql = "select correct_answer from question where Que_NO='6' and Ex_Name='"+pk+"' ";
                    break;
                case 7:
                    sql = "select correct_answer from question where Que_NO='7' and Ex_Name='"+pk+"' ";
                    break;
                case 8:
                    sql = "select correct_answer from question where Que_NO='8' and Ex_Name='"+pk+"' ";
                    break;
                case 9:
                    sql = "select correct_answer from question where Que_NO='9' and Ex_Name='"+pk+"' ";
                    break;
                case 10:
                    sql = "select correct_answer from question where Que_NO='10' and Ex_Name='"+pk+"' ";
                    break;
                default:
                    break;
            }
            //pstmt.setString(1,exname.getText());
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                String c1 = "B";
                //a3.setText(c1);
                String c2 = rs.getString("correct_Answer");
                if( c2.equals(c1)){
                    JOptionPane.showMessageDialog(null, "Correct");
                }else{
                    JOptionPane.showMessageDialog(null, "Wrong");
                }
            }
        } catch (Exception e) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_a2ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        
        try{
            String sql = null;
            String pk = exname.getText().toString();
            switch (i) {
                case 1:
                    sql = "select correct_answer from question where Que_NO='1' and Ex_Name='"+pk+"' ";
                    break;
                case 2:
                    sql = "select correct_answer from question where Que_NO='2' and Ex_Name='"+pk+"' ";
                    break;
                case 3:
                    sql = "select correct_answer from question where Que_NO='3' and Ex_Name='"+pk+"' ";
                    break;
                case 4:
                    sql = "select correct_answer from question where Que_NO='4' and Ex_Name='"+pk+"' ";
                    break;
                case 5:
                    sql = "select correct_answer from question where Que_NO='5' and Ex_Name='"+pk+"' ";
                    break;
                case 6:
                    sql = "select correct_answer from question where Que_NO='6' and Ex_Name='"+pk+"' ";
                    break;
                case 7:
                    sql = "select correct_answer from question where Que_NO='7' and Ex_Name='"+pk+"' ";
                    break;
                case 8:
                    sql = "select correct_answer from question where Que_NO='8' and Ex_Name='"+pk+"' ";
                    break;
                case 9:
                    sql = "select correct_answer from question where Que_NO='9' and Ex_Name='"+pk+"' ";
                    break;
                case 10:
                    sql = "select correct_answer from question where Que_NO='10' and Ex_Name='"+pk+"' ";
                    break;
                default:
                    break;
            }
            //pstmt.setString(1,exname.getText());
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                String c1 = "A";
                //a3.setText(c1);
                String c2 = rs.getString("correct_Answer");
                if( c2.equals(c1)){
                    JOptionPane.showMessageDialog(null, "Correct");
                }else{
                    JOptionPane.showMessageDialog(null, "Wrong");
                }
            }
        } catch (Exception e) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_a1ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
        HomePage p = new HomePage();
        p.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed
/*/**/
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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                   
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
            });
          
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton cancel;
    public static javax.swing.JLabel exname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel quest;
    // End of variables declaration//GEN-END:variables
}
