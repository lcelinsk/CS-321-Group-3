public class Workflow{
	//Class Attributes
	
	//Review queue
	private Node reviewWFHead = null;
	private Node reviewWFTail = null;
	int reviewCount = 0;
	
	//Approval queue
	private Node approvalWFHead = null;
	private Node approvalWFTail = null;
	int approvalCount = 0;
	
	//Node class for building the queues of the review and approval workflow in a singly-linked list structure
	private class Node{
		//Node Attributes
		private Node right = null;
		private Form form;
		
		//Constructor for creating a Node object
		public Node(Form form){
			this.form = form;
		}
		
		//Method for getting the form that is stored in the Node
		public Form getForm(){
			return this.form;
		}
		
		//Sets the current Node's link to a specified Node
		public void setRight(Node node){
			this.right = node;
		}
		
		//Retrieves the Node linked to the current Node
		public Node getRight(){
			return this.right;
		}
	}
	
	//Constructor for Workflow
	public Workflow(){
	}
	
	//Returns the total number of items in the review queue
	public int getReviewCount(){
		return reviewCount;
	}
	
	//Adding to the reviewWF queue
	public void addReviewWF(Form form){
		if(form == null){return;}
		if(reviewWFHead == null){
			reviewWFHead = new Node(form);
			reviewWFTail = reviewWFHead;
		}
		else{
			reviewWFTail.setRight(new Node(form));
			reviewWFTail = reviewWFTail.getRight();
		}
		
		reviewCount++;
	}
	
	//Taking the form from the front of the reviewWF queue
	public Form retriveReviewWF(){
		if(reviewWFHead == null){
			return null;
		}
		else{
			Form temp = reviewWFHead.getForm();
			reviewWFHead = reviewWFHead.getRight();
			reviewCount--;
			return temp;
		}
	}
	
	//Returns the total number of items from the approval queue
	public int getApprovalCount(){
		return approvalCount;
	}
	
	//Adding to the approvalWF queue
	public void addApprovalWF(Form form){
		if(form == null){return;}
		if(approvalWFHead == null){
			approvalWFHead = new Node(form);
			approvalWFTail = approvalWFHead;
		}
		else{
			approvalWFTail.setRight(new Node(form));
			approvalWFTail = approvalWFTail.getRight();
		}
		
		approvalCount++;
	}
	
	//Taking the form from the front of the approvalWF queue
	public Form approvalReviewWF(){
		if(approvalWFHead == null){
			return null;
		}
		else{
			Form temp = approvalWFHead.getForm();
			approvalWFHead = approvalWFHead.getRight();
			approvalCount--;
			return temp;
		}
	}
}