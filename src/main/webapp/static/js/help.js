/**
 * Created by person on 2017/4/1.
 */
$(function () {
    $('#attention>ul>li:gt(5)').css('display','none');
    $('#attention>p>a').click(function(event){
        event.preventDefault();
        $('#attention>ul>li:gt(5)').toggle();
    });
    for(var i=1;i<5;i++){
        $('#maincont>li:nth-child('+i+')').css('display','none');
    }
    $('#maincont>li:first-child').css('display','block');
    $('#mainnav>li:first-child').css('border-bottom','2px solid #5d5d5d');


    $('#mainnav>li:first-child').click(function(){
        for(var i=1;i<5;i++){
            $('#mainnav>li:nth-child('+i+')').css('border-bottom','2px solid transparent');
            $('#maincont>li:nth-child('+i+')').css('display','none');
        }
        $(this).css('border-bottom','2px solid #5d5d5d');
        $('#maincont>li:first-child').css('display','block');
    });
    $('#mainnav>li:nth-child(2)').click(function(){
        for(var i=1;i<5;i++){
            $('#mainnav>li:nth-child('+i+')').css('border-bottom','2px solid transparent');
            $('#maincont>li:nth-child('+i+')').css('display','none');
        }
        $(this).css('border-bottom','2px solid #5d5d5d');
        $('#maincont>li:nth-child(2)').css('display','block');
    });
    $('#mainnav>li:nth-child(3)').click(function(){
        for(var i=1;i<5;i++){
            $('#mainnav>li:nth-child('+i+')').css('border-bottom','2px solid transparent');
            $('#maincont>li:nth-child('+i+')').css('display','none');
        }
        $(this).css('border-bottom','2px solid #5d5d5d');
        $('#maincont>li:nth-child(3)').css('display','block');
    });
    $('#mainnav>li:nth-child(4)').click(function(){
        for(var i=1;i<5;i++){
            $('#mainnav>li:nth-child('+i+')').css('border-bottom','2px solid transparent');
            $('#maincont>li:nth-child('+i+')').css('display','none');
        }
        $(this).css('border-bottom','2px solid #5d5d5d');
        $('#maincont>li:nth-child(4)').css('display','block');
    });

//    提示的消失和隐藏
        $('#bemanito>form>ul>li>textarea,#tip1').click(function(){
            $('#bemanito>form>ul>li>textarea').focus();
        });
        $('#seekmanito>form>ul>li>textarea,#tip2').click(function(){
            $('#seekmanito>form>ul>li>textarea').focus();
        });
        $('#bemanito>form>ul>li>textarea').focus(function(){
            $('#tip1').css('display','none');
        });
        $('#seekmanito>form>ul>li>textarea').focus(function(){
            $('#tip2').css('display','none');
        });

        $('#bemanito>form>ul>li>textarea').blur(function(){
            if(this.value=='') {
                $('#tip1').css('display', 'block');
            }
        });
        $('#seekmanito>form>ul>li>textarea').blur(function(){
            if(this.value=='') {
                $('#tip2').css('display', 'block');
            }
        });

//        学科和联系方式的提示
    $('.manitotip').css('display','none');
    $('#bemanito>form>ul>li:nth-child(3)>input[type="text"]').blur(function(){
        if($(this).val()==''){
            $('#bemanito>form>ul>li:nth-child(3)>.manitotip').css('display','block').text('请输入您擅长的学科');
        }else{
            $('#bemanito>form>ul>li:nth-child(3)>.manitotip').css('display','none');
        }
    });
    $('#bemanito>form>ul>li:nth-child(6)>input[type="text"]').blur(function(){
        if($(this).val()==''){
            $('#bemanito>form>ul>li:nth-child(6)>.manitotip').css('display','block').text('请输入您的联系方式');
        }else{
            $('#bemanito>form>ul>li:nth-child(6)>.manitotip').css('display','none');
        }
    });
     $('#seekmanito>form>ul>li:nth-child(3)>input[type="text"]').blur(function(){
         if($(this).val()==''){
             $('#seekmanito>form>ul>li:nth-child(3)>.manitotip').css('display','block').text('请输入您要补的学科');
         }else{
             $('#seekmanito>form>ul>li:nth-child(3)>.manitotip').css('display','none');
         }
     });
    $('#seekmanito>form>ul>li:nth-child(5)>input[type="text"]').blur(function(){
        if($(this).val()==''){
            $('#seekmanito>form>ul>li:nth-child(5)>.manitotip').css('display','block').text('请输入您的联系方式');
        }else{
            $('#seekmanito>form>ul>li:nth-child(5)>.manitotip').css('display','none');
        }
    });

//    表单进行提交时进行验证
    $('#bemanito>form>.btn>input[type="submit"]').click(function(e){
       var $college=$('#bemanito>form>ul>li:first-child>select>option:selected').val();
        var $class=$('#bemanito>form>ul>li:nth-child(2)>select>option:selected').val();
        var $subject=$('#bemanito>form>ul>li:nth-child(3)>input').val();
        var $contact=$('#bemanito>form>ul>li:nth-child(6)>input').val();
        if($college=='学院'||$class=='0'||$subject==''||$contact==''){
            e.preventDefault();
        }else{
            e.stopPropagation();
        }
        if($college=="学院"){
            $('#bemanito>form>ul>li:first-child>.manitotip').css('display','block').text('请选择相关学院');
        }else{
            $('#bemanito>form>ul>li:first-child>.manitotip').css('display','none');
        }
        if($class=='0'){
            $('#bemanito>form>ul>li:nth-child(2)>.manitotip').css('display','block').text('请选择相关年级');
        } else{
            $('#bemanito>form>ul>li:nth-child(2)>.manitotip').css('display','none');
        }
        if($subject==''){
            $('#bemanito>form>ul>li:nth-child(3)>.manitotip').css('display','block').text('请输入您擅长的学科');
        }else{
            $('#bemanito>form>ul>li:nth-child(3)>.manitotip').css('display','none');
        }
        if($contact==''){
            $('#bemanito>form>ul>li:nth-child(6)>.manitotip').css('display','block').text('请输入您的联系方式');
        }else{
            $('#bemanito>form>ul>li:nth-child(6)>.manitotip').css('display','none');
        }
    });
    $('#seekmanito>form>.btn>input[type="submit"]').click(function(e){
        var $college=$('#seekmanito>form>ul>li:first-child>select>option:selected').val();
        var $class=$('#seekmanito>form>ul>li:nth-child(2)>select>option:selected').val();
        var $subject=$('#seekmanito>form>ul>li:nth-child(3)>input').val();
        var $contact=$('#seekmanito>form>ul>li:nth-child(5)>input').val();
        if($college=='学院'||$class=='0'||$subject==''||$contact==''){
            e.preventDefault();
        }else{
            e.stopPropagation();
        }
        if($college=="学院"){
            $('#seekmanito>form>ul>li:first-child>.manitotip').css('display','block').text('请选择相关学院');
        }else{
            $('#seekmanito>form>ul>li:first-child>.manitotip').css('display','none');
        }
        if($class=='0'){
            $('#seekmanito>form>ul>li:nth-child(2)>.manitotip').css('display','block').text('请选择相关年级');
        } else{
            $('#seekmanito>form>ul>li:nth-child(2)>.manitotip').css('display','none');
        }
        if($subject==''){
            $('#seekmanito>form>ul>li:nth-child(3)>.manitotip').css('display','block').text('请输入您要补的学科');
        }else{
            $('#seekmanito>form>ul>li:nth-child(3)>.manitotip').css('display','none');
        }
        if($contact==''){
            $('#seekmanito>form>ul>li:nth-child(5)>.manitotip').css('display','block').text('请输入您的联系方式');
        }else{
            $('#seekmanito>form>ul>li:nth-child(5)>.manitotip').css('display','none');
        }
    })
});