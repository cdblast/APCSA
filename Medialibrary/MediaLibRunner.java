/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    /* 2.2.7
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("Lord of the Rings", "Tolkein");

    System.out.println("Library:\n" + myLib);
    
    myBook.adjustRating(5);
    System.out.println("Book created: " + myBook);

    System.out.println("Library:\n" + myLib);
    
    Book currBook = myLib.getBook();
    currBook.setTitle("My Favorite Book");
    System.out.println("Current book: " + currBook);

    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");

    Movie favoriteMovie = new Movie("I Saw The Tv Glow", 1.66);
    myLib2.addMovie(favoriteMovie);
    System.out.println(myLib2);

    //end of 2.2.7
    */

    MediaLib myLib = new MediaLib();
    System.out.println(myLib.getNumEntries());
    
    Movie favMovie = new Movie("I Saw The TV Glow", 1.66);
    myLib.addMovie(favMovie);

    myLib.setOwner("New Name");
    System.out.println(myLib.getNumEntries());

    favMovie.adjustRating(5);

    System.out.println(myLib.getNumEntries());
    myLib.changeMovie(favMovie);

    Song favSong = new Song("Dancing Queen", "ABBA");
    myLib.addSong(favSong);
    Song favSong2 = new Song("Hey Jude", "The Beatles");
    System.out.println("Song equals test: " + favSong.equals(favSong2));
  }
}