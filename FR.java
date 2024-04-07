import java.util.*;

public class FR {
    static int a=0,b=1,c;
    public static void main(String[] args) {
        System.out.print("type your number:");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        FR ob = new FR();
        System.out.print(a+","+b + ",");
        ob.CF(no);

    }


    void CF(int i) {
        if (i >=3 ){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
            CF(i-1);
        }
    }
}