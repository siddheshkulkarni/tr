(function(){
  app.service('HomeService', function($q, $http) {
   
    var getUserInfo = function(id) {
            var serviceUrl = {
                method : 'GET',
                url: "userProfile.json"
            };
            return $http(serviceUrl)
    };
    
    return {
      getUserInfo : getUserInfo
    }
    
  });
})()