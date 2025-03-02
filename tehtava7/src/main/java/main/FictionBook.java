package main;

public class FictionBook extends Book implements Borrowable {
    
    public FictionBook(String title, String author,int pages,int copies,int borrowed){
        super(title, author, pages, copies, borrowed);
        
    }

    public String categorize(){
        return "Fiktiokirja";
    }


    public void borrow(String bookname){
        if(copies>0){
            System.out.println("Kirja "+bookname+" on nyt lainattu.");
            copies -= 1;
            borrowed += 1;
        }
        
        else{    
            System.out.println("Kirjaa "+bookname+" ei enään ole lainattavissa!");
        } 
  }

    public void returnBook(String bookname){
        if(borrowed>0){
            System.out.println("Kirja "+bookname+" on palautettu.");
            copies +=1;
            borrowed -= 1;
        }
        else{
            System.out.println("Kirja "+bookname+" ei ole lainassa.");
        }
        
    }

}
