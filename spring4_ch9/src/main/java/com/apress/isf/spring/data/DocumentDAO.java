package com.apress.isf.spring.data;

import com.apress.isf.java.model.Document;

import java.util.List;

/**
 * Created by Sejun on 2015. 12. 29..
 */
public interface DocumentDAO {
	public List<Document> getAll();
}
