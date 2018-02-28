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
public class Material {
    private String title;
    private String idCode;
    private int availableQuantity;
    private ArrayList<Characteristic> characteristics;

    public Material(String title, String idCode, int availableQuantity) {
        this.title = title;
        this.idCode = idCode;
        this.availableQuantity = availableQuantity;
        characteristics = new ArrayList<>();
    }
     
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public ArrayList<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(ArrayList<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }
    
    
}
