/**
 * Created by Robin on 25.03.2015.
 */
public class Position
{
    boolean ocupied;
    boolean intersection;

    public Position()
    {
        ocupied = false;
        intersection = false;
    }

    public void setIntersection()
    {
        intersection = !intersection;
    }

    public void setOcupied()
    {
        ocupied = !ocupied;
    }

    public boolean getOcupied()
    {
        return ocupied;
    }
}
