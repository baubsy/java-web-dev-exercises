package exercises.technology;

public class SmartPhone extends Computer{
    private String os;
    SmartPhone(String name, int memory, int speed, String os){
        super(name, memory, speed);
        this.os = os;
    }
    @Override
    public void stats(){
        super.stats();
        System.out.println("OS: " + this.os);
    }
}
