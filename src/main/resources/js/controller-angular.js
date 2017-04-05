
var app = angular.module('javafxwebdemo', ['jsonFormatter']);

app.controller('JavaFXWebDemoController', function ($scope) {

 
  
  // ordiniService param
  $scope.idOrdine = null;
  $scope.result=null;

  $scope.fetchOrdine=function() {
	  
      var result=ordiniService.getOrdineDocument($scope.idOrdine);
      $scope.result=JSON.parse(result);
      //alert(JSON.stringify($scope.result.jsonDocument,2));
    
  }
});

