import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Knut on 07.04.2015.
 */
public class VehicleList
{

    ArrayList<Vehicle> list;
    Random r;
    int i;

    public VehicleList()
    {

        list = new ArrayList<Vehicle>();
    }

    public void spawnVehicle(ArrayList<RoadSegment> innRoads, ArrayList<RoadSegment> outRoads, int speedLimit)
    {
        r = new Random();
        for(RoadSegment segment : innRoads)
        {
            int connectionPoint = outRoads.get(r.nextInt(4)).getConnectionPoint();
            Vehicle vehicle = new Vehicle(segment, speedLimit, connectionPoint);
            addVehicle(vehicle);
            segment.insertVehicle(0, vehicle);
            System.out.print("Spawned vehicle number: " + list.indexOf(vehicle));
            System.out.print(" In segment: " + vehicle.getRoad());
            System.out.println(" With target: " + connectionPoint);
        }
    }

    public void addVehicle(Vehicle v)
    {
        list.add(v);
    }

    public void removeVehicle(Vehicle v)
    {
        list.remove(v);
    }

    public void simulateOneStep()
    {
        for(Vehicle vehicle : list)
        {
            vehicle.act();
            //System.out.print("Vehicle number: " + list.indexOf(vehicle));
            //System.out.print(" In segment: " + vehicle.getRoad());
            //System.out.print(" On position: " + vehicle.getIndex());
            //System.out.println(" With distance: " + vehicle.getDistance());
        }
    }
}
