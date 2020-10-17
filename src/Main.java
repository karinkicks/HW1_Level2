public class Main {

    public static void main(String[] args) {
        Object participants[] = new Object [] {new Human("Петя", 10),
                                            new Human("Слава",20),
                                            new Cat("Барсик", 30),
                                            new Cat("Пушок", 40),
                                            new Robot("Электроник", 50),
                                            new Robot("Чаппи", 60)};
        Object obstacles[] = new Object[]{new Treadmill(35), new Wall(45), new Wall( 55)};

        for (Object participant: participants) {
            for (Object obstacle: obstacles) {
                if(obstacle instanceof Treadmill){
                    ((Treadmill) obstacle).appeared_treadmill(participant);
                }
                else if(obstacle instanceof Wall){
                    ((Wall) obstacle).appeared_wall(participant);
                }
                if(participant instanceof Human){
                    if(((Human) participant).isSuccess()==false){
                        System.out.println(((Human) participant).getName() + " участник выбывает");
                        break;
                    };
                }
                else if(participant instanceof Cat){
                    if(((Cat) participant).isSuccess()==false){
                        System.out.println(((Cat) participant).getName() +" участник выбывает");
                        break;
                    };
                }
                else if(participant instanceof Robot){
                    if(((Robot) participant).isSuccess()==false){
                        System.out.println(((Robot) participant).getName() +" участник выбывает");
                        break;
                    };
                }
            }
        }

    }
}
