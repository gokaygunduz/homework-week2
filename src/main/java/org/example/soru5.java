package org.example;

import java.util.Scanner; // sayı almak için scanner kütüphanesini dahil ediyoruz

public class soru5 {
    public static void main(String[] args) {
        Scanner klayve = new Scanner(System.in);
        System.out.println("a sayiyisini giriniz: "); // kullanıcıdanan  ilk sayıyın girilmesi istenir
        int a = klayve.nextInt(); // kullanıcıdan girilen değer integer a olarak atanır.
        System.out.println("b sayıyısini giriniz ");// kullanıcıdan ikinci sayı girilmesi istenir
        int b = klayve.nextInt(); // kullanıcının girdiği 2. değer integer b olarak atanır ve saklanır.
        System.out.println("c  sayıyısini  giriniz"); //  kullanıcıdan son sayının girilmesi istenir
        int c = klayve.nextInt(); // kullanıcının girdiği 3. değerde c dir.
        if (a >= b) {
            if (b >= c)
                System.out.print("üç sayının sıralaması: a>=b>=c");
            else if (c >= a)
                System.out.print("üç sayının sıralaması: c>=a>=b");
            else if (a > c)
                System.out.print("üç sayının sıralaması: a>=b>c");
        }
        if (b > a) {
            if (c >= b)
                System.out.print("üç sayının sıralaması: c>=b>a");
            else if (c >= a)
                System.out.print("üç sayının sıralaması: b>c>=a");
            else if (a > c)
                System.out.print("üç sayının sıralaması:b>a>c");
        }


    }
}
    /* normalde yapılması gereken soru 5 teki if else değerlerini mid = ortanca değeri atayıp her bir if else den sonra
    mid = ortanca değer yazıp sonunda return mid yapmak lazım ama kodu yazdığımda bir hata verdi hatayı bulamadım bende
    kullanıdan alınan değil 3 tane değerin ortancasını yazdıran kodu yazdım */

    class soru6 {
        public static int mid(int a, int b, int c) {
            if ((a >= b && a <= c) || (a <= b && a >= c)) {
                return a; //ortanca değer a
            } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
                return b; // ortanca değer b
            } else {
                return c; // ortanca değer c
            }
        }

        public static void main(String[] args) {
            int s1 = 27;
            int s2 = 118;
            int s3 = 73;
            int midDeger = mid(s1, s2, s3);
            System.out.println("Ortancası: " + midDeger);
        }
    }



     class soru7{
    public static int main(String[] args ) {
        Scanner okuyucu = new Scanner(System.in);
        System.out.print("Bir sayı giriniz ");
        int sayi = okuyucu.nextInt();
        // sayı 0 dan küçükse negatif
        if (sayi < 0)
        {
            System.out.println(sayi + " negatiftir");
            return -1;
            // sayı 0 dan büyükse pozitif
        } else if (sayi>0) {


            System.out.println(sayi + "pozitiftir");

            return 1;
            // sayı 0'a eşit ise
        }else
            System.out.println(sayi + "sıfırdır");

            return 0;

    }
}

 class soru8{  // üst üçgeni çizmek için kullanılan kod alt içinse  i değerini 6 dan başlatıp i-- yaparak i>0a kadar.
     public static void main(String[] args) {
         int kenarUzunlugu;
         String nesne;

         Scanner scan = new Scanner(System.in);

         //Üçgenimizin uzunluğunu giriyoruz.
         System.out.print("Uzunluk değerini giriniz = ");
         kenarUzunlugu = scan.nextInt();

         //Ekranda olmasını istediğimiz harf yada nesne giriyoruz.
         System.out.print("Ekrana yazılacak nesne: = ");
         nesne = scan.next();

         //Orta nokta uzunluğunu buluyoruz.
         int ortaNokta = kenarUzunlugu - 1;
         int taban = kenarUzunlugu * 2 - 1; // * sayısı girilen değerin 2 katının 1 eksiği

         // For döngüleriyle girilen nesneyi ekrna yazdırıyoruz.
         for (int i = 0; i < kenarUzunlugu; i++)
         {
             for (int k = 0; k < taban; k++)
             {
                 if ((i + k == ortaNokta || k - i == ortaNokta))
                 {
                     System.out.print(nesne);
                 }
                 else if ((i + k >= ortaNokta && k - i <= ortaNokta))
                 {
                     System.out.print("*");
                 }
                 else if (i == ortaNokta)
                     System.out.print("*");
                 else
                     System.out.print(" ");

             }
             System.out.println();
         }
     }

 }

 /* soru 9 girilen saniye değerini saat dakika saniye olarak yazdırma */
 class soru9{
     public static void main(String[] args){

         //klavyeden okuma yapmak için scarner nesnesi oluşturulur
         Scanner okuyucu  = new Scanner(System.in);
         System.out.print("Saniyeyi giriniz");
         int sure =okuyucu.nextInt();
         System.out.println("girdiginiz saniye" +sure );
     }
     public void displayDuration(long sure) {

     long saat = sure / 3600;
     long dakika = (sure % 3600) / 60;
     long saniye = (sure % 3600) % 60;

     if (saat != 0) {
         System.out.println(saat + " saat");
     }
     if (dakika != 0) {
         System.out.println(dakika + " dakika");
     }
     if (saniye != 0) {
         System.out.println(saniye + " saniye");
     }
 }


 }
class soru10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi = scanner.nextInt();
        int bolen = 2;
        int bolunen=sayi;
        System.out.println("Asal çarpanlar");
        while(bolen<sayi){
            if(bolunen%bolen==0){
                System.out.println(bolen);
                bolunen/=bolen;

            }
            else{
                bolen++;
            }
        }

        }
    }

    class soru12{
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Bir çift sayı girin: "); // kullancıdan alınan çift sayı değeri
                int n = scanner.nextInt();
                scanner.close();

                if (n < 4 || n % 2 != 0) {
                    System.out.println("Geçersiz giriş! Lütfen çift bir sayı girin.");
                } else {
                    boolean found = false;
                    for (int i = 2; i <= n / 2; i++) {
                        if (isAsal(i) && isAsal(n - i)) {
                            System.out.printf("%d = %d + %d", n, i, n - i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Verilen şartlara uygun iki asal sayı yoktur.");
                    }
                }
            }

            public static boolean isAsal(int sayi) {
                if (sayi < 2) {
                    return false;
                }

                for (int i = 2; i <= Math.sqrt(sayi); i++) {
                    if (sayi % i == 0) {
                        return false;
                    }
                }

                return true;
            }


    }










