package task07.task0723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

/*
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread mainThread = Thread.currentThread();
        for (int i = 30; i>=0; i--){
            mainThread.sleep(100);
            System.out.println(i);
        }
        System.out.println("Бум!");
    }

}
