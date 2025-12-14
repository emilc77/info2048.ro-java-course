package ro.info2048.primitive.bool;

public class LogicalOperatorAnd {
    public static void main(String[] args) {
        boolean pisicaRacita = true;
        boolean masinaReparata = false;

        boolean mergemVeterinar = pisicaRacita && masinaReparata;
        System.out.println(mergemVeterinar); // false
    }
}
