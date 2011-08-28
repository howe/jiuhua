<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>会员注册</title>
<link href="../style/reg.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.2.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".more_of").toggle(function() {
			$(".more_with").removeClass("hide");
		}, function() {
			$(".more_with").addClass("hide");
		});
	});
</script>
</head>
<body>
	<div class="regwrap">
		<div class="clearfix" id="content">
			<div class="section">
				<span class="sec_top_dark"></span>
				<div class="sec_content">
					<h2 class="text">
						注册会员账号 <span class="direct_login text">已经有账号? <a href="#" title="登录">请直接登录</a> </span>
					</h2>
					<div class="reg-box">
						<p>
							<label for="nickname_reg">用户名：</label> <input type="text" maxlength="12" class="txt_input r3px" title="请输入用户名" />
						</p>
						<p>
							<label for="password_reg">密码：</label> <input type="password" name="password" maxlength="20"
								class="txt_input r3px" title="请输入密码" />
						</p>
						<p>
							<label for="verifypass">确认密码：</label> <input type="password" maxlength="20" class="txt_input r3px" title="请验证密码" />
						</p>
						<p>
							<label for="email_reg">电子邮箱：</label> <input type="text" class="noime txt_input r3px" title="请输入电子邮箱" />
						</p>
						<p>
							<label for="mobi_reg">手机号码：</label> <input type="text" class="noime txt_input r3px" title="请输入手机号码" />
						</p>
						<p>
							<label for="email_reg">密保安全码：</label> <input type="text" class="noime txt_input r3px" title="请输入密保安全码" />
						</p>
						<p class="label">
							<button type="submit">注册</button>
							<span id="submiting"></span>
						</p>
						<p class="label agreement">
							<input type="checkbox" checked="checked" name="agreement" id="agreement" class=""> 我已阅读并接受《<a
								target="_blank" title="《淘富蜜用户协议》" href="#">使用协议</a>》
						</p>
					</div>

					<div class="unlogin_side">
						<h3>通过合作网站直接登录：</h3>
						<ul class="reg_with">
							<li><a href="javascript:;" title="与新浪微博连接"><i class="icon sina"></i><span>新浪微博</span> </a></li>
							<li><a href="javascript:;" title="用TaobaoID登录"><i class="icon taobao"></i><span>淘宝</span> </a></li>
							<li><a href="javascript:;" title="支付宝快捷登录"><i class="icon alipay"></i><span>支付宝</span> </a></li>
							<li><a href="javascript:;" title="用QQ帐号登录"><i class="icon qq"></i><span>QQ</span> </a></li>
							<li class="more_of"><a href="javascript:;" class="more"><i class="icon more"></i><span title="更多合作网站登录">更多合作网站</span>
							</a></li>
						</ul>
						<ul class="more_with hide">
							<li><a href="#" class="go360" title="用360帐号登录"></a></li>
							<li><a href="#" class="renren" title="与人人网连接"></a></li>
							<li><a href="#" class="tx" title="与腾讯微博连接"></a></li>
							<li><a href="#" class="souhu" title="与搜狐微博连接"></a></li>
							<li><a href="#" class="go163" title="与网易微博链接"></a></li>
							<li><a href="#" class="google" title="与Google连接"></a></li>
							<li><a href="#" class="msn" title="用MSN帐号登录"></a></li>
							<li><a href="#" class="tianya" title="天涯社区用户登录接"></a></li>
							<li><a href="#" class="douban" title="用豆瓣帐号登录接"></a></li>
							<li><a href="#" class="yahoo" title="与Yahoo!连接"></a></li>
							<li><a href="#" class="baidu" title="与百度连接"></a></li>
							<li><a href="#" class="shengda" title="与盛大网络连接"></a></li>
							<li><a href="#" class="kaixin" title="用开心帐号登录接"></a></li>
							<li><a href="#" class="twitter" title="与twitter链接"></a></li>
							<li><a href="#" class="facebook" title="用FaceBook帐号登录"></a></li>
						</ul>
					</div>
				</div>
				<span class="sec_bot_dark"></span>
			</div>
		</div>
		<!-- #content -->
	</div>
</body>
</html>