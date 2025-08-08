// Online Java Compiler
// Use this editor to write, compile and run your Java code online

interface IBarkBehavior{
    void bark();
}
class NormalBarkBehavior implements IBarkBehavior{
    public void bark(){
        System.out.println("I'm Normal barking");
    }
}
class LoudBarkBehavior implements IBarkBehavior{
    public void bark(){
        System.out.println("I'm Loud barking");
    }
}

class MotorBarkBehavior implements IBarkBehavior{
    public void bark(){
        System.out.println("I'm Motor barking");
    }
}

abstract class Dog {
    protected IBarkBehavior bb;
    Dog(IBarkBehavior bb){
        this.bb = bb;
    }
    public void bark(){
        bb.bark();
    }
    public void changeBark(IBarkBehavior bb){
        this.bb = bb;
    }
}

class Husky extends Dog {
    Husky(){
        super(new LoudBarkBehavior());
    }
}
class Labrador extends Dog {
    Labrador(){
        super(new NormalBarkBehavior());
    }
}

class Main {
    public static void main(String[] args) {
        
        Dog husky = new Husky();
        husky.bark();
        Dog labra = new Labrador();
        labra.bark();
        labra.changeBark(new MotorBarkBehavior());
        labra.bark();
    }
}

