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

