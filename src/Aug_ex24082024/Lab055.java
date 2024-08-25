package Aug_ex24082024;

import java.util.Stack;

public class Lab055 {

    public static void main(String[] args) {

        // Stack , Vector --> Are Legacy class 95% not going to use it in automation

        //Imp operation -- peek(), pop(), push(), search().
        // Stack is same as vector
        Stack s = new Stack();
        s.add("Praveen");
        s.add("Iyli");
        System.out.println(s);
        s.peek();  // operation is gives the last value
        System.out.println(s);
        s.pop();  // operation is remove the last value
        System.out.println(s);
        s.push("Prakash");  // operation is add/push the value  [add or push are same]
        s.push("Shantha");
        s.push("Iyli");
        System.out.println(s);
    }
}
