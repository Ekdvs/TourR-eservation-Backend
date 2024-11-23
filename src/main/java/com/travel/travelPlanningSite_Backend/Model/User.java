package com.travel.travelPlanningSite_Backend.Model;

import org.springframework.data.annotation.Id;

public class User {
   @Id
    private Long id;
   private String fullname;
   private String username;
   private String email;
   private String phonenumber;
   private String password;
   private String repassword;

   public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getFullname() {return fullname;}

    public void setFullname(String fullname) {this.fullname = fullname;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPhonenumber() {return phonenumber;}

    public void setPhonenumber(String phonenumber) {}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getRepassword() {return repassword;}

    public void setRepassword(String repassword) {this.repassword = repassword;}





}
