package com.example.sean;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access= AccessLevel.PROTECTED) // 2. 기본 생성자
@AllArgsConstructor
@Getter
@Entity // 1. entity 지정
public class Member {
    @Id // 3. id 필드 기본키 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 4. 기본키 자동으로 1씩 증가
    @Column(name="id", updatable=false)
    private Long id; // db table id column 과 매칭

    @Column(name="name", nullable=false) // 5. name 이라는 not null 컬럼과 매핑
    private String name; // db table name column 과 매칭
}
