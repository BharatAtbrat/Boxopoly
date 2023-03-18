
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/*
 * 
 */
/**
 *
 * @author Bharat
 */
public class Mainwindow extends javax.swing.JFrame {

    int i = 60, cou = 0, a = 0, tcount = 0, tt = 0, icou = 0;
    static int dollar1 = 500;
    static int dollar2 = 500;
    int cost1, cost2, bonus1, bonus2, re1, re1to, re2, re2to;
    static int p1score, p2score;
    static int seconds = 30;
    static int sec1 = 3;
    static int milseconds = 0;
    static int round = 0; //0 matlab started 1 matlab end
    static boolean state = true;
    static boolean state1 = true;
    String n1, n2;
    Clip c, c1;

    /**
     * Creates new form Mainwindow
     */
    public Mainwindow() {
        initComponents();
        this.setLocationRelativeTo(null);

        // Roundscores(p1score,p2score);   //
    }

    public Mainwindow(int a) {

    }

    public void Scoredp1() {

        if (round == 1) {
            dollar1 += re1to;
            Err2.setText("");
            p11.setText(" | " + n1 + " | ");
            //  p1live.setBorder(new LineBorder(Color.white, 3));
            p1live.setText("Money > " + " " + dollar1
                    + "  Points >" + " " + p1score);
            bonus1 = 0;
            re1 = 0;
            re1to = 0;
            //System.out.println("Money : "+dollar1+" Points : "+p1score);}

        }
    }

    public void Scoredp2() {
        if (round == 1) {
            dollar2 += re2to;
            Err1.setText("");
            p1.setVisible(true);
            instlabl.setVisible(false);
            p12.setText(" | " + n2 + " | ");
            //p2live.setBorder(new LineBorder(Color.white, 3));
            p2live.setText("Money > " + " " + dollar2
                    + "  Points >  " + p2score);
            bonus2 = 0;
            re2 = 0;
            re2to = 0;
            //System.out.println("Money2 : "+dollar2+" Points2 : "+p2score);}}
        }
    }

    public void Roundscores(int p1, int p2) {
        //System.out.println("ayo check this out");
        Err2.setText("<html>After round scores : Money > " + dollar1 +
                " Score > " + p1);
        Err1.setText("<html>After round scores : <br><br>Money > " + dollar2 + 
                "<html><br>Score > " + p2);
    }

    public void resgame() {

        seconds = 60;
        dollar1 = 500;
        // bonus1 = 0;
        dollar2 = 500;
        // bonus2 = 0;
        //  re1 = 0;
        //  re2 = 0;
        lsec.setVisible(true);
        lsec.setText(".");
        wait.setVisible(false);
    }

    public void reswindow() {
        block.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                + "NetBeansProjects\\"
                + "Boxopoly\\src\\Images\\building\\bid.gif"));
        ll1.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                + "NetBeansProjects\\Boxopoly\\src\\Images\\Windows\\"
                + "1leftoff.png"));
        ll2.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                + "NetBeansProjects\\Boxopoly\\src\\Images\\Windows\\"
                + "2leftoff.png"));
        ll3.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\3leftoff.png"));
        ll4.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\4leftoff.png"));
        ll5.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\5leftoff.png"));
        ll6.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\6leftoff.png"));
        ll7.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\7leftoff.png"));
        ll8.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\8leftoff.png"));

        lr1.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\1rightoff.png"));
        lr2.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\2rightoff.png"));
        lr3.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\3rightoff.png"));
        lr4.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\4rightoff.png"));
        lr5.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\5rightoff.png"));
        lr6.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\6rightoff.png"));
        lr7.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\7rightoff.png"));
        lr8.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                + "\\Boxopoly\\src\\Images\\Windows\\8rightoff.png"));
        bonus1 = 0;
        bonus2 = 0;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bb2 = new javax.swing.JButton();
        theend = new javax.swing.JLabel();
        theend.setVisible(false);
        block = new javax.swing.JLabel();
        block.setVisible(false);
        log = new javax.swing.JLabel();
        log.setVisible(false);
        scl = new javax.swing.JLabel();
        p11 = new javax.swing.JLabel();
        Err2 = new javax.swing.JLabel();
        Err1 = new javax.swing.JLabel();
        p1live = new javax.swing.JLabel();
        bb1 = new javax.swing.JButton();
        inst = new javax.swing.JButton();
        p1 = new javax.swing.JPanel();
        p2live = new javax.swing.JLabel();
        instlabl = new javax.swing.JLabel();
        p12 = new javax.swing.JLabel();
        wait = new javax.swing.JLabel();
        lsec = new javax.swing.JLabel();
        lr8 = new javax.swing.JLabel();
        lr7 = new javax.swing.JLabel();
        lr6 = new javax.swing.JLabel();
        lr5 = new javax.swing.JLabel();
        lr4 = new javax.swing.JLabel();
        lr3 = new javax.swing.JLabel();
        lr2 = new javax.swing.JLabel();
        lr1 = new javax.swing.JLabel();
        ll8 = new javax.swing.JLabel();
        ll7 = new javax.swing.JLabel();
        ll6 = new javax.swing.JLabel();
        ll5 = new javax.swing.JLabel();
        ll4 = new javax.swing.JLabel();
        ll3 = new javax.swing.JLabel();
        ll2 = new javax.swing.JLabel();
        ll1 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 800));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bb2.setBackground(new java.awt.Color(255, 255, 255));
        bb2.setFont(new java.awt.Font("UA Squared", 0, 14)); // NOI18N
        bb2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\building\\start.png")); // NOI18N
        bb2.setText("Exit");
        bb2.setBorderPainted(false);
        bb2.setContentAreaFilled(false);
        bb2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb2ActionPerformed(evt);
            }
        });
        getContentPane().add(bb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 750, 80, 30));

        theend.setBackground(new java.awt.Color(0, 0, 0));
        theend.setFont(new java.awt.Font("UA Squared", 1, 24)); // NOI18N
        theend.setForeground(new java.awt.Color(255, 255, 255));
        theend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(theend, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        block.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(block, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 200, 800));

        log.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\building\\logo1.png")); // NOI18N
        log.setText("jLabel1");
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 245, 81));

        scl.setFont(new java.awt.Font("UA Squared", 0, 16)); // NOI18N
        scl.setForeground(new java.awt.Color(255, 255, 255));
        scl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(scl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 140, 540));

        p11.setBackground(new java.awt.Color(0, 0, 0));
        p11.setFont(new java.awt.Font("UA Squared", 1, 18)); // NOI18N
        p11.setForeground(new java.awt.Color(255, 255, 255));
        p11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p11.setOpaque(true);
        getContentPane().add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 220, 30));

        Err2.setFont(new java.awt.Font("UA Squared", 0, 16)); // NOI18N
        Err2.setForeground(new java.awt.Color(255, 255, 255));
        Err2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Err2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, 170, 70));

        Err1.setBackground(new java.awt.Color(0, 0, 0));
        Err1.setFont(new java.awt.Font("UA Squared", 0, 16)); // NOI18N
        Err1.setForeground(new java.awt.Color(255, 255, 255));
        Err1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Err1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 620, 170, 70));

        p1live.setFont(new java.awt.Font("UA Squared", 1, 16)); // NOI18N
        p1live.setForeground(new java.awt.Color(255, 255, 255));
        p1live.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1live.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(p1live, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 220, 40));

        bb1.setBackground(new java.awt.Color(255, 255, 255));
        bb1.setFont(new java.awt.Font("UA Squared", 0, 14)); // NOI18N
        bb1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\building\\start.png")); // NOI18N
        bb1.setText("Start");
        bb1.setBorderPainted(false);
        bb1.setContentAreaFilled(false);
        bb1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb1ActionPerformed(evt);
            }
        });
        getContentPane().add(bb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 670, 80, 30));

        inst.setFont(new java.awt.Font("UA Squared", 0, 14)); // NOI18N
        inst.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\building\\inst.png")); // NOI18N
        inst.setText("Instructions");
        inst.setBorderPainted(false);
        inst.setContentAreaFilled(false);
        inst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instActionPerformed(evt);
            }
        });
        getContentPane().add(inst, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 710, 120, 30));

        p1.setBackground(new java.awt.Color(0, 0, 0));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p2live.setFont(new java.awt.Font("UA Squared", 1, 16)); // NOI18N
        p2live.setForeground(new java.awt.Color(255, 255, 255));
        p2live.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2live.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p1.add(p2live, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 40));

        instlabl.setFont(new java.awt.Font("UA Squared", 0, 13)); // NOI18N
        instlabl.setForeground(new java.awt.Color(255, 255, 255));
        instlabl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p1.add(instlabl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 280));

        p12.setFont(new java.awt.Font("UA Squared", 1, 18)); // NOI18N
        p12.setForeground(new java.awt.Color(255, 255, 255));
        p12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 30));

        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 240, 300));
        p1.setVisible(false);

        wait.setBackground(new java.awt.Color(0, 0, 0));
        wait.setFont(new java.awt.Font("UA Squared", 0, 14)); // NOI18N
        wait.setForeground(new java.awt.Color(255, 255, 255));
        wait.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(wait, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 140, 50));

        lsec.setBackground(new java.awt.Color(255, 255, 255));
        lsec.setFont(new java.awt.Font("UA Squared", 0, 20)); // NOI18N
        lsec.setForeground(new java.awt.Color(255, 255, 255));
        lsec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lsec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 140, 50));

        lr8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\8rightoff.png")); // NOI18N
        lr8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lr8MouseClicked(evt);
            }
        });
        getContentPane().add(lr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 80, 60));

        lr7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\7rightoff.png")); // NOI18N
        lr7.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\7righton.png")); // NOI18N
        lr7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lr7MouseClicked(evt);
            }
        });
        getContentPane().add(lr7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 80, 70));

        lr6.setBackground(new java.awt.Color(0, 0, 0));
        lr6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\6rightoff.png")); // NOI18N
        lr6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lr6MouseClicked(evt);
            }
        });
        getContentPane().add(lr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 80, 80));

        lr5.setBackground(new java.awt.Color(0, 0, 0));
        lr5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\5rightoff.png")); // NOI18N
        lr5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lr5MouseClicked(evt);
            }
        });
        getContentPane().add(lr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 80, 70));

        lr4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\4rightoff.png")); // NOI18N
        lr4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lr4MouseClicked(evt);
            }
        });
        getContentPane().add(lr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 80, 70));

        lr3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\3rightoff.png")); // NOI18N
        lr3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lr3MouseClicked(evt);
            }
        });
        getContentPane().add(lr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 70, 50));

        lr2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\2rightoff.png")); // NOI18N
        lr2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lr2MouseClicked(evt);
            }
        });
        getContentPane().add(lr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 80, 70));

        lr1.setBackground(new java.awt.Color(0, 0, 0));
        lr1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\1rightoff.png")); // NOI18N
        lr1.setToolTipText("Hi!");
        lr1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lr1MouseClicked(evt);
            }
        });
        lr1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lr1KeyPressed(evt);
            }
        });
        getContentPane().add(lr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, 80));

        ll8.setBackground(new java.awt.Color(255, 255, 255));
        ll8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\8leftoff.png")); // NOI18N
        ll8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ll8MouseClicked(evt);
            }
        });
        getContentPane().add(ll8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 80, 50));

        ll7.setBackground(new java.awt.Color(255, 255, 255));
        ll7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\7leftoff.png")); // NOI18N
        ll7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ll7MouseClicked(evt);
            }
        });
        getContentPane().add(ll7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 80, 70));

        ll6.setBackground(new java.awt.Color(255, 255, 255));
        ll6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\6leftoff.png")); // NOI18N
        ll6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ll6MouseClicked(evt);
            }
        });
        getContentPane().add(ll6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 80, 80));

        ll5.setBackground(new java.awt.Color(0, 0, 0));
        ll5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\5leftoff.png")); // NOI18N
        ll5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ll5MouseClicked(evt);
            }
        });
        getContentPane().add(ll5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 80, 70));

        ll4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\4leftoff.png")); // NOI18N
        ll4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ll4MouseClicked(evt);
            }
        });
        getContentPane().add(ll4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 80, 70));

        ll3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\3leftoff.png")); // NOI18N
        ll3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ll3MouseClicked(evt);
            }
        });
        getContentPane().add(ll3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 70, 50));

        ll2.setBackground(new java.awt.Color(0, 0, 0));
        ll2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\2leftoff.png")); // NOI18N
        ll2.setRequestFocusEnabled(false);
        ll2.setVerifyInputWhenFocusTarget(false);
        ll2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ll2MouseClicked(evt);
            }
        });
        getContentPane().add(ll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 70, 70));

        ll1.setBackground(new java.awt.Color(0, 0, 0));
        ll1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\WIndows\\1leftoff.png")); // NOI18N
        ll1.setDisabledIcon(null);
        ll1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ll1MouseClicked(evt);
            }
        });
        getContentPane().add(ll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 70, 80));

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\Images\\building\\bildingfinal.jpg")); // NOI18N
        B1.setMaximumSize(new java.awt.Dimension(800, 800));
        B1.setMinimumSize(new java.awt.Dimension(800, 800));
        B1.setOpaque(true);
        B1.setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents
Timer timer;

    private void elevator() {

        try {

            File sound = new File("C:\\Users\\Bharat\\Documents\\NetBeansProjects"
                    + "\\Boxopoly\\src\\Images\\Sounds\\Elevator.wav");
            c1 = AudioSystem.getClip();
            c1.open(AudioSystem.getAudioInputStream(sound));
            c1.start();

        } catch (Exception e) {

        }

    }

    private void window_click(int a) {
        String s1, s2, s3, s4, s5, s6, ss = "";
        s1 = "C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\"
                + "Images\\Sounds\\button.wav";
        s2 = "C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\"
                + "Images\\Sounds\\windows.wav";
        s3 = "C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\"
                + "Images\\Sounds\\lift.wav";
        s4 = "C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\"
                + "Images\\Sounds\\win.wav";
        s5 = "C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\"
                + "Images\\Sounds\\round.wav";
        s6 = "C:\\Users\\Bharat\\Documents\\NetBeansProjects\\Boxopoly\\src\\"
                + "Images\\Sounds\\click.wav";
        try {
            if (a == 1) {
                ss = s1;
            } else if (a == 2) {
                ss = s2;
            } else if (a == 3) {
                ss = s3;
            } else if (a == 4) {
                ss = s4;
            } else if (a == 5) {
                ss = s5;
            } else if (a == 6) {
                ss = s6;
            }
            //else if(a==5)ss=s5;
            File sound = new File(ss);
            c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();

        } catch (Exception e) {

        }
    }

    void endgame() {
        theend.setVisible(true);
        p11.setVisible(false);
        p12.setVisible(false);
        p1live.setVisible(false);
        p2live.setVisible(false);
        window_click(4);
        c1.stop();
        if (p1score > p2score) {
            theend.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\"
                    + "Boxopoly\\src\\Images\\building\\endp1.png"));
        } else if (p1score < p2score) {
            theend.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\"
                    + "Boxopoly\\src\\Images\\building\\endp2.png"));
        } else if (p1score == p2score) {
            if (dollar1 > dollar2) {
                theend.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                        + "NetBeansProjects\\"
                        + "Boxopoly\\src\\Images\\building\\endp1.png"));
            } else if (dollar1 == dollar2) {
                theend.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                        + "NetBeansProjects\\"
                        + "Boxopoly\\src\\Images\\building\\endp3.png"));
            } else {
                theend.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                        + "NetBeansProjects\\"
                        + "Boxopoly\\src\\Images\\building\\endp2.png"));
            }
        }

    }

    private void bb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb1ActionPerformed
        bb1.setVisible(false);
        inst.setVisible(false);
        reswindow();
        window_click(1);
        elevator();

        dollar1 = 500;
        dollar2 = 500;
        //  wait.setText("Enter player names in the console");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player 1 name : ");
        n1 = sc.next();

        System.out.println("Enter player 2 name : ");
        n2 = sc.next();
        wait.setText("");

        state = true;
        Thread t = new Thread() // Thread t1 = new Thread();
        {
            @Override

            public void run() {
                try {
                    lsec.setVisible(false);

                    wait.setText("<html><p>Choose your initial <br>floors,"
                            + " you have 7 seconds</p>");
                    Thread.sleep(7000);
                    wait.setVisible(false);
                    lsec.setVisible(true);

                } catch (InterruptedException ex) {

                }

                for (;;) {
                    if (state == true) {
                        try {

                            sleep(1);
                            block.setVisible(true);
                            if (milseconds >= 450) {
                                milseconds = 0;
                                cou++;
                                // System.out.println(cou);
                                seconds--;

                            }
                            milseconds++;
                            if (seconds % 10 <= 4 && seconds % 10 > 0) {
                                lsec.setForeground(Color.red);
                            } else if (seconds % 10 > 4) {
                                lsec.setForeground(Color.white);
                            } else if (seconds < 0) {
                                break;
                            }
                            if (seconds == 0) {
                                Err1.setText("");
                                p1live.setText("");
                                p2live.setText(" ");
                                p11.setText("");
                                p12.setText("");

                                Err2.setText("");
                                bb2.setVisible(true);
//inst.setVisible(true);
                                block.setVisible(false);
                                lsec.setText("Calculating");
                                Thread.sleep(2000);
                                endgame();
                                window_click(4);
                                c1.stop();
                                break;
                            }
                            lsec.setText("| >   " + seconds + "   < |");

            //Code to sent in a delay of 5 seconds to allow players to rechoose
                            if (cou == 10 && seconds >= 0) {
                                Err1.setText("");
                                block.setVisible(false);

                                Err2.setText("");
                                c1.stop();
                                window_click(5);
                                Err2.setText("");
                                p11.setVisible(true);
                                p12.setVisible(true);

                                Mainwindow mn = new Mainwindow(); 
//Calling constructor that calls the round score method
                                round = 1;
                                Scoredp1();
                                Scoredp2();
                                reswindow();
//            if(seconds>0){
                                try {
                                    cou = 0;
                                    lsec.setVisible(false);
                                    wait.setVisible(true);
                                    if (seconds == 0) {
                                        wait.setVisible(false);
                                        lsec.setVisible(true);
                                    }
                                    wait.setText("<html><font color = red>You "
                                            + "have <font color = white>4<font "
                                            + "color = red> seconds to choose"
                                            + "<br> your next floors");
                                    Thread.sleep(2000);
                                    window_click(6);
                                    wait.setText("<html><font color = red>You "
                                            + "have <font color = yellow>3<font"
                                            + " color = red> seconds to choose"
                                            + "<br> your next floors");
                                    Thread.sleep(2000);
                                    wait.setText("<html><font color = red>You "
                                            + "have <font color = yellow>2"
                                            + "<font color = red> seconds to "
                                            + "choose<br> your next floors");
                                    Thread.sleep(2000);
                                    wait.setText("<html><font color = red>You"
                                            + " have <font color = red>  1 "
                                            + " <font color = red> seconds to"
                                            + " choose<br> your next floors");
                                    Thread.sleep(2000);
                                    window_click(3);
                                    wait.setText("<html><font color = red>"
                                            + "Times Up!");
                                    Thread.sleep(2000);
                                    wait.setVisible(false);
                                    lsec.setVisible(true);
                                    p11.setText("");
                                    p12.setText("");
                                    p1live.setText("");
                                    p2live.setText("");

                                
                                } catch (InterruptedException ex) {
                                  
                                }

                            }

                            round = 0;
                            c1.start();
                        } catch (Exception ee) {
                        }
                    } else {

                        break;
                    }
                }
            }
        };
        t.start();

        //calling timer object and referncing it to an actionlistener that is 
        //activated when a button in pressed 
        /*  
        Timer t =  new  Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               i--;
    
            if(i>=0&&cou!=10)    
            { cou++;
                if(i%10<=4){lsec.setForeground(Color.red);}
                
                else if(i%10>4){lsec.setForeground(Color.white);}
                lsec.setText("| >   "+i+"   < |");
            }
             if(cou==10){
                cou = 0 ;
                timer.stop();
                   try {
                       Thread.sleep(3000);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(Mainwindow.class.getName()).log(Level.
        //SEVERE, null, ex);
                   }
}
            
            
            }
        });
        t.start();
        
        
    /*    
        @Override 
        public void actionPerformed (ActionEvent e){
        i--;
        }
        });
        
        timer.start();
        
         */
        // String name="1lefton" ;
        // ll1.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\
        //NetBeansProjects\\Boxopoly\\src\\Images\\Windows\\1lefton.png"));
        //   ll3.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\
        //NetBeansProjects\\Boxopoly\\src\\Images\\Windows\\3lefton.png"));
        //   lr5.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\
        //NetBeansProjects\\Boxopoly\\src\\Images\\Windows\\5righton.png"));

    }//GEN-LAST:event_bb1ActionPerformed

    private void ll1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ll1MouseClicked
        window_click(2);

        Err1.setText("");
        Err2.setText("");
        cost1 = 300;
        re1 = 40;
        bonus1 = 100;
        p1score += bonus1;
        re1to += re1;
        if ((dollar1 - cost1) < 0) {
            Err2.setText("Not enough $");
        } else {
            dollar1 = dollar1 - cost1;
            a = 1;
            ll1.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\"
                    + "Boxopoly\\src\\Images\\Windows\\1lefton.png"));

        }

    }//GEN-LAST:event_ll1MouseClicked

    private void ll2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ll2MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost1 = 250;
        re1 = 50;
        bonus1 = 80;
        p1score += bonus1;
        re1to += re1;
        if ((dollar1 - cost1) < 0) {
            Err2.setText("Not enough $");
        } else {
            dollar1 = dollar1 - cost1;
            a = 1;
            ll2.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\"
                    + "Boxopoly\\src\\Images\\Windows\\2lefton.png"));

        }
    }//GEN-LAST:event_ll2MouseClicked

    private void ll3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ll3MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost1 = 200;
        re1 = 40;
        bonus1 = 70;
        p1score += bonus1;
        re1to += re1;
        if ((dollar1 - cost1) < 0) {
            Err2.setText("Not enough $");
        } else {
            dollar1 = dollar1 - cost1;
            a = 1;
            ll3.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\"
                    + "Boxopoly\\src\\Images\\Windows\\3lefton.png"));

        }
    }//GEN-LAST:event_ll3MouseClicked

    private void ll4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ll4MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost1 = 150;
        re1 = 40;
        bonus1 = 60;
        p1score += bonus1;
        re1to += re1;
        if ((dollar1 - cost1) < 0) {
            Err2.setText("Not enough $");
        } else {
            dollar1 = dollar1 - cost1;
            a = 1;
            ll4.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\"
                    + "Boxopoly\\src\\Images\\Windows\\4lefton.png"));

        }
    }//GEN-LAST:event_ll4MouseClicked

    private void ll5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ll5MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);

        cost1 = 125;
        re1 = 40;
        bonus1 = 50;
        p1score += bonus1;
        re1to += re1;
        if ((dollar1 - cost1) < 0) {
            Err2.setText("Not enough $");
        } else {
            dollar1 = dollar1 - cost1;
            a = 1;
            ll5.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\"
                    + "Boxopoly\\src\\Images\\Windows\\5lefton.png"));

        }
    }//GEN-LAST:event_ll5MouseClicked

    private void ll6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ll6MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost1 = 100;
        re1 = 80;
        bonus1 = 40;
        p1score += bonus1;
        re1to += re1;
        if ((dollar1 - cost1) < 0) {
            Err2.setText("Not enough $");
        } else {
            dollar1 = dollar1 - cost1;
            a = 1;
            ll6.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\"
                    + "Boxopoly\\src\\Images\\Windows\\6lefton.png"));

        }
    }//GEN-LAST:event_ll6MouseClicked

    private void ll7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ll7MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost1 = 80;
        re1 = 100;
        bonus1 = 30;
        p1score += bonus1;
        re1to += re1;
        if ((dollar1 - cost1) < 0) {
            Err2.setText("Not enough $");
        } else {
            dollar1 = dollar1 - cost1;
            a = 1;
            ll7.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\"
                    + "Boxopoly\\src\\Images\\Windows\\7lefton.png"));

        }
    }//GEN-LAST:event_ll7MouseClicked

    private void ll8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ll8MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost1 = 75;
        re1 = 100;
        bonus1 = 20;
        p1score += bonus1;
        re1to += re1;
        if ((dollar1 - cost1) < 0) {
            Err2.setText("Not enough $");
        } else {
            dollar1 = dollar1 - cost1;
            a = 1;
            ll8.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\"
                    + "Boxopoly\\src\\Images\\Windows\\8lefton.png"));

        }
    }//GEN-LAST:event_ll8MouseClicked

    private void lr1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lr1MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost2 = 300;
        re2 = 40;
        bonus2 = 100;
        p2score += bonus2;
        re2to += re2;
        if ((dollar2 - cost2) < 0) {

            Err1.setText("Not enough $");
        } else {

            a = 1;
            dollar2 = dollar2 - cost2;
            System.out.println(dollar2);
            lr1.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects"
                    + "\\Boxopoly\\src\\Images\\Windows\\1righton.png"));

            //  if(a==1){Err1.setText("Already selected");}
        }
    }//GEN-LAST:event_lr1MouseClicked

    private void lr2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lr2MouseClicked

        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost2 = 250;
        re2 = 50;
        bonus2 = 80;
        p2score += bonus2;
        re2to += re2;
        if ((dollar2 - cost2) < 0) {

            Err1.setText("Not enough $");
        } else {

            a = 1;
            dollar2 = dollar2 - cost2;// System.out.println(dollar2);  
            lr2.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects"
                    + "\\Boxopoly\\src\\Images\\Windows\\2righton.png"));

            //  if(a==1){Err1.setText("Already selected");}
        }
    }//GEN-LAST:event_lr2MouseClicked

    private void lr3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lr3MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost2 = 200;
        re2 = 40;
        bonus2 = 70;
        p2score += bonus2;
        re2to += re2;
        if ((dollar2 - cost2) < 0) {

            Err1.setText("Not enough $");
        } else {

            a = 1;
            dollar2 = dollar2 - cost2;
            System.out.println(dollar2);
            lr3.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects"
                    + "\\Boxopoly\\src\\Images\\Windows\\3righton.png"));

            //  if(a==1){Err1.setText("Already selected");}
        }
    }//GEN-LAST:event_lr3MouseClicked

    private void lr4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lr4MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost2 = 150;
        re2 = 40;
        bonus2 = 60;
        p2score += bonus2;
        re2to += re2;
        if ((dollar2 - cost2) < 0) {

            Err1.setText("Not enough $");
        } else {

            a = 1;
            dollar2 = dollar2 - cost2;
            System.out.println(dollar2);
            lr4.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects"
                    + "\\Boxopoly\\src\\Images\\Windows\\4righton.png"));

            //  if(a==1){Err1.setText("Already selected");}
        }
    }//GEN-LAST:event_lr4MouseClicked

    private void lr5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lr5MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost2 = 125;
        re2 = 40;
        bonus2 = 50;
        p2score += bonus2;
        re2to += re2;
        if ((dollar2 - cost2) < 0) {

            Err1.setText("Not enough $");
        } else {

            a = 1;
            dollar2 = dollar2 - cost2; //System.out.println(dollar2);  
            lr5.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects"
                    + "\\Boxopoly\\src\\Images\\Windows\\5righton.png"));

            //  if(a==1){Err1.setText("Already selected");}
        }
    }//GEN-LAST:event_lr5MouseClicked

    private void lr6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lr6MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost2 = 100;
        re2 = 80;
        bonus2 = 40;
        p2score += bonus2;
        re2to += re2;
        if ((dollar2 - cost2) < 0) {

            Err1.setText("Not enough $");
        } else {

            a = 1;
            dollar2 = dollar2 - cost2; //System.out.println(dollar2);  
            lr6.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects"
                    + "\\Boxopoly\\src\\Images\\Windows\\6righton.png"));

            //  if(a==1){Err1.setText("Already selected");}
        }
    }//GEN-LAST:event_lr6MouseClicked

    private void lr7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lr7MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost2 = 80;
        re2 = 100;
        bonus2 = 30;
        p2score += bonus2;
        re2to += re2;
        if ((dollar2 - cost2) < 0) {

            Err1.setText("Not enough $");
        } else {

            dollar2 = dollar2 - cost2;// System.out.println(bonus);  
            lr7.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects"
                    + "\\Boxopoly\\src\\Images\\Windows\\7righton.png"));

        }
    }//GEN-LAST:event_lr7MouseClicked

    private void lr8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lr8MouseClicked
        Err1.setText("");
        Err2.setText("");
        window_click(2);
        cost2 = 75;
        re2 = 100;
        bonus2 = 20;

        p2score += bonus2;
        re2to += re2;
        if ((dollar2 - cost2) < 0) {

            Err1.setText("Not enough $");
        } else {

            a = 1;
            dollar2 = dollar2 - cost2; //.out.println(dollar2);  
            lr8.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects"
                    + "\\Boxopoly\\src\\Images\\Windows\\8righton.png"));

            //  if(a==1){Err1.setText("Already selected");}
        }
    }//GEN-LAST:event_lr8MouseClicked

    private void instActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instActionPerformed

        window_click(2);
        Err1.setVisible(false);
        Err2.setVisible(false);
        log.setVisible(true);
        dollar1 = 5000;
        dollar2 = 5000;
        instlabl.setText("<html>This is a two player game,<br> each player "
                + "has one side of the hotel to manage and allot rooms of "
                + "their choice to customers <br>"
                + "each floor has it's cost, it's bonus points and the "
                + "amount of money that you receive back every 10 seconds "
                + "<br><br>Score more points than the "
                + "other player to win! You get to allot rooms every 10"
                + " seconds but make sure you don't run out of money<br>"
                + "<br>Select your room floors by clicking on them, try it "
                + "out for yourself before you start! </html>");

        //  try {
        //    Thread.sleep(2000);
        //   lr5.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\
        //NetBeansProjects\\Boxopoly\\src\\Images\\Windows\\5rightoff.png"));
        //lr5.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\
        //NetBeansProjects\\Boxopoly\\src\\Images\\Windows\\5rightoff.png"));;
        if (tt == 0) {
            p1.setVisible(true);
            scl.setVisible(true);
            scl.setText("<html><br> 300 -  40 -  100  >\n<br><br><br>"
                    + "250 -  50 -  80  >\n<br><br><br>"
                    + "200 - 40 -  70  >\n<br><br><br>"
                    + "150 - 40 - 60  >\n<br><br><br><br>"
                    + "125 -  40  - 50  >\n<br><br><br>"
                    + "100 - 80 - 40  >\n<br><br><br><br>"
                    + "80 - 100 - 30  >\n<br><br><br>"
                    + "75 - 100 - 20  >\n");
            lr5.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\Boxopoly\\src\\Images\\Windows\\"
                    + "5righton.png"));
            ll1.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\Boxopoly\\src\\Images\\Windows\\"
                    + "1lefton.png"));
            ll3.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents\\"
                    + "NetBeansProjects\\Boxopoly\\src\\Images\\Windows\\"
                    + "3lefton.png"));
            tt = 1;
        } else {
            log.setVisible(false);
            scl.setVisible(false);
            p1.setVisible(false);
            reswindow();
            tt = 0;

        }
    }//GEN-LAST:event_instActionPerformed

    private void lr1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lr1KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cost2 = 300;
            re2 = 40;
            bonus2 = 100;

            if (a == 0) {
                a = 1;
                lr1.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents"
                        + "\\NetBeansProjects\\Boxopoly\\src\\Images\\Windows"
                        + "\\1righton.png"));
            } else {
                a = 0;
                lr1.setIcon(new ImageIcon("C:\\Users\\Bharat\\Documents"
                        + "\\NetBeansProjects\\Boxopoly\\src\\Images\\Windows"
                        + "\\1rightoff.png"));
            }
        }                   // TODO add your handling code here:
    }//GEN-LAST:event_lr1KeyPressed

    private void bb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb2ActionPerformed
        window_click(2);
        System.exit(0);
    }//GEN-LAST:event_bb2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainwindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B1;
    private javax.swing.JLabel Err1;
    private javax.swing.JLabel Err2;
    private javax.swing.JButton bb1;
    private javax.swing.JButton bb2;
    private javax.swing.JLabel block;
    private javax.swing.JButton inst;
    private javax.swing.JLabel instlabl;
    private javax.swing.JLabel ll1;
    private javax.swing.JLabel ll2;
    private javax.swing.JLabel ll3;
    private javax.swing.JLabel ll4;
    private javax.swing.JLabel ll5;
    private javax.swing.JLabel ll6;
    private javax.swing.JLabel ll7;
    private javax.swing.JLabel ll8;
    private javax.swing.JLabel log;
    private javax.swing.JLabel lr1;
    private javax.swing.JLabel lr2;
    private javax.swing.JLabel lr3;
    private javax.swing.JLabel lr4;
    private javax.swing.JLabel lr5;
    private javax.swing.JLabel lr6;
    private javax.swing.JLabel lr7;
    private javax.swing.JLabel lr8;
    private javax.swing.JLabel lsec;
    private javax.swing.JPanel p1;
    private javax.swing.JLabel p11;
    private javax.swing.JLabel p12;
    private javax.swing.JLabel p1live;
    private javax.swing.JLabel p2live;
    private javax.swing.JLabel scl;
    private javax.swing.JLabel theend;
    private javax.swing.JLabel wait;
    // End of variables declaration//GEN-END:variables

    private void Roundscores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
