package com.restSpringBoot.restSpringBoot.controller;

import com.restSpringBoot.restSpringBoot.model.Human;
import com.restSpringBoot.restSpringBoot.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("human")
public class HumanController {

    private HumanRepository humanRepository;

    @Autowired
    public HumanController(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @GetMapping
    public List<Human> getList() {
        return humanRepository.getAll();
    }

    @GetMapping("{id}")
    public Human getOne(@PathVariable String id) {
        return humanRepository.getHumanById(Integer.parseInt(id));
    }

    @PostMapping
    public Human create(@RequestBody Human human) {
        return humanRepository.createHuman(human);
    }

    @PutMapping("{id}")
    public Human update(@PathVariable String id, @RequestBody Human human) {
        return humanRepository.updateHumanById(Integer.parseInt(id), human);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        humanRepository.removeHumanById(Integer.parseInt(id));
    }
}
