package remap.microservice.kernel.collectionaccounts;

import org.springframework.stereotype.Service;

@Service
public class CollectionAccountService {

	public CollectionAccount getCollectionAccount(String id) {
		CollectionAccount c = new CollectionAccount();
		c.setId(id);
		return c;

	}

}
