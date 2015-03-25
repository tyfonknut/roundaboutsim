import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class RoadSegment
{
    int speedLimit;
    int intersection;
    int timer;
    Position spawnPoint;

    public RoadSegment()
    {
        ArrayList<Position> segment = new ArrayList<Position>(10);
        timer = 0;
        spawnPoint = segment.get(0);
    }

    private void spawner()
    {
        timer ++;
        if(timer%10 == 0)
        {
            Vehicle vehicle = new Vehicle(spawnPoint);
        }
    }

    public void setIntersection(int position)
    {
        intersection = position;
    }
}
