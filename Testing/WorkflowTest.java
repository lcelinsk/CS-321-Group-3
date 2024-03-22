import org.junit.*;

public class WorkflowTest{
	
	@Test
	public void testAddReviewWF(){  //Test for making sure that the add function does add a new form when the queue is empty
		Workflow wf = new Workflow();
		Form form1 = new Form();
		wf.addReviewWF(form1);
		Assert.assertEquals(1, wf.getReviewCount());
	}
	
	@Test
	public void testAddReviewWF2(){  //Test to enure that the add function creates the queue and adds additional forms to the queue
		Workflow wf = new Workflow();
		Form form1 = new Form();
		Form form2 = new Form();
		wf.addReviewWF(form1);
		wf.addReviewWF(form2);	
		Assert.assertEquals(2, wf.getReviewCount());
	}
	
	@Test
	public void testAddAndRetrieveReviewWF(){ //Now tests that the retrieve function works correctly and takes from the "front" of the queue as well as decreases the queue size by 1
		Workflow wf = new Workflow();
		Form form1 = new Form();
		wf.addReviewWF(form1);
		Assert.assertEquals(1, wf.getReviewCount());
		Assert.assertEquals(form1, wf.retrieveReviewWF());
		Assert.assertEquals(0, wf.getReviewCount());
	}
	
	@Test
	public void testAddAndRetrieveReviewWF2(){ //Tests that the retrieve function works for a queue with multiple forms as well as stops removing forms when the queue is empty
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
	public void testCornerCaseRetrieveReviewWF(){ //Makes sure the retrieve function returns a null when nothing has been added to the queue yet
		Workflow wf = new Workflow();
		Assert.assertEquals(0, wf.getReviewCount());
		Assert.assertNull(wf.retrieveReviewWF());
	}
	
	
	//Approval tests; follow the same tests as the review workflow
	@Test
	public void testAddApprovalWF(){
		Workflow wf = new Workflow();
		Form form1 = new Form();
		wf.addApprovalWF(form1);
		Assert.assertEquals(1, wf.getApprovalCount());
	}
	
	@Test
	public void testAddApprovalWF2(){
		Workflow wf = new Workflow();
		Form form1 = new Form();
		Form form2 = new Form();
		wf.addApprovalWF(form1);
		wf.addApprovalWF(form2);	
		Assert.assertEquals(2, wf.getApprovalCount());
	}
	
	@Test
	public void testAddAndRetrieveApprovalWF(){
		Workflow wf = new Workflow();
		Form form1 = new Form();
		wf.addApprovalWF(form1);
		Assert.assertEquals(1, wf.getApprovalCount());
		Assert.assertEquals(form1, wf.retrieveApprovalWF());
		Assert.assertEquals(0, wf.getApprovalCount());
	}
	
	@Test
	public void testAddAndRetrieveApprovalWF2(){
		Workflow wf = new Workflow();
		Form form1 = new Form();
		Form form2 = new Form();
		wf.addApprovalWF(form1);
		wf.addApprovalWF(form2);	
		Assert.assertEquals(2, wf.getApprovalCount());
		Assert.assertEquals(form1, wf.retrieveApprovalWF());
		Assert.assertEquals(1, wf.getApprovalCount());
		Assert.assertEquals(form2, wf.retrieveApprovalWF());
		Assert.assertEquals(0, wf.getApprovalCount());
		Assert.assertNull(wf.retrieveApprovalWF());
	}
	
	@Test
	public void testCornerCaseRetrieveApprovalWF(){
		Workflow wf = new Workflow();
		Assert.assertEquals(0, wf.getApprovalCount());
		Assert.assertNull(wf.retrieveApprovalWF());
	}
}