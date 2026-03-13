/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  public static String owner = "PLTW";
  private int numEntries = 0;
  private Book book;
  private Movie movie;
  private Song song;

  public void addBook(Book b)
  {
    if(book != null){
      System.out.println("There has already been a book added to this library! To change the book, use the changeBook method.");
    }
    else{
      book = b;
      numEntries++;
    }
  }

  public void addMovie(Movie m){
    if(movie != null){
      System.out.println("There has already been a movie added to this library! To change the movie, use the changeMovie method.");
    }
    else{
      movie = m;
      numEntries++;
    }
  }

  public void addSong(Song s){
    if(song != null){
      System.out.println("There has already been a song added to this library! To change the song, use the changeSong method.");
    }
    else{
      song = s;
      numEntries++;
    }
  }

  public void changeBook(Book b){
    book = b;
  }
  public void changeMovie(Movie m){
    movie = m;
  }
  public void changeSong(Song s){
    song = s;
  }

  public int getNumEntries(){

    /*
    System.out.println("Test: Owner is " + owner);

    if((book != null) && (movie != null)){
      System.out.println("Current book is " + book + " and current movie is " + movie);
    }
    else if (book != null){
      System.out.println("Current book is " + book);
    }
    else if(movie != null){
      System.out.println("Current movie is " + movie);
    }
    */
    return numEntries;
  }

  public Book getBook(){
    return book;
  }

  public Movie getMovie(){
    return movie;
  }

  public Song getSong(){
    return song;
  }

  public String toString() 
  {
    String info = "";

    if((book != null) && (movie != null) && (song != null)){
      info = book.toString() + ", " + movie.toString() + ", " + song.toString();
    }
    else if((book != null) && (movie != null)){
      info = book.toString() + ", " + movie.toString();
    }
    else if (book != null){
      info += book.toString();
    }
    else if(movie != null){
      info += movie.toString();
    }
    
    return info;
  }

  public void testBook(Book testingBook){
    System.out.println("Testing book: " + testingBook);
  }

  public void setOwner(String newOwn){
    owner = newOwn;
  }
}