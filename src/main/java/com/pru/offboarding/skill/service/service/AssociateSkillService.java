package com.pru.offboarding.skill.service.service;

import java.util.List;

import com.pru.offboarding.skill.service.entity.AssociateSkill;

public interface AssociateSkillService {

	List<AssociateSkill> getAssociateSkillDetails(String associateId);

	
}
