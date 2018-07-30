
Url to access application: http://localhost:8080/index.html#!/login (make sure application is running in eclipse before hitting this url in browser)
Use user sam, password is sam for login purpose
Database is available at http://localhost:8080/h2-console (jdbc url should be jdbc:h2:mem:testdb. click connect). Run queries to see data



Api design for twitter app website

 host = localhost:8080 

Endpoint : http://{host}/authentication 

Method = POST
Request
{
  “userName” : “abc ”,
  “Password” :  “***”,
}

Response
{
  “isValid” : true
}

Response status code
200 ok




2) http://{host}/post 

Method = POST
Request
{
  “message” : “ a”,
  “Id” : null,
  “postedBy” : “userId”
}

Response
{
  “message” : “a ”,
  “Id” : 2,
  “postedBy” : “userId”
}

Response status code
201 created

