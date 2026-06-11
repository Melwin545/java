class Stack {
    int top = -1;
    char arr[] = new char[20];

    public void push(char c) {
        top = top + 1;
        arr[top] = c;
    }

    public char pop() {
        char temp = arr[top];
        top = top - 1;
        return temp;
    }

    public char peek() {
        return arr[top];
    }

    public boolean isempty() {
        return top == -1;
    }
}

class InfixToPostfix {

    Stack s = new Stack();

    public int precedence(char c) {
        if (c == '+' || c == '-')
            return 1;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '^')
            return 3;
        else
            return -1;
    }

    public String convert(String infix) {

        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {

            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postfix = postfix + ch;
            }

            else {

                while (!s.isempty() && precedence(s.peek()) >= precedence(ch)) {
                    postfix = postfix + s.pop();
                }

                s.push(ch);
            }
        }

        while (!s.isempty()) {
            postfix = postfix + s.pop();
        }

        return postfix;
    }
}

public class Main {
    public static void main(String[] args) {

        InfixToPostfix obj = new InfixToPostfix();

        String infix = "a+b*c/d-g";

        String postfix = obj.convert(infix);

        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
    }
}