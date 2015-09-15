package algorithms;

import java.util.*;
import java.util.stream.Collectors;

import org.jgrapht.*;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.alg.util.*;


public class Prim<V, E> implements MinimumSpanningTree<V, E>
{
    public ArrayList<ColorObjectStructure<V, E>> getGraphList() {
        return graphList;
    }

    private ArrayList<ColorObjectStructure<V, E>> graphList;

    private double spanningTreeCost;
    private Set<E> edgeList;

    public Prim(final Graph<V, E> graph)
    {
        graphList = new ArrayList<>();
        UnionFind<V> forest = new UnionFind<>(graph.vertexSet());
        ArrayList<E> allEdges = new ArrayList<>(graph.edgeSet());
        Collections.sort(
            allEdges, (E edge1, E edge2) -> Double.valueOf(graph.getEdgeWeight(edge1)).compareTo(
                    graph.getEdgeWeight(edge2)));

        spanningTreeCost = 0;
        edgeList = new HashSet<>();
        Set<E> repeatedEdges = new HashSet<>();

        for (E edge : allEdges) {
            V source = graph.getEdgeSource(edge);
            V target = graph.getEdgeTarget(edge);

            ColorObjectStructure<V,E> newColorObject= new ColorObjectStructure<>();
            Set<V> vertexBeingEvaluated = new HashSet<>();
            vertexBeingEvaluated.add(source);
            vertexBeingEvaluated.add(target);
            Set<V> vertexesFirstRanked = new HashSet<>();
            for(E edgeAdded:edgeList){
                vertexesFirstRanked.add(graph.getEdgeSource(edgeAdded));
                vertexesFirstRanked.add(graph.getEdgeTarget(edgeAdded));
            }

            newColorObject.vertexColors.add(new HashSet<>());
            newColorObject.vertexColors.add(vertexesFirstRanked);
            newColorObject.vertexColors.add(vertexBeingEvaluated);

            Set<E> evaluatedEdge = new HashSet<>();
            evaluatedEdge.add(edge);
            Set<E> duplicateRepeatedEdge = repeatedEdges.stream().collect(Collectors.toSet());
            Set<E> duplicateFirstRankedEdge = edgeList.stream().collect(Collectors.toSet());

            newColorObject.edgeColors.add(duplicateRepeatedEdge);
            newColorObject.edgeColors.add(duplicateFirstRankedEdge);
            newColorObject.edgeColors.add(evaluatedEdge);
            graphList.add(newColorObject);



            if (forest.find(source).equals(forest.find(target))) {
                repeatedEdges.add(edge);
                continue;
            }

            forest.union(source, target);
            edgeList.add(edge);
            spanningTreeCost += graph.getEdgeWeight(edge);
        }

        ColorObjectStructure<V,E> objectColor= new ColorObjectStructure<>();
        Set<V> vertexesFirstRanked = new HashSet<>();
        for(E edgeAdded:edgeList){
            vertexesFirstRanked.add(graph.getEdgeSource(edgeAdded));
            vertexesFirstRanked.add(graph.getEdgeTarget(edgeAdded));
        }

        objectColor.vertexColors.add(new HashSet<>());
        objectColor.vertexColors.add(vertexesFirstRanked);

        Set<E> duplicateRepeatedEdge = repeatedEdges.stream().collect(Collectors.toSet());
        Set<E> duplicateFirstRankedEdge = edgeList.stream().collect(Collectors.toSet());

        objectColor.edgeColors.add(duplicateRepeatedEdge);
        objectColor.edgeColors.add(duplicateFirstRankedEdge);
        graphList.add(objectColor);

    }

    @Override public Set<E> getMinimumSpanningTreeEdgeSet()
    {
        return edgeList;
    }

    @Override public double getMinimumSpanningTreeTotalWeight()
    {
        return spanningTreeCost;
    }
}
