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

    public void moveVehicle(Vehicle v)
    {
        roundabout.add(v.getIndex()+1, v);
        roundabout.remove(v.getIndex());
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
