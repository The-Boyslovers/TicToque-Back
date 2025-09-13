package com.TBLS.TicToque.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TicToqueController
{
    @GetMapping
    public String openConnection()
    {
        return "Working Good";
    }
}
