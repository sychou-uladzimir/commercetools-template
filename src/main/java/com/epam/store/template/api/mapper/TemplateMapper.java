package com.epam.store.template.api.mapper;

import com.epam.store.template.api.domain.DoSmthResponse;
import com.epam.store.template.api.domain.builder.DoSmthResponseBuilder;
import com.epam.store.template.service.domain.TemplateResult;
import org.springframework.stereotype.Component;

@Component
public class TemplateMapper implements BeanMapper {

	public DoSmthResponse map(TemplateResult result) {
		return DoSmthResponseBuilder.aDoSmthResponse()
				.withField(result.getField())
				.build();
	}
}
