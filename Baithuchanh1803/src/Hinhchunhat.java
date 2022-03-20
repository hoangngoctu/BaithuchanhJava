import java.util.Scanner;

public class HinhChuNhat {
   float cd, cr ,cv,dt;
   public void nhapchieudai() {
      System.out.print("Nhap chieu dai: ");
      Scanner sc = new Scanner(System.in);
      cd = sc.nextFloat();
  }
  public void nhapchieurong() {
   System.out.print("Nhap chieu rong: ");
   Scanner sc = new Scanner(System.in);
   cr = sc.nextFloat();
  }
  public void tinhchuvi(){
     cv = (cd + cr)*2;
  }
  public void tinhdientich(){
     dt = cd *cr ;
  }
  public void inchuvi(){
     System.out.println("Chu vi hinh chu nhat :" + cv);
  }
  public void indientich(){
     System.out.println("Dien tich hinh chu nhat:" + dt);
  }
  public static void main(String[] args) {
   HinhChuNhat hcn = new HinhChuNhat();
   hcn.nhapchieudai();
   hcn.nhapchieurong();
   hcn.tinhchuvi();
   hcn.tinhdientich();
   hcn.inchuvi();
   hcn.indientich();
}

} 