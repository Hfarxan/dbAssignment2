package Models;

import Models.Authors;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private int bookId;
    private String title;
    private Integer publicationYear;

    private Authors authors;
    private List<Orders> orders = new ArrayList<>();

    public Books(int bookId, String title, Integer publicationYear, Authors authors) {
        this.bookId = bookId;
        this.title = title;
        this.publicationYear = publicationYear;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "BookID: " + bookId +
                ", Title: " + title +
                ", PublicationYear: " + publicationYear +
                ", Author: " + authors +
                ", Models.Orders: " + orders;
    }


    public void addOrder(Orders order) {
        orders.add(order);
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Authors getAuthor() {
        return authors;
    }

    public void setAuthor(Authors authors) {
        this.authors = authors;
    }
}

