import org.junit.*;

public class WorkflowTest{
	
	@Test
	public void testAddReviewWF(){
		Workflow wf = new Workflow();
		Form form1 = new Form();
		wf.addReviewWF(form1);
		Assert.assertEquals(1, wf.getReviewCount());
	}
	
	@Test
	public void testAddReviewWF2(){
		Workflow wf = new Workflow();
		Form form1 = new Form();
		Form form2 = new Form();
		wf.addReviewWF(form1);
		wf.addReviewWF(form2);	
		Assert.assertEquals(2, wf.getReviewCount());
	}
	
	@Test
	public void testAddAndRetrieveReviewWF(){
		Workflow wf = new Workflow();
		Form form1 = new Form();
		wf.addReviewWF(form1);
		Assert.assertEquals(1, wf.getReviewCount());
		Assert.assertEquals(form1, wf.retrieveReviewWF());
		Assert.assertEquals(0, wf.getReviewCount());
	}
	
	@Test
	public void testAddAndRetrieveReviewWF2(){
		Workflow wf = new Workflow();
		Form form1 = new Form();
		Form form2 = new Form();
		wf.addReviewWF(form1);
		wf.addReviewWF(form2);	
		Assert.assertEquals(2, wf.getReviewCount());
		Assert.assertEquals(form1, wf.retrieveReviewWF());
		Assert.assertEquals(1, wf.getReviewCount());
		Assert.assertEquals(form2, wf.retrieveReviewWF());
		Assert.assertEquals(0, wf.getReviewCount());
		Assert.assertNull(wf.retrieveReviewWF());
	}
	
	@Test
	public void testCornerCaseRetrieveReviewWF(){
		Workflow wf = new Workflow();
		Assert.assertEquals(0, wf.getReviewCount());
		Assert.assertNull(wf.retrieveReviewWF());
	}
}