public class Slytherin extends  Hogwarts{
    int cunning;
    int determination;
    int ambition;
    int rasoursefulness;
    int lustForPower;

    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination, int ambition, int rasoursefulness, int lustForPower) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.rasoursefulness = rasoursefulness;
        this.lustForPower = lustForPower;
    }
}