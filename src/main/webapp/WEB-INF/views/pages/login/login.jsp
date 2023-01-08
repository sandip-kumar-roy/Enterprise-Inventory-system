<%@ page language="java" session="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>
<!DOCTYPE html>
<html>
<head>

  <meta charset="UTF-8">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/libs/bootstrap/css/bootstrap.min.css" >
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/libs/ionicons/css/ionicons.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/libs/font-awesome/css/font-awesome.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/libs/inputmark/css/inputmask.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/libs/admin-lte2/css/AdminLTE.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/libs/admin-lte2/css/skins/skin-green.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/libs/validate-form-master/css/formValidation.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/commons/fonts.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css">

  <script src="${pageContext.request.contextPath}/resources/libs/bootstrap/js/jquery-3.2.1.min.js" ></script>
  <script src="${pageContext.request.contextPath}/resources/libs/bootstrap/js/bootstrap.min.js" ></script>
  <script src="${pageContext.request.contextPath}/resources/libs/inputmark/js/jquery.inputmask.bundle.js" ></script>
  <script src="${pageContext.request.contextPath}/resources/libs/admin-lte2/js/app.js"></script>
  <script src="${pageContext.request.contextPath}/resources/libs/validate-form-master/js/formValidation.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/libs/validate-form-master/js/formValidation.popular.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/libs/validate-form-master/js/framework/bootstrap.min.js"></script>

<title><spring:message code="app.name" /></title>

</head>
<body class="hold-transition">
    <div class="login-box">
        <div class="login-logo">
            <a href=""><b>Spring Boot</b> 1.5</a>
        </div>
        <div class="login-box-body with-body-white">
        	<c:if test="${not empty error}">
				<div id="errorMsg"  class="alert alert-danger" align="center">
				<a href="#" class="close" onclick="$('#errorMsg').hide()"> &times;</a>
					${error}
				</div>
				<br>
			</c:if>
			<c:if test="${not empty msg}">
				<div class="msg">${msg}</div>
			</c:if>
            <p class="login-box-msg font-kanit-regular">Sign in to start your session</p>
            <form  id="formLogin" action="login" method="post">
            	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />	
                <div class="form-group has-feedback">
                	<span class="fa fa-user form-control-feedback"></span>
                    <input name="username" type="text" class="form-control" placeholder="Username">
                </div>
                <div class="form-group has-feedback has-feedback-left">
                	<span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    <input name="password" type="password" class="form-control" placeholder="Password">
                </div>
                <div class="row">
                    <div class="col-xs-8"></div>
                    <div class="col-xs-4">
                        <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
                    </div>
                </div>
            </form>
            <div class="social-auth-links text-center">
                <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign in using Facebook</a>
            </div>
            <a href="forgotpassword">I forgot my password</a>
            <br>
            <a href="register.html" class="text-center">Register a new membership</a>
        </div>
    </div>
<script src="${pageContext.request.contextPath}/resources/scripts/login.js"></script>
<script>
$(document).ready(function() {
	LoginModule.init();
});
</script>
</body>
</html>