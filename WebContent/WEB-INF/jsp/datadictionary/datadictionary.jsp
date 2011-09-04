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
	<div region="west" iconCls="datadict" title="数据字典类型管理" split="true" style="width:200px; padding:1px; overflow: auto;">
		<a href="javascript:addSDatadict()" class="easyui-linkbutton" plain="true" iconCls="datadict_add">新增</a>
		<a href="javascript:delSDatadict()" class="easyui-linkbutton" plain="true" iconCls="datadict_del">删除</a>
		<a href="javascript:editDatadict()" class="easyui-linkbutton" plain="true" iconCls="datadict_edit">修改</a>
		<hr/>
		<!-- 数据字典类型树 -->
		<ul id="sjzdlx" class="easyui-tree" ></ul>
	</div>	
	
	<div region="center" iconCls="sjzd" title="数据字典管理" style="overflow: hidden;">
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
	
	<%-- 新增用户窗口 --%>
	<div id="win_user" class="easyui-window" closed="true" modal="true" title="用户管理" iconCls="ryxx" style="width: 520px; height: 260px; padding: 5px; background: #fafafa;">
		<div class="easyui-layout" fit="true">
			<div region="center" style="padding: 10px; background: #fff; border: 1px solid #ccc;overflow: hidden;">
				<form id="addUserForm" action="" method="post">
					<input type="hidden" id="id" name="id" value="0"/><!-- 用户id -->
					<table>
						<tr>
							<td align="right">账户名称：</td>
							<td><input id="username" name="username" type="text" class="easyui-validatebox" required="true" validType="length[2,50]"/><font color="red">*</font></td>
						</tr>
						<tr>
							<td align="right">账户权限：</td>
							<td>
								<select id="identify" name="identify" class="easyui-combobox" style="width: 155px; ">
									<option value="0">普通用户</option>
									<option value="1">VIP用户</option>
									<option value="2">管理员</option>
								</select>
							</td>
							<td align="right">账户状态：</td>
							<td>
								<select id="status" name="status" class="easyui-combobox" style="width: 155px; ">
									<option value="0">禁止使用</option>
									<option value="1" selected="selected">正常使用</option>
								</select>
							</td>
						</tr>
						<tr>
							<td colspan="5"><hr/></td>
						</tr>
						<tr>
							<td align="right">真实姓名：</td>
							<td><input id="realname" name="realname" type="text" /></td>
							<td align="right">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
							<td>
								<input type="radio" value="男" name="sex" checked="checked"/>男 
								<input type="radio" value="女" name="sex" />女
							</td>
						</tr>
						<tr>
							<td align="right">身份证号：</td>
							<td><input id="idcard" name="idcard" type="text" /></td>
							<td align="right">电子邮箱：</td>
							<td><input id="email" name="email" type="text" /></td>
						</tr>
						<tr>
							<td align="right">手机号码：</td>
							<td><input id="mobinum" name="mobinum" type="text" /></td>
							<td align="right">是否验证：</td>
							<td>
								<input type="radio" value="是" name="isverify" />是 
								<input type="radio" value="否" name="isverify" checked="checked"/>否
							</td>
						</tr>
					</table>
				</form>
			</div>
			<div region="south" border="false" style="text-align: right; height: 30px; line-height: 30px;">
				<a class="easyui-linkbutton" iconCls="icon-ok" href="javascript:void(0)" onclick="saveUser()">保存</a>
				<a class="easyui-linkbutton" iconCls="icon-reset" href="javascript:void(0)" onclick="resetWin()">重置</a>
				<a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="cancel()">取消</a>
			</div>
		</div>
		</div>
</body>
</html>