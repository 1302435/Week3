/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 
 * @author 1302435
 * 16/2/2015
 */
public class Person {
    
    private String firstname;
    private String lastname;

    
    /**
     * Constructor Method for person
     * @param firstname first name of person
     * @param lastname last name of person
     */
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Gets the first name of the person
     * @return gets the first name of the person
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Changes the first name of a person
     * @param firstname the replacement name
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets the last name of the person
     * @return gets the last name of the person
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Changes the last name of a person
     * @param lastname the replacement name
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    /**
     * All details of a person
     * @return The persons details
     */
    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + '}';
    }  
}
