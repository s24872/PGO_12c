package pl.s24872.models;

import pl.s24872.enums.Genre;
import pl.s24872.enums.Lang;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {
    private static Set<Book> books = new HashSet<>();
    private static int index = 0;

    private List<Person> authors = new ArrayList<>();
    private long id;
    private String name;
    private Genre genre;
    private Lang lang;
    private LocalDate publishDate;
    private int borrowCount;
    private Person borrowedBy;

    public Book(){
        this.id = ++index;
        books.add(this);
    }

    public void borrowBook(Person person){
        if(borrowedBy != null){
            throw new RuntimeException("Nie można wypożczyć książki, ponieważ jest już wypożyczona przez inną osobę.");
        }
        borrowCount++;
        borrowedBy = person;
        person.getBorrowedBooks().add(this);
    }

    public void placeBack(){
        borrowedBy.getBorrowedBooks().remove(this);
        borrowedBy = null;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getAge() {
        if(publishDate == null){
            throw new RuntimeException("Data wydania nie została uzupełniona");
        }
        return LocalDate.now().getYear() - publishDate.getYear();
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public boolean isAvailable() {
        return borrowedBy == null;
    }

    public List<Person> getAuthors() {
        return authors;
    }

    public Person getBorrowedBy() {
        return borrowedBy;
    }
}
