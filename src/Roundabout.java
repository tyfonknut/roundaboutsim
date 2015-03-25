import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class Roundabout
{
    int speedLimit;


    public Roundabout(int roundaboutSize)
    {
        ArrayList<Position> roundabout = new ArrayList<Position>(roundaboutSize);
        ArrayList<RoadSegment> roadSegments = new ArrayList<RoadSegment>();

        for(int i = 0; i <= roundaboutSize; i++)
        {
            if(i%10 == 0)
            {
                Position position = roundabout.get(i);
                position.setIntersection();

            }
        }
    }


}
