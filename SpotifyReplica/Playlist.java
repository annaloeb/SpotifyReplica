import java.util.LinkedList;
import java.util.Random;

public class Playlist extends Collections{
  
  public Playlist()
  {
    super();
  }

  public Playlist(String t, LinkedList<Content> s)
  {
    super(t, s);
  }

  public Playlist(Playlist p)
  {
    super(p);
  }

  public void addSong(Song s)
  {
    collection.add(s);
  }

  public void removeSong(Song s)
  {
    collection.remove(s);
  }

  public String toString()
  {
    String s = "";
    s += "Playlist: " + title + "\n";
    for (int i = 0; i < collection.size(); ++i)
      s += i + 1 + ") " + collection.get(i).toString() + "\n";
    return s;
  }

  public void shuffle()
  {
    Playlist copy = (Playlist) this;
    Random rand = new Random();
    copy.collection.remove(rand.nextInt(copy.collection.size())).play();
  }

  /*public int compareTo(Playlist playlistToCompare)
  {
    if (this.collection.size() > playlistToCompare.collection.size())
    {
      return 1;
    }
    if (this.collection.size() < playlistToCompare.collection.size())
    {
      return -1;
    }
    else
    {
      return 0;
    }
  }*/
}