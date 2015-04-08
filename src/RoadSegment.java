import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class RoadSegment implements Road
{
    VehicleList vehicleList;
    ArrayList<Vehicle> segment;
    int connectionPoint;

    public RoadSegment(int connectionPoint, VehicleList list)
    {
        this.connectionPoint = connectionPoint;
        vehicleList = list;
        segment = new ArrayList<Vehicle>(10);
    }

    public int getVehicleIndex(Vehicle v)
    {
        return segment.indexOf(v);
    }

    public void moveVehicle(Vehicle v)
    {

        segment.add(v.getIndex()+1, v);
        segment.remove(v.getIndex());
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
