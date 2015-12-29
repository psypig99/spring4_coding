package com.apress.isf.spring.annotated.data;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.spring.data.DocumentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sejun on 2015. 12. 29..
 */
@Repository("documentDAO")
public class AnnotatedDocumentRepository implements DocumentDAO{

	private static final String queryAll =
			" select d.documentId, d.name, d.location, d.description as doc_desc, " +
					"d.typeId, d.created, d.modified, " +
					"t.name as type_name, t.description as type_desc, " +
					"t.extension from documents d join types t on d.typeId = t.typeId";

	@Autowired
	private DataSource dataSource;


	@Override
	public List<Document> getAll() {
		List<Document> result = new ArrayList<>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		Document document = null;
		Type type = null;

		try {
			connection=dataSource.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(queryAll);
			while (resultSet.next()) {
				document = new Document();
				document.setDocumentId(resultSet.getString("documentId"));
				document.setName(resultSet.getString("name"));
				document.setLocation(resultSet.getString("location"));
				document.setCreated(resultSet.getDate("created"));
				document.setModified(resultSet.getDate("modified"));
				document.setDescription("doc_desc");
				type = new Type();
				type.setTypeId(resultSet.getString("typeId"));
				type.setName(resultSet.getString("type_name"));
				type.setDesc(resultSet.getString("type_desc"));
				type.setExtension(resultSet.getString("extension"));
				document.setType(type);

				result.add(document);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != connection) {
				try{
					connection.close();
				} catch (SQLException e){

				}
			}
		}

		return result;
	}
}
