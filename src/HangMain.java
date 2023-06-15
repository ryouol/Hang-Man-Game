
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class HangMain extends javax.swing.JFrame {

    ImageIcon hang = new ImageIcon ("hangg.gif");
    ImageIcon head = new ImageIcon ("circles.png");
    ImageIcon body = new ImageIcon ("body.png"); 
    ImageIcon Larm = new ImageIcon ("leftArm.png");
    ImageIcon Rarm = new ImageIcon ("rightArm.png");
    ImageIcon Lleg = new ImageIcon ("leftLeg.png");
    ImageIcon Rleg = new ImageIcon ("righLeg.png");

    

    
    
    int random = (int)(Math.random()*53);
    String key = WORDS[random];
    String guessedletters = "";
    int bodypartno = 0;
  
    
    
    
    ArrayList <String> Letters = new ArrayList ();
    ArrayList <ImageIcon> Icons = new ArrayList ();
   
    
    // Keywords
 public static final String[] WORDS = {
 "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", 
  "CASE", "CATCH", "BAR", "CLASS", "SELL",
  "CONTINUE", "DEFAULT", "DOUBLE", "DO", "ELSE", 
  "KILL", "EXTENDS", "FALSE", "FINAL", "FINALLY",
  "FLOAT", "FOR", "GOT", "IF", "IMPLEMENTS", 
  "IMPORT", "INSTANCE", "DILL", "INTERFACE", 
  "LONG", "NATIVE", "NEW", "NULL", "PACKAGE", 
  "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
  "SHORT", "STATIC", "STRICT", "SUPER", "SWITCH", 
  "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
  "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE"
 };
    
    public void set(String x){
        hangText.setText(x);
    }
    
    
    public HangMain() {
        ImageIcon imageIcon = new ImageIcon("hangg.gif");
        Image image = imageIcon.getImage(); 
        Image newimg = image.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH); 
        hang = new ImageIcon(newimg);  
           
        ImageIcon image11Icon = new ImageIcon("circles.png");
        Image image11 = image11Icon.getImage(); 
        Image newimg11 = image.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH); 
        head = new ImageIcon(newimg11);  
        
        ImageIcon image1Icon = new ImageIcon("body.png"); 
        Image image1 = image1Icon.getImage(); 
        Image newimg1 = image1.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH); 
        body = new ImageIcon(newimg1);  
        
        ImageIcon image2Icon = new ImageIcon("leftArm.png"); 
        Image image2 = image2Icon.getImage();
        Image new2img = image2.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH);  
        Larm = new ImageIcon(new2img); 
        
        ImageIcon image3Icon = new ImageIcon("rightArm.png"); 
        Image image3 = image3Icon.getImage(); 
        Image new3img = image3.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH);  
        Rarm = new ImageIcon(new3img);  
        
        ImageIcon image4Icon = new ImageIcon("leftLeg.png"); 
        Image image4 = image4Icon.getImage(); 
        Image new4img = image4.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH); 
        Lleg = new ImageIcon(new4img);  
        
        ImageIcon image5Icon = new ImageIcon("rightLeg.png"); 
        Image image5 = image5Icon.getImage(); 
        Image new5img = image5.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH); 
        Rleg = new ImageIcon(new5img); 
        

        
        initComponents();
        lH.setIcon(hang);
        Icons.add(head);
        Icons.add(body);
        Icons.add(Larm);
        Icons.add(Rarm);
        Icons.add(Rleg);
        Icons.add(Lleg);
    
     
        hangText.setText("enter a letter");
        
        ArrayList <ImageIcon> png = new ArrayList<ImageIcon>();
        png.add(head);
        png.add(body);
        png.add(Larm);
        png.add(Rarm);
        png.add(Rleg);
        png.add(Lleg);

        
        
        for(int i = 0; i < key.length(); i++){  
            Letters.add(key.substring(i,i+1));
        }
        
        int count = key.length();
        String lines="";
        for (int k=0;k<count; k++){
            lines = lines+"__ ";
        }
        
        System.out.println(key);
        
      
        
        System.out.println(key.length());
        
        String total="";
        String em = "";
        
        for (int k = 0; k < key.length(); k++){
            em= "__  ";
            total= total+em;
        }
        textKey.setText(total);
          
    }


    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        hangText = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lH = new javax.swing.JLabel();
        textKey = new javax.swing.JLabel();
        Circle = new javax.swing.JLabel();
        Leftarm = new javax.swing.JLabel();
        Body = new javax.swing.JLabel();
        Rightarm = new javax.swing.JLabel();
        Leftleg = new javax.swing.JLabel();
        Rightleg = new javax.swing.JLabel();
        Loose = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jRadioButton1.setText("jRadioButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hangText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hangTextActionPerformed(evt);
            }
        });

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Kohinoor Telugu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hang Man Game");

        Loose.setText("If you see a completly drawing of a stick man.... you lose");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(Leftarm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rightleg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(Circle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textKey, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hangText, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lH, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rightarm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Leftleg, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Loose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lH, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textKey, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hangText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rightleg, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Circle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Leftarm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Leftleg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Rightarm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Loose)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hangTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hangTextActionPerformed
    hangText.setText(" ");

        
    }//GEN-LAST:event_hangTextActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
    String letter = hangText.getText();
    System.out.println(letter);
    hangText.setText("");
    boolean exists = false;
    boolean letterexists = false;
    if(letter.equalsIgnoreCase(key)){
        System.out.println("winner");
        String total = "";
        String em;
        for (int k =0; k<key.length();k++){
            em = key.substring(k,k+1) + "   ";
        }
        textKey.setText(total);
    }
    else{
        String total = "";
        String em = "";
        for(int k=0; k<key.length();k++){
            letterexists = false;
            if(letter.equalsIgnoreCase(key.substring(k,k+1))){
                guessedletters=guessedletters+letter;
                System.out.println(guessedletters + " = guessed letters");
                exists = true;
            }
            for (int c = 0; c<guessedletters.length(); c++){
                if (guessedletters.substring(c,c+1).equalsIgnoreCase(key.substring(k,k+1))){
                    letterexists=true;
                }
            }
            if (letterexists==true)
                em = key.substring(k,k+1) + "   ";
            else
                em = "__  ";
            total = total+em;
        }
        textKey.setText(total);
if (exists==false){
    bodypartno++;
            lH.setIcon(Icons.get(bodypartno));
            
            System.out.println("wrong");
        }
        if (bodypartno>5){
            
            System.out.println("your guy dead");
        }
    
    }
    
  
    }//GEN-LAST:event_enterButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Body;
    private javax.swing.JLabel Circle;
    private javax.swing.JLabel Leftarm;
    private javax.swing.JLabel Leftleg;
    private javax.swing.JLabel Loose;
    private javax.swing.JLabel Rightarm;
    private javax.swing.JLabel Rightleg;
    private javax.swing.JButton enterButton;
    private javax.swing.JTextField hangText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lH;
    private javax.swing.JLabel textKey;
    // End of variables declaration//GEN-END:variables

   


}



