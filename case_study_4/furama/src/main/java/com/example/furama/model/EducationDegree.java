package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "education_degree")
public class EducationDegree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_degree_id")
    private Long educationDegreeId;

    @Column(name = "education_degree_name",length = 45)
    private String educationDegreeName;

    @OneToMany(mappedBy = "employeeEducation")
    private Set<Employee> employeeEducations;

    public EducationDegree() {
    }

    public Long getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(Long educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }

    public Set<Employee> getEmployeeEducations() {
        return employeeEducations;
    }

    public void setEmployeeEducations(Set<Employee> employeeEducations) {
        this.employeeEducations = employeeEducations;
    }
}
