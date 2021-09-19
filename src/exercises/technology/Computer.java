package exercises.technology;

public class Computer extends Electronic{
    private String name;
    private int memory;
    private int processorSpeed;

    public Computer(String name, int memory, int processorSpeed) {
        super();
        this.name = name;
        this.memory = memory;
        this.processorSpeed = processorSpeed;
    }

    public void stats(){
        System.out.println("Speed: " + this.processorSpeed + "\nMemory: " + this.memory);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(int processorSpeed) {
        this.processorSpeed = processorSpeed;
    }
}
