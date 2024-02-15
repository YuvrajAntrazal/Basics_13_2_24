public class Loops { 
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.print(i + " ");

                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("\nSum of the first 5 numbers divisible by 3 or 5 is: " + sum);
    }
}





    // Prime no. b/w 10 to 50.
    //     public static void main(String[] args) {
//         int count = 0;

//         for (int num = 10; num <= 50; num++) {
//             if (isPrime(num)) {
//                 System.out.print(num + " ");
//                 count++;

//                 if(count==3){
//                     System.out.println("Closing Loop");
//                     break;
//                 }
//             }
//         }

//         System.out.println("\nTotal num between 10 to 50 that are prime: " + count);
//     }

//     public static boolean isPrime(int num) {
//         if (num < 2) {
//             return false;
//         }
//         for (int i = 2; i<num; i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

    
    
    
    
    
    
    
    
    
    
    //Finding Interest of the amount
    // public static void main(String[] args) {
    //     for(double i=7.5;i<=10;i+=0.25){
    //         calculateInterest(100.00,i);
    //     }
    // }

    // public static void calculateInterest(double amount,double rate){
    //     System.out.println("Interest of $."+amount+" at "+rate+" % is "+(amount*(rate/100)));
    // }
    
