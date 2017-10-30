package com.epam.googleforms.controller;

import com.epam.googleforms.entity.Answer;
import com.epam.googleforms.entity.Form;
import com.epam.googleforms.entity.FormView;
import com.epam.googleforms.entity.Question;
import com.epam.googleforms.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private FormService formService;

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping(value = "/forms")
    public ModelAndView getForms() {
        ModelAndView modelAndView = new ModelAndView();
        List<Form> result = formService.findAll();
        modelAndView.addObject("customforms", result);
        modelAndView.setViewName("forms");
        return modelAndView;
    }

    @GetMapping(value = "/form-info")
    public ModelAndView getFormInfo(@RequestParam("id")Long formId) {
        ModelAndView modelAndView = new ModelAndView();
        Form result = formService.findById(formId);
        modelAndView.addObject("form", result);
        modelAndView.addObject("user_answers", new ArrayList<Answer>());
        modelAndView.setViewName("questions");
        return modelAndView;
    }

    @GetMapping(value = "/delete-form")
    public String deleteForm(@RequestParam("id") Long formId) {
        formService.delete(formId);
        return "redirect:" + "/forms";
    }

    @GetMapping("/create-form")
    public ModelAndView createForm() {
        ModelAndView modelAndView = new ModelAndView();
        FormView formView = new FormView();
        modelAndView.addObject("new_form", formView);
        modelAndView.setViewName("create-form");
        return modelAndView;
    }

    @RequestMapping(value = "/save-form", method = RequestMethod.POST)
    public String saveForm(@ModelAttribute("new_from") @Valid FormView formView) {
        Form form = createForm(formView);
        formService.save(form);
        return "redirect:" + "/forms";
    }

    //    todo implement checking questions

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public ModelAndView checkAnswers(@ModelAttribute("user_answers") ArrayList<Answer> answers, @RequestParam("formId") Long formId) {
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }

    private Form createForm(FormView formView) {
        Form form = new Form();
        form.setFormName(formView.getFormName());
        Question question = new Question();
        question.setQuestion(formView.getFormQuestion());
        Answer answer1 = new Answer();
        answer1.setVariant(formView.getAnswer1());
        Answer answer2 = new Answer();
        answer2.setVariant(formView.getAnswer2());
        Answer answer3 = new Answer();
        answer3.setVariant(formView.getAnswer3());
        question.addAnswer(answer1);
        question.addAnswer(answer2);
        question.addAnswer(answer3);
        form.addQuestion(question);
        return form;
    }
}
