interface IBookParser{
    public int getNumOfWords();
}

class BookParser implements IBookParser{
    private String[] book;
    BookParser(String book){
        this.book = book.split(" ");
    }
    public int getNumOfWords(){
        return this.book.length;
    }
}

class BookParserProxy implements IBookParser{
    private IBookParser proxy = null;
    private String book;
    BookParserProxy(String book){
        this.book = book;
    }
    public int getNumOfWords(){
        if(this.proxy==null) this.proxy = new BookParser(book);
        return this.proxy.getNumOfWords();
    }
    
}

class Main {
    public static void main(String[] args) {
        IBookParser proxy = new BookParserProxy("Hello! My name is Manas");
        System.out.println(proxy.getNumOfWords());
    }
}