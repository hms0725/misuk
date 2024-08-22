package com.oracle.oBootjpaApi01.repository;

import java.util.List;

import com.oracle.oBootjpaApi01.domain.Member;

public interface MemberRepository {
	Long 			save(Member member);
	List<Member> 	findAll();
	Member 			findByMember(Long memberId);
	int 			updateByMember(Member member);

}
