package com.restSpringBoot.restSpringBoot.repository;

import com.restSpringBoot.restSpringBoot.exception.NotFoundEntityExceptions;
import com.restSpringBoot.restSpringBoot.model.Human;
import com.restSpringBoot.restSpringBoot.model.Profession;

import java.util.ArrayList;
import java.util.List;

public class HumanRepository {

    private int counter = 3;

    private List<Human> humanList = new ArrayList<Human>() {{
        add(new Human(1, "Eliza", 25, new Profession(1, "waiter", 16000)));
        add(new Human(2, "John", 31, new Profession(2, "teacher", 8000)));
    }};

    public List<Human> getAll(){
        return humanList;
    }

    public Human getHumanById(Integer id){
        return humanList.stream().filter(human -> human.getId().equals(id)).findFirst().
                orElseThrow(NotFoundEntityExceptions::new);
    }

    public Human createHuman(Human human){
        human.setId(counter++);
        humanList.add(human);
        return human;
    }

    public Human updateHumanById(Integer id, Human human){
        Human storedHuman = getHumanById(id);
        storedHuman.setName(human.getName());
        storedHuman.setAge(human.getAge());
        storedHuman.setProfession(human.getProfession());
        return storedHuman;
    }

    public void removeHumanById(Integer id){
        humanList.remove(getHumanById(id));
    }

    public Profession getHumanProfession(Integer id){
        return getHumanById(id).getProfession();
    }

    public Human updateHumanProfession(Integer id, Profession profession){
        Human human =getHumanById(id);
        human.setProfession(profession);
        return updateHumanById(id, human);
    }

    public void removeHumanProfession(Integer id) {
        Human human = getHumanById(id);
        human.setProfession(null);
    }
}
