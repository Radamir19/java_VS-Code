package java_core1;

import static java.lang.Integer.valueOf;

public class Task_9 {
    public static void main(String[] args) throws MyArraySizeException, MyDataArrayException {
        createArray();
    }

    public static int createArray() throws MyArraySizeException,MyDataArrayException {
        int sum = 0;
        int n;
        String[][] arr = {{"1","2","3","4"},{"10","9","10","12"},{"13","15","14","1"},{"1","123","1  21","2"}};
        if(arr.length != 4){
            throw new MyArraySizeException();
        }else{
            System.out.println("Right size of the array");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    n = Integer.valueOf(arr[i][j]);
                    sum += n;
                } catch (NumberFormatException e) {
                    throw new MyDataArrayException(String.format("В позиции [%d][%d] исходного массива находится не целое число %s",i,j,arr[i][j]));
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends Throwable{
    
}

class MyDataArrayException extends Throwable {

    public MyDataArrayException(String format) {
    }
}
