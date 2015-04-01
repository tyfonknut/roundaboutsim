import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Robin on 25.03.2015.
 */
public class RoadSegment implements Road
{
    boolean freeIndex;
    ArrayList<Vehicle> vehicleList;
    ArrayList<Integer> segment;

    public RoadSegment()
    {
        segment = new ArrayList<Integer>(10);
        vehicleList = new ArrayList<Vehicle>();
    }

    public void spawnVehicle()
    {
        Vehicle vehicle = new Vehicle(this, 0);
        vehicleList.add(vehicle);
    }

    public void simulate(int numSteps)
    {
        for(int step = 0;step < numSteps; step++)
        {
            spawnVehicle();
            simulateOneStep();
        }
    }

    public boolean seeIfFree(int index)
    {
        boolean isFree = true;
        for(Vehicle vehicle : vehicleList)
        {
            if(vehicle.getIndex() == index)
            {
                isFree = false;
            }
        }
        return isFree;
    }

    private void simulateOneStep()
    {

        for(Vehicle vehicle : vehicleList)
        {
            vehicle.act();
            System.out.print("Vehicle number: " + vehicleList.indexOf(vehicle));
            System.out.println(" On position: " + vehicle.getIndex());
        }
    }

}
