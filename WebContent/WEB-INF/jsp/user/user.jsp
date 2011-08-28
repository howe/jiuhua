<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<%@ include file="../comm/head.jsp"%>
<script type="text/javascript" src="js/user/user.js"></script>
</head>
<body class="easyui-layout" style="visibility: hidden" id="bodyId">
	<%-- 界面布局 --%>
	<div region="center" iconCls="user" title="后台用户管理" style="overflow: hidden;">
		<div class="easyui-layout" fit="true"> 
			<div class="easyui-panel" region="north" border="false" style="height: 60px; overflow: hidden;">
				<div style="clear: both;" class="SearchArea">
					账户名称：<input id="username" type="text" size="10"/>
					真实姓名：<input id="realname" type="text" size="10"/>
					身份证号：<input id="idcard" type="text" size="10"/>
					手机号码：<input id="mobinum" type="text" size="10"/>
					<a href="javascript:queryUser()" class="easyui-linkbutton" plain="true" icon="icon-search" >查询</a>
				</div>
			</div>
			<div region="center" style="border: 1px;">
				<table id="tt" fit="true"  style="overflow: hidden; "></table>
			</div>
		</div>
	</div>
</body>
</html>