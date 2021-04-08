/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iek.agdimitriu.lab07;

import java.util.Date;

/**
 *
 * @author ovidi
 */
public class Player {
   
    private String firstName; //Ονομα παικτη
    private String lastName; //Επιθετο Παικτη
    private Date birthDate; //Ημερομηνια Γεννησης Παικτη
    
    public Player (String f, String l){
        this.firstName=f;
        this.lastName=l;
    }
 //TODO Να φτιαξω μεθοδο για υπολογισμο ηλικιας απο εμερομηνια
 //TODO Να φτιαξω μεθοδο για υπολογισμο καλαθιων
    
   
    public void printStats(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Date: " + birthDate);
    }
    
    public String toString(){
        return "First Name: "+firstName+" Last Name: "+lastName+
                ", Birth Date: "+birthDate;
    }
}
