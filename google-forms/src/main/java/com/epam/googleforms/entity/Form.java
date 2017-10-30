package com.epam.googleforms.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "form")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Column(name = "form_name")
    private String formName;

    @OneToMany(mappedBy = "form", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Question> questions;

    public Form(Long id, String formName, List<Question> questions) {
        this.id = id;
        this.formName = formName;
        this.questions = questions;
    }

    public Form() {
        questions = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
        question.setForm(this);
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", formName='" + formName + '\'' +
                ", questions="  +
                '}';
    }
}
