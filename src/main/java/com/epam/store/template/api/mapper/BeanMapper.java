package com.epam.store.template.api.mapper;

import com.epam.store.template.api.domain.DoSmthResponse;
import com.epam.store.template.service.domain.TemplateResult;

public interface BeanMapper {

	DoSmthResponse map(TemplateResult result);
}
