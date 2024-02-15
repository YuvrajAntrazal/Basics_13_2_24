import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args) {
        int day = 3;
    String result = switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> {
            yield "Wednesday"; // Return "Wednesday" from this case label in this we can add more commands
        }       //in simple words yield provides more flexibility to do in that particular block.
        case 4 -> "Thursday";
        default -> "Other day";
    };
    System.out.println(result); // Prints "Wednesday"



    
        // String name = "Yuvi";
        // String result = switch (name) {
        //     case "Ram", "Shyam", "Gopal" -> "Electrical Faculty";
        //     case "Yuvi", "Vinay", "Kunal" -> "Cricket Team";
        //     default -> "Chill Bro";
        // };
        // System.out.println(result);
    } 
    
        // String month="April";
        // switch (month){
        //     case "January":System.out.println("Hello January");
        //     break;
        //     case "Fbruary":System.out.println("Hello Fbruary");
        //     break;
        //     case "March":System.out.println("Hello March");
        //     break;
        //     case "April":System.out.println("Hello April");
        //     break;
        //     case "May":System.out.println("Hello May");
        //     break;
        //     case "June":System.out.println("Hello June");
        //     break;
        //     case "July":System.out.println("Hello July");
        //     break;
        //     case "August":System.out.println("Hello August");
        //     break;
        //     case "September":System.out.println("Hello september");
        //     break;
        //     case "October":System.out.println("Hello October");
        //     break;
        //     case "Novomber":System.out.println("Hello November");
        //     break;
        //     case "December":System.out.println("Hello December");
        //     break;
        //     default:System.out.println("Chill");

        // }

        // Scanner ip = new Scanner(System.in);
        
        // System.out.println("Enter two numbers:");
        // int a = ip.nextInt();
        // int b = ip.nextInt();

        // System.out.println("Enter the number for performing Operation");
        // System.out.println("Press 1 for Add");
        // System.out.println("Press 2 for Subtract");
        // int num = ip.nextInt();

        // switch(num) {
        //     case 1:
        //         System.out.println(a + b);
        //         break;
        //     case 2:
        //         System.out.println(a - b);
        //         break;
        //     default:
        //         System.out.println("Chill");
        // }
    }


