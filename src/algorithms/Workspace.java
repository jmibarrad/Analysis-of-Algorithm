
package algorithms;

import ext.JGraphModelAdapter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
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
        jPanel1 = new javax.swing.JPanel();
        lblNext = new javax.swing.JLabel();
        lblPlay = new javax.swing.JLabel();
        lblPrev = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMST = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblWeight = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCapacity = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tabPane.setBackground(new java.awt.Color(51, 204, 0));

        pnlPrim.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrim.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 3, true));

        javax.swing.GroupLayout pnlPrimLayout = new javax.swing.GroupLayout(pnlPrim);
        pnlPrim.setLayout(pnlPrimLayout);
        pnlPrimLayout.setHorizontalGroup(
            pnlPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        pnlPrimLayout.setVerticalGroup(
            pnlPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        tabPane.addTab("Prim", pnlPrim);

        pnlKnap.setBackground(new java.awt.Color(255, 255, 255));
        pnlKnap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));

        javax.swing.GroupLayout pnlKnapLayout = new javax.swing.GroupLayout(pnlKnap);
        pnlKnap.setLayout(pnlKnapLayout);
        pnlKnapLayout.setHorizontalGroup(
            pnlKnapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        pnlKnapLayout.setVerticalGroup(
            pnlKnapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
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

        lblPrev.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true), "PRIM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        lblMST.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblMST.setText("-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Minimum Spanning Tree:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMST, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMST, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 0), 2, true), "Knapsack", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(204, 51, 0))); // NOI18N

        lblWeight.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblWeight.setText("-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel3.setText("Capacity:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Total Weight:");

        lblCapacity.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblCapacity.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblCapacity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblWeight))
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenu1.setToolTipText("");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(tabPane))
                .addContainerGap())
        );

        tabPane.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayMouseClicked
        startAlgorithm(1);
    }//GEN-LAST:event_lblPlayMouseClicked

    private void lblPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrevMouseClicked
         startAlgorithm(2);
        
    }//GEN-LAST:event_lblPrevMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        startAlgorithm(3);
    }//GEN-LAST:event_lblNextMouseClicked

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblMST;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblPlay;
    private javax.swing.JLabel lblPrev;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JPanel pnlKnap;
    private javax.swing.JPanel pnlPrim;
    private javax.swing.JTabbedPane tabPane;
    // End of variables declaration//GEN-END:variables

    private boolean primLaunched = false;
    private static final Color DEFAULT_BG_COLOR = Color.decode("#FAFBFF");
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
    private boolean isPlaying = true;
    private Timer timer;
    private  ListenableUndirectedWeightedGraph<String, DefaultWeightedEdge> g ;   
    
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

}

class ListenableUndirectedWeightedGraph<V, E> extends DefaultListenableGraph<V, E> implements UndirectedGraph<V, E> 
{
    private static final long serialVersionUID = 1L;

    ListenableUndirectedWeightedGraph(Class<E> edgeClass)
    {
        super(new SimpleWeightedGraph<>(edgeClass));
    }
}
