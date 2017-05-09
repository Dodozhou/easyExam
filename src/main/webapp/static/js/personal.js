/**
 * Created by person on 2017/3/29.
 */
//选项卡
$(function(){
    $('#contnav>li:first-child').css('border-bottom','2px solid #5d5d5d');
    var $download=$('#download');
    var $like=$('#like');
    var $upload=$('#upload');
    var $gain=$('#gain');
    $download.css('display','block');
    for(var i=2;i<=4;i++){
        $('#cont>li:nth-child('+i+')').css('display','none');
    }

    $('#resume>li:nth-child(4)>ul>li:first-child,#contnav>li:first-child').click(function(){
        for(var i=1;i<=4;i++){
            $('#cont>li:nth-child('+i+')').css('display','none');
            $('#contnav>li:nth-child('+i+')').css('border-bottom','none');
        }
        $download.css('display','block');
       $('#contnav>li:first-child').css('border-bottom','2px solid #5d5d5d');
    });
    $('#resume>li:nth-child(4)>ul>li:nth-child(2),#contnav>li:nth-child(2)').click(function(){
        for(var i=1;i<=4;i++){
            $('#cont>li:nth-child('+i+')').css('display','none');
            $('#contnav>li:nth-child('+i+')').css('border-bottom','none');
        }
        $like.css('display','block');
        $('#contnav>li:nth-child(2)').css('border-bottom','2px solid #5d5d5d');
    });
    $('#resume>li:nth-child(4)>ul>li:nth-child(3),#contnav>li:nth-child(3)').click(function(){
        for(var i=1;i<=4;i++){
            $('#cont>li:nth-child('+i+')').css('display','none');
            $('#contnav>li:nth-child('+i+')').css('border-bottom','none');
        }
        $upload.css('display','block');
        $('#contnav>li:nth-child(3)').css('border-bottom','2px solid #5d5d5d');

    });
    $('#resume>li:nth-child(4)>ul>li:last-child,#contnav>li:last-child').click(function(){
        for(var i=1;i<=4;i++){
            $('#cont>li:nth-child('+i+')').css('display','none');
            $('#contnav>li:nth-child('+i+')').css('border-bottom','none');
        }
        $gain.css('display','block');
        $('#contnav>li:last-child').css('border-bottom','2px solid #5d5d5d');
    });

});