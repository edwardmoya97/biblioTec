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
public class Logic {
    ArrayList<Student> students;
    ArrayList<Material> materials;

    public Logic() {
        students = new ArrayList<>();
        materials = new ArrayList<>();
    }
    

    public void addStudent(Student student){
        students.add(student);
    }
    
    public void addMaterial(Material material){
        materials.add(material);
    }
    
    public boolean existStudent(String id){
        for(Student std : students){
            if(std.getId().equals(id))
                return true;
        }
        return false;
    }
}
