public class Expression_statements_More_14_2_24 {  
    
    public static void main(String[] args) {
        int position=calculateHighScorePosition(1400); //Score pass kr ke Position return kr rha hai h yeh.
        displayhighScorePosition("Yuvi", position);// Fir woh position isme pass kr rhe hai
    }

    public static void displayhighScorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+position+" on the high score list.");
    }

    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        }
        else if(score>=500 && score<=1000){
            return 2;
        }
        else if(score>=100 && score<=500){
            return 3;
        }
        else{
            return 4;
        }
    }
    //________________________________________________________________________________________________
    // public static void main(String[]args){
    //     int age=10;
    //     if(age>15){
    //         return;
    //     }
    //     else{
    //         System.out.println("Age is less then 15");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner ip=new Scanner(System.in);
    //     System.out.println("Enter 3 numbers to find the greatest:");
    //     int a=ip.nextInt();
    //     int b=ip.nextInt();
    //     int c=ip.nextInt();
    //     greatestNum(a,b,c);

    //     // ip.close();
    // }
    // public static void greatestNum(int a,int b,int c){
    //     if(a>b && a>c){
    //         System.out.println("largest no.: "+a);
    //     }
    //     else if(b>c){
    //         System.out.println("largest no.: "+b);
    //     }
    //     else{
    //         System.out.println("largest no.: "+c);
    //     }
}
