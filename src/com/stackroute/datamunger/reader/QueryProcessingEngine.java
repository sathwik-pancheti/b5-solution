package com.stackroute.datamunger.reader;

import com.stackroute.datamunger.query.DataSet;
import com.stackroute.datamunger.query.parser.QueryParameter;
import java.io.FileNotFoundException;

public interface QueryProcessingEngine {

	public DataSet getResultSet(QueryParameter queryParameter) throws Exception;
	
}
