/** 
 * <pre>项目名称:dept-admin 
 * 文件名称:Area.java 
 * 包名:com.fh.shop.admin.po.area 
 * 创建日期:2018年10月8日下午3:57:33 
 * Copyright (c) 2018,  All 1799633042@qq.com Reserved.</pre> 
 */  
package com.fh.api.admin.area.po;

import java.io.Serializable;

/** 
 * <pre>项目名称：dept-admin    
 * 类名称：Area    
 * 类描述：    
 * 创建人：王须
 * 创建时间：2018年10月8日 下午3:57:33    
 * 修改人：王须
 * 修改时间：2018年10月8日 下午3:57:33    
 * 修改备注：       
 * @version </pre>    
 */
public class Area implements Serializable{

	private static final long serialVersionUID = 6356117116366608904L;

	private Integer areaId;
	
	private String areaName;
	
	private Integer parentId;

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "Area [areaId=" + areaId + ", areaName=" + areaName + ", parentId=" + parentId + "]";
	}

}
