fnSetDate();

setInterval(fnSetDate,1000);

function fnSetDate(){
	var oDate=new Date();
	var Y=oDate.getFullYear();
	var M=oDate.getMonth();
	var D=oDate.getDate();
	var H=oDate.getHours();
	var Min=oDate.getMinutes();
	var S=oDate.getSeconds();
	var W=oDate.getDay();
	var week='';
	
	switch(W){
		case 1:
			week='星期一';
		break;
		case 2:
			week='星期二';
		break;
		case 3:
			week='星期三';
		break;
		case 4:
			week='星期四';
		break;
		case 5:
			week='星期五';
		break;
		case 6:
			week='星期六';
		break;
		case 0:
			week='星期日';
		break;
	}
	
	$('#date').html(Y+'-'+toTwo(M+1)+'-'+toTwo(D));
	$('#day').html(week);
	$('#hour').html(toTwo(H)+':'+toTwo(Min)+':'+toTwo(S));

}

function toTwo(num){
	return num<10?'0'+num:''+num;
}