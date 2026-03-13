/*
 * Activity 2.2.7
 *
 * A Movie class for the MediaLibrary program
 */
    public class Movie {
    private String title;
    private Double length;
    private int rating;

    
  /*** Constructor ****/
  public Movie(String t, Double l)
  {
    title = t;
    length = l;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public Double getLength() {
    return length;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info =  title + ", " + length + " hours long";
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

  public void setLength(double l) {
    length = l;
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

  public boolean equals(Movie m){
    if (this.title == m.title){
      if(this.length == m.length){
        return true;
      }
    }
    return false;
  }
}
