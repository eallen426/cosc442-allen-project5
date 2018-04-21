import static org.junit.jupiter.api.Assertions.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


import java.util.Vector;

import org.junit.Before;
import org.junit.jupiter.api.Test;


@RunWith(Suite.class)
class WMethodTest {
	
	Vector <String> tests;
	WMethod fixture = new WMethod();
	Utilities fixture2 = new Utilities();
	TestingTree transitionCover;
	String [] realInput;
	pTableManager w;
	
	WMethodTest()
	{
		
	}
	@Before
	public void SetUp()
	{
		
	}
	
	@Test
	public void testCase0(){
		fixture.fsmFilename="a1.txt";
		for (int i = 0; i < fixture.outputArray.length; i++){
			fixture.outputArray[i] = ""; 
		}
		for (int j = 0; j < fixture.inputArray.length; j++){
		    fixture.inputArray[j] = ""; 
		}
		fixture.getFSM();
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( ( )", " ").contains("y"));
	}

	@Test
	public void testCase1(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( ( 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase2(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( ( 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase3(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( ( 7 )", " ").contains("y"));
	}

	@Test
	public void testCase4(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( )", " ").contains("y"));
	}

	@Test
	public void testCase5(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( ) )", " ").contains("y"));
	}

	@Test
	public void testCase6(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( ) 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase7(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( ) 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase8(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( ) 7 )", " ").contains("y"));
	}

	@Test
	public void testCase9(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 ( )", " ").contains("y"));
	}

	@Test
	public void testCase10(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 ( 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase11(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 ( 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase12(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 ( 7 )", " ").contains("y"));
	}

	@Test
	public void testCase13(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 )", " ").contains("y"));
	}

	@Test
	public void testCase14(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 ) )", " ").contains("y"));
	}

	@Test
	public void testCase15(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 ) 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase16(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 ) 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase17(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 ) 7 )", " ").contains("y"));
	}

	@Test
	public void testCase18(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 ( )", " ").contains("y"));
	}

	@Test
	public void testCase19(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 ( 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase20(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 ( 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase21(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 ( 7 )", " ").contains("y"));
	}

	@Test
	public void testCase22(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 )", " ").contains("y"));
	}

	@Test
	public void testCase23(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 ) )", " ").contains("y"));
	}

	@Test
	public void testCase24(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 ) 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase25(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 ) 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase26(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 ) 7 )", " ").contains("y"));
	}

	@Test
	public void testCase27(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 0 )", " ").contains("y"));
	}

	@Test
	public void testCase28(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 0 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase29(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase30(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase31(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 1 )", " ").contains("y"));
	}

	@Test
	public void testCase32(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 1 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase33(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 1 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase34(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 1 7 )", " ").contains("y"));
	}

	@Test
	public void testCase35(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 2 )", " ").contains("y"));
	}

	@Test
	public void testCase36(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 2 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase37(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 2 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase38(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 2 7 )", " ").contains("y"));
	}

	@Test
	public void testCase39(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 3 )", " ").contains("y"));
	}

	@Test
	public void testCase40(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 3 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase41(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 3 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase42(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 3 7 )", " ").contains("y"));
	}

	@Test
	public void testCase43(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 4 )", " ").contains("y"));
	}

	@Test
	public void testCase44(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 4 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase45(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 4 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase46(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 4 7 )", " ").contains("y"));
	}

	@Test
	public void testCase47(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 5 )", " ").contains("y"));
	}

	@Test
	public void testCase48(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 5 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase49(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 5 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase50(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 5 7 )", " ").contains("y"));
	}

	@Test
	public void testCase51(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 6 )", " ").contains("y"));
	}

	@Test
	public void testCase52(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 6 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase53(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 6 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase54(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 6 7 )", " ").contains("y"));
	}

	@Test
	public void testCase55(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 ( )", " ").contains("y"));
	}

	@Test
	public void testCase56(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 ( 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase57(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 ( 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase58(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 ( 7 )", " ").contains("y"));
	}

	@Test
	public void testCase59(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase60(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 ) )", " ").contains("y"));
	}

	@Test
	public void testCase61(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 ) 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase62(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 ) 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase63(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 ) 7 )", " ").contains("y"));
	}

	@Test
	public void testCase64(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 0 )", " ").contains("y"));
	}

	@Test
	public void testCase65(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 0 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase66(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase67(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase68(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 1 )", " ").contains("y"));
	}

	@Test
	public void testCase69(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 1 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase70(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 1 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase71(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 1 7 )", " ").contains("y"));
	}

	@Test
	public void testCase72(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 2 )", " ").contains("y"));
	}

	@Test
	public void testCase73(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 2 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase74(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 2 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase75(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 2 7 )", " ").contains("y"));
	}

	@Test
	public void testCase76(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 3 )", " ").contains("y"));
	}

	@Test
	public void testCase77(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 3 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase78(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 3 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase79(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 3 7 )", " ").contains("y"));
	}

	@Test
	public void testCase80(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 4 )", " ").contains("y"));
	}

	@Test
	public void testCase81(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 4 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase82(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 4 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase83(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 4 7 )", " ").contains("y"));
	}

	@Test
	public void testCase84(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 5 )", " ").contains("y"));
	}

	@Test
	public void testCase85(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 5 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase86(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 5 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase87(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 5 7 )", " ").contains("y"));
	}

	@Test
	public void testCase88(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 6 )", " ").contains("y"));
	}

	@Test
	public void testCase89(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 6 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase90(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 6 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase91(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 6 7 )", " ").contains("y"));
	}

	@Test
	public void testCase92(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 7 )", " ").contains("y"));
	}

	@Test
	public void testCase93(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 7 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase94(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 7 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase95(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 7 7 )", " ").contains("y"));
	}

	@Test
	public void testCase96(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 8 )", " ").contains("y"));
	}

	@Test
	public void testCase97(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 8 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase98(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 8 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase99(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 8 7 )", " ").contains("y"));
	}

	@Test
	public void testCase100(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 9 )", " ").contains("y"));
	}

	@Test
	public void testCase101(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 9 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase102(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 9 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase103(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 7 9 7 )", " ").contains("y"));
	}

	@Test
	public void testCase104(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 8 )", " ").contains("y"));
	}

	@Test
	public void testCase105(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 8 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase106(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 8 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase107(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 8 7 )", " ").contains("y"));
	}

	@Test
	public void testCase108(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 9 )", " ").contains("y"));
	}

	@Test
	public void testCase109(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 9 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase110(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 9 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase111(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 0 9 7 )", " ").contains("y"));
	}

	@Test
	public void testCase112(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 1 )", " ").contains("y"));
	}

	@Test
	public void testCase113(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 1 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase114(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 1 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase115(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 1 7 )", " ").contains("y"));
	}

	@Test
	public void testCase116(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 2 )", " ").contains("y"));
	}

	@Test
	public void testCase117(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 2 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase118(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 2 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase119(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 2 7 )", " ").contains("y"));
	}

	@Test
	public void testCase120(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 3 )", " ").contains("y"));
	}

	@Test
	public void testCase121(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 3 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase122(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 3 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase123(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 3 7 )", " ").contains("y"));
	}

	@Test
	public void testCase124(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 4 )", " ").contains("y"));
	}

	@Test
	public void testCase125(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 4 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase126(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 4 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase127(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 4 7 )", " ").contains("y"));
	}

	@Test
	public void testCase128(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 5 )", " ").contains("y"));
	}

	@Test
	public void testCase129(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 5 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase130(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 5 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase131(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 5 7 )", " ").contains("y"));
	}

	@Test
	public void testCase132(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 6 )", " ").contains("y"));
	}

	@Test
	public void testCase133(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 6 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase134(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 6 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase135(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 6 7 )", " ").contains("y"));
	}

	@Test
	public void testCase136(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase137(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 7 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase138(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 7 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase139(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 7 7 )", " ").contains("y"));
	}

	@Test
	public void testCase140(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 8 )", " ").contains("y"));
	}

	@Test
	public void testCase141(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 8 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase142(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 8 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase143(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 8 7 )", " ").contains("y"));
	}

	@Test
	public void testCase144(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 9 )", " ").contains("y"));
	}

	@Test
	public void testCase145(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 9 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase146(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 0 9 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase147(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 0 9 7 )", " ").contains("y"));
	}

	@Test
	public void testCase148(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 1 )", " ").contains("y"));
	}

	@Test
	public void testCase149(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 1 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase150(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 1 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase151(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 1 7 )", " ").contains("y"));
	}

	@Test
	public void testCase152(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 2 )", " ").contains("y"));
	}

	@Test
	public void testCase153(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 2 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase154(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 2 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase155(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 2 7 )", " ").contains("y"));
	}

	@Test
	public void testCase156(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 3 )", " ").contains("y"));
	}

	@Test
	public void testCase157(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 3 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase158(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 3 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase159(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 3 7 )", " ").contains("y"));
	}

	@Test
	public void testCase160(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 4 )", " ").contains("y"));
	}

	@Test
	public void testCase161(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 4 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase162(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 4 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase163(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 4 7 )", " ").contains("y"));
	}

	@Test
	public void testCase164(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 5 )", " ").contains("y"));
	}

	@Test
	public void testCase165(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 5 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase166(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 5 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase167(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 5 7 )", " ").contains("y"));
	}

	@Test
	public void testCase168(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 6 )", " ").contains("y"));
	}

	@Test
	public void testCase169(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 6 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase170(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 6 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase171(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 6 7 )", " ").contains("y"));
	}

	@Test
	public void testCase172(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 7 )", " ").contains("y"));
	}

	@Test
	public void testCase173(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 7 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase174(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 7 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase175(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 7 7 )", " ").contains("y"));
	}

	@Test
	public void testCase176(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 8 )", " ").contains("y"));
	}

	@Test
	public void testCase177(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 8 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase178(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 8 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase179(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 8 7 )", " ").contains("y"));
	}

	@Test
	public void testCase180(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 9 )", " ").contains("y"));
	}

	@Test
	public void testCase181(){
		assertEquals(true, fixture2.runFSM2(fixture.FSM, 1, "( 9 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase182(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 9 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase183(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "( 9 7 )", " ").contains("y"));
	}

	@Test
	public void testCase184(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, ")", " ").contains("y"));
	}

	@Test
	public void testCase185(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, ") )", " ").contains("y"));
	}

	@Test
	public void testCase186(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, ") 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase187(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, ") 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase188(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, ") 7 )", " ").contains("y"));
	}

	@Test
	public void testCase189(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "0 )", " ").contains("y"));
	}

	@Test
	public void testCase190(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "0 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase191(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase192(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase193(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "1 )", " ").contains("y"));
	}

	@Test
	public void testCase194(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "1 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase195(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "1 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase196(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "1 7 )", " ").contains("y"));
	}

	@Test
	public void testCase197(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "2 )", " ").contains("y"));
	}

	@Test
	public void testCase198(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "2 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase199(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "2 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase200(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "2 7 )", " ").contains("y"));
	}

	@Test
	public void testCase201(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "3 )", " ").contains("y"));
	}

	@Test
	public void testCase202(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "3 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase203(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "3 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase204(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "3 7 )", " ").contains("y"));
	}

	@Test
	public void testCase205(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "4 )", " ").contains("y"));
	}

	@Test
	public void testCase206(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "4 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase207(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "4 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase208(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "4 7 )", " ").contains("y"));
	}

	@Test
	public void testCase209(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "5 )", " ").contains("y"));
	}

	@Test
	public void testCase210(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "5 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase211(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "5 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase212(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "5 7 )", " ").contains("y"));
	}

	@Test
	public void testCase213(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "6 )", " ").contains("y"));
	}

	@Test
	public void testCase214(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "6 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase215(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "6 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase216(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "6 7 )", " ").contains("y"));
	}

	@Test
	public void testCase217(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "7 )", " ").contains("y"));
	}

	@Test
	public void testCase218(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "7 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase219(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "7 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase220(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "7 7 )", " ").contains("y"));
	}

	@Test
	public void testCase221(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "8 )", " ").contains("y"));
	}

	@Test
	public void testCase222(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "8 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase223(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "8 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase224(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "8 7 )", " ").contains("y"));
	}

	@Test
	public void testCase225(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "9 )", " ").contains("y"));
	}

	@Test
	public void testCase226(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "9 0 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase227(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "9 0 7 )", " ").contains("y"));
	}

	@Test
	public void testCase228(){
		assertEquals(false, fixture2.runFSM2(fixture.FSM, 1, "9 7 )", " ").contains("y"));
	}

}
