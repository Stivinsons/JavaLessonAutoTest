package HomeWork3;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class TaskOneArrays<T> {
    private T[] array;

    public TaskOneArrays(T... array) {
        this.array = array;
    }

    public String changePlases() {
        String arraysString = Arrays.toString(array);
        System.out.println(arraysString);
        int oneIndexArrays = 0 + (int) (Math.random() * array.length - 1);
        int twoIndexArrays = 0 + (int) (Math.random() * array.length - 1);
        T oneValueForChange = array[oneIndexArrays];
        T twoValueForChange = array[twoIndexArrays];
        array[oneIndexArrays] = twoValueForChange;
        array[twoIndexArrays] = oneValueForChange;
        String arraysString2 = Arrays.toString(array);
        return arraysString2;
    }

    public static void main(String[] args) {
        TaskOneArrays<Integer> integerArrays = new TaskOneArrays<>(1, 5, 412, 7, 28);
        System.out.println(integerArrays.changePlases());
        TaskOneArrays<String> stringArrays = new TaskOneArrays<>("Привет", "Как дела?", "Как погода?", "Что нового?");
        System.out.println(stringArrays.changePlases());
    }
}
