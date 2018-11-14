var exec = require('cordova/exec');

exports.init = function(opt){
	cordova.exec(
        function(winParam) {
			alert('init success');
		},
        function(error) {
			alert('init fail');
		},
        "AppMediation",
        "init",
        [opt]);
};

exports.load = function(){
	cordova.exec(
        function(winParam) {
			alert('load success');
		},
        function(error) {
			alert('load fail');
		},
        "AppMediation",
        "load",
        [opt]);
};