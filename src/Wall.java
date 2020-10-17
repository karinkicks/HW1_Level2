public class Wall {
    private int height;

    public Wall(int height){
        this.height = height;
    }

    public void appeared_wall(Object someone){
        if(someone instanceof Human){
            ((Human)someone).jump();
            System.out.print("через стену");
            if (((Human)someone).getLimit()<this.height){
                ((Human)someone).setSuccess(false);
                System.out.print(" и не смог этого сделать");
            }
        }
        else if(someone instanceof Cat){
            ((Cat)someone).jump();
            System.out.print("через стену");
            if (((Cat)someone).getLimit()<this.height){
                ((Cat)someone).setSuccess(false);
                System.out.print(" и не смог этого сделать");
            }
        }
        else if(someone instanceof Robot){
            ((Robot)someone).jump();
            System.out.print("через стену");
            if (((Robot)someone).getLimit()<this.height){
                ((Robot)someone).setSuccess(false);
                System.out.print(" и не смог этого сделать");
            }
        }
        System.out.println();
    }
}
