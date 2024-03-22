import org.junit.*;

public class testForm {

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
        Form testForm = new Form();
        testForm.setRequireAttorney(false);
        Assert.assertEquals(testForm.getRequireAttorney(), false);
    }

    @Test
    public void testGetRequireAttourney(){
        Form testForm = new Form();
        Assert.assertEquals(testForm.getRequireAttorney(), false);
    }

    @Test
    public void testSetAttorney(){
        Form testForm = new Form();
        Attorney attrB = new Attorney();
        testForm.setAttorney(attrB);
        Assert.assertEquals(testForm.getAttorney(), attrB);
	}

    @Test
    public void testGetAttorney(){
        Form testForm = new Form();
        Attorney attrA = new Attorney();
        testForm.setAttorney(attrA);
        Assert.assertEquals(testForm.getAttorney(), attrA);
	}
	
    @Test
	public void testSetLegalAssistance(){
        Form testForm = new Form();
        testForm.setLegalAssistance("Assistance please?");
        Assert.assertEquals(testForm.getLegalAssistance(), "Assistance please?");
	}
	
    @Test
    public void testGetLegalAssistance(){
        Form testForm = new Form();
        testForm.setLegalAssistance("I need legal assistance NOW!");
        Assert.assertEquals(testForm.getLegalAssistance(), "I need legal assistance NOW!");
	}

	@Test
    public void testSetFormCorrection(){
        Form testForm = new Form();
        testForm.setFormCorrection("Fix this form!");
        Assert.assertEquals(testForm.getFormCorrection(), "Fix this form!");
	}
	
    @Test
    public void testGetFormCorrection(){
        Form testForm = new Form();
        testForm.setFormCorrection("This form is terrible!");
        Assert.assertEquals(testForm.getFormCorrection(), "This form is terrible!");
	}

	@Test
    public void testSetApproved(){
        Form testForm = new Form();
        testForm.setApproved(false);
        Assert.assertEquals(testForm.getApproved(), false);
	}
	
	@Test
    public void testGetApproved(){
        Form testForm = new Form();
        Assert.assertEquals(testForm.getApproved(), false);
	}

    @Test
    public void testSetImmigrantEmail(){
        Form testForm = new Form();
        testForm.setImmigrantEmail("email2@email.email");
        Assert.assertEquals(testForm.getImmigrantEmail(), "email2@email.email");
	}
	
	@Test
    public void testGetImmigrantEmail(){
        Form testForm = new Form();
        testForm.setImmigrantEmail("email1@email.email");
        Assert.assertEquals(testForm.getImmigrantEmail(), "email1@email.email");
	}
    
    @Test
    public void testSetID(){
        Form testForm = new Form();
        testForm.setID("B456");
        Assert.assertEquals(testForm.getID(), "B456");
	}
    
    @Test
    public void testGetID(){
        Form testForm = new Form();
        testForm.setID("A123");
        Assert.assertEquals(testForm.getID(), "A123");
	}
}
