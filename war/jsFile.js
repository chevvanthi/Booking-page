$(document).ready(function(){
	
	let companyKey = "21b175b5-5c6c-4bb8-b141-ee9c3734b67e";
	console.log("inside the js function");
	
 $.ajax	({
	 
	 type : 'POST',
	 url  :'getDetails',
	 data : companyKey,
	 
	 
 });
		
});