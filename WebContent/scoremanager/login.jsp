<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>得点管理システム</title>
</head>
<body>

<form action = "LoginExecute.action" method="post">

<!--
	autocomplete
	on/off:自動補完の制御

	ime-mode
	active:漢字（全角）モードにします
	disabled:日本語入力機能(IME)そのものを使用不可能

	required:input要素を入力必須にする属性
 -->

	<!-- ＩＤ -->
	<label>ＩＤ</label>
	<input type="text" name="id" maxlength="20" placeholder="20文字以内の半角英数字でご入力下さい"
	 autocomplete="off" style="ime-mode: disabled" value="admin" required/>

	<!-- パスワード -->
	<label>パスワード</label>
	<input type="password" name="password" value="password">

	<!-- 名前 -->
	<label>名前</label>
	<input type="text" name="namae" value="矢島 翔">

	<!-- 学校コード -->
	<label>学校コード</label>
	<input type="text" name="school_cd" value="oom">

	<!-- ログイン用ボタン -->
	<input type="submit" name="login" value="ログイン"/>

</form>


</body>
</html>