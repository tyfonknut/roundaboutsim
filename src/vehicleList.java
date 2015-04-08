import java.util.ArrayList;

/**
 * Created by Knut on 07.04.2015.
 */
public class VehicleList {

    ArrayList<Vehicle> list;

    public VehicleList(){

        list = new ArrayList<Vehicle>(100);
    }

    public void spawnVehicle(RoadSegment road, int speedLimit)
    {
        Vehicle vehicle = new Vehicle(road, speedLimit);
        addVehicle(vehicle);
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
            System.out.print(" On position: " + vehicle.getIndex());
            System.out.println(" With distance: " + vehicle.getDistance());
        }
    }
}
