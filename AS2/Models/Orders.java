package Models;

import Models.Customers;

import java.time.LocalDate;

public class Orders {

    private int orderId;
    private int customerId;
    private Customers customer;
    private LocalDate orderDate;
    private int bookId;
    private int quantity;

    public Orders(int orderId, int customerId, LocalDate orderDate, int bookId, int quantity) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderId: " + orderId +
                ", CustomerId: " + customerId +
                ", OrderDate: " + orderDate +
                ", BookId: " + bookId +
                ", Quantity: " + quantity;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
