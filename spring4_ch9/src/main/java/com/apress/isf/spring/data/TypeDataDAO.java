package com.apress.isf.spring.data;

import com.apress.isf.java.model.Type;

/**
 * Created by Sejun on 2015. 12. 29..
 */
public interface TypeDataDAO {
	public Type[] getAll();
	public Type findById(String id);
}
