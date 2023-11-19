package com.meryem.odev2;

import java.util.Scanner;

public class If_IfElse_IfElseIfElse {
    public static void main(String[] args) {
        /**
         * if ve else ifadeleri, programın akışını kontrol etmek için kullanılan yapısal
         * unsurlardır. Koşullu ifadeler olarak adlandırılırlar ve belirli bir koşulun doğru
         * veya yanlış olmasına bağlı olarak farklı işlemlerin gerçekleştirilmesini sağlarlar.
         *
         * ->if İfadesi: Bir koşulun doğru olup olmadığını kontrol eder.
         * Eğer koşul doğruysa, içindeki kod bloğunu çalıştırır.
         *
         * -> else if ifadesi: bir önceki if ifadesinin koşulunun yanlış
         * olduğu durumu ele alır ve yeni bir koşul kontrol eder
         *
         * -> else İfadesi: Bir if ifadesinden sonra gelir ve bir önceki if ifadesinin
         * koşulunun yanlış olduğu durumu ele alır. Eğer önceki if ifadesi doğru değilse,
         * else ifadesinin içindeki kod bloğu çalıştırılır
         */

        // 1.Eğer x değeri 10'dan büyükse, ekrana "x 10'dan büyük" yazdır
        int x = 20;
        if (x > 10) {
            System.out.println("x 10'dan büyük.");
        }

        // 2.Eğer x değeri 5'e eşit değilse, ekrana "x 5'e eşit değil" yazdır
        if (x == 5) {
            System.out.println("x 5'e eşit.");
        } else {
            System.out.println("x 5'e eşit değil.");
        }


        // 3. Kullanıcıdan alınan sayı pozitif mi, negatif mi, yoksa sıfır mı?
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        if (sayi > 0) {
            System.out.println("Girilen sayı pozitif.");
        } else if (sayi < 0) {
            System.out.println("Girilen sayı negatif.");
        } else {
            System.out.println("Girilen sayı sıfır.");
        }


        // 4. Kullanıcıdan alınan yaşa göre yaş kategorisi belirleme
        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();
        if (yas < 0) {
            System.out.println("Geçersiz yaş girdiniz.");
        } else if (yas < 18) {
            System.out.println("Çocuk kategorisindesiniz.");
        } else if (yas < 65) {
            System.out.println("Yetişkin kategorisindesiniz.");
        } else {
            System.out.println("Emekli kategorisindesiniz.");
        }


        // 5. Kullanıcıdan alınan iki sayının büyüklüğünü karşılaştırma
        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();
        if (sayi1 > sayi2) {
            System.out.println("İlk sayı, ikinci sayıdan büyük.");
        } else if (sayi1 < sayi2) {
            System.out.println("İlk sayı, ikinci sayıdan küçük.");
        } else {
            System.out.println("İki sayı eşit.");
        }



    }
}
