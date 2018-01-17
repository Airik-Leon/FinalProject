angular.module('geolocationModule')
    .factory('distanceMatrixService', function($http) {
        var service = {}; 

        service.getDistanceJson = function (origin, destination) {
            return $http({
                method: 'GET',
                url: 'https://maps.googleapis.com/maps/api/distancematrix/json?origins=' + origin + '&destinations=' + destination + '&key=WHERE THE KEY SHOULD GO'
            }); 
        }
        return service; 
    })