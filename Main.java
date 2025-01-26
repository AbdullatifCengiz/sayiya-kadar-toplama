import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner latf=new Scanner(System.in);

    System.out.println("Lütfen son sayıyı girin");
    int sayi=latf.nextInt();

    int toplam=0;

    for (int i=sayi; i>0; i--){
        toplam=i+toplam;
        }
        System.out.print("toplam ;"+toplam);
    }
}