package org.ei.drishti.domain.register;

import org.junit.Before;
import org.junit.Test;

public class FPRegister_Test {
	
	private FPRegister fpRegister;
	
	@Before
	public void setUp(){
		fpRegister = new FPRegister(null, null, null, null, null, null);
	}
	
	@Test
	public void iudRegisterEntries_Test(){
		fpRegister.iudRegisterEntries();
	}
	
	@Test
	public void condomRegisterEntries_Test(){
		fpRegister.condomRegisterEntries();
	}
	
	@Test
	public void ocpRegisterEntries_Test(){
		fpRegister.ocpRegisterEntries();
	}
	
	@Test
	public void maleSterilizationRegisterEntries_Test(){
		fpRegister.maleSterilizationRegisterEntries();
	}
	
	@Test
	public void femaleSterilizationRegisterEntries_Test(){
		fpRegister.femaleSterilizationRegisterEntries();
	}
	
	@Test
	public void getReportingYear_Test(){
		fpRegister.getReportingYear();
	}
	
	@Test
	public void hashCode_Test(){
		fpRegister.hashCode();
	}
	
	@Test
	public void toString_Test(){
		fpRegister.toString();
	}

}
