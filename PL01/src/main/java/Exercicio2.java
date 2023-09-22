public class Exercicio2 {
    public static int[][] recursiveBacktracking(int[][] actual, int y, int x) {
        // is (x,y) a valid position? => if not, null
        if (!isvalidPosition(actual, y, x)) return null;

        // marcar posição com 9
        actual[y][x] = 9;

        // is final position?
        if (y == actual.length - 1 && x == actual[0].length - 1) {
            return actual;
        }


        // Tentar o Norte
        int[][] r = recursiveBacktracking(actual, y - 1, x);
        // cheguei ao fim? Se sim, termina e devolve actual, senão continua
        if (r != null) {
            return actual;
        }

        // Tentar o leste
        r = recursiveBacktracking(actual, y, x + 1);
        // cheguei ao fim? Se sim, termina e devolve actual, senão continua
        if (r != null) {
            return actual;
        }

        // Tentar o sul
        r = recursiveBacktracking(actual, y + 1, x);
        // cheguei ao fim? Se sim, termina e devolve actual, senão continua
        if (r != null) {
            return actual;
        }

        // Tentar o oeste
        r = recursiveBacktracking(actual, y, x - 1);
        // cheguei ao fim? Se sim, termina e devolve actual, senão continua
        if (r != null) {
            return actual;
        }

        // marcar posição com 2
        actual[y][x] = 2;
        // devolver null
        return null;
    }

    private static boolean isvalidPosition(int[][] actual, int y, int x) {
        // is (x,y) a valid position? => if not, null
        if (y < 0 || y >= actual.length) return false;
        if (x < 0 || x >= actual[y].length) return false;
        if (actual[y][x] != 1) return false;

        return true;
    }
}
