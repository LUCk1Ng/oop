package lab4;
import java.util.*;
import java.io.*;

public class readfile1 {

    public static boolean ArePair(char opening, char closing) {
        if (opening == '(' && closing == ')') return true;
        else if (opening == '{' && closing == '}') return true;
        else if (opening == '[' && closing == ']') return true;
        return false;
    }

    public static boolean AreParenthesesBalanced(String exp) {
        Stack<Character> S = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[')
                S.push(exp.charAt(i));
            else if (exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']') {
                if (S.isEmpty() || !ArePair(S.peek(), exp.charAt(i)))
                    return false;
                else S.pop();
            }
        }
        return S.isEmpty();
    }

    public static void main(String[] args) throws Exception {

        File file = new File(/Users/maverick/IdeaProjects/lab4/src/lab4/lab4readfile1.java);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {

            System.out.println(st);

            if (AreParenthesesBalanced(st)) {
                System.out.println("Correct");
            } else {
                System.out.println("Not Correct");
            }
        }
        br.close();
    }
}
