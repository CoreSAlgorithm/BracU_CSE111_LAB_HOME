public class Car extends Vehicle
{
  public static Car[] car = new Car[4];
  public int seat = 0;
  public static int count = 0;
  public static int totalcar = 0;
  public String status = "Available";
  public static boolean sold1 ;
  public Car(String model, int price,int seat)
  {
    super(model, price);
    car[count] = this;
    this.seat = seat;
    vehicleId = ("CAR00"+(count+1));
    count++;
    totalcar++;
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
    System.out.println("Type: Regular Car");
    System.out.println("Seat: "+seat);
  }
  public static void showAllAvailableCars()
  {
    System.out.println("Total Car: "+totalcar);
    System.out.println("Available car: ");
    for(int i=0; i<count; i++)
    {
      if (car[i].status.equals("available"))
      {
        System.out.println(car[i].vehicleId + " : " + car[i].model);
      }
    }
  }
  public static void markAsSold(Car c)
  {
    sold1 = true;
    c.status = "sold";
  }
  public static void showAllCars()
  {
    System.out.println("Total Car: "+totalcar);
    for(int i=0; i<count; i++)
    {
      System.out.println(car[i].vehicleId+" : "+car[i].model+" - "+car[i].status);
    }
  }
}