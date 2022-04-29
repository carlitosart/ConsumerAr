package com.example.consumer.dto;



/**
 * @author jrojas
 */
public class StudentDto {
    private Long studentId;
    private String name;
    private String lastName;
    private String email;

    public StudentDto() {
    }


    public StudentDto(Long studentId, String name, String lastName, String email) {
        this.studentId = studentId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}