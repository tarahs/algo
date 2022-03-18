package com.interview.datastructure.stack;

import java.util.Stack;

public class ExpressionOperations {

    String s = "tara";

    public ExpressionOperations()
    {
        // TODO Auto-generated constructor stub
    }

    public String infixToPost( String expr )
    {

        Stack<Character> stack = new Stack<>();

        if( expr == null || expr.isEmpty() )
            return null;

        char c;
        String postExpr = "";
        for( int i = 0; i < expr.length(); i++ )
        {
            c = expr.charAt(0);
            if(Character.isLetterOrDigit(c)){
                postExpr += c;
            }
            else if(c == ')'){
                Character poppedEle;
                do{
                    poppedEle  = stack.pop();
                    postExpr += poppedEle;

                }while(poppedEle != '(' && !stack.isEmpty());
            }else if(c == '(' || c == '^')
                stack.push(c);
            else if(getCharPrec(c) > stack.peek())
                stack.push(c);
            else


        }

        while (!stack.empty()){
            postExpr += stack.pop();
        }
        return null;
    }

    public int getCharPrec( char c )
    {
        switch ( c )
        {
            case '+' :
            case '-' :
                return 1;
            case '*' :
            case '/' :
                return 2;
            case '^' :
                return 3;
            default: return  0;
        }
    }
}
