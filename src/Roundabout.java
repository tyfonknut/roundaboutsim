import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class Roundabout implements Road
{
    VehicleList vehicleList;
    ArrayList<Vehicle> roundabout;

    public Roundabout(int roundaboutSize, VehicleList list)
    {
        vehicleList = list;
        roundabout = new ArrayList<Vehicle>(roundaboutSize);
    }

    public int getVehicleIndex(Vehicle v)
    {
        return v.getIndex();
    }

    public boolean seeIfFree(int index)
    {
        return vehicleList.isItFree(index);
    }
}
