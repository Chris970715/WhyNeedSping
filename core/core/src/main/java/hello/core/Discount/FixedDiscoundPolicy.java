package hello.core.Discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixedDiscoundPolicy implements DiscountPolicy{

    private int discountFixedAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP)
        {
            return discountFixedAmount;
        }
        else {
            return 0;
        }
    }
}
