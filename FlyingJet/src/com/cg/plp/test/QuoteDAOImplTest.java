package com.cg.plp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.plp.bean.AccountCreationBean;
import com.cg.plp.bean.DetailedReportBean;
import com.cg.plp.bean.PolicyBean;
import com.cg.plp.bean.PolicyQuestions;
import com.cg.plp.bean.ReportGeneration;
import com.cg.plp.bean.UserLoginBean;

class QuoteDAOImplTest {

	@Test
	void testCheckValidLogin() {
		UserLoginBean userLogin=new UserLoginBean();
		userLogin.setLoginId("admin");
		userLogin.setPassword("password");
		userLogin.setRoleCode(1234);
	}

	@Test
	void testProfileCreation() {
		UserLoginBean userLoginBean=new UserLoginBean();
		userLoginBean.setLoginId("agent");
		userLoginBean.setPassword("agent");
		userLoginBean.setRoleCode(31254);
	}

	@Test
	void testAccountCreation() {
		AccountCreationBean accountCreationBean=new AccountCreationBean();
		accountCreationBean.setAccountNo(121);
		accountCreationBean.setBusinessSegment("Vehicle");
		accountCreationBean.setInsuredCity("Hyderabad");
		accountCreationBean.setInsuredName("Dinesh");
		accountCreationBean.setInsuredState("Telengana");
		accountCreationBean.setInsuredStreet("Lbnagar");
		accountCreationBean.setInsuredZip(12134);
		accountCreationBean.setPremium(1234);
		accountCreationBean.setUsername("Dinesh");
		
	}

	@Test
	void testPolicyCreation() {
		
	}

	@Test
	void testRetrieveAll() {
		PolicyQuestions policyQuestions=new PolicyQuestions();
		policyQuestions.setAns1("1");
		policyQuestions.setAns2("2");
		policyQuestions.setAns3("3");
		policyQuestions.setAns4("4");
		policyQuestions.setBusSegId("321");
		policyQuestions.setPol_Ques_Ans1_weightage(132);
		policyQuestions.setPol_Ques_Ans2_weightage(3213);
		policyQuestions.setPol_Ques_Ans3_weightage(312);
		policyQuestions.setPol_Ques_Ans4_weightage(132);
		policyQuestions.setQuesId(132);
	}

	@Test
	void testGetMyPolicies() {
		PolicyBean policyBean=new PolicyBean();
		policyBean.getAccountNumber();
		policyBean.getPolicyNumber();
		policyBean.getPolicyPremium();
	}

	@Test
	void testGetMyCustomerPolicies() {
		PolicyBean policyBean=new PolicyBean();
		policyBean.getAccountNumber();
		policyBean.getPolicyNumber();
		policyBean.getPolicyPremium();
	}

	@Test
	void testGetQuestions() {
		PolicyQuestions policyQuestion=new PolicyQuestions();
		policyQuestion.getAns1();
		policyQuestion.getAns2();
		policyQuestion.getAns3();
		policyQuestion.getAns4();
		policyQuestion.getBusSegId();
		policyQuestion.getPol_Ques_Ans1_weightage();
		policyQuestion.getPol_Ques_Ans2_weightage();
		policyQuestion.getPol_Ques_Ans3_weightage();
		policyQuestion.getPol_Ques_Ans4_weightage();
		policyQuestion.getQuesDesc();
		policyQuestion.getQuesId();
	}

	@Test
	void testSetPremium() {
		
	}

	@Test
	void testProcessRequest() {
		
	}

	@Test
	void testGenerateReport() {
		ReportGeneration reportGeneration=new ReportGeneration();
		reportGeneration.getAccountNumber();
		reportGeneration.getPolicyNumber();
		reportGeneration.getPolicyPremium();
		reportGeneration.getSerialNo();
	}

	@Test
	void testGetDetailedreport() {
		DetailedReportBean detailedReported=new DetailedReportBean();
		detailedReported.getBusinessSegment();
		detailedReported.getCoverage1();
		detailedReported.getCoverage2();
		detailedReported.getCoverage3();
		detailedReported.getCoverage4();
		detailedReported.getInsuredCity();
		detailedReported.getInsuredName();
		detailedReported.getInsuredState();
		detailedReported.getInsuredStreet();
		detailedReported.getInsuredZip();
		detailedReported.getPremiumAmount();
		detailedReported.getQuesDesc1();
		detailedReported.getQuesDesc2();
		detailedReported.getQuesDesc3();
		detailedReported.getQuesDesc4();
	}

}
