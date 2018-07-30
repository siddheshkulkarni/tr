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
  “isValid” : boolean
}

Response status code
200 ok


2) http://{host}/post 

Method = POST
Request
{
  “message” : “ ”,
  “Id” : null,
  “postedBy” : “userId”
}

Response
{
  “message” : “ ”,
  “Id” : null,
  “postedBy” : “userId”
}

Response status code
201 created

