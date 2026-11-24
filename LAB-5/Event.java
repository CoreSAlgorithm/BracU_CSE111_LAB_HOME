public class Event
{
  public static String[] eventname = new String[5];
  public static String[] eventdate = new String[5];
  private String event = "";
  private String date = "";
  public static int count = 0;
  public Event(String event, String date)
  {
    if(count < 5)
    {
      this.event = event;
      this.date = date;
      eventname[count] = event;
      eventdate[count] = date;
      count++;
    }
    else
    {
      System.out.println("Maximum event.");
    }
  }
  public String details()
  {
    return "Name: " + this.event + "\nDate: " + this.date;
  }
  public String getEventname()
  {
    return this.event;
  }
  public String getEventdate()
  {
    return this.date;
  }
  public static void allEventInfo()
  {
    if(count == 0)
    {
      System.out.println("Total events: "+count);
      System.out.println("Event Details: ");
    }
    else
    {
      System.out.println("Total events: "+count);
      System.out.println("Event Details: ");
      for(int i=1; i<=count; i++)
      {
        System.out.println("Event +"+i+": ");
        System.out.println("Name: "+eventname[i-1]);
        System.out.println("Date: "+eventdate[i-1]);
      }
    }
  }
}