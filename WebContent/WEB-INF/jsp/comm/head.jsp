<%-- 解决公共页面中文乱码问题 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%-- easyUI Support --%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/easyui/themes/icon.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/comm/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/comm/serializeObject.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/comm/json2form.js"></script>

<%-- 项目上下文路径 --%>
<script type="text/javascript">
var contextPath = "<%=request.getContextPath()%>";
</script>