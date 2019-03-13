package com.bugbean.tinkinginjavademo.chapter10;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-06 20:27
 */
public class Practice2 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(3);
        sequence.add(new StringViewer("1"));
        sequence.add(new StringViewer("2"));
        sequence.add(new StringViewer("3"));

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

class StringViewer {
    private String s;

    public StringViewer(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public Sequence getSequence() {
            return Sequence.this;
        }

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

}
