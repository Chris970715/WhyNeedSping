package hello.core.order;

import hello.core.Discount.FixedDiscoundPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;

public class AppConfig {

    public MemberService memberService () {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService () {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixedDiscoundPolicy());
    }
}
