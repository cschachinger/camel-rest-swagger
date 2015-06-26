package remap.microservice.kernel.collectionaccounts;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service(value = "collectionAccountService")
public class CollectionAccountService {

	public CollectionAccount getCollectionAccount(String id) {
		CollectionAccount c = new CollectionAccount();
		c.setId(id);
		return c;

	}

	public List<CollectionAccountSearchResult> findCollectionAccounts() {

		List<CollectionAccountSearchResult> list = new ArrayList<CollectionAccountSearchResult>();

		CollectionAccountSearchResult c1 = new CollectionAccountSearchResult();
		c1.setId(UUID.randomUUID().toString());
		c1.setId(UUID.randomUUID().toString());
		c1.setDescription("Max Creditor vs. Good Payer, closed");
		list.add(c1);

		c1 = new CollectionAccountSearchResult();
		c1.setId(UUID.randomUUID().toString());
		c1.setDescription("Max Creditor vs. Bad Payer, open, EUR 2.123,00 unpaid");
		list.add(c1);

		return list;
	}

}
