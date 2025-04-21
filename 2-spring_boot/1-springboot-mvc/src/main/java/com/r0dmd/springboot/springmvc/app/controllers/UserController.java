package com.r0dmd.springboot.springmvc.app.controllers;

import com.r0dmd.springboot.springmvc.app.entities.User;
import com.r0dmd.springboot.springmvc.app.services.UserService;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users") // Esto quiere decir que primero va la ruta app y luego las del controlador
public class UserController {

  private final UserService service;

  public UserController(UserService service) {
    this.service = service;
  }

  // Cuando un método del controlador está anotado con un mapping, se llama handler (handler request o handler http, es lo mismo; es para manejar una petición web)
  @GetMapping({ "/view", "/saludar" })
  public String viewData(Model model) {
    model.addAttribute("title", "Hola mundo desde Spring Boot");
    model.addAttribute("message", "App de ejemplo usando Spring MVC");
    model.addAttribute("user", new User("Pepe", "Pérez"));

    return "view"; // NOTA: Aunque en la ruta y en el nombre del método se pueden poner otras cosas, aquí sí devuelve el nombre de la plantilla html tal como la hemos llamado
  }

  @GetMapping // Si no colocamos ruta, es como poner ("/")
  public String list(Model model) {
    model.addAttribute("title", "Listado de usuarios");
    model.addAttribute("users", service.findAll());
    return "list";
  }

  // FORMULARIO
  // Se procesa/maneja con método POST
  // Pero se visualiza con el método GET
  @GetMapping("/form")
  public String form(Model model) {
    model.addAttribute("title", "Añadir usuario");
    model.addAttribute("user", new User());
    return "form";
  }

  @GetMapping("/form/{id}")
  public String form(
    @PathVariable Long id,
    Model model,
    RedirectAttributes redirect
  ) {
    Optional<User> optionalUser = service.findById(id);
    if (optionalUser.isPresent()) {
      model.addAttribute("title", "Editar usuario");
      model.addAttribute("user", optionalUser.get());
      return "form";
    } else {
      redirect.addFlashAttribute(
        "error",
        "El usuario con id " + id + " no existe en la BD"
      );
      return "redirect:/users";
    }
  }

  @PostMapping
  public String form(User user, Model model, RedirectAttributes redirect) {
    String message = (user.getId() != null && user.getId() > 0)
      ? "El usuario " + user.getName() + " se ha actualizado con éxito"
      : "El usuario " + user.getName() + " se ha añadido con éxito";

    service.save(user);
    redirect.addFlashAttribute("success", message);
    return "redirect:/users";
  }

  // Eliminar usuario
  @GetMapping("/delete/{id}")
  public String delete(@PathVariable Long id, RedirectAttributes redirect) {
    Optional<User> optionalUser = service.findById(id);
    if (optionalUser.isPresent()) {
      redirect.addFlashAttribute(
        "success",
        "El usuario " +
        optionalUser.get().getName() +
        " se ha eliminado con éxito"
      );
      service.remove(id);
      return "redirect:/users";
    }
    redirect.addFlashAttribute(
      "error",
      "Error: El usuario con el id " + id + " no se ha encontrado en el sistema"
    );
    return "redirect:/users";
  }
}
