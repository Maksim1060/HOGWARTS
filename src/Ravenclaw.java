public class Ravenclaw extends Hogwarts{
    private int intelegence;
    private int winsdom;
    private int wit;
    private int creativ;

    public Ravenclaw(String name, int magicPower, int transgression, int intelegence, int winsdom, int wit, int creativ) {
        super(name, magicPower, transgression);
        this.intelegence = intelegence;
        this.winsdom = winsdom;
        this.wit = wit;
        this.creativ = creativ;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelegence=" + intelegence +
                ", winsdom=" + winsdom +
                ", wit=" + wit +
                ", creativ=" + creativ +
                ", name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }

    @Override
    public int calculeteSpicificScore() {
        return intelegence+winsdom+wit+creativ;
    }


}

