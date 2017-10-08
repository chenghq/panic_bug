myApp.service("HttpService", function($http) {
    this.get = function (url, params) {
        return $http({
            method: 'GET',
            url: url,
            params: params
        });
    };
});
