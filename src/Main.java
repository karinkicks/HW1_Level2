public class Main {

    public static void main(String[] args) {
        Character participants[] = {new Human("Петя", 10),
                                            new Human("Слава",20),
                                            new Cat("Барсик", 30),
                                            new Cat("Пушок", 40),
                                            new Robot("Электроник", 50),
                                            new Robot("Чаппи", 60)};
        Obstacle obstacles[] = {new Treadmill(35), new Wall(45), new Wall( 55)};

        for (Character participant: participants) {
            for (Obstacle obstacle: obstacles) {
                    obstacle.appeared_obstacle(participant);
                    if((participant).isSuccess()==false){
                        System.out.println((participant).getName() + " участник выбывает");
                        break;
                    };
            }
        }

    }
}
