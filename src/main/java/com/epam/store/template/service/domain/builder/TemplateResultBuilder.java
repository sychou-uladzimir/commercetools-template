package com.epam.store.template.service.domain.builder;

import com.epam.store.template.service.domain.TemplateResult;

public final class TemplateResultBuilder {

	private String field;

	private TemplateResultBuilder() {
	}

	public static TemplateResultBuilder aTemplateResult() {
		return new TemplateResultBuilder();
	}

	public TemplateResultBuilder withField(String field) {
		this.field = field;
		return this;
	}

	public TemplateResult build() {
		TemplateResult templateResult = new TemplateResult();
		templateResult.setField(field);
		return templateResult;
	}
}
