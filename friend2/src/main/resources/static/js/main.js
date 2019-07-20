

$(document).ready(function () {
    var userInfo = JSON.parse(sessionStorage.getItem("userInfo"));
    $("#head_space_1").mouseover(function () {
        $(".head_submenu").css("display","block")
    });
    $("#head_space_1").mouseout(function () {
        $(".head_submenu").mouseover(function (){
            $(".head_submenu").css("display","block");
        })
        $(".head_submenu").mouseout(function (){
            $(".head_submenu").css("display","none");
        })
    });
    $("span#user_name").html(userInfo.username);
})