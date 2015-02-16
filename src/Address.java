/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1302435
 */
public class Address {
    
    private String email;
    private String city;
    
    /**
     * Constructor of an email address
     * @param email The email address
     */
    public Address(String email, String city) {
        this.email = email;
        this.city = city;
    }

    /**
     * Gets the email and returns it to the program
     * @return the email address
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Allows for a change of email address
     * @param email the new email address
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
