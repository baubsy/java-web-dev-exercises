package exercises.technology;

public class Program {
    public static void main(String[] args){
        Computer myComputer = new Computer("bobby", 100, 100);
        Laptop myLaptop = new Laptop("bobtop", 100, 100, 20);
        SmartPhone myPhone = new SmartPhone("Bobby's Phone", 80, 80, "Android");
        myComputer.stats();
        myLaptop.stats();
        myPhone.stats();
        myPhone.getId();
    }
}
