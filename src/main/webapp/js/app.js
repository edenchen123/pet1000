'use strict';


// Declare app level module which depends on filters, and services
angular.module('pet1000', [
  'ngRoute',
  'pet1000.filters',
  'pet1000.services',
  'pet1000.directives',
  'pet1000.controllers'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/home', {templateUrl: 'views/home.html'});
  $routeProvider.when('/petServices', {templateUrl: 'views/pet-services.html'});
  $routeProvider.when('/petAdoption', {templateUrl: 'views/pet-adoption.html'});
  $routeProvider.when('/petVIP', {templateUrl: 'views/pet1000-vip.html'});
  $routeProvider.when('/petOffers', {templateUrl: 'views/pet-spec-offers.html'});
  $routeProvider.when('/petStore', {templateUrl: 'views/pet-stores.html'});
  $routeProvider.otherwise({redirectTo: '/home'});
}]);
