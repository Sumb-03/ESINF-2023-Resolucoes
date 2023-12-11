package examples.map;

import graph.*;
import graph.map.MapGraph;

import java.util.*;

/**
 *
 * @author DEI-ESINF
 *
 */
public class AirportNet {

    private static class Route {
        public final int passengers;
        public final double miles;

        public Route(int passengers, double miles) {
            this.passengers = passengers;
            this.miles = miles;
        }
    }

    final private Graph<String, Route> airports;

    public AirportNet(){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addAirport(String a){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addRoute(String a1, String a2, double miles, Integer passengers){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int keyAirport(String airport){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String airportbyKey(int key){

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Integer trafficAirports(String airp1, String airp2){

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Double milesAirports(String airp1, String airp2){

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Map<String,Integer> nroutesAirport(){

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<ArrayList<String>> airpMaxMiles( ){

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean connectAirports(String airport1, String airport2){

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return airports.toString();
    }
}