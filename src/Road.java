import java.util.ArrayList;

/**
 * Created by knut on 26.03.15.
 */
public interface Road {

    public boolean seeIfFree(int index);

    public int getVehicleIndex(Vehicle v);

    public void moveVehicle(Vehicle v);

}