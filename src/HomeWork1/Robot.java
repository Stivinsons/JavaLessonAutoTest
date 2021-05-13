package HomeWork1;

public class Robot implements ParticipantsCanSwimAndCanRun{

    private String name;

    public Robot(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean toRun(int length){
        //Робот на одном заряде может пробежать 1000
        if (length <= 1000){
            String running = "Робот пробежал " + length;
            System.out.println(running);
            return true;
        }else{
            String lowBattery = "У робота села батарейка, он не смог пробежать" + length;
            System.out.println(lowBattery);
            return false;
        }

    }

    public boolean toJump(int height) {
        //Робот не умеет прыгать
        if (height > 0) {
            String notJumping = "Робот не умеет прыгать";
            System.out.println(notJumping);
            return false;
        }else{
            return false;
        }
    }
}



