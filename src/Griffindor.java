public class Griffindor extends Hogwarts{
    int nobility;
    int honor;
    int courage;

    public Griffindor(String name, int magicPower, int transgression, int nobility, int honor, int courage) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
}