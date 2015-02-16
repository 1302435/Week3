
import java.util.Date;

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
public class Visitor extends Person {
    
    private Date visitDate;

    /**
     * Constructor for a visitor
     * @param visitDate The date the person visited
     * @param firstname The first name of the visitor
     * @param lastname THe last name of the visitor
     */
    public Visitor(Date visitDate, String firstname, String lastname, Address ad1) {
        super(firstname, lastname, ad1);
        this.visitDate = visitDate;
    }

    /**
     * Gets the date of the visit and returns it to the program
     * @return the date the person visited
     */
    public Date getVisitDate() {
        return visitDate;
    }
    
    /**
     * Allows the user to change the date of a customers visit
     * @param visitDate the new or changed visit date
     */
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
    
    /**
     * The visitors details are returned to the program
     * @return all details of a visitor
     */
    @Override
    public String toString() {
        return "Visitor{" + "visitDate=" + visitDate + '}';
    }  
}
