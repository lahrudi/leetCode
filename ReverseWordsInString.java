package Strings;

import java.util.Arrays;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        String[] strArrays = s.split(" ");
        for(int i= strArrays.length - 1; i >= 0 ; i--)
        {
            if ( !strArrays[i].isEmpty()) {
                sb.append(strArrays[i]);
                if (i > 0 && !strArrays[i].isEmpty()) {
                    sb.append(" ");
                }
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordsInString revString = new ReverseWordsInString();
        System.out.println(revString.reverseWords("a good   example"));
    }
}
