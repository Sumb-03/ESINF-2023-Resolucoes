package examples.map;

import graph.Graph;
import graph.map.MapGraph;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    void checkSequence() {
        Graph<Integer,Character> g = new MapGraph<>(true);
        g.addEdge(0,11, 'i');
        g.addEdge(0,15, 'A');
        g.addEdge(0,101, 't');
        g.addEdge(101,7, 'o');
        g.addEdge(101,102, 'e');
        g.addEdge(11,5, 'n');
        g.addEdge(102,3, 'a');
        g.addEdge(102,4, 'd');
        g.addEdge(102,12, 'n');
        g.addEdge(5,9, 'n');

        assertEquals(7, Trie.checkSequence(g, "to".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(3, Trie.checkSequence(g, "tea".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(4, Trie.checkSequence(g, "ted".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(12, Trie.checkSequence(g, "ten".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(15, Trie.checkSequence(g, "A".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(11, Trie.checkSequence(g, "i".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(5, Trie.checkSequence(g, "in".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(9, Trie.checkSequence(g, "inn".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));

        assertEquals(-1, Trie.checkSequence(g, "t".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(-1, Trie.checkSequence(g, "te".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(-1, Trie.checkSequence(g, "x".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(-1, Trie.checkSequence(g, "tent".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
        assertEquals(-1, Trie.checkSequence(g, "Al".chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
    }
}