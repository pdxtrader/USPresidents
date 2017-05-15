package data;

public class President {
	private int termNumber;
	private String name;
	private String party;
	private String termBeginDate;
	private String termEndDate;
	private String picURL;
	private String fact;

	public President(int termNumber, String name, String party, String termBeginDate, String termEndDate,
			String picURL, String fact) {
		super();
		this.termNumber = termNumber;
		this.name = name;
		this.party = party;
		this.termBeginDate = termBeginDate;
		this.termEndDate = termEndDate;
		this.picURL = picURL;
		this.fact = fact;
	}
	
	public President() {
		super();
	}
	
	public int getTermNumber() {
		return termNumber;
	}
	
	public void setTermNumber(int termNumber) {
		this.termNumber = termNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getParty() {
		return party;
	}
	
	public void setParty(String party) {
		this.party = party;
	}
	
	public String getTermBeginDate() {
		return termBeginDate;
	}
	
	public void setTermBeginDate(String termBeginDate) {
		this.termBeginDate = termBeginDate;
	}
	
	public String getTermEndDate() {
		return termEndDate;
	}
	
	public void setTermEndDate(String termEndDate) {
		this.termEndDate = termEndDate;
	}

	public String getPicURL() {
		return picURL;
	}
	
	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}
	
	public String getFact() {
		return fact;
	}
	
	public void setFact(String fact) {
		this.fact = fact;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("President [termNumber=");
		builder.append(termNumber);
		builder.append(", name=");
		builder.append(name);
		builder.append(", party=");
		builder.append(party);
		builder.append(", termBeginDate=");
		builder.append(termBeginDate);
		builder.append(", termEndDate=");
		builder.append(termEndDate);
		builder.append(", picURL=");
		builder.append(picURL);
		builder.append(", fact=");
		builder.append(fact);
		builder.append("]");
		return builder.toString();
	}


}
