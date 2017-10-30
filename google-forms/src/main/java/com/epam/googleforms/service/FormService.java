package com.epam.googleforms.service;

import com.epam.googleforms.entity.Form;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FormService extends CrudRepository<Form, Long> {
    List<Form> findAll();

    Form findById(Long id);
}
