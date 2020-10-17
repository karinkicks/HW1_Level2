public class Human implements Action{
    private String name;
    private int limit;
    private boolean success;

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Human(String name, int limit){
        this.name = name;
        this.limit = limit;
        this.success = true;
    }

    @Override
    public void run() {
        System.out.print(name + " бежит ");
    }

    @Override
    public void jump() {
        System.out.print(name + " прыгает ");
    }
}
