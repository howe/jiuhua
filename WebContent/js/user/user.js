
/** 程序初始化 */
$(function() {
	$('#bodyId').css('visibility', 'visible');

	$('#tt').datagrid({
		nowrap : false,
		striped : true,
		border : false,
		// url : '',
		// queryParams : {},
		sortName : '',
		sortOrder : 'ASC',// DESC 降序，ASC升序
		columns : [[{
					field : 'ck',
					title : '全选取消',
					checkbox : true,
					width : 80
				},
				// {
				// field : 'productid',
				// title : '序号',
				// width : 100,
				// align : 'right'
				// },
				{
					field : 'username',
					title : '账户名称',
					width : 65
				}, {
					field : 'realname',
					title : '真实姓名',
					width : 65
				}, {
					field : 'idcard',
					title : '身份证号',
					width : 65
				}, {
					field : 'mobinum',
					title : '手机号码',
					width : 65
				}, {
					field : 'isverify',
					title : '是否验证',
					width : 70,
					formatter : function(value, rec) {
						for (var i = 0; i < P01_RYXZ.length; i++) {
							if (P01_RYXZ[i].z == value) {
								return P01_RYXZ[i].text;
							}
						}
					}
				}, {
					field : 'email',
					title : '电子邮箱',
					width : 70,
					formatter : function(value, rec) {
						for (var i = 0; i < P01_RYZT.length; i++) {
							if (P01_RYZT[i].z == value) {
								return P01_RYZT[i].text;
							}
						}
					}
				}, {
					field : 'identify',
					title : '账户权限',
					width : 70
				}, {
					field : 'status',
					title : '账户状态',
					width : 100,
					formatter : function(value, rec) {
						var s = value.replace(/,/g, "");
						var lastIndex = value.lastIndexOf(',') + 1;
						var ss = value.substring(lastIndex);
						// if(ss.length>5){
						// ss=ss.substring(0, 5)+"...";
						// }
						return "<a title='" + s + "'>" + ss + "</a>";
					}
				}, {
					field : 'action',
					title : '操作',
					rowspan : 3,
					width : 190,
					formatter : function(value, rec) {
						var select = '<a class="l-btn l-btn-plain" style="float:left;" href="javascript: selectUser(\''
								+ rec.id + '\');">';
						select += ' <span class="l-btn-left" style="float: left;">';
						select += ' <span class="l-btn-text ryxx" style="padding-left: 20px;">查看</span>';
						select += ' </span>';
						select += ' </a>';
						var edit = '<a class="l-btn l-btn-plain" style="float:left;" href="javascript: editUser(\''
								+ rec.id + '\');">';
						edit += ' <span class="l-btn-left" style="float: left;">';
						edit += ' <span class="l-btn-text ryxx_edit" style="padding-left: 20px;">修改</span>';
						edit += ' </span>';
						edit += ' </a>';
						var role = '<a class="l-btn l-btn-plain" style="float:left;" href="javascript: rolesSelectTree(\'ALL\');">';
						role += ' <span class="l-btn-left" style="float: left;">';
						role += ' <span class="l-btn-text xtjs_edit" style="padding-left: 20px;">角色设置</span>';
						role += ' </span>';
						role += ' </a>';
						// return edit+role;
						var del = '<a class="l-btn l-btn-plain" style="float:left;" href="javascript: sure(\''
								+ rec.id + '\');">';
						del += ' <span class="l-btn-left" style="float: left;">';
						del += ' <span class="l-btn-text ryxx_del" style="padding-left: 20px;">删除</span>';
						del += ' </span>';
						del += ' </a>';
						return select + edit + del;
					}
				}]],
		toolbar : [{
					id : 'btnadd',
					text : '新增',
					iconCls : 'user_add',
					handler : function() {
						addUser();
					}
				}, {
					id : 'btncut',
					text : '批量删除',
					iconCls : 'user_del',
					handler : function() {
						sure();
					}
				}],
		pagination : true,
		rownumbers : true
	});
	
});