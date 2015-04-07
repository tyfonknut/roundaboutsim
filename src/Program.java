/**
 * Created by Robin on 25.03.2015.
 */
public class Program
{
    public static void main(String[] args)
    {
        VehicleList list = new VehicleList();
        RoadSegment segment = new RoadSegment(list);

        segment.simulate(10);


    }
}
