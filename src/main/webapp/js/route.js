angular.module('myApp', ['ngRoute'])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'login.html',
                controller: 'LoginController'
            })
            .when('/computers', {template: 'computers'})
            .when('/printers', {template: 'printers'})
            .when('/login', {
                templateUrl: 'login.html',
                controller: 'LoginController'
            })
            .otherwise({redirectTo: '/'});
    }]);