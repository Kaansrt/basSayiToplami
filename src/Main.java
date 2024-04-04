import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,value,result=0;
        System.out.print("Bir sayi giriniz : ");
        number = inp.nextInt();
        while (number != 0) {
            value = number%10;
            result +=value;
            number /=10;
        }
        System.out.println("Basamaklarının toplamı : "+result);
    }
}