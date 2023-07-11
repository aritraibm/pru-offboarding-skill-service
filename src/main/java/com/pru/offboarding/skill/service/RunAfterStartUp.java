package com.pru.offboarding.skill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.pru.offboarding.skill.service.entity.Skill;
import com.pru.offboarding.skill.service.repo.SkillRepo;



@Component
public class RunAfterStartUp {
	
	@Autowired
	private SkillRepo skillRepo;
	
	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		if(skillRepo.findAll().isEmpty()) {
			skillRepo.save(new Skill(".Net VB/C#","Active"));
			skillRepo.save(new Skill("Bootstrap","Active"));
			skillRepo.save(new Skill("COBOL","Active"));
			skillRepo.save(new Skill("Gradle","Active"));
			skillRepo.save(new Skill("HTML","Active"));
			skillRepo.save(new Skill("Microsoft Office - Excel","Active"));
			skillRepo.save(new Skill("SQL Server","Active"));
			skillRepo.save(new Skill("Type Script/ Web Components","Active"));
			skillRepo.save(new Skill("Retirement","Active"));
			skillRepo.save(new Skill("Communication Skills","Active"));
			skillRepo.save(new Skill("Escalation management","Active"));
			skillRepo.save(new Skill("Interpersonal Skills","Active"));
			skillRepo.save(new Skill("Test Automation","Active"));
			skillRepo.save(new Skill("Test strategy","Active"));
			skillRepo.save(new Skill("Testing","Active"));
			skillRepo.save(new Skill("Design Patterns","Active"));
			skillRepo.save(new Skill("Docker","Active"));
			skillRepo.save(new Skill("Jquery","Active"));
			skillRepo.save(new Skill("Microsoft Office - Word","Active"));
			skillRepo.save(new Skill("Oracle/SQL Server Databases","Active"));
			skillRepo.save(new Skill("Application Logs / Debugging ","Active"));
			skillRepo.save(new Skill("Negotiating skills","Active"));
			skillRepo.save(new Skill("Team building","Active"));
			skillRepo.save(new Skill("ESB","Active"));
			skillRepo.save(new Skill("HTML 5","Active"));
			skillRepo.save(new Skill("MQ Series","Active"));
			skillRepo.save(new Skill("NODE JS","Active"));
			skillRepo.save(new Skill("SAML","Active"));
			skillRepo.save(new Skill("SalesForce","Active"));
			skillRepo.save(new Skill("Struts","Active"));
			skillRepo.save(new Skill("Visual Basic","Active"));
			skillRepo.save(new Skill("WAS","Active"));
			skillRepo.save(new Skill("Income Flex Calculator","Active"));
			skillRepo.save(new Skill("Agile Cert - Certified Scrum Master","Active"));
			skillRepo.save(new Skill("Ethical Behavior","Active"));
			skillRepo.save(new Skill("IT Risk assessment","Active"));
			skillRepo.save(new Skill("Problem Solving","Active"));
			skillRepo.save(new Skill("ACME","Active"));
			skillRepo.save(new Skill("AJAX","Active"));
			skillRepo.save(new Skill("C","Active"));
			skillRepo.save(new Skill("HADOOP","Active"));
			skillRepo.save(new Skill("Web 2.0 Technologies","Active"));
			skillRepo.save(new Skill("XML","Active"));
			skillRepo.save(new Skill("Ability to communicate process improvement to all levels","Active"));
			skillRepo.save(new Skill("Degree - Computer Science","Active"));
			skillRepo.save(new Skill("Facilitation skills","Active"));
			skillRepo.save(new Skill("Multi Tasking","Active"));
			skillRepo.save(new Skill("React JS","Active"));
			skillRepo.save(new Skill("Architecture","Active"));
			skillRepo.save(new Skill("Java","Active"));
			skillRepo.save(new Skill("Microsoft Office - Powerpoint","Active"));
			skillRepo.save(new Skill("Solution Architecture","Active"));
			skillRepo.save(new Skill("SOAPUI","Active"));
			skillRepo.save(new Skill("Web Accessibility","Active"));
			skillRepo.save(new Skill("Automating processes","Active"));
			skillRepo.save(new Skill("Agile Automation","Active"));
			skillRepo.save(new Skill("NQ Plan Sponsor","Active"));
			skillRepo.save(new Skill("Plan Sponsor Reporting","Active"));
			skillRepo.save(new Skill("Customer Service","Active"));
			skillRepo.save(new Skill("Decision Making","Active"));
			skillRepo.save(new Skill("Meetings Planning","Active"));
			skillRepo.save(new Skill("Testing Automation","Active"));
			skillRepo.save(new Skill("COGNOS SDK","Active"));
			skillRepo.save(new Skill("DB2 - stored procedure","Active"));
			skillRepo.save(new Skill("J2EE","Active"));
			skillRepo.save(new Skill("Javascript","Active"));
			skillRepo.save(new Skill("MS Access","Active"));
			skillRepo.save(new Skill("Service Oriented Architecture","Active"));
			skillRepo.save(new Skill("Collaboration Skills","Active"));
			skillRepo.save(new Skill("Effective Listening Skills","Active"));
			skillRepo.save(new Skill("Effective Verbal Communication","Active"));
			skillRepo.save(new Skill("Test case development","Active"));
			skillRepo.save(new Skill("GitHub","Active"));
			skillRepo.save(new Skill("JSON","Active"));
			skillRepo.save(new Skill("Unix","Active"));
			skillRepo.save(new Skill("Web Content","Active"));
			skillRepo.save(new Skill("WebMethods","Active"));
			skillRepo.save(new Skill("Call Center Client Fact Sheet","Active"));
			skillRepo.save(new Skill("Income Flex 3rd party - Brokerage","Active"));
			skillRepo.save(new Skill("PruForce.com","Active"));
			skillRepo.save(new Skill("Change control process","Active"));
			skillRepo.save(new Skill("Development Processes","Active"));
			skillRepo.save(new Skill("Information Seeking","Active"));
			skillRepo.save(new Skill("Requirements Management","Active"));
			skillRepo.save(new Skill("SOAPUI","Active"));
			skillRepo.save(new Skill("Test validation on data fixes","Active"));
			skillRepo.save(new Skill("ALM","Active"));
			skillRepo.save(new Skill("Autosys - Unix","Active"));
			skillRepo.save(new Skill("DB2 - mainframe","Active"));
			skillRepo.save(new Skill("JDBC","Active"));
			skillRepo.save(new Skill("PVCS","Active"));
			skillRepo.save(new Skill("RDBMS skills","Active"));
			skillRepo.save(new Skill("WebSeal, TAM, API","Active"));
			skillRepo.save(new Skill("Javascript","Active"));
			skillRepo.save(new Skill("Passport","Active"));
			skillRepo.save(new Skill("Web Tools - PPR","Active"));
			skillRepo.save(new Skill("Agile Delivery","Active"));
			skillRepo.save(new Skill("Organizational skills","Active"));
			skillRepo.save(new Skill("Resilient","Active"));
			skillRepo.save(new Skill("Tech Lead","Active"));
			skillRepo.save(new Skill("Selenium","Active"));
			skillRepo.save(new Skill("Testing Web Based Applications","Active"));
			skillRepo.save(new Skill("Adobe Flex","Active"));
			skillRepo.save(new Skill("AIX/Unix","Active"));
			skillRepo.save(new Skill("CRM (Customer Relationship Management) - Sales Force.com","Active"));
			skillRepo.save(new Skill("Hibernate","Active"));
			skillRepo.save(new Skill("Websphere","Active"));
			skillRepo.save(new Skill("Insurance","Active"));
			skillRepo.save(new Skill("Intranet - Prudential Retirement","Active"));
			skillRepo.save(new Skill("Agile Facilitator","Active"));
			skillRepo.save(new Skill("Architecture","Active"));
			skillRepo.save(new Skill("Budgeting skills","Active"));
			skillRepo.save(new Skill("Drive for Results","Active"));
			skillRepo.save(new Skill("Effective Communication Skills","Active"));
			skillRepo.save(new Skill("Listening Skills","Active"));
			skillRepo.save(new Skill("Requirements Elicitation","Active"));
			skillRepo.save(new Skill("Test Data Management","Active"));
			skillRepo.save(new Skill("Testing Web Services","Active"));
			skillRepo.save(new Skill("DB2","Active"));
			skillRepo.save(new Skill("Webservice","Active"));
			skillRepo.save(new Skill("Cultural Awareness","Active"));
			skillRepo.save(new Skill("Effective Written Communication","Active"));
			skillRepo.save(new Skill("EPIC","Active"));
			skillRepo.save(new Skill("PHP","Active"));
			skillRepo.save(new Skill("Tiles","Active"));
			skillRepo.save(new Skill("TOAD","Active"));
			skillRepo.save(new Skill("UI design","Active"));
			skillRepo.save(new Skill("WCM Content authoring model","Active"));
			skillRepo.save(new Skill("IVR","Active"));
			skillRepo.save(new Skill("Prudential Workplace","Active"));
			skillRepo.save(new Skill("Analytical Skills","Active"));
			skillRepo.save(new Skill("Business User Interaction","Active"));
			skillRepo.save(new Skill("Business/Functional Requirements Development","Active"));
			skillRepo.save(new Skill("Managing People","Active"));
			skillRepo.save(new Skill("Overall Process Adherence","Active"));
			skillRepo.save(new Skill("Requirements Analysis","Active"));
			skillRepo.save(new Skill("Technical Documentation","Active"));
			skillRepo.save(new Skill("HP Exstream","Active"));
			skillRepo.save(new Skill("Core Java","Active"));
			skillRepo.save(new Skill("Portal Developer","Active"));
			skillRepo.save(new Skill("SalesForce Lightning","Active"));
			skillRepo.save(new Skill("SQL Server Stored procedure","Active"));
			skillRepo.save(new Skill("Internet - Sales site","Active"));
			skillRepo.save(new Skill("Unit Value (eProvider)","Active"));
			skillRepo.save(new Skill("Confidence","Active"));
			skillRepo.save(new Skill("Estimation Methodologies","Active"));
			skillRepo.save(new Skill("Jenkins","Active"));
			skillRepo.save(new Skill("Build (Maven, ANT, Jenkins)","Active"));
			skillRepo.save(new Skill("Jboss","Active"));
			skillRepo.save(new Skill("Microservices / Springboot","Active"));
			skillRepo.save(new Skill("EPIC Resource Planning","Active"));
			skillRepo.save(new Skill("Internet - Sponsor Site","Active"));
			skillRepo.save(new Skill("Pega Services","Active"));
			skillRepo.save(new Skill("PPR - Prudential Performance Repository","Active"));
			skillRepo.save(new Skill("Beyond Compare","Active"));
			skillRepo.save(new Skill("Commitment/Work Ethic","Active"));
			skillRepo.save(new Skill("Data analysis and queries","Active"));
			skillRepo.save(new Skill("JAVA Runtime (JRE)","Active"));
			skillRepo.save(new Skill("Kubernetes","Active"));
			skillRepo.save(new Skill("Oracle","Active"));
			skillRepo.save(new Skill("RAD","Active"));
			skillRepo.save(new Skill("SQL","Active"));
			skillRepo.save(new Skill("Webservices &amp; API","Active"));
			skillRepo.save(new Skill("Income Flex","Active"));
			skillRepo.save(new Skill("RSC (eGAPF)","Active"));
			skillRepo.save(new Skill("Agile Dev Ops","Active"));
			skillRepo.save(new Skill("Code Quality","Active"));
			skillRepo.save(new Skill("Email Etiquette","Active"));
			skillRepo.save(new Skill("Estimation process","Active"));
			skillRepo.save(new Skill("Language - Hindi","Active"));
			skillRepo.save(new Skill("Risk Management","Active"));
			skillRepo.save(new Skill("Agile Testing","Active"));
			skillRepo.save(new Skill("Autosys","Active"));
			skillRepo.save(new Skill("Angular JS","Active"));
			skillRepo.save(new Skill("Angular 4+","Active"));
			skillRepo.save(new Skill("AWS","Active"));
			skillRepo.save(new Skill("C++","Active"));
			skillRepo.save(new Skill("CSS (Cascading Style Sheets)","Active"));
			skillRepo.save(new Skill("JIRA","Active"));
			skillRepo.save(new Skill("ODS","Active"));
			skillRepo.save(new Skill("Websphere Portal Server","Active"));
			skillRepo.save(new Skill("Agile Project Management","Active"));
			skillRepo.save(new Skill("Effective Decision Making","Active"));
			skillRepo.save(new Skill("Mentoring skills","Active"));
			skillRepo.save(new Skill("Methodical/Analytical","Active"));
			skillRepo.save(new Skill("Project management","Active"));
			skillRepo.save(new Skill("DB2v10","Active"));
			skillRepo.save(new Skill("Eclipse","Active"));
			skillRepo.save(new Skill("JSP","Active"));
			skillRepo.save(new Skill("Microsoft Office - Visio","Active"));
			skillRepo.save(new Skill("Python","Active"));
			skillRepo.save(new Skill("Soap","Active"));
			skillRepo.save(new Skill("TopLink","Active"));
			skillRepo.save(new Skill("AIX/UNIX","Active"));
			skillRepo.save(new Skill("Internet - Participant Site","Active"));
			skillRepo.save(new Skill("Business Analyst","Active"));
			skillRepo.save(new Skill("Leadership Skills","Active"));
			skillRepo.save(new Skill("Research Skills","Active"));
			skillRepo.save(new Skill("Status","Active"));
			System.out.println("Skills created......");
		}
	}

}
