package Practise_problems;

public class count_no_of_digits {
    public static void main(String[] args) {
        int num=546789245  ;
        int count=0,rem;
        while(num>0){
            rem=num%10;
            count=count+1;
            num=num/10;

        }
        System.out.println(count);
    }
}
