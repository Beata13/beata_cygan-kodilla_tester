package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
class BoookController {

    @GetMapping
    public List<BookDto> getBooks() { return new ArrayList<>(); }
}