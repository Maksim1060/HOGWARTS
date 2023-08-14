import java.nio.ByteBuffer;

public class Main {
    public static void main(String[] args) {

     Griffindor harryPotter=new Griffindor("Harry Potter",65,54,32,56,89);
     Griffindor hermionaGranger=new Griffindor("Hermiona Granger",87,65,67,43,32);
        Griffindor ronUisley=new Griffindor("Ron Uisley",87,56,43,97,21);

Slytherin dracoMalfoy=new Slytherin("Draco Malfoy",54,67,23,46,54,23,66);
Slytherin gregorygoil=new Slytherin("Gregogy Goil",87,43,21,43,54,12,77);
dracoMalfoy.compare(hermionaGranger);
gregorygoil.compare(harryPotter);
hermionaGranger.compare(harryPotter);

    }

}