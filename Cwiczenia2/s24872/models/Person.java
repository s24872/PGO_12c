package pl.s24872.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Address address;

    private List<Book> authorOfBooks = new ArrayList<>();
    private List<Book> borrowedBooks = new ArrayList<>();

    public Person() {
    }

    public Book publishBook(){
        Book book = new Book();
        book.getAuthors().add(this);
        authorOfBooks.add(book);
        return book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Book> getAuthorOfBooks() {
        return authorOfBooks;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
