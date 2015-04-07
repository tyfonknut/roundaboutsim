import java.util.ArrayList;

/**
 * Created by Knut on 07.04.2015.
 */
public class VehicleList {

    ArrayList<Vehicle> list;

    public VehicleList(){

        list = new ArrayList<Vehicle>();
    }

    public void spawnVehicle(RoadSegment road)
    {
        Vehicle vehicle = new Vehicle(road);
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
            System.out.println(" On position: " + vehicle.getIndex());
        }

    }

    public Boolean isItFree(int index){

        boolean isFree = true;
        for(Vehicle vehicle : list)
        {
            if(vehicle.getIndex() == index)
            {
                isFree = false;
            }
        }
        return isFree;
    }

}
