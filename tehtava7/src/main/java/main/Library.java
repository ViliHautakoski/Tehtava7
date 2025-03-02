package main;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> booklist = new ArrayList<>();

    public void addBook(Book book){
        booklist.add(book);
    }

    public ArrayList<Book> getBooks(){
        return booklist;
    }

    public void listBooks(){
        int i = 0;
        if(booklist.size()>0){
            for(Book book : booklist){
                book.displayInfo();
                if(book instanceof FictionBook){
                    FictionBook fictionbook = (FictionBook) book;
                    System.out.println("Kirjan kategoria: "+fictionbook.categorize());
                }
                else{
                    NonFictionBook nonfictionbook = (NonFictionBook) book;
                    System.out.println("Kirjan kategoria: "+nonfictionbook.categorize());
                }
            i+=book.copies; 
        }   
            System.out.println("Kirjojen määrä kirjastossa on: "+i);
        }
        else{
            System.out.println("Kirjasto on tyhjä");
        }
    }
}
