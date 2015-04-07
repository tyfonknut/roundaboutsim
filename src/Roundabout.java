import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class Roundabout implements Road
{
    VehicleList vehicleList;
    ArrayList<Vehicle> roundabout;

    Road segment;

    public Roundabout(int roundaboutSize, VehicleList list)
    {
        vehicleList = list;
        roundabout = new ArrayList<Vehicle>(roundaboutSize);

        for(int i = 0;i <= roundaboutSize;i++)
        {
            if(i%25==0)
            {
                segment = new RoadSegment(i, vehicleList);
            }
        }
    }

    public int getVehicleIndex(Vehicle v)
    {
        return v.getIndex();
    }

    public boolean seeIfFree(int index)
    {
        return vehicleList.isItFree(index);
    }

    public void simulate(int numSteps)
    {
        for(int step = 0;step < numSteps; step++)
        {
            vehicleList.spawnVehicle();
            simulateOneStep();
        }
    }

    public int getIndexForVehicle(Vehicle v){
        return 0;
    }

    private void simulateOneStep()
    {
        vehicleList.simulateOneStep();
    }
}
