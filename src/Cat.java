public class Cat implements Character {
    private String name;
    private int limit;
    private boolean success;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getLimit() {
        return limit;
    }
    @Override
    public boolean isSuccess() {
        return success;
    }
    @Override
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Cat(String name, int limit){
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
