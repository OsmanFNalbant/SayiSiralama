import java.util.Scanner;

public class SayiSiralama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Birinci sayi:");
        a = sc.nextInt();
        System.out.println("Ikinci sayi:");
        b = sc.nextInt();
        System.out.println("Ucuncu sayi:");
        c = sc.nextInt();
        if(a>b && a>c){
            if(b>c){
                System.out.println("Sıralama: a > b > c");
            }
            else{
                System.out.println("Sıralama: a > c > b");
            }
        }
        else if(b>a && b>c){
            if(a>c){
                System.out.println("Sıralama: b > a > c");
            }
            else{
                System.out.println("Sıralama: b > c > a");
            }
        }
        else if(c>a && c>b){
            if(a>b){
                System.out.println("Sıralama: c > a > b");
            }
            else{
                System.out.println("Sıralama: c > b > a");
            }
        }
    }
    }