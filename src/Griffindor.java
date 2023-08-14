public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int magicPower, int transgression, int nobility, int honor, int courage) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }

    @Override
    public int calculeteSpicificScore() {
        return nobility+honor+courage ;
    }


}




