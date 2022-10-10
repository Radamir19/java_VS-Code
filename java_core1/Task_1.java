package java_core1;

public class Task_1{
    
    public static boolean checkSum(int a, int b){

        int c = a + b;

        if(c >= 10 && c <= 20){
            
            System.out.println("сумма подходит");

        }else{
            
            System.out.println("сумма не подоходит");
        }
        return false;

    }


    public static void positiveOrNegative(int a){

        if(a >= 0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }

    }


    public static boolean positive_or_negative(int a){

        if(a >= 0){
            return true;
        }else{
            return false;
        }

    }

    public static void stringNTimes(String str, int a){

        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    
    public static boolean leapYear(int year){

        if(year % 4 == 0){
            if(year % 100 != 0){
                if(year % 400 == 0){
                    return true;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
        return false;

    }


    public static void main(String[] args) {

    }
}