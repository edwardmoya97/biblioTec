/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author edwar
 */
public class Student {
    String id;
    String name;
    ArrayList<Loan> loans;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        loans = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }
    
    
    
    public void addLoan(Loan loan){
        loans.add(loan);
    }
    
}
