package com.epam.googleforms.entity;

import javax.validation.constraints.NotNull;

public class FormView {
    @NotNull
    private String formName;
    @NotNull
    private String formQuestion;
    @NotNull
    private String answer1;
    @NotNull
    private String answer2;
    @NotNull
    private String answer3;

    public FormView(String formName, String formQuestion, String answer1, String answer2, String answer3) {
        this.formName = formName;
        this.formQuestion = formQuestion;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    public FormView() {
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getFormQuestion() {
        return formQuestion;
    }

    public void setFormQuestion(String formQuestion) {
        this.formQuestion = formQuestion;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }
}
