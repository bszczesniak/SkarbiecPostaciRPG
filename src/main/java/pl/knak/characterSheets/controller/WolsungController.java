package pl.knak.characterSheets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.knak.characterSheets.dao.WolsungDao;
import pl.knak.characterSheets.model.Wolsung;

@Controller
public class WolsungController {

    @Autowired
    private WolsungDao wolsungDao;

    @GetMapping("/wolsung/add")
    public String add(WolsungDao wolsungDao, ModelMap modelMap) {
        return "wolsung/add";
    }

//
    @RequestMapping("/wolsung/{id}")
    public String showById(@PathVariable Long id, ModelMap modelMap)
    {
        if (wolsungDao.findById(id).isPresent()) {
            modelMap.addAttribute("wolsung", wolsungDao.findById(id).get());
            return "wolsung/showchar";
        }
        else {
            return "wolsung/add";
        }

    }

    @RequestMapping ("/wolsung/all")
    public String showAll (@ModelAttribute Wolsung wolsung, ModelMap modelMap) {
        modelMap.addAttribute("wolsung", wolsungDao.findAll());
        return "wolsung/all";
    }

    @PostMapping("/wolsung/create")
    public String show(@ModelAttribute Wolsung wolsung, RedirectAttributes redirectAttributes) {
        wolsungDao.save(wolsung);
        return "redirect:/wolsung/"+wolsung.getId();
    }

    @GetMapping("/wolsung/owner/{owner}")
    public String showBySurname(@PathVariable String owner, ModelMap modelMap) {
        modelMap.addAttribute("wolsung", wolsungDao.findByOwner(owner));

        return "wolsung/all";


    }

}
