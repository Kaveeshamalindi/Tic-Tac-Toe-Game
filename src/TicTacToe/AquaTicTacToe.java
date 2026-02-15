/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class AquaTicTacToe extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AquaTicTacToe.class.getName());

    /**
     * Creates new form CandyTicTacToe
     */
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    boolean winner = false;
    
    public AquaTicTacToe() {
        initComponents();
    }
    
    private void gameScore(){
        lblPlayerX.setText(String.valueOf(xCount));
        lblPlayer0.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player(){
        if (startGame.equalsIgnoreCase("X")){
            startGame = "0";
        }else {
            {
            startGame = "X";
        }
        }
    }
    
    private void winningGame(){
        String b1 = btnTic1.getText();
        String b2 = btnTic2.getText();
        String b3 = btnTic3.getText();
        String b4 = btnTic4.getText();
        String b5 = btnTic5.getText();
        String b6 = btnTic6.getText();
        String b7 = btnTic7.getText();
        String b8 = btnTic8.getText();
        String b9 = btnTic9.getText();
        
        //-------------- X WINNING -------------------------------
        
        if ( b1 == ("X") && b2 == ("X") && b3 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.CYAN);
            btnTic2.setBackground(Color.CYAN);
            btnTic3.setBackground(Color.CYAN);
            xCount++;
            winner = true;
            if (xCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player X is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b4 == ("X") && b5 == ("X") && b6 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic4.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic6.setBackground(Color.CYAN);
            xCount++;
            winner = true;
            if (xCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player X is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b7 == ("X") && b8 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic7.setBackground(Color.CYAN);
            btnTic8.setBackground(Color.CYAN);
            btnTic9.setBackground(Color.CYAN);
            xCount++;
            winner = true;
            if (xCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player X is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b1 == ("X") && b4 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.CYAN);
            btnTic4.setBackground(Color.CYAN);
            btnTic7.setBackground(Color.CYAN);
            xCount++;
            winner = true;
            if (xCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player X is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b2 == ("X") && b5 == ("X") && b8 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic2.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic8.setBackground(Color.CYAN);
            xCount++;
            winner = true;
            if (xCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player X is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b3 == ("X") && b6 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic3.setBackground(Color.CYAN);
            btnTic6.setBackground(Color.CYAN);
            btnTic9.setBackground(Color.CYAN);
            xCount++;
            winner = true;
            if (xCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player X is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b1 == ("X") && b5 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic9.setBackground(Color.CYAN);
            xCount++;
            winner = true;
            if (xCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player X is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b3 == ("X") && b5 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic3.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic7.setBackground(Color.CYAN);
            xCount++;
            winner = true;
            if (xCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player X is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        //-------------- Y WINNING -------------------------------
        
        if ( b1 == ("0") && b2 == ("0") && b3 == ("0")){
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.CYAN);
            btnTic2.setBackground(Color.CYAN);
            btnTic3.setBackground(Color.CYAN);
            oCount++;
            winner = true;
            if (oCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player 0 is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b4 == ("0") && b5 == ("0") && b6 == ("0")){
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic4.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic6.setBackground(Color.CYAN);
            oCount++;
            winner = true;
            if (oCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player 0 is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b7 == ("0") && b8 == ("0") && b9 == ("0")){
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic7.setBackground(Color.CYAN);
            btnTic8.setBackground(Color.CYAN);
            btnTic9.setBackground(Color.CYAN);
            oCount++;
            winner = true;
            if (oCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player 0 is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            }
            gameScore();
        }
        
        if ( b1 == ("0") && b4 == ("0") && b7 == ("0")){
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.CYAN);
            btnTic4.setBackground(Color.CYAN);
            btnTic7.setBackground(Color.CYAN);
            oCount++;
            winner = true;
            if (oCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player 0 is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b2 == ("0") && b5 == ("0") && b8 == ("0")){
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic2.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic8.setBackground(Color.CYAN);
            oCount++;
            winner = true;
            if (oCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player 0 is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            } 
            gameScore();
        }
        
        if ( b3 == ("0") && b6 == ("0") && b9 == ("0")){
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic3.setBackground(Color.CYAN);
            btnTic6.setBackground(Color.CYAN);
            btnTic9.setBackground(Color.CYAN);
            oCount++;
            winner = true;
            if (oCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player 0 is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b1 == ("0") && b5 == ("0") && b9 == ("0")){
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic9.setBackground(Color.CYAN);
            oCount++;
            winner = true;
            if (oCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player 0 is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if ( b3 == ("0") && b5 == ("0") && b7 == ("0")){
            JOptionPane.showMessageDialog(this, "Player 0 win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btnTic3.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic7.setBackground(Color.CYAN);
            oCount++;
            winner = true;
            if (oCount>=3){
                JOptionPane.showMessageDialog(this, "<html><b> GAME OVER !!! </html></b> \n <html><b> Player 0 is a Champion </html>", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                btnReset.setEnabled(false);
            } 
            gameScore();
        }
        
        if (!winner && !b1.equals("") && !b2.equals("") && !b3.equals("") && !b4.equals("") && !b5.equals("") && !b6.equals("") && !b7.equals("") && !b8.equals("") && !b9.equals("")) {
            // If no winner, then it's a draw
            JOptionPane.showMessageDialog(this, "Game Draw! No Winner.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
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
        jPanel3 = new javax.swing.JPanel();
        btnTic3 = new javax.swing.JButton();
        btnTic1 = new javax.swing.JButton();
        btnTic2 = new javax.swing.JButton();
        btnTic4 = new javax.swing.JButton();
        btnTic5 = new javax.swing.JButton();
        btnTic6 = new javax.swing.JButton();
        btnTic7 = new javax.swing.JButton();
        btnTic8 = new javax.swing.JButton();
        btnTic9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPlayerX = new javax.swing.JLabel();
        lblPlayer0 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Toc Toe");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTic3.setBackground(new java.awt.Color(204, 255, 255));
        btnTic3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, 120));

        btnTic1.setBackground(new java.awt.Color(204, 255, 255));
        btnTic1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 120));

        btnTic2.setBackground(new java.awt.Color(204, 255, 255));
        btnTic2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 120));

        btnTic4.setBackground(new java.awt.Color(204, 255, 255));
        btnTic4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, 120));

        btnTic5.setBackground(new java.awt.Color(204, 255, 255));
        btnTic5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 120, 120));

        btnTic6.setBackground(new java.awt.Color(204, 255, 255));
        btnTic6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic6ActionPerformed(evt);
            }
        });
        jPanel3.add(btnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 120, 120));

        btnTic7.setBackground(new java.awt.Color(204, 255, 255));
        btnTic7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic7ActionPerformed(evt);
            }
        });
        jPanel3.add(btnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 120, 120));

        btnTic8.setBackground(new java.awt.Color(204, 255, 255));
        btnTic8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic8ActionPerformed(evt);
            }
        });
        jPanel3.add(btnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 120, 120));

        btnTic9.setBackground(new java.awt.Color(204, 255, 255));
        btnTic9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic9ActionPerformed(evt);
            }
        });
        jPanel3.add(btnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 120, 120));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 550, 460));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Player 0 :");

        lblPlayerX.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPlayerX.setForeground(new java.awt.Color(0, 0, 204));
        lblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerX.setText("0");
        lblPlayerX.setOpaque(true);

        lblPlayer0.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPlayer0.setForeground(new java.awt.Color(0, 0, 204));
        lblPlayer0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer0.setText("0");
        lblPlayer0.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Player X :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(lblPlayer0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPlayer0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 450, 180));

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnReset.setBackground(new java.awt.Color(204, 255, 255));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 102, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(204, 255, 255));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 102, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnNewGame.setBackground(new java.awt.Color(204, 255, 255));
        btnNewGame.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNewGame.setForeground(new java.awt.Color(0, 102, 255));
        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 450, 160));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 530, 460));

        jPanel7.setBackground(new java.awt.Color(204, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Tic Tac Toe");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 280, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X 0 X 0 X 0 X 0");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 350, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X 0 X 0 X 0 X 0");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 350, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1120, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic3ActionPerformed
        btnTic3.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic3ActionPerformed

    private void btnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic6ActionPerformed
        btnTic6.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic6ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // Reset Button
        
        btnTic1.setEnabled(true);
        btnTic2.setEnabled(true);
        btnTic3.setEnabled(true);
        btnTic4.setEnabled(true);
        btnTic5.setEnabled(true);
        btnTic6.setEnabled(true);
        btnTic7.setEnabled(true);
        btnTic8.setEnabled(true);
        btnTic9.setEnabled(true); 
        
        btnTic1.setText("");
        btnTic2.setText("");
        btnTic3.setText("");
        btnTic4.setText("");
        btnTic5.setText("");
        btnTic6.setText("");
        btnTic7.setText("");
        btnTic8.setText("");
        btnTic9.setText("");
        
        btnTic1.setBackground(Color.WHITE);
        btnTic2.setBackground(Color.WHITE);
        btnTic3.setBackground(Color.WHITE);
        btnTic4.setBackground(Color.WHITE);
        btnTic5.setBackground(Color.WHITE);
        btnTic6.setBackground(Color.WHITE);
        btnTic7.setBackground(Color.WHITE);
        btnTic8.setBackground(Color.WHITE);
        btnTic9.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic9ActionPerformed
        btnTic9.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic9ActionPerformed

    private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, " <html><b> Confirm if you want to Exit </b></html>", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            //System.exit(0);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        // New Game Button
        btnReset.setEnabled(true);

        xCount = 0;
        oCount = 0;
        
        btnTic1.setEnabled(true);
        btnTic2.setEnabled(true);
        btnTic3.setEnabled(true);
        btnTic4.setEnabled(true);
        btnTic5.setEnabled(true);
        btnTic6.setEnabled(true);
        btnTic7.setEnabled(true);
        btnTic8.setEnabled(true);
        btnTic9.setEnabled(true); 
        
        lblPlayerX.setText("0");
        lblPlayer0.setText("0");
        
        btnTic1.setText("");
        btnTic2.setText("");
        btnTic3.setText("");
        btnTic4.setText("");
        btnTic5.setText("");
        btnTic6.setText("");
        btnTic7.setText("");
        btnTic8.setText("");
        btnTic9.setText("");
        
        btnTic1.setBackground(Color.WHITE);
        btnTic2.setBackground(Color.WHITE);
        btnTic3.setBackground(Color.WHITE);
        btnTic4.setBackground(Color.WHITE);
        btnTic5.setBackground(Color.WHITE);
        btnTic6.setBackground(Color.WHITE);
        btnTic7.setBackground(Color.WHITE);
        btnTic8.setBackground(Color.WHITE);
        btnTic9.setBackground(Color.WHITE);     
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void btnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic1ActionPerformed
        btnTic1.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic1ActionPerformed

    private void btnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic2ActionPerformed
        btnTic2.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic2ActionPerformed

    private void btnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic4ActionPerformed
        btnTic4.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic4ActionPerformed

    private void btnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic5ActionPerformed
        btnTic5.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic5ActionPerformed

    private void btnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic7ActionPerformed
        btnTic7.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic7ActionPerformed

    private void btnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic8ActionPerformed
        btnTic8.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic8ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new AquaTicTacToe().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTic1;
    private javax.swing.JButton btnTic2;
    private javax.swing.JButton btnTic3;
    private javax.swing.JButton btnTic4;
    private javax.swing.JButton btnTic5;
    private javax.swing.JButton btnTic6;
    private javax.swing.JButton btnTic7;
    private javax.swing.JButton btnTic8;
    private javax.swing.JButton btnTic9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblPlayer0;
    private javax.swing.JLabel lblPlayerX;
    // End of variables declaration//GEN-END:variables
}
