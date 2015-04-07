/**
 * Created by Robin on 25.03.2015.
 */
public class Program
{
    public static void main(String[] args)
    {
        VehicleList list = new VehicleList();
        Roundabout roundabout = new Roundabout(100, list);

        roundabout.simulate(10);


    }
}
