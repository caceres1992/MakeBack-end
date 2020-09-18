package com.make.miracle.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:3000","https://makeamiracle.netlify.app"})
//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String Saludo () {

        return "<style>" +
                "body {\n" +
                "    background: #4b6cb7;  /* fallback for old browsers */\n" +
                "    background: -webkit-linear-gradient(to right, #182848, #4b6cb7);  /* Chrome 10-25, Safari 5.1-6 */\n" +
                "    background: linear-gradient(to right, #182848, #4b6cb7); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n" +
                "}\n" +
                "\n" +
                "h1, p, a {\n" +
                "    font-family: 'Carrois Gothic SC', sans-serif;\n" +
                "    display: block;\n" +
                "    text-align: center;\n" +
                "    line-height:.8;\n" +
                "    color: white;\n" +
                "}\n" +
                ".contenido {\n" +
                "    max-width: 1200px;\n" +
                "    margin: 5rem auto 0 auto;\n" +
                "    color: white;\n" +
                "    font-size: 3rem;\n" +
                "    font-family: 'Carrois Gothic SC', sans-serif;\n" +
                "}\n" +
                "h1 {\n" +
                "    font-size: 4rem;\n" +
                "}\n" +
                "a {\n" +
                "    font-size: 1.4rem;\n" +
                "}\n" +
                "p {\n" +
                "    font-size: 2.2rem;\n" +
                "}\n" +
                "\n" +
                ".hashtag {\n" +
                "    font-family: Arial, Helvetica, sans-serif;\n" +
                "}" +
                "</style>" +
                "    <div class=\"contenido\">\n" +
                "        <h1>Api Make a Miracle</h1>\n" +
                "        <a href=\"https://www.makeamiracle.net/\" target=\"_blank\">makeamiracle.net</a>\n" +
                "        <p>Trabajo en conjunto </p>\n" +
                "        <p class=\"hashtag\">#Jasson & Andony</p>\n" +
                "    </div>";
    }
}
