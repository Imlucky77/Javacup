package free.javase;

import java.util.regex.Pattern;

public class RESimple {
    public static void main(String[] argv) {
//        String pattern = "^Q[^u]\\d+\\.";
        //String pattern = "^(?:[\w]\:|\\)(\\[a-z_\-\s0-9\.]+)+\.(json|txt|gif|pdf|doc|docx|xls|xlsx)$";
        //String pattern = "^(?:[\\w]\\:|\\\\)(\\\\[a-z_\\-\\s0-9\\.]+)+\\.(json|txt|gif|pdf|doc|docx|xls|xlsx)$";
        //String pattern = ".*\\.(json|txt|gif|pdf|doc|docx|xls|xlsx)$";
        String pattern = "([a-zA-Z0-9\\s_\\\\.\\-\\(\\):])+(.json|.doc|.docx|.pdf|.txt)$";

        String input = "C://FTPFile//weatherFile.txt";

        Pattern p = Pattern.compile(pattern);

        boolean found = p.matcher(input).lookingAt();

        System.out.println("'" + pattern + "'" +
                (found ? " matches '" : " doesn't match '") + input + "'");
    }
}