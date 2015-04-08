import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class RoadSegment implements Road
{
    VehicleList vehicleList;
    Vehicle[] segment;
    public int connectionPoint;
    Roundabout round = null;

    public RoadSegment(int connectionPoint, VehicleList list, Roundabout round)
    {
        this.connectionPoint = connectionPoint;
        vehicleList = list;
        segment = new Vehicle[10];
        this.round = round;
    }

    public int getVehicleIndex(Vehicle v)
    {
        return java.util.Arrays.asList(segment).indexOf(v);
    }

    public void insertVehicle(int index, Vehicle v)
    {
        segment[index] = v;
    }

    public void removeVehicle(int index)
    {
        segment[index] = null;
    }

    public void moveVehicle(Vehicle v)
    {
        if(getVehicleIndex(v) == 9)
        {
            v.setRoad(round);
            round.insertVehicle(connectionPoint,v);
            removeVehicle(getVehicleIndex(v));
            v.setIndex();
        }
        else
        {
            insertVehicle(getVehicleIndex(v) + 1, v);
            removeVehicle(getVehicleIndex(v));
            v.setIndex();
        }
    }

    public boolean seeIfFree(int index)
    {
        boolean isFree = false;
        if(index < segment.length)
        {
            if(segment[index] == null)
            {
                isFree = true;
            }
        }
        return isFree;
    }
}
