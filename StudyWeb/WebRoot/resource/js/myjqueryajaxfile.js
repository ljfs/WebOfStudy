/**
 * 获取按钮的ID
 * @param elementId
 */
function getstudentInfo (btnElementId) {
	var btn = document.getElementById(btnElementId);
}
/**
 * 获取文件名称的文本ID
 * @param elementId
 * @returns 返回文本值
 */
function elementValue(txtelementId){
	var txt = document.getElementById(txtelementId).value;
	return txt;
}
/**
 * 
 * @param txtelementId
 */
function getTextElement(txtelementId) {
	var tElement = document.getElementById(txtelementId);
}
/**
 * 获取元素与值传入函数中判断对应的Servlet是否匹配
 * @param elementId 传入元素ID
 * @param servletName 传入对应的Servlet
 * @param keyword 传入请求码
 */
function ajaxResource(elementId,servletName,keyword){
	var ajaxofjavascript;
	//获取文本的值
	var names = getTextElement(elementId);
	var values = elementValue(elementId);
	ajaxofjavascript = getReqiest();
	ajaxofjavascript.onreadystatechange = callback;
	ajaxofjavascript.open("GET",servletName+"?"+names+"=",values);
	ajaxofjavascript.setRequestHeader("Content-type","application/x-www-from-urlencoded");
	ajaxofjavascript.send("keyword"+keyword);
}
/**
 * 初始化js要传递的内容
 * @returns 根据不同的浏览器执行不同的操作
 */
function getReqiest(){
	try {
		return new XMLHttpRequest();
	} catch (e) {
		// TODO: handle exception
		return new ActiveXObject("Microsoft.XMLHTTP");
	}
}
/**
 * 
 * @param elementId
 */
function callback(elementId){
	if (ajaxofjavascript.readyState == 4) {
		if (ajaxofjavascript ==200) {
			//获取提示信息
			var btntest = getstudentInfo(elementId);
			btntest.innerHTML = "";
		}
	}
}