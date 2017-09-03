//选择显示登录还是注册页面
/*function whichdisplay(pid)
	{
		var idnames=["log_div","register_div"];
		
		for(var i=0;i<idnames.length;i++){
			if(idnames[i]==pid){
				document.getElementById(idnames[i]).style.display="block";//当点击登陆或注册时显示登录或注册板块
				//以下三行代码：当切换页面时，对表单进行重置
				var form_array = document.getElementById(idnames[i]).getElementsByTagName('form');
				form_array[0].reset();
				WindowOnload();	
				//以下三行代码：切换页面是隐藏错误提示
				var p_array=document.getElementById(idnames[i]).getElementsByTagName('p');
				for(var j=0;j<p_array.length;j++){
					p_array[j].style.display='none';
				}
			if(pid=="log"+"_div"){
				document.getElementById("log").style.color="#ec4c38";//以下几行都为设置登录注册字体的颜色
				document.getElementById("register").style.color="burlywood";
				}
				else{document.getElementById("register").style.color="#ec4c38";
				document.getElementById("log").style.color="burlywood";				
				}
			}
			else{
				document.getElementById(idnames[i]).style.display="none";//否则就隐藏该板块
			}
		}
	}*/
var code ; //在全局定义验证码
//产生验证码
function createCode(){
    code = "";
    var codeLength = 4;//验证码的长度
    var checkCode = document.getElementById("Code");
    var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K',
    'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');//随机数
    for(var i = 0; i < codeLength; i++) {//循环操作
        var index = Math.floor(Math.random()*36);//取得随机数的索引（0~35）
        code += random[index];//根据索引取得随机数加到code上
//      code+=" ";
    }
    checkCode.value = code;//把code值赋给验证码
};
//用户名的提示
function logusernumber(){
	//获得登录页面的用户名ID
	var log_usernumber		=document.getElementById("log_usernumber").value;
	//判断登录页面用户名输入框的内容显示提示
	if(log_usernumber.length<=10||isNaN(log_usernumber)){
		document.getElementById("log_remind_number").style.display="block";		
	}
	else {
		document.getElementById("log_remind_number").style.display="none";
		document.getElementById("log_keywords").disabled=false;//打开登录页面的密码输入框
	}
	
};

function registerusernumber(){
	//获得注册页面的用户名ID
	var register_usernumber	=document.getElementById("register_usernumber").value;
	//判断注册页面用户名输入框的内容显示提示
	if(register_usernumber.length<=10||isNaN(register_usernumber)){
		document.getElementById("register_remind_number").style.display="block";
		
	}
	else {
		document.getElementById("register_remind_number").style.display="none";
		document.getElementById("register_keywords").disabled=false;//打开注册页面的密码输入框
	}
};
function registerusername(){
	//获得注册页面的用户名ID
	var register_username	=document.getElementById("register_username").value;
	//判断注册页面用户名输入框的内容显示提示
	if(register_username.length<=0){
		document.getElementById("register_remind_name").style.display="block";
		
	}
	else {
		document.getElementById("register_remind_name").style.display="none";
	}
};

//登录密码的提示
function logkeywords(){
	//获得登录页面的密码ID
	var log_keywords 		=document.getElementById("log_keywords").value;
	//判断登录页面密码输入框的内容显示提示
	if(log_keywords.length<6){
		document.getElementById("log_remind_keyword").style.display="block";
	}
	else {
		document.getElementById("log_remind_keyword").style.display="none";
		document.getElementById("input_code").disabled=false;//打开登录页面的验证码输入框
	}
};
//注册密码的提示
function registerkeywords(){
	//获得注册页面的密码ID
	var register_keywords	=document.getElementById("register_keywords").value;
	//判断注册页面密码输入框的内容显示提示
	if(register_keywords.length<6){
		document.getElementById("register_remind_keyword").style.display="block";
	}
	else {
		document.getElementById("register_remind_keyword").style.display="none";
		/*document.getElementById("telephone").disabled=false;//打开注册页面的电话号码输入框*/
        document.getElementById("re_email").disabled=false;
	}
};


//校验验证码
function validate(){
	
    var inputCode = document.getElementById("input_code").value.toUpperCase(); //取得输入的验证码并转化为大写
   // var user=document.getElementsByClassName("username");
    if(inputCode.length <= 0) { //若输入的验证码长度为0    	
        document.getElementById("log_remind_code").innerHTML= "*请输入验证码!";
        document.getElementById("log_remind_code").style.display="block";//显示提示字符      
    	return false;
    }
    else {
    	if(inputCode != code ) { //若输入的验证码与产生的验证码不一致时
	        createCode();//刷新验证码
	        document.getElementById("input_code").value = "";//清空文本框
	        document.getElementById("log_remind_code").innerHTML= "*验证码错误，请重新输入！";
	        document.getElementById("log_remind_code").style.display="block";//显示提示字符 
            return false;
    	}
	    else { //输入正确时
	        return true;
	    }  
    }
};
//电话的错误提示
/*function tel(){
	//获得注册页面的电话ID
	var telephone	=document.getElementById("telephone").value;
	//判断注册页面电话输入框的内容显示提示
	if(telephone.length!=11||isNaN(telephone)){
		document.getElementById("register_remind_tel").style.display="block";
	}
	else {
		document.getElementById("register_remind_tel").style.display="none";	
		document.getElementById("re_email").disabled=false;
	}
};*/
//判断邮箱格式
function registeremail(){
    //获得注册页面的用户名ID
    var re_email	=document.getElementById("re_email").value;
    var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
    //判断注册页面用户名输入框的内容显示提示
    if(re_email.length<=0){
        document.getElementById("register_remind_mail").innerHTML= "*请输入邮箱!";
        document.getElementById("register_remind_mail").style.display="block";

    }
    else if(!myreg.test(re_email)){
        document.getElementById("register_remind_mail").innerHTML= "*邮箱格式错误!";
        document.getElementById("register_remind_mail").style.display="block";
    }
    else
        document.getElementById("register_remind_mail").style.display="none";

};

function WindowOnload(){
	createCode();//在网页加载时就调用验证码函数
	//禁用输入框
	document.getElementById("log_keywords").disabled=false;
	document.getElementById("input_code").disabled=true;
	document.getElementById("register_keywords").disabled=false;
	document.getElementById("telephone").disabled=true;
	document.getElementById("re_email").disabled=true;
}
window.onload = WindowOnload;//在网页加载时就调用函数
