package ru.tsystems.autotest;


    public class TextWriting extends AbstractClass implements IPrinter {


        @Override
        public int getMaxSize() {
            System.out.println("10");

            return 0;
        }




        private String doc;
        private String message;

        public void print(String message) {
            System.out.println("print");
        }




            }









