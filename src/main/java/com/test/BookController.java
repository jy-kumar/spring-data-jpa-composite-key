package com.test;

import com.test.entity.Book;
import com.test.entity.BookPK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService service;

    @PostMapping("/book")
    public Book save(@RequestBody Book book){
        return service.save(book);
    }

    @GetMapping("/book/name/{name}")
    public List<Book> getByName(String name){
        return service.getByName(name);
    }

    @GetMapping("/book/author/{author}")
    public List<Book> getByAuthor(String author){
        return service.getByAuthor(author);
    }
    @GetMapping("/book/topic/{topic}")
    public List<Book> getByTopic(String topic){
        return service.getByTopic(topic);
    }
    @GetMapping("/book/topic/{topic}/price/{price}")
    public List<Book> getByTopicAndPrice(String topic, Double price){
        return service.getByTopicAndPrice(topic,price);
    }
    @GetMapping("/book/topic/{topic}/price/{priceFrom}/{priceTo}")
    public List<Book> getByTopicAndPriceBetween(String topic, Double priceFrom, Double priceTo){
        return service.getByTopicAndPriceBetween(topic,priceFrom,priceTo);
    }

    @GetMapping("/book/name/{name}/topic/{topic}")
    public Book getByNameAndTopic(String name, String topic){
        return service.getByNameAndTopic(name, topic);
    }

    @GetMapping("/book/name/{name}/author/{author}")
    public List<Book> getByNameAndAuthor(String name, String author){
        return service.getByNameAndAuthor(name, author);
    }

    @GetMapping("/book/author/{author}/price/{price}")
    public List<Book> getByAuthorAndPrice(String author, Double price){
        return service.getByAuthorAndPrice(author, price);
    }

    @GetMapping("/book/author/{author}/price/{priceFrom}/{priceTo}")
    public List<Book> getByAuthorAndPriceBetween(String author, Double priceFrom, Double priceTo){
        return service.getByAuthorAndPriceBetween(author, priceFrom, priceTo);
    }
}
