public class Treadmill {
    private int length;

    public Treadmill(int length){
        this.length=length;
    }

    public void appeared_treadmill(Object someone){
        if(someone instanceof Human){
            ((Human)someone).run();
            System.out.print("по беговой дорожке");
            if (((Human)someone).getLimit()<this.length){
                ((Human)someone).setSuccess(false);
                System.out.print(" и не смог этого сделать");
            }
        }
        else if(someone instanceof Cat){
            ((Cat)someone).run();
            System.out.print("по беговой дорожке");
            if (((Cat)someone).getLimit()<this.length){
                ((Cat)someone).setSuccess(false);
                System.out.print(" и не смог этого сделать");
            }
        }
        else if(someone instanceof Robot){
            ((Robot)someone).run();
            System.out.print("по беговой дорожке");
            if (((Robot)someone).getLimit()<this.length){
                ((Robot)someone).setSuccess(false);
                System.out.print(" и не смог этого сделать");
            }
        }
        System.out.println();
    }
}
