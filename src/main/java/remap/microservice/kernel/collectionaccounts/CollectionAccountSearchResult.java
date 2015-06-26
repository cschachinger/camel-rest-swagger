package remap.microservice.kernel.collectionaccounts;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "searchresult")
public class CollectionAccountSearchResult {
	private String id;
	private String description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
