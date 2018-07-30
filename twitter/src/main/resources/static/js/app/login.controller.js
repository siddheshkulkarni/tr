 app.controller('LoginController', function($scope, $stateParams, $state, LoginService) {
    
    
    $scope.formSubmit = function() {
      if(LoginService.login($scope.username, $scope.password)) {
        $scope.error = '';
        $scope.username = '';
        $scope.password = '';
        $state.transitionTo('home');
      } else {
    	$state.transitionTo('login');     
        $scope.error = "Incorrect username/password !";
      
        
      }   
    };
    
  });
  