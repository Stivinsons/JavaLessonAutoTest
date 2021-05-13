package HomeWork1;

public class Human implements ParticipantsCanSwimAndCanRun{

    private String name;

    public Human(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean toRun(int length){
        //Человек может пробежать 3000
        if (length <= 3000){
            String running = "Человек пробежал " + length;
            System.out.println(running);
            return true;
        }else{
            String notRunning = "Человек устал и не пробежал " + length;
            System.out.println(notRunning);
            return false;
        }
    }

    public boolean toJump(int height) {
        //Человек может прыгнуть на 2
        if (height <= 2) {
            String jumping = "Человек перепрыгнул " + height;
            System.out.println(jumping);
            return true;
        } else {
            String notJumping = "Человек не может перепрыгнуть " + height;
            System.out.println(notJumping);
            return false;
        }
    }
}

