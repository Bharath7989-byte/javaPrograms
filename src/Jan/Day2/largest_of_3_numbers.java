package Jan.Day2;

public class largest_of_3_numbers {
    public static void main(String[] args) {
        int a=40, b=20 ,c=30;
        if(a>b && a>c){
            System.out.println("A is largest");
        }
        else if (b>a && b>c) {
            System.out.println("B is largest");

        }
        else {
            System.out.println("C is largest");
        }
    }
}
