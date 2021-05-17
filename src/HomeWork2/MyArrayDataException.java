package HomeWork2;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int firstValue, int secondValue){
        super("Ячейку [" + firstValue + "] ["  + secondValue + "] невозможно преобразовать");
    }
}
