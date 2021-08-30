package com.company;

public class Main {

    public static void main(String[] args) {
	    for(TirePressure tp: TirePressure.values()) {
            System.out.println(tp);
        }

        for(TirePressure tp: TirePressure.values()) {
            System.out.format("%s is %d pounds %n", tp.getName(), tp.getPressure());
        }

        TirePressure tp = TirePressure.valueOf("RR");
        tp.overridrPresure(22);

        for(TirePressure tpp: TirePressure.values()) {
            System.out.format("%s is %d pounds %n", tpp.getName(), tpp.getPressure());
        }

        for(State st: State.values()) {
            System.out.format("State %s has capital %s%n", st.getState(), st.getCity());
        }

    }
}
