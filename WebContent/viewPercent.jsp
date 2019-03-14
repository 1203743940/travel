<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
    <!-- 引入 echarts.js -->
    <script src="echarts.min.js"></script>
</head>
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 100%;height:800px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        

        // 指定图表的配置项和数据
        var  option = {
        	    title : {
        	        text: '热门景点分析',
        	        subtext: '类别分析',
        	        x:'15%'
        	    },
        	    tooltip : {
        	        trigger: 'item',
        	        formatter: "{a} <br/>{b} : {c} ({d}%)"
        	    },
        	    legend: {
        	        orient: 'vertical',
        	        left: 'left',
        	        data: ['历史文化','自然风光','主题乐园','宗教文化']
        	    },
        	    series : [
        	        {
        	            name: '景点类别',
        	            type: 'pie',
        	            radius : '55%',
        	            center: ['20%', '40%'],
        	            data:[
        	                {value:158, name:'历史文化'},
        	                {value:191, name:'自然风光'},
        	                {value:159, name:'主题乐园'},
        	                {value:33, name:'宗教文化'},
        	                
        	            ],
        	            itemStyle: {
        	                emphasis: {
        	                    shadowBlur: 10,
        	                    shadowOffsetX: 0,
        	                    shadowColor: 'rgba(0, 0, 0, 0.5)'
        	                }
        	            }
        	        }
        	    ]
        	};

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>