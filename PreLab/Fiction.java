public class Fiction extends Book
{
    private String genre;
    
    public Fiction()
    {
        super();
        setGenre("Undefined");
    }
       
    public void setGenre(String inGenre)
    {
        genre = inGenre;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public String toString()
    {
        return super.toString() + "\n\tYou can find this book in the " + getGenre() + " section.";
    }
    
}
