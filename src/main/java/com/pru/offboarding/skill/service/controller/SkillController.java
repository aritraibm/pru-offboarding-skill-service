package com.pru.offboarding.skill.service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.pru.offboarding.associate.service.VO.AssociateWithSkillTemplateVO;
import com.pru.offboarding.skill.service.entity.AssociateSkill;
import com.pru.offboarding.skill.service.entity.Skill;
import com.pru.offboarding.skill.service.service.AssociateSkillService;
import com.pru.offboarding.skill.service.service.SkillService;

@RestController
@RequestMapping(value = "/pru-skill")
public class SkillController {
	
	@Autowired
	private SkillService skillService;
	
	@Autowired
	private AssociateSkillService associateSkillService;
	
	final Logger logger= LoggerFactory.getLogger(SkillController.class);
	
	@PreAuthorize("hasAnyRole({'ROLE_ASSOCIATE','ROLE_OFFBOARDING_REVIEWER','ROLE_OFFBOARDING_MANAGER'})")
	@GetMapping(value = "/get-skill-master")
	public List<Skill> saveUser() {
		
		return skillService.getSkillMaster();
	}

	@PreAuthorize("hasAnyRole({'ROLE_ASSOCIATE','ROLE_OFFBOARDING_REVIEWER','ROLE_OFFBOARDING_MANAGER'})")
	@GetMapping(value = "/get-skill/{associateId}")
	public List<AssociateSkill> getAssociateWithSkillDetails(@PathVariable String associateId) {
		
		return associateSkillService.getAssociateSkillDetails(associateId);
	}
	
	
	@PreAuthorize("hasAnyRole({'ROLE_ASSOCIATE','ROLE_OFFBOARDING_REVIEWER','ROLE_OFFBOARDING_MANAGER'})")
	@PostMapping(value = "/add-skill-master")
	public Skill saveSkill(@RequestBody Skill skillData) {
		return skillService.saveSkill(skillData);
	}
	
//	@PostMapping(value = "/save-associate")
//	@PreAuthorize("hasAnyRole({'ROLE_ONBOARDING_REVIEWER','ROLE_ONBOARDING_MANAGER'})")
//	public AssociateWithSkillTemplateVO saveUser(@RequestBody AssociateWithSkillTemplateVO formData) {
//		// System.out.println(":::::::: >>>>>>"+formData);
//		return associateService.saveAssociateDetails(formData);
//	}


}
