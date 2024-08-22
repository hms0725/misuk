package com.oracle.oBootjpaApi01.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@SequenceGenerator(
			name="member_seq_gen5",
			sequenceName = "member_seq_generator5",
			initialValue = 1,
			allocationSize = 1		
		)
@Table(name = "member5")
//1.Sequence
//	1) 객체 nm(이름): member_seq_gen5
//	2) DB nm : member_seq_generator5
//	3) 초기 -> 1, 할당 ->1씩증가

public class Member {
	//PK : member_seq_gen5, nm : member_id
	@Id
	@GeneratedValue(
				strategy = GenerationType.SEQUENCE,
				generator = "member_seq_gen5"
			)
	@Column(name="member_id")
	private long id;

	
	@NotEmpty
	// nm : userName
	@Column(name="userName")
	private String name;
	private long sal;
	
	@ManyToOne
	@JoinColumn(name="team_id")
	private Team team; //연관관계 맺는 거
	
	

}
