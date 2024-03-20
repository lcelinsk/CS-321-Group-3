public class Workflow{
	//Class Attributes
	
	//Review queue
	private Node reviewWFHead = null;
	private Node reviewWFTail = null;
	
	//Approval queue
	private Node approvalWFHead = null;
	private Node approvalWFTail = null;
	
	
	private class Node{
		private Node right = null;
		private Form form;
		
		public Node(Form form){
			this.form = form;
		}
		
		public Form getForm(){
			return this.form;
		}
		
		public void setRight(Node node){
			this.right = node;
		}
		
		public Node getRight(){
			return this.right;
		}
	}
	
	//Constructor for Workflow
	public Workflow(){
	}
	
	//Adding to the reviewWF queue
	public void addReviewWF(Form form){
		if(reviewWFHead == null){
			reviewWFHead = new Node(new Form());
			reviewWFTail = reviewWFHead;
		}
		else{
			reviewWFTail.setRight(new Node(new Form()));
			reviewWFTail = reviewWFTail.getRight();
		}
	}
	
	//Taking the form from the front of the reviewWF queue
	public Form retriveReviewWF(){
		if(reviewWFHead == null){
			return null;
		}
		else{
			Form temp = reviewWFHead.getForm();
			reviewWFHead = reviewWFHead.getRight();
			return temp;
		}
	}
	
	//Adding to the approvalWF queue
	public void addApprovalWF(Form form){
		if(approvalWFHead == null){
			approvalWFHead = new Node(new Form());
			approvalWFTail = approvalWFHead;
		}
		else{
			approvalWFTail.setRight(new Node(new Form()));
			approvalWFTail = approvalWFTail.getRight();
		}
	}
	
	//Taking the form from the front of the approvalWF queue
	public Form approvalReviewWF(){
		if(approvalWFHead == null){
			return null;
		}
		else{
			Form temp = approvalWFHead.getForm();
			approvalWFHead = approvalWFHead.getRight();
			return temp;
		}
	}
}