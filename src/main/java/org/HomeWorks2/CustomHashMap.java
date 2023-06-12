package org.HomeWorks2;

import java.util.Objects;

public class CustomHashMap {
    private static final int DEFAULT_CAPACITY = 16;
    private Node[] table;
    private int size;

    public CustomHashMap() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public Object put(Integer key, Integer value) {
        int hash = hash(key);
        int index = getIndex(hash);

        Node newNode = new Node(key, value, hash, null);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    Object oldValue = current.value;
                    current.value = value;
                    return oldValue;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                Object oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current.next = newNode;
        }
        size++;
        return null;
    }

    public Object get(Integer key) {
        int hash = hash(key);
        int index = getIndex(hash);

        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public Object remove(Integer key) {
        int hash = hash(key);
        int index = getIndex(hash);

        Node current = table[index];
        Node previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return current.value;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    public Object replace(Integer key, Integer value) {
        int hash = hash(key);
        int index = getIndex(hash);

        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                Object oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean containsKey(Integer key) {
        int hash = hash(key);
        int index = getIndex(hash);

        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean containsValue(Integer value) {
        for (int i = 0; i < table.length; i++) {
            Node current = table[i];
            while (current != null) {
                if (Objects.equals(current.value, value)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    private int hash(Integer key) {
        return Objects.hashCode(key);
    }

    private int getIndex(int hash) {
        return hash % table.length;
    }

    private static class Node {
        Integer key;
        Integer value;
        int hash;
        Node next;

        public Node(Integer key, Integer value, int hash, Node next) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }
    }
}

