
import java.util.Random;

public class randomSayıOlusturma {

    public static void main(String[] args) {
        Random rastgele = new Random();
        int sayi = rastgele.nextInt(50);
        System.out.println("Rastgele atanan sayı: " + sayi);

    }

}
