package com.management.entity;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 6, nullable = false)
    private Long id;

    @Column(name = "client", nullable = false)
    private String client;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "comment", nullable = false)
    private String comment;

    public Order() {
    }

    public Order(String client, String address, String comment) {
        this.client = client;
        this.address = address;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                        ", client = " + client +
                        ", address = " + address +
                        ", comment = " + comment;
    }
}
