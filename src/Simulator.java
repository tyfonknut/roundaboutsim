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

    public Simulator(int roundaboutSize, VehicleList list)
    {
        vehicleList = list;
        Roundabout rondabout = new Roundabout(roundaboutSize, list);

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
        for(int step = 0;step < numSteps; step++)
        {
            vehicleList.spawnVehicle(segment);
            simulateOneStep();
        }
    }

    private void simulateOneStep()
    {
        vehicleList.simulateOneStep();
    }
}
