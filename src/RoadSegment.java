import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class RoadSegment implements Road
{
    VehicleList roadlist;
    ArrayList<Integer> segment;
    int connectionPoint;

    public RoadSegment(int connectionPoint, VehicleList list)
    {
        this.connectionPoint = connectionPoint;
        roadlist = list;
        segment = new ArrayList<Integer>(10);
    }

    public boolean seeIfFree(int index)
    {
       return roadlist.isItFree(index);
    }
}
