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

    public boolean seeIfFree(int index)
    {
       return vehicleList.isItFree(index);
    }
}
