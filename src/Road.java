import java.util.ArrayList;

/**
 * Created by knut on 26.03.15.
 */
public interface Road {

    public boolean seeIfFree(int i);

    public int getIndexForVehicle(Vehicle v);

    public int getVehicleIndex(Vehicle v);

}