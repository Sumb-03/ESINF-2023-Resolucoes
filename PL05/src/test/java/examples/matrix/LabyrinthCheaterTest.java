package examples.matrix;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LabyrinthCheaterTest {

    final LabyrinthCheater instance = new LabyrinthCheater();

    public LabyrinthCheaterTest() {
        for (String s : Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"))
            instance.insertRoom(s, (s.equals("E") || s.equals("J") || s.equals("K") || s.equals("S")));
        instance.insertDoor("A", "B");
        instance.insertDoor("A", "F");
        instance.insertDoor("B", "G");
        instance.insertDoor("C", "D");
        instance.insertDoor("C", "H");
        instance.insertDoor("D", "E");
        instance.insertDoor("D", "I");
        instance.insertDoor("F", "K");
        instance.insertDoor("G", "H");
        instance.insertDoor("I", "J");
        instance.insertDoor("K", "L");
        instance.insertDoor("L", "M");
        instance.insertDoor("L", "Q");
        instance.insertDoor("M", "N");
        instance.insertDoor("N", "S");
    }

    @Test
    void roomsInReach() {
        System.out.println("Test roomsInReach");
        List<String> l = new ArrayList<>(instance.roomsInReach("A"));
        List<String> le = Arrays.asList("A", "B", "G", "H", "C", "D", "E", "I", "J", "F", "K", "L", "M", "N", "S", "Q");

        Collections.sort(l);
        Collections.sort(le);

        assertEquals(le, l);
    }

    @Test
    void nearestExit() {
        System.out.println("Test nearestExit");

        assertEquals("K", instance.nearestExit("A"));
    }

    @Test
    void pathToExit() {
        assertEquals(Arrays.asList("A", "F", "K"), instance.pathToExit("A"));
    }
}