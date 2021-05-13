package HomeWork1;

public class Wall extends Obstacles {
    private int height;

    public int getHeight() {
        return height;
    }

    public Wall(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.printf("Значение должно быть больше 0");
        }


    }
}

