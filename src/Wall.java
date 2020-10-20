public class Wall implements Obstacle {
    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void appeared_obstacle(Character someone){

            someone.jump();
            System.out.print("через стену");
            if (someone.getLimit()<this.height){
                someone.setSuccess(false);
                System.out.print(" и не смог этого сделать");
            }

        System.out.println();
    }
}
