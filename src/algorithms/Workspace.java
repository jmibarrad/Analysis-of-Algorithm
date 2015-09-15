
package algorithms;

import ext.JGraphModelAdapter;
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
public class Workspace extends javax.swing.JFrame implements ActionListener{

    public Workspace() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        tabPane = new javax.swing.JTabbedPane();
        pnlPrim = new javax.swing.JPanel();
        pnlKnap = new javax.swing.JPanel();
        lblPrev = new javax.swing.JLabel();
        lblPlay = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tabPane.setBackground(new java.awt.Color(51, 204, 0));

        pnlPrim.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrim.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));

        javax.swing.GroupLayout pnlPrimLayout = new javax.swing.GroupLayout(pnlPrim);
        pnlPrim.setLayout(pnlPrimLayout);
        pnlPrimLayout.setHorizontalGroup(
            pnlPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        pnlPrimLayout.setVerticalGroup(
            pnlPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        tabPane.addTab("Prim", pnlPrim);

        pnlKnap.setBackground(new java.awt.Color(255, 255, 255));
        pnlKnap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        javax.swing.GroupLayout pnlKnapLayout = new javax.swing.GroupLayout(pnlKnap);
        pnlKnap.setLayout(pnlKnapLayout);
        pnlKnapLayout.setHorizontalGroup(
            pnlKnapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        pnlKnapLayout.setVerticalGroup(
            pnlKnapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        tabPane.addTab("Knapsack", pnlKnap);

        lblPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algorithms/prev.png"))); // NOI18N

        lblPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algorithms/play2.png"))); // NOI18N

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algorithms/next.png"))); // NOI18N

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
                .addComponent(lblPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNext)
                    .addComponent(lblPrev)
                    .addComponent(lblPlay))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabPane)))
                .addContainerGap())
        );

        tabPane.getAccessibleContext().setAccessibleDescription("");
        lblPrev.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblPlay;
    private javax.swing.JLabel lblPrev;
    private javax.swing.JPanel pnlKnap;
    private javax.swing.JPanel pnlPrim;
    private javax.swing.JTabbedPane tabPane;
    // End of variables declaration//GEN-END:variables

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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== lblPlay){
            isPlaying = !isPlaying;
            if(!isPlaying){
                timer.stop();
                return;
            }

            startAlgorithm();
        }
    }
    
    
    public void GraphFactory(){
    
        g = new ListenableUndirectedWeightedGraph<>(DefaultWeightedEdge.class);

        jgAdapter = new JGraphModelAdapter<>(g);
       
        JGraph jgraph = new JGraph(jgAdapter);
        jgraph.setDisconnectOnMove(false);
        jgraph.setSizeable(false);
        jgraph.setEdgeLabelsMovable(false);
        adjustDisplaySettings(jgraph);

        pnlPrim.add(jgraph);
        
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

        jgraph.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getClickCount() == 1 && e.getButton() == MouseEvent.BUTTON2){
                    startAlgorithm();
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
                    DefaultGraphCell s =(DefaultGraphCell)source;
                    //s.
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
        paintGraphPosition();
    }
    
    private void adjustDisplaySettings(JGraph jg)
    {
        jg.setPreferredSize(DEFAULT_SIZE);
        jg.setBackground(Color.WHITE);
        jg.setAntiAliased(true);
    }

    @SuppressWarnings("unchecked") // FIXME hb 28-nov-05: See FIXME below
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

        // TODO: Clean up generics once JGraph goes generic
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
            GraphConstants.setForeground(attr, Color.WHITE);
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
    
    private void startAlgorithm(){
        launchPrim();
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
