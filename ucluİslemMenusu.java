import java.util.Scanner;

public class ZorlayiciIslemler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        while (devam) {
            // Menü seçeneklerini göster
            System.out.println("\n--- Zorlayıcı İşlem Menüsü ---");
            System.out.println("1. Faktöriyel Hesapla");
            System.out.println("2. Asal Sayı Kontrolü");
            System.out.println("3. Fibonacci Dizisi Üret");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen bir işlem kodu girin: ");
            
            int secim = scanner.nextInt();
            
            switch (secim) {
                case 1: // Faktöriyel Hesaplama
                    System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı girin: ");
                    int n = scanner.nextInt();
                    long faktoriyel = 1;
                    for (int i = 1; i <= n; i++) {
                        faktoriyel *= i;
                    }
                    System.out.println(n + " sayısının faktöriyeli: " + faktoriyel);
                    break;
                    
                case 2: // Asal Sayı Kontrolü
                    System.out.print("Asal olup olmadığını kontrol etmek istediğiniz sayıyı girin: ");
                    int sayi = scanner.nextInt();
                    boolean asalMi = true;

                    if (sayi < 2) {
                        asalMi = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(sayi); i++) {
                            if (sayi % i == 0) {
                                asalMi = false;
                                break;
                            }
                        }
                    }
                    if (asalMi) {
                        System.out.println(sayi + " bir asal sayıdır.");
                    } else {
                        System.out.println(sayi + " bir asal sayı değildir.");
                    }
                    break;
                    
                case 3: // Fibonacci Dizisi Üretimi
                    System.out.print("Kaç elemanlı Fibonacci dizisi oluşturmak istersiniz? ");
                    int elemanSayisi = scanner.nextInt();
                    int onceki = 0, sonraki = 1;
                    System.out.print("Fibonacci Dizisi: " + onceki + " " + sonraki);
                    
                    for (int i = 2; i < elemanSayisi; i++) {
                        int yeniSayi = onceki + sonraki;
                        System.out.print(" " + yeniSayi);
                        onceki = sonraki;
                        sonraki = yeniSayi;
                    }
                    System.out.println();
                    break;
                    
                case 4: // Çıkış
                    System.out.println("Programdan çıkılıyor...");
                    devam = false;
                    break;
                    
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }
}
