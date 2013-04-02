"use strict";

var services = angular.module('myApp.services', ['ngResource']);

services.factory("FirstService", function ($resource) {
    var self = this;

    self.restResources = $resource("/rest/first/:id", {}, {});

    var firstService = {};

    firstService.getData = function(successFunction) {
        self.restResources.get({id: 1}, successFunction);
    };

    return firstService;
});