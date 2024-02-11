import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Driver{
  public static void main(String[] args)
  {
    Listener listener = new Listener();

    boolean isRunning = true;
    
    //Initializing all the content

    Song song1 = new Song("Bloom", "Radiohead");
    Song song2 = new Song("Morning Mr Magpie", "Radiohead");
    Song song3 = new Song("Little By Little", "Radiohead");
    Song song4 = new Song("Feral", "Radiohead");
    Song song5 = new Song("Lotus Flower", "Radiohead");
    Song song6 = new Song("Codex", "Radiohead");
    Song song7 = new Song("Give Up The Ghost", "Radiohead");
    Song song8 = new Song("Separator", "Radiohead");

    LinkedList<Content> Album1 = new LinkedList<Content>();
    Album1.add(song1);
    Album1.add(song2);
    Album1.add(song3);
    Album1.add(song4);
    Album1.add(song5);
    Album1.add(song6);
    Album1.add(song7);
    Album1.add(song8);

    Album TheKingOfLimbs = new Album("The King Of Limbs", Album1);

    Song soWhat = new Song("So What", "Miles Davis");
    Song freddieFreeloader = new Song("Freddie Freeloader", "Miles Davis");
    Song blueInGreen = new Song("Blue in Green", "Miles Davis");
    Song allBlues = new Song("All Blues", "Miles Davis");
    Song flamencoSketches = new Song("Flamenco Sketches", "Miles Davis");

    LinkedList<Content> Album2 = new LinkedList<Content>();
    Album2.add(soWhat);
    Album2.add(freddieFreeloader);
    Album2.add(blueInGreen);
    Album2.add(allBlues);
    Album2.add(flamencoSketches);

    Album KindOfBlue = new Album("Kind Of Blue", Album2);

    Song silentNight = new Song("Silent Night", "Bing Crosby");
    Song adesteFideles = new Song("Adeste Fideles", "Bing Crosby");
    Song whiteChristmas = new Song("White Christmas", "Bing Crosby");
    Song godRestYeMarryGentlemen = new Song("God Rest Ye Marry Gentlemen", "Bing Crosby");
    Song faithOfOurFathers = new Song("Faith Of Our Fathers", "Bing Crosby");
    Song illBeHomeForChristmas = new Song("I'll Be Home For Christmas", "Bing Crosby");
    Song jingleBells = new Song("Jingle Bells", "Bing Crosby");
    Song santaClausIsCominToTown = new Song("Santa Claus Is Comin' To Town", "Bing Crosby");
    Song silverBells = new Song("Silver Bells", "Bing Crosby");
    Song itsBeginningToLookALotLikeChristmas = new Song("It's Beginning To Look A Lot Like Christmas", "Bing Crosby");
    Song christmasInKillarney = new Song("Christmas In Killarney", "Bing Crosby");
    Song meleKalikimaka = new Song("Mele Kalikimaka (Merry Christmas)", "Bing Crosby");

    LinkedList<Content> Album3 = new LinkedList<Content>();
    Album3.add(silentNight);
    Album3.add(adesteFideles);
    Album3.add(whiteChristmas);
    Album3.add(godRestYeMarryGentlemen);
    Album3.add(faithOfOurFathers);
    Album3.add(illBeHomeForChristmas);
    Album3.add(jingleBells);
    Album3.add(santaClausIsCominToTown);
    Album3.add(silverBells);
    Album3.add(itsBeginningToLookALotLikeChristmas);
    Album3.add(christmasInKillarney);
    Album3.add(meleKalikimaka);

    Album WhiteChristmas = new Album("White Christmas", Album2);
    
    Podcast pod1 = new Podcast("True Crime Daily The Podcast", "True Crime Daily");

    LinkedList<Content> playlist1 = new LinkedList<Content>();
    playlist1.add(pod1);
    playlist1.add(silverBells);
    playlist1.add(blueInGreen);

    Playlist slaylist = new Playlist("slaylist", playlist1);

    LinkedList<Song> library = new LinkedList<>();
    library.add(song1);
    library.add(song2);
    library.add(song3);
    library.add(song4);
    library.add(song5);
    library.add(song6);
    library.add(song7);
    library.add(song8);
    library.add(soWhat);
    library.add(freddieFreeloader);
    library.add(blueInGreen);
    library.add(allBlues);
    library.add(flamencoSketches);
    library.add(silentNight);
    library.add(adesteFideles);
    library.add(whiteChristmas);
    library.add(godRestYeMarryGentlemen);
    library.add(faithOfOurFathers);
    library.add(illBeHomeForChristmas);
    library.add(jingleBells);
    library.add(santaClausIsCominToTown);
    library.add(silverBells);
    library.add(itsBeginningToLookALotLikeChristmas);
    library.add(christmasInKillarney);
    library.add(meleKalikimaka);

    while (isRunning == true)
    {
      Scanner sin = new Scanner(System.in);
      System.out.println("\nMenu Options:");
      System.out.println("1. Create a listener account \n");
      System.out.println("2. List all Playlists and Albums and their contents \n");
      System.out.println("3. Add songs to an existing playlist \n");
      System.out.println("4. Shuffle an existing Playlist or listen to an Album \n");
      System.out.println("5. Add a song or podcast to your favorites \n");
      System.out.println("6. Export all of your favorites out to a file in ascending order by times streamed \n");
      System.out.println("7. Exit \n" + "\n");
      System.out.print("Which option would you like: ");
      int o = sin.nextInt();

      if (o == 1)
      {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scan.nextLine();
        listener.setName(username);
        System.out.println("\nAccount " + username + " created. Returning to menu.");
      }
      if (o == 2)
      {
        System.out.println(TheKingOfLimbs.toString());
        System.out.println(KindOfBlue.toString());
        System.out.println(slaylist.toString());
      }
      if (o == 3)
      {
        boolean wantsToAddSongs = true;
        while (wantsToAddSongs == true)
        {
          Song songToAdd = null;
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter the title of the song you would like to add: ");
          String title = scan.nextLine();
          System.out.print("Enter the artist of the song you would like to add: ");
          String artist = scan.nextLine();
          for (int i = 0; i < library.size(); ++i)
          {
            if (library.get(i).getTitle().equals(title) && library.get(i).getArtist().equals(artist))
            {
              songToAdd = library.get(i);
            }
          }
          System.out.print("Which playlist would you like to add to: ");
          String playlist = scan.nextLine();
          if (playlist.equals("slaylist"))
          {
            slaylist.addSong(songToAdd);
            System.out.println("\nSong added.\n");
          }
          System.out.print("Would you like to add another song to another playlist? Respond 'yes' or 'no': ");
          String input = scan.nextLine();
          if (input.equals("no"))
          {
            wantsToAddSongs = false;
          }
        }
      }
      if (o == 4)
      {
        boolean wantsToListenToCollection = true;
        while (wantsToListenToCollection == true)
        {
          Scanner scan = new Scanner(System.in);
          System.out.print("What album or playlist would you like to listen to? ");
          String list = scan.nextLine();
          System.out.print("\n");
          if (list.equals("slaylist"))
          {
            boolean wantsToShuffle = true;
            while (wantsToShuffle == true)
            {
              slaylist.shuffle();
              System.out.print("Would you like to play another song? Respond 'yes' or 'no': ");
              String input = scan.nextLine();
              if (input.equals("no"))
              {
                wantsToShuffle = false;
                System.out.print("Would you like to listen to another playlist or album? Respond 'yes' or 'no': ");
                String input2 = scan.nextLine();
                if (input2.equals("no"))
                {
                  wantsToListenToCollection = false;
                }
              }
            }
          }
          if (list.equals("The King Of Limbs"))
          {
            TheKingOfLimbs.play();
            System.out.print("Would you like to listen to another playlist or album? Respond 'yes' or 'no': ");
            String input3 = scan.nextLine();
            if (input3.equals("no"))
            {
              wantsToListenToCollection = false;
            }
          }
          if (list.equals("Kind Of Blue"))
          {
            KindOfBlue.play();
            System.out.print("Would you like to listen to another playlist or album? Respond 'yes' or 'no': ");
            String input4 = scan.nextLine();
            if (input4.equals("no"))
            {
              wantsToListenToCollection = false;
            }
          }
        }
      }
      if (o == 5)
      {
        Song songToAdd = null;
        Podcast podcastToAdd = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the title of the song or podcast you'd like to add: ");
        String title = scan.nextLine();
        System.out.print("Who is the artist of the song or podcast you'd like to add: ");
        String artist = scan.nextLine();
        for (int i = 0; i < library.size(); ++i)
        {
          if (library.get(i).getTitle().equals(title) && library.get(i).getArtist().equals(artist))
          {
            songToAdd = library.get(i);
          }
        }
        if (pod1.getTitle().equals(title) && pod1.getArtist().equals(artist))
        {
          podcastToAdd = pod1;
        }
        System.out.print("Are you adding a song or a podcast? ");
        String input = scan.nextLine();
        if (input.equals("song"))
        {
          listener.favorite(songToAdd);
          System.out.println("Song added to favorites.");
          System.out.println("Your current favorites: \n" + listener.showFavorites());
        }
        if (input.equals("podcast"))
        {
          listener.favorite(podcastToAdd);
          System.out.println("Podcast added to favorites.");
          System.out.println(listener.showFavorites());
        }
      }
      if (o == 6)
      {
        /*
        Here is where I tried to implement the sorting with arrays lists

        ArrayList<Integer> sortedStreams = new ArrayList<>();
        for (int i = 0; i < listener.favorites.size(); ++i)
        {
          sortedStreams.add(listener.favorites.get(i).getNumStreams());
        }
        Collections.sort(sortedStreams);*/
        try{
          PrintWriter pw = new PrintWriter(new FileWriter("sortedFavorites.txt"));
          for (int i = 0; i < listener.favorites.size(); ++i)
          {
            pw.println(listener.favorites.get(i).toString() + " Number of streams: " + listener.favorites.get(i).getNumStreams());
          }
          pw.close();
        } catch(IOException ioe){
          System.out.println("couldn't write to file");
        } catch(Exception e){
          System.out.println("something went wrong but it wasn't your file.");
        }
      }
      if (o == 7)
      {
        isRunning = false;
      } 
    }
  }
}