import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class RoadSegment implements Road
{
    VehicleList vehicleList;
    Vehicle[] segment;
    int connectionPoint;

    public RoadSegment(int connectionPoint, VehicleList list)
    {
        this.connectionPoint = connectionPoint;
        vehicleList = list;
        segment = new Vehicle[10];
    }

    public int getVehicleIndex(Vehicle v)
    {
        return java.util.Arrays.asList(segment).indexOf(v);
    }

    public void moveVehicle(Vehicle v)
    {
        segment[getVehicleIndex(v)+1] = v;
        segment[getVehicleIndex(v)] = null;
        v.setIndex();
    }

    public boolean seeIfFree(int index)
    {
        boolean isFree = true;
        for(Vehicle vehicle : segment)
        {
            if(vehicle.getIndex() == index)
            {
                isFree = false;
            }
        }
        return isFree;
    }
}
