//判断浏览器支持情况
(function(){
	if(typeof FileReader == 'undefined'){
		alert('您的浏览器不支持本页面的上传图片等功能，请使用最新版Chrome(谷歌浏览器)/Firefox(火狐浏览器)/IE 10/Windows 10系统自带浏览器打开本管理平台页面');
		return;
	}
})();

(function(){

    $(".login").click(function () {
        $("form").submit();
    });
    $('#unLogin').on('click',function(){
		$('.opacity').fadeIn();	
	});
})();


//
////验证码
//(function(){
//	var num=60;
//	var timer=null;
//
//	$('#getCode').on('click',function(){
//		clearInterval(timer);
//		$(this).attr('disabled',true);
//
//		timer=setInterval(function(){
//			$('#getCode').html(toTwo(num)+'s后再获取');
//			num=num-1;
//
//			if(num==-1){
//				clearInterval(timer);
//				$('#getCode').attr('disabled',false);
//				$('#getCode').html('重新获取');
//				num=60;
//			}
//		},1000);
//	});
//})();


//单选框
(function(){
	var onOff=true;
	
	$('.radio').on('click',function(){
		if(onOff){
			$(this).css('background-image','url(imgs/check-ok.png)');
		}else{
			$(this).css('background-image','url(imgs/check-cancel.png)');
		}
		onOff=!onOff;
		//onOff此时的false为选中，true为未选中
	});
})();

//无法登录 
(function(){
	
	$('.onOff').on('click',function(){
		$('.opacity').fadeOut();	
	});
})();


//判断手机号
//(function(){
//	$('#phone').on('blur',function(){
//		if($(this).val()!=''&&!(/^1[3|4|5|7|8]\d{9}$/.test($(this).val()))){
//	        $('.phone i').html('手机号码格式有误 !');
//	        return false;
//	    }else{
//	    	$('.phone i').html('');
//	    }
//	});
//})();

//单个数变成双位数方法
function toTwo(num){
	return num<10?'0'+num:''+num;
}

////检验手机号码格式方法
//function checkPhone(){
//    var phone = doucument.getElementById('phone').value;
//    if(!(/^1[3|4|5|7|8]\d{9}$/.test(phone))){
//        alert("手机号码有误，请重填");
//        return false;
//    }
//}