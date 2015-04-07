import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class Roundabout implements Road
{
    VehicleList vehicleList;
    ArrayList<Integer> roundabout;

    public Roundabout(int roundaboutSize, VehicleList list)
    {
        vehicleList = list;
        roundabout = new ArrayList<Integer>(roundaboutSize);

        for(int i = 0;i <= roundaboutSize;i++)
        {
            if(i%25==0)
            {
                RoadSegment segment = new RoadSegment(vehicleList);
            }
        }
    }


    public void spawnVehicle()
    {
        Vehicle vehicle = new Vehicle(this, 0);
        vehicleList.addVehicle(vehicle);
    }

    public void simulate(int numSteps)
    {
        for(int step = 0;step < numSteps; step++)
        {
            spawnVehicle();
            simulateOneStep();
        }
    }

    private void simulateOneStep()
    {
        vehicleList.simulateOneStep();
    }
}
