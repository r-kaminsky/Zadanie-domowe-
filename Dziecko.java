import java.util.Random;

public class Dziecko extends Rodzic {
   public Dziecko(String name){
       super(name);

   }

    public static void main(String[] args) {
        String[] imie = {"Sancho", "Pancho", "Herman", "Jon", "Bekart", "Nobody"};
        Random r = new Random();
        int randomNazwisko = r.nextInt(imie.length + 1);
        System.out.println(imie[randomNazwisko]);




    }
}
