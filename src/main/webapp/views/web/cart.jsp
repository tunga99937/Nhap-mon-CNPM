

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Cart</title>
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
    
    <!-- Bootstrap -->
    <!---->
    <link href="Web/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    
    <link href="source/css/modern-business.css" rel="stylesheet" type="text/css"/>
    <link href="source/css/header.css" rel="stylesheet" type="text/css"/>
    <link href="source/css/footer.css" rel="stylesheet" type="text/css"/>
    
    <link href="/source/css/cart_css/mycart.css" rel="stylesheet" type="text/css"/>
    
    <!-- Font Awesome -->
    <link href="/source/css/cart_css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    
    <!-- Custom CSS -->
    <link href="source/css/cart_css/owl.carousel.css" rel="stylesheet" type="text/css"/>
    <link href="source/css/cart_css/style.css" rel="stylesheet" type="text/css"/>
    <link href="source/css/cart_css/responsive.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="/common/web/navigation.jsp" %>
        <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="single-sidebar">
                        <h2 class="sidebar-title">Search Products</h2>
                        <form action="#">
                            <input type="text" placeholder="Search products...">
                            <input type="submit" value="Search">
                        </form>
                    </div>
                    
                    <div class="single-sidebar">
                        <h2 class="sidebar-title">Products</h2>
                        <div class="thubmnail-recent">
                            <img src="https://c.static-nike.com/a/images/f_auto/q_auto/t_PDP_864_v1/v3p5ojqwpbttr5xvbrpy/free-metcon-2-ut-training-shoe-pwVsFv.jpg" class="recent-thumb" alt="">
                            <h2><a href="single-product.html">Nikey - 2015</a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> 
                            </div>                             
                        </div>
                        <div class="thubmnail-recent">
                            <img src="https://c.static-nike.com/a/images/f_auto/q_auto/t_PDP_864_v1/v3p5ojqwpbttr5xvbrpy/free-metcon-2-ut-training-shoe-pwVsFv.jpg" class="recent-thumb" alt="">
                            <h2><a href="single-product.html">Nikey - 2015</a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> 
                            </div>                             
                        </div>
                        <div class="thubmnail-recent">
                            <img src="https://c.static-nike.com/a/images/f_auto/q_auto/t_PDP_864_v1/v3p5ojqwpbttr5xvbrpy/free-metcon-2-ut-training-shoe-pwVsFv.jpg" class="recent-thumb" alt="">
                            <h2><a href="single-product.html">Nikey - 2015</a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> 
                            </div>                             
                        </div>
                        <div class="thubmnail-recent">
                            <img src="https://c.static-nike.com/a/images/f_auto/q_auto/t_PDP_864_v1/v3p5ojqwpbttr5xvbrpy/free-metcon-2-ut-training-shoe-pwVsFv.jpg" class="recent-thumb" alt="">
                            <h2><a href="single-product.html">Nikey - 2015</a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> 
                            </div>                             
                        </div>
                    </div>
                    
                    
                </div>
                
                <div class="col-md-8">
                    <div class="product-content-right">
                        <div class="woocommerce">
                            <form method="post" action="#">
                                <table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        <tr>
                                            <th class="product-remove">Option</th>
                                            <th class="product-thumbnail">Image</th>
                                            <th class="product-name">Product</th>
                                            <th class="product-price">Price</th>
                                            <th class="product-quantity">Quantity</th>
                                            <th class="product-subtotal">Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="cart_item">
                                            <td class="product-remove">
                                                <a title="Remove this item" class="remove" href="#">remove</a> 
                                            </td>

                                            <td class="product-thumbnail">
                                                <a href="single-product.html"><img width="145" height="145" alt="poster_1_up" class="shop_thumbnail" src="https://c.static-nike.com/a/images/f_auto/q_auto/t_PDP_864_v1/v3p5ojqwpbttr5xvbrpy/free-metcon-2-ut-training-shoe-pwVsFv.jpg"></a>
                                            </td>

                                            <td class="product-name">
                                                <a href="single-product.html">Ship Your Idea</a> 
                                            </td>

                                            <td class="product-price">
                                                <span class="amount">15.00$</span> 
                                            </td>

                                            <td class="product-quantity">
                                                <div class="quantity buttons_added">
                                                    <input type="button" class="minus" value="-">
                                                    <input type="number" size="4" class="input-text qty text" title="Qty" value="1" min="0" step="1">
                                                    <input type="button" class="plus" value="+">
                                                </div>
                                            </td>

                                            <td class="product-subtotal">
                                                <span class="amount">15.00$</span> 
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="actions" colspan="6">
                                                <div class="coupon">
                                                    <label for="coupon_code">Coupon:</label>
                                                    <input type="text" placeholder="Coupon code" value="" id="coupon_code" class="input-text" name="coupon_code">
                                                    <input type="submit" value="Apply Coupon" name="apply_coupon" class="button">
                                                </div>
                                                <input type="submit" value="Update Cart" name="update_cart" class="button">
                                                <input type="submit" formaction="/checkout" value="Checkout" name="proceed" class="checkout-button button alt wc-forward">
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </form>

                            <div class="cart-collaterals">


                            <div class="cross-sells">
                                <h2>You may be interested in...</h2>
                                <ul class="products">
                                    <li class="product">
                                        <a href="single-product.html">
                                            <img width="325" height="325" alt="T_4_front" class="attachment-shop_catalog wp-post-image" src="https://c.static-nike.com/a/images/f_auto/q_auto/t_PDP_864_v1/v3p5ojqwpbttr5xvbrpy/free-metcon-2-ut-training-shoe-pwVsFv.jpg">
                                            <h3>Ship Your Idea</h3>
                                            <span class="price"><span class="amount">20.00$</span></span>
                                        </a>

                                        <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="22" rel="nofollow" href="single-product.html">Select options</a>
                                    </li>

                                    <li class="product">
                                        <a href="single-product.html">
                                            <img width="325" height="325" alt="T_4_front" class="attachment-shop_catalog wp-post-image" src="https://c.static-nike.com/a/images/f_auto/q_auto/t_PDP_864_v1/v3p5ojqwpbttr5xvbrpy/free-metcon-2-ut-training-shoe-pwVsFv.jpg">
                                            <h3>Ship Your Idea</h3>
                                            <span class="price"><span class="amount">20.00$</span></span>
                                        </a>

                                        <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="22" rel="nofollow" href="single-product.html">Select options</a>
                                    </li>
                                </ul>
                            </div>


                            <div class="cart_totals ">
                                <h2>Cart Totals</h2>

                                <table cellspacing="0">
                                    <tbody>
                                        <tr class="cart-subtotal">
                                            <th>Cart Subtotal</th>
                                            <td><span class="amount">15.00$</span></td>
                                        </tr>

                                        <tr class="shipping">
                                            <th>Shipping and Handling</th>
                                            <td>Free Shipping</td>
                                        </tr>

                                        <tr class="order-total">
                                            <th>Order Total</th>
                                            <td><strong><span class="amount">15.00$</span></strong> </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                                
                            </div>
                        </div>                        
                    </div>                    
                </div>
            </div>
        </div>
    </div>
        <%@include file="/common/web/footer.jsp" %>
        <!-- Latest jQuery form server -->
    <script src="https://code.jquery.com/jquery.min.js"></script>
    
    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    
    <!-- jQuery sticky menu -->
    <script src="source/js/cart_js/owl.carousel.min.js" type="text/javascript"></script>
    <script src="source/js/cart_js/jquery.sticky.js" type="text/javascript"></script>
    
    <!-- jQuery easing -->
    <script src="source/js/cart_js/jquery.easing.1.3.min.js" type="text/javascript"></script>
    
    <!-- Main Script -->
    <script src="source/js/cart_js/main.js" type="text/javascript"></script>
    </body>
</html>
