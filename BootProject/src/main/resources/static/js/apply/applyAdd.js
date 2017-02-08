jQuery(function ($) {
	checkOneUser('searchuser','username','userid');
    // 提交事件
    $("#submitBtn").on("click", function () {
        // 判断
        var employeeName = $("input[name='employeeName']").val();
        if (employeeName == "" || strlen(employeeName) > 50) {
            alert("申请人不能为空且不能超过50个字符！\n");
            return;
        }
        $.post("/apply/save", $("#addForm").serialize(), function () {
            alert("申请成功！");
            document.location.href="/apply/add";
        }, "json");   
    });
});
function strlen(str) {
	var len = 0;
	for (var i = 0; i < str.length; i++) {
		var c = str.charCodeAt(i);
		// 单字节加1
		if ((c >= 0x0001 && c <= 0x007e) || (0xff60 <= c && c <= 0xff9f)) {
			len++;
		} else {
			len += 2;
		}
	}
	return len;
}

function checkOneUser(searchId, nameId, userId) {
	$("#" + searchId).tokenInput(
			"/depart/getDepart/",
			{
				theme : "facebook",
				queryParam : "name",
				hintText : "请输入关键字，然后输入空格进行查询。",// 中文字时候需要输入空格。
				noResultsText : "没有结果。",
				searchingText : "查询中...",
				onResult : function(results) {
					//alert(results.rows);
					//var result = results;
					var returnData = new Array();
					$.each(results, function(index, value) {						
						returnData[index] = {
							id : value.departmentId,
							name : value.fullName
						};
					});
					return returnData;
				},
				onAdd : function(value) {
					var results = $("#" + searchId).tokenInput("get");
					if(results.length>1){
						$("#" + searchId).tokenInput("remove",value);
						return;
					}
					var name = $("#" + nameId).val();
					var user = $("#" + userId).val();
					if (name == "") {
						$("#" + nameId).val(value.name);
					} else {
						$("#" + nameId).val(name + "," + value.name);
					}
					if (user == "") {
						$("#" + userId).val(value.id);
					} else {
						$("#" + userId).val(user + "," + value.id);
					}
				},
				onDelete : function(item) {
					var nameStr = $("#" + nameId).val();
					var userStr = $("#" + userId).val();
					if (nameStr != "") {
						var nameArr = new Array();
						nameArr = nameStr.split(",");
						for (i = 0; i < nameArr.length; i++) {
							if (nameArr[i] == item.name) {
								nameArr.splice(i, 1);
								break;
							}
						}
						$("#" + nameId).val(nameArr);
					}
					if (userStr != "") {
						var userArr = new Array();
						userArr = userStr.split(",");
						for (i = 0; i < userArr.length; i++) {
							if (userArr[i] == item.id) {
								userArr.splice(i, 1);
								break;
							}
						}
						$("#" + userId).val(userArr);
					}
				}
			});
}