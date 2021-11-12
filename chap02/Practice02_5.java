package chap02;

import java.util.*;

public class Practice02_5{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String ex = s.nextLine();
        String upex = ex.toUpperCase();

        System.err.println(upex);

        s.close();
    }
}