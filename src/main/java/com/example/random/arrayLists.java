package com.example.random;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class arrayLists {

    List<String> evenList;
    List<String> oddList;

    public arrayLists() {
        evenList = new ArrayList<>();
        oddList = new ArrayList<>();
    }

    public void separeteQueues(Deque<String> theQueue) {

        while(theQueue.size() > 0) {
            String theTask = theQueue.poll();
            System.out.println("Processing the task: " + theTask);
            if (theTask.length() % 2 == 0) {
                evenList.add(theTask);
                System.out.println("here we store even objects " + evenList.size());
            }
            else {
                oddList.add(theTask);
                System.out.println("here we store odd objects " + oddList.size());
            }
        }
    }
}