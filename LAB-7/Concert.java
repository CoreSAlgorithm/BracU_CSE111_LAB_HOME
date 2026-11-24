public class Concert
{
  public String zone = "";
  public int quantity = 0;
  public static int sold = 0;
  public static int vipsold = 0;
  public String venue = "";
  public String showtime = "";
  public String[] artist = new String[5];
  public int count = 0;
  public Concert(String venue, String showtime)
  {
    this.venue = venue;
    this.showtime = showtime;
  }
  public void addArtist(String artist)
  {
    this.artist[count] = artist;
    count++;
  }
  public void showDetails()
  {
    System.out.println("Vanue: "+this.venue);
    System.out.println("Showtime: "+this.showtime);
    System.out.println("Artist: ");
    if(count > 0)
    {
      for(int i=0; i<count; i++)
      {
        System.out.println(artist[i]);
      }
    }
    System.out.println("Tickets sold in this concert: "+this.sold);
  }
  public void buyTicket(String zone, int quantity)
  {
    this.zone = zone;
    this.quantity = quantity;
    this.sold += quantity;
    if(zone.equals("A"))
    {
      System.out.println("Total Price: "+(500*quantity));
    }
    else if(zone.equals("B"))
    {
      System.out.println("Total Price: "+(1000*quantity));
    }
    if(zone.equals("VIP"))
    {
      System.out.println("Total Price: "+(2000*quantity));
    }
  }
  public void buyTicket(String zone)
  {
    this.buyTicket(zone,1);
  }
  public void buyTicket()
  {
    this.vipsold += 1;
    System.out.println("Total Price: 2000");
  }
  public static void showTotalTicketsSold()
  {
    System.out.println("Total tickets sold (all venues): "+(sold+vipsold));
  }
}