package ru.tsystems.autotest;



    abstract class AbstractClass {
        String Author;
        String Date;
        String Message;

        void printString(String string) {
            System.out.println(string);
        }

        public int maxSize;
        void Type (int maxSize) {
            this.maxSize = maxSize;
        } public int getMaxSize() {
            return maxSize;
        }

    }






