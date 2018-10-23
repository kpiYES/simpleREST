package com.restSpringBoot.restSpringBoot.model;

public class Human {

    private Integer id;
    private String name;
    private Integer age;
    private Profession profession;

    public Human() {
    }

    public Human(Integer id, String name, Integer age, Profession profession) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (id != null ? !id.equals(human.id) : human.id != null) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (age != null ? !age.equals(human.age) : human.age != null) return false;
        return profession != null ? profession.equals(human.profession) : human.profession == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", profession=" + profession +
                '}';
    }
}
