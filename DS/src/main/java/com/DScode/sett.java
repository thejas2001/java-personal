package com.DScode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class sett {
    public static void main(String[] args) {
        Set<colour> settt=new HashSet<>();
        //HAshmap - no order
        settt.add(new colour("red"));
        settt.add(new colour("yellow"));
        settt.add(new colour("blue"));
        settt.forEach(System.out::println);
        Set<Colours> sett=new TreeSet<>();
        //Treemap in ascending ore=der(comperable)
        sett.add(new Colours("red"));
        sett.add(new Colours("yellow"));
        sett.add(new Colours("blue"));
        sett.add(new Colours("red"));
        sett.forEach(System.out::println);
    }
    record colour(String name){}
    public static class Colours implements Comparable<Colours>{
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Colours(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Colours{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Colours colours = (Colours) o;
            return Objects.equals(name, colours.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }

        private String name;

        @Override
        public int compareTo(Colours o) {
            return this.name.compareTo(o.getName());
        }
    }
}
