<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>json Test</title>

<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	// 请求json，输出json
	function requestJson() {
		$.ajax({
			type:'post',
			url:'${ pageContext.request.contextPath }/user/test.action',
			contentType:'application/json;charset=utf-8',
			// 数据格式是json串
			data:'{"userid":"18037088716@163.com","password":"1998-1-1"}',
			success:function(data) {
				// 返回 json
				alert(data)
			}
		});
	}
	
	// 请求key/value,输出json
	function responseJson() {
		$.ajax({
			type:'post',
			url:'${ pageContext.request.contextPath }/user/insertUser.action',
			// 数据格式是json串
			data:'userid=1106769044@qq.com&password=1998-1-1',
			success:function(data) {
				// 返回 json
				alert(data)
			}
		});
	}
	
	// 激活用户
	function activate() {
		$.ajax({
			type:'post',
			url:'${ pageContext.request.contextPath }/user/avtivateUser.action',
			// 数据格式是json串
			data:'userid=1106769044@qq.com&checkNum=9715',
			success:function(data) {
				// 返回 json
				alert(data)
			}
		});
	}
	
	// 登录用户
	function userLogin() {
		$.ajax({
			type:'post',
			url:'${ pageContext.request.contextPath }/user/userLogin.action',
			// 数据格式是json串
			data:'userid=18037088716@163.com&password=1998-1-1',
			success:function(data) {
				// 返回 json
				alert(data)
			}
		});
	}
</script>

</head>
<body>

<input type="button" onclick="requestJson()" value="请求json,输出json">
<input type="button" onclick="responseJson()" value="请求key/value,输出json">
<input type="button" onclick="activate()" value="激活">
<input type="button" onclick="userLogin()" value="登录">

</body>
</html>