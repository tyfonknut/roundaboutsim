/**
 * Created by Robin on 25.03.2015.
 */
public class Vehicle
{
    private Road road;
    private int index;
    private int nextIndex;

    public Vehicle()
    {

    }

    protected void setRoad(Road road)
    {
        this.road = road;
    }

    protected int getIndex()
    {
        return index;
    }

    public int getPosition()
    {
        road.
    }

    public void act()
    {
        if(road.seeIfFree(index+1))
        {
            index++;
        }


    }
}
