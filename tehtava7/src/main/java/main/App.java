package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        boolean exit = false;

        while(!exit){
            System.out.println("1) Lisää kirja");
            System.out.println("2) Listaa kirjat");
            System.out.println("3) Lainaa fiktiokirja");
            System.out.println("4) Palauta fiktiokirja");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()){
                int i = 0;
                String stirngInput = sc.nextLine();
                i = Integer.parseInt(stirngInput);

                switch(i) {
                    case 1:
                        System.out.println("Minkä kirjan haluat lisätä kirjastoon? 1) Fiktiokirja, 2) Tietokirja");
                        int j = Integer.parseInt(sc.nextLine());
                        System.out.println("Anna kirjan nimi:");
                        String titel = sc.nextLine();
                        System.out.println("Anna kirjailijan nimi:");
                        String author = sc.nextLine();
                        System.out.println("Anna sivumäärä:");
                        int pages = Integer.parseInt(sc.nextLine());
                        System.out.println("Anna kirjojen määrä:");
                        int copies = Integer.parseInt(sc.nextLine());
                        if(j == 1){
                            FictionBook fictionbook = new FictionBook(titel, author, pages, copies, 0);
                            library.addBook(fictionbook);
                        }
                        else if(j == 2){
                            NonFictionBook nonfictionbook = new NonFictionBook(titel, author, pages, copies, 0);
                            library.addBook(nonfictionbook);
                        }
                        else{
                            System.out.println("Virheellinen kirjatyyppi.");
                        }
                        break;
                    case 2:
                        library.listBooks();
                        break;
                    case 3:
                        System.out.println("Anna lainattavan kirjan nimi:");
                        String bookname = sc.nextLine();
                        ArrayList<Book> books = library.getBooks();
                        for(Book k : books){
                            if(k instanceof FictionBook && k.title.equals(bookname)){
                                ((Borrowable)k).borrow(bookname);
                            }

                            else{
                                System.out.println("Höh");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Anna palautettavan kirjan nimi:");
                        String returnbookname = sc.nextLine();
                        ArrayList<Book> returnbook = library.getBooks();
                        for(Book l : returnbook){
                            if(l instanceof FictionBook && l.title.equals(returnbookname)){
                                ((Borrowable)l).returnBook(returnbookname);
                                }
                            }
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Väärä syöte.");
                }
            }
        }
        sc.close();
        System.out.println("Kiitos ohjelman käytöstä.");    
    }
}
