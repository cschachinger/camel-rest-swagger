package remap.microservice.kernel.collectionaccounts;

import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import remap.microservice.kernel.AbstractRouteBuilder;

@Component
public class CollectionAccountRoute extends AbstractRouteBuilder {
	@Override
	public void configure() throws Exception {
		super.configure();

		// servlet is configured in Application.java
		restConfiguration().component("servlet").bindingMode(RestBindingMode.json);

		//@formatter:off
		rest("/collection-accounts").description("Operations on collection accounts")
			.get("/")
				.description("Finds collection accounts")
				.outTypeList(CollectionAccountSearchResult.class)
				.to("bean:collectionAccountService?method=findCollectionAccounts(${header.debtor_reference})")
				
			.get("/{id}")
				.description("Retrieves a collection account")
				.outType(CollectionAccount.class)
				.to("bean:collectionAccountService?method=getCollectionAccount(${header.id})");
		
		//@formatter:on

	}

}
