define(['text'], function(text){
	//
//	   		cube.gatewayURL = "http://localhost:9999";
//	   		cube.gatewayURL_emp = "http://localhost:9996";
	//修改成网关地址，统一路由
			cube.gatewayURL = "http://localhost:8050";
			cube.importComponent("controls.menu");
			cube.importComponent("layout.include");
			cube.importComponent("datacontainer.tree");
			cube.importComponent("datacontainer.datagrid");
	         cube.importComponent("datacontainer.searchbox");
	         cube.importComponent("controls.toolbar");
	         cube.importComponent("datacontainer.dataform");
});