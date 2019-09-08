public class NonFiction extends Book
{
    private double deweyNum;

    public NonFiction()
    {
        super();
        setDewey(0.0);
    }

    public void setDewey(double inDewey)
    {
        deweyNum = inDewey;
    }
    
    public double getDewey()
    {
        return deweyNum;
    }
    
    public String toString()
    {
        return super.toString() + "\n\tYou can find this book in section: " + getDewey();
    }
}
