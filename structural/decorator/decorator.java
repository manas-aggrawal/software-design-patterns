interface ObservabilityDecorator extends Controllers{
    
}

class LogDecorator implements ObservabilityDecorator{
    Controllers cc;
    LogDecorator(Controllers cc){
        this.cc = cc;
    }
    
    public int additionOp(){
        
        try{
            System.out.println("starts");
            int result = this.cc.additionOp();
            return result;
        }catch(Exception e){
            System.err.println("error: "+e);
            // throw e;
        }finally{
            System.out.println("ends");
        }
        return -1;
    }
    
}

interface Controllers {
     public int additionOp();
}

class ChildControllers implements Controllers{

public int additionOp(){
    throw new RuntimeException("haha!");
    // return 1+2;
}
}

class Main {
    public static void main(String[] args) {
        ObservabilityDecorator ob = new LogDecorator(new ChildControllers());
         ob.additionOp();
        
    }
}