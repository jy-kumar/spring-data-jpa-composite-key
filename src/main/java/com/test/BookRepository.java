package com.test;

import com.test.entity.Book;
import com.test.entity.BookPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, BookPK> {
    public List<Book> findByBookPKName(String name);
    public List<Book> findByAuthor(String author);
    public Book findByBookPKNameAndBookPKTopic(String name, String topic);
    public List<Book> findByBookPKNameAndAuthor(String name, String author);
    public List<Book> findByAuthorAndPrice(String author, Double price);
    public List<Book> findByAuthorAndPriceBetween(String author, Double priceFrom, Double priceTo);
    public List<Book> findByBookPKTopic(String topic);
    public List<Book> findByBookPKTopicAndPrice(String topic, Double price);
    public List<Book> findByBookPKTopicAndPriceBetween(String topic, Double priceFrom, Double priceTo);
}
