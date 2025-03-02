package main;

public class NonFictionBook extends Book {
    
    public NonFictionBook(String title, String author,int pages,int copies, int borrowed){
        super(title, author, pages, copies, borrowed);
        
    }
    public String categorize(){
        return "Tietokirja";
    }
}
