package remap.microservice.kernel.config;

import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api")
public class RestConfig extends ResourceConfig implements InitializingBean{
	
	@Value("${namespace}")
	private String namespace;
	
	@Value("${server.port:8080}")
	private String port;
	
	@Value("${logging.trace.enabled}")
	private Boolean tracingEnabled;
	
	@Value("${swagger.title}")
	private String title;

	@Value("${swagger.version})")
	private String version;

	@Value("${swagger.description:}")
	private String description;

	@Value("${swagger.termsOfServiceUrl:}")
	private String termsOfServiceUrl;

	@Value("${swagger.contact:}")
	private String contact;

	@Value("${swagger.license:}")
	private String license;

	@Value("${swagger.licenseUrl:}")
	private String licenseUrl;

	
	@Override
	public void afterPropertiesSet() throws Exception {

		packages(namespace);
		
		//Registration of swagger resources, see https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-Jersey-2.X-Project-Setup-1.5
		register(io.swagger.jaxrs.listing.ApiListingResource.class);
		register(io.swagger.jaxrs.listing.SwaggerSerializers.class);

		 
		register(JacksonFeature.class);

		BeanConfig beanConfig = new BeanConfig();
		
		beanConfig.setSchemes(new String[] { "http" });
		beanConfig.setHost("localhost:" + port);
		beanConfig.setBasePath("/api");
		beanConfig.setResourcePackage(namespace);

		beanConfig.setVersion(version);
		beanConfig.setDescription(description);
		beanConfig.setTitle(title);
		beanConfig.setLicense(license);
		beanConfig.setLicenseUrl(licenseUrl);
		beanConfig.setContact(contact);
		
		beanConfig.setScan(true);		
	}

}