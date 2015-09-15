package algorithms;


import ext.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.*;
import org.jgraph.*;
import org.jgraph.graph.*;
import org.jgrapht.*;
import org.jgrapht.graph.*;

public class Main extends JApplet implements ActionListener
{
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
    private static JButton playPauseButton;
    private JPanel controlPanel;
    private  ListenableUndirectedWeightedGraph<String, DefaultWeightedEdge> g ;

    public static void main(String args[])
    {
        Main applet = new Main();
        applet.init();
        
        JFrame frame = new JFrame();
        frame.getContentPane().add(applet);
        frame.setTitle("Algorithm Analysis");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setMinimumSize(DEFAULT_SIZE);
        frame.setVisible(true);
        
            // <editor-fold defaultstate="collapsed" desc="mxGraph">                          
        /*
        graph = new mxGraph();
        graph.setAllowLoops(true);
        graph.setDisconnectOnMove(false);
        graph.setConnectableEdges(false);
        graph.setEdgeLabelsMovable(false);
        graphComponent = new mxGraphComponent(graph);
        graphComponent.getViewport().setBackground(Color.WHITE);      
        graphComponent.getGraphControl().addMouseListener(new MouseAdapter(){
           
            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                if(e.getClickCount() == 1){
                    long x = e.getX();
                    long y = e.getY();
                    graph.getModel().beginUpdate();    
                    try {
                        Object parent = graph.getDefaultParent();
                        String name = String.valueOf(count++);
                        Object v1 = graph.insertVertex(parent, null, "I"+name,x, y, 50, 50,
                                "resizable=0;editable=0;shape=ellipse;whiteSpace=wrap;"
                                +"fillColor=lightblue");
                        
                    } finally {
                        graph.getModel().endUpdate();
                    }
                }  
            }
        });
        graphComponent.setGraph(graph);*/// </editor-fold> 
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
    
    @Override
    public void init()
    {
        controlPanel = new JPanel();
        
        controlPanel.setPreferredSize(new Dimension(200, 300)); 
        controlPanel.setBackground(Color.BLACK);
        playPauseButton = new JButton("play");
        playPauseButton.setMnemonic(KeyEvent.VK_SPACE);
        playPauseButton.setActionCommand("play");
        playPauseButton.addActionListener(this);
        getContentPane().add(controlPanel);
        controlPanel.setVisible(true);
        playPauseButton.setVisible(true);
        playPauseButton.setSize(200, 300);
        
        g = new ListenableUndirectedWeightedGraph<>(DefaultWeightedEdge.class);

        jgAdapter = new JGraphModelAdapter<>(g);
       
        JGraph jgraph = new JGraph(jgAdapter);
        jgraph.setDisconnectOnMove(false);
        jgraph.setSizeable(false);
        jgraph.setEdgeLabelsMovable(false);
        adjustDisplaySettings(jgraph);

        getContentPane().add(jgraph);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        //launchPrim(g);
        if(e.getSource()==playPauseButton){
            isPlaying = !isPlaying;
            if(!isPlaying){
                timer.stop();
                return;
            }

            startAlgorithm();
        }
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

        Color c = DEFAULT_BG_COLOR;
        String colorStr = null;

        try {
            colorStr = getParameter("bgcolor");
        } catch (Exception e) {
        }

        if (colorStr != null) {
            c = Color.decode(colorStr);
        }

        jg.setBackground(c);
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
}



