import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int dikKenar,uzunKenar;
            double hipotenüs;

            Scanner input=new Scanner(System.in);
            System.out.print("Dik Kenarı Giriniz: ");
            dikKenar=input.nextInt();
            System.out.print("Uzun Kenarı Giriniz: ");
            uzunKenar=input.nextInt();

            hipotenüs=Math.sqrt(Math.pow(dikKenar,2)+Math.pow(uzunKenar,2));

            System.out.println("Hipotenüs: "+hipotenüs);

            int a,b,c,u;
            double alan;

            System.out.print("Birinci Kenarı Giriniz: ");
            a=input.nextInt();
            System.out.print("İkinci Kenarı Giriniz: ");
            b=input.nextInt();
            System.out.print("Üçüncü Kenarı Giriniz: ");
            c=input.nextInt();

            u=(a+b+c)/2;

            alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

            System.out.println("Alan: "+alan);
    }
}
