package homework;

import java.util.Comparator;

/**
 * @author Tian Z
 */
public class ChineseComparator implements Comparator<Class> {
    @Override
    public int compare(Class o1, Class o2) {
        float score1 = o1.getChineseAverage();
        float score2 = o2.getChineseAverage();
        return (int) (score2 - score1);
    }
}
