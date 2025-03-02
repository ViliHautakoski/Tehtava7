package main;

public class NonFictionBook extends Book {
    
    public NonFictionBook(String title, String author,int pages,int copies){
        super(title, author, pages, copies);
        this.borrowed = 0;
        
    }
    public String categorize(){
        return "Tietokirja";
    }
}
