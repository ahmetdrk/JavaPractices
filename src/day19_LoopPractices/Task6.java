package day19_LoopPractices;

import java.util.Scanner;

public class Task6 {


    /* Scanner scan = new Scanner(System.in);

     String str = scan.next();
     char ch = str.charAt(0);
     int count1 = 0;
     for (int i = 0; i < str.length(); i++) {
         char ch1 = str.charAt(i);
         int count = 0;
         for (int j = 0; j < str.length(); j++) {
             char each = str.charAt(j);
             if(ch1 == each){
                 count++;
             }
         }if(count > count1){
             count1 = count;
             ch = str.charAt(i);
         }



     }
     System.out.println(ch + " has the highest frequency, and its frequency is " + count1);

*/
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi1;
        int sayi2;

        System.out.println("İlk sayıyı girin");
        sayi1 = giris.nextInt();

        System.out.println("İkinci sayıyı girin");
        sayi2 = giris.nextInt();

        for (int i = sayi1; i <= sayi2; i++)
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
    }
}






