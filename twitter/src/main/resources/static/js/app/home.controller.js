app.controller('HomeController', function($scope, $stateParams, $state,$http, $q) {
    
    $scope.userName = sessionStorage.getItem("Name");
    var config = {
                headers : {
                    'Content-Type': 'application/json'
                }
            }
    $scope.count = 0;
    
    $scope.postMessage = function(){
    	$scope.count = $scope.count+1;
    	
    	var date = new Date();
    	var msg = $scope.message;
    	var req= {
    	        "message": msg,
    	        "postId": $scope.count,
    	        "userId": 2,
    	        "date": date.toString()
    	    };
    	 $scope.messages = [];
    	
        $http.post('http://localhost:8080/post',  req, config)
        .then(
          function(response){
             if(response.data) {
            	
            	for (var i=0; i<response.data.length; i++) {
            	  $scope.messages.push(response.data[i].message);	
            	  console.log($scope.messages);
            	} 
            	 $scope.messagePosted = response.data[response.data.length-1].message; 	 
            	  console.log(response.data.length);
             }
            
              }, 
          function(response){
          $scope.messagePosted = "Service not Exists";
          $scope.status = response.status;
          $scope.statustext = response.statusText;
          $scope.headers = response.headers();
              });
            
          }
    
    

    
   
  });
