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

    public void spawnVehicle(ArrayList<RoadSegment> innRoads, int speedLimit)
    {
        r = new Random();
        for(RoadSegment segment : innRoads)
        {
            Vehicle vehicle = new Vehicle(segment, speedLimit, innRoads.get(r.nextInt(4)).getConnectionPoint());
            addVehicle(vehicle);
            segment.insertVehicle(0, vehicle);
        }
    }

    public void addVehicle(Vehicle v)
    {
        list.add(v);
    }

    public void simulateOneStep()
    {
        for(Vehicle vehicle : list)
        {
            vehicle.act();
            System.out.print("Vehicle number: " + list.indexOf(vehicle));
            System.out.print(" In segment: " + vehicle.getRoad());
            System.out.print(" On position: " + vehicle.getIndex());
            System.out.println(" With distance: " + vehicle.getDistance());
        }
    }
}
