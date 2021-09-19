package exercises.technology;

public abstract class Electronic {
    private int id;
    private static int nextId = 1;
    Electronic(){
        this.id = nextId;
        nextId++;
    }
    public void getId(){
        System.out.println(id);
    }
}
