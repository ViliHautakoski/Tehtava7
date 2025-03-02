package main;

public abstract class Book {
    String title;
    String author;
    int pages;
    int copies;
    int borrowed;

    public Book(String title, String author,int pages,int copies){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
    }

    public void displayInfo(){
        System.out.println("Nimi: "+title+", Kirjailija: "+author+", Sivut: "+pages+", Määrä: "+copies);
    }

    public abstract String categorize();
    
}
