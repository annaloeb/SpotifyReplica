import java.util.LinkedList;

public class Album extends Collections{
  
  public Album()
  {
    super();
  }

  public Album(String t, LinkedList<Content> s)
  {
    super(t, s);
  }

  public String toString()
  {
    String s = "";
    s += "Album: " + title + " by " + collection.get(0).getArtist() + "\n";
    for (int i = 0; i < collection.size(); ++i)
      s += i + 1 + ") " + collection.get(i).getTitle() + "\n";
    return s;
  }

  public void play()
  {
    for (int i = 0; i < collection.size(); i++)
    {
        collection.get(i).play();
    }
  }

  public void shuffle()
  {
    System.out.println("Shuffling");
  }

  
}