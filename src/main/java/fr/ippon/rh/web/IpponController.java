package fr.ippon.rh.web;

import fr.ippon.rh.service.Etape2Service;
import fr.ippon.rh.service.Etape3Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

/**
 * Controller principal, servant les pages Web du jeu.
 */
@Controller
public class IpponController {

    @Inject
    private Etape2Service etape2Service;

    @Inject
    private Etape3Service etape3Service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/etape1", method = RequestMethod.GET)
    public String etape1(Model model) {
        return "etape1";
    }

    @RequestMapping(value = "/etape2", method = RequestMethod.GET)
    public String etape2(Model model) {
        model.addAttribute("texte", etape2Service.decriptText());
        return "etape2";
    }

    @RequestMapping(value = "/etape3", method = RequestMethod.GET)
    public String etape3(Model model) {
        model.addAttribute("texte", etape3Service.decriptText());
        return "etape3";
    }
}
