package exam2019.q2;

/**
 * @author Tian Z
 */
public class Encrypt {
    public static void main(String[] args) {
        String string = "abcdefgABCxyz888";
        System.out.println("Original string is : " + string);
        String asciiStr = stringToAscii(string);
        String encryptStr = asciiToString(asciiStr);
        System.out.println("Transformed string is : " + encryptStr);
    }

    public static String stringToAscii(String value) {
        StringBuilder stringBuffer = new StringBuilder();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                stringBuffer.append((int) chars[i]).append(",");
            } else {
                stringBuffer.append((int) chars[i]);
            }
        }
        return stringBuffer.toString();

    }

    public static String asciiToString(String value) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] chars = value.split(",");
        for (String aChar : chars) {
            if (Integer.parseInt(aChar) == 97) {
                stringBuilder.append((char) 122);
            } else if ((Integer.parseInt(aChar) > 97) && (Integer.parseInt(aChar) <= 122)) {
                stringBuilder.append((char) (Integer.parseInt(aChar) - 1));
            } else {
                stringBuilder.append((char) Integer.parseInt(aChar));
            }
        }
        return stringBuilder.toString();
    }

}
