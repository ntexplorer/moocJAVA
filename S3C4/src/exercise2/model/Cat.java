/**
 * @Time 2020/4/26 11:13
 * @Author
 * @Project moocJAVA
 * @Class Cat
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2.model;

import java.util.Objects;

public class Cat {
    private String name;
    private int month;
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Cat(String name, int month, String species) {
        this.setName(name);
        this.setMonth(month);
        this.setSpecies(species);
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cat cat = (Cat) o;
        return month == cat.month &&
                Objects.equals(name, cat.name) &&
                Objects.equals(species, cat.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, month, species);
    }
}
