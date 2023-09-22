import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

class Exercicio2Test {

    @Test
    void recursiveBacktracking() {
        System.out.println("check");
        int[][] actual = {
                {1,1,1,0,1,1,0,0,0,1,1,1,1},
                {1,0,1,1,1,0,1,1,1,1,1,0,1},
                {1,0,0,0,1,0,1,0,1,0,1,0,1},
                {1,0,0,0,1,1,1,0,1,0,1,1,1},
                {1,1,1,1,1,0,0,0,0,1,0,0,0},
                {0,0,0,0,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,1}
        };
        int y = 0;
        int x = 0;
        int[][] expResult = {
                {9,9,9,0,2,2,0,0,0,2,2,2,2},
                {1,0,9,9,9,0,2,2,2,2,2,0,2},
                {1,0,0,0,9,0,2,0,2,0,2,0,2},
                {1,0,0,0,9,2,2,0,2,0,2,2,2},
                {1,1,1,1,9,0,0,0,0,1,0,0,0},
                {0,0,0,0,9,0,0,0,0,0,0,0,0},
                {0,0,0,0,9,9,9,9,9,9,9,9,9}
        };
        int[][] result = Exercicio2.recursiveBacktracking(actual, y, x);
        assertArrayEquals(expResult, result);

        int [] [] impossibleActual = {
                {1,1,1,0,1,1,0,0,0,1,1,1,1},
                {1,0,1,1,1,0,1,1,1,1,1,0,1},
                {1,0,0,0,1,0,1,0,1,0,1,0,1},
                {1,0,0,0,1,1,1,0,1,0,1,1,1},
                {1,1,1,1,1,0,0,0,0,1,0,0,0},
                {0,0,0,0,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1}
        };
        expResult = null;
        result = Exercicio2.recursiveBacktracking(impossibleActual, y, x);
        assertArrayEquals(expResult, result);
    }
}