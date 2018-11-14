var exec = require('cordova/exec');

exports.init = function(opt){
	cordova.exec(
        function(winParam) {
			
		},
        function(error) {
			
		},
        "AppMediation",
        "init",
        [opt]);
};

exports.load = function(){
	cordova.exec(
        function(winParam) {
			
		},
        function(error) {
			
		},
        "AppMediation",
        "load",
        [opt]);
};