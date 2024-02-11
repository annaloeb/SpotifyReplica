import java.util.LinkedList;

public abstract class Collections implements Comparable{
  protected String title;
  protected LinkedList<Content> collection = new LinkedList<Content>();

  public Collections()
  {
    title = null;
    collection = null;
  }

  public Collections(String t)
  {
    title = t;
    collection = null;
  }

  public Collections(String t, LinkedList<Content> c)
  {
    title = t;
    collection = c;
  }

  public Collections(Collections c)
  {
    this.title = c.title;
    this.collection = c.collection;
  }

  public int compareTo(Collections collectionToCompare)
  {
    if (this.collection.size() > collectionToCompare.collection.size())
    {
      return 1;
    }
    if (this.collection.size() < collectionToCompare.collection.size())
    {
      return -1;
    }
    else
    {
      return 0;
    }
  }

  public abstract void shuffle();
}