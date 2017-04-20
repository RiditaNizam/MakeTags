package com.company;

/**
 * Created by ridita on 4/19/17.
 */
public class MakeTags {
    public String makeTags(String tag, String word) {
        return ("<" + tag + ">" + word + "<" + "/" + tag + ">");
    }
}
