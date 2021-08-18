package com.ensat.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Employee entity.
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@ManyToOne
    //@JoinColumn(name="section_id", nullable=false)
    @ManyToOne
    private Section section;

    @Version
    private Integer version;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
// cascade = CascadeType.ALL
    @ManyToMany(fetch = FetchType.EAGER )
    @JoinTable(
            name = "employees_roles",
            joinColumns =@JoinColumn(
                    name = "employee_id" ,referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id" ,referencedColumnName = "id"))
    private Collection<Role>roles;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Employee(String firstName, String lastName, String email, String password, Collection<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }


    public Integer getVersion() {
        return version;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getLastName() {
        return lastName;
    }


    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
