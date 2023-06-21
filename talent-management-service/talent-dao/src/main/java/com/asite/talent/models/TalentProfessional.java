package com.asite.talent.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "talent_professional")
public class TalentProfessional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid")
	private int pid;
	
	@Column
	private String occupation;
	
	@Column
	private String pro_background;
	
	@Column
	private String industry;
	
	@Column
	private String experience;
	
	@Column
	private String skills;
	
	@Column(name = "current_employer")
	private String currentEmployer;
	
	@Column(name = "linkedin_url")
	private String linkedinURL;
	
	@Column(name = "profile_url")
	private String profileURL;
	
	@Column(name = "is_active")
	private int isActive;
	
	@Column(name = "created_date")
	private String createdDate;
	
	@Column(name = "updated_date")
	private String updatedDate;
}
