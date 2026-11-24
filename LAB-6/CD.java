public class CD extends Product
{
  public String band = "";
  public String genre = "";
  public int duration = 0;
  public CD(int id, String title, int price, String band, int duration, String genre)
  {
    super(id,title,price);
    this.band = band;
    this.genre = genre;
    this.duration = duration;
  }
  public String printDetail()
  {
    return super.getIdTitlePrice()+"\n Band: "+band+" Duration:"+duration
      +"\n Genre: "+genre;
  }
}