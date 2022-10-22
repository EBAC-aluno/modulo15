public class ChevroletManufacturer extends Company{

	@Override
	public Car createCar() {
		return new ChevroletCar();
	}

	@Override
	public Truck createTruck() {
		return new ChevroletTruck();
	}

}
