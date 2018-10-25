package com.epam.store.template.api.domain.builder;

import com.epam.store.template.api.domain.DoSmthResponse;

public final class DoSmthResponseBuilder {

	private String field;

	private DoSmthResponseBuilder() {
	}

	public static DoSmthResponseBuilder aDoSmthResponse() {
		return new DoSmthResponseBuilder();
	}

	public DoSmthResponseBuilder withField(String field) {
		this.field = field;
		return this;
	}

	public DoSmthResponse build() {
		DoSmthResponse doSmthResponse = new DoSmthResponse();
		doSmthResponse.setField(field);
		return doSmthResponse;
	}
}
