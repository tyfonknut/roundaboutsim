import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class RoadSegment implements Road
{
    VehicleList roadlist;
    ArrayList<Integer> segment;

    public RoadSegment(VehicleList list)
    {
        roadlist = list;
        segment = new ArrayList<Integer>(10);
    }

    public boolean seeIfFree(int index)
    {
       return roadlist.isItFree(index);
    }
}
