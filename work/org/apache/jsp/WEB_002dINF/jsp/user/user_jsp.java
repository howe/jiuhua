package org.apache.jsp.WEB_002dINF.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/user/../comm/head.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>用户管理</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-1.6.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/comm/serializeObject.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var contextPath = \"");
      out.print(request.getContextPath());
      out.write("\";\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/user/user.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" style=\"visibility: hidden\" id=\"bodyId\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div region=\"center\" iconCls=\"user\" title=\"后台用户管理\" style=\"overflow: hidden;\">\r\n");
      out.write("\t\t<div class=\"easyui-layout\" fit=\"true\"> \r\n");
      out.write("\t\t\t<div class=\"easyui-panel\" region=\"north\" border=\"false\" style=\"height: 60px; overflow: hidden;\">\r\n");
      out.write("\t\t\t\t<div style=\"clear: both;\" class=\"SearchArea\">\r\n");
      out.write("\t\t\t\t\t账户名称：<input id=\"username\" type=\"text\" size=\"10\"/>\r\n");
      out.write("\t\t\t\t\t真实姓名：<input id=\"realname\" type=\"text\" size=\"10\"/>\r\n");
      out.write("\t\t\t\t\t身份证号：<input id=\"idcard\" type=\"text\" size=\"10\"/>\r\n");
      out.write("\t\t\t\t\t手机号码：<input id=\"mobinum\" type=\"text\" size=\"10\"/>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:queryUser()\" class=\"easyui-linkbutton\" plain=\"true\" icon=\"icon-search\" >查询</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div region=\"center\" style=\"border: 1px;\">\r\n");
      out.write("\t\t\t\t<table id=\"tt\" fit=\"true\"  style=\"overflow: hidden; \"></table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div id=\"win_user\" class=\"easyui-window\" closed=\"true\" modal=\"true\" title=\"用户管理\" iconCls=\"ryxx\" style=\"width: 520px; height: 260px; padding: 5px; background: #fafafa;\">\r\n");
      out.write("\t\t<div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("\t\t\t<div region=\"center\" style=\"padding: 10px; background: #fff; border: 1px solid #ccc;overflow: hidden;\">\r\n");
      out.write("\t\t\t\t<form id=\"addUserForm\" action=\"\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"id\" name=\"id\" value=\"0\"/><!-- 用户id -->\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">账户名称：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input id=\"username\" name=\"username\" type=\"text\" class=\"easyui-validatebox\" required=\"true\" validType=\"length[2,50]\"/><font color=\"red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">账户权限：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select id=\"identify\" name=\"identify\" class=\"easyui-combobox\" style=\"width: 155px; \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"0\">普通用户</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">VIP用户</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">管理员</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">账户状态：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select id=\"status\" name=\"status\" class=\"easyui-combobox\" style=\"width: 155px; \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"0\">禁止使用</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">正常使用</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"5\"><hr/></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">真实姓名：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input id=\"realname\" name=\"realname\" type=\"text\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" value=\"男\" name=\"sex\" checked=\"checked\"/>男 \r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" value=\"女\" name=\"sex\" />女\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">身份证号：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input id=\"idcard\" name=\"idcard\" type=\"text\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">电子邮箱：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input id=\"email\" name=\"email\" type=\"text\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">手机号码：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input id=\"mobinum\" name=\"mobinum\" type=\"text\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">是否验证：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" value=\"是\" name=\"isverify\" />是 \r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" value=\"否\" name=\"isverify\" checked=\"checked\"/>否\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div region=\"south\" border=\"false\" style=\"text-align: right; height: 30px; line-height: 30px;\">\r\n");
      out.write("\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\" href=\"javascript:void(0)\" onclick=\"saveUser()\">保存</a>\r\n");
      out.write("\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-reset\" href=\"javascript:void(0)\" onclick=\"resetWin()\">重置</a>\r\n");
      out.write("\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" href=\"javascript:void(0)\" onclick=\"cancel()\">取消</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
