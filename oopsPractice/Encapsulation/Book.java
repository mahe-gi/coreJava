package Encapsulation;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void  setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    public int getYearPublished(){
        return this.yearPublished;
    }

    public void updateAuthor(String author){
        this.author = author;
    }

    public String getSummary(){
        return this.title + " by "+ this.author + " year :" + yearPublished;
    }
}



class BookMain{

    public static void main(String[] args){
        Book b1  = new Book();
    }
}