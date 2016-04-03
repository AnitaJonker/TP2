package members.impl;

import members.MemberDetails;
import members.RegisterMember;

/**
 * Created by student on 2016/03/31.
 */
public class Member implements RegisterMember
{
    public MemberDetails registerMember()
    {
        MemberDetails member = new MemberDetails.Builder()
                .name("Anita")
                .surname("Jonker")
                .address("Almeria str4")
                .address("Gotham 87")
                .libraryBranch("Durbanville")
                .cardNumber("0N12586331")
                .build();
        return member;



    }

}
