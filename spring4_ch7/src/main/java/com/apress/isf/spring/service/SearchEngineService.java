package com.apress.isf.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.java.service.SearchEngine;
import com.apress.isf.spring.data.DocumentDAO;

public class SearchEngineService implements SearchEngine {

	private static final Logger log =
			LoggerFactory.getLogger(SearchEngineService.class);

	private DocumentDAO documentDAO;


	public SearchEngineService() {
	}

	public DocumentDAO getDocumentDAO() {
		return documentDAO;
	}

	public void setDocumentDAO(DocumentDAO documentDAO) {
		this.documentDAO = documentDAO;
	}

	public List<Document> findByType(Type documentType) {

		List<Document>  result = new ArrayList<Document>();
		for (Document doc : listAll()) {
			if (doc.getType().getName().equals(documentType.getName()))
				result.add(doc);
		}

		return result;
	}

	public List<Document> listAll() {
		List<Document> result = Arrays.asList(documentDAO.getAll());
		return result;
	}

	@Override
	public List<Document> findByLocation(String location) {
		throw new UnsupportedOperationException("findByLocation not yet implemented");
	}

}
