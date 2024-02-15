public class Enhanced_Switch_Statements {
    public static void printDayOfWeek(int day){
        String dayOfWeek=switch (day) {     //dayOfWeek is used to store the value of Switch statements.
            case 0->"Sunday"; 
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"Saturday";
            default->"Invalid Day";
        };
        System.out.println(day+" stands for "+dayOfWeek);
    }
    
    public static void main(String[] args) {
        printDayOfWeek(1);
    }
}
