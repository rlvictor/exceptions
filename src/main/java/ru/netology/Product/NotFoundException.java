package ru.netology.Product;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Товара с id " + id + " не существует");
    }
}
