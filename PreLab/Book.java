public class Book implements Enjoyable
{

    private String title;
    private int pageCount;
    private int wordCount;

    public Book()
    {
        setTitle("Undefined");
        setPageCount(-1);
        setWordCount(-1);
    }

    public int enjoy()
    {
        return pageCount / 50;
    }

    public void setTitle(String inTitle)
    {
        title = inTitle;
    }

    public void setPageCount(int inPageCount)
    {
        if (inPageCount > 0)
        {
            pageCount = inPageCount;
        }
    }

    public void setWordCount(int inWordCount)
    {
        if (inWordCount > 0)
        {
            wordCount = inWordCount;
        }
    }

    public String getTitle()
    {
        return title;
    }

    public int getPageCount()
    {
        return pageCount;
    }

    public int getWordCount()
    {
        return wordCount;
    }
    
    public String toString()
    {
        return "The title of this book is: " + getTitle() + ".\n\tIt has " + getPageCount() + " pages and contains " + getWordCount() + " words.\n\tThis book generates " + enjoy() + " units of joy.";
    }
}
