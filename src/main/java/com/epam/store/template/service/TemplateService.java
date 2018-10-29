package com.epam.store.template.service;

import com.epam.store.template.service.domain.TemplateResult;
import com.epam.store.template.service.domain.builder.TemplateResultBuilder;
import io.sphere.sdk.client.BlockingSphereClient;
import io.sphere.sdk.products.ProductProjection;
import io.sphere.sdk.products.ProductProjectionType;
import io.sphere.sdk.products.search.ProductProjectionSearch;
import io.sphere.sdk.search.PagedSearchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateService implements CommerceService {

	private Logger logger = LoggerFactory.getLogger(TemplateService.class);

	@Autowired private BlockingSphereClient client;

	public TemplateResult doSmth() {
		logger.info("Doing smth");
//		ProductProjectionSearch productRequest = ProductProjectionSearch.ofCurrent()
//				.withMarkingMatchingVariants(false)
//				.withLimit(1);
//		PagedSearchResult<ProductProjection> result = client.executeBlocking(productRequest);
		return TemplateResultBuilder.aTemplateResult()
				.withField("template")
				.build();
	}
}
