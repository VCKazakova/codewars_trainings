package ru.kazakova.codewars.december;

import java.util.ArrayList;
import java.util.List;

public class SmileFaces {

    /**
     * https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java
     * <p>
     * Given an array (arr) as an argument complete the function countSmileys
     * that should return the total number of smiling faces.
     * <p>
     * Rules for a smiling face:
     * <p>
     * Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
     * A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
     * Every smiling face must have a smiling mouth that should be marked with either ) or D
     * No additional characters are allowed except for those mentioned.
     * <p>
     * Valid smiley face examples: :) :D ;-D :~)
     * Invalid smiley faces: ;( :> :} :]
     * <p>
     * Example
     * countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
     * countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
     * countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
     * <p>
     * Note
     * In case of an empty array return 0. You will not be tested with invalid input
     * (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same.
     */

    // дан лист с лицами
    // может содержать глаза : или ;
    // нос может быть или нет - ~
    // улыбка - ) or D
    public static int countSmileys(List<String> arr) {
        // проходимся по листу
        // ставим условие, что строка начинается с правильных глаз и заканчивается правильной улыбкой
        // смотрим на нос
        // увеличиваем счетчик
        if (arr.isEmpty()) {
            return 0;
        }
        int numbers = 0;
        for (String smile : arr) {
            if ((smile.startsWith(":") || smile.startsWith(";"))
                    && (smile.endsWith(")") || smile.endsWith("D"))
                    && (smile.length() == 2 || smile.length() == 3)) {
                numbers++;
            }

        }
        return numbers;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":D");
        a.add(":-}");
        a.add(":-()");

        System.out.println(countSmileys(a));

        /**
         * The Array [:), (~D, :), pdop, ;), pd, 4D, :DD, '-~D, :2d, :px, :D, 4~), ;8X, o~P, ;X, 5-x, 'dD, :dd, ~od,
         * ;~P, ;), '-D, ;dp, 4P, o-), ~(P, ;D, ;~d, ;x, ;~d, (x, 5dd, ;p, ;D] has expected:<7> but was:<8>
         */
    }

}
