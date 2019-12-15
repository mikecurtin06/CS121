/**
 * This class encapsulates the data required to represent a song in a collection
 * of MediaItems. It derives from MediaItem.
 * In addition to its superclass attributes, the attributes of a song are: 
 *       playing time, album, and label.
 **/
 public class Song extends MediaItem {

  private double playTime;//minutes
  private String album;
  private String label;
 
  /* TODO: Implement this method:
   * Constructor
  */ 
  public Song(String title, String author, String genre, 
                   double playTime, String album, String label){




  }
  
 // get method for the play time
  public double getPlayTime(){
     return playTime;
  }
  
   // get method for the album 
  public String getAlbum(){
     return album;
  }
  
   // get method for the label
  public String getLabel(){
     return label;
  }
  
  /* TODO: Implement this method:
   * Override the superclass toString method. Use a call to the superclass toString method
   * to get the superclass attributes.
   * The return should have the format:
   *   Song: [title], [author], [genre], [playTime], [album], [label]
   * For example:
   *   "Song: Humble, Kendrick Lamar, hip hop, 2.57, Damn, Top Dawg"
   */
  public String toString(){
     return null;
  }
}