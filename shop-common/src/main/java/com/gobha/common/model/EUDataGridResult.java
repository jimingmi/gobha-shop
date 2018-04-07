package com.gobha.common.model;

import java.util.List;

/**
 * EasyUI返回Bean
 * 
 * @author gobhazeng
 *
 * @date 2018年4月7日 下午11:51:46
 */
public class EUDataGridResult {

	private long total;
	private List<?> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
