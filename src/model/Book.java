package model;

public class Book {
    private int id;
    private String name;
    private String description;
    private String author;



    public  Book(int id, String name, String description, String author) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
    }


    public Book(){

    }
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public  String getInfo(){
        return  "____________________________________\n"+
                id + "Student\n" +
                "name" + name + "\n" +
                "description" + description + "\n" +
                "author" + author + "\n" +
                "____________________________________\n";

    }


}
