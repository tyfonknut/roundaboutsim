/**
 * Created by Robin on 25.03.2015.
 */
public class Vehicle
{
    private Road road;
    private int index;
    private int nextIndex;

    public Vehicle(Road road, int index)
    {
        this.road = road;
        this.index = index;
    }

    protected void setIndex(int index)
    {
        this.index = index;
    }

    protected void setNextIndex(int nextIndex)
    {
        this.nextIndex = nextIndex;
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
