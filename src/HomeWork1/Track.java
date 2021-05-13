package HomeWork1;

public class Track extends Obstacles{
    private int length;

    public int getLength() {
        return length;
    }

    public Track (int length){
        if(length > 0) {
            this.length = length;
        }else {
            System.out.printf("Значение должно быть больше 0");
        }

    }
}

