package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Tian Z
 */
public class School {
    private final Map<String, Class> schoolMap;

    public School() {
        this.schoolMap = new HashMap<>();
    }

    public void addClass(Class newClass) {
        if (this.schoolMap.containsKey(newClass.getClassName())) {
            System.out.println("Class already exists!");
        } else {
            this.schoolMap.put(newClass.getClassName(), newClass);
        }
    }

    public void deleteClass(Class targetClass) {
        if (this.schoolMap.containsKey(targetClass.getClassName())) {
            this.schoolMap.remove(targetClass.getClassName());
        } else {
            System.out.println("Class doesn't exist!");
        }
    }

    public Class searchByClassName(String className) {
        return this.schoolMap.getOrDefault(className, null);
    }

    public void sortChineseByAverage() {
        List<Class> chineseList = new ArrayList<>(this.schoolMap.values());
        chineseList.sort(new ChineseComparator());
        System.out.println("After sorted by Chinese score: ");
        for (Class aClass : chineseList) {
            System.out.print(aClass.getClassName() + "  ");
        }
        System.out.println();
    }

    public void sortMathByAverage() {
        List<Class> mathList = new ArrayList<>(this.schoolMap.values());
        mathList.sort(new MathComparator());
        System.out.println("After sorted by Math score: ");
        for (Class aClass : mathList) {
            System.out.print(aClass.getClassName() + "  ");
        }
        System.out.println();
    }

    public void displayClassName() {
        for (Class aClass : this.schoolMap.values()) {
            System.out.println(aClass.getClassName());
        }
    }
}
