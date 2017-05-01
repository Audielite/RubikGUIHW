package com.lex;

/**
 * Created by alexishennings on 4/30/17.
 */
public class Solvers {
    private String solvers;
    //private String time;

    public Solvers(String solvers) {
        this.solvers = solvers;
        //this.time = time;

    }

    public Solvers() {

    }

    @Override
        public String toString () {

            return "Name: " + solvers;

        }

         public static class Time extends Solvers{
            private String time;

            public Time(String time) {
                super();
                this.time = time;
            }

            @Override
            public String toString() {

                return "Time: " + time;

            }
        }
    }