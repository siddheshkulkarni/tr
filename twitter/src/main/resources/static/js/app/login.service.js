app.service('LoginService', function($q, $http) {
    var login = false;
    var login = function(username,password) {

            var deferred = $q.defer();
    
            var config = {
                    headers : {
                        'Content-Type': 'application/json'
                    }
                }        
            
            var user = {
              'userName': username,
              'password': password
            }

            /*
            var loginService = {
                method : 'GET',
                url: "http://localhost:8080/authentication"
            }; */
            

            $http.post('http://localhost:8080/authentication',  user, config)
                .then(function successCallback(response) {
                    userInfo = response.data;
                    
                    //login = username === response.data.username && password === response.data.password;
                    login = response.data.valid;
                    console.log("valid "+login);
                    if(login){
                      //sessionStorage.setItem("Name",username);
                      $state.go('home', { userName: username});  
                      deferred.resolve(login);
                    }else{
                      $state.transitionTo('login');   	
                      deferred.reject(login);
                    }
                }, function errorCallback(response) {
                	//$state.transitionTo('login');  
                    deferred.reject(login);
                });
            return deferred.promise;
    };
    
    
    
    
    
    
    
    
    return {
      login : login
    }
    
  });
