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
public class Customer extends Person {
    
    private int custID;

    /**
     * Creates a customer
     * @param custID The customers unique ID
     * @param firstname the customers first name
     * @param lastname the customers last name
     */
    public Customer(int custID, String firstname, String lastname) {
        super(firstname, lastname);
        this.custID = custID;
    }
    
    /**
     * Gets the customers ID number
     * @return the customers ID
     */
    public int getCustID() {
        return custID;
    }
    
    /**
     * Gives the customer a new ID
     * @param custID the new ID number
     */
    public void setCustID(int custID) {
        this.custID = custID;
    }
    
    /**
     * The details of a customer
     * @return the customer details
     */
    @Override
    public String toString() {
        return "Customer{" + "custID=" + custID + '}';
    }   
}
