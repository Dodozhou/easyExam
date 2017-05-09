/**
 * Created by person on 2017/4/5.
 */
    $(function(){
        //nav
        $('nav>ul:nth-child(4)').css('display','none');
        $('nav>ul:nth-child(3)>li:last-child').click(function(){
            $('nav>ul:nth-child(4)').slideToggle();
        });

    //    登录与退出登录的切换
        $('nav ul:nth-child(2)>li:nth-child(4)>ul').css('display','none');
        $('nav ul:nth-child(2)>li:nth-child(4)>a').hover(function(){
            $(this).siblings('ul').css('display','block');
        },function(){
            $(this).siblings('ul').css('display','none');
        });
        $('nav ul:nth-child(2)>li:nth-child(4)>ul').hover(function(){
            $(this).css('display','block');
        },function(){
            $(this).css('display','none');
        })
    });
