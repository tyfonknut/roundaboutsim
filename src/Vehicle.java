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
            speed++;
        }

        if(speed == speedLimit)
        {
            road.moveVehicle(this);
            speed = 0;
        }
    }
}
