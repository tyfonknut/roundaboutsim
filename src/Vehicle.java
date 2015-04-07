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

    private void setIndex()
    {
        index = road.getVehicleIndex(this);
    }

    protected void setRoad(Road road)
    {
        this.road = road;
    }

    protected int getIndex()
    {
        return index;
    }


    public void act()
    {
        if(road.seeIfFree(index+1))
        {
            index++;
        }


    }
}
