/**
 * Created by person on 2017/4/7.
 */

$(function () {
    //文章的收起与隐藏
    $('#hiddentip').css('display','none');
    $('#article>#cont>p').addClass('show');
    $('#showtip').click(function(){
        $(this).css('display','none');
        $('#article>#cont>p').removeClass('show');
        $('#hiddentip').css('display','block');
    });
    $('#hiddentip').click(function(){
        $(this).css('display','none');
        $('#article>#cont>p').addClass('show');
        $('#showtip').css('display','block');
    });

//    我的评论，登录前、登录后
//    改 判断登录前、登录后
    $('#logtip').css('display','none');

//    我的评论框
    $('#comtip').click(function(){
        $('#afterlog>form>textarea').focus();
        $(this).css('display','none');
    });
    $('#afterlog>form>textarea').focus(function(){
        $('#comtip').css('display','none');
    });
    $('#afterlog>form>textarea').blur(function(){
        if(this.value.length==0){
            $('#comtip').css('display','block');
        }else{
            $('#comtip').css('display','none');
        }
    });
//    回复文本框是否出现
    $('#comcont>li>ul>li:nth-child(3)>ul>li:nth-child(4)').css('display','none');
    $('#comcont>li>ul>li:nth-child(3)>ul>li:nth-child(2)').click(function(){
        var $huifuul=$(this).parent();
        $huifuul.find('.huifuli').toggle();
    });
    $('.canorfa').click(function(event){
        event.preventDefault();
        $(this).parents('.huifuli').css('display','none');
    });

    $('.huifuclick').click(function(){
        var $huifuul=$(this).parent().parent().parent().parent();
        // alert($huifuli);
       $huifuul.next().toggle();
    });

//    其他评论的回复
    $('.huifutip').click(function(){
        $(this).css('display','none');
        var $tipli=$(this).parent();
        $tipli.find('textarea').focus();
    });
    $('#comcont>li>ul>li:nth-child(3)>ul>li:nth-child(4)>form>textarea').focus(function(){
        $(this).parent().parent().find('.huifutip').css('display','none');
    });
    $('#comcont>li>ul>li:nth-child(3)>ul>li:nth-child(4)>form>textarea').blur(function(){
        if(this.value==''){
            $(this).parent().parent().find('.huifutip').css('display','block');
        }
        else{
            $(this).parent().parent().find('.huifutip').css('display','none');
        }
    })

});