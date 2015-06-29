package remap.microservice.kernel.collectionaccounts;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;


@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("collection-account")
@Api(value = "collection-account", description = "operations on a collection acccount")
@Component
public class CollectionAccountResource {

	@Inject
	CollectionAccountService collectionAccountService;

	@Path("{id}")
	@GET
	@ApiOperation(value = "get a collection account",
			notes = "some notes...")
	public CollectionAccount getCollectionAccount(@PathParam("id") String id) {
		return collectionAccountService.getCollectionAccount(id);
	}

}
