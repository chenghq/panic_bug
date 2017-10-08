/*
(function (window) {
    // 01.注册一个应用程序的主模块(module方法如果之传入一个参数就不是创建一个新模块)
    window.angular.module('myApp', []);
    // 02.为主模块注册控制器(直接取得一个已存在的模块,不会存在全局污染)
    window.angular.module("myApp").controller("LoginController", ["$scope", function ($scope) {
        $scope.login = function() {
            alert("Login");
        };
    }]);
})(window);*/

angular.module("myApp").controller("LoginController", ["$scope", function ($scope) {
    $scope.login = function() {
        alert("Login");
    };
}]);
