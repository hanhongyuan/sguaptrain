package com.sgcc.uap.demo.services;

import java.util.List;
import java.util.Map;

import com.sgcc.uap.demo.domain.Department;
import com.sgcc.uap.rest.support.IDRequestObject;
import com.sgcc.uap.rest.support.QueryResultObject;
import com.sgcc.uap.rest.support.RequestCondition;
import com.sgcc.uap.rest.support.TreeNode;

/**
 * <b>概述</b>：<br>
 *	TODO
 * <p>
 * <b>功能</b>：<br>
 *	TODO
 *
 * @author administrator
 * @date 2019-03-19 22:04:08
 * @since 1.0
 */
public interface IDepartmentService {
	public List<TreeNode> listNodes(String nodeId);
	/**
	 * 根据主键 查询
	 * @param queryCondition
	 * @return
	 */
	public QueryResultObject getDepartmentById(String id);
	/**
	 * 根据idObject删除
	 * @param idObject
	 */
	public void remove(IDRequestObject idObject);
	/**
	 * 保存
	 * @param map
	 * @return
	 */
	public Department saveDepartment(Map map);
	/**
	 * 根据查询条件 查询
	 * @param queryCondition
	 * @return
	 */
	public QueryResultObject query(RequestCondition queryCondition);
}
