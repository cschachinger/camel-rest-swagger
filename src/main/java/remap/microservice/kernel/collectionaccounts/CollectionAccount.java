package remap.microservice.kernel.collectionaccounts;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "collection-account")
public class CollectionAccount {
	String id;
	String currency;

	public String getId() {
		return id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}