package com.make.miracle.backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:3000","https://makeamiracle.netlify.app"})
//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class ActividadController {
}
