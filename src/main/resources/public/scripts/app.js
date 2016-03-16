/**
 * Created by shekhargulati on 10/06/14.
 */

var app = angular.module('dockerscheduler', [
    'ngCookies',
    'ngResource',
    'ngSanitize',
    'ngRoute',
    'ui.bootstrap',
    'xeditable',
    'angular-quartz-cron'
]);

app.config(function ($routeProvider) {
    $routeProvider.when('/', {
        redirectTo: '/tasks'
    }).when('/tasks', {
        templateUrl: 'views/tasks.html',
        controller: 'TaskController'
    }).when('/tasks/create', {
        templateUrl: 'views/createtask.html',
        controller: 'TaskController'
    }).when('/scheduledtasks', {
        templateUrl: 'views/scheduledtasks.html',
        controller: 'TaskController'
    }).when('/scheduledtasks/create', {
        templateUrl: 'views/createscheduledtask.html',
        controller: 'TaskController'
    }).when('/environmentvariables', {
        templateUrl: 'views/environmentvariables.html',
        controller: 'EnvironmentVariableController'
    }).when('/environmentvariables/create', {
        templateUrl: 'views/environmentvariablescreate.html',
        controller: 'EnvironmentVariableController'
    }).otherwise({
        redirectTo: '/tasks'
    })
});

app.directive('ngReallyClick', [function() {
    return {
        restrict: 'A',
        link: function(scope, element, attrs) {
            element.bind('click', function() {
                var message = attrs.ngReallyMessage;
                if (message && confirm(message)) {
                    scope.$apply(attrs.ngReallyClick);
                }
            });
        }
    }
}]);

app.controller('TaskController', function ($scope, $http, $location, $route) {
    if ($location.$$path == "/tasks") {
        $http.get('/v1/tasks').success(function (data) {
            $scope.tasks = data;
        }).error(function (data, status) {
           console.log('Error ' + data)
        });
    } else if($location.$$path == "/scheduledtasks") {
        $http.get('/v1/scheduledtasks').success(function (data) {
            $scope.tasks = data;
        }).error(function (data, status) {
            console.log('Error ' + data)
        });
    } else if($location.$$path == "/tasks/create") {
        $scope.task = {
            type: 'TASK'
        };
    } else if($location.$$path == "/scheduledtasks/create") {
        $scope.task = {
            type: 'SCHEDULED_TASK'
        };
    }

    $scope.createTask = function () {
        $http.post('/v1/tasks', $scope.task).success(function (data) {
            $location.path('/tasks');
        }).error(function (data, status) {
            console.log('Error ' + data)
        })
    }

    $scope.deleteTask = function (task) {
        $http.delete('/v1/tasks/' + task.id).success(function (data) {
            $route.reload();
        }).error(function (data, status) {
            console.log('Error ' + data)
        })
    }
});


app.controller('EnvironmentVariableController', function ($scope, $http, $q, $filter) {

    $http.get('/v1/environmentvariables').success(function (data) {
        $scope.environmentvariables = data;
    }).error(function (data, status) {
        console.log('Error ' + data)
    });


    $scope.filterEnvironmentVariable = function (environmentvariable) {
        return environmentvariable.isDeleted !== true;
    }

    $scope.deleteEnvironmentVariable = function(id) {
        var filtered = $filter('filter')($scope.environmentvariables, {id: id});

        if(filtered.length) {
            filtered[0].isDeleted = true;
        }

        if (!filtered.length) {
            filtered = $filter('filter')($scope.environmentvariables, {tempId: id});
            if(filtered.length) {
              var index = $scope.environmentvariables.indexOf(filtered[0]);
              $scope.environmentvariables.splice(index,1);
            }
        }
    };

    $scope.addEnvironmentVariable = function() {
        $scope.inserted = {
          name: '',
          value: '',
          isNew: true,
          tempId: generateUUID()
        };
        $scope.environmentvariables.push($scope.inserted);
      };

    $scope.cancel = function() {
        for (var i = $scope.environmentvariables.length; i--;) {
            var environmentvariable = $scope.environmentvariables[i];
            // undelete
            if (environmentvariable.isDeleted) {
                delete environmentvariable.isDeleted;
            }
            // remove new
            if (environmentvariable.isNew) {
                $scope.environmentvariables.splice(i, 1);
            }
        };
    };

    $scope.saveAll = function () {
         var results = [];
         for (var i = $scope.environmentvariables.length; i--;) {
             var environmentvariable = $scope.environmentvariables[i];
             var create = false;
             var del = false;
             var update = false;

             if (environmentvariable.isDeleted) {
                 $scope.environmentvariables.splice(i, 1);
                 del = true;
             }

             // mark as not new
             if (environmentvariable.isNew) {
                 environmentvariable.isNew = false;
                 create = true;
             }

             if(create) {
                 results.push($http.post("/v1/environmentvariables", [environmentvariable]));
             } else if(del) {
                 results.push($http.delete("/v1/environmentvariables/" + environmentvariable.id));
             } else {
                results.push($http.put("/v1/environmentvariables/" + environmentvariable.id, environmentvariable));
             }
         }
         return $q.all(results);
     }
});

app.controller('HeaderController', function ($scope, $http, $location) {
    $scope.isActive = function (viewLocation) {
        return viewLocation === $location.path();
    };
});

function generateUUID(){
    var d = new Date().getTime();
    if(window.performance && typeof window.performance.now === "function"){
        d += performance.now(); //use high-precision timer if available
    }
    var uuid = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
        var r = (d + Math.random()*16)%16 | 0;
        d = Math.floor(d/16);
        return (c=='x' ? r : (r&0x3|0x8)).toString(16);
    });
    return uuid;
}