package com.company.project1.model;

import com.company.project1.model.entities.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airline {
    List<Plane> planes;

    public Airline(){
        planes = new ArrayList<>();
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public void addPlane(Plane plane){
        if(plane!=null){
            planes.add(plane);
        }
    }

    public int calculateCapacity(){
        int sum=0;
        for (Plane plane:planes) {
            sum=sum+plane.getCapacity();
        }
        return sum;
    }

    public int calculateCarrying(){
        int sum=0;
        for(Plane plane: planes){
            sum=sum+plane.getCarrying();
        }
        return sum;
    }

    public List<Plane> sortByFlightLength(){
        List<Plane> planesCopy = new ArrayList<>(planes);
        ComparatorFlight comparatorFlight = new ComparatorFlight();
        //Collections.copy(planesCopy,planes);
        planesCopy.sort(comparatorFlight);
        return planesCopy;
    }

    public List<Plane> getPlanesInDiapasonFuel(int start, int end){
        List<Plane> planes1 = new ArrayList<>();
        for(Plane p: planes){
            if((p.getFuel()>=start)&&(p.getFuel()<=end)){
                planes1.add(p);
            }
        }
        return planes1;
    }

    public void initPlanesByStandart(){
        planes.add(new InternationalPlane("IntPlane1",569,1000,6000,900));
        planes.add(new TransportPlane("TransportPlane347",34,20000,800,7000,"Food"));
        planes.add(new RegionalPlane("RegPlane5674",380,700,5000,790));
        planes.add(new InternationalPlane("International9023",1000,40900,5000,1200));
        planes.add(new TransportPlane("TransportGigant456",345,82000,9000,9000,"Military Goods"));
    }
}
