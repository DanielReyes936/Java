/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Asig1;

/**
 *
 * @author Daniel Reyes
 */
public class Grades  {
private double midterm1;
private double midterm2;
private double assign;
private double exam;


    public Grades(int midterm1, int midterm2, int assign, double exam) {
        this.midterm1 = midterm1;
        this.midterm2 = midterm2;
        this.assign = assign;
        this.exam = exam;
    }

   

    public double getExam() {
        return exam;
    }

    public void setExam(double exam) {
        this.exam = exam;
    }
    
   

    public double getMidterm1() {
        return midterm1;
    }

    public void setMidterm1(double midterm1) {
        this.midterm1 = midterm1;
    }

    public double getMidterm2() {
        return midterm2;
    }

    public void setMidterm2(double midterm2) {
        this.midterm2 = midterm2;
    }

    public double getAssign() {
        return assign;
    }

    public void setAssign(double assign) {
        this.assign = assign;
    }
    
   

}
