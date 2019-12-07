<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Home Shop</title>

<!-- Bootstrap core CSS -->
<link href="Web/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="Web/css/modern-business.css" rel="stylesheet">
<base href="/">
</head>
<body>

	<%@include file="/common/web/navigation.jsp" %>

	<div class="row">

		<!-- Blog Entries Column -->
		<div class="col-md-12">

			<sitemesh:write property='body' />

		</div>

	</div>
	<!-- /.row -->

	<%@include file="/common/web/footer.jsp" %>

	<script src="Web/vendor/jquery/jquery.min.js"></script>
	<script src="Web/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>