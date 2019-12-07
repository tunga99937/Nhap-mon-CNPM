<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Page Content -->
<div class="container">
	<style>
.sticky {
	position: sticky;
	top: 100px;
}
</style>
	<div id="demo" class="carousel slide" data-ride="carousel">

		<!-- Indicators -->
		<ul class="carousel-indicators">
			<li data-target="#demo" data-slide-to="0" class="active"></li>
			<li data-target="#demo" data-slide-to="1"></li>
			<li data-target="#demo" data-slide-to="2"></li>
		</ul>

		<!-- The slideshow -->
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img
					src="https://images.unsplash.com/photo-1520316587275-5e4f06f355e6?ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60"
					alt="nike" width="1100" height="500">
			</div>
			<div class="carousel-item">
				<img
					src="https://images.unsplash.com/photo-1460353581641-37baddab0fa2?ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60"
					alt="nike" width="1100" height="500">
			</div>
			<div class="carousel-item">
				<img
					src="https://images.unsplash.com/photo-1495557077419-2384a0150025?ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60"
					alt="nike" width="1100" height="500">
			</div>
		</div>

		<!-- Left and right controls -->

		<a class="carousel-control-prev" href="#demo" data-slide="prev"> <span
			class="carousel-control-prev-icon"></span>
		</a> <a class="carousel-control-next" href="#demo" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>
	</div>
	<div class="row">

		<div class="col-lg-3">
			<div class="sticky">
				<h1 class="my-4">Category</h1>
				<div class="list-group">
					<c:forEach var="list" items="${ category}">
						<a href="/${list.categoryName}" class="list-group-item bg-warning">${list.categoryName }</a>
					</c:forEach>
				</div>
			</div>

		</div>

		<div class="col-lg-9">
			<br>
			<h2 class="related-products-title">Product-Men</h2>


			<!-- Marketing Icons Section -->
			<c:forEach var="i" begin="0" end="2">
				<div class="row">
					<c:forEach var="j" begin="0" end="2">
						<div class="col-lg-4 mb-4">
							<div class="card h-100">
								<img class="card-img"
									src="Image/Product/Men/${product.get(i*3+j).get(0).image}">
								<div class="card-body">
									<h4>${product.get(i*3 +j).get(1).productName}</h4>
								</div>
								<div class="card-footer">

									<p class="text-color-secondary ">${product.get(i*3 +j).get(1).price}</p>
									<a class="add_to_cart_button text-center" data-quantity="1"
										data-product_sku="" data-product_id="70" rel="nofollow"
										href="/cart">Add to cart</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</c:forEach>
		</div>

		<!--<div class="row">-->
		<div class="brands-area">
			<h2 class="related-products-title">Trusted Partners</h2>
			<div class="zigzag-bottom"></div>
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="brand-wrapper">
							<div class="brand-list">
								<img src="Image/image/index/brand-1.jpg" alt="@" /> <img
									src="Image/image/index/brand-2.jpg" alt="@" /> <img
									src="Image/image/index/brand-3.jpg" alt="@" /> <img
									src="Image/image/index/brand-4.jpg" alt="@" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!--</div>-->
		<!-- End brands area -->
	</div>
</div>
<br>
<br>
<!-- /.container -->
