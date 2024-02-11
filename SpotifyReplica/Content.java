public abstract class Content {
  
  protected String title;
  protected String artist;
  protected int numStreams;

  public Content()
  {
    title = null;
    artist = null;
    numStreams = 0;
  }

  public Content(String t, String a, int s)
  {
    title = t;
    artist = a;
    numStreams = s;
  }

  public int getNumStreams()
  {
    return numStreams;
  }

  public String getTitle()
  {
    return title;
  }

  public String getArtist()
  {
    return artist;
  }

  public abstract void play();
}