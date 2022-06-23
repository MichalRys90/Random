package com.example.random;
import java.util.*;

public class RandomGenerator {
    private static final char A = 'a';
    public static void main(String[] args) {

        Deque<String> randomLength = new ArrayDeque<>();
        Random theGeneratorForLength = new Random();
        for (int n = 0; n < 50; n++) {
            int length = theGeneratorForLength.nextInt(50);
            char[] chars = new char[length+1];
            Arrays.fill(chars, A);
            String randomWord = new String(chars);
            randomLength.offer(randomWord);
        }
        System.out.println("Objects : " + randomLength);
        System.out.println(randomLength.size());

        arrayLists queues = new arrayLists();
        queues.separeteQueues(randomLength);

        System.out.println(" All even objects = " + queues.evenList.size());
        System.out.println(" All odds objects = " + queues.oddList.size());
    }

}