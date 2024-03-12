interface Topic{
    public boolean understood();
    public int getDuration();
}
class Topic1 implements Topic{
    public String title;
    public int duration;
    
    public Topic1(String title, int duration){
        this.title = title;
        this.duration =  duration;
    }
    public boolean understood() { 
        return true; 
    }
    public int getDuration(){
        return this.duration;
    }
}
class Topic2 implements Topic{
    public String title;
    public int duration;
    public Topic2(String title, int duration){
        this.title = title;
        this.duration = duration;
    }
    public boolean understood() { 
        return false; 
    }
    public int getDuration(){
        return this.duration;
    }
}
class Subject{
    public String subName;
    public int subDuration;
    public Topic T1,T2;
    public Subject(String subName){
        this.subName = subName;
        this.T1 = new Topic1("OOPs", 5);
        this.T2 = new Topic2("Control Flow", 3);
        this.subDuration = this.T1.getDuration() + this.T2.getDuration();
    }
    public boolean startReading(){
        return T1.understood();
    }
}
    
public class Feb22_Coupling {
    public static void main(String[] args){
        Subject s1 = new Subject("Java");
        s1.startReading();
    }
}
