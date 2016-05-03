package org.ei.drishti.reporting.domain;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;

import org.junit.Before;
import org.junit.Test;

public class POC_TableTest {
	
	private POC_Table poc_Table;
	
	@Before
	public void setUp(){
		String visitentityid = null;
		String entityidec = null;
		String anmid = null;
		String level = null;
		String clientversion = null;
		String serverversion = null;
		String visittype = null;
		String phc = null;
		String pending = null;
		String docid = null;
		Timestamp timestamp = null;
		String wifename = null;
		poc_Table = new POC_Table(visitentityid, entityidec, anmid, level, clientversion,
				serverversion, visittype, phc, pending, docid, timestamp, wifename);
	}
	
	@Test
	public void idTest(){
		Integer s = null;
		Integer w = poc_Table.id();
		assertEquals(w,s);
	}
	
	@Test
	public void visitentityidTest(){
		String s = null;
		String w = poc_Table.visitentityid();
		assertEquals(w,s);
	}
	
	@Test
	public void setvisitentityid_Test(){
		String visitentityid = null;
		poc_Table.setvisitentityid(visitentityid);
	}
	
	@Test
	public void entityidecTest(){
		String s = null;
		String w = poc_Table.entityidec();
		assertEquals(w,s);
	}
	
	@Test
	public void setentityidecTest(){
		String entityidec = null;
		poc_Table.setentityidec(entityidec);
	}
	
	@Test
	public void anmidTest(){
		String s = null;
		String w = poc_Table.anmid();
		assertEquals(w,s);
	}
	
	@Test
	public void setanmidTest(){
		String anmid = null;
		poc_Table.setanmid(anmid);
	}
	
	@Test
	public void levelTest(){
		String s = null;
		String w = poc_Table.level();
		assertEquals(w,s);
	}
	
	@Test
	public void setlevelTest(){
		String level = null;
		poc_Table.setlevel(level);
	}
	
	@Test
	public void clientversionTest(){
		String s = null;
		String w = poc_Table.clientversion();
		assertEquals(w,s);
	}
	
	@Test
	public void setclientversionTest(){
		String clientversion = null;
		poc_Table.setclientversion(clientversion);
	}
	
	@Test
	public void serverversionTest(){
		String s = null;
		String w = poc_Table.serverversion();
		assertEquals(w,s);
	}
	
	@Test
	public void setserverversionTest(){
		String serverversion = null;
		poc_Table.setserverversion(serverversion);
	}
	
	@Test
	public void visittypeTest(){
		String s = null;
		String w = poc_Table.visittype();
		assertEquals(w,s);
	}
	
	@Test
	public void setvisittypeTest(){
		String visittype = null;
		poc_Table.setvisittype(visittype);
	}
	
	@Test
	public void phcTest(){
		String s = null;
		String w = poc_Table.phc();
		assertEquals(w,s);
	}
	
	@Test
	public void setphcTest(){
		String phc = null;
		poc_Table.setphc(phc);
	}
	
	@Test
	public void pendingTest(){
		String s = null;
		String w = poc_Table.pending();
		assertEquals(w,s);
	}
	
	@Test
	public void setpendingTest(){
		String pending = null;
		poc_Table.setpending(pending);
	}
	
	@Test
	public void docidTest(){
		String s = null;
		String w = poc_Table.docid();
		assertEquals(w,s);
	}
	
	@Test
	public void setdocidTest(){
		String docid = null;
		poc_Table.setdocid(docid);
	}
	
	@Test
	public void timestampTest(){
		String s = null;
		Timestamp w = poc_Table.timestamp();
		assertEquals(w,s);
	}
	
	@Test
	public void settimestampTest(){
		Timestamp timestamp = null;
		poc_Table.settimestamp(timestamp);
	}
	
	@Test
	public void wifenameTest(){
		String s = null;
		String w = poc_Table.wifename();
		assertEquals(w,s);
	}
	
	@Test
	public void setwifenameTest(){
		String wifename = null;
		poc_Table.setwifename(wifename);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= poc_Table.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		poc_Table.hashCode();
	}

	@Test
	public void toStringTest() {
		poc_Table.toString();
	}

}
