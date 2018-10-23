package com.restSpringBoot.restSpringBoot.controller;

import com.restSpringBoot.restSpringBoot.model.Human;
import com.restSpringBoot.restSpringBoot.model.Profession;
import com.restSpringBoot.restSpringBoot.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("human/{id}/profession")
public class ProfessionController {

    private HumanRepository humanRepository;

    @Autowired
    public ProfessionController(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @GetMapping
    public Profession get(@PathVariable String id) {
        return humanRepository.getHumanProfession(Integer.parseInt(id));
    }

    @PutMapping
    public Human update(@PathVariable String id, @RequestBody Profession profession) {
        return humanRepository.updateHumanProfession(Integer.parseInt(id), profession);
    }

    @DeleteMapping
    public void delete(@PathVariable String id) {
        humanRepository.removeHumanProfession(Integer.parseInt(id));
    }
}
