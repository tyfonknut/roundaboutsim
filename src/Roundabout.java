import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class Roundabout implements Road
{
    VehicleList vehicleList;
    Vehicle[] roundabout;
    ArrayList<RoadSegment> outRoads;

    public Roundabout(int roundaboutSize, VehicleList list)
    {
        vehicleList = list;
        roundabout = new Vehicle[roundaboutSize];
    }

    public void sendOutRoads(ArrayList<RoadSegment> outRoads) {
        this.outRoads = outRoads;
    }

    public int getVehicleIndex(Vehicle v)
    {
        return java.util.Arrays.asList(roundabout).indexOf(v);
    }

    public void insertVehicle(int index, Vehicle v)
    {
        roundabout[index] = v;
    }

    public void moveVehicle(Vehicle v)
    {
        if(v.getConnection() == v.getIndex())
        {
            for(RoadSegment road: outRoads){
                if(road.connectionPoint == v.getConnection()){
                    road.insertVehicle(0,v);
                    roundabout[v.getIndex()] = null;
                    v.setRoad(road);
                    v.setIndex();

                }
            }
        }
        if(v.getIndex()+1 == 100)
        {
            System.out.println("Vehicle: " + v.getIndex());
            roundabout[getVehicleIndex(v) + 1 - 100] = v;
        }
        else
        {
            roundabout[getVehicleIndex(v) + 1] = v;
        }
        roundabout[getVehicleIndex(v)] = null;
        v.setIndex();
    }

    public boolean seeIfFree(int index)
    {
        boolean isFree = false;
        if(index < roundabout.length)
        {
            if(roundabout[index] == null)
            {
                isFree = true;
            }
        }
        return isFree;
    }
}
