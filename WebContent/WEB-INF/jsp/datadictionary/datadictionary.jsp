<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<%@ include file="../comm/head.jsp"%>
<script type="text/javascript" src="js/datadictionary/datadictionary.js"></script>
</head>
<body class="easyui-layout" style="visibility: hidden" id="bodyId">
	<%-- 界面布局 --%>
	<div region="west" iconCls="datadictionary" title="数据字典类型管理" split="true" style="width:200px; padding:1px; overflow: auto;">
		<a href="javascript:addSDatadict()" class="easyui-linkbutton" plain="true" iconCls="datadictionary_add">新增</a>
		<a href="javascript:delSDatadict()" class="easyui-linkbutton" plain="true" iconCls="datadictionary_del">删除</a>
		<a href="javascript:editDatadict()" class="easyui-linkbutton" plain="true" iconCls="datadictionary_edit">修改</a>
		<hr/>
		<!-- 数据字典类型树 -->
		<ul id="sjzdlx" class="easyui-tree" ></ul>
	</div>	
	
	<div region="center" iconCls="datadictionary" title="数据字典管理" style="overflow: hidden;">
		<div class="easyui-layout" fit="true"> 
			<div class="easyui-panel" region="north" border="false" style="height: 60px; overflow: hidden;">
				<div style="clear: both;" class="SearchArea">
					字典类型：<input id="type" type="text" size="10"/>
					字典名称：<input id="name" type="text" size="10"/>
				<a href="javascript:queryDatadict()" class="easyui-linkbutton" plain="true" icon="icon-search" >查询</a>
				</div>
			</div>
			<div region="center" style="border: 1px;">
				<table id="tt" fit="true"  style="overflow: hidden; "></table>
			</div>
		</div>
	</div>
	
	<%-- 数据字典类型窗口 --%>
	<div id="win_datadictionarytype" class="easyui-window" closed="true" modal="true" title="用户管理" iconCls="ryxx" style="width: 300px; height: 150px; padding: 5px; background: #fafafa;">
		<div class="easyui-layout" fit="true">
			<div region="center" style="padding: 10px; background: #fff; border: 1px solid #ccc;overflow: hidden;">
				<form id="form_datadictionarytype" action="" method="post">
					<input type="hidden" id="id" name="id" value="0"/><!-- 用户id -->
					<table>
						<tr>
							<td align="right">类型名称：</td>
							<td><input id="text" name="text" type="text" class="easyui-validatebox" required="true" validType="length[2,50]"/><font color="red">*</font></td>
						</tr>
						<tr>
							<td align="right">排序号：</td>
							<td><input id="sequencenum" name="sequencenum" type="text" /></td>
						</tr>
					</table>
				</form>
			</div>
			<div region="south" border="false" style="text-align: right; height: 30px; line-height: 30px;">
				<a class="easyui-linkbutton" iconCls="icon-ok" href="javascript:void(0)" onclick="saveDatadicTionaryType()">保存</a>
				<a class="easyui-linkbutton" iconCls="icon-reset" href="javascript:void(0)" onclick="reset_win_datadict()">重置</a>
				<a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="cancel_win_datadict()">取消</a>
			</div>
		</div>
		</div>
</body>
</html>