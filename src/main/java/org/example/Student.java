package org.example;

import java.util.Arrays;

public class Student {
    private int studentId;

    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    private String name;
    private String studentAddress;

    public int getStudentId() {


        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

//    public Student() {
//
//    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", arr=" + Arrays.toString(arr) +
                ", name='" + name + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
