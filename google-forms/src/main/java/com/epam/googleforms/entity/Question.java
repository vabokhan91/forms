package com.epam.googleforms.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "question")
    private String question;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    @OrderBy(value = "id")
    private List<Answer> answers;

    @ManyToOne
    @JoinColumn(name = "form_id")
    private Form form;

    public Question(String question, List<Answer> variants, Form form) {
        this.question = question;
        this.answers = variants;
        this.form = form;
    }

    public Question() {
        answers = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;

    }


    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", form=" + form +
                '}';
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
        answer.setQuestion(this);
    }
}
