package com.company;
class Library{
    public String [] books;
    public int no_of_books;
    Library (){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }
    void issueBook(String book){
        for (int i=0; i< this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("this book  does not exists!");
    }
    void returnBook(String book){
        addBook(book);
    }
    void showAvailableBook(){
        for (String book: this.books) {
            if(book == null){
                continue;
            }
            System.out.println("* " +book);
        }
    }
}
public class CWH_61_ex51sol {
    public static void main(String[] args) {
        // You have to implement a library using java class "library"
        // Method : addBook , issueBook , returnBook , showAvailableBook
        // Properties : Array to store the available book , issue book
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++/C");
        centralLibrary.showAvailableBook();
        centralLibrary.issueBook("C++/C");
        centralLibrary.showAvailableBook();
        centralLibrary.returnBook("C++/C");
    }
}
