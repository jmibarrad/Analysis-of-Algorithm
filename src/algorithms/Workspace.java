
package algorithms;

import ext.JGraphModelAdapter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.jgraph.JGraph;
import org.jgraph.graph.AttributeMap;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultListenableGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

/**
 *
 * @author Ibarra
 */
public class Workspace extends javax.swing.JFrame{

    public Workspace() {
        initComponents();
        GraphFactory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        tabPane = new javax.swing.JTabbedPane();
        pnlPrim = new javax.swing.JPanel();
        pnlKnap = new javax.swing.JPanel();
        pbValue = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSet = new javax.swing.JTable();
        pbWeight = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCapacity = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblNext = new javax.swing.JLabel();
        lblPlay = new javax.swing.JLabel();
        lblPrev = new javax.swing.JLabel();
        pnlPrimOptions = new javax.swing.JPanel();
        lblMST = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        pnlKnapOptions = new javax.swing.JPanel();
        lblWeight = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCapacity = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuPrim = new javax.swing.JMenu();
        exPrim = new javax.swing.JMenuItem();
        menuKnap = new javax.swing.JMenu();
        exKnap = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tabPane.setBackground(new java.awt.Color(51, 204, 0));

        pnlPrim.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0), 3));

        javax.swing.GroupLayout pnlPrimLayout = new javax.swing.GroupLayout(pnlPrim);
        pnlPrim.setLayout(pnlPrimLayout);
        pnlPrimLayout.setHorizontalGroup(
            pnlPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        pnlPrimLayout.setVerticalGroup(
            pnlPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        tabPane.addTab("Prim", pnlPrim);

        pnlKnap.setBackground(new java.awt.Color(255, 255, 255));
        pnlKnap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));

        pbValue.setBackground(new java.awt.Color(255, 255, 255));
        pbValue.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pbValue.setForeground(new java.awt.Color(102, 204, 0));
        pbValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pbValue.setOpaque(true);
        pbValue.setString("0.00");
        pbValue.setStringPainted(true);

        tblSet.setAutoCreateRowSorter(true);
        tblSet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblSet.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblSet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Value", "Weight"
            }
        ));
        tblSet.setToolTipText("<html>\n<h4 style=\"color: blue\">Fill in table with ITEMS and their VALUE </h4>\n<table style=\"width:50%\">\n  <tr>\n     <th>Item</th>\n     <th>Value</th>\t\t\n  </tr>\n  <tr>\n    <td>Knife</td>\n    <td>50</td>\n  </tr>\n  <tr>\n    <td>Rope</td>\n    <td>90.0</td> \n  </tr>\n</table>");
        tblSet.setCellSelectionEnabled(true);
        tblSet.setGridColor(new java.awt.Color(0, 0, 0));
        tblSet.setRowHeight(20);
        tblSet.setSelectionBackground(new java.awt.Color(235, 232, 232));
        tblSet.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(tblSet);

        pbWeight.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pbWeight.setForeground(new java.awt.Color(255, 0, 51));
        pbWeight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pbWeight.setOpaque(true);
        pbWeight.setString("0.00");
        pbWeight.setStringPainted(true);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setText("Amount Value in Knapsack");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel6.setText("Weight Amount in Knapsack");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Knapsack Capacity:");

        txtCapacity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlKnapLayout = new javax.swing.GroupLayout(pnlKnap);
        pnlKnap.setLayout(pnlKnapLayout);
        pnlKnapLayout.setHorizontalGroup(
            pnlKnapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKnapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(pnlKnapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbValue, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        pnlKnapLayout.setVerticalGroup(
            pnlKnapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKnapLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(pnlKnapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKnapLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pbValue, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pbWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );

        tabPane.addTab("Knapsack", pnlKnap);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algorithms/next.png"))); // NOI18N
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });

        lblPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algorithms/play2.png"))); // NOI18N
        lblPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayMouseClicked(evt);
            }
        });

        lblPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algorithms/prev.png"))); // NOI18N
        lblPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrevMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNext)
                    .addComponent(lblPrev))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrimOptions.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrimOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true), "PRIM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        lblMST.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblMST.setText("-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Minimum Spanning Tree:");

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton3.setText("Clear Graph");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlPrimOptionsLayout = new javax.swing.GroupLayout(pnlPrimOptions);
        pnlPrimOptions.setLayout(pnlPrimOptionsLayout);
        pnlPrimOptionsLayout.setHorizontalGroup(
            pnlPrimOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrimOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrimOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrimOptionsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrimOptionsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMST, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrimOptionsLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        pnlPrimOptionsLayout.setVerticalGroup(
            pnlPrimOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrimOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMST)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlKnapOptions.setBackground(new java.awt.Color(255, 255, 255));
        pnlKnapOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 2, true), "Knapsack", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(204, 51, 0))); // NOI18N

        lblWeight.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        lblWeight.setText("-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel3.setText("Value");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Total Weight:");

        lblCapacity.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        lblCapacity.setText("-");

        jButton1.setText("Add Row");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Remove Row");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlKnapOptionsLayout = new javax.swing.GroupLayout(pnlKnapOptions);
        pnlKnapOptions.setLayout(pnlKnapOptionsLayout);
        pnlKnapOptionsLayout.setHorizontalGroup(
            pnlKnapOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKnapOptionsLayout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(4, 4, 4))
            .addGroup(pnlKnapOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKnapOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKnapOptionsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKnapOptionsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(lblWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlKnapOptionsLayout.setVerticalGroup(
            pnlKnapOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKnapOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKnapOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblCapacity))
                .addGap(18, 18, 18)
                .addGroup(pnlKnapOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblWeight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlKnapOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Examples");
        jMenu1.setToolTipText("");

        menuPrim.setText("Prim");

        exPrim.setText("Example #1");
        menuPrim.add(exPrim);

        jMenu1.add(menuPrim);

        menuKnap.setText("Knapsack");

        exKnap.setText("Example #1");
        menuKnap.add(exKnap);

        jMenu1.add(menuKnap);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPrimOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlKnapOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(pnlPrimOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(pnlKnapOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(tabPane))))
                .addContainerGap())
        );

        tabPane.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayMouseClicked
        if(tabPane.getSelectedIndex() == 0)
            startAlgorithm(1);
        else if(tabPane.getSelectedIndex() == 1){ 
            isKnapPlaying = true;
            playKnapsack();
        }    
    }//GEN-LAST:event_lblPlayMouseClicked

    private void lblPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrevMouseClicked
         startAlgorithm(2);
        
    }//GEN-LAST:event_lblPrevMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        startAlgorithm(3);
    }//GEN-LAST:event_lblNextMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tblSet.getModel();
        dtm.addRow(new Object[3]);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tblSet.getModel();
        dtm.removeRow(dtm.getRowCount()-1);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        g.removeAllVertices(g);
        count = 65;
        source = null; 
        destiny = null;
        hasSource = false;
        hasDestiny = false;
    }//GEN-LAST:event_jButton3MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Workspace().setVisible(true);
        });
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exKnap;
    private javax.swing.JMenuItem exPrim;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblMST;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblPlay;
    private javax.swing.JLabel lblPrev;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JMenu menuKnap;
    private javax.swing.JMenu menuPrim;
    private javax.swing.JProgressBar pbValue;
    private javax.swing.JProgressBar pbWeight;
    private javax.swing.JPanel pnlKnap;
    private javax.swing.JPanel pnlKnapOptions;
    private javax.swing.JPanel pnlPrim;
    private javax.swing.JPanel pnlPrimOptions;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTable tblSet;
    private javax.swing.JTextField txtCapacity;
    // End of variables declaration//GEN-END:variables

    private boolean primLaunched = false;
    private boolean knapLaunched = false;
    private static final Dimension DEFAULT_SIZE = new Dimension(1256, 700);
    private static int count = 65;
    protected ArrayList<ColorObjectStructure<String,DefaultWeightedEdge>> graphColorList;
    private JGraphModelAdapter jgAdapter;
    private Object source = null; 
    private Object destiny;
    private boolean hasSource = false;
    private boolean hasDestiny = false;
    private final JPanel panel = new JPanel();
    protected Set<String> vertexSet;
    protected Set<DefaultWeightedEdge> edgeSet;
    private int currentPosition = 0;
    private int currentPositionKnapsack = 0;
    private final boolean isPlaying = true;
    private boolean isKnapPlaying = false; 
    private Timer timer;
    private Timer timer2;
    private  ListenableUndirectedWeightedGraph<String, DefaultWeightedEdge> g;
    private KnapsackSolution ans;
    
    private void GraphFactory(){
    
        g = new ListenableUndirectedWeightedGraph<>(DefaultWeightedEdge.class);

        jgAdapter = new JGraphModelAdapter<>(g);
        
        JGraph jgraph = new JGraph(jgAdapter);
        jgraph.setDisconnectOnMove(false);
        jgraph.setSizeable(false);
        jgraph.setEdgeLabelsMovable(false);
        adjustDisplaySettings(jgraph);
        getContentPane().add(tabPane);
        pnlPrim.setLayout(new BorderLayout());
        pnlPrim.add(jgraph, BorderLayout.CENTER);
                
        jgraph.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1){
                    int x = e.getX();
                    int y = e.getY();

                    char vertexName = (char)(count++);                    
                    g.addVertex(String.valueOf(vertexName));
                    positionVertexAt(String.valueOf(vertexName), x, y);
                }  
            }
        });
        
        jgraph.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
              if (e.getClickCount() == 1 && e.getButton() == MouseEvent.BUTTON3) {

                int x = e.getX(), y = e.getY();
                if(!hasSource && source == null){
                    source = jgraph.getFirstCellForLocation(x, y);

                    if(source != null)
                        hasSource = true;
                }else if(hasSource && source != null){
                    destiny = jgraph.getFirstCellForLocation(x, y);
                    if(destiny != null){    
                        hasSource = false;
                        hasDestiny = true;
                    }
                }    
                
                if (hasDestiny) {
                    String s = jgraph.convertValueToString(source);
                    String d = jgraph.convertValueToString(destiny);
            
                    if(s.equals(d) && source != null){
                        JOptionPane.showMessageDialog(panel,
                                                      "Loops not Allowed: {"+source+":"+destiny+"}",
                                                      "Error", JOptionPane.ERROR_MESSAGE);
                    }else{    
                        if(g.getEdge(s, d) == null && g.getEdge(d, s) == null){
                            double weight = Double.parseDouble(JOptionPane.showInputDialog( panel,
                                                         "Enter weight for: {"+source+":"+destiny+"}",
                                                         "Customized Dialog",
                                                         JOptionPane.PLAIN_MESSAGE));
                            
                            g.setEdgeWeight(g.addEdge(s, d), weight);
                        }else
                           JOptionPane.showMessageDialog(panel,
                                                      "Already has Edge: {"+source+":"+destiny+"}",
                                                      "Error", JOptionPane.ERROR_MESSAGE); 
                    }
                    hasDestiny = false;
                    source = null;
                    destiny = null;
                }
              }
              primLaunched = false; //if a new vertex or edge is created prim has to be relaunch
            }
        });
        
    }
    
    private void launchPrim(){
        vertexSet = new HashSet<>();
        edgeSet = new HashSet<>();
        edgeSet =g.edgeSet();
        vertexSet = g.vertexSet();

        Prim<String,DefaultWeightedEdge> primMST = new Prim<>(g);
        primMST.getMinimumSpanningTreeEdgeSet();
        graphColorList = primMST.getGraphList();
        currentPosition = 0;
        lblMST.setText(String.valueOf(primMST.getMinimumSpanningTreeTotalWeight()));
        paintGraphPosition();
    }
    
    private void adjustDisplaySettings(JGraph jg)
    {
        jg.setPreferredSize(DEFAULT_SIZE);
        jg.setBackground(Color.WHITE);
        jg.setAntiAliased(true);
    }

    @SuppressWarnings("unchecked")
    private void positionVertexAt(Object vertex, int x, int y)
    {
        DefaultGraphCell cell = jgAdapter.getVertexCell(vertex);
        AttributeMap attr = cell.getAttributes();
        
        Rectangle2D newBounds = new Rectangle2D.Double(x, y, 50, 30);

        GraphConstants.setBounds(attr, newBounds);
        GraphConstants.setBackground(attr, Color.white);
        GraphConstants.setForeground(attr, Color.red);
        GraphConstants.setFont(attr, new Font("Calibri", Font.BOLD, 14));
        GraphConstants.setBorder(attr, 
                                BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));

        AttributeMap cellAttr = new AttributeMap();
        cellAttr.put(cell, attr);
        jgAdapter.edit(cellAttr, null, null, null);
    }
   
    private void paintGraphPosition(){
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.LIGHT_GRAY);

        if(currentPosition > graphColorList.size()-1 || currentPosition < 0){
            return;
        }

        for (String aVertexSet : vertexSet) {
            changeVertexColor(aVertexSet, Color.WHITE);
        }

        for (DefaultWeightedEdge edge : edgeSet) {
            changeEdgeColor(edge, Color.LIGHT_GRAY);
        }

        Iterator<Color> colorIterator = colors.iterator();

        for(Set<String> stringSet:graphColorList.get(currentPosition).vertexColors){
            Color actualColor = colorIterator.next();

            for (String aStringSet : stringSet) {
                changeVertexColor(aStringSet, actualColor);
            }
        }

        colorIterator = colors.iterator();

        for(Set<DefaultWeightedEdge> edgeSet:graphColorList.get(currentPosition).edgeColors){
            Color currentColor = colorIterator.next();

            for (DefaultWeightedEdge anEdgeSet : edgeSet) {
                changeEdgeColor(anEdgeSet, currentColor);
            }
        }

    }
    
    private void changeVertexColor(Object vertex, Color color)
    {
        DefaultGraphCell cell = jgAdapter.getVertexCell(vertex);
        AttributeMap attr = cell.getAttributes();
        
        if(!color.equals(Color.WHITE))
            GraphConstants.setForeground(attr, Color.BLACK);
        GraphConstants.setBackground(attr,color);

        AttributeMap cellAttr = new AttributeMap();
        cellAttr.put(cell, attr);
        jgAdapter.edit(cellAttr, null, null, null);
    }
    
    private void changeEdgeColor(DefaultWeightedEdge edge, Color color)
    {
        DefaultGraphCell cell = jgAdapter.getEdgeCell(edge);
        AttributeMap attr = cell.getAttributes();

        GraphConstants.setLineColor(attr,color);
        GraphConstants.setBorderColor(attr, color);
        GraphConstants.setForeground(attr, color);

        AttributeMap cellAttr = new AttributeMap();
        cellAttr.put(cell, attr);
        jgAdapter.edit(cellAttr, null, null, null);
    }
    
    private void startAlgorithm(int actionIndex){
        if(!primLaunched){
            launchPrim();
            primLaunched = true;
        }   

        if(actionIndex == 1)
            play();
        else if( actionIndex == 2){
            if(currentPosition > 0)
                currentPosition--;
            paintGraphPosition();
        }else{
            currentPosition++;
            paintGraphPosition();
        }
    }
    
    private void play(){
        ActionListener a = (ActionEvent evt) -> {
            if(isPlaying && (graphColorList.size() > currentPosition)){
                currentPosition++;
                paintGraphPosition();
            }else{
                timer.stop();
            }
        };

        timer = new Timer(1000, a);
        timer.start();
    }

    List<Color> rowColours = Arrays.asList(
        Color.GREEN,
        Color.GREEN,
        Color.GREEN
    );
    
    private void playKnapsack(){
        if(!knapLaunched){
            launchKnapsack();
            knapLaunched = true;
        } 
        
        ActionListener a = (ActionEvent evt) -> {
            
            if(isKnapPlaying && currentPositionKnapsack < lengthknapsack){
                paintTable();
                currentPositionKnapsack++;
            }else{
                timer2.stop();
                isKnapPlaying = false;
            }
            
        };

        timer2 = new Timer(1000, a);
        timer2.start();
    }
    
    public List<Item> getTableData () {
        DefaultTableModel dtm = (DefaultTableModel) tblSet.getModel();
        int nRow = dtm.getRowCount();
        List<Item> items = new LinkedList<>();
        tblSet.setDefaultRenderer(Object.class, renderer);

        for (int i = 0; i < nRow; i++){
            Item newItem = new Item();
            newItem.label = String.valueOf(dtm.getValueAt(i,0));
            newItem.value = Double.parseDouble(String.valueOf(dtm.getValueAt(i,1)));
            newItem.weight = Double.parseDouble(String.valueOf(dtm.getValueAt(i,2)));
            newItem.row = i;
            
            items.add(newItem);
        }
        
        setProgressBarsMaximumValues(items);
        pbValue.setMaximum((int)maxValuePB);
        pbWeight.setMaximum((int)maxWeightPB);
        return items;
    }
       
    TableCellRenderer renderer = new TableCellRenderer() {
        JLabel label = new JLabel();

        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus,
                int row, int column) {
                               
                label.setOpaque(true);
                label.setText(value.toString());
                if(isKnapPlaying){
                    label.setForeground(Color.WHITE);
                    label.setBackground(Color.GREEN);
                }else{
                    if(row % 2 == 0){
                        label.setForeground(Color.BLACK);
                        label.setBackground(new Color(242, 242, 242));
                    }else{
                        label.setForeground(Color.BLACK);
                        label.setBackground(Color.WHITE);
                    }    
                }
            return label;
        }
                        
    };
    
    public void launchKnapsack(){
        int capacity = Integer.parseInt(txtCapacity.getText());
        DynamicProgrammingSolver dps = new DynamicProgrammingSolver(getTableData(), capacity);
        ans = dps.solve();
        lblWeight.setText(String.valueOf(ans.weight));
        lblCapacity.setText(String.valueOf(ans.value));
       lengthknapsack = ans.items.size();
    }
    
    int maxValuePB = 0; 
    int maxWeightPB = 0;     
    public void setProgressBarsMaximumValues(List<Item> items){
        double maxWeight = 0;        
        double maxValue = 0;   
        for(Item item: items){
            maxValue += item.value;
            maxWeight += item.weight;
        }
        maxValuePB = (int)Math.ceil(maxValue);
        maxWeightPB = (int)Math.ceil(maxWeight);
    }

    List<Double> weightStep = new ArrayList<>();
    List<Double> valueStep = new ArrayList<>();
    double tempWeight = 0;
    double tempValue = 0;
    private int lengthknapsack = 0;
    
    void paintTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblSet.getModel();
        tempValue += ans.items.get(currentPositionKnapsack).value;
        tempWeight += ans.items.get(currentPositionKnapsack).weight;       
        
        pbWeight.setValue((int)tempWeight);
        pbValue.setValue((int)tempValue);
        pbWeight.setString(String.valueOf(tempWeight));
        pbValue.setString(String.valueOf(tempValue));
        
        int row = ans.items.get(currentPositionKnapsack).row;
        dtm.fireTableRowsUpdated(row , row);
    }

}

class ListenableUndirectedWeightedGraph<V, E> extends DefaultListenableGraph<V, E> implements UndirectedGraph<V, E> 
{
    private static final long serialVersionUID = 1L;

    ListenableUndirectedWeightedGraph(Class<E> edgeClass)
    {
        super(new SimpleWeightedGraph<>(edgeClass));
    }
}
