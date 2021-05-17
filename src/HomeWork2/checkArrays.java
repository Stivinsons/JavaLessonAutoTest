package HomeWork2;

import java.sql.SQLOutput;

public class checkArrays{


    public static void checkTwoDimArrays(String[][] myArrays) throws Exception {
        boolean check = true;
        int sum = 0;


        if (myArrays.length == 4) { //проверка на 4 строки
            for (int i = 0; i < myArrays.length; i++) {
                if (myArrays[i].length == 4) {
                    check = true;//проверка на 4 столбца
                } else {
                    check = false;
                    throw new MyArraySizeException();
                }
            }
        }else{
            throw new MyArraySizeException();
        }

        if (check == true){
            for (int firstValue = 0; firstValue < myArrays.length; firstValue++){
                for (int secondValue = 0;secondValue < myArrays[firstValue].length;secondValue++){
                    try{
                        sum = sum + Integer.parseInt(myArrays[firstValue][secondValue]);
                        System.out.println("сумма = " + sum);
                    } catch (NumberFormatException e){
                        throw new MyArrayDataException(firstValue, secondValue);
                    }
                }
            }
        }
    }
}
