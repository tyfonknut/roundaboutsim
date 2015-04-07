import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class RoadSegment implements Road
{
    VehicleList roadlist;
    ArrayList<Integer> segment;

    public RoadSegment(VehicleList list)
    {
        roadlist = list;
        segment = new ArrayList<Integer>(10);
    }

    public void spawnVehicle()
    {
        Vehicle vehicle = new Vehicle(this, 0);
        roadlist.addVehicle(vehicle);
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
       return roadlist.isItFree(index);
    }

    private void simulateOneStep()
    {
        roadlist.simulateOneStep();
    }

}
