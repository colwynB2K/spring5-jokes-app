package guru.springframework.joke.controller;

import guru.springframework.joke.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/", ""})
    String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "chuck-norris";
    }
}
