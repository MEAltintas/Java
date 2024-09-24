public class IkizAsallar {
    
    // Asal sayı kontrolü yapan fonksiyon
    public static boolean asalMi(int sayi) {
        if (sayi < 2) return false; // 2'den küçük sayılar asal olamaz
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) return false; // sayi, i'ye bölünüyorsa asal değildir
        }
        return true;
    }

    public static void ikizAsallariBul(int limit) {
        for (int i = 2; i <= limit - 2; i++) {
            if (asalMi(i) && asalMi(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    public static void main(String[] args) {
        int limit = 100; // 100'e kadar olan ikiz asalları bul
        System.out.println("İkiz asallar:");
        ikizAsallariBul(limit);
    }
}
