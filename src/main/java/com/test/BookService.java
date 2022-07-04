package com.test;

import com.test.entity.Book;
import com.test.entity.BookPK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public Book save(Book book){
        return repository.save(book);
    }
    public List<Book> getByName(String name){
        return repository.findByBookPKName(name);
    }

    /*
        The method
            findByBookPKNameAndBookPKTopic and
            findById
        both are same as here composite key is the id only :)
     */
    public Book getByNameAndTopic(String name, String topic){
        //return repository.findByBookPKNameAndBookPKTopic(name, topic);
        BookPK bookpk = new BookPK();
        bookpk.setName(name);
        bookpk.setTopic(topic);
        return repository.findById(bookpk).get();

    }
    public Book getByNameAndTopic(BookPK bookPK){
        //return repository.findById(bookpk).get();
        return repository.findByBookPKNameAndBookPKTopic(bookPK.getName(), bookPK.getTopic());
    }
    public List<Book> getByNameAndAuthor(String name, String author){
        return repository.findByBookPKNameAndAuthor(name, author);
    }
    public List<Book> getByAuthorAndPrice(String author, Double price){
        return repository.findByAuthorAndPrice(author, price);
    }
    public List<Book> getByAuthorAndPriceBetween(String author, Double priceFrom, Double priceTo){
        return repository.findByAuthorAndPriceBetween(author, priceFrom, priceTo);
    }
    public List<Book> getByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    public List<Book> getByTopic(String topic) {
        return repository.findByBookPKTopic(topic);
    }

    public List<Book> getByTopicAndPrice(String topic, Double price) {
        return repository.findByBookPKTopicAndPrice(topic,price);
    }

    public List<Book> getByTopicAndPriceBetween(String topic, Double priceFrom, Double priceTo) {
        return repository.findByBookPKTopicAndPriceBetween(topic,priceFrom,priceTo);
    }

}
