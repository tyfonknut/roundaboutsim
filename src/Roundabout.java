import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Robin on 25.03.2015.
 */
public class Roundabout implements Road
{
    ArrayList<Integer> roundabout;

    public Roundabout(int roundaboutSize)
    {
        roundabout = new ArrayList<Integer>(roundaboutSize);
    }


}
