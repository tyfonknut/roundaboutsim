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
    private int connectionPoint;

    public Vehicle(Road road, int speedLimit)
    {
        this.road = road;
        this.speedLimit = speedLimit;
        speed = 5;
    }

    public Vehicle(Road road, int speedLimit, int connectionPoint)
    {
        this.road = road;
        this.speedLimit = speedLimit;
        this.connectionPoint = connectionPoint;
        speed = 5;
    }

    public int getDistance()
    {
        return distance;
    }

    public void setIndex()
    {
        index = road.getVehicleIndex(this);
    }

    public void setRoad(Road road)
    {
        this.road = road;
    }

    public Road getRoad()
    {
        return road;
    }

    public int getIndex()
    {
        return index;
    }

    public int getConnection(){return connectionPoint; }

    public void act()
    {
        if(road.seeIfFree(index+4))
        {
            if(speed < 7)
            {
                speed++;
            }
            else
            {
                speed--;
            }
        }
        else if(road.seeIfFree(index+3))
        {
            if(speed < 5)
            {
                speed ++;
            }
            else
            {
                speed--;
            }
        }
        else if(road.seeIfFree(index+2))
        {
            if(speed < 3)
            {
                speed++;
            }
            else
            {
                speed--;
            }
        }
        else if(road.seeIfFree(index+1))
        {
            if(speed < 2)
            {
                speed++;
            }
            else
            {
                speed--;
            }
        }

        distance = distance + speed;

        if(distance > 10)
        {
            road.moveVehicle(this);
            distance = distance - 10;
        }
    }
}
