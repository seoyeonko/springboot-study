package com.example.sean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 해당 인터페이스의 역할
// - db에서 데이터를 가져오는 퍼시스턴트 계층 역할
// - member 테이블에 접근해 Member 클래스에 매핑하는 구현체
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}