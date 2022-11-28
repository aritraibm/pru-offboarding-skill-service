package com.pru.offboarding.skill.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pru.offboarding.skill.service.entity.Skill;
import com.pru.offboarding.skill.service.repo.SkillRepo;
import com.pru.offboarding.skill.service.service.SkillService;

@Service
public class SkillServiceImpl implements SkillService {
	
	@Autowired
	private SkillRepo skillRepo;

	@Override
	public List<Skill> getSkillMaster() {
		
		return skillRepo.findAll();
	}

	

}
