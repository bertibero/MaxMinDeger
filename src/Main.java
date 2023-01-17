import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adet, max, min, sayi;

        System.out.print("Kaç adet sayı gireceksiniz? :");
        adet = input.nextInt();

        System.out.print("1.Sayıyı giriniz :");
        sayi = input.nextInt();

        max = sayi;
        min = sayi;

        for (int i = 1; i<adet; i++){
            System.out.print( (i+1) +".sayıyı giriniz :");
            sayi = input.nextInt();
            if(sayi<min){
                min = sayi;
            }
            if(sayi > max){
                max = sayi;
            }
        }
        System.out.println("En büyük sayı = "+ max );
        System.out.println("En küçük sayı ="+ min);
    }
}