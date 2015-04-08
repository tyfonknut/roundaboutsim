/**
 * Created by Robin on 25.03.2015.
 */
public class Program
{
    public static void main(String[] args)
    {
        VehicleList list = new VehicleList();
        Simulator simulator = new Simulator(100, list);

        simulator.simulate(100);


    }
}