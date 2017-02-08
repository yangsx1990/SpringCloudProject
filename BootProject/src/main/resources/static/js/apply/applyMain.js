Date.prototype.Format = function(fmt) { // author: meizz
	var o = {
		"M+" : this.getMonth() + 1, // 月份
		"d+" : this.getDate(), // 日
		"h+" : this.getHours(), // 小时
		"m+" : this.getMinutes(), // 分
		"s+" : this.getSeconds(), // 秒
		"q+" : Math.floor((this.getMonth() + 3) / 3), // 季度
		"S" : this.getMilliseconds()
	// 毫秒
	};
	if (/(y+)/.test(fmt))
		fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "")
				.substr(4 - RegExp.$1.length));
	for ( var k in o)
		if (new RegExp("(" + k + ")").test(fmt))
			fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k])
					: (("00" + o[k]).substr(("" + o[k]).length)));
	return fmt;
}
var grid_selector = "#grid-table";
var pager_selector = "#grid-pager";
jQuery(function($) {	
	jQuery(grid_selector).jqGrid(
			{
				datatype : "json",
				url : "/apply/findAllByPage",
				height : 325,
				colNames : [ '编号', '上报人' ],
				colModel : [ {
					name : 'maintenanceId',
					index : 'maintenanceId',
					rowid : true,
					sortable : false,
					key : true
				}, {
					name : 'employeeName',
					index : 'employeeName',
					sortable : false
				} ],
				viewrecords : true,
				rowNum:10,
			   	rowList:[10,20,30],
			   	pager: '#pager2',
			   	sortname: 'id',
			    viewrecords: true,
			    sortorder: "desc",
			    caption:"JSON Example"
			});
	jQuery(grid_selector).jqGrid('navGrid',pager_selector,{edit:false,add:false,del:false});
	function updatePagerIcons(table) {
		var replacement = {
			'ui-icon-seek-first' : 'icon-double-angle-left bigger-140',
			'ui-icon-seek-prev' : 'icon-angle-left bigger-140',
			'ui-icon-seek-next' : 'icon-angle-right bigger-140',
			'ui-icon-seek-end' : 'icon-double-angle-right bigger-140'
		};
		$('.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon')
				.each(
						function() {
							var icon = $(this);
							var $class = $.trim(icon.attr('class').replace(
									'ui-icon', ''));

							if ($class in replacement)
								icon.attr('class', 'ui-icon '
										+ replacement[$class]);
						})
	}
	function enableTooltips(table) {
		$('.navtable .ui-pg-button').tooltip({
			container : 'body'
		});
		$(table).find('.ui-pg-div').tooltip({
			container : 'body'
		});
	}
	// 查询事件
	$("#queryBtn").on("click", function() {
		var postData = $(grid_selector).jqGrid("getGridParam", "postData");
		var pars = $("#queryForm").serializeArray();
		$.each(pars, function(k, v) {
			postData[v.name] = v.value;
			if (v.value == "")
				delete postData[v.name];
		});
		var treed = $.fn.zTree.getZTreeObj("tree");
		var dnodes = treed.getCheckedNodes(true);
		var param = '';
		if (dnodes.length != 0)
			postData['departmentId'] = dnodes[0].id;
		else
			delete postData['departmentId'];
		// 重设jdgrid数据
		$(grid_selector).jqGrid("setGridParam", {
			postData : postData
		}).trigger("reloadGrid");
	});
	// 重置事件
	$("#resetBtn").on("click", function() {
		$("#formReset").trigger("click");
	});	
});
