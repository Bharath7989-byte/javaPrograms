package Practise_problems;

public class reverse_a_number {
    public static void main(String[] args) {
        int n=121;
        int rev=0,rem;
        int temp;
        temp=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
