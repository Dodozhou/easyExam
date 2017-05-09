/**
 * Created by 15928 on 2017/4/14.
 */
$(function() {
    $('#seekinfo>li>textarea,#tip').click(function () {
        $('#seekinfo>li>textarea').focus();
    });
    $('#seekinfo>li>textarea').focus(function () {
        $('#seekinfo>li:nth-child(2)>#tip').css('display', 'none');
    });
    $('#seekinfo>li>textarea').blur(function () {
        if (this.value == '') {
            $('#seekinfo>li:nth-child(2)>#tip').css('display', 'block');
        }
    });
//            表单失去焦点或提交时，进行验证
    $('.seektip').css('display', 'none');
    $('#seekinfo>li:first-child>input').blur(function () {
        if (this.value == '') {
            $('#seekinfo>li:first-child>.seektip').css('display', 'block').text('请输入您的文章标题');
        } else {
            $('#seekinfo>li:first-child>.seektip').css('display', 'none');
        }
    });
    $('#seekbtn>input').click(function (e) {
        if ($('#seekinfo>li:first-child>input').val() == '') {
            e.preventDefault();
            $('#seekinfo>li:first-child>.seektip').css('display', 'block').text('请输入文档标题');
        } else {
            $('#seekinfo>li:nth-child(3)>.seektip').css('display', 'none');
        }
        if ($('#seekinfo>li:nth-child(3)>select>option:selected').val() == '学院') {
            e.preventDefault();
            $('#seekinfo>li:nth-child(3)>.seektip').css('display', 'block').text('请选择相关学院');
        } else {
            $('#seekinfo>li:nth-child(3)>.seektip').css('display', 'none');
        }
        if ($('#seekinfo>li:nth-child(4)>select>option:selected').val() == '0') {
            e.preventDefault();
            $('#seekinfo>li:nth-child(4)>.seektip').css('display', 'block').text('请选择相关年级');
        } else {
            $('#seekinfo>li:nth-child(4)>.seektip').css('display', 'none');
        }
        if ($('#seekinfo>li:nth-child(5)>select>option:selected').val() == '0') {
            e.preventDefault();
            $('#seekinfo>li:nth-child(5)>.seektip').css('display', 'block').text('请选择悬赏期限');
        } else {
            $('#seekinfo>li:nth-child(5)>.seektip').css('display', 'none');
        }
        if ($('#seekinfo>li:nth-child(6)>select>option:selected').val() == '0') {
            e.preventDefault();
            $('#seekinfo>li:nth-child(6)>.seektip').css('display', 'block').text('请选择下载卷');
        } else {
            $('#seekinfo>li:nth-child(6)>.seektip').css('display', 'none');
        }
        if ($('#seekinfo>li:nth-child(7)>input[type="text"]').val() == '') {
            e.preventDefault();
            $('#seekinfo>li:nth-child(7)>.seektip').css('display', 'block').text('请输入正确的验证码');
        } else {
            $('#seekinfo>li:nth-child(7)>.seektip').css('display', 'none');
        }

        if ($('#seekinfo>li:first-child>input').val() != '' && $('#seekinfo>li:nth-child(3)>select>option:selected').val() != '学院' && $('#seekinfo>li:nth-child(4)>select>option:selected').val() != '0' && $('#seekinfo>li:nth-child(5)>select>option:selected').val() != '0' && $('#seekinfo>li:nth-child(5)>select>option:selected').val() != '0' && $('#seekinfo>li:last-child>input[type="text"]').val() == $('#seekinfo>li:last-child>input[type="button"]').val()) {
            e.stopPropagation();
        }

    })
});
var code ; //在全局定义验证码
//产生验证码
window.onload = createCode();
function createCode(){
    code = "";
    var codeLength = 4;//验证码的长度
    var checkCode = document.getElementById("code");
    var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
        'S','T','U','V','W','X','Y','Z');//随机数
    for(var i = 0; i < codeLength; i++) {//循环操作
        var index = Math.floor(Math.random()*36);//取得随机数的索引（0~35）
        code += random[index];//根据索引取得随机数加到code上
    }
    checkCode.value = code;//把code值赋给验证码
}
//校验验证码
var $codetip=$('#seekinfo>li:nth-child(7)>.seektip');
$codetip.css('display','none');
function validate(){
    var inputCode = document.getElementById("codeinput").value.toUpperCase(); //取得输入的验证码并转化为大写
    if(inputCode.length <= 0) { //若输入的验证码长度为0
        $codetip.css('display','block').text('请输入验证码');
    }
    else if(inputCode!= code) { //若输入的验证码与产生的验证码不一致时
        $codetip.css('display','block').text('输入的验证码错误');
        createCode();//刷新验证码
        document.getElementById("codeinput").value = "";//清空文本框
    }else{
        $codetip.text('').css('display','none');
    }
}
