# java_VS-Code
# task 1
1) Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в промежутке от 10 до 20(включительно),
если да - вернуть true, иначе - вернуть false
Решение: создать boolean метод и использовать условный оператор(if else) и оператор return(true or false)
Пример кода:
        
        public static boolean checkSum(int a, int b){

        int c = a + b;

        if(c >= 10 && c <= 20){
            
           System.out.println("сумма подходит");
           
           return false;

        }else{
            
            System.out.println("сумма не подоходит");
            
            return false;
        }

    }
    
2)Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. 
Замечание: ноль считаем положительным числом.
Решение: создать void метод и использовать условный оператор(if else)
Пример кода:

        public static void positiveOrNegative(int a){

        if(a >= 0){
        
            System.out.println("positive");
            
        }else{
        
            System.out.println("negative");
            
        }
 
   }
   
3)Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
Решение: создать boolean метод и использовать условный оператор (if else) и оператор return(true or false)
Пример кода:
        
        public static boolean positive_or_negative(int a){

        if(a >= 0){
        
            return true;
            
        }else{
        
            return false;
        }

    }
    
4)Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз.
Решение: использовать цикл for(т.к. в методе указано количество повторений)
Пример кода:
        
        public static void stringNTimes(String str, int a){

                for (int i = 0; i < a; i++) {
                
                System.out.println(str);
                
                }
        }
    
5)Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). 
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
Решение: год делиться либо на 4, либо на 400,но не делиться на 100. использовать условный оператор(if else) и оператор return(true or false)
Пример кода:
        
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
