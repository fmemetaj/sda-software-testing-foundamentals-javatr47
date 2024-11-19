package org.fmemetaj.tasks.task6;

public class Basket {

    private Book[] books;
    private int count;

    public Basket() {
        this.books = new Book[10];
        this.count = 0;
    }

    public Book[] getBooks() {
        Book[] result = new Book[count];
        for (int i = 0; i < count; i++) {
            result[i] = books[i];
        }
        return result;
    }

    public boolean addBook(Book book) {
        if (count >= books.length) {
            return false;
        }
        books[count++] = book;
        return true;
    }

    public void clearBasket() {
        for (int i = 0; i < count; i++) {
            books[i] = null;
        }
        count = 0;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += books[i].getPrice();
        }
        return total;
    }
}
