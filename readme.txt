Getting Started
	Install MySql 8 database and create a db named cartdb
	make sure you are changing password and matching as per our application.
	run this application as java application or spring boot application.
	select ShoppingCartDemoRestApiApplication.java and hit ok if asked.
	go to browser and follow the swagger URL that is given at the end of this file.

application.properties:
	Here, we need to change database and their credentials as per local or remote mapping
	spring.jpa.hibernate.ddl-auto = update will create database if not created as per model structure
	server.port=8181 its safe to change default port to custom to get rid of server port issue.
	
REST CONTROLLER:
	Here i have used @RequestMapping for all method that can be changed as per requirment like @Get, @Post, @Put and so on.

Note: 
	I have taken swagger support here to generate beautiful API Documentation.
	Swagger API Document can be opened on below link
	http://127.0.0.1:8181/swagger-ui.html
	
	Swagger is configured in this application hence no need for extra configuration.
	
 