package exercises.technology;

public class Laptop extends Computer{
    private int screenSize;
    Laptop(String name, int memory, int processorSpeed, int screenSize){
        super(name, memory, processorSpeed);
        this.screenSize = screenSize;
    }
    @Override
    public void stats(){
        super.stats();
        System.out.println("Screen: " + this.screenSize);
    }
}
