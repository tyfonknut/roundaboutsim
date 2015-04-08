import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class Roundabout implements Road
{
    VehicleList vehicleList;
    Vehicle[] roundabout;

    public Roundabout(int roundaboutSize, VehicleList list)
    {
        vehicleList = list;
        roundabout = new Vehicle[roundaboutSize];
    }

    public int getVehicleIndex(Vehicle v)
    {
        return java.util.Arrays.asList(roundabout).indexOf(v);
    }

    public void moveVehicle(Vehicle v)
    {
        roundabout[getVehicleIndex(v)+1] = v;
        roundabout[getVehicleIndex(v)] = null;
        v.setIndex();
    }

    public boolean seeIfFree(int index)
    {
        boolean isFree = true;
        for(Vehicle vehicle : roundabout)
        {
            if(vehicle.getIndex() == index)
            {
                isFree = false;
            }
        }
        return isFree;
    }
}
