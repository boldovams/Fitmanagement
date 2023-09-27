package Fit;

import Fit.Member;

public class MultiClassMember extends Member {
    private int membershipPoints;

    public MultiClassMember(char memberType, int memberID, String name, double fees, int membershipPoints) {
        super(memberType, memberID, name, fees);
    }

    public void setMembershipPoints(int membershipPoints) {
        this.membershipPoints = membershipPoints;
    }

    public int getMembershipPoints() {
        return membershipPoints;
    }

    @Override
    public String toString() {
        System.out.println("Membership-points "+ membershipPoints);
        return null;


    }
}

