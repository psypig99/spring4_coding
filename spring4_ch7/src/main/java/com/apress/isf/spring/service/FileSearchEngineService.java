package com.apress.isf.spring.service;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.java.service.SearchEngine;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Sejun on 2015. 12. 29..
 */
@Component
@Profile("qa")
public class FileSearchEngineService implements SearchEngine{

	@Override
	public List<Document> findByType(Type documentType) {
		throw new UnsupportedOperationException("QA Environment. Not Yet implemented operation");
	}

	@Override
	public List<Document> listAll() {
		throw new UnsupportedOperationException("QA Environment. Not Yet implemented operation");
	}
}
