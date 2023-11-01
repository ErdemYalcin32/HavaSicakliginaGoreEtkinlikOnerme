import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz");
        heat = input.nextInt();

        switch (heat) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Kayak Yapabilirsiniz.");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Sinemaya Gidebilirsiniz.");
                break;
            default:
                System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}
