package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testEquals_whenDifferent_false() {
        // GIVEN
        Book book1 = new Book("Java for Dummies", "Gosling");
        Book book2 = new Book("Python für Beginner", "Hemingway");

        // WHEN
        boolean actual = book1.equals(book2);

        // THEN
        assertEquals(actual, false);
    }

    @Test
    void testEquals() {
        // GIVEN
        Book book1 = new Book("Java for Dummies", "Gosling");
        Book book2 = new Book("Java for Dummies", "Gosling");

        // WHEN
        boolean actual = book1.equals(book2);

        // THEN
        assertEquals(actual, true);
    }
}