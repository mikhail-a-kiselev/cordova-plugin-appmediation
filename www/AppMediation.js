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
        []);
};
exports.hide = function(){
	cordova.exec(
        function(winParam) {
			
		},
        function(error) {
			
		},
        "AppMediation",
        "hide",
        []);
};

exports.loadInterstitial = function(){
	cordova.exec(
        function(winParam) {
			alert('load int success');
		},
        function(error) {
			alert('load int fail');
		},
        "AppMediation",
        "loadInterstitial",
        []);
};