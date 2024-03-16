// package Quiz 1;
//question 5
class Author{
    private String name;
    public Author(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Book{
    private String title;
    private Author author;
    public Book(String title, Author author){
        this.title = title;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthorName(){
        return author.getName();
    }
}

public class bookDetails {
    public static void main(String[] args) {
        Author author = new Author("ABCD");
        Book book = new Book("Java Programming", author);
        
        System.out.println("Book Title : " + book.getTitle());
        System.out.println("Author Name : " + book.getAuthorName());
    }
}
