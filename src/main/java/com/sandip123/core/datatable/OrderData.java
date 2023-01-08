package com.tirmizee.core.datatable;

import lombok.Data;

/**
 * wrapper for datatables.js  
 * 
 * @author pratya yeekhaday
 * @see https://datatables.net/manual/server-side
 */

@Data
public class OrderData {

	private Long column;
	private String dir;
	
}
