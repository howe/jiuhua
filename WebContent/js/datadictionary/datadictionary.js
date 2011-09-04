var saveUserUrl = '/user/saveUser.action';// 保存用户地址
var delUserUrl = '/user/delUser.action';// 删除用户地址

/** 新增用户 */
function addUser() {
	resetWin();
	$('#win_user').window({
				maximizable : false
			}).window('setTitle', '新增用户').window('open');
}

/** 保存用户 */
function saveUser() {
	$.ajax({
				async : true,// required
				type : 'post',
				dataType : 'json',
				timeout : 3000,
				url : contextPath + saveUserUrl,
				data : $('#addUserForm').serializeObject(),
				success : function(data) {
					$('#tt').datagrid('reload');
					$('#win_user').window('close');
				}
			});
}

/** 清空用户管理窗口填写数据并恢复默认值 */
function resetWin() {
	$('#win_user').form('clear');
	$('#id').val(0);
}

/** 关闭用户管理窗口 */
function cancel() {
	$('#win_user').window('close');
}

/** 删除用户 */
function delUser(id) {
	$.ajax({
				async : true,// required
				type : 'post',
				dataType : 'json',
				timeout : 3000,
				url : contextPath + delUserUrl,
				data : {
					ids : id
				},
				success : function(data) {
					$('#tt').datagrid('reload');
				}
			});
}

/** 程序初始化 */
$(function() {
	$('#bodyId').css('visibility', 'visible');

	$('#tt').datagrid({
		nowrap : false,
		striped : true,
		border : false,
		url : 'user/queryAllUser.action',
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
					field : 'type',
					title : '数据字典类型',
					width : 100
				}, {
					field : 'name',
					title : '数据字典名称',
					width : 100
				}, {
					field : 'value',
					title : '数据字典值',
					width : 100
				},{
					field : 'status',
					title : '数据字典状态',
					width : 100,
					formatter : function(value, rec) {
						// var s = value.replace(/,/g, "");
						// var lastIndex = value.lastIndexOf(',') + 1;
						// var ss = value.substring(lastIndex);
						// if(ss.length>5){
						// ss=ss.substring(0, 5)+"...";
						// }
						// return "<a title='" + s + "'>" + ss + "</a>";
					}
				}, {
					field : 'action',
					title : '操作',
					rowspan : 3,
					width : 190,
					formatter : function(value, rec) {
						var stop = '<a class="l-btn l-btn-plain" style="float:left;" href="javascript: stopUser(\''
								+ rec.id + '\');">';
						stop += ' <span class="l-btn-left" style="float: left;">';
						stop += ' <span class="l-btn-text user" style="padding-left: 20px;">停用</span>';
						stop += ' </span>';
						stop += ' </a>';
						var edit = '<a class="l-btn l-btn-plain" style="float:left;" href="javascript: editUser(\''
								+ rec.id + '\');">';
						edit += ' <span class="l-btn-left" style="float: left;">';
						edit += ' <span class="l-btn-text user_edit" style="padding-left: 20px;">修改</span>';
						edit += ' </span>';
						edit += ' </a>';
						var del = '<a class="l-btn l-btn-plain" style="float:left;" href="javascript: delUser(\''
								+ rec.id + '\');">';
						del += ' <span class="l-btn-left" style="float: left;">';
						del += ' <span class="l-btn-text user_del" style="padding-left: 20px;">删除</span>';
						del += ' </span>';
						del += ' </a>';
						return stop + edit + del;
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
						var selects = $('#tt').datagrid('getSelections');
						var tmp = [];
						for (var i = 0; i < selects.length; i++) {
							tmp.push(selects[i].id);
						}
						if (tmp.length > 0) {
							delUser(tmp.join(','));
						}
					}
				}],
		pagination : true,
		rownumbers : true
	});

});