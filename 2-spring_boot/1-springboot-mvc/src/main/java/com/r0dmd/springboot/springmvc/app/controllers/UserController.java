package com.r0dmd.springboot.springmvc.app.controllers;

import com.r0dmd.springboot.springmvc.app.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app") // Esto quiere decir que primero va la ruta app y luego las del controlador
public class UserController {

  // Cuando un método del controlador está anotado con un mapping, se llama handler (handler request o handler http, es lo mismo; es para manejar una petición web)
  @GetMapping({ "/saludar", "/" })
  public String viewData(Model model) {
    model.addAttribute("title", "Hola mundo desde Spring Boot");
    model.addAttribute("message", "App de ejemplo usando Spring MVC");
    model.addAttribute("user", new User("Pepe", "Pérez"));

    return "view"; // NOTA: Aunque en la ruta y en el nombre del método se pueden poner otras cosas, aquí sí devuelve el nombre de la plantilla html tal como la hemos llamado
  }
}
