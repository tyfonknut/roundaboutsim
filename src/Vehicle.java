/**
 * Created by Robin on 25.03.2015.
 */
public class Vehicle
{
    private Road road;
    private int index;
    private int nextIndex;
    private int speedLimit;
    private int speed;
    private int distance;

    public Vehicle(Road road, int speedLimit)
    {
        this.road = road;
        this.speedLimit = speedLimit;
    }

    public void setIndex()
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
            speed = 2;
        }
        else if(road.seeIfFree(index+2))
        {
            speed = 4;
        }
        else if(road.seeIfFree(index+3))
        {
            speed = 6;
        }
        else if(road.seeIfFree(index+4))
        {
            speed = 8;
        }

        distance = distance + speed;

        if(distance > 10)
        {
            road.moveVehicle(this);
            distance = 0;
        }
    }
}
