package ru.geekbrains.ntr_ads02.arrayscollection;

public interface Array<E> {

        void add (E value);

        void add(int index, E value);

        E get ( int index);

        boolean remove (E value);

        E remove ( int index);

        int removeAll (E value);

        int indexOf (E value);

        int lastIndexOf (E value);

        boolean contains (E value);

        boolean isEmpty ();

        int size ();

        void display ();

        void sortBubble ();
        void sortSelect ();
        void sortInsert ();
    }
