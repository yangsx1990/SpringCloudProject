//完成保存
$('#commit').click(function(){
	$.ajax({
        type: "post",
        url: "/apply/redistribute",
        data:{"maintenanceId":$('#maintenanceId').val(),"userId":$('#deal_person').val(),"name":$("#deal_person").find("option:selected").text()},
        async : false,
        dataType: "json"
      
     }); 
	alert("修改成功！");
	location.reload();
});

//下拉框的事件
$('#deal_person').change(function(){ 
	//alert($('#maintenanceId').val());
	//location.reload();

});

