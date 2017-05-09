/**
 * Created by person on 2017/3/27.
 */
$(function(){
    $('#rightnav li:first-child').addClass('lihover');
    $('#rightnav>li').click(function(){
       $('#rightnav>li').removeClass('lihover');
       $(this).addClass('lihover');
    });
    $('#rightnav>li:first-child').click(function(){
       $('#rightcont>#rightnew').css('display','block');
        $('#rightcont>#righthot').css('display','none');

    });
    $('#rightnav>li:last-child').click(function(){
        $('#rightcont>#rightnew').css('display','none');
        $('#rightcont>#righthot').css('display','block');

    });
});