package Practise_problems;

public class maximum_of_3_numbers {
    public static void main(String[] args) {
        int a=20,b=10,c=5;
        if(a>b && a>c){
            System.out.println("A is maximum");
        } else if (b>a && b>c) {
            System.out.println("B is maximum");
            
        }
        else {
            System.out.println("C is maximum");
        }
    }
}
