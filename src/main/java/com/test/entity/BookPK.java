package com.test.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class BookPK implements Serializable {
    private String name;
    private String topic;
}
