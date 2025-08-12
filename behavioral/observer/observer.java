// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashSet;
import java.util.Set;
interface IPublisher {
    void add(ISubscriber sub);
    void remove(ISubscriber sub);
    void notifySubscribers();
}

interface ITempMeter {
    void setTemperature(Double temp);
    Double getTemperature();
}

class TempMeter implements IPublisher, ITempMeter {
    private Set<ISubscriber> subscribers = new HashSet<>();
    private Double temp = 0.0;
    public void add(ISubscriber sub){
        subscribers.add(sub);
    }
    public void remove(ISubscriber sub){
        subscribers.remove(sub);
    }
    public void notifySubscribers(){
        for (ISubscriber sub : subscribers){
            sub.update();
        }
    }
    public void setTemperature(Double temp){
        this.temp = temp;
        notifySubscribers();
    }
    public Double getTemperature(){
        return this.temp;
    }
}

interface ISubscriber {
    void update();
}
interface IDisplay{
    void displayReading();
}

class Phone implements ISubscriber, IDisplay{
    TempMeter pub;
    Phone(TempMeter pub){
        this.pub = pub;
    }
    public void update(){
        System.out.println("New readings available");
    }
    public void displayReading(){
        System.out.println(this.pub.getTemperature());
    }
}
class Tablet implements ISubscriber, IDisplay{
    TempMeter pub;
    Tablet(TempMeter pub){
        this.pub = pub;
    }
    public void update(){
        System.out.println("New readings available");
    }
    public void displayReading(){
        System.out.println(this.pub.getTemperature());
    }
}
class SmartWatch implements ISubscriber, IDisplay{
    TempMeter pub;
    
    SmartWatch(TempMeter pub){
        this.pub = pub;
    }
    public void update(){
        System.out.println("New readings available");
    }
    public void displayReading(){
        System.out.println(this.pub.getTemperature());
    }
}
class Main {
    public static void main(String[] args) {
        TempMeter tempMeter = new TempMeter();
        
        Phone phone = new Phone(tempMeter);
        tempMeter.add(phone);
        
        Tablet tablet = new Tablet(tempMeter);
        tempMeter.add(tablet);
        
        SmartWatch smartWatch = new SmartWatch(tempMeter);
        tempMeter.add(smartWatch);
        
        tempMeter.setTemperature(27.7);
        phone.displayReading();
        
        
    }
}