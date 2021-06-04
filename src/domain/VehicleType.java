package domain;
public enum VehicleType {
	BUS{
		public IVehicle getVehicle() {
			return new Bus();
		}
	},
	CAR{
		public IVehicle getVehicle() {
			return new Car();
		}
	},
	TRUCK{
		public IVehicle getVehicle() {
			return new Truck();
		}
	};
	
	public abstract IVehicle getVehicle();
}
