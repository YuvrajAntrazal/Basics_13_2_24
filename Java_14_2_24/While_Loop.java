public class While_Loop {

    public static boolean isEvenNumber(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num=5;
        int count=0;
        while(num<=20){
            if(isEvenNumber(num)){
                System.out.print(num+" ");
                count++;
                if(count==5){
                    break;
                }
            }
            num++;
           
        }
        System.out.println();
        System.out.println("Total Even No.: "+count);

    }
}
