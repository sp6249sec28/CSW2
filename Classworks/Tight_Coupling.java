class Topic {
    public String title;
    public int duration;
    public Topic(String title, int duration){
        this.title = title;
        this.duration = duration;
    }
    public void understood(){
        System.out.println("Tight Coupling implemented");
    }
}
class Subject{
    public String name;
    public int subDuration;
    public Topic T1, T2;
    public Subject(String name){
        this.name = name;
        this.T1 = new Topic ("OOPS", 7);
        this.T2 = new Topic ("Java", 4);
        this.subDuration = this.T1.duration + this.T2.duration;
    }
    public void startReading(){
        T1.understood();
    }

}
public class Tight_Coupling {
    public static void main(String[] args) {
        Subject S1 = new Subject("Java");
        S1.startReading();
    }
}
