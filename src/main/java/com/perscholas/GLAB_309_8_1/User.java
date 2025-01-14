package com.perscholas.GLAB_309_8_1;

import lombok.*;
import jakarta.persistence.*;
import java.util.Collection;

/**
* @author Igor Adulyan
*/
@Entity
//@Setter
//@Getter
@NoArgsConstructor
@ToString
@Table(name = "user")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

   private String userName;

   private String firstName;

   private String lastName;

   private String email;

   private String phone;

   private String zip;

   private String password;

   @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinTable(name = "users_roles",
           joinColumns = @JoinColumn(name = "user_id"),
           inverseJoinColumns = @JoinColumn(name = "role_id"))
   private Collection <Role> roles;

   public User(String userName, String firstName, String lastName, String email, String phone, String zip, String password ) {
       this.userName = userName;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.phone = phone;
       this.zip = zip;
       this.password = password;

   }

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getZip() {
	return zip;
}

public void setZip(String zip) {
	this.zip = zip;
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
