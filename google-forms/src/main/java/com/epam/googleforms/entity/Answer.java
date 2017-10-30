package com.epam.googleforms.entity;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "answer")
    private String variant;

    @Column(name = "right_answer")
    private boolean isRight;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Answer(String variant, boolean isRight, Question question) {
        this.variant = variant;
        this.isRight = isRight;
        this.question = question;
    }

    public Answer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }
}
