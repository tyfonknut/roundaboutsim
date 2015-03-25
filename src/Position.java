/**
 * Created by Robin on 25.03.2015.
 */
public class Position
{
    boolean occupied;
    boolean intersection;

    public Position()
    {
        occupied = false;
        intersection = false;
    }

    public void setIntersection()
    {
        intersection = !intersection;
    }

    public void setOccupied()
    {
        occupied = !occupied;
    }

    public boolean getOccupied()
    {
        return occupied;
    }
}
