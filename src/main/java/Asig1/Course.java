/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Asig1;

/**
 *
 * @author Daniel Reyes
 */
public class Course {
    
    private String nameCourse;
    private String department;
    private  int year;
    private String semester;
    private String  description;

    public Course(String nameCourse, String department, int year, String semester, String description) {
        this.nameCourse = nameCourse;
        this.department = department;
        this.year = year;
        this.semester = semester;
        this.description = description;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
         

}
