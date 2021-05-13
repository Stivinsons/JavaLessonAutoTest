package HomeWork1;

public class Cat implements ParticipantsCanSwimAndCanRun{

    private String name;

    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean toRun(int length) {
        //Кот можеть пробежать 4000
        if (length < 4000) {
            String running = "Кот пробежл " + length;
            System.out.println(running);
            return true;
        } else {
           String notRunning = "Кот устал и не пробежал " + length;
           System.out.println(notRunning);
            return false;
        }
    }

        public boolean toJump(int height) {
            //Кот можеть прыгнуть на 3
            if (height <= 3) {
                String jumping = "Кот перепрыгнул " + height;
                System.out.println(jumping);
                return true;
            } else {
                String notJumping = "Кот не может перепрыгнуть " + height;
                System.out.println(notJumping);
                return false;
            }
        }
    }

