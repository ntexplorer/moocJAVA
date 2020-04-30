/**
 * @Time 2020/4/27 10:44
 * @Author
 * @Project moocJAVA
 * @Class Cat
 * @Software IntelliJ IDEA
 * @Version
 */

package exercise2;

import java.util.Objects;

public class Cat {
    private String name;
    private int month;
    private String species;

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
        this.setMonth(month);
        this.setName(name);
        this.setSpecies(species);
    }
}
