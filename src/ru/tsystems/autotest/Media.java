package ru.tsystems.autotest;

    public class Media extends AbstractClass implements IPrinter, IPlayer {


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

           public void play (String doc){
                System.out.println("play");


            }

            class Image extends Media {
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

                class Audio extends Media {
                    @Override
                    public int getMaxSize() {
                        System.out.println("10");

                        String doc;
                        String message;
                        return 0;
                    }

                        public void play (String doc){
                            System.out.println("play");


                        }

                        class Video extends Media {
                            @Override
                            public int getMaxSize() {
                                System.out.println("10");
                                return 0;
                            }

                            private String doc;
                            private String message;

                            public void play(String doc) {
                                System.out.println("play");
                            }

                        }
                    }
                }



        }












