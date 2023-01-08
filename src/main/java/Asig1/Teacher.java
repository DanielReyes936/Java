/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Asig1;

/**
 *
 * @author Daniel Reyes
 */
public class Teacher {
    
    private String nameteacher;
    private int numOffice;
    private int phoneExtension;

    public Teacher(String nameteacher, int numOffice, int phoneExtension) {
        this.nameteacher = nameteacher;
        this.numOffice = numOffice;
        this.phoneExtension = phoneExtension;
    }

    public String getNameteacher() {
        return nameteacher;
    }

    public void setNameteacher(String nameteacher) {
        this.nameteacher = nameteacher;
    }

    public int getNumOffice() {
        return numOffice;
    }

    public void setNumOffice(int numOffice) {
        this.numOffice = numOffice;
    }

    public int getPhoneExtension() {
        return phoneExtension;
    }

    public void setPhoneExtension(int phoneExtension) {
        this.phoneExtension = phoneExtension;
    }
    
    

}
