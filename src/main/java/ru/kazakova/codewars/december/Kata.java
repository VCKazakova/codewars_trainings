package ru.kazakova.codewars.december;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Objects.nonNull;

public class Kata {

    /**
     * https://www.codewars.com/kata/538ae2eb7a4ba8c99b000439/train/java
     * Your friend won't stop texting his girlfriend. It's all he does.
     * All day. Seriously. The texts are so mushy too! The whole situation just makes you feel ill.
     * Being the wonderful friend that you are, you hatch an evil plot.
     * While he's sleeping, you take his phone and change the autocorrect options so that every time
     * he types "you" or "u" it gets changed to "your sister."
     *
     * Write a function called autocorrect that takes a string and replaces all
     * instances of "you" or "u" (not case sensitive) with "your sister" (always lower case).
     *
     * Return the resulting string.
     *
     * Here's the slightly tricky part: These are text messages, so there are different forms of "you" and "u".
     *
     * For the purposes of this kata, here's what you need to support:
     *
     * "youuuuu" with any number of u characters tacked onto the end
     * "u" at the beginning, middle, or end of a string, but NOT part of a word
     * "you" but NOT as part of another word like youtube or bayou
     */


    // на входе будут "youuuuu", "u", "you" - их меняем на your sister
    public static String autocorrect(String input) {
        if (input.contains(" ")) {
            return autocorrectBigString(input);
        } else {
            return changeOrGetInputString(input) ? "your sister" : input;
        }
    }

    public static boolean changeOrGetInputString(String input) {
        return (((input.startsWith("y") || input.startsWith("Y"))
                && (input.endsWith("u") || input.endsWith("U")))
                || ("u".equalsIgnoreCase(input) || "you".equalsIgnoreCase(input)));
    }

    public static String getSignFromString(String input) {
        String punctuationRegex = "[\\p{Punct}]";
        Pattern pattern = Pattern.compile(punctuationRegex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static String autocorrectBigString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        if (input.contains(" ")) {
            String[] splitLowerInput = input.split(" ");
            for (String partOfSplitString : splitLowerInput) {
                String sign = getSignFromString(partOfSplitString);
                if (nonNull(sign)) {
                    String[] splitWithSign = partOfSplitString.split(Pattern.quote(sign));
                    for (String partOfStringWithSign : splitWithSign) {
                        if (changeOrGetInputString(partOfStringWithSign)) {
                            stringBuilder.append("your sister ");
                        }
                    }
                    while (stringBuilder.length() > 0 && Character.isWhitespace(
                            stringBuilder.charAt(stringBuilder.length() - 1))) {
                        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    }
                    stringBuilder.append(sign);
                } else if (changeOrGetInputString(partOfSplitString)) {
                    stringBuilder.append("your sister ");
                } else {
                    stringBuilder.append(partOfSplitString);
                    stringBuilder.append(" ");
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(autocorrect("youuuuuuu"));
        System.out.println(autocorrect("youtube"));
        System.out.println(autocorrect("u"));
        System.out.println(autocorrect("you"));
        System.out.println(autocorrect("you got MY u"));
        System.out.println(autocorrect("i miss you!"));
        System.out.println(autocorrectBigString("I miss you!"));
    }

}
