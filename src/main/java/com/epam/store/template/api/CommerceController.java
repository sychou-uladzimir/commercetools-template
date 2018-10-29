package com.epam.store.template.api;

import com.epam.store.template.api.domain.DoSmthResponse;
import com.epam.store.template.api.mapper.BeanMapper;
import com.epam.store.template.service.CommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommerceController {

	@Autowired private CommerceService service;
	@Autowired private BeanMapper mapper;

	@GetMapping(path = "/template")
	@ResponseBody
	public DoSmthResponse doSmth() {
		return mapper.map(service.doSmth());
	}
}
