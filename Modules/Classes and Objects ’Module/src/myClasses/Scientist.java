package myClasses;

public class Scientist extends Person
{
    private String loser="";
    public void speak()
    {
        System.out.println("I am a" + loser + " Scientist !");
    }
    
    public Scientist(Scientist s)
    {
        this.loser=s.loser;
    }

    public Scientist(String s)
    {
        loser=s;
    }

    public Scientist()
    {
        loser="";
    }

    public String getLoser()
    {
        return loser;
    }

    public void setLoser(String loser)
    {
        this.loser = loser;
    }
}
