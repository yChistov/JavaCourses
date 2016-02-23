package prog.oop.Lessons_3.Exception;

/*      Написать метод разбора списка параметров в формате URL:
        para1=value1&param2=value2&param3=value3. В случае ошибки в
        формате бросать исключение.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLParse {

        public static final Pattern pattern = Pattern.compile
            ("^(https?)://((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+((net)||(com)||(org)||(ua)||(ru))(?:/[a-zA-Z0-9.,_@%&?+=~/-]*)?(?:#[^ '\"&]*)?$");

    public static void doMatch(String url) throws Exception {
        Matcher matcher = pattern.matcher(url);
        if (!matcher.matches()) {
            throw new Exception("Validation for " + url + " not passed.");
        }
        String[] arr = url.split("&");
        for (int i = 0; i < arr.length; i++) {
            String[] arr2 = arr[i].split("=");
            int count = 0;
            for (String m : arr2) {
                count++;
                System.out.println("param" + count +" = " + m);
                if (m.contains(" ")) {
                    throw new Exception("empty parameter");
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        doMatch("https://www.google.com.ua/webhp?source=search_app&gfe_rd=cr&ei=ycP2VPn0Ioiu8wfHwIDQCQ&gws_rd=ssl");
        System.out.println();
        doMatch("http://www.native-english.ru/grammar/present-simple");
    }
}