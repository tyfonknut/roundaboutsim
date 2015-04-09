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

    public int getConnectionPoint(){
        return connectionPoint;
    }

    public void insertVehicle(int index, Vehicle v)
    {
        segment[index] = v;
    }

    public void moveVehicle(Vehicle v)
    {
        if(v.getIndex() == 9)
        {
            if (v.isLeaving())
            {
                segment[getVehicleIndex(v)] = null;
                System.out.println("Vehicle: " + v + " just left the system.");
                vehicleList.removeVehicle(v);
            }
            else if (round.seeIfFree(connectionPoint)) {
                round.roundabout[connectionPoint] = v;
                segment[getVehicleIndex(v)] = null;
                v.setRoad(round);
                v.setIndex();
                System.out.print("Vehicle number: " + vehicleList.list.indexOf(v));
                System.out.print(" Just entered segment: " + v.getRoad());
                System.out.print(" On position: " + v.getIndex());
                System.out.println(" At speed: " + v.getSpeed());
            }
        }
        else
        {
            segment[getVehicleIndex(v)+1] = v;
            segment[getVehicleIndex(v)] = null;
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
