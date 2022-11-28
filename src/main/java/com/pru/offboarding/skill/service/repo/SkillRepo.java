package com.pru.offboarding.skill.service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pru.offboarding.skill.service.entity.Skill;

@Repository
public interface SkillRepo extends MongoRepository<Skill, String> {

	
}
