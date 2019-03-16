package com.bugbean.tinkinginjavademo.chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-15 0:34
 */
public class Practice27 {
    public static void main(String[] args) {
        Filler filler = new Filler();
        Queue<Command> commandQueue = filler.fill();
        while (commandQueue.peek() != null) {
            Command command = commandQueue.remove();
            command.operation();
        }
    }
}

class Command {
    private String s;

    public Command(String s) {
        this.s = s;
    }

    public void operation() {
        System.out.println(s);
    }
}

class Filler {
    public Queue<Command> fill() {
        Random random = new Random(50);
        Queue<Command> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(new Command(String.valueOf(random.nextInt())));
        }

        return queue;
    }
}
