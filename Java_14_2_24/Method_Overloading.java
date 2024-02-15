public class Method_Overloading {
    public static double convertToCntimeters(int heightInches){   //centimeters=inches×2.54
        return heightInches*2.54;
    }

    public static double convertToCntimeters(int heightFeet, int remHeightInches){   //centimeters=inches×2.54
        return ((heightFeet*12)+2.54);     // Converting feet+inches to inches.
 
        //convertToCntimeters(inch1);
        
}

public static void main(String[]args){
    System.out.println("5ft, 8in = "+convertToCntimeters(5,8)+"cm");
    System.out.println("68in = "+convertToCntimeters(68)+"cm");
}
}
