public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyality;
    private int honor;

    public Hufflepuff(String name, int magicPower, int transgression, int diligence, int loyality, int honor) {
        super(name, magicPower, transgression);
        this.diligence = diligence;
        this.loyality = loyality;
        this.honor = honor;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "diligence=" + diligence +
                ", loyality=" + loyality +
                ", honor=" + honor +
                ", name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }

    @Override
    public int calculeteSpicificScore() {
        return diligence+loyality+honor;
    }


}



