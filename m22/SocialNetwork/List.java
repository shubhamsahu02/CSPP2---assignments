import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
public class List<E> {
    private E[] list;
    private int size;
    public List() {
        list = ((E[])new Object[50]);
        size = 0;
    }
    public List(int param) {
        list = ((E[])new Object[param]);
        size = 0;
    }
    public void add(E item) {
        list[(size++)] = item;
    }
    public void addAll(E[] items) {
        if ((size() + items.length) > 50) {
            resize();
        }
        int j = 0;
        for (int i = size; i < (size + items.length); i++) {
            list[i] = items[j];
            j++;
        }
        size = size + items.length;
    }
    private void resize() {
        list = Arrays.copyOf(list, 2 * list.length);
    }
    public int size() {
        return size;
    }
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for(int i = index; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            size--;
        } else {
            System.out.println("Invalid Position Exception");
        }
    }
    public E get(int index) {
        if (index < 0) {
            return null;
        } else {
            return list[index];
    }
}
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String str = "[";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + list[i] + ", ";
        }
        str = str + list[i] + "]";
        return str;
    }
    public boolean contains(E item) {
        return indexOf(item) != -1;
    }
    public int indexOf(E item) {
        for (int i = 0; i < size; i++) {
            if (item.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }
}