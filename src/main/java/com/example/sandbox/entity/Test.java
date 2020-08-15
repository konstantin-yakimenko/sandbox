package com.example.sandbox.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "tests")
@IdClass(TestId.class)
public class Test {
    @Id
    @Column(name = "key1_id")
    private Integer key1Id;
    @Id
    @Column(name = "key2_id")
    private Integer key2Id;
    @Column
    private String value;

    public Integer getKey1Id() {
        return key1Id;
    }

    public void setKey1Id(Integer key1Id) {
        this.key1Id = key1Id;
    }

    public Integer getKey2Id() {
        return key2Id;
    }

    public void setKey2Id(Integer key2Id) {
        this.key2Id = key2Id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Test{" +
                "key1Id=" + key1Id +
                ", key2Id=" + key2Id +
                ", value='" + value + '\'' +
                '}';
    }
}
