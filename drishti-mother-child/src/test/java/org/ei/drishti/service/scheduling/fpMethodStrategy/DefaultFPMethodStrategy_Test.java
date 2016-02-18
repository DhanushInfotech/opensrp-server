package org.ei.drishti.service.scheduling.fpMethodStrategy;

import org.ei.drishti.domain.FPProductInformation;
import org.junit.Before;
import org.junit.Test;

public class DefaultFPMethodStrategy_Test {
	
	private DefaultFPMethodStrategy defaultFPMethodStrategy;
	
	@Before
	public void setUp(){
		defaultFPMethodStrategy = new DefaultFPMethodStrategy();
	}
	
	@Test
	public void registerEC_Test(){
		FPProductInformation fpInfo = null;
		defaultFPMethodStrategy.registerEC(fpInfo);
	}
	
	@Test
	public void unEnrollFromPreviousScheduleAsFPMethodChanged_Test(){
		FPProductInformation fpInfo = null;
		defaultFPMethodStrategy.unEnrollFromPreviousScheduleAsFPMethodChanged(fpInfo);
	}
	
	@Test
	public void enrollToNewScheduleForNewFPMethod_Test(){
		FPProductInformation fpInfo = null;
		defaultFPMethodStrategy.enrollToNewScheduleForNewFPMethod(fpInfo);
	}
	
	@Test
	public void renewFPProduct_Test(){
		FPProductInformation fpInfo = null;
		defaultFPMethodStrategy.renewFPProduct(fpInfo);
	}
	
	@Test
	public void fpFollowup_Test(){
		FPProductInformation fpInfo = null;
		defaultFPMethodStrategy.fpFollowup(fpInfo);
	}

}
