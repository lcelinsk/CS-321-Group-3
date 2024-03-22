public class Form{
	//Class attributes
	private boolean requireAttorney = false;
	private Attorney attorney = null;
	private String legalAssistance = "";
	private String formCorrection = "";
	private boolean approved = false;
	private String immigrantEmail = "";
	private String ID = "";
	
	//Contructor method for the Form object
	public Form(){}
	
	//Getter methods for all Form attributes
	public boolean getRequireAttorney(){
		return this.requireAttorney;
	}
	
	public Attorney getAttorney(){
		return this.attorney;
	}
	
	public String getLegalAssistance(){
		return this.legalAssistance;
	}
	
	public String getFormCorrection(){
		return this.formCorrection;
	}
	
	public boolean getApproved(){
		return this.approved;
	}
	
	public String getImmigrantEmail(){
		return this.immigrantEmail;
	}
	
	public String getID(){
		return ID;
	}
	
	//Setter methods for all Form attributes
	public void setRequireAttorney(String requireAttorney){
		this.requireAttorney = requireAttorney;
	}
	
	public void setAttorney(Attorney attorney){
		this.attorney = attorney;
	}
	
	public void setLegalAssistance(String legalAssistance){
		this.legalAssistance = legalAssistance;
	}
	
	public void setFormCorrection(String formCorrection){
		this.formCorrection = formCorrection;
	}
	
	public void setApproved(boolean approved){
		this.approved = approved;
	}
	
	public void setImmigrantEmail(String immigrantEmail){
		this.immigrantEmail = immigrantEmail;
	}
	
	public void setID(String ID){
		this.ID = ID;
	}
}