package com.pru.offboarding.skill.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.pru.offboarding.skill.service.entity.Skill;
import com.pru.offboarding.skill.service.repo.SkillRepo;
import com.pru.offboarding.skill.service.serviceImpl.SkillServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;


@SpringBootTest
class SkillServiceImplTest{

	@InjectMocks
	SkillServiceImpl skillServiceImpl;

	@Mock
	SkillRepo skillRepo;


	@Test
	public void getSkillMaster() {
		
		List<Skill> wrapperList= new ArrayList<>();
		Skill as1= new Skill("15L", "Java", "Active");
		Skill as2= new Skill("16L", "Angular", "Inactive");
		wrapperList.add(as1);
		wrapperList.add(as2);
		
		when(skillRepo.findAll()).thenReturn(wrapperList);

		List<Skill> assList = skillServiceImpl.getSkillMaster();

		assertEquals(2, assList.size());
		assertEquals("Java", assList.get(0).getSkillName());
		assertNotEquals("Inactive", assList.get(0).getStatus());
		assertEquals("Inactive", assList.get(1).getStatus());
	}

}
