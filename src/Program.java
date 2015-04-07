/**
 * Created by Robin on 25.03.2015.
 */
public class Program
{
    public static void main(String[] args)
    {
        vehicleList list = new vehicleList();
        RoadSegment segment = new RoadSegment(list);

        segment.simulate(10);


    }
}
