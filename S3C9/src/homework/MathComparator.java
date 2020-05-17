package homework;

import java.util.Comparator;

/**
 * The type Math comparator.
 *
 * @author Tian Z
 */
public class MathComparator implements Comparator<Class> {
    @Override
    public int compare(Class o1, Class o2) {
        float score1 = o1.getMathAverage();
        float score2 = o2.getMathAverage();
        return (int) (score2 - score1);
    }
}
