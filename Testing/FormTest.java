import org.junit.*;

public class FormTest {

    @Before
    public void setup() {
        //setup test attourneys
        Attorney attrA = new Attorney();
        attrA.setFullName("Brian Sam");
        attrA.setBarID("A12345");
        attrA.setState("FL");

        Attorney attrB = new Attorney();
        attrB.setFullName("Matt Louis");
        attrB.setBarID("1234");
        attrB.setState("VA");

        //setup test form
        Form testForm = new Form();
        testForm.setRequireAttorney(true);
        testForm.setAttorney(attrA);
        testForm.setLegalAssistance("I need legal assistance NOW!");
        testForm.setFormCorrection("This form is terrible!");
        testForm.setApproved(true);
        testForm.setImmigrantEmail("email1@email.email");
        testForm.setID("A123");
    }

    @Test
    public void testSetRequireAttourney(){
        testForm.setRequireAttorney(false);
        Assert.assertEquals(testForm.getRequireAttorney(), false);
    }

    @Test
    public void testGetRequireAttourney(){
        Assert.assertEquals(testForm.getRequireAttorney(), true);
    }

    @Test
    public Attorney testSetAttorney(){
        testForm.setAttorney(attrB);
        Assert.assertEquals(testForm.getAttorney(), attrB);
	}

    @Test
    public Attorney testGetAttorney(){
        Assert.assertEquals(testForm.getAttorney(), attrA);
	}
	
    @Test
	public String testSetLegalAssistance(){
        testForm.setLegalAssistance("Assistance please?");
        Assert.assertEquals(testForm.getLegalAssistance(), "Assistance please?");
	}
	
    @Test
    public String testGetLegalAssistance(){
        Assert.assertEquals(testForm.getLegalAssistance(), "I need legal assistance NOW!");
	}

	@Test
    public String testSetFormCorrection(){
        testForm.setFormCorrection("Fix this form!");
        Assert.assertEquals(testForm.getFormCorrection(), "Fix this form!");
	}
	
    @Test
    public String testGetFormCorrection(){
        Assert.assertEquals(testForm.getFormCorrection(), "This form is terrible!");
	}

	@Test
    public boolean testSetApproved(){
        testForm.setApproved(false);
        Assert.assertEquals(testForm.getApproved(), false);
	}
	
	@Test
    public boolean testGetApproved(){
        Assert.assertEquals(testForm.getApproved(), true);
	}

    @Test
    public String testSetImmigrantEmail(){
        testForm.setImmigrantEmail("email2@email.email");
        Assert.assertEquals(testForm.getImmigrantEmail(), "email2@email.email");
	}
	
	@Test
    public String testGetImmigrantEmail(){
        Assert.assertEquals(testForm.getImmigrantEmail(), "email1@email.email");
	}
    
    @Test
    public String testSetID(){
        testForm.setID("B456");
        Assert.assertEquals(testForm.getID(), "B456");
	}
    
    @Test
    public String testGetID(){
        Assert.assertEquals(testForm.getID(), "A123");
	}
}