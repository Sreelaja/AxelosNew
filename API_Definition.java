package io.restassured.restassuredapi;

public class API_Definition {

	
	//Client - Communication protocol - UI front end. Server - back end code , stored in the DB
	//Example - Hotels.com and Marriot
	//Marriot can expose the API
	
//API acts as an interface between Client and Server, API is independent of any language
//front end captures the data and send it via API as jason or xml format
//Api Gets the details and sends to back end and respond back in Jason and show in front end with the reservation number.	
	
//	There are REST, SOAP API'S SERVICES
//REST uses specific standards - test to make sure they are correct correct API's. they can get random information in the front end. if the API isnt tested, you might end up with major bugs.
	//Endpoint/Base URL - is where the API is hosted on the server
	//There are different methods where GET, POST, PUT, DELETE
	
	//GET - to retrieve data from server
	
	//marriot in example, existing reservation details will be sent to the API (which they would expose)that will be send to the appropriate method, GET will send it to DB and then send it back to API and then to front end.
	
	// POST is used to send data to the server. Create something on the server
	//PUT - update something on the server
	//DELETE - To delete data from the server
	//CRUD 
	
	//Resources - google.com is the server where all your API's are stored like maps, search, images
	//google.com/maps - resource name is maps
	//Path parameters - variable parts of a URL path. Typically used to point to a specific resource within a collection such as an ID
	//google.com/maps/1123343
	//Query parameters - sort/filter the resources. parameters are always identified with ? Question mark.  Path parameters identified by / slash
	
	
	//Query parameters are a defined set of parameters (key-value pair) attached to the end of a URL used to provide additional information to a web server when making requests. 
	//They are an important part of the URL that define specific content or actions based on the data being passed.
	//BaseURL/resource/Query/path parameters
	//Headers - Additional details we send to API
	
	// When you are asked for API testing, you require API contract which has the Base URL, Resource, Query Parameters, HTTP Method.
	//Manual testing using Postman
	// BaseURL: https://rahulshettyacademy.com
	//Resource: /maps/api/place/add/json
	//http Method: POST
	
//	https://rahulshettyacademy.com/maps/api/place/add/json?key=
	
	//Sample Body such as Location , accuracy,
	// once the raw is selected in the body and  Json is chosen Header is automatically selected as Content Type.
	// Sample response:
	
	
	//When its GET HTTP method, everything that is required will be sent in Complete URL
	
}
