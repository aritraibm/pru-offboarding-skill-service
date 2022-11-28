package com.pru.offboarding.skill.service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "AssociateSkills")
public class AssociateSkill {

	@Id
	private String associateSkillId;
    private String associateId;
    private String skillId;
    private String skillRating;
    
}
