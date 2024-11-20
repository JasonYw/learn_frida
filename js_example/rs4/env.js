var content;
function getCookie(){
    return document['cookie']
}



window = global;
Window = function Window(){}
window.__proto__ = Window.prototype

navigator ={
    userAgent: "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36",
    mimeTypes: [],
    // appVersion: "5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36",
    // webdriver: false,
    // appName: "Netscape",
    // vendor: "Google Inc.",

}

document = {
    scripts: ['script', 'script', 'script'],
    attachEvent:function(){},
    createElement:function(arg){
        if(arg == "div"){
            return {
                getElementsByTagName: function(a){
                    if(a=="i"){
                        return []
                    }
                }
            }
        }
    },
    documentElement:{
        style:{}
    },
    getElementsByTagName: function(arg){
        if(arg == "meta"){
            return [
                {
                    "content":content,
                    parentNode:{
                        removeChild:function(){}
                    }
                }
            ]

        }else if(arg == "script"){
            return {
                "0": {},
                "1": {}
            }
        }
    }
}
location = {
    "ancestorOrigins": {},
    "href": "http://www.fangdi.com.cn/new_house/new_house_detail.html",
    "origin": "http://www.fangdi.com.cn",
    "protocol": "http:",
    "host": "www.fangdi.com.cn",
    "hostname": "www.fangdi.com.cn",
    "port": "",
    "pathname": "/new_house/new_house_detail.html",
    "search": "",
    "hash": ""
}




window.$_ts = []
window.navigator = navigator
window.location = location
window.document = document
window.top = location
window.addEventListener = function(){}
window.setInterval = function(){}
window.Math = Math
window.clearInterval = function(){}





// Window = function Window(){}
// window = global;
// navigator  = {
//     userAgent: "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36",
//     languages: ["zh-CN", "zh"],
//     appVersion: "5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36",
//     webdriver: false,
//     appName: "Netscape",
//     vendor: "Google Inc.",
// }
// window.top=window;
// window.__proto__ = Window.prototype
// location = {
//     "ancestorOrigins": {},
//     "href": "http://www.fangdi.com.cn/new_house/new_house_detail.html",
//     "origin": "http://www.fangdi.com.cn",
//     "protocol": "http:",
//     "host": "www.fangdi.com.cn",
//     "hostname": "www.fangdi.com.cn",
//     "port": "",
//     "pathname": "/old_house/old_house.html",
//     "search": "",
//     "hash": ""
// }
// document = {
//     scripts: ['script', 'script'],
//     documentElement:{
//         style:{}
//     },
//     characterSet: 'UTF-8',
//     charset: 'UTF-8',
// };
// document.createElement= function createElement(val){
//     if(val=='div') {
//         return {
//             getElementsByTagName: function getElementsByTagName(name) {
//                 if (name === 'i') {
//                     return {length: 0}
//                 }
//             }
//         }
//     }
//     if(val==='form'){
//         return {}
//     }
//     if (val==='a'){
//         return {}
//     }
// };
// document.getElementById = function getElementById(){
// }

// localStorage = {}
// localStorage.__proto__ = {
//     setItem : function setItem(){
//         let key = arguments[0];
//         let value = arguments[1];
//         this[key] = value
//     },
//     getItem : function getItem(){
//         let key = arguments[0]
//         if (key in this){
//             return this[key]
//         }
//         return null
//     },
//     removeItem : function removeItem(){
//         delete this[arguments[0]]
//     },

// };

// document.getElementsByTagName = function getElementsByTagName(){
//     return [
//                 {
//                 content:content,
//                 parentNode : {
//                     removeChild : function removeChild(){}
//                     },
//                 parentElement : {
//                     removeChild : function removeChild(){}
//                     }
//                 },
//         {
//             content: content,
//             parentNode: {
//                 removeChild: function removeChild() {
//                 }
//             },
//             parentElement: {
//                 removeChild: function removeChild() {
//                 }
//             }
//         }
//             ]
// };
// window.addEventListener=function addEventListener(){};
// window.attachEvent=function attachEvent(){};
// window.setInterval = function setInterval(){};
// document.attachEvent=function attachEvent(){};
// document.addEventListener=function attachEvent(){};
// Object.prototype.getAttribute = function (val){if(val==='r'){return 'm'}};
