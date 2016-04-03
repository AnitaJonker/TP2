package factories.membersFactory.impl;

import factories.membersFactory.MemberFactory;
import members.MemberDetails;
import members.impl.Member;

/**
 * Created by student on 2016/04/02.
 */
public class UseMemberFactory implements MemberFactory {

    public MemberDetails getMember() {
        return new Member().registerMember();
    }





}

