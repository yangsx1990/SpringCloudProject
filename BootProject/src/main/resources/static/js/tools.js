// JavaScript Document
function id(obj) {
    return document.getElementById(obj);
}
function tagName(obj,eName) {
    return obj.getElementsByTagName(eName);
}
function className(obj,eName) {
    return obj.getElementsByClassName(eName);
}
function bind(obj, ev, fn) { 
    if (obj.addEventListener) {
        obj.addEventListener(ev, fn, false);
    } else {
        obj.attachEvent('on' + ev, function() {
            fn.call(obj);
        });
    }
}
function unbind(obj, ev, fn) { 
    if (obj.removeEventListener) {
        obj.removeEventListener(ev, fn, false);
    } else {
        obj.detachEvent('on' + ev, function() {
            fn.call(obj);
        });
    }
}
function view() {
    return {
        w: document.documentElement.clientWidth,
        h: document.documentElement.clientHeight
    };
}
function addClass(obj, sClass) {
    var aClass = obj.className.split(' ');
    if (!obj.className) {
        obj.className = sClass;
        return;
    }
    for (var i = 0; i < aClass.length; i++) {
        if (aClass[i] === sClass) return;
    }
    obj.className += ' ' + sClass;
}

function removeClass(obj, sClass) { 
    var aClass = obj.className.split(' ');
    if (!obj.className) return;
    for (var i = 0; i < aClass.length; i++) {
        if (aClass[i] === sClass) {
            aClass.splice(i, 1);
            obj.className = aClass.join(' ');
            break;
        }
    }
}

function getStyle(obj,attr){
	return obj.currentStyle?obj.currentStyle:getComputedStyle(obj,false)[attr];
}

function arrIndex(arr,value){
	for(var i=0; i<arr.length; i++){
		if(value==arr[i]){
			return i;	
		}	
	}
	return -1;
}

function toTwo(num){
	return num<10 ? '0'+num : ''+num;
}