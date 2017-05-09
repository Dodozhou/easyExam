/**
 * Created by 15928 on 2017/4/14.
 */

$(function(){
    $('#upinfo>li>textarea,#tip').click(function(){
        $('#upinfo>li>textarea').focus();
    });
    $('#upinfo>li>textarea').focus(function(){
        $('#upinfo>li:nth-child(2)>#tip').css('display','none');
    });
    $('#upinfo>li>textarea').blur(function(){
        if(this.value=='') {
            $('#upinfo>li:nth-child(2)>#tip').css('display', 'block');
        }
    });

//            改过
//            提交按钮时，判断学院年级，是否选择
    $('#upinfo>li:first-child>input').blur(function(){
        var $title=$('#upinfo>li:first-child>input').val();
        if($title==''){
            $('#upinfo>li:first-child>.uptip').css('display','block').html('请输入文档标题');
            e.preventDefault();
        }else{
            $('#upinfo>li:first-child>.uptip').css('display','none');
        }
    });
    $('#upinfo>li:nth-child(5)>input').blur(function(){
        var $subject=$('#upinfo>li:nth-child(5)>input').val();
        if($subject==''){
            $('#upinfo>li:nth-child(5)>.uptip').css('display','block').html('请输入学科名称');
            e.preventDefault();
        }else{
            $('#upinfo>li:nth-child(5)>.uptip').css('display','none');
        }
    });

    $('.uptip').css('display','none');
    $('#upbtn>input').click(function(e){
        var $title=$('#upinfo>li:first-child>input').val();
        var $collselect= $('#upinfo>li:nth-child(3)>select> option:selected').val();
        var $classselect=$('#upinfo>li:nth-child(3)>select>option:selected').val();
        var $subject=$('#upinfo>li:nth-child(5)>input').val();
        if($title==''){
            $('#upinfo>li:first-child>.uptip').css('display','block').html('请输入文档标题');
            e.preventDefault();
        }else{
            $('#upinfo>li:first-child>.uptip').css('display','none');
        }
        if($collselect=='学院'){
            $('#upinfo>li:nth-child(3)>.uptip').css('display','block').html('请输入相关学院');
            e.preventDefault();
        }else{
            $('#upinfo>li:nth-child(4)>.uptip').css('display','none');
        }
        if($classselect=='0'){
            $('#upinfo>li:nth-child(4)>.uptip').css('display','block').html('请输入相关年级');
            e.preventDefault();
        }else{
            $('#upinfo>li:nth-child(4)>.uptip').css('display','none');
        }
        if($subject==''){
            $('#upinfo>li:nth-child(5)>.uptip').css('display','block').html('请输入学科名称');
            e.preventDefault();
        }else{
            $('#upinfo>li:nth-child(5)>.uptip').css('display','none');
        }

        if($title!=''&&$collselect!='学院'&&$classselect!='0'&&$subject!=''){
            e.stopPropagation();
        }
    })
});

//        图片上传并显示
document.getElementById('file').onchange = function() {
    var imgFile = this.files[0];
    var fr = new FileReader();
    fr.onload = function() {
        document.getElementById('imgdisplay').getElementsByTagName('img')[0].src = fr.result;
    };
    fr.readAsDataURL(imgFile);
};