'use strict';

/* Controllers */
var controllers = angular.module('myApp.controllers', ['myApp.services']);

controllers.controller('IndexController', function IndexController($scope, $http, FirstService) {
    $scope.data = "";

    $scope.getData = function () {
        FirstService.getData(function(data) {
            $scope.data = data;
        });
    }
});