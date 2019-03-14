<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">
#sosuo{
  position: absolute;
}
    .search {
        font-size:18px;
        font-family: 宋体;
        color: blue;
             
    }
    em{
        font-size:25px;
        font-family: 楷体;
        font-weight: bold;
        color: #7AC5CD;
    }
    .right{
        font-size:20px;
        font-family: 宋体;
        font-weight: bold;
        color: 8EE5EE;
        float:right;
    }
    .grade{
    font-size: 30px;
    color : yellow;
    
    }
    </style>
<title>Home</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Walk Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> 
addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/component.css" rel="stylesheet" type="text/css"  />
<!-- <script src="js/jquery-1.11.1.min.js"></script>js -->
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>


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
</head>
	
<body class="cbp-spmenu-push">
<div id="shard" ></div>
<!-- banner -->
	<div  class="banner">
		<div class="container">
			<div class="header">
				<div class="header-left">
					<form action="SearchView?page=1" method="post">
						<input type="text"  name="search" value="Search Here..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search Here...';}" required="">
						<input type="submit" value="" >
<div id="sosuo" style="display:none">
     <div>
         <em>搜索历史</em>
         <p>
         <a href="/#" title="天津">天津</a>
         <a href="/#" title="天津">武汉</a>
         <a href="/#" title="天津">杭州</a>
         </p>
     </div>
     <div><em>热门城市</em>
     <p>
         <a href="/#" title="天津">天津</a>
         <a href="/#" title="天津">武汉</a>
         <a href="/#" title="天津">杭州</a>
         </p>
     </div>
     
     <div><em>热门景点</em>
     <p>
         <a href="/#" title="天津">东湖</a>
         <a href="/#" title="天津">樱花</a>
         <a href="/#" title="天津">磨山</a>
         </p></div>
</div>
						<div class="clearfix">
						 
						</div>
					</form>
				</div>
				<div class="header-left1">
					<h1><a href="index.html">Walk<span>Where To Go  After Graduation?</span></a></h1>
				</div>
				<!-- #push_sidebar -->
				<div class="top-nav">
					 <nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-right" id="cbp-spmenu-s2">
						<h3>Menu</h3>
						<ul>
							<li class="active"><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>首页</a></li>
							<li><a href="analyse.jsp"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>热度分析</a></li>
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
			<div class="banner-info">
				<h3>Discover The Most Beautiful Places</h3>
				<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore 
					eu fugiat nulla pariatur.</p>
				<div class="more">
					<!-- <a href="login/login.html" class="type-4"> -->
					 <a href="login/info.jsp" class="type-4">
						<span> 登录/注册 </span>a
						<span> 登录/注册 </span>
						<span> 登录/注册 </span>
						<span> 登录/注册 </span>	
						<span> 登录/注册 </span>
						<span> 登录/注册 </span>
					</a>
				</div>
				<div class="social-icons">
					<ul>
						<li><a href="#" class="twitter"></a></li>
						<li><a href="#" class="facebook"></a></li>
						<li><a href="#" class="google"></a></li>
						<li><a href="#" class="p"></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
<!-- //banner -->
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >ä¼ä¸ç½ç«æ¨¡æ¿</a></div>
<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="col-md-2 banner-bottom-left">
			
		</div>
		<div class="col-md-3 banner-bottom-left1">
			<div class="banner-bottom-left1-grid">
				<div class="globe">
					<span></span>
				</div>
				<h3><span>We will turn </span>your dreams to reality</h3>
				<div class="progress progress1">
				  <div class="progress-bar progress-bar1" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:40%;">
					<span class="sr-only">40% Complete</span>
				  </div>
				</div>
				<p>"But I must explain to you how all this mistaken idea of denouncing pleasure and 
					praising pain was born and I will give you a complete account of the system.</p>
				<div class="more m1">
					
				</div>
			</div>
		</div>
		<div class="col-md-7 banner-bottom-left2">
			<div class="grid">
				<figure class="effect-lexi effect-lexi1">
					<img src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1527871198624&di=54ff69eb2a96867571db122fff28451a&imgtype=0&src=http%3A%2F%2Fpic.kekenet.com%2F2015%2F0819%2F31271439980421.jpg" alt="" class="img-responsive" />
					<figcaption class="lexifig">
						<h4>Wuhan University of <span>Technology</span></h4>
						<p>To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it.</p>
					</figcaption>			
				</figure>
			</div>
			<h3>Certainly, travel is more than the seeing of sights; it is a change that goes on,
				deep and permanent, in the ideas of living.</h3>
		</div>
		<div class="clearfix"> </div>
	</div>
	<div class="banner-bottom1">
		<div class="col-md-6 banner-bottom-left2 banner-bottom1-left2">
			<div class="grid">
				<figure class="effect-lexi">
					<img src="http://img1.qunarzz.com/sight/p0/1409/19/adca619faaab0898245dc4ec482b5722.jpg_710x360_7486df6c.jpg" alt="" class="img-responsive" />
					<figcaption>
						
						<p class="grade">外朝,内廷,建筑,两翼,大殿,中心</p>
					</figcaption>			
				</figure>
			</div>
		</div>
		<div class="col-md-4 banner-bottom-lft1">
			<h3>01 .</h3>
			<h4 class="with">故宫</h4>
			
			<div class="progress progress1 progress2">
			  <div class="progress-bar progress-bar1" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:40%;">
				<span class="sr-only">40% Complete</span>
			  </div>
			</div>
			<p>5A景区<br>
			地点：北京市东城区景山前街4号<br>
			游客评分:<span class="grade">5.0</span>/5分<br>
			评论次数：214635<br>
			热度：<span class="grade">100</span></p>
			<span>&nbsp;<br></span>
				<span>&nbsp;</span>
				<div class="more m1">
					<a href="ClickView?s_id=1" class="type-4">
						<span> Read More... </span>
						<span> Read More... </span>
						<span> Read More... </span>
						<span> Read More... </span>	
						<span> Read More... </span>
						<span> Read More... </span>
					</a>
		    </div>
		</div>
		<div class="col-md-2 banner-bottom-left">
			
		</div>
		<div class="clearfix"> </div>
		<div class="col-md-2 banner-bottom-left">
			
		</div>
		<div class="col-md-4 banner-bottom-lft1">
			<h3>02 .</h3>
			<h4 class="with">上海迪士尼乐园</h4>
			<div class="progress progress1 progress2">
			  <div class="progress-bar progress-bar1" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:40%;">
				<span class="sr-only">40% Complete</span>
			  </div>
			</div>
			<p>5A景区<br>
			地点：上海市浦东新区川沙新镇上海迪士尼度假区内<br>
			游客评分:<span class="grade">5.0</span>/5分<br>
			评论次数：146205<br>
			热度：<span class="grade">100</span></p>
			<span>&nbsp;<br></span>
				<span>&nbsp;</span>
				<div class="more m1">
					<a href="ClickView?s_id=923" class="type-4">
						<span> Read More... </span>
						<span> Read More... </span>
						<span> Read More... </span>
						<span> Read More... </span>	
						<span> Read More... </span>
						<span> Read More... </span>
					</a>
		    </div>
		</div>
		<div class="col-md-6 banner-bottom-left2 banner-bottom1-left2">
			<div class="grid">
				<figure class="effect-lexi effect-lexi1">
					<img src="http://img1.qunarzz.com/sight/p0/1607/7c/7cda8b6782dabd80b4.img.jpg_710x360_fdc4fcac.jpg" alt="" class="img-responsive" />
					<figcaption class="lexifig">
						
						<p class="grade">酒店,乐园,花园,上海,客房,牡丹</p>
					</figcaption>			
				</figure>
			</div>
		</div>
		<div class="clearfix"> </div>
	</div>
<!-- //banner-bottom -->
<!-- banner-bottom-slider -->
	<div class="banner-bottom-slider">
		<div class="container">
			<div class="col-md-4 banner-bottom-slider-left">
				<h3>Let's go on an <span>Adventurous Travel</span></h3>
				<p>No one rejects, dislikes, or avoids pleasure itself, because it is pleasure.</p>
			</div>
			<div class="col-md-8 banner-bottom-slider-right">
				<ul id="flexiselDemo1">	
					<li>
						<div class="banner-bottom-slider-right1">
							<img src="images/5.jpg" alt=" " class="img-responsive" />
							<ul>
								<li><a href="#"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> 8</a></li>
								<li><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Admin</a></li>
								<li><a href="#"><span class="glyphicon glyphicon-tags" aria-hidden="true"></span> 8</a></li>
							</ul>
							<p><i>" travel <span>becomes</span> a strategy for accumulating <span>Photographs</span>."</i></p>
						</div>
					</li>
					<li>
						<div class="banner-bottom-slider-right1">
							<img src="images/7.jpg" alt=" " class="img-responsive" />
							<ul>
								<li><a href="#"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> 8</a></li>
								<li><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Admin</a></li>
								<li><a href="#"><span class="glyphicon glyphicon-tags" aria-hidden="true"></span> 8</a></li>
							</ul>
							<p><i>" <span>journey</span> is best measured in friends, rather than <span>miles</span>."</i></p>
						</div>
					</li>
					<li>
						<div class="banner-bottom-slider-right1">
							<img src="images/6.jpg" alt=" " class="img-responsive" />
							<ul>
								<li><a href="#"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> 8</a></li>
								<li><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Admin</a></li>
								<li><a href="#"><span class="glyphicon glyphicon-tags" aria-hidden="true"></span> 8</a></li>
							</ul>
							<p><i>" <span>nature</span> is one our greatest <span>teachers</span>."</i></p>
						</div>
					</li>
				</ul>
					<script type="text/javascript">
						$(window).load(function() {
						$("#flexiselDemo1").flexisel({
							visibleItems: 3,
							animationSpeed: 1000,
							autoPlay: true,
							autoPlaySpeed: 3000,    		
							pauseOnHover: true,
							enableResponsiveBreakpoints: true,
							responsiveBreakpoints: { 
								portrait: { 
									changePoint:480,
									visibleItems: 1
								}, 
								landscape: { 
									changePoint:640,
									visibleItems: 2
								},
								tablet: { 
									changePoint:768,
									visibleItems: 3
								}
							}
						});
						
					 });
					</script>
					<script type="text/javascript" src="js/jquery.flexisel.js"></script>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //banner-bottom-slider -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="col-md-3 footer-grid">
				<img src="images/8.jpg" alt=" " class="img-responsive" />
			</div>
			<div class="col-md-3 footer-grid">
				<h2><a href="index.html">Walk<span>Where To Go This Summer?</span></a></h2>
				<p>But I must explain to you how all this mistaken idea of denouncing pleasure 
					and praising pain was born.</p>
				<ul>
					<li><span class="glyphicon glyphicon-home" aria-hidden="true"></span> 738 Diamond Road, New York City, USA.</li>
					<li><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span><a href="mailto:info@example.com">info@example.com</a></li>
					<li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span> +7683 928 829</li>
				</ul>
			</div>
			<div class="col-md-3 footer-grid">
				<h4>Flickr Photos</h4>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/5.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/6.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/7.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/6.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/7.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/5.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/7.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/5.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/6.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="col-md-3 footer-grid">
				<h4>Booking Hours</h4>
				<div class="footer-grid2">
					<ul class="timings">
						<li>Monday <i>.....</i> 10AM to 7PM</li>
						<li>Friday <i>.....</i> 9AM to 5PM</li>
						<li>Sunday <i>.....</i> 10AM to 2PM</li>
					</ul>
					<div class="social-icons social-icons1">
						<ul>
							<li><a href="#" class="twitter"></a></li>
							<li><a href="#" class="facebook"></a></li>
							<li><a href="#" class="google"></a></li>
							<li><a href="#" class="p"></a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="footer-copy">
		<div class="container">
			<p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a> - Collect from <a href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿" target="_blank">ç½é¡µæ¨¡æ¿</a></p>
		</div>
	</div>
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
<script>
    $('#shard').hide();
    $('#inp').on('click',function(){
        $('#sosuo').css('display','block');
        $('#shard').off('click');
        $('body').off('click');
        $('#shard').hide();
        setTimeout(function(){
            $('#shard').show();
            $('body').click(function(event){
            	console.log(event);
            	console.log(document.getElementById('sosuo'));
            	
            	if(730>event.clientX||event.clientX<364||180<event.clientY||event.clientY<20){
            		
            	$('#sosuo').css('display','none');
            	$('#shard').hide();}
            	 else{
            		//alert('fff');
            	}
            });
/*             $('#shard').one('click',function(){
                
            	alert('f');
                $('#sosuo').css('display','none');
                $('#shard').hide();
            }); */
        }
            , 0);
    });

</script>
<!-- //here ends scrolling icon -->
</body>
</html>