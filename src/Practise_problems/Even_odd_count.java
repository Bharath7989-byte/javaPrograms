package Practise_problems;

public class Even_odd_count {
    public static void main(String[] args) {
        int n=23456;
        int rem,Evencount=0,Oddcount=0;
        while(n>0){
            rem=n%10;
            if(rem%2==0){
                Evencount=Evencount+1;
            }
            else {
                Oddcount=Oddcount+1;
            }
            n=n/10;
        }
        System.out.println("Evencount--"+Evencount);
        System.out.println("Oddcount--"+Oddcount);
    }
}
