package HomeWork3;

public class Box<T extends Fruit> {
    private T fruit;
    private float weight;

    public Box(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }

    public float getWeight(Box<T> boxWithFruit) {
        weight = boxWithFruit.fruit.getWeight() * boxWithFruit.fruit.getQuantity();
        System.out.println("Вес коробки составлет: " + weight);
        return weight;
    }

    public void transfer(Box oneBoxWithFruit, Box twoBoxWithFruit) {
        if (oneBoxWithFruit.fruit.getNameFruit() == twoBoxWithFruit.fruit.getNameFruit()) {
            twoBoxWithFruit.fruit.setQuantity(twoBoxWithFruit.fruit.getQuantity() + oneBoxWithFruit.fruit.getQuantity());
            oneBoxWithFruit.fruit.setQuantity(0);
        } else {
            System.out.println("В коробке должны быть фрукты одного вида");
        }
    }

    /*public boolean compare(Box boxOne, Box boxTwo) {
        if (boxOne.getWeight(boxOne) == boxTwo.getWeight(boxTwo)) {
            return true;
        } else {
            return false;
        }
    }*/

    //Не совсем понял суть задачи со сравнением весов, сделал 2 вариента
    public boolean compare(Box boxOne){
        if (weight == boxOne.fruit.getWeight()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Box<Apple> boxWithApple = new Box<>(new Apple());
        boxWithApple.fruit.setQuantity(5);
        boxWithApple.getWeight(boxWithApple);//подсчет веса коробки
        Box<Orange> boxWithOrange = new Box<>(new Orange());
        boxWithOrange.fruit.setQuantity(6);
        boxWithOrange.getWeight(boxWithOrange);//подсчет веса коробки
        boxWithApple.compare(boxWithOrange);//сравнение коробок
        Box<Apple> secondBoxWithApple = new Box<>(new Apple());
        boxWithApple.transfer(boxWithApple,secondBoxWithApple);//Из одной коробки в другую
    }
}
