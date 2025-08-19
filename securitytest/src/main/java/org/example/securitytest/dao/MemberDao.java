package org.example.securitytest.dao;

import org.example.securitytest.model.Member;
import org.example.securitytest.model.Role;

import java.util.List;

public interface MemberDao {
    Member getMemberById(Integer memberId);

    Member getMemberByEmail(String email);

    Integer createMember(Member member);

    List<Role> getRolesByMemberId(Integer memberId);
}
