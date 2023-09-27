package Fit;

import Fit.Member;

public class SingleClassMember extends Member {
    private int Club;

    public SingleClassMember(char memberType, int memberID, String name, double fees) {
        super(memberType, memberID, name, fees);
    }

    public SingleClassMember(char memberType, int memberID, String name, double fees, int club) {
        super(memberType, memberID, name, fees);
        Club = club;
    }

    @Override
    public String toString() {
        System.out.println("CLub " + Club);
        return null;

    }

    public void setClub(int club) {
        Club = club;
    }

    public int getClub() {
        return Club;
    }
}