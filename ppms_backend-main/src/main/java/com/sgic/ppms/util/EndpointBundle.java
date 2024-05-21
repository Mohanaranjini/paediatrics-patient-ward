package com.sgic.ppms.util;

public class EndpointBundle {
	public static final String BASE_URL="api/v1/";
	public static final String ETHNICITY = BASE_URL+"ethnicity";
	public static final String GET_ALL = ETHNICITY+"/get/all";
	public static final String GET_BY_ID = ETHNICITY+"/get/{id}";
	public static final String CREATE = ETHNICITY+"/all";
	public static final String UPDATE = ETHNICITY+"/update/{id}";
	public static final String DELETE = ETHNICITY+"/delete/{id}";
	public static final String CREATE_CHILD_API = BASE_URL + "/child";


	//encaptulate constructor to restrict modification from outside
	private EndpointBundle() {
	}
}
