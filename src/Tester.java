
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1302435
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date date = new Date();
        
        Customer cust1 = new Customer(123,"Corrie","Robb");
        System.out.println(cust1.toString());
        
        Visitor visitor1 = new Visitor(date,"Charlotte","Wilson");
        
    }
    
}
