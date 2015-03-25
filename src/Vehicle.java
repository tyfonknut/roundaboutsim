/**
 * Created by Robin on 25.03.2015.
 */
public class Vehicle
{
    private double speedMod;
    private double accel;
    private Position position;
    private Position nextPosition;

    public Vehicle(Position position)
    {
        this.position = position;
    }

    protected void setPosition(Position position)
    {
        this.position = position;
    }

    protected Position getPosition()
    {
        return position;
    }

    public void act()
    {
        position.setOcupied();
        if(!nextPosition.getOcupied())
    }
}
