public class Song {
    
  private String title;
  private String artist;
  private int rating;
  
  /*** Constructor ****/
  public Song(String t, String a)
  {
    title = t;
    artist = a;
    rating = 0;
  }
  public Song(String t, String a, int r)
  {
    title = t;
    artist = a;
    rating = r;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", by " + artist;
    if (rating != 0) 
    { 
      info += ", rating of " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setArtist(String a) {
    artist = a;
  }

  public void adjustRating(int r){
    rating += r;

    if (rating > 10){
      rating = 10;
    }
    if(rating < 0){
      rating = 0;
    }
  }

  public boolean equals(Song s){
    if (this.title == s.title){
      if(this.artist == s.artist){
        return true;
      }
    }
    return false;
  }
}
