import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // doi tuong de nhap xuat
        Scanner sc = new Scanner(System.in);
        //khai bao bien de chua gia tri nhap vao
        String strHT = "";
        //thong bao dau vao
        System.out.println("Nhap ho ten: ");
        // gan gia tri tu ban phim
        strHT = sc.nextLine();
        System.out.println("Xin chao " + strHT);
    }
}