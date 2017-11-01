<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta charset="utf-8">
	<title>BuyItem画面</title>
	<link rel="stylesheet" type="text/css" href="/template/CSS/style.css">
	<style type="text/css">


		table {

			width:82%;
			table-layout: fixed;
			margin:0 auto;
			font-size:18px;
			color: #00BCD4;
    		background: #EFF8F9;




		}


		td {
			height:38px;
			width:82%;

		}

		.right {
			text-align:right;


		}
		.left {
			text-align:left;
			font-size:21px;
			color:gray;
		}
		.itemname {
			background: lightgray;
			box-shadow: 0px 0px 0px 5px lightgray;
			padding:6px;

		}

		.buybutton {
			font-size:17px;
			padding: 10px 15px;
			margin-bottom:15px;
			background-color:white;
			width:170px;
			border:1px solid #ECEDD0;
			cursor: pointer;
		}



	</style>
</head>
<body>
	<div id="header1">
	 	<div id="pr1">
	 	</div>
	 	<div id="pr1">
		</div>
		<div id="pr1">
		</div>
		<div id="pr1">
		</div>
	</div>
	<div id="header2">
		<div id="pr2"></div>
		<div id="pr2"></div>
		<div id="pr2"></div>
		<div id="pr2"></div>
	</div>
	<div id="main">
		<div id="top">
			<b>商品選択画面</b>
		</div>
		<div class="table-layout">

			<table>
				<s:iterator value="buyItemDTOList">
				<s:form action="BuyItemAction">
				<tr>
					<td class="itemname">
						<div class="left">

								<b>&nbsp;<s:property value="itemName" /></b>
						</div>
					</td>



				</tr>
				<tr>

					<td>
					<br>
						<div class="right">
							<s:property value="itemPrice" /><span>円</span>



						<input type="hidden" value="<s:property value='itemName'/>" name="itemName">
						<input type="hidden" value="<s:property value='itemPrice'/>" name="itemPrice">
						<!-- <s:submit value="購入する"/> -->
						<button class="buybutton" type="submit">購入する</button>
						</div>
					</td>






				</tr>

				</s:form>
				</s:iterator>

			</table>

		</div>
	</div>

	<div id="sub">
		<div id="sidemenu">
			<h3>Link</h3>
				<ul>
					<li><a href='<s:url action="GoHomeAction" />'><button class="button" type="submit">HOME</button></a></li>
					<li><a href='<s:url action="MyPageAction" />'><button class="button" type="submit">MYPAGE</button></a></li>
					<li><a href='<s:url action="HomeAction" />'><button class="button" type="submit">BUY</button></a></li>
					<li><a href='<s:url action="PutItemAction" />'><button class="button" type="submit">PUT</button></a></li>
					<li><a href='<s:url action="ContactAction" />'><button class="button" type="submit">CONTACT</button></a></li>
				</ul>
			<h3></h3>
				<ul>
					<li></li>
				</ul>
		</div>
	</div>

	<footer>
	</footer>

</body>
</html>