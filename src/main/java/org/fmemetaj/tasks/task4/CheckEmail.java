package org.fmemetaj.tasks.task4;

import java.util.regex.Pattern;

public class CheckEmail {
    public static boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^(.+)@(\\S+)$");
        return pattern.matcher(email).matches();
    }
}
