
package examples.matrix;

import graph.Edge;
import graph.Graph;
import graph.matrix.MatrixGraph;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BridgesTest {
    
    final Graph<Integer, Double> islands = new MatrixGraph<>(false);
    
    public BridgesTest() {
    }

    @BeforeEach
    public void setUp() {
	
        for (int i=1; i < 9; i++)
           islands.addVertex(i);
        
        islands.addEdge(1, 2, 240.0); islands.addEdge(1, 3, 210.0);
        islands.addEdge(1, 4, 340.0); islands.addEdge(1, 5, 280.0);
        islands.addEdge(1, 6, 200.0); islands.addEdge(1, 7, 345.0);
        islands.addEdge(1, 8, 120.0);
        
        islands.addEdge(2, 3, 265.0);
        islands.addEdge(2, 4, 175.0); islands.addEdge(2, 5, 215.0);
        islands.addEdge(2, 6, 180.0); islands.addEdge(2, 7, 185.0);
        islands.addEdge(2, 8, 155.0);
        
        islands.addEdge(3, 4, 260.0);
        islands.addEdge(3, 5, 115.0); islands.addEdge(3, 6, 350.0);
        islands.addEdge(3, 7, 435.0); islands.addEdge(3, 8, 195.0);
       
        islands.addEdge(4, 5, 160.0);
        islands.addEdge(4, 6, 330.0); islands.addEdge(4, 7, 295.0);
        islands.addEdge(4, 8, 230.0); 
        
        islands.addEdge(5, 6, 360.0);
        islands.addEdge(5, 7, 400.0); islands.addEdge(5, 8, 170.0);
        
        islands.addEdge(6, 7, 175.0); islands.addEdge(6, 8, 205.0); 
        
        islands.addEdge(7, 8, 305.0); 
    }
   
    /**
     * Test of PRIM algorithm.
     */
    @Test
    public void testmstPRIM() {
        System.out.println("Test mstPRIM");

        MatrixGraph<Integer, Double> mst = Bridges.mstPRIM(islands);
        
        System.out.println("\nÁrvore de Cobertura de Custo Mínimo usando o alg. Prim "+mst); 
       
        assertEquals((mst.numVertices()-1)*2, mst.numEdges(),"Number of edges should be 14");
       
        Double totlength=0.0;
        for (Edge<Integer,Double> edge : mst.edges()){
            totlength += edge.getWeight();
        }
        
        assertEquals(2150.0, totlength, "Total length Edges Should be 2150");
        
        Integer i=3, j=5;
        assertEquals(115.0, mst.edge(i,j).getWeight(), "Length Connection between 3 and 5 Should be 115");
        i=1; j=8;
        assertEquals(120.0, mst.edge(i,j).getWeight(), "Length Connection between 1 and 8 Should be 120");
        i=2; j=8;
        assertEquals(155.0, mst.edge(i,j).getWeight(), "Length Connection between 2 and 8 Should be 155");
        i=5; j=4;
        assertEquals(160.0, mst.edge(i,j).getWeight(), "Length Connection between 5 and 4 Should be 160");
        i=5; j=8;
        assertEquals(170.0, mst.edge(i,j).getWeight(), "Length Connection between 5 and 8 Should be 170");
        i=6; j=7;
        assertEquals(175.0, mst.edge(i,j).getWeight(), "Length Connection between 6 and 7 Should be 175");
        i=2; j=6;
        assertEquals(180.0, mst.edge(i,j).getWeight(), "Length Connection between 2 and 6 Should be 180");
        
    }
    
    /**
     * Test of Kruskall algorithm.
     */
    @Test
    public void testmstKruskall() {
        System.out.println("Test mstKruskal");

        MatrixGraph<Integer, Double> mst1 = Bridges.mstPRIM(islands);
        
        MatrixGraph<Integer, Double> mst2 = Bridges.mstKruskall(islands);
        
        System.out.println("\nÁrvore de Cobertura de Custo Mínimo usando o alg. Kruskall "+mst2); 
        
        assertTrue(mst1.equals(mst2),"both mst should be equals");
    }
           
}
