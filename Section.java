package com.ensat.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Product entity.
 */
@Entity
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id=0;


    @OneToMany(mappedBy="section")
    private Set<Employee> employees;

    @OneToMany(mappedBy="section")
    private Set<Product> products;

    @OneToOne(mappedBy = "section")
    @PrimaryKeyJoinColumn
    private Section_Realtime_info real;

    @Version
    private Integer version;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
