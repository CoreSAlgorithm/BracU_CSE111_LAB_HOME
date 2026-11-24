public class ElectricCar extends Vehicle
{
  public static String status = "Available";
  public static boolean sold1;
  public int battery = 0;
  public static int count = 0;
  public ElectricCar(String model, int price, int battery)
  {
    super(model,price);
    this.battery = battery;
    vehicleId = ("CAR00"+(count+1));
    count++;
    System.out.println("Vehicle ID: "+vehicleId+" created");
  }
  public void vehicleDetail()
  {
    System.out.println("Model: " + model + ", Price: $" + price);
    System.out.print("Status: ");
    if(sold)
    {
      System.out.print("Sold\n");
    }
    else
    {
      System.out.print("Available\n");
    }
    System.out.println("Type: Electric Car");
    System.out.println("Battery capacity: "+battery);
  }
  public static void markAsSoldEV(ElectricCar c)
  {
    sold1 = true;
    c.status = "sold";
  }
}