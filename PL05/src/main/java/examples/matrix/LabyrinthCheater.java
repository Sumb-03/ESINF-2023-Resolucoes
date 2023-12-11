package examples.matrix;

import graph.Algorithms;
import graph.Graph;
import graph.matrix.MatrixGraph;

import java.util.*;

public class LabyrinthCheater {
    private static class Room{
        public final String name;
        public final boolean hasExit;
        public Room(String n, boolean exit){
            name = n;
            hasExit = exit;
        }

        /*
         * Implementation of equals
         * Comparison of rooms is by name only
         */
        @Override
        public boolean equals(Object other){
            if(!(other instanceof Room)) return false;
            return name.equals(((Room)other).name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, hasExit);
        }
    }

    private static class Door{
    }

    private final Graph<Room, Door> gm;

    public LabyrinthCheater(){
        gm = new MatrixGraph<>(false);
    }

    /**
     * Inserts a new room in the map
     *
     * @param name the room name
     * @param hasExit wheather the room has an exit
     * @return false if city exists in the map
     */

    public boolean insertRoom(String name, boolean hasExit){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Inserts a new door in the map
     * fails if room does not exist or door already exists
     *
     * @param from room
     * @param to room
     *
     * @return false if a room does not exist or door already exists between rooms
     */

    public boolean insertDoor(String from, String to){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns a list of rooms which are reachable from one room
     *
     * @param room room
     *
     * @return list of room names or null if room does not exist
     */

    public Collection<String> roomsInReach(String room){

        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the nearest room with an exit
     *
     * @param room from room
     *
     * @return room name or null if from room does not exist or there is no reachable exit
     */

    public String nearestExit(String room){

        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the shortest path to the nearest room with an exit
     *
     * @param from from room
     *
     * @return list of room names or null if from room does not exist or there is no reachable exit
     */
    public LinkedList<String> pathToExit(String from){

        throw new UnsupportedOperationException("Not supported yet.");
    }

}
