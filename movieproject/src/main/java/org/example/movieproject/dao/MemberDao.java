package org.example.movieproject.dao;

import org.example.movieproject.model.Member;

public interface MemberDao {

    Member getMemberByEmail(String email);

}
