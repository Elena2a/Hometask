package ru.tsystems.autotest;

public class Image extends Media {
        @Override
        public int getMaxSize() {
            System.out.println("10");
            return 0;
        }



        private String doc;
        private String message;

        Image(String doc) {
            this.doc = doc;
        }


        public void print(String message) {
            System.out.println("print");


        }

    }
