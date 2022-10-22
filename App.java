public class App{
  public static void main(String[] args){

    Company chevroletCompany = new ChevroletManufacturer();
    Car carA = chevroletCompany.createCar();
    carA.assemble();
    Truck truckA= chevroletCompany.createTruck();
    truckA.assemble();

    Company fordCompany = new FordManufacturer();
    Car carB = fordCompany.createCar();
    carB.assemble();
    Truck truckB = fordCompany.createTruck();
    truckB.assemble();

  }
}
