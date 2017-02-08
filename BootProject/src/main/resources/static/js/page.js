//分页事件控制
$(function(){
    $(".prev-page").click(function (e) {
        var currentPage = parseInt($(".cur-page").text());
        if(currentPage==1){
            return;
        }else {
            $("#pageNum").val(currentPage-1);
            $("form").submit();
        }


    })

    $(".next-page").click(function () {
        var currentPage = parseInt($(".cur-page").text());
        var total = parseInt($(".total-page").text());
        if(currentPage==total || total==1){
            return;
        }else{
            $("#pageNum").val(currentPage+1);
            $("form").submit();
        }
    })
})
