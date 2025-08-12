class Log{
    static private Log instance;
    private Log(){}
    public static Log getLogInstance(){
        if(instance==null){
            instance = new Log();
        }
        return instance;
    }
    
    public void someUsefulMethod(){
        System.out.println("Hello");
    }
}

class Main {
    public static void main(String[] args) {
        Log log = Log.getLogInstance();
        log.someUsefulMethod();
    }
}