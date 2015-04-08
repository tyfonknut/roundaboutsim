import java.util.ArrayList;

/**
 * Created by Robin on 07.04.2015.
 */
public class Simulator
{
    VehicleList vehicleList;
    RoadSegment segment;
    ArrayList<RoadSegment> innRoads;
    ArrayList<RoadSegment> outRoads;
    int speedLimit = 10;

    public Simulator(int roundaboutSize, VehicleList list)
    {
        vehicleList = list;
        Roundabout rondabout = new Roundabout(roundaboutSize, list);
        innRoads = new ArrayList<RoadSegment>(50);
        outRoads = new ArrayList<RoadSegment>(50);

        for(int i = 0;i <= roundaboutSize;i++)
        {
            if(i%25==0)
            {
                segment = new RoadSegment(i, vehicleList);
                innRoads.add(segment);
                segment = new RoadSegment(i-1, vehicleList);
                outRoads.add(segment);
            }
        }
    }

    public void simulate(int numSteps)
    {
        vehicleList.spawnVehicle(segment, speedLimit);
        for(int step = 0;step < numSteps; step++)
        {
            simulateOneStep();
        }
    }

    private void simulateOneStep()
    {
        vehicleList.simulateOneStep();
    }
}
