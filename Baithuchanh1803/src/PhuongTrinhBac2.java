import java.util.Scanner;
public class PTB2 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    double a, b, c, x1, x2, del;
    System.out.print("Nhap vao he so a = ");
	a = sc.nextDouble();
	System.out.print("Nhap vao he so b = ");
	b = sc.nextDouble();
	System.out.print("Nhap vao he so c = ");
	c = sc.nextDouble();

	if (a == 0) {
	    if (b == 0) {
		if (c == 0) {
		    System.out.println("Phuong trinh vo so nghiem!");
		} else {
		    System.out.println("Phuong trinh vo nghiem!");
		}
	    } else {
		System.out.println("Phuong trinh co nghiem la: " + (-c / b));
	    }
	} else { 
	    del = b * b - 4 * a * c;
	    if (del < 0) {
		System.out.println("Phuong trinh vo nghiem!");
	    } else if (del == 0) {
		x1 = x2 = -b / (2 * a);
		System.out.println("Phuong trinh co nghiem kep: " + x1);
	    } else {
		x1 = (-b + Math.sqrt(del)) / (2 * a);
		x2 = (-b - Math.sqrt(del)) / (2 * a);
		System.out.println("Phuong trinh co 2 nghiem phan biet la:\nx1 = " + x1 + "\nx2 = " + x2);
	    }
	}
	sc.close();
    }
}