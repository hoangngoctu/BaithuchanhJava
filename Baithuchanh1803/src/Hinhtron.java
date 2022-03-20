import java.util.Scanner;
public class App1803 {
    public static double tinhDienTich(double r) {
        return r * r * 3.14;
    }
    public static double tinhChuVi(double r){
        return r * 2 * 3.14;
    }
    public static void main(String[] args) {
        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron: ");
        r = scanner.nextDouble();
        System.out.println("Dien tich hinh tron la: " + tinhDienTich(r));
        System.out.println("Chu vi hinh tron la: "+ tinhChuVi(r));
    }
} 