interface IDevice{
    public void setVolume(int v);
    public int getVolume();
    public void setChannel(int c);
    public int getChannel();
}

class Tv implements IDevice{
    private int volume = 0;
    private int channel = 0;
    public void setVolume(int v){
        this.volume = v;
    }
    public void setChannel(int c){
        this.channel = c;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public int getChannel(){
        return this.channel;
    }
}

class Radio implements IDevice{
    private int volume = 10;
    private int channel = 10;
    public void setVolume(int v){
        this.volume = v;
    }
    public void setChannel(int c){
        this.channel = c;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public int getChannel(){
        return this.channel;
    }
}

class Remote{
    protected IDevice device;
    public Remote(IDevice d){
        this.device = d;
    }
    public void increaseVolume(){
        device.setVolume(device.getVolume()+10);
    }
    public void decreaseVolume(){
        device.setVolume(device.getVolume()-10);
    }
    public void increaseChannel(){
        device.setChannel(device.getChannel()+1);
    }
    public void decreaseChannel(){
        device.setChannel(device.getChannel()-1);
    }
    
    public void displayVolume(){
        System.out.println(device.getVolume());
    }
}

class ExtendedRemote extends Remote {
    public ExtendedRemote(IDevice d){
        super(d);
    }
    public void mute(){
        device.setVolume(0);
    }
}

class Main {
    public static void main(String[] args) {
       IDevice tv = new Tv();
       Remote r = new Remote(tv);
       
       System.out.print("TV volume before: ");
       r.displayVolume();
       
       r.increaseVolume();
       
       System.out.print("TV volume after: ");
       r.displayVolume();
       
       IDevice radio = new Radio();
       ExtendedRemote r2 = new ExtendedRemote(radio);
       
       System.out.print("Radio Volume before: ");
       r2.displayVolume();
       
       r2.mute();
       
       System.out.print("Radio Volume after: ");
       r2.displayVolume();
    }
}