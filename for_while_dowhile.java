    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Döngüsü bitti");

        // j 10'dan küçük olduğu sürece do döngüsünü çalıştır demektir 
        //fakat baştan satır satır çalıştığı için j=20 olduğunda do çalışır 20<10 olmadığından döngü orada biter, j+=3 eklenmedi neden bilmiyorum
        int j = 20;
        do {
            System.out.println(j);
            j += 3;
        } while (j < 10);
        System.out.println("Do-While Döngüsü bitti");

    }

}
