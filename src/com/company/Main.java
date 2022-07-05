package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import  java.util.Random;
public class Main {

    public static void main(String[] args) {

        System.out.printf("****Sayı Tahmin Oyununa Hoşgeldiniz****\n \t\t\t\tKurallar \n 1) 4 Tahmin hakkınız vardır. Sayılar 1 ile 80 arasındadır.\n 2) İpuçlarına göre hareket etmelisiniz.\n");

        Random rnd = new Random();
        int sayı = rnd.nextInt(81);


        Scanner scan = new Scanner(System.in);

        int i = 1;

        while (i == 1) {


            System.out.print("1. tahmininiz:");

            int tahmin = scan.nextInt();
            if (tahmin == sayı) {
                System.out.println("Tam isabet. Oyunu kazandın. Tebrikler.");
                break;
            } else if (tahmin > sayı) {
                System.out.println("Daha düşük yerlerde aramalısın.");
            } else if (tahmin < sayı) {
                System.out.println("Daha yüksek bir sayı olmalı.");
            }

            System.out.print("2. tahmininiz:");
            int tahmin2 = scan.nextInt();
            if (tahmin2 == sayı) {
                System.out.println("Çok iyisin. Oyunu kazandın. Tebrikler.");
                break;
            }
            else if (tahmin2 > sayı) {
                System.out.println("Sanırım bu kadar yüksek olamaz.");
            }
            else if (tahmin2 < sayı) {
                System.out.println("Biraz arttırsan iyi olur.");
            }

            System.out.print("3. tahmininiz:");
            int tahmin3 = scan.nextInt();
            if (tahmin3 == sayı) {
                System.out.println("Zor da olsa buldun. Tebrikler.");
                break;
            }
            else if (tahmin3 > sayı) {
                System.out.println("Biraz daha azalt. Yapabilirsin.");
            }
            else if (tahmin3 < sayı) {
                System.out.println("Biraz daha yükseklerde...");
            }

            System.out.print("4. tahmininiz:");
            int tahmin4 = scan.nextInt();
            if (tahmin4 == sayı) {
                System.out.println("Son anda! Tebrikler.");
                break;
            }
            else {
                System.out.println("Üzgünüm. Yeniden denemek iyi fikir olabilir.");
                System.out.print("Bulman gereken sayı " +sayı + "olmalıydı\n");
            }
            System.out.println("Yeniden denemek istiyorsan 1'e basabilirsin.");
            i = scan.nextInt();

        }





    }
}
