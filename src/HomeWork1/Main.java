package HomeWork1;

public class Main {
    public static void main(String[] args) {


        Obstacles[] arraysObstacles = {
                new Track(100 + (int) (Math.random() * 10000)),
                new Track(100 + (int) (Math.random() * 10000)),
                new Track(100 + (int) (Math.random() * 10000)),
                new Wall(1 + (int) (Math.random() * 4)),
                new Wall(1 + (int) (Math.random() * 4)),
                new Wall(1 + (int) (Math.random() * 4))
        };

        ParticipantsCanSwimAndCanRun[] arraysParticipants = {
                new Cat("Кот1"),
                new Human("Человек1"),
                new Robot("Робот1"),
                new Human("Человек2"),
                new Robot("Робот2")
        };

        for (Obstacles obstacle: arraysObstacles){
            for (ParticipantsCanSwimAndCanRun participantCanSwimAndCanRun: arraysParticipants){
                if(obstacle instanceof Track){
                    boolean chekdrop = participantCanSwimAndCanRun.toRun(((Track) obstacle).getLength());
                    if (chekdrop == false){
                        System.out.println(participantCanSwimAndCanRun.getName() + " выбыл");
                        continue;
                    }
                }else if(obstacle instanceof Wall){
                    boolean chekdrop = participantCanSwimAndCanRun.toJump(((Wall) obstacle).getHeight());
                    if (chekdrop == false){
                        System.out.println(participantCanSwimAndCanRun.getName() + " выбыл");
                        continue;
                    }
                }else{
                    System.out.println("Что то пошло не так");
                }

            }
        }
    }



}

