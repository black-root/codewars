/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewar.traiing.deleteoccurrencesofanelement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ronal
 */
class BraceChecker {

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    int positionX, positionY;

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void positions(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }
    /*
     public boolean isValid(String braces) {

     boolean result = false;
     boolean flag = true, cycleFinish = false;
     int count = 1;
     //if it's not par
     if (braces.length() % 2 == 0
     && (braces.charAt(0) == '(' || braces.charAt(0) == '{' || braces.charAt(0) == '[')) {

     for (int i = 0; braces.length() - 1 > i; i++) {
     System.out.println(i + "\t" + braces.charAt(i));
     for (int j = i + 1; braces.length() > j; j++) {
     System.out.println(j + "\t" + braces.charAt(j) + "segundo for");
     if (braces.charAt(i) == '(') {
     if (braces.charAt(j) == '(') {
     count = count - 1;
     } else if (braces.charAt(j) == ')') {
     count = count + 1;
     }
     positions(i, j);
     } else if (braces.charAt(i) == '[') {

     if (braces.charAt(j) == '[') {
     count = count - 1;
     } else if (braces.charAt(j) == ']') {
     count = count + 1;
     System.out.println(j + "\t" + braces.charAt(j) + " count " + count);
     }
     positions(i, j);
     } else if (braces.charAt(i) == '{') {
     if (braces.charAt(j) == '{') {
     count = count - 1;
     } else if (braces.charAt(j) == '}') {
     count = count + 1;
     }
     positions(i, j);
     } else if (braces.charAt(i) == '}' || braces.charAt(i) == ')'
     || braces.charAt(i) == ']') {
     count = 2;
     }
     }
     if (count != 2) {
     System.out.println("wrong string!");
     result = false;
     count = 1;
     break;
     } else {
     //braces = removeCharacters(braces);
     System.out.println("good string! ");
     count = 1;
     result = true;
     }
     }
     }
     return result;
     }
     */

    public boolean isValid(String braces) {

        List<String> items = Arrays.asList(braces.split(""));
        boolean result = false;
        int count = 1;

        if (items.size() % 2 == 0 && ((items.get(0).equals("(")
                || items.get(0).equals("{") || items.get(0).equals("[")) || items.get(0).equals("*"))) {

            for (int i = 0; items.size() - 1 > i; i++) {
                for (int j = i + 1; items.size() > j; j++) {
                    if (items.get(i).equals("(")) {
                        if (items.get(j).equals("(")) {
                            count = count - 1;
                        } else if (items.get(j).equals(")")) {
                            count = count + 1;
                        }
                        positions(i, j);
                    } else if (items.get(i).equals("{")) {
                        if (items.get(j).equals("{")) {
                            count = count - 1;
                        } else if (items.get(j).equals("}")) {
                            count = count + 1;
                        }
                        positions(i, j);
                    } else if (items.get(i).equals("[")) {
                        if (items.get(j).equals("[")) {
                            count = count - 1;
                        } else if (items.get(j).equals("]")) {
                            count = count + 1;
                        }
                        positions(i, j);
                    }
                }
                if (count == 2 ) {
                    items.set(getPositionX(), "*");
                    items.set(getPositionY(), "*");
                    System.out.println("\t");
                    count = 1;
                    result = true;
                    for (int l = 0; l < items.size(); l++) {
                        System.out.print(items.get(l));
                    }
                }
            }
            /*System.out.println(items.size());
             if (items.get(0).equals("(") && items.get(1).equals(")")) {
             System.out.println(items.get(0) + items.get(1));
             }*/
        }
        return result;
    }
}
