package com.spring.practice.member;

import java.util.Date;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Member {
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id; 
	 
	@Column(name = "name" , nullable = true) // notNull 
	 private String username; 
	 private Integer age; 
	 
	 @Enumerated(EnumType.STRING) 
	 private RoleType roleType; 
	 
	 @Temporal(TemporalType.TIMESTAMP) 
	 private Date createdDate; 
	 
	 @Temporal(TemporalType.TIMESTAMP) 
	 private Date lastModifiedDate; 
	 
	 @Lob 
	 private String description;
	
	
}
