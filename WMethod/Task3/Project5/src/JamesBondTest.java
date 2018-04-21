import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class JamesBondTest {
	
	JamesBond bond;
	
	@Before
	public void setUp() throws Exception {
		bond = new JamesBond();
	}

	@Test
	public void testCase0(){
		assertEquals(false, bond.bondRegex("( ( )"));
	}

	@Test
	public void testCase1(){
		assertEquals(true, bond.bondRegex("( ( 0 0 7 )"));
	}

	@Test
	public void testCase2(){
		assertEquals(false, bond.bondRegex("( ( 0 7 )"));
	}

	@Test
	public void testCase3(){
		assertEquals(false, bond.bondRegex("( ( 7 )"));
	}

	@Test
	public void testCase4(){
		assertEquals(false, bond.bondRegex("( )"));
	}

	@Test
	public void testCase5(){
		assertEquals(false, bond.bondRegex("( ) )"));
	}

	@Test
	public void testCase6(){
		assertEquals(true, bond.bondRegex("( ) 0 0 7 )"));
	}

	@Test
	public void testCase7(){
		assertEquals(false, bond.bondRegex("( ) 0 7 )"));
	}

	@Test
	public void testCase8(){
		assertEquals(false, bond.bondRegex("( ) 7 )"));
	}

	@Test
	public void testCase9(){
		assertEquals(false, bond.bondRegex("( 0 ( )"));
	}

	@Test
	public void testCase10(){
		assertEquals(true, bond.bondRegex("( 0 ( 0 0 7 )"));
	}

	@Test
	public void testCase11(){
		assertEquals(false, bond.bondRegex("( 0 ( 0 7 )"));
	}

	@Test
	public void testCase12(){
		assertEquals(false, bond.bondRegex("( 0 ( 7 )"));
	}

	@Test
	public void testCase13(){
		assertEquals(false, bond.bondRegex("( 0 )"));
	}

	@Test
	public void testCase14(){
		assertEquals(false, bond.bondRegex("( 0 ) )"));
	}

	@Test
	public void testCase15(){
		assertEquals(true, bond.bondRegex("( 0 ) 0 0 7 )"));
	}

	@Test
	public void testCase16(){
		assertEquals(false, bond.bondRegex("( 0 ) 0 7 )"));
	}

	@Test
	public void testCase17(){
		assertEquals(false, bond.bondRegex("( 0 ) 7 )"));
	}

	@Test
	public void testCase18(){
		assertEquals(false, bond.bondRegex("( 0 0 ( )"));
	}

	@Test
	public void testCase19(){
		assertEquals(true, bond.bondRegex("( 0 0 ( 0 0 7 )"));
	}

	@Test
	public void testCase20(){
		assertEquals(false, bond.bondRegex("( 0 0 ( 0 7 )"));
	}

	@Test
	public void testCase21(){
		assertEquals(false, bond.bondRegex("( 0 0 ( 7 )"));
	}

	@Test
	public void testCase22(){
		assertEquals(false, bond.bondRegex("( 0 0 )"));
	}

	@Test
	public void testCase23(){
		assertEquals(false, bond.bondRegex("( 0 0 ) )"));
	}

	@Test
	public void testCase24(){
		assertEquals(true, bond.bondRegex("( 0 0 ) 0 0 7 )"));
	}

	@Test
	public void testCase25(){
		assertEquals(false, bond.bondRegex("( 0 0 ) 0 7 )"));
	}

	@Test
	public void testCase26(){
		assertEquals(false, bond.bondRegex("( 0 0 ) 7 )"));
	}

	@Test
	public void testCase27(){
		assertEquals(false, bond.bondRegex("( 0 0 0 )"));
	}

	@Test
	public void testCase28(){
		assertEquals(true, bond.bondRegex("( 0 0 0 0 0 7 )"));
	}

	@Test
	public void testCase29(){
		assertEquals(true, bond.bondRegex("( 0 0 0 0 7 )"));
	}

	@Test
	public void testCase30(){
		assertEquals(true, bond.bondRegex("( 0 0 0 7 )"));
	}

	@Test
	public void testCase31(){
		assertEquals(false, bond.bondRegex("( 0 0 1 )"));
	}

	@Test
	public void testCase32(){
		assertEquals(true, bond.bondRegex("( 0 0 1 0 0 7 )"));
	}

	@Test
	public void testCase33(){
		assertEquals(false, bond.bondRegex("( 0 0 1 0 7 )"));
	}

	@Test
	public void testCase34(){
		assertEquals(false, bond.bondRegex("( 0 0 1 7 )"));
	}

	@Test
	public void testCase35(){
		assertEquals(false, bond.bondRegex("( 0 0 2 )"));
	}

	@Test
	public void testCase36(){
		assertEquals(true, bond.bondRegex("( 0 0 2 0 0 7 )"));
	}

	@Test
	public void testCase37(){
		assertEquals(false, bond.bondRegex("( 0 0 2 0 7 )"));
	}

	@Test
	public void testCase38(){
		assertEquals(false, bond.bondRegex("( 0 0 2 7 )"));
	}

	@Test
	public void testCase39(){
		assertEquals(false, bond.bondRegex("( 0 0 3 )"));
	}

	@Test
	public void testCase40(){
		assertEquals(true, bond.bondRegex("( 0 0 3 0 0 7 )"));
	}

	@Test
	public void testCase41(){
		assertEquals(false, bond.bondRegex("( 0 0 3 0 7 )"));
	}

	@Test
	public void testCase42(){
		assertEquals(false, bond.bondRegex("( 0 0 3 7 )"));
	}

	@Test
	public void testCase43(){
		assertEquals(false, bond.bondRegex("( 0 0 4 )"));
	}

	@Test
	public void testCase44(){
		assertEquals(true, bond.bondRegex("( 0 0 4 0 0 7 )"));
	}

	@Test
	public void testCase45(){
		assertEquals(false, bond.bondRegex("( 0 0 4 0 7 )"));
	}

	@Test
	public void testCase46(){
		assertEquals(false, bond.bondRegex("( 0 0 4 7 )"));
	}

	@Test
	public void testCase47(){
		assertEquals(false, bond.bondRegex("( 0 0 5 )"));
	}

	@Test
	public void testCase48(){
		assertEquals(true, bond.bondRegex("( 0 0 5 0 0 7 )"));
	}

	@Test
	public void testCase49(){
		assertEquals(false, bond.bondRegex("( 0 0 5 0 7 )"));
	}

	@Test
	public void testCase50(){
		assertEquals(false, bond.bondRegex("( 0 0 5 7 )"));
	}

	@Test
	public void testCase51(){
		assertEquals(false, bond.bondRegex("( 0 0 6 )"));
	}

	@Test
	public void testCase52(){
		assertEquals(true, bond.bondRegex("( 0 0 6 0 0 7 )"));
	}

	@Test
	public void testCase53(){
		assertEquals(false, bond.bondRegex("( 0 0 6 0 7 )"));
	}

	@Test
	public void testCase54(){
		assertEquals(false, bond.bondRegex("( 0 0 6 7 )"));
	}

	@Test
	public void testCase55(){
		assertEquals(true, bond.bondRegex("( 0 0 7 ( )"));
	}

	@Test
	public void testCase56(){
		assertEquals(true, bond.bondRegex("( 0 0 7 ( 0 0 7 )"));
	}

	@Test
	public void testCase57(){
		assertEquals(true, bond.bondRegex("( 0 0 7 ( 0 7 )"));
	}

	@Test
	public void testCase58(){
		assertEquals(true, bond.bondRegex("( 0 0 7 ( 7 )"));
	}

	@Test
	public void testCase59(){
		assertEquals(true, bond.bondRegex("( 0 0 7 )"));
	}

	@Test
	public void testCase60(){
		assertEquals(true, bond.bondRegex("( 0 0 7 ) )"));
	}

	@Test
	public void testCase61(){
		assertEquals(true, bond.bondRegex("( 0 0 7 ) 0 0 7 )"));
	}

	@Test
	public void testCase62(){
		assertEquals(true, bond.bondRegex("( 0 0 7 ) 0 7 )"));
	}

	@Test
	public void testCase63(){
		assertEquals(true, bond.bondRegex("( 0 0 7 ) 7 )"));
	}

	@Test
	public void testCase64(){
		assertEquals(true, bond.bondRegex("( 0 0 7 0 )"));
	}

	@Test
	public void testCase65(){
		assertEquals(true, bond.bondRegex("( 0 0 7 0 0 0 7 )"));
	}

	@Test
	public void testCase66(){
		assertEquals(true, bond.bondRegex("( 0 0 7 0 0 7 )"));
	}

	@Test
	public void testCase67(){
		assertEquals(true, bond.bondRegex("( 0 0 7 0 7 )"));
	}

	@Test
	public void testCase68(){
		assertEquals(true, bond.bondRegex("( 0 0 7 1 )"));
	}

	@Test
	public void testCase69(){
		assertEquals(true, bond.bondRegex("( 0 0 7 1 0 0 7 )"));
	}

	@Test
	public void testCase70(){
		assertEquals(true, bond.bondRegex("( 0 0 7 1 0 7 )"));
	}

	@Test
	public void testCase71(){
		assertEquals(true, bond.bondRegex("( 0 0 7 1 7 )"));
	}

	@Test
	public void testCase72(){
		assertEquals(true, bond.bondRegex("( 0 0 7 2 )"));
	}

	@Test
	public void testCase73(){
		assertEquals(true, bond.bondRegex("( 0 0 7 2 0 0 7 )"));
	}

	@Test
	public void testCase74(){
		assertEquals(true, bond.bondRegex("( 0 0 7 2 0 7 )"));
	}

	@Test
	public void testCase75(){
		assertEquals(true, bond.bondRegex("( 0 0 7 2 7 )"));
	}

	@Test
	public void testCase76(){
		assertEquals(true, bond.bondRegex("( 0 0 7 3 )"));
	}

	@Test
	public void testCase77(){
		assertEquals(true, bond.bondRegex("( 0 0 7 3 0 0 7 )"));
	}

	@Test
	public void testCase78(){
		assertEquals(true, bond.bondRegex("( 0 0 7 3 0 7 )"));
	}

	@Test
	public void testCase79(){
		assertEquals(true, bond.bondRegex("( 0 0 7 3 7 )"));
	}

	@Test
	public void testCase80(){
		assertEquals(true, bond.bondRegex("( 0 0 7 4 )"));
	}

	@Test
	public void testCase81(){
		assertEquals(true, bond.bondRegex("( 0 0 7 4 0 0 7 )"));
	}

	@Test
	public void testCase82(){
		assertEquals(true, bond.bondRegex("( 0 0 7 4 0 7 )"));
	}

	@Test
	public void testCase83(){
		assertEquals(true, bond.bondRegex("( 0 0 7 4 7 )"));
	}

	@Test
	public void testCase84(){
		assertEquals(true, bond.bondRegex("( 0 0 7 5 )"));
	}

	@Test
	public void testCase85(){
		assertEquals(true, bond.bondRegex("( 0 0 7 5 0 0 7 )"));
	}

	@Test
	public void testCase86(){
		assertEquals(true, bond.bondRegex("( 0 0 7 5 0 7 )"));
	}

	@Test
	public void testCase87(){
		assertEquals(true, bond.bondRegex("( 0 0 7 5 7 )"));
	}

	@Test
	public void testCase88(){
		assertEquals(true, bond.bondRegex("( 0 0 7 6 )"));
	}

	@Test
	public void testCase89(){
		assertEquals(true, bond.bondRegex("( 0 0 7 6 0 0 7 )"));
	}

	@Test
	public void testCase90(){
		assertEquals(true, bond.bondRegex("( 0 0 7 6 0 7 )"));
	}

	@Test
	public void testCase91(){
		assertEquals(true, bond.bondRegex("( 0 0 7 6 7 )"));
	}

	@Test
	public void testCase92(){
		assertEquals(true, bond.bondRegex("( 0 0 7 7 )"));
	}

	@Test
	public void testCase93(){
		assertEquals(true, bond.bondRegex("( 0 0 7 7 0 0 7 )"));
	}

	@Test
	public void testCase94(){
		assertEquals(true, bond.bondRegex("( 0 0 7 7 0 7 )"));
	}

	@Test
	public void testCase95(){
		assertEquals(true, bond.bondRegex("( 0 0 7 7 7 )"));
	}

	@Test
	public void testCase96(){
		assertEquals(true, bond.bondRegex("( 0 0 7 8 )"));
	}

	@Test
	public void testCase97(){
		assertEquals(true, bond.bondRegex("( 0 0 7 8 0 0 7 )"));
	}

	@Test
	public void testCase98(){
		assertEquals(true, bond.bondRegex("( 0 0 7 8 0 7 )"));
	}

	@Test
	public void testCase99(){
		assertEquals(true, bond.bondRegex("( 0 0 7 8 7 )"));
	}

	@Test
	public void testCase100(){
		assertEquals(true, bond.bondRegex("( 0 0 7 9 )"));
	}

	@Test
	public void testCase101(){
		assertEquals(true, bond.bondRegex("( 0 0 7 9 0 0 7 )"));
	}

	@Test
	public void testCase102(){
		assertEquals(true, bond.bondRegex("( 0 0 7 9 0 7 )"));
	}

	@Test
	public void testCase103(){
		assertEquals(true, bond.bondRegex("( 0 0 7 9 7 )"));
	}

	@Test
	public void testCase104(){
		assertEquals(false, bond.bondRegex("( 0 0 8 )"));
	}

	@Test
	public void testCase105(){
		assertEquals(true, bond.bondRegex("( 0 0 8 0 0 7 )"));
	}

	@Test
	public void testCase106(){
		assertEquals(false, bond.bondRegex("( 0 0 8 0 7 )"));
	}

	@Test
	public void testCase107(){
		assertEquals(false, bond.bondRegex("( 0 0 8 7 )"));
	}

	@Test
	public void testCase108(){
		assertEquals(false, bond.bondRegex("( 0 0 9 )"));
	}

	@Test
	public void testCase109(){
		assertEquals(true, bond.bondRegex("( 0 0 9 0 0 7 )"));
	}

	@Test
	public void testCase110(){
		assertEquals(false, bond.bondRegex("( 0 0 9 0 7 )"));
	}

	@Test
	public void testCase111(){
		assertEquals(false, bond.bondRegex("( 0 0 9 7 )"));
	}

	@Test
	public void testCase112(){
		assertEquals(false, bond.bondRegex("( 0 1 )"));
	}

	@Test
	public void testCase113(){
		assertEquals(true, bond.bondRegex("( 0 1 0 0 7 )"));
	}

	@Test
	public void testCase114(){
		assertEquals(false, bond.bondRegex("( 0 1 0 7 )"));
	}

	@Test
	public void testCase115(){
		assertEquals(false, bond.bondRegex("( 0 1 7 )"));
	}

	@Test
	public void testCase116(){
		assertEquals(false, bond.bondRegex("( 0 2 )"));
	}

	@Test
	public void testCase117(){
		assertEquals(true, bond.bondRegex("( 0 2 0 0 7 )"));
	}

	@Test
	public void testCase118(){
		assertEquals(false, bond.bondRegex("( 0 2 0 7 )"));
	}

	@Test
	public void testCase119(){
		assertEquals(false, bond.bondRegex("( 0 2 7 )"));
	}

	@Test
	public void testCase120(){
		assertEquals(false, bond.bondRegex("( 0 3 )"));
	}

	@Test
	public void testCase121(){
		assertEquals(true, bond.bondRegex("( 0 3 0 0 7 )"));
	}

	@Test
	public void testCase122(){
		assertEquals(false, bond.bondRegex("( 0 3 0 7 )"));
	}

	@Test
	public void testCase123(){
		assertEquals(false, bond.bondRegex("( 0 3 7 )"));
	}

	@Test
	public void testCase124(){
		assertEquals(false, bond.bondRegex("( 0 4 )"));
	}

	@Test
	public void testCase125(){
		assertEquals(true, bond.bondRegex("( 0 4 0 0 7 )"));
	}

	@Test
	public void testCase126(){
		assertEquals(false, bond.bondRegex("( 0 4 0 7 )"));
	}

	@Test
	public void testCase127(){
		assertEquals(false, bond.bondRegex("( 0 4 7 )"));
	}

	@Test
	public void testCase128(){
		assertEquals(false, bond.bondRegex("( 0 5 )"));
	}

	@Test
	public void testCase129(){
		assertEquals(true, bond.bondRegex("( 0 5 0 0 7 )"));
	}

	@Test
	public void testCase130(){
		assertEquals(false, bond.bondRegex("( 0 5 0 7 )"));
	}

	@Test
	public void testCase131(){
		assertEquals(false, bond.bondRegex("( 0 5 7 )"));
	}

	@Test
	public void testCase132(){
		assertEquals(false, bond.bondRegex("( 0 6 )"));
	}

	@Test
	public void testCase133(){
		assertEquals(true, bond.bondRegex("( 0 6 0 0 7 )"));
	}

	@Test
	public void testCase134(){
		assertEquals(false, bond.bondRegex("( 0 6 0 7 )"));
	}

	@Test
	public void testCase135(){
		assertEquals(false, bond.bondRegex("( 0 6 7 )"));
	}

	@Test
	public void testCase136(){
		assertEquals(false, bond.bondRegex("( 0 7 )"));
	}

	@Test
	public void testCase137(){
		assertEquals(true, bond.bondRegex("( 0 7 0 0 7 )"));
	}

	@Test
	public void testCase138(){
		assertEquals(false, bond.bondRegex("( 0 7 0 7 )"));
	}

	@Test
	public void testCase139(){
		assertEquals(false, bond.bondRegex("( 0 7 7 )"));
	}

	@Test
	public void testCase140(){
		assertEquals(false, bond.bondRegex("( 0 8 )"));
	}

	@Test
	public void testCase141(){
		assertEquals(true, bond.bondRegex("( 0 8 0 0 7 )"));
	}

	@Test
	public void testCase142(){
		assertEquals(false, bond.bondRegex("( 0 8 0 7 )"));
	}

	@Test
	public void testCase143(){
		assertEquals(false, bond.bondRegex("( 0 8 7 )"));
	}

	@Test
	public void testCase144(){
		assertEquals(false, bond.bondRegex("( 0 9 )"));
	}

	@Test
	public void testCase145(){
		assertEquals(true, bond.bondRegex("( 0 9 0 0 7 )"));
	}

	@Test
	public void testCase146(){
		assertEquals(false, bond.bondRegex("( 0 9 0 7 )"));
	}

	@Test
	public void testCase147(){
		assertEquals(false, bond.bondRegex("( 0 9 7 )"));
	}

	@Test
	public void testCase148(){
		assertEquals(false, bond.bondRegex("( 1 )"));
	}

	@Test
	public void testCase149(){
		assertEquals(true, bond.bondRegex("( 1 0 0 7 )"));
	}

	@Test
	public void testCase150(){
		assertEquals(false, bond.bondRegex("( 1 0 7 )"));
	}

	@Test
	public void testCase151(){
		assertEquals(false, bond.bondRegex("( 1 7 )"));
	}

	@Test
	public void testCase152(){
		assertEquals(false, bond.bondRegex("( 2 )"));
	}

	@Test
	public void testCase153(){
		assertEquals(true, bond.bondRegex("( 2 0 0 7 )"));
	}

	@Test
	public void testCase154(){
		assertEquals(false, bond.bondRegex("( 2 0 7 )"));
	}

	@Test
	public void testCase155(){
		assertEquals(false, bond.bondRegex("( 2 7 )"));
	}

	@Test
	public void testCase156(){
		assertEquals(false, bond.bondRegex("( 3 )"));
	}

	@Test
	public void testCase157(){
		assertEquals(true, bond.bondRegex("( 3 0 0 7 )"));
	}

	@Test
	public void testCase158(){
		assertEquals(false, bond.bondRegex("( 3 0 7 )"));
	}

	@Test
	public void testCase159(){
		assertEquals(false, bond.bondRegex("( 3 7 )"));
	}

	@Test
	public void testCase160(){
		assertEquals(false, bond.bondRegex("( 4 )"));
	}

	@Test
	public void testCase161(){
		assertEquals(true, bond.bondRegex("( 4 0 0 7 )"));
	}

	@Test
	public void testCase162(){
		assertEquals(false, bond.bondRegex("( 4 0 7 )"));
	}

	@Test
	public void testCase163(){
		assertEquals(false, bond.bondRegex("( 4 7 )"));
	}

	@Test
	public void testCase164(){
		assertEquals(false, bond.bondRegex("( 5 )"));
	}

	@Test
	public void testCase165(){
		assertEquals(true, bond.bondRegex("( 5 0 0 7 )"));
	}

	@Test
	public void testCase166(){
		assertEquals(false, bond.bondRegex("( 5 0 7 )"));
	}

	@Test
	public void testCase167(){
		assertEquals(false, bond.bondRegex("( 5 7 )"));
	}

	@Test
	public void testCase168(){
		assertEquals(false, bond.bondRegex("( 6 )"));
	}

	@Test
	public void testCase169(){
		assertEquals(true, bond.bondRegex("( 6 0 0 7 )"));
	}

	@Test
	public void testCase170(){
		assertEquals(false, bond.bondRegex("( 6 0 7 )"));
	}

	@Test
	public void testCase171(){
		assertEquals(false, bond.bondRegex("( 6 7 )"));
	}

	@Test
	public void testCase172(){
		assertEquals(false, bond.bondRegex("( 7 )"));
	}

	@Test
	public void testCase173(){
		assertEquals(true, bond.bondRegex("( 7 0 0 7 )"));
	}

	@Test
	public void testCase174(){
		assertEquals(false, bond.bondRegex("( 7 0 7 )"));
	}

	@Test
	public void testCase175(){
		assertEquals(false, bond.bondRegex("( 7 7 )"));
	}

	@Test
	public void testCase176(){
		assertEquals(false, bond.bondRegex("( 8 )"));
	}

	@Test
	public void testCase177(){
		assertEquals(true, bond.bondRegex("( 8 0 0 7 )"));
	}

	@Test
	public void testCase178(){
		assertEquals(false, bond.bondRegex("( 8 0 7 )"));
	}

	@Test
	public void testCase179(){
		assertEquals(false, bond.bondRegex("( 8 7 )"));
	}

	@Test
	public void testCase180(){
		assertEquals(false, bond.bondRegex("( 9 )"));
	}

	@Test
	public void testCase181(){
		assertEquals(true, bond.bondRegex("( 9 0 0 7 )"));
	}

	@Test
	public void testCase182(){
		assertEquals(false, bond.bondRegex("( 9 0 7 )"));
	}

	@Test
	public void testCase183(){
		assertEquals(false, bond.bondRegex("( 9 7 )"));
	}

	@Test
	public void testCase184(){
		assertEquals(false, bond.bondRegex(")"));
	}

	@Test
	public void testCase185(){
		assertEquals(false, bond.bondRegex(") )"));
	}

	@Test
	public void testCase186(){
		assertEquals(false, bond.bondRegex(") 0 0 7 )"));
	}

	@Test
	public void testCase187(){
		assertEquals(false, bond.bondRegex(") 0 7 )"));
	}

	@Test
	public void testCase188(){
		assertEquals(false, bond.bondRegex(") 7 )"));
	}

	@Test
	public void testCase189(){
		assertEquals(false, bond.bondRegex("0 )"));
	}

	@Test
	public void testCase190(){
		assertEquals(false, bond.bondRegex("0 0 0 7 )"));
	}

	@Test
	public void testCase191(){
		assertEquals(false, bond.bondRegex("0 0 7 )"));
	}

	@Test
	public void testCase192(){
		assertEquals(false, bond.bondRegex("0 7 )"));
	}

	@Test
	public void testCase193(){
		assertEquals(false, bond.bondRegex("1 )"));
	}

	@Test
	public void testCase194(){
		assertEquals(false, bond.bondRegex("1 0 0 7 )"));
	}

	@Test
	public void testCase195(){
		assertEquals(false, bond.bondRegex("1 0 7 )"));
	}

	@Test
	public void testCase196(){
		assertEquals(false, bond.bondRegex("1 7 )"));
	}

	@Test
	public void testCase197(){
		assertEquals(false, bond.bondRegex("2 )"));
	}

	@Test
	public void testCase198(){
		assertEquals(false, bond.bondRegex("2 0 0 7 )"));
	}

	@Test
	public void testCase199(){
		assertEquals(false, bond.bondRegex("2 0 7 )"));
	}

	@Test
	public void testCase200(){
		assertEquals(false, bond.bondRegex("2 7 )"));
	}

	@Test
	public void testCase201(){
		assertEquals(false, bond.bondRegex("3 )"));
	}

	@Test
	public void testCase202(){
		assertEquals(false, bond.bondRegex("3 0 0 7 )"));
	}

	@Test
	public void testCase203(){
		assertEquals(false, bond.bondRegex("3 0 7 )"));
	}

	@Test
	public void testCase204(){
		assertEquals(false, bond.bondRegex("3 7 )"));
	}

	@Test
	public void testCase205(){
		assertEquals(false, bond.bondRegex("4 )"));
	}

	@Test
	public void testCase206(){
		assertEquals(false, bond.bondRegex("4 0 0 7 )"));
	}

	@Test
	public void testCase207(){
		assertEquals(false, bond.bondRegex("4 0 7 )"));
	}

	@Test
	public void testCase208(){
		assertEquals(false, bond.bondRegex("4 7 )"));
	}

	@Test
	public void testCase209(){
		assertEquals(false, bond.bondRegex("5 )"));
	}

	@Test
	public void testCase210(){
		assertEquals(false, bond.bondRegex("5 0 0 7 )"));
	}

	@Test
	public void testCase211(){
		assertEquals(false, bond.bondRegex("5 0 7 )"));
	}

	@Test
	public void testCase212(){
		assertEquals(false, bond.bondRegex("5 7 )"));
	}

	@Test
	public void testCase213(){
		assertEquals(false, bond.bondRegex("6 )"));
	}

	@Test
	public void testCase214(){
		assertEquals(false, bond.bondRegex("6 0 0 7 )"));
	}

	@Test
	public void testCase215(){
		assertEquals(false, bond.bondRegex("6 0 7 )"));
	}

	@Test
	public void testCase216(){
		assertEquals(false, bond.bondRegex("6 7 )"));
	}

	@Test
	public void testCase217(){
		assertEquals(false, bond.bondRegex("7 )"));
	}

	@Test
	public void testCase218(){
		assertEquals(false, bond.bondRegex("7 0 0 7 )"));
	}

	@Test
	public void testCase219(){
		assertEquals(false, bond.bondRegex("7 0 7 )"));
	}

	@Test
	public void testCase220(){
		assertEquals(false, bond.bondRegex("7 7 )"));
	}

	@Test
	public void testCase221(){
		assertEquals(false, bond.bondRegex("8 )"));
	}

	@Test
	public void testCase222(){
		assertEquals(false, bond.bondRegex("8 0 0 7 )"));
	}

	@Test
	public void testCase223(){
		assertEquals(false, bond.bondRegex("8 0 7 )"));
	}

	@Test
	public void testCase224(){
		assertEquals(false, bond.bondRegex("8 7 )"));
	}

	@Test
	public void testCase225(){
		assertEquals(false, bond.bondRegex("9 )"));
	}

	@Test
	public void testCase226(){
		assertEquals(false, bond.bondRegex("9 0 0 7 )"));
	}

	@Test
	public void testCase227(){
		assertEquals(false, bond.bondRegex("9 0 7 )"));
	}

	@Test
	public void testCase228(){
		assertEquals(false, bond.bondRegex("9 7 )"));
	}


}