package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args){

        /* 수업목표: 값을 직접 연산하여 출력할 수 있다. */
        /* 필기: 이때 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다*/


        /* 목차: 1. 숫자와 숫자의 연산*/
        /* 목차: 1-1 : 정수와 정수의 연산*/
        /* 필기: 수학적으로 사용되는 사칙연산에 추가로 나머지를 구하는 연산(mod)를 사용할 수 있다 */
        System.out.println("=========== 정수와 정수의 연산============");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 23);
        System.out.println(123 / 10);
        System.out.println(123 % 10);
        /*
        *  여러줄 주석 : 여러 줄 작성 가능
        *
        * */

        //한줄 주석
        //매번 앞에 주석 표기를 달아야 함
        System.out.println(1.23);
        System.out.println('a');//한 글자는 문자형이기에 홑따옴표로 감싸주어야 한다.
        System.out.println("ab");//두 글자 이상부터는 쌍따옴표로 감싸주어야 한다.
        //mac은 한줄 주석시 커맨드 + /  , 아니면 // 아니면 여러줄 주석은 /**/
        //논리형
        System.out.println(true);
        System.out.println(false);
    }
}
