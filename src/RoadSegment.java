import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Robin on 25.03.2015.
 */
public class RoadSegment implements Road
{
    int speedLimit;
    int intersection;
    int timer;
    Vehicle vehicle;
    ArrayList segment;

    public RoadSegment()
    {
        segment = new ArrayList(10);
        timer = 0;
    }

    public Vehicle spawnVehicle()
    {
        Vehicle vehicle = new Vehicle(this);
        return vehicle;
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

        vehicle.act();
    }

    public void setIntersection(int position)
    {
        intersection = position;
    }
}
