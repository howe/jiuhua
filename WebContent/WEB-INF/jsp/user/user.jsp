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
	
	<%-- 新增用户窗口 --%>
	<div id="win_user" class="easyui-window" closed="true" modal="true" title="用户管理" iconCls="ryxx" style="width: 520px; height: 260px; padding: 5px; background: #fafafa;">
		<div class="easyui-layout" fit="true">
			<div region="center" style="padding: 10px; background: #fff; border: 1px solid #ccc;overflow: hidden;">
				<form id="addUserForm" action="" method="post">
					<input type="hidden" id="id"/><!-- 用户id -->
					<table>
						<tr>
							<td align="right">账户名称：</td>
							<td><input id="content.name" type="text" class="easyui-validatebox" required="true" validType="length[2,50]"/><font color="red">*</font></td>
						</tr>
						<tr>
							<td align="right">账户权限：</td>
							<td><input id="content.name" type="text" class="easyui-validatebox" required="true" /><font color="red">*</font></td>
							<td align="right">账户状态：</td>
							<td><input id="content.name" type="text" class="easyui-validatebox" required="true" /><font color="red">*</font></td>
						</tr>
						<tr>
							<td colspan="5"><hr/></td>
						</tr>
						<tr>
							<td align="right">真实姓名：</td>
							<td><input id="content.name" type="text" class="easyui-validatebox" required="true" validType="length[2,50]"/><font color="red">*</font></td>
							<td align="right">性别：</td>
							<td>
								<input id="content.field5" type="radio" value="在职" name="ryzt" checked="checked"/>男 
								<input type="radio" value="离职" name="ryzt" />女
							</td>
						</tr>
						<tr>
							<td align="right">身份证号：</td>
							<td><input id="content.field7" type="text" class="easyui-validatebox" required="true" validType="checkMobile[]"/><font id="sjchOk" color="blue" style="display: none;">√</font><font id="sjchError" color="blue" style="display: none;">×</font></td>
							<td align="right">电子邮箱：</td>
							<td><input id="content.field7" type="text" class="easyui-validatebox" required="true" validType="checkMobile[]"/><font id="sjchOk" color="blue" style="display: none;">√</font><font id="sjchError" color="blue" style="display: none;">×</font></td>
						</tr>
						<tr>
							<td align="right">手机号码：</td>
							<td><input id="content.field6" type="text" onblur="trafficNumber(this)"/></td>
							<td align="right">是否验证：</td>
							<td><input id="content.telephone" type="text" /></td>
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