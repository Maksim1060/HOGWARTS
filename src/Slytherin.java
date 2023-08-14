public class Slytherin extends  Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int rasoursefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination, int ambition, int rasoursefulness, int lustForPower) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.rasoursefulness = rasoursefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", rasoursefulness=" + rasoursefulness +
                ", lustForPower=" + lustForPower +
                ", name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }

    @Override
    public int calculeteSpicificScore() {
       return   cunning+determination+ambition+rasoursefulness+lustForPower;
    }


}


