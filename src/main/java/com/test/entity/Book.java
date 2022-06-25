package com.test.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Data
public class Book {
    @EmbeddedId
    private BookPK bookPK;
    private String author;
    private Double price;
}
