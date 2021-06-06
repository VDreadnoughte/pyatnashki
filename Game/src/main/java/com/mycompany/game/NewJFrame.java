package com.mycompany.game;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// @author Дмитрий

class AboutDialog extends JDialog
{
	public AboutDialog(JFrame owner)
	{
		super(owner, "GameOver", true);
                super.setResizable(false);
		add(new JLabel(
				"<html><blockquote><h1>Игра окончена</h1><hr>"
				+ "<blockquote>Нажмите \"Ок\" для начала новой игры</html>"),
				BorderLayout.CENTER);
				JButton ok = new JButton("Ок");
				ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						setVisible(false);
                                                
					}
				});
				JPanel panel = new JPanel();
				panel.add(ok);
				add(panel, BorderLayout.SOUTH);
				setSize(280, 220);           
	}
}
public class NewJFrame extends javax.swing.JFrame {
    private AboutDialog dialog;
    
    public NewJFrame() {
        initComponents();
    }
    static boolean tt = true;
    private void Check(javax.swing.JButton a, javax.swing.JPanel b)
    {
        if(((a.getX() == b.getX() + 96) && (a.getY() == b.getY())) || ((a.getX() == b.getX() - 96) && (a.getY() == b.getY())) || ((a.getY() == b.getY() + 96) && (a.getX() == b.getX())) || ((a.getY() == b.getY() - 96) && (a.getX() == b.getX())) )
        {
            int x = a.getX(), y = a.getY();
            a.setLocation(b.getX(), b.getY());
            b.setLocation(x, y);
        }       
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Пятнашки");
        setBackground(new java.awt.Color(0, 0, 255));
        setBounds(new java.awt.Rectangle(2, 2, 0, 0));
        setMaximumSize(new java.awt.Dimension(380, 380));
        setMinimumSize(new java.awt.Dimension(380, 380));
        setResizable(false);
        setSize(new java.awt.Dimension(380, 380));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(380, 380));
        jPanel1.setMinimumSize(new java.awt.Dimension(380, 380));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 380));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("1");
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton1.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton1.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton2.setText("2");
        jButton2.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton2.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton3.setText("3");
        jButton3.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton3.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton4.setText("4");
        jButton4.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton4.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton5.setText("5");
        jButton5.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton5.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton6.setText("6");
        jButton6.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton6.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton7.setText("7");
        jButton7.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton7.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton8.setText("8");
        jButton8.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton8.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton9.setText("9");
        jButton9.setToolTipText("13");
        jButton9.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton9.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton10.setText("10");
        jButton10.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton10.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton11.setText("11");
        jButton11.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton11.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton12.setText("12");
        jButton12.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton12.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton13.setText("13");
        jButton13.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton13.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton14.setText("14");
        jButton14.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton14.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton14MousePressed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton15.setText("15");
        jButton15.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton15.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton15MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(90, 90));
        jPanel2.setMinimumSize(new java.awt.Dimension(90, 90));
        jPanel2.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(tt)
        {
        int mesh[][]={{0,0},{96,0},{192,0},{288,0},{0,96},{96,96},{192,96},{288,96},{0,192},{96,192},{192,192},{288,192},{0,288},{96,288},{192,288},{288,288}};
        for (int i = 0; i < 16; i++) {
			int r = i + (int)(Math.random() * (16-i));
			int temp = mesh[r][0];
			mesh[r][0] = mesh[i][0];
			mesh[i][0] = temp;
			temp = mesh[r][1];
			mesh[r][1] = mesh[i][1];
			mesh[i][1] = temp;
		}
        jButton1.setLocation(mesh[0][0], mesh[0][1]);
        jButton2.setLocation(mesh[1][0], mesh[1][1]);
        jButton3.setLocation(mesh[2][0], mesh[2][1]);
        jButton4.setLocation(mesh[3][0], mesh[3][1]);
        jButton5.setLocation(mesh[4][0], mesh[4][1]);
        jButton6.setLocation(mesh[5][0], mesh[5][1]);
        jButton7.setLocation(mesh[6][0], mesh[6][1]);
        jButton8.setLocation(mesh[7][0], mesh[7][1]);
        jButton9.setLocation(mesh[8][0], mesh[8][1]);
        jButton10.setLocation(mesh[9][0], mesh[9][1]);
        jButton11.setLocation(mesh[10][0], mesh[10][1]);
        jButton12.setLocation(mesh[11][0], mesh[11][1]);
        jButton13.setLocation(mesh[12][0], mesh[12][1]);
        jButton14.setLocation(mesh[13][0], mesh[13][1]);
        jButton15.setLocation(mesh[14][0], mesh[14][1]);
        jPanel2.setLocation(mesh[15][0], mesh[15][1]);
        tt = false;
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MousePressed
        Check(jButton15,jPanel2);
        if(jButton1.getX() == 0 && jButton1.getY() == 0 &&
            jButton2.getX() == 96 && jButton2.getY() == 0 &&
            jButton3.getX() == 192 && jButton3.getY() == 0 &&
            jButton4.getX() == 288 && jButton4.getY() == 0 &&
            jButton5.getX() == 0 && jButton5.getY() == 96 &&
            jButton6.getX() == 96 && jButton6.getY() == 96 &&
            jButton7.getX() == 192 && jButton7.getY() == 96 &&
            jButton8.getX() == 288 && jButton8.getY() == 96 &&
            jButton9.getX() == 0 && jButton9.getY() == 192 &&
            jButton10.getX() == 96 && jButton10.getY() == 192 &&
            jButton11.getX() == 192 && jButton11.getY() == 192 &&
            jButton12.getX() == 288 && jButton12.getY() == 192 &&
            jButton13.getX() == 0 && jButton13.getY() == 288 &&
            jButton14.getX() == 96 && jButton14.getY() == 288 &&
            jButton15.getX() == 288 && jButton15.getY() == 288)
            {
                dialog = new AboutDialog(NewJFrame.this);
                dialog.setVisible(true);
                tt = true;
            }
    }//GEN-LAST:event_jButton15MousePressed

    private void jButton14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MousePressed
        Check(jButton14,jPanel2);
        if(jButton1.getX() == 0 && jButton1.getY() == 0 &&
            jButton2.getX() == 96 && jButton2.getY() == 0 &&
            jButton3.getX() == 192 && jButton3.getY() == 0 &&
            jButton4.getX() == 288 && jButton4.getY() == 0 &&
            jButton5.getX() == 0 && jButton5.getY() == 96 &&
            jButton6.getX() == 96 && jButton6.getY() == 96 &&
            jButton7.getX() == 192 && jButton7.getY() == 96 &&
            jButton8.getX() == 288 && jButton8.getY() == 96 &&
            jButton9.getX() == 0 && jButton9.getY() == 192 &&
            jButton10.getX() == 96 && jButton10.getY() == 192 &&
            jButton11.getX() == 192 && jButton11.getY() == 192 &&
            jButton12.getX() == 288 && jButton12.getY() == 192 &&
            jButton13.getX() == 0 && jButton13.getY() == 288 &&
            jButton14.getX() == 96 && jButton14.getY() == 288 &&
            jButton15.getX() == 288 && jButton15.getY() == 288)
            {
                dialog = new AboutDialog(NewJFrame.this);
                dialog.setVisible(true);
                tt = true;
            }
    }//GEN-LAST:event_jButton14MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        Check(jButton1,jPanel2);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        Check(jButton2,jPanel2);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        Check(jButton3,jPanel2);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        Check(jButton4,jPanel2);
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        Check(jButton5,jPanel2);
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        Check(jButton6,jPanel2);
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        Check(jButton7,jPanel2);
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        Check(jButton8,jPanel2);
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        Check(jButton9,jPanel2);
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
        Check(jButton10,jPanel2);
        if(jButton1.getX() == 0 && jButton1.getY() == 0 &&
            jButton2.getX() == 96 && jButton2.getY() == 0 &&
            jButton3.getX() == 192 && jButton3.getY() == 0 &&
            jButton4.getX() == 288 && jButton4.getY() == 0 &&
            jButton5.getX() == 0 && jButton5.getY() == 96 &&
            jButton6.getX() == 96 && jButton6.getY() == 96 &&
            jButton7.getX() == 192 && jButton7.getY() == 96 &&
            jButton8.getX() == 288 && jButton8.getY() == 96 &&
            jButton9.getX() == 0 && jButton9.getY() == 192 &&
            jButton10.getX() == 96 && jButton10.getY() == 192 &&
            jButton11.getX() == 192 && jButton11.getY() == 192 &&
            jButton12.getX() == 288 && jButton12.getY() == 192 &&
            jButton13.getX() == 0 && jButton13.getY() == 288 &&
            jButton14.getX() == 96 && jButton14.getY() == 288 &&
            jButton15.getX() == 288 && jButton15.getY() == 288)
            {
                dialog = new AboutDialog(NewJFrame.this);
                dialog.setVisible(true);
                tt = true;
            }
    }//GEN-LAST:event_jButton10MousePressed

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
        Check(jButton11,jPanel2);
        if(jButton1.getX() == 0 && jButton1.getY() == 0 &&
            jButton2.getX() == 96 && jButton2.getY() == 0 &&
            jButton3.getX() == 192 && jButton3.getY() == 0 &&
            jButton4.getX() == 288 && jButton4.getY() == 0 &&
            jButton5.getX() == 0 && jButton5.getY() == 96 &&
            jButton6.getX() == 96 && jButton6.getY() == 96 &&
            jButton7.getX() == 192 && jButton7.getY() == 96 &&
            jButton8.getX() == 288 && jButton8.getY() == 96 &&
            jButton9.getX() == 0 && jButton9.getY() == 192 &&
            jButton10.getX() == 96 && jButton10.getY() == 192 &&
            jButton11.getX() == 192 && jButton11.getY() == 192 &&
            jButton12.getX() == 288 && jButton12.getY() == 192 &&
            jButton13.getX() == 0 && jButton13.getY() == 288 &&
            jButton14.getX() == 96 && jButton14.getY() == 288 &&
            jButton15.getX() == 288 && jButton15.getY() == 288)
            {
                dialog = new AboutDialog(NewJFrame.this);
                dialog.setVisible(true);
                tt = true;
            }
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MousePressed
        Check(jButton12,jPanel2);
        if(jButton1.getX() == 0 && jButton1.getY() == 0 &&
            jButton2.getX() == 96 && jButton2.getY() == 0 &&
            jButton3.getX() == 192 && jButton3.getY() == 0 &&
            jButton4.getX() == 288 && jButton4.getY() == 0 &&
            jButton5.getX() == 0 && jButton5.getY() == 96 &&
            jButton6.getX() == 96 && jButton6.getY() == 96 &&
            jButton7.getX() == 192 && jButton7.getY() == 96 &&
            jButton8.getX() == 288 && jButton8.getY() == 96 &&
            jButton9.getX() == 0 && jButton9.getY() == 192 &&
            jButton10.getX() == 96 && jButton10.getY() == 192 &&
            jButton11.getX() == 192 && jButton11.getY() == 192 &&
            jButton12.getX() == 288 && jButton12.getY() == 192 &&
            jButton13.getX() == 0 && jButton13.getY() == 288 &&
            jButton14.getX() == 96 && jButton14.getY() == 288 &&
            jButton15.getX() == 288 && jButton15.getY() == 288)
            {
                dialog = new AboutDialog(NewJFrame.this);
                dialog.setVisible(true);
                tt = true;
            }
    }//GEN-LAST:event_jButton12MousePressed

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
        Check(jButton13,jPanel2);
    }//GEN-LAST:event_jButton13MousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    if(!dialog.isVisible()&&tt)
            {
                int mesh[][]={{0,0},{96,0},{192,0},{288,0},{0,96},{96,96},{192,96},{288,96},{0,192},{96,192},{192,192},{288,192},{0,288},{96,288},{192,288},{288,288}};
        for (int i = 0; i < 16; i++) {
			int r = i + (int)(Math.random() * (16-i));
			int temp = mesh[r][0];
			mesh[r][0] = mesh[i][0];
			mesh[i][0] = temp;
			temp = mesh[r][1];
			mesh[r][1] = mesh[i][1];
			mesh[i][1] = temp;
		}
        jButton1.setBounds(mesh[0][0], mesh[0][1], 90, 90);
        jButton2.setBounds(mesh[1][0], mesh[1][1], 90, 90);
        jButton3.setBounds(mesh[2][0], mesh[2][1], 90, 90);
        jButton4.setBounds(mesh[3][0], mesh[3][1], 90, 90);
        jButton5.setBounds(mesh[4][0], mesh[4][1], 90, 90);
        jButton6.setBounds(mesh[5][0], mesh[5][1], 90, 90);
        jButton7.setBounds(mesh[6][0], mesh[6][1], 90, 90);
        jButton8.setBounds(mesh[7][0], mesh[7][1], 90, 90);
        jButton9.setBounds(mesh[8][0], mesh[8][1], 90, 90);
        jButton10.setBounds(mesh[9][0], mesh[9][1], 90, 90);
        jButton11.setBounds(mesh[10][0], mesh[10][1], 90, 90);
        jButton12.setBounds(mesh[11][0], mesh[11][1], 90, 90);
        jButton13.setBounds(mesh[12][0], mesh[12][1], 90, 90);
        jButton14.setBounds(mesh[13][0], mesh[13][1], 90, 90);
        jButton15.setBounds(mesh[14][0], mesh[14][1], 90, 90);
        jPanel2.setBounds(mesh[15][0], mesh[15][1], 90, 90);
        tt = false;
            }
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
