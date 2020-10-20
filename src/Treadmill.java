public class Treadmill implements Obstacle{
    private int length;

    public Treadmill(int length){
        this.length=length;
    }

    public void appeared_obstacle(Character someone){
            someone.run();
            System.out.print("по беговой дорожке");
            if (someone.getLimit()<this.length){
                someone.setSuccess(false);
                System.out.print(" и не смог этого сделать");
            }
        System.out.println();
    }
}
