import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i=0,topla=0;
        Scanner girdi = new Scanner(System.in);
        while(i%2==0){
            System.out.println("Bir Sayı Giriniz : ");
            i = girdi.nextInt();
            if(i%2 ==0 && i%4==0){
                topla+=i;

            }
        }
        System.out.println("Girilen çift ve 4'e bölünen sayıların toplamı :"+topla);
    }
}
