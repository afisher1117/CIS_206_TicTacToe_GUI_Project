/******************************************************************************
Filename: TicTacToe_.java
Author: Adam Fisher
Email: 0070342@student.vvc.edu
Description:
******************************************************************************/
package TicTacToe;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TicTacToe_ extends javax.swing.JFrame {
    
    private String whoseTurn = "X";
    private String playerOne = "";
    private String playerTwo = "";
    private int xCounter = 0;
    private int oCounter = 0;
    
    public TicTacToe_() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(this);
        getNames();
    }
    
    private void getNames(){
        playerOne = JOptionPane.showInputDialog(this,
                "Player One Enter Your Name: ",
                "Player One",
                JOptionPane.INFORMATION_MESSAGE);
        playerTwo = JOptionPane.showInputDialog(this,
                "Player Two Enter Your Name: ",
                "Player Two",
                JOptionPane.INFORMATION_MESSAGE);
        if(playerOne.equals("")){
            playerOne = "Player One";
        }
        
        if(playerTwo.equals("")){
            playerTwo = "Player Two";
        }
    }
    
    private void whoseTurnIsIt(){
        
        if(whoseTurn.equalsIgnoreCase("X")){
            whoseTurn = "O";
        }
        else{
            whoseTurn = "X";
        }
    }
    
    private void colorSwitch(String whoseTurn, JButton a){
        switch(whoseTurn){
            case "X":
                a.setForeground(Color.red);
                break;
            case "O":
                a.setForeground(Color.blue);
                break;
        }
    }
    
    private void xWins(){
        xCounter++;
        ImageIcon X = new ImageIcon(this.getClass().getResource("X.png"));
        JOptionPane.showMessageDialog(this, 
                    scoreCounter(xCounter, oCounter), 
                    "" + this.playerOne + " is the winner!",
                    JOptionPane.INFORMATION_MESSAGE, X);
        resetGame();        
    }
    
    private void oWins(){
        oCounter++;
        ImageIcon O = new ImageIcon(this.getClass().getResource("O.png"));
        JOptionPane.showMessageDialog(this, 
                    scoreCounter(xCounter, oCounter), 
                    "" + this.playerTwo + " is the winner!",
                    JOptionPane.INFORMATION_MESSAGE, O);
        resetGame();
    }
    
    private void resetGame(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        whoseTurn = "X";
    }
    
    private String scoreCounter(int xCounter, int oCounter){
        return "" + this.playerOne + " score: " + xCounter + 
               "\n" + this.playerTwo + " score: " + oCounter;
    }
    
    private void isDraw(){
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        if(one != "" && two != "" && three != "" && four != ""
                && five != "" && six != "" && seven != "" && eight != ""
                && nine != ""){
            ImageIcon Draw = new ImageIcon(this.getClass().getResource("Draw.png"));
            JOptionPane.showMessageDialog(this,
                    "",
                    "ITS A DRAW", 
                    JOptionPane.INFORMATION_MESSAGE, Draw);
            resetGame();
        }
    }
    
    private void whoWon(){
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
                
        if(one == "X" && two == "X" && three == "X"){ //Row 1 win
            xWins();
        }
        else if(four == "X" && five == "X" && six == "X"){ //Row 2 win
            xWins();
        }
        else if(seven == "X" && eight == "X" && nine == "X"){ //Row 3 win
            xWins();
        }
        else if(one == "X" && four == "X" && seven == "X"){ //Column 1 win
            xWins();
        }
        else if(two == "X" && five == "X" && eight == "X"){ //Column 2 win
            xWins();
        }
        else if(three == "X" && six == "X" && nine == "X"){ //Column 3 win
            xWins();
        }
        else if(one == "X" && five == "X" && nine == "X"){ //L to R diagonal win
            xWins();
        }
        else if(three == "X" && five == "X" && seven == "X"){ //R to L diagonal win
            xWins();
        }
                
        if(one == "O" && two == "O" && three == "O"){ //Row 1 win
            oWins();
        }
        else if(four == "O" && five == "O" && six == "O"){ //Row 2 win
            oWins();
        }
        else if(seven == "O" && eight == "O" && nine == "O"){ //Row 3 win
            oWins();
        }
        else if(one == "O" && four == "O" && seven == "O"){ //Column 1 win
            oWins();
        }
        else if(two == "O" && five == "O" && eight == "O"){ //Column 2 win
            oWins();
        }
        else if(three == "O" && six == "O" && nine == "O"){ //Column 3 win
            oWins();
        }
        else if(one == "O" && five == "O" && nine == "O"){ //L to R diagonal win
            oWins();
        }
        else if(three == "O" && five == "O" && seven == "O"){ //R to L diagonal win
            oWins();
        }        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gridHolder = new javax.swing.JPanel();
        topLeft = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        topMid = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        topRight = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        midLeft = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        midMiddle = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        midRight = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        botLeft = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        botMiddle = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        botRight = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        gridHolder.setBackground(new java.awt.Color(204, 204, 204));
        gridHolder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        topLeft.setBackground(new java.awt.Color(255, 255, 255));
        topLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        topLeft.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        topLeft.add(jButton1, java.awt.BorderLayout.CENTER);

        gridHolder.add(topLeft);

        topMid.setBackground(new java.awt.Color(255, 255, 255));
        topMid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        topMid.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        topMid.add(jButton2, java.awt.BorderLayout.CENTER);

        gridHolder.add(topMid);

        topRight.setBackground(new java.awt.Color(255, 255, 255));
        topRight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        topRight.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        topRight.add(jButton3, java.awt.BorderLayout.CENTER);

        gridHolder.add(topRight);

        midLeft.setBackground(new java.awt.Color(255, 255, 255));
        midLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        midLeft.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        midLeft.add(jButton4, java.awt.BorderLayout.CENTER);

        gridHolder.add(midLeft);

        midMiddle.setBackground(new java.awt.Color(255, 255, 255));
        midMiddle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        midMiddle.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        midMiddle.add(jButton5, java.awt.BorderLayout.CENTER);

        gridHolder.add(midMiddle);

        midRight.setBackground(new java.awt.Color(255, 255, 255));
        midRight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        midRight.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        midRight.add(jButton6, java.awt.BorderLayout.CENTER);

        gridHolder.add(midRight);

        botLeft.setBackground(new java.awt.Color(255, 255, 255));
        botLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botLeft.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        botLeft.add(jButton7, java.awt.BorderLayout.CENTER);

        gridHolder.add(botLeft);

        botMiddle.setBackground(new java.awt.Color(255, 255, 255));
        botMiddle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botMiddle.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        botMiddle.add(jButton8, java.awt.BorderLayout.CENTER);

        gridHolder.add(botMiddle);

        botRight.setBackground(new java.awt.Color(255, 255, 255));
        botRight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botRight.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        botRight.add(jButton9, java.awt.BorderLayout.CENTER);

        gridHolder.add(botRight);

        jPanel1.add(gridHolder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton1.setText(whoseTurn);
        colorSwitch(whoseTurn, jButton1);
        whoseTurnIsIt();
        whoWon();
        isDraw();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton2.setText(whoseTurn);
        colorSwitch(whoseTurn, jButton2);
        whoseTurnIsIt();
        whoWon();
        isDraw();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton3.setText(whoseTurn);
        colorSwitch(whoseTurn, jButton3);
        whoseTurnIsIt();
        whoWon();
        isDraw();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton4.setText(whoseTurn);
        colorSwitch(whoseTurn, jButton4);
        whoseTurnIsIt();
        whoWon();
        isDraw();
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton5.setText(whoseTurn);
        colorSwitch(whoseTurn, jButton5);
        whoseTurnIsIt();
        whoWon();
        isDraw();
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton6.setText(whoseTurn);
        colorSwitch(whoseTurn, jButton6);
        whoseTurnIsIt();
        whoWon();
        isDraw();
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton7.setText(whoseTurn);
        colorSwitch(whoseTurn, jButton7);
        whoseTurnIsIt();
        whoWon();
        isDraw();
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton8.setText(whoseTurn);
        colorSwitch(whoseTurn, jButton8);
        whoseTurnIsIt();
        whoWon();
        isDraw();
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton9.setText(whoseTurn);
        colorSwitch(whoseTurn, jButton9);
        whoseTurnIsIt();
        whoWon();
        isDraw();
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }    
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel botLeft;
    private javax.swing.JPanel botMiddle;
    private javax.swing.JPanel botRight;
    private javax.swing.JPanel gridHolder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel midLeft;
    private javax.swing.JPanel midMiddle;
    private javax.swing.JPanel midRight;
    private javax.swing.JPanel topLeft;
    private javax.swing.JPanel topMid;
    private javax.swing.JPanel topRight;
    // End of variables declaration                   
}
