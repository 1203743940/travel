<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Services</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Walk Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/component.css" rel="stylesheet" type="text/css"  />
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Bad+Script' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
<style type="text/css">
	.blog-figure {
   
    height: 200px;
}
    </style>
</head>

<body class="cbp-spmenu-push">
<!-- banner -->
	<div class="banner1">
		<div class="container">
			<div class="header">
				<div class="header-left">
					<form action="SearchView?page=1" method="post">
						<input type="text" name="search" value="Search Here..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search Here...';}" required="">
						<input type="submit" value="" >
						<div class="clearfix"> </div>
					</form>
				</div>
				<div class="header-left1">
					<h1><a href="index.html">Walk<span>Where To Go This Summer?</span></a></h1>
				</div>
				<!-- #push_sidebar -->
				<div class="top-nav">
					 <nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-right" id="cbp-spmenu-s2">
						<h3>Menu</h3>
						<ul>
							<li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>首页</a></li>
							<li class="active"><a href="analyse.jsp"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>热度分析</a></li>
							<li><a href="kindScenery?kind=文化古迹&page=1"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span>文化古迹</a></li>
							<li><a href="kindScenery?kind=自然风光&page=1"><span class="glyphicon glyphicon-picture" aria-hidden="true"></span>自然风光</a></li>
							<li><a href="kindScenery?kind=主题乐园&page=1"><span class="glyphicon glyphicon-text-size" aria-hidden="true"></span>主题乐园</a></li>
							<li><a href="kindScenery?kind=宗教文化&page=1"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>宗教文化</a></li>
						</ul>
					</nav>
					 <div class="main buttonset">	
					<!-- Class "cbp-spmenu-open" gets applied to menu and "cbp-spmenu-push-toleft" or "cbp-spmenu-push-toright" to the body -->
						<button id="showRightPush"><img src="images/menu.png" alt=""/></button>
					</div>
				<!-- Classie - class helper functions by @desandro https://github.com/desandro/classie -->
						<script src="js/classie.js"></script>
						<script>
							var menuRight = document.getElementById( 'cbp-spmenu-s2' ),
							showRightPush = document.getElementById( 'showRightPush' ),
							body = document.body;

							showRightPush.onclick = function() {
								classie.toggle( this, 'active' );
								classie.toggle( body, 'cbp-spmenu-push-toleft' );
								classie.toggle( menuRight, 'cbp-spmenu-open' );
								disableOther( 'showRightPush' );
							};

							function disableOther( button ) {
								if( button !== 'showRightPush' ) {
									classie.toggle( showRightPush, 'disabled' );
								}
							}
						</script>
						<!-- /script-for-menu -->
				</div>
				<!-- /#push_sidebar -->
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //banner -->
<!-- services -->
	<div class="services">
		<div class="container">
			<h3>Analyse</h3>
			<p class="dummy-text">travel brings power and love back to your life.</p>
			<div class="services-grids">
				<div class="col-md-4 services-grid">
					<figure class="blog-figure">
						<img class="blog-figure" src="image/3.1.1.png" alt=" " class="img-responsive" />
						<div class="blog-discription">
							<div class="theme-border">
								<div class="tg-display-table">
									<div class="tg-display-table-cell">
										<div class="blog-title">
											<h4><a href="index.jsp">Walk</a></h4>
											<ul class="blod-meta">
												<li>热门景点四五月份销量对比图</li>
												<li>YEAR:  2018</li>
												<div class="clearfix"> </div>
											</ul>
											<p>数据来自去哪儿网</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</figure>
					<h5><a href="test.html">上海迪尼斯乐园、故宫、成都熊猫基地位居前三！</a></h5>
					<div class="more more1">
						<a href="test.html" class="type-4 type-41">
							<span> Read More... </span>
							<span> Read More... </span>
							<span> Read More... </span>
							<span> Read More... </span>	
							<span> Read More... </span>
							<span> Read More... </span>
						</a>
					</div>
				</div>
				<div class="col-md-4 services-grid">
					<figure class="blog-figure">
						<img class="blog-figure" src="image/3.3.1.png" alt=" " class="img-responsive" />
						<div class="blog-discription">
							<div class="theme-border">
								<div class="tg-display-table">
									<div class="tg-display-table-cell">
										<div class="blog-title">
											<h4><a href="index.jsp">Walk</a></h4>
											<ul class="blod-meta">
												<li>热门景点类别级别关系图</li>
												<li>YEAR: 2018</li>
												<div class="clearfix"> </div>
											</ul>
											<p>数据来自去哪儿网</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</figure>
					<h5><a href="Aview.jsp">去主题乐园就不需要看景区的等级了。</a></h5>
					<div class="more more1">
						<a href="Aview.jsp" class="type-4 type-41">
							<span> Read More... </span>
							<span> Read More... </span>
							<span> Read More... </span>
							<span> Read More... </span>	
							<span> Read More... </span>
							<span> Read More... </span>
						</a>
					</div>
				</div>
				<div class="col-md-4 services-grid">
					<figure class="blog-figure">
						<img class="blog-figure" src="image/3.4.2.png" alt=" " class="img-responsive" />
						<div class="blog-discription">
							<div class="theme-border">
								<div class="tg-display-table">
									<div class="tg-display-table-cell">
										<div class="blog-title">
											<h4><a href="index.jsp">Walk</a></h4>
											<ul class="blod-meta">
												<li> 拥有热门景点最多的省份</li>
												<li>YEAR: 2018</li>
												<div class="clearfix"> </div>
											</ul>
											<p>数据来自去哪儿网</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</figure>
					<h5><a href="viewCity.jsp">去浙江、江苏旅游可以享受更多的景点。</a></h5>
					<div class="more more1">
						<a href="viewCity.jsp" class="type-4 type-41">
							<span> Read More... </span>
							<span> Read More... </span>
							<span> Read More... </span>
							<span> Read More... </span>	
							<span> Read More... </span>
							<span> Read More... </span>
						</a>
					</div>
				</div>
				
				<div class="clearfix"> </div>
				<br>
				<br>
				<br>
				
				<div class="col-md-4 services-grid">
					<figure class="blog-figure">
						<img class="blog-figure" src="image/3.2.png" alt=" " class="img-responsive" />
						<div class="blog-discription">
							<div class="theme-border">
								<div class="tg-display-table">
									<div class="tg-display-table-cell">
										<div class="blog-title">
											<h4><a href="index.jsp">Walk</a></h4>
											<ul class="blod-meta">
												<li>热门景点类别占比图</li>
												<li>YEAR:  2018</li>
												<div class="clearfix"> </div>
											</ul>
											<p>数据来自去哪儿网</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</figure>
					<h5><a href="viewPercent.jsp">自然风光的景点占比最高,更受欢迎。</a></h5>
					<div class="more more1">
						<a href="viewPercent.jsp" class="type-4 type-41">
							<span> Read More... </span>
							<span> Read More... </span>
							<span> Read More... </span>
							<span> Read More... </span>	
							<span> Read More... </span>
							<span> Read More... </span>
						</a>
					</div>
				</div>
				<div class="col-md-4 services-grid">
					<figure class="blog-figure">
						<img class="blog-figure" src="image/3.5.png" alt=" " class="img-responsive" />
						<div class="blog-discription">
							<div class="theme-border">
								<div class="tg-display-table">
									<div class="tg-display-table-cell">
										<div class="blog-title">
											<h4><a href="index.jsp">Walk</a></h4>
											<ul class="blod-meta">
												<li>景点四月份月销量分布图</li>
												<li>YEAR:  2018</li>
												<div class="clearfix"> </div>
											</ul>
											<p>数据来自去哪儿网</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</figure>
					<h5><a href="show.jsp">北京上海以及沿海城市较为火热。</a></h5>
					<div class="more more1">
						<a href="show.jsp" class="type-4 type-41">
							<span> Read More... </span>
							<span> Read More... </span>
							<span> Read More... </span>
							<span> Read More... </span>	
							<span> Read More... </span>
							<span> Read More... </span>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- <div class="offered-services">
		<div class="container">
			<h3>Offered Services</h3>
			<p class="dummy-text">travel brings power and love back to your life.</p>
			<div class="offered-services-grids">
				<div class="col-md-4 offered-services-grid">
					<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
					  <div class="panel panel-default">
						<div class="panel-heading" role="tab" id="headingOne">
						  <h4 class="panel-title">
							<a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
							  Produces no resultant pleasure
							</a>
						  </h4>
						  <p>"But I must explain to you how all this mistaken idea of denouncing 
							pleasure.</p>
						</div>
						<div id="collapseOne" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne">
						  <div class="panel-body">
							Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.
						  </div>
						</div>
					  </div>
					  <div class="panel panel-default">
						<div class="panel-heading" role="tab" id="headingTwo">
						  <h4 class="panel-title">
							<a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
							  Fugiat quo voluptas nulla par
							</a>
						  </h4>
						  <p>"But I must explain to you how all this mistaken idea of denouncing 
							pleasure.</p>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
						  <div class="panel-body">
							Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.
						  </div>
						</div>
					  </div>
					  <div class="panel panel-default">
						<div class="panel-heading" role="tab" id="headingThree">
						  <h4 class="panel-title">
							<a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
							  Perferendis doloribus asperiores
							</a>
						  </h4>
						  <p>"But I must explain to you how all this mistaken idea of denouncing 
							pleasure.</p>
						</div>
						<div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
						  <div class="panel-body">
							Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.
						  </div>
						</div>
					  </div>
					</div>
				</div>
				<div class="col-md-4 offered-services-grid">
					<img src="images/15.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="col-md-4 offered-services-grid1">
					<div class="panel-group1" id="accordion1" role="tablist" aria-multiselectable="true">
					  <div class="panel panel-default panel1">
						<div class="panel-heading" role="tab" id="headingFour">
						  <h4 class="panel-title panel-title1">
							<a role="button" data-toggle="collapse" data-parent="#accordion1" href="#collapseFour" aria-expanded="true" aria-controls="collapseFour">
							  Produces no resultant pleasure
							</a>
						  </h4>
						  <p>"But I must explain to you how all this mistaken idea of denouncing 
							pleasure.</p>
						</div>
						<div id="collapseFour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
						  <div class="panel-body">
							Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.
						  </div>
						</div>
					  </div>
					  <div class="panel panel-default panel1">
						<div class="panel-heading" role="tab" id="headingFive">
						  <h4 class="panel-title panel-title1">
							<a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion1" href="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
							  Fugiat quo voluptas nulla par
							</a>
						  </h4>
						  <p>"But I must explain to you how all this mistaken idea of denouncing 
							pleasure.</p>
						</div>
						<div id="collapseFive" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFive">
						  <div class="panel-body">
							Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.
						  </div>
						</div>
					  </div>
					  <div class="panel panel-default panel1">
						<div class="panel-heading" role="tab" id="headingSix">
						  <h4 class="panel-title panel-title1">
							<a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion1" href="#collapseSix" aria-expanded="false" aria-controls="collapseSix">
							  Perferendis doloribus asperiores
							</a>
						  </h4>
						  <p>"But I must explain to you how all this mistaken idea of denouncing 
							pleasure.</p>
						</div>
						<div id="collapseSix" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSix">
						  <div class="panel-body">
							Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.
						  </div>
						</div>
					  </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			for bootstrap working
				<script src="js/bootstrap.js"></script>
			//for bootstrap working
		</div>
	</div> -->
<!-- //services -->

<!-- //footer -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
</body>
</html>