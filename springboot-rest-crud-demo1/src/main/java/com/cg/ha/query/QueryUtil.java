package com.cg.ha.query;

public class QueryUtil {
	private QueryUtil() {
	}
	public static final String VIEW_pat_BY_ID = "SELECT a FROM Patient a WHERE a.patientId like ?1";

}
