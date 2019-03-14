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
        	    tooltip : {
        	        trigger: 'axis',
        	        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
        	            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        	        }
        	    },
        	    legend: {
        	        data: ['5A景区', '4A景区','3A景区','2A景区','无级别']
        	    },
        	    grid: {
        	        left: '3%',
        	        right: '4%',
        	        bottom: '3%',
        	        containLabel: true
        	    },
        	    xAxis:  {
        	        type: 'value'
        	    },
        	    yAxis: {
        	        type: 'category',
        	        data: ['历史文化','主题乐园','自然风光','宗教文化']
        	    },
        	    series: [
        	        {
        	            name: '5A景区',
        	            type: 'bar',
        	            stack: '总量',
        	            label: {
        	                normal: {
        	                    show: true,
        	                    position: 'insideRight'
        	                }
        	            },
        	            data: [20,11,86,73]
        	        },
        	        {
        	            name: '4A景区',
        	            type: 'bar',
        	            stack: '总量',
        	            label: {
        	                normal: {
        	                    show: true,
        	                    position: 'insideRight'
        	                }
        	            },
        	            data: [8,30,66,39]
        	        },
        	        {
        	            name: '3A景区',
        	            type: 'bar',
        	            stack: '总量',
        	            label: {
        	                normal: {
        	                    show: true,
        	                    position: 'insideRight'
        	                }
        	            },
        	            data: [1,1,4,3]
        	        },
        	        {
        	            name: '2A景区',
        	            type: 'bar',
        	            stack: '总量',
        	            label: {
        	                normal: {
        	                    show: true,
        	                    position: 'insideRight'
        	                }
        	            },
        	            data: [0,0,1,0]
        	        },
        	        {
        	            name: '无级别',
        	            type: 'bar',
        	            stack: '总量',
        	            label: {
        	                normal: {
        	                    show: true,
        	                    position: 'insideRight'
        	                }
        	            },
        	            data: [4,117,34,43]
        	        }
        	    ]
        	};

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>