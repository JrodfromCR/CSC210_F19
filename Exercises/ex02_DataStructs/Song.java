public class Song {

  protected String title;
  protected String musician;

  public Song(String inTitle, String inMusician) {
    title = inTitle;
    musician = inMusician;
  }

  public String toString() {
    return (title+" by "+musician);
  }

  public String getTitle() { return title; }
  public String getMusician() { return musician; }
}
