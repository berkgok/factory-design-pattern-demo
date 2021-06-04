package factory;
import domain.IVehicle;
import domain.VehicleType;

public class VehicleFactory {
	public IVehicle getVehicle(VehicleType type) {
		return type.getVehicle();
	}
}
