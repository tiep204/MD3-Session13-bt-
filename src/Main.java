import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] number = {2, 7, 9, 5, 3, 8, 22, 66, 99};
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên");
        int nhapVao = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == nhapVao) {
                System.out.println("Số " + nhapVao + " bạn vừa nhập vào ở vị trí: " + i);
                flag = true;
            }
            if (number[i]>m1){
                m3 = m2;
                m2 = m1;
                m1 = number[i];
            } else if (number[i]>m2) {
                m3 = m2;
                m2 = number[i];
            } else if (number[i]>m3) {
                m3 = number[i];
            }
        }
        if (m3 !=0){
            System.out.println("Số lơn thứ 3 trong mảng là: "+m3);
        }else {
            System.out.println("koong tim thay");
        }
        if (!flag) {
            System.out.println("không tìm thấy ");
        }
    }
}