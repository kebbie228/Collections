package com.company;

import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {

        String s = "{[s+(a+b)+1]+2}[}]}";
        //String s = "{[s+(a+b+1]+2}";
        //String s = "{[s+(a+b+1])+2}";
        String parenthesis="()[]{}";
        Stack<Character> stack = new Stack<>();
        boolean flag=true;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i); //{
            int index = parenthesis.indexOf(c); //4
            if (index!=-1){ //
                if (index%2==0)
                    stack.push(c);
                else {
                    //Пуст ли стек
                    if (stack.isEmpty()){
                        System.out.println("Ошибка в позиции "+i);
                       flag=false;
                        break;
                    }
                    char c2 = stack.peek();
                    int index2 = parenthesis.indexOf(c2);
                    if (index-index2==1)
                        stack.pop();
                    else  //Непарность скобок
                    {
                        flag=false;
                        System.out.println("Ошибка в позиции "+i);
                    break;
                    }

                }
            }
        }
        //Пуст ли стек
        if (!stack.isEmpty() && flag){
            System.out.println("Ошибка в позиции "+(s.length()-1));
        flag=false;
        }
        if(flag) System.out.println("Все верно");
    }
}
