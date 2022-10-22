public class FordManufacturer extends Company{

	@Override
	public Car createCar() {
		return new FordCar();
	}

	@Override
	public Truck createTruck() {
		return new FordTruck();
	}

}
