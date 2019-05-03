import javax.swing.JButton;

public class FinalGame extends java.applet.Applet
  implements java.awt.event.ActionListener {
  java.applet.AudioClip soundFile;
  javax.swing.JLabel score123;
  int userPic;
  java.awt.Panel p_card;
  java.awt.Panel card1;
  
  public FinalGame() { jdMethod_this(); }
  
  java.awt.Panel card2;
  
  private final void jdMethod_this() {
    userPic = 2;
    

    cdLayout = new java.awt.CardLayout();
    

    row = 6;
    col = 7;
    
    move = 0;
    movee = 0;
    undoo = new int['Ǵ'][row][col];
    

    t = 2;
    a = new JButton[row * col];
    


    z = new int[][] { { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
    
    b = new int[][] { { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
    playz1 = 0;
    playz2 = 0;
    ai = 1;
    playz3 = 0;
    playz4 = 0;
    comp1 = 0;
    comp2 = 0;
    comp3 = 0;
    comp4 = 0;
    menuBar = new javax.swing.JMenuBar();
  }
  
  java.awt.Panel card3;
  java.awt.Panel card4;
  java.awt.Panel card5;
  
  public void init() { p_card = new java.awt.Panel();
    p_card.setLayout(cdLayout);
    initOpening();
    screen1();
    screen2();
    screen3();
    screen4();
    screen5();
    screen6();
    screen7();
    screen8();
    screen9();
    screen10();
    resize(685, 469);
    setLayout(new java.awt.BorderLayout());
    add("Center", p_card);
    initMenu();
  }
  
  java.awt.Panel card6;
  java.awt.Panel card7;
  
  public void initMenu() { javax.swing.JMenuBar localJMenuBar = new javax.swing.JMenuBar();
    


    javax.swing.JMenu localJMenu = new javax.swing.JMenu("File");
    localJMenuBar.add(localJMenu);
    
    javax.swing.JMenuItem localJMenuItem = new javax.swing.JMenuItem("Close");
    localJMenuItem.addActionListener(this);
    localJMenuItem.setActionCommand("1q");
    localJMenu.add(localJMenuItem);
    
    localJMenu = new javax.swing.JMenu("Navigate");
    localJMenuBar.add(localJMenu);
    
    localJMenuItem = new javax.swing.JMenuItem("Opening");
    localJMenuItem.addActionListener(this);
    localJMenuItem.setActionCommand("q1");
    localJMenu.add(localJMenuItem);
    
    localJMenuItem = new javax.swing.JMenuItem("Rules");
    localJMenuItem.addActionListener(this);
    localJMenuItem.setActionCommand("q2");
    localJMenu.add(localJMenuItem);
    
    localJMenuItem = new javax.swing.JMenuItem("Play Game");
    localJMenuItem.addActionListener(this);
    localJMenuItem.setActionCommand("q3");
    localJMenu.add(localJMenuItem);
    
    localJMenuItem = new javax.swing.JMenuItem("Help");
    localJMenuItem.addActionListener(this);
    localJMenuItem.setActionCommand("q4");
    localJMenu.add(localJMenuItem);
    add("North", localJMenuBar); }
  
  java.awt.Panel card8;
  java.awt.Panel card9;
  java.awt.Panel card10;
  java.awt.CardLayout cdLayout;
  
  public void initOpening() { card1 = new java.awt.Panel();
    card1.setBackground(new java.awt.Color(0, 0, 0));
    JButton localJButton = new JButton(createImageIcon("9.jpg"));
    localJButton.setBorderPainted(false);
    localJButton.setPreferredSize(new java.awt.Dimension(685, 445));
    localJButton.setBackground(new java.awt.Color(208, 59, 26));
    localJButton.setActionCommand("s2");
    localJButton.addActionListener(this);
    card1.add(localJButton);
    
    p_card.add("1", card1);
  }
  
  int row;
  int col;
  
  public void screen1() { card1 = new java.awt.Panel();
    card1.setBackground(new java.awt.Color(0, 0, 0));
    JButton localJButton = new JButton(createImageIcon("9.jpg"));
    localJButton.setBorderPainted(false);
    localJButton.setPreferredSize(new java.awt.Dimension(685, 445));
    localJButton.setBackground(new java.awt.Color(208, 59, 26));
    localJButton.setActionCommand("s2");
    localJButton.addActionListener(this);
    
    card1.add(localJButton);
    p_card.add("1", card1); }
  
  int move;
  int movee;
  int[][][] undoo;
  
  public void screen2() { card2 = new java.awt.Panel();
    card2.setBackground(new java.awt.Color(0, 0, 0));
    soundFile = getAudioClip(getDocumentBase(), "5.wav");
    soundFile.loop();
    JButton localJButton = new JButton(createImageIcon("16.jpg"));
    localJButton.setPreferredSize(new java.awt.Dimension(685, 445));
    localJButton.setBorderPainted(false);
    localJButton.setActionCommand("s3");
    localJButton.addActionListener(this);
    
    card2.add(localJButton);
    p_card.add("2", card2);
  }
  
  javax.swing.JLabel turn1;
  int t;
  JButton[] a;
  public void screen3() { card3 = new java.awt.Panel(new java.awt.BorderLayout());
    
    score123 = new javax.swing.JLabel("PLAYER 1 SCORE:000");
    score123.setFont(new java.awt.Font("Rockwell", 1, 16));
    score123.setForeground(new java.awt.Color(255, 255, 255));
    
    score23 = new javax.swing.JLabel("PLAYER 2 SCORE:000");
    score23.setFont(new java.awt.Font("Rockwell", 1, 16));
    score23.setForeground(new java.awt.Color(255, 255, 255));
    
    progress = new javax.swing.JProgressBar(0, 0, 42);
    progress.setValue(0);
    progress.setStringPainted(true);
    progress.setBackground(java.awt.Color.black);
    progress.setForeground(new java.awt.Color(252, 143, 40));
    progress.setBorderPainted(false);
    
    redo = new JButton(" RESET ");
    redo.setBackground(new java.awt.Color(141, 184, 23));
    redo.setForeground(new java.awt.Color(255, 255, 255));
    redo.setActionCommand("reset");
    redo.addActionListener(this);
    redo.setBorderPainted(false);
    
    undo1 = new JButton("  UNDO ");
    undo1.setBackground(new java.awt.Color(199, 21, 133));
    undo1.setForeground(new java.awt.Color(255, 255, 255));
    undo1.setBorderPainted(false);
    undo1.setActionCommand("undo");
    undo1.addActionListener(this);
    
    card3.setBackground(new java.awt.Color(0, 0, 0));
    javax.swing.JLabel localJLabel1 = new javax.swing.JLabel("CONNECT 4 SPORTS EDITION");
    localJLabel1.setForeground(new java.awt.Color(252, 143, 40));
    localJLabel1.setFont(new java.awt.Font("Rockwell", 1, 33));
    javax.swing.JLabel localJLabel2 = new javax.swing.JLabel("");
    
    save = new JButton("  SAVE  ");
    save.setBorderPainted(false);
    save.setBackground(new java.awt.Color(220, 10, 5));
    save.setForeground(new java.awt.Color(255, 255, 255));
    save.setActionCommand("save");
    save.addActionListener(this);
    
    open = new JButton("  OPEN  ");
    open.setBorderPainted(false);
    open.addActionListener(this);
    open.setActionCommand("open");
    
    open.setBackground(new java.awt.Color(75, 0, 130));
    open.setForeground(new java.awt.Color(255, 255, 255));
    
    JButton localJButton = new JButton("  NEXT  ");
    localJButton.setBorderPainted(false);
    
    localJButton.setBackground(new java.awt.Color(24, 129, 189));
    localJButton.setForeground(new java.awt.Color(255, 255, 255));
    localJButton.setActionCommand("s4");
    localJButton.addActionListener(this);
    
    javax.swing.JLabel localJLabel3 = new javax.swing.JLabel("TURN: ");
    localJLabel3.setFont(new java.awt.Font("Rockwell", 1, 16));
    localJLabel3.setForeground(new java.awt.Color(255, 255, 255));
    
    turn1 = new javax.swing.JLabel(createImageIcon("2.jpg"));
    
    javax.swing.JLabel localJLabel4 = new javax.swing.JLabel("Player 1 should click to place their piece. ");
    


    java.awt.Panel localPanel1 = new java.awt.Panel(new java.awt.GridLayout(row, col));
    int i = 0;
    for (int j = 0; j < row; j++)
    {
      for (int k = 0; k < col; k++)
      {
        a[i] = new JButton("");
        
        a[i] = new JButton(createImageIcon(b[j][k] + ".jpg"));
        a[i].setPreferredSize(new java.awt.Dimension(60, 60));
        a[i].addActionListener(this);
        a[i].setActionCommand(i);
        a[i].setBorderPainted(false);
        localPanel1.add(a[i]);
        i++;
      }
    }
    card3.add("North", localJLabel1);
    
    java.awt.Panel localPanel2 = new java.awt.Panel(new java.awt.GridLayout(5, 1));
    localPanel2.add(score123);
    localPanel2.add(score23);
    localPanel2.add(localJLabel3);
    localPanel2.add(turn1);
    localPanel2.add(progress);
    
    java.awt.Panel localPanel3 = new java.awt.Panel();
    localPanel3.add(localPanel2);
    card3.add("West", localPanel3);
    
    java.awt.Panel localPanel4 = new java.awt.Panel();
    localPanel4.add(localPanel1);
    card3.add("Center", localPanel4);
    
    java.awt.Panel localPanel5 = new java.awt.Panel();
    localPanel5.add(localJLabel2);
    localPanel5.add(open);
    localPanel5.add(redo);
    localPanel5.add(save);
    localPanel5.add(localJButton);
    localPanel5.add(undo1);
    card3.add("South", localPanel5);
    p_card.add("3", card3);
  }
  

  public void screen4()
  {
    card4 = new java.awt.Panel();
    card4.setBackground(new java.awt.Color(0, 0, 0));
    JButton localJButton = new JButton(createImageIcon("30.jpg"));
    localJButton.setPreferredSize(new java.awt.Dimension(715, 415));
    localJButton.setBorderPainted(false);
    localJButton.setActionCommand("s5");
    localJButton.addActionListener(this);
    card4.add(localJButton);
    p_card.add("4", card4);
  }
  

  public void screen5()
  {
    card5 = new java.awt.Panel();
    card5.setBackground(new java.awt.Color(0, 0, 0));
    javax.swing.JLabel localJLabel = new javax.swing.JLabel(createImageIcon("258.jpg"));
    JButton localJButton1 = new JButton("Back to Introduction?");
    localJButton1.setForeground(java.awt.Color.white);
    localJButton1.setBackground(new java.awt.Color(24, 129, 189));
    localJButton1.setActionCommand("s2");
    localJButton1.addActionListener(this);
    JButton localJButton2 = new JButton("Quit?");
    localJButton2.setActionCommand("s6");
    localJButton2.addActionListener(this);
    
    card5.add(localJLabel);
    card5.add(localJButton1);
    card5.add(localJButton2);
    p_card.add("5", card5);
  }
  

  public void screen6()
  {
    card6 = new java.awt.Panel();
    card6.setBackground(new java.awt.Color(0, 0, 0));
    javax.swing.JLabel localJLabel1 = new javax.swing.JLabel("                                                                                                                                                                         ");
    javax.swing.JLabel localJLabel2 = new javax.swing.JLabel("CHOOSE YOUR SPORT");
    localJLabel2.setForeground(new java.awt.Color(252, 143, 40));
    localJLabel2.setFont(new java.awt.Font("Rockwell", 1, 30));
    javax.swing.JLabel localJLabel3 = new javax.swing.JLabel("                                                                                                                                                                         ");
    javax.swing.JLabel localJLabel4 = new javax.swing.JLabel("                                                                                                                                                                         ");
    javax.swing.JLabel localJLabel5 = new javax.swing.JLabel("                                                                                                                                                                         ");
    JButton localJButton1 = new JButton(createImageIcon("12.jpg"));
    javax.swing.JLabel localJLabel6 = new javax.swing.JLabel("           ");
    JButton localJButton2 = new JButton(createImageIcon("14.jpg"));
    javax.swing.JLabel localJLabel7 = new javax.swing.JLabel("           ");
    JButton localJButton3 = new JButton(createImageIcon("15.jpg"));
    localJButton1.setBackground(new java.awt.Color(208, 59, 26));
    localJButton1.setActionCommand("p1");
    localJButton1.addActionListener(this);
    localJButton1.setPreferredSize(new java.awt.Dimension(175, 320));
    localJButton2.setBackground(new java.awt.Color(208, 59, 26));
    localJButton2.setActionCommand("p2");
    localJButton2.addActionListener(this);
    localJButton2.setPreferredSize(new java.awt.Dimension(175, 320));
    localJButton3.setActionCommand("p3");
    localJButton3.addActionListener(this);
    localJButton3.setPreferredSize(new java.awt.Dimension(175, 320));
    
    card6.add(localJLabel1);
    card6.add(localJLabel2);
    card6.add(localJLabel5);
    card6.add(localJButton1);
    card6.add(localJLabel6);
    card6.add(localJButton2);
    card6.add(localJLabel7);
    card6.add(localJButton3);
    card6.add(localJLabel3);
    card6.add(localJLabel4);
    p_card.add("6", card6);
  }
  

  public void screen7()
  {
    card7 = new java.awt.Panel();
    card7.setBackground(new java.awt.Color(0, 0, 0));
    javax.swing.JLabel localJLabel1 = new javax.swing.JLabel("                                                                                                                                                                             ");
    javax.swing.JLabel localJLabel2 = new javax.swing.JLabel("CHOOSE YOUR GAME MODE");
    localJLabel2.setForeground(new java.awt.Color(252, 143, 40));
    localJLabel2.setFont(new java.awt.Font("Rockwell", 1, 33));
    javax.swing.JLabel localJLabel3 = new javax.swing.JLabel("                                                                                                                                                                             ");
    JButton localJButton1 = new JButton(createImageIcon("71.jpg"));
    localJButton1.setPreferredSize(new java.awt.Dimension(414, 100));
    localJButton1.setBorderPainted(false);
    localJButton1.setBackground(new java.awt.Color(208, 59, 26));
    localJButton1.setActionCommand("z");
    localJButton1.addActionListener(this);
    JButton localJButton2 = new JButton(createImageIcon("72.jpg"));
    localJButton2.setBorderPainted(false);
    localJButton2.setBackground(new java.awt.Color(208, 59, 26));
    localJButton2.setActionCommand("z1");
    localJButton2.addActionListener(this);
    localJButton2.setPreferredSize(new java.awt.Dimension(414, 100));
    JButton localJButton3 = new JButton(createImageIcon("73.jpg"));
    localJButton3.setBorderPainted(false);
    localJButton3.setBackground(new java.awt.Color(208, 59, 26));
    localJButton3.setActionCommand("z2");
    localJButton3.addActionListener(this);
    localJButton3.setPreferredSize(new java.awt.Dimension(414, 100));
    
    card7.add(localJLabel1);
    card7.add(localJLabel2);
    card7.add(localJLabel3);
    card7.add(localJButton1);
    card7.add(localJButton2);
    card7.add(localJButton3);
    p_card.add("7", card7);
  }
  

  public void screen8()
  {
    card8 = new java.awt.Panel();
    card8.setBackground(new java.awt.Color(0, 0, 0));
    javax.swing.JLabel localJLabel1 = new javax.swing.JLabel(createImageIcon("257.jpg"));
    javax.swing.JLabel localJLabel2 = new javax.swing.JLabel("WIN CONDITION/HOW TO PLAY ");
    localJLabel2.setForeground(new java.awt.Color(252, 143, 40));
    localJLabel2.setFont(new java.awt.Font("Rockwell", 1, 33));
    card8.add(localJLabel2);
    card8.add(localJLabel1);
    p_card.add("8", card8); }
  JButton redo;
  JButton undo1;
  int[][] z;
  int[][] b;
  
  public void screen9() { card9 = new java.awt.Panel();
    card9.setBackground(new java.awt.Color(0, 0, 0));
    JButton localJButton = new JButton(createImageIcon("32.jpg"));
    localJButton.setPreferredSize(new java.awt.Dimension(715, 415));
    localJButton.setBorderPainted(false);
    localJButton.setActionCommand("j3");
    localJButton.addActionListener(this);
    
    card9.add(localJButton);
    p_card.add("9", card9); }
  
  int playz1;
  int playz2;
  int ai;
  
  public void screen10() { card10 = new java.awt.Panel();
    card10.setBackground(new java.awt.Color(0, 0, 0));
    JButton localJButton = new JButton(createImageIcon("31.jpg"));
    localJButton.setPreferredSize(new java.awt.Dimension(715, 415));
    localJButton.setBorderPainted(false);
    localJButton.setActionCommand("j3");
    localJButton.addActionListener(this);
    
    card10.add(localJButton);
    p_card.add("10", card10);
  }
  
  int playz3;
  int playz4;
  JButton save;
  
  protected static javax.swing.ImageIcon createImageIcon(String paramString) {
    Class tmp3_0 = class$FinalGame;

    if (tmp3_0 == null) tmp3_0; java.net.URL localURL = (FinalGame.class$FinalGame = class$("[LFinalGame;", false)).getResource(paramString);
    if (localURL != null)
    {
      return new javax.swing.ImageIcon(localURL);
    }
    

    System.err.println("Couldn't find file: " + paramString);
    return null;
  }
  
  JButton open;
  int calc;
  int comp;
  int comp1;
  
  public void redraw() { int i = 0;
    for (int j = 0; j < row; j++)
    {
      for (int k = 0; k < col; k++)
      {
        a[i].setIcon(createImageIcon(b[j][k] + ".jpg"));
        i++;
      } }
  }
  
  int comp2;
  int comp3;
  int comp4;
  
  public void reset() {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++)
        b[i][j] = z[i][j];
    }
    redraw();
    playz1 = 0;
    playz2 = 0;
    playz3 = 0;
    playz4 = 0;
    score123.setText("PLAYER 1 SCORE:" + playz1);
    comp1 = 0;
    comp2 = 0;
    comp3 = 0;
    comp4 = 0;
    score23.setText("PLAYER 2 SCORE:" + comp1);
  }
  
  int calc2;
  javax.swing.JLabel score23;
  javax.swing.JMenuBar menuBar;
  
  public void savemove() { for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col; j++) {
        undoo[movee][i][j] = b[i][j];
      }
    }
  }
  
  public void undomove()
  {
    movee -= 1;
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col; j++) {
        b[i][j] = undoo[movee][i][j];
      }
    }
  }
  
  public void actionPerformed(java.awt.event.ActionEvent paramActionEvent)
  {
    savemove();
    if (paramActionEvent.getActionCommand().equals("save")) {
      save("file.txt");
    } else if (paramActionEvent.getActionCommand().equals("open")) {
      open("file.txt");
    } else if (paramActionEvent.getActionCommand().equals("q1")) {
      cdLayout.show(p_card, "1");
    } else if (paramActionEvent.getActionCommand().equals("q2")) {
      cdLayout.show(p_card, "2");
    } else if (paramActionEvent.getActionCommand().equals("q3")) {
      cdLayout.show(p_card, "3");
    } else if (paramActionEvent.getActionCommand().equals("q4")) {
      cdLayout.show(p_card, "8");
    } else if (paramActionEvent.getActionCommand().equals("s1")) {
      cdLayout.show(p_card, "1");
    } else if (paramActionEvent.getActionCommand().equals("s2")) {
      cdLayout.show(p_card, "2");
    } else if (paramActionEvent.getActionCommand().equals("s3")) {
      cdLayout.show(p_card, "6");
    } else if (paramActionEvent.getActionCommand().equals("p1"))
    {
      turn1.setIcon(createImageIcon("2.jpg"));
      userPic = 2;
      cdLayout.show(p_card, "7");
    }
    else if (paramActionEvent.getActionCommand().equals("p2"))
    {
      userPic = 5;
      turn1.setIcon(createImageIcon("3.jpg"));
      cdLayout.show(p_card, "7");
    }
    else if (paramActionEvent.getActionCommand().equals("p3"))
    {
      userPic = 4;
      cdLayout.show(p_card, "7");

    }
    else if (paramActionEvent.getActionCommand().equals("reset")) {
      reset();
    } else if (paramActionEvent.getActionCommand().equals("undo"))
    {
      undomove();
      redraw();
    }
    else if (paramActionEvent.getActionCommand().equals("z"))
    {
      ai = 1;
      turn1.setIcon(createImageIcon(userPic + ".jpg"));
      cdLayout.show(p_card, "3");
    }
    else if (paramActionEvent.getActionCommand().equals("z1"))
    {
      ai = 2;
      turn1.setIcon(createImageIcon(userPic + ".jpg"));
      cdLayout.show(p_card, "3");
    }
    else if (paramActionEvent.getActionCommand().equals("z2"))
    {
      ai = 3;
      turn1.setIcon(createImageIcon(userPic + ".jpg"));
      cdLayout.show(p_card, "3");

    }
    else if (paramActionEvent.getActionCommand().equals("s4"))
    {
      if (calc > calc2) {
        cdLayout.show(p_card, "4");
      } else if (calc == calc2) {
        cdLayout.show(p_card, "9");
      } else {
        cdLayout.show(p_card, "10");
      }
    } else if (paramActionEvent.getActionCommand().equals("s5")) {
      cdLayout.show(p_card, "5");
    }
    else if (paramActionEvent.getActionCommand().equals("j2")) {
      cdLayout.show(p_card, "5");
    } else if (paramActionEvent.getActionCommand().equals("j3")) {
      cdLayout.show(p_card, "5");
    } else if (paramActionEvent.getActionCommand().equals("s6")) {
      System.exit(0);
    } else if (paramActionEvent.getActionCommand().equals("1q")) {
      System.exit(0);
    }
    else {
      movee += 1;
      int i = Integer.parseInt(paramActionEvent.getActionCommand());
      int j = i / col;
      int k = i % col;
      if (t == 2)
      {
        while ((j < row) && (b[j][k] == 1))
          j++;
        j--;
        
        if (j < 0) {
          javax.swing.JOptionPane.showMessageDialog(null, "You cannot place a piece above the visible grid try to connect 4 of your\npieces only inside of the connect 4 board in order to win the game.", "alert", 0);
        } else if ((j == 0) && (b[j][k] != 1)) {
          javax.swing.JOptionPane.showMessageDialog(null, "You cannot place a piece above the visible grid try to connect 4 of your\npieces only inside of the connect 4 board in order to win the game.", "alert", 0);
        }
        else {
          b[j][k] = userPic;
          t = 3;
        }
      }
      else {
        int m;
        int n;
        if (ai == 1)
        {
          m = i / col;
          n = i % col;
          if (t == 3)
          {
            while ((m < row) && (b[m][n] == 1))
              m++; }
          m--;
          b[m][n] = t;
          t = 2;
        } else { int i1;
          if (ai == 2)
          {

            m = (int)(Math.random() * 7.0D);
            n = m / col;
            i1 = m % col;
            while (b[0][i1] != 1)
            {
              m = (int)(Math.random() * 7.0D);
              n = m / col;
              i1 = m % col;
            }
            
            while ((n < row) && (b[n][i1] == 1))
              n++;
            n--;
            
            b[n][i1] = t;
            t = 2;
            
            t = 2;

          }
          else
          {
            m = 0;
            boolean bool = verticlestop();
            if (!bool)
              bool = horizontalstop();
            if (!bool)
              bool = crossstop();
            if (!bool) {
              bool = upcrossstop();
            }
            if (!bool)
            {
              n = (int)(Math.random() * 7.0D);
              i1 = n / col;
              int i2 = n % col;
              while (b[0][i2] != 1)
              {
                n = (int)(Math.random() * 7.0D);
                i1 = n / col;
                i2 = n % col;
              }
              
              while ((i1 < row) && (b[i1][i2] == 1))
                i1++;
              i1--;
              
              b[i1][i2] = t;
              t = 2;
            }
            t = 2;
          }
        }
      }
      
      if (t == 2) {
        turn1.setIcon(createImageIcon(userPic + ".jpg"));
      } else
        turn1.setIcon(createImageIcon(t + ".jpg"));
      redraw();
      

      comp = 0;
      playz1 = 0;
      comp2 = 0;
      playz2 = 0;
      comp3 = 0;
      playz3 = 0;
      playz4 = 0;
      comp4 = 0;
      
      horizontal();
      verticle();
      cross();
      crossupside();
      
      calc = (playz1 + playz2 + playz3 + playz4);
      score123.setText("PLAYER 1 SCORE:" + calc);
      calc2 = (comp1 + comp2 + comp3 + comp4);
      score23.setText("PLAYER 2 SCORE:" + calc2);
    }
    

    progress.setValue(countpeices());
  }
  

  public int countpeices()
  {
    int i = 0;
    for (int j = 0; j < 6; j++)
    {
      for (int k = 0; k < 7; k++)
      {
        if (b[j][k] != 1)
          i++;
      }
    }
    return i;
  }
  
  javax.swing.JMenu menu;
  javax.swing.JMenuItem menuItem;
  javax.swing.JProgressBar progress;
  static Class class$FinalGame;
  public void horizontal() { for (int i = 0; i < 6; i++)
    {
      for (int j = 0; j <= 3; j++)
      {
        if ((b[i][j] == b[i][(j + 1)]) && (b[i][j] == b[i][(j + 2)]) && (b[i][j] == b[i][(j + 3)]) && (b[i][j] != 1))
        {
          showStatus("horizontal win");
          if (b[i][j] == userPic) {
            playz1 += 1;
          } else {
            comp1 += 1;
          }
        }
      }
    }
  }
  

  public void verticle()
  {
    for (int i = 0; i <= 3; i++)
    {
      for (int j = 0; j < 6; j++)
      {
        if ((b[i][j] == b[(i + 1)][j]) && (b[i][j] == b[(i + 2)][j]) && (b[i][j] == b[(i + 3)][j]) && (b[i][j] != 1))
        {
          showStatus("verticle win");
          if (b[i][j] == userPic) {
            playz2 += 1;
          } else {
            comp2 += 1;
          }
        }
      }
    }
  }
  


  public void cross()
  {
    for (int i = 3; i <= 5; i++)
    {
      for (int j = 0; j <= 3; j++)
      {
        if ((b[i][j] == b[(i - 1)][(j + 1)]) && (b[i][j] == b[(i - 2)][(j + 2)]) && (b[i][j] == b[(i - 3)][(j + 3)]) && (b[i][j] != 1))
        {
          showStatus("cross win");
          if (b[i][j] == userPic) {
            playz3 += 1;
          } else {
            comp3 += 1;
          }
        }
      }
    }
  }
  


  public void crossupside()
  {
    for (int i = 0; i <= 2; i++)
    {
      for (int j = 0; j <= 3; j++)
      {
        if ((b[i][j] == b[(i + 1)][(j + 1)]) && (b[i][j] == b[(i + 2)][(j + 2)]) && (b[i][j] == b[(i + 3)][(j + 3)]) && (b[i][j] != 1))
        {
          showStatus("upsidecross win");
          if (b[i][j] == userPic) {
            playz4 += 1;
          } else {
            comp4 += 1;
          }
        }
      }
    }
  }
  


  public void save(String paramString)
  {
    try
    {
      java.io.PrintWriter localPrintWriter = new java.io.PrintWriter(new java.io.FileWriter(paramString));
      for (int i = 0; i < row; i++)
      {
        for (int j = 0; j < col; j++)
        {
          localPrintWriter.println(b[i][j]);
        }
      }
      
      localPrintWriter.close();

    }
    catch (java.io.IOException localIOException)
    {
      System.out.println("Error opening file " + localIOException);
    }
  }
  


  public void open(String paramString)
  {
    try
    {
      java.io.BufferedReader localBufferedReader = new java.io.BufferedReader(new java.io.FileReader(paramString));
      String str = localBufferedReader.readLine();
      for (int i = 0; i < row; i++)
      {
        for (int j = 0; j < col; j++)
        {
          b[i][j] = Integer.parseInt(str);
          str = localBufferedReader.readLine();
        }
      }
      localBufferedReader.close();
    }
    catch (java.io.IOException localIOException)
    {
      System.out.println("Error opening file " + localIOException);
    }
    redraw();
  }
  

  public boolean horizontalstop()
  {
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j <= 3; j++)
      {
        if ((b[i][j] == userPic) && (b[i][(j + 1)] == userPic) && (b[i][(j + 2)] == userPic) && (b[i][(j + 3)] == 1))
        {
          int k = i;
          
          while ((k < row) && (b[k][(j + 3)] == 1))
          {
            k++;
          }
          k--;
          b[k][(j + 3)] = 3;
          return true;
        }
      }
    }
    return false;
  }
  

  public boolean verticlestop()
  {
    for (int i = 0; i <= 2; i++)
    {
      for (int j = 0; j <= col; j++)
      {
        if ((b[i][j] == 1) && (b[(i + 1)][j] == userPic) && (b[(i + 2)][j] == userPic) && (b[(i + 3)][j] == userPic))
        {
          b[i][j] = 3;
          return true;
        }
      }
    }
    return false;
  }
  

  public boolean crossstop()
  {
    for (int i = 3; i <= 5; i++)
    {
      for (int j = 0; j <= 3; j++)
      {
        if ((b[i][j] == userPic) && (b[(i - 1)][(j + 1)] == userPic) && (b[(i - 2)][(j + 2)] == userPic) && (b[(i - 3)][(j + 3)] == 1))
        {
          int k = i - 3;
          
          while ((k < row) && (b[k][(j + 3)] == 1))
          {
            k++;
          }
          k--;
          b[k][(j + 3)] = 3;
          return true;
        }
      }
    }
    return false;
  }
  

  public boolean upcrossstop()
  {
    for (int i = 0; i <= 2; i++)
    {
      for (int j = 0; j <= 3; j++)
      {
        if ((b[i][j] == userPic) && (b[(i + 1)][(j + 1)] == userPic) && (b[(i + 2)][(j + 2)] == userPic) && (b[(i + 3)][(j + 3)] == 1))
        {
          int k = i + 3;
          
          while ((k < row) && (b[k][(j + 3)] == 1))
          {
            k++;
          }
          k--;
          b[k][(j + 3)] = 3;
          return true;
        }
      }
    }
    return false;
  }
  
  static Class class$(String paramString, boolean paramBoolean)
  {
    try
    {
      if (!paramBoolean) {}
      return Class.forName(paramString).getComponentType();
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
    }
  }
}
