interface ICommand {
    public void execute();
    public void undo();
}
class IncreaseBrightnessCmd implements ICommand{
    Image i;
    private int prevBrightness;
    
    public IncreaseBrightnessCmd(Image i){
        this.i = i;
    }
    public void execute(){
        prevBrightness = i.getBrightness();
        System.out.println("I will command to increase the brightness");
        this.i.increaseBrightness();
    }
    
    public void undo(){
        System.out.println("I will command to undo increased brightness");
        this.i.setBrightness(prevBrightness);
    }
    
}

class DecreaseBrightnessCmd implements ICommand{
    Image i;
    private int prevBrightness;
    public DecreaseBrightnessCmd(Image i){
        this.i = i;
    }
    public void execute(){
        prevBrightness = i.getBrightness();
        System.out.println("I will command to decrease the brightness");
        this.i.decreaseBrightness();
    }
    
    public void undo(){
        System.out.println("I will command to undo decreased brightness");
        this.i.setBrightness(prevBrightness);
    }
}

class Image {
    private int brightness = 50;
    public void increaseBrightness(){
        brightness+=10;
        System.out.println("Brightness increased");
    }
    public void decreaseBrightness(){
        brightness-=10;
        System.out.println("Brightness decreased");
    }
    
    public int getBrightness(){
        return this.brightness;
    }
    
    public void setBrightness(int prevBrightness){
        this.brightness = prevBrightness;
    }
}
class CommandPanel {
    
    private java.util.Stack<ICommand>cmdHistory;
    public CommandPanel(){
        this.cmdHistory = new java.util.Stack<>();
    }
    public void executeCmd(ICommand cmd){
        cmd.execute();
        cmdHistory.push(cmd);
    }
    
    public void undoCmd(){
        if(!cmdHistory.empty()){
            ICommand cmd = cmdHistory.pop();
            cmd.undo();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Image i = new Image();
        
        CommandPanel cmd = new CommandPanel();
        
        cmd.executeCmd(new IncreaseBrightnessCmd(i));
        System.out.println(i.getBrightness());
        
        cmd.executeCmd(new DecreaseBrightnessCmd(i));
        System.out.println(i.getBrightness());
        
        cmd.undoCmd();
        System.out.println(i.getBrightness());
    }
}
