package pl.s24872;

import pl.s24872.enums.Genre;
import pl.s24872.enums.Lang;
import pl.s24872.models.Address;
import pl.s24872.models.Book;
import pl.s24872.models.Person;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person author1 = new Person();
        author1.setName("Jan");
        author1.setSurname("Kowalski");
        author1.setDateOfBirth(LocalDate.now());

        Address addressOfPerson1 = new Address();
        addressOfPerson1.setCountry("Polska");
        addressOfPerson1.setCity("Warszawa");
        addressOfPerson1.setStreet("Koszykowa");
        addressOfPerson1.setHouse(1);
        addressOfPerson1.setFlat(2);

        author1.setAddress(addressOfPerson1);

        Book book = author1.publishBook();
        book.setName("Książka 1");
        book.setGenre(Genre.Comics);
        book.setPublishDate(LocalDate.now());
        book.setLang(Lang.Polish);

        Person author2 = new Person();
        author2.setName("Kamil");
        author2.setSurname("Jankowski");
        author2.setDateOfBirth(LocalDate.now());

        book.getAuthors().add(author2);

        Person person3 = new Person();
        person3.setName("Jan");
        person3.setSurname("Kowalski");
        person3.setDateOfBirth(LocalDate.now());

        book.borrowBook(person3);

        System.out.println("Książka "+book.getName()+" jest wypożyczona przez "+book.getBorrowedBy().getName()+" "+book.getBorrowedBy().getSurname());
        System.out.println("Książka "+book.getName()+" została wypożyczona "+book.getBorrowCount()+" razy");
    }
}
