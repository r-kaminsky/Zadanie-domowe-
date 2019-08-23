import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.printf("%25s", "WYNIK");
        System.out.println();
        System.out.println("--------------------------------------------------");
        Dziecko dziecko1 = new Dziecko("Rodruigez");

        String[] imie = {"Sancho", "Pancho", "Herman", "Jon", "Bekart", "Nobody"};
        Random r = new Random();
        int randomNazwisko = r.nextInt(imie.length + 1);
        System.out.println((char)27 + "[34m");
        System.out.println(imie[randomNazwisko] + " " + dziecko1.getName());
        System.out.println();
        System.out.println((char)27 + "[30m");
        System.out.println("--------------------------------------------------");



    }
}
