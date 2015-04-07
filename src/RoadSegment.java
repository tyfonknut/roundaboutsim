import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class RoadSegment implements Road
{
    boolean freeIndex;
    vehicleList list;
    ArrayList<Integer> segment;

    public RoadSegment()
    {
        segment = new ArrayList<Integer>(10);
        list = new vehicleList();
    }

    public void spawnVehicle()
    {
        Vehicle vehicle = new Vehicle(this, 0);
        list.addVehicle(vehicle);
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
       return list.isItFree(index);
    }

    private void simulateOneStep()
    {
        list.simulateOneStep();
    }

}
