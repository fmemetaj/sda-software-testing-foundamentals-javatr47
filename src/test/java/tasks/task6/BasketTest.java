package tasks.task6;

import org.fmemetaj.tasks.task6.Basket;
import org.fmemetaj.tasks.task6.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    void testAddBook() {
        // Given
        Basket basket = new Basket();
        Book book = new Book("Title1", "Author1", 10.99);

        // When
        basket.addBook(book);
        Book[] books = basket.getBooks();

        // Then
        Assertions.assertTrue(basket.addBook(book));
        Assertions.assertEquals(1, books.length);
        Assertions.assertEquals("Title1", books[0].getTitle());
    }

    @Test
    void testAddBookWhenFull() {
        // Given
        Basket basket = new Basket();

        // When
        for (int i = 0; i < 10; i++) {
            basket.addBook(new Book("Book" + i, "Author" + i, i + 1.0));
        }

        // Then
        Assertions.assertFalse(basket.addBook(new Book("ExtraBook", "AuthorExtra", 11.0)));
    }

    @Test
    void testClearBasket() {
        // Given
        Basket basket = new Basket();

        // When
        basket.addBook(new Book("Title1", "Author1", 10.99));
        basket.clearBasket();
        Book[] books = basket.getBooks();

        // Then
        Assertions.assertEquals(0, books.length);
    }

    @Test
    void testCalculateTotalPrice() {
        // Given
        Basket basket = new Basket();

        // When
        basket.addBook(new Book("Title1", "Author1", 10.99));
        basket.addBook(new Book("Title2", "Author2", 20.50));

        double totalPrice = basket.calculateTotalPrice();

        // Then
        Assertions.assertEquals(31.49, totalPrice, 0.01);
    }

    @Test
    void testGetBooks() {
        // Given
        Basket basket = new Basket();

        // When
        basket.addBook(new Book("Title1", "Author1", 10.99));
        Book[] books = basket.getBooks();

        // Then
        Assertions.assertEquals(1, books.length);
        Assertions.assertEquals("Title1", books[0].getTitle());
    }
}
