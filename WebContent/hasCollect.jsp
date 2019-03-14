<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="com.model.Scenery"%>
<%@page import=" java.util.ArrayList"%>
<%@page import=" java.util.List"%>

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
    .pagination1{
    	text-align: center
    }
    .grade{
    font-size: 30px;
    color : yellow;
    
    }
    .recommend{
    font-size: 30px;
    color : black;
    
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
						<input type="text" name="search" value="Search Here..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search Here...';}" required="">
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
							<li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>首页</a></li>
							<li><a href="about.html"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>热度分析</a></li>
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
						<span> 登录/注册 </span>
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

<!-- banner-bottom -->

<% List<Scenery> searchSonList=new ArrayList<Scenery>();
searchSonList=(List<Scenery>)request.getAttribute("sceneryList"); %>
								<h4 class="recommend">收藏的景点有<%= searchSonList.size()  %>个</h4>
<% for(int i=0;i<searchSonList.size()-1;i=i+2){%>

		<div class="clearfix"> </div>
	</div>
	
	<div class="banner-bottom1">
	
		<div class="col-md-6 banner-bottom-left2 banner-bottom1-left2">
		
			<div class="grid">
				<figure class="effect-lexi">
					<img src="<%= searchSonList.get(i).getImg().split(",")[0] %>" alt="" class="img-responsive" />
					<figcaption>
						
						<p class="grade"><%= searchSonList.get(i).getKeyword()%><p>
						
					</figcaption>			
				</figure>
			</div>
		</div>
		<div class="col-md-4 banner-bottom-lft1">
		
			<h3>0<%= i+1 %> .</h3>
			<h4 class="with"><%= searchSonList.get(i).getS_name() %></h4>
			
			<div class="progress progress1 progress2">
			  <div class="progress-bar progress-bar1" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:40%;">
				<span class="sr-only">40% Complete</span>
			  </div>
			</div>
			<p><%= searchSonList.get(i).getLevel() %><br>
			地点：<%= searchSonList.get(i).getPlace() %><br>
			游客评分:<span class="grade"><%= searchSonList.get(i).getGrade() %></span>/5分<br>
			评论次数：<%= searchSonList.get(i).getComment() %><br>
			热度：<span class="grade"><%= searchSonList.get(i).getHotnum() %></span></p>
				<span>&nbsp;<br></span>
				<span>&nbsp;</span>
				<div class="more m1">
					<a href="ClickView?s_id=<%=searchSonList.get(i).getS_id() %>" class="type-4">
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
		
		<% if(i==8){%>	<h3><%= i+2 %> .</h3>
		<%}else {%> <h3><%= i+2 %> .</h3> <%} %>
			<h4 class="with"><%= searchSonList.get(i+1).getS_name() %></h4>
			<div class="progress progress1 progress2">
			  <div class="progress-bar progress-bar1" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:40%;">
				<span class="sr-only">40% Complete</span>
			  </div>
			</div>
			<p><%= searchSonList.get(i+1).getLevel() %><br>
			地点：<%= searchSonList.get(i+1).getPlace() %><br>
			游客评分:<span class="grade"><%= searchSonList.get(i+1).getGrade() %></span>/5分<br>
			评论次数：<%= searchSonList.get(i+1).getComment() %><br>
			热度：<span class="grade"><%= searchSonList.get(i+1).getHotnum() %></span></p>
				<span>&nbsp;<br></span>
				<span>&nbsp;</span>
				
				<div class="more m1">
					<a href="ClickView?s_id=<%=searchSonList.get(i+1).getS_id()%> " class="type-4">
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
					<img src="<%= searchSonList.get(i+1).getImg().split(",")[0]%>" alt="" class="img-responsive" />
					<figcaption class="lexifig">
						
						<p class="grade"><%= searchSonList.get(i+1).getKeyword()%></p>
						<span>&nbsp;<br></span>
					</figcaption>			
				</figure>
			</div>
		</div>
		<div class="clearfix"> </div>
	</div> <% } %>
	
<!-- //banner-bottom -->
<!-- banner-bottom-slider -->
	
<!-- //banner-bottom-slider -->

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