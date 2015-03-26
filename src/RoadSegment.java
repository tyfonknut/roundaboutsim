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
    boolean spawned;
    Vehicle vehicle;

    public RoadSegment()
    {
        ArrayList<Position> segment = new ArrayList<Position>(10);
        timer = 0;
        spawnPoint = segment.get(0);
        spawned = false;
        vehicle = new Vehicle(spawnPoint);
    }

    public void simulate(int numSteps)
    {
        for(int step = 1;step < numSteps; step++)
        {
            simulateOneStep();
        }
    }

    private void simulateOneStep()
    {
        vehicle.setNextPosition();
        vehicle.act();
    }

    public void setIntersection(int position)
    {
        intersection = position;
    }
}
