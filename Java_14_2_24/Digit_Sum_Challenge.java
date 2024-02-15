public class Digit_Sum_Challenge {
    public static int sumDigits(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        while(number>0){
            int lastdgt=number%10;
            sum+=lastdgt;
            number=number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ans=sumDigits(1000);
        System.out.println("The Sum of 125 is: "+ans);
    }
}
