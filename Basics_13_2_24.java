public class Basics_13_2_24 {
    public static void main(String[]args){
        double d1=20.00d;
        double d2=80.00d;
        double ans=(d1+d2)*100d;
        double x=(ans%40.00);

        boolean result=(x==0)?true:false;
        System.out.println(result);
        if(result!=true){
            System.out.println("got Some Remainder");
        }
        // if(x==0){
        //     System.out.println("True");
        // }
        
        // int a=10;
        // int b=12;
        // int ans=(a>b)?a:b;
        // System.out.println(ans);;
        // int a=10;
        // int ans=a--;
        // System.out.println(ans);
        // System.out.println(ans+5);
        // char a='A';
        // char b='B';
        // System.out.println(" "+a+b);
        // double dnum=12.7867;
        // String str="67589";
        // System.out.println(dnum+str);

        
        // char heartSymbol = '\u2764';
        // System.out.println("Uni  code value of heart symbol: " + heartSymbol);

    // double pound=0.45359237d;
    // System.out.println(pound*200d);

    
    }
}
