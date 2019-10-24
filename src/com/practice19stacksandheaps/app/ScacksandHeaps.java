package com.practice19stacksandheaps.app;

import java.util.Stack;

public class ScacksandHeaps
{
    public static void main(String[] args) {
        //Variables declaration
        String cad = "Lorem ipsum dolor sit amet consectetur adipiscing elit neque convallis bibendum ornare ad massa, " +
                "rutrum odio montes vivamus in metus blandit vitae lobortis curabitur dictum sodales." +
                " Neque cras ultricies volutpat laoreet nullam erat nisl.";

        //Stack declaration
        Stack<Character> lettersStack = new Stack<Character>();

        //Array declaration
        char[] lettersArray = cad.toCharArray();


        for(Character c: lettersArray)
        {
            //Compare characters
            if(Character.toUpperCase(c) == 'A')
            {
                //push character to stack
                lettersStack.push(c);
            }
        }

        //Pop items of stack
        while (!lettersStack.isEmpty())
        {
            System.out.println(lettersStack.pop());
        }
    }
}
