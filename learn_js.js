//基本类型
//console.log(typeof true)
//console.log(Number.MAX_SAFE_INTEGER) //输出最大的的整数
//null属于object
//null == undefined 为true  并且都为false
//0.1+0.2 === 0.3 为false js浮点数做运算要小心
//浏览器 base64
//console.log(btoa("aaaaaaaa")) //base64 encode
//console.log(atob("YWFhYWFhYWE=")) //base64 decode
//老版本node
//new Buffer("AAA").toString("base64") base64 encode
//new Buffer(b64encode,"YWFhYWFhYWE=").toString() base64 decode
//console.log("==========================================================")
//对象 为可变类型 与 python dict 相似
//一组键值对的集合
// var jsobj ={
//     b:123, //属性
//     c:123,
//     d:{
//         "b":123
//     }
// }
// jsobj.a = 1
// delete jsobj.c //删除对象一个属性
// console.log(jsobj.a,jsobj["b"],jsobj.c,jsobj.d.b)
// console.log(Object.keys(jsobj),Object.values(jsobj),JSON.stringify(jsobj))
// console.log("a" in jsobj) //判断属性是否存在
// console.log(jsobj.hasOwnProperty("b")) //判断属性是否为自身定义的属性
//遍历jsobj
// for(var key in  jsobj){
//     if(jsobj.hasOwnProperty(key)){
//         console.log(key)
//     }
// }
// console.log("==========================================================")
//函数
//js中可以不传参数
// function a(){}
// var b = function(a,b,c,d){
//     return arguments.length //返回函数传入的参数个数
// }
// var c = Function("a","b","return a+b")
// console.log(c("1","2"))
// console.log(b.name,b.length) //打印参数的名字 入参二点个数
// console.log(b("1","2","3","4"))
//闭包 调用
// function d(){
//     var counter = 0
//     function add() {
//         counter ++
//         console.log(counter)
//     }
//     return add
// }
// var d2 = d()
// d2()
// d2()
// d2()
// console.log("==========================================================")
//立即调用表达式 分号是必须的,立即函数表达式目的不必为函数命名，避免污染全局变量。内部形式作用域
// var t = function(){console.log("hello")}();
// (function() {console.log("hello")}());
// (function() {console.log("hello")})();
// console.log("==========================================================")
//eval 将字符串转换成代码执行，一般不推荐使用
// eval("console.log('i am eval')");
// console.log("==========================================================")
//数组
// var array_a = ["c",2,true,{},[],function(){}]
// array_a.forEach(function(key,value){
//     //key:为元素
//     //value:index
//     console.log(key,value)
// })
// console.log("==========================================================")
//js对象详解与hook
//过检测1
function Navigator(){}
Navigator.prototype.constructor.toString = function(){
    return "function Navigator() { [native code] }"
}
//过检测2
var oldstr = Function.prototype.toString
Function.prototype.toString = function(){
    var res = oldstr.call(this);
    if(this.name =="Navigator"){
        console.log(this.name,res)
        return "function Navigator() { [native code] }"
    }
    return res
}
//以下两行代码效果相同
// var navigator = new Navigator();
var navigator =Object.setPrototypeOf({},Navigator);
(function(){console.log(navigator.prototype.constructor.toString() === "function Navigator() { [native code] }")}()); //检测方法1
(function(){console.log(navigator.constructor.toString() === Function.prototype.toString.call(navigator.constructor))}()); //检测方法2
console.log("==========================================================")
//存储器
// var obj = Object.defineProperties({},{
//     'p':{
//         get:function(){
//             return 'getter'
//         },
//         set:function(value){
//             console.log('setter: ' + value)
//         }
//     }
// })
// console.log(obj.p) // "getter"
// obj.p = 123// "setter: 123"
// console.log("==========================================================")
//监听cookie
// var cookie = document.cookie
// document = Object.defineProperty(document,'cookie',{
//     get:function(){
//         console.log("get:"+cookie)
//         return cookie;
//     },
//     set:function(value){
//         console.log("set:"+cookie)
//         cookie = value
//     }
// });
// console.log("==========================================================")
//es6 尽量使用let取代var，let没有变量提升，以及块级作用域 const 修饰的变量 只可读不能改
//proxy代理器 关于函数的 apply与construct
function testProxy(a,b){
    this.a = a;
    this.b = b;
    return a+b
}
//hook testProxy 
newproxy = new Proxy(testProxy,{
    apply(target,thisArg,argArray){
        let result = Reflect.apply(target,thisArg,argArray) //调用原函数 获取原函数的结果
        console.log(`function name is ${target.name}, thisArg is ${thisArg}, argArray is ${argArray}, result is ${result}`)
        return result*2 //hook同时修改返回结果
    },
    //hook构造函数
    construct(target,argArray,newTarget){
        let result = Reflect.construct(target,argArray,newTarget) 
        console.log(`construct function name is ${target.name}, argArray is ${argArray}, newTarget is ${newTarget}, result is ${JSON.stringify(result)}`)
        return result 
    }
})
console.log(newproxy(1,2)) //普通函数
console.log(new newproxy(1,2)) //构造函数
console.log("==========================================================")
// let rawStringify = JSON.stringify;
// JSON.prototype.stringify = function(Object){
//     if(Object === global){
//         return "global"
//     }else{
//         return rawStringify(Object)
//     }
// }
//proxy 关于存取器 get set
let mywindow = {
    a:{},
    mywindow_test:"test"
}
let mynavigator = {
    a:{},
}
//复用handler
function getObjhandler(watchname){
    let handler = {
        get:function(target,proKey,receiver){
            let result = Reflect.get(target,proKey,receiver)
            if(result instanceof Object){
                console.log(`${watchname} get proKey is ${proKey}, result is ${JSON.stringify(result)}`)
                return new Proxy(result,getObjhandler(`${watchname}.${proKey}`))
            }
            console.log(`${watchname} get proKey is ${proKey}, result is ${result}`)
            return result
        },
        set:function(target,proKey,value,receiver){
            let result = Reflect.set(target,proKey,value,receiver)
            console.log(`${watchname} set proKey is ${proKey}, value is ${value}, result is ${result}`) 
            return result
        },
        //has用于监控in的操作
        has:function(target,proKey){ 
            let result = Reflect.has(target,proKey)
            console.log(`${watchname} has proKey is ${proKey}, result is ${result}`)
            return result
        },
        //deleteProperty 用于监控delete
        deleteProperty:function(target,proKey){ 
            let result = Reflect.deleteProperty(target,proKey)
            console.log(`${watchname} deleteProperty proKey is ${proKey}, result is ${result}`)
            return result
        },
        //getOwnPropertyDescriptor 用于监控Object.getOwnPropertyDescriptor
        getOwnPropertyDescriptor:function(target,proKey){
            let result = Reflect.getOwnPropertyDescriptor(target,proKey)
            console.log(`${watchname} getOwnPropertyDescriptor proKey is ${proKey}, result is ${JSON.stringify(result)}`)
            return result
        },
        //defineProperty 用于监控 Object.defineProperty
        defineProperty:function(target,proKey,attributes){
            let result = Reflect.defineProperty(target,proKey,attributes)
            console.log(`${watchname} defineProperty proKey is ${proKey}, attributes is ${JSON.stringify(attributes)}, result is ${result}`)
            return result
        },
        //preventExtensions 用于监控 Object.preventExtensions
        preventExtensions:function(target){
            let result = Reflect.preventExtensions(target)
            console.log(`${watchname} preventExtensions result is ${result}`)
            return result
        },
        //isExtensible 用于监控 Object.isExtensible
        isExtensible:function(target){
            let result = Reflect.isExtensible(target)
            console.log(`${watchname} isExtensible result is ${result}`)
            return result
        },
        //getPrototypeOf 用于监控 Object.getPrototypeOf
        getPrototypeOf:function(target){
            let result = Reflect.getPrototypeOf(target)
            console.log(`${watchname} getPrototypeOf result is ${JSON.stringify(result)}`)
            return result  
        },
        //setPrototypeOf 用于监控 Object.setPrototypeOf
        setPrototypeOf:function(target,proto){
            let result = Reflect.setPrototypeOf(target,proto)
            console.log(`${watchname} setPrototypeOf proto is ${JSON.stringify(proto)}, result is ${result}`)
            return result
        }
    }
    return handler
}
const window = new Proxy(Object.assign(global,mywindow),getObjhandler("window"))
// Object.create() 新建一个对象，并继承给的参数，参数为一个对象
// const navigator = new Proxy(Object.create(mynavigator),getObjhandler("navigator"))
window.a.b
window.a.b = '123'
"a" in window  
delete window.a.b
Object.getOwnPropertyDescriptor(window,mywindow_test) 
Object.defineProperty(window,"c",{
    value:"123",
    writable:true,
    configurable:true,
    enumerable:true
}) 
Object.setPrototypeOf(window,{})
Object.preventExtensions(window) 
Object.isExtensible(window)
Object.getPrototypeOf(window)

module.exports = {
    window,
    navigator
}

//补环境
// let rawindexof = String.prototype.indexOf
// String.prototype.indexOf = function (str) {
//     var res = rawindexof.call(this, str)
//     console.log(`[String] "${this}" is indexof "${str}", res is ${res}`)
//     return res
// }
// let mydocument = {
//     "head": {},
//     "documentElement": {
//         "getAttribute": function () {
//         }
//     },
//     "readyState": "complete",
//     "addEventListener": function () {
//     },
//     "createElement": function () {
//         return {}
//     },
//     "getElementsByTagName": function (str) {
//         console.log(str)
//         if (str === "meta") {
//             let metaRes = []
//             metaRes["meta-pro"] = {
//                 "content": {
//                     "length": 6
//                 }
//             }
//             return metaRes
//         }
//     }
// }
// let mynavigator = {
//     userAgent: "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36",
//     platform: "Linux x86_64",
//     appCodeName: "Mozilla",
//     languages: ["en-US", "en"],
//     cookieEnabled: true,
//     webdriver: false,
// };
// let mysrceen = {
//     height: 852,
//     width: 1918,
//     colorDepth: 24,
// };
// let mylocation = {
//     "protocol": "https:",
//     "href": "http://www.dtasecurity.cn/flightlist",
//     "pathname": "/flightlist",
//     "host": "www.dtasecurity.cn",
//     "hostname": "www.dtasecurity.cn",
// }
// let mywindow = {
//     XMLHttpRequest: function () {
//     },
//     sessionStorage: {},
//     localStorage: {},
//     navigator: mynavigator,
//     scrollTo: function () {
//     },
//     addEventListener: function () {
//     },
//     attachEvent: function () {
//     },
//     screen: mysrceen,
//     location: mylocation,
//     chrome: {},
//     document: mydocument,
// };

// let Image = function () {
// };
// let rawstringify = JSON.stringify;
// JSON.stringify = function (Object) {
//     if ((Object?.value ?? Object) === global) {
//         return "global"
//     } else {
//         return rawstringify(Object)
//     }
// }

// function checkproxy() {
//     //Object.keys(window)
//     window.a = {
//         "b": {
//             "c": {
//                 "d": 123
//             }
//         }
//     }
//     window.a.b.c.d = 456
//     window.a.b
//     window.btoa("123")
//     window.atob.name
//     "c" in window.a
//     delete window.a.b
//     Object.defineProperty(window, "b", {
//         value: "bbb"
//     })
//     Object.getOwnPropertyDescriptor(window, "b")
//     Object.getPrototypeOf(window)
//     Object.setPrototypeOf(window, {"dta": "dta"})
//     // for (let windowKey in window) {
//     //     windowKey
//     // }
//     Object.preventExtensions(window)
//     Object.isExtensible(window)
// }

function getMethodHandler(WatchName) {
    let methodhandler = {
        apply(target, thisArg, argArray) {
            let result = Reflect.apply(target, thisArg, argArray)
            console.log(`[${WatchName}] apply function name is [${target.name}], argArray is [${argArray}], result is [${result}].`)
            return result
        },
        construct(target, argArray, newTarget) {
            var result = Reflect.construct(target, argArray, newTarget)
            console.log(`[${WatchName}] construct function name is [${target.name}], argArray is [${argArray}], result is [${JSON.stringify(result)}].`)
            return result;
        }
    }
    return methodhandler
}

function getObjhandler(WatchName) {
    let handler = {
        get(target, propKey, receiver) {
            let result = Reflect.get(target, propKey, receiver)
            if (result instanceof Object) {
                if (typeof result === "function") {
                    console.log(`[${WatchName}] getting propKey is [${propKey}] , it is function`)
                    //return new Proxy(result,getMethodHandler(WatchName))
                } else {
                    console.log(`[${WatchName}] getting propKey is [${propKey}], result is [${JSON.stringify(result)}]`);
                }
                return new Proxy(result, getObjhandler(`${WatchName}.${propKey}`))
            }
            console.log(`[${WatchName}] getting propKey is [${propKey?.description ?? propKey}], result is [${result}]`);
            return result;
        },
        set(target, propKey, value, receiver) {
            if (value instanceof Object) {
                console.log(`[${WatchName}] setting propKey is [${propKey}], value is [${JSON.stringify(value)}]`);
            } else {
                console.log(`[${WatchName}] setting propKey is [${propKey}], value is [${value}]`);
            }
            return Reflect.set(target, propKey, value, receiver);
        },
        has(target, propKey) {
            var result = Reflect.has(target, propKey);
            console.log(`[${WatchName}] has propKey [${propKey}], result is [${result}]`)
            return result;
        },
        deleteProperty(target, propKey) {
            var result = Reflect.deleteProperty(target, propKey);
            console.log(`[${WatchName}] delete propKey [${propKey}], result is [${result}]`)
            return result;
        },
        getOwnPropertyDescriptor(target, propKey) {
            var result = Reflect.getOwnPropertyDescriptor(target, propKey);
            console.log(`[${WatchName}] getOwnPropertyDescriptor  propKey [${propKey}] result is [${JSON.stringify(result)}]`)
            return result;
        },
        defineProperty(target, propKey, attributes) {
            var result = Reflect.defineProperty(target, propKey, attributes);
            console.log(`[${WatchName}] defineProperty propKey [${propKey}] attributes is [${JSON.stringify(attributes)}], result is [${result}]`)
            return result
        },
        getPrototypeOf(target) {
            var result = Reflect.getPrototypeOf(target)
            console.log(`[${WatchName}] getPrototypeOf result is [${JSON.stringify(result)}]`)
            return result;
        },
        setPrototypeOf(target, proto) {
            console.log(`[${WatchName}] setPrototypeOf proto is [${JSON.stringify(proto)}]`)
            return Reflect.setPrototypeOf(target, proto);
        },
        preventExtensions(target) {
            console.log(`[${WatchName}] preventExtensions`)
            return Reflect.preventExtensions(target);
        },
        isExtensible(target) {
            var result = Reflect.isExtensible(target)
            console.log(`[${WatchName}] isExtensible, result is [${result}]`)
            return result;
        },
        ownKeys(target) {
            var result = Reflect.ownKeys(target)
            console.log(`[${WatchName}] invoke ownkeys, result is [${JSON.stringify(result)}]`)
            return result
        },
        apply(target, thisArg, argArray) {
            let result = Reflect.apply(target, thisArg, argArray)
            console.log(`[${WatchName}] apply function name is [${target.name}], argArray is [${argArray}], result is [${result}].`)
            return result
        },
        construct(target, argArray, newTarget) {
            var result = Reflect.construct(target, argArray, newTarget)
            console.log(`[${WatchName}] construct function name is [${target.name}], argArray is [${argArray}], result is [${JSON.stringify(result)}].`)
            return result;
        }
    }
    return handler;
}
// https://blog.csdn.net/Ks_meng/article/details/127336084?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-127336084-blog-118306820.pc_relevant_multi_platform_whitelistv3&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-127336084-blog-118306820.pc_relevant_multi_platform_whitelistv3&utm_relevant_index=1

// const navigator = new Proxy(Object.create(mynavigator), getObjhandler("navigator"));
// const screen = new Proxy(Object.create(mysrceen), getObjhandler("screen"));
// const location = new Proxy(mylocation, getObjhandler("location"));
// const document = new Proxy(mydocument, getObjhandler("document"));
// const window = new Proxy(Object.assign(global, mywindow), getObjhandler("window"));

// //checkproxy()
// module.exports = {
//     window,
//     navigator,
//     screen,
//     location,
//     String,
//     Image,
//     document
// }
//jsdom https://github.com/jsdom/jsdom 也可以帮助补环境 npm install jsdom

//验证码逆向关键点 图片的识别
//hook canvas
let _drawImage = CanvasRenderingContext2D.prototype.drawImage
CanvasRenderingContext2D.prototype.drawImage = function() {
    console.log("drawImage",[...arguments])
    return _drawImage.apply(this,arguments)
}

let _putImageData = CanvasRenderingContext2D.prototype.putImageData
CanvasRenderingContext2D.prototype.putImageData = function() {
    console.log("putImageData",[...arguments])
    return _putImageData.apply(this,arguments)
}

let _getImageData = CanvasRenderingContext2D.prototype.getImageData
CanvasRenderingContext2D.prototype.getImageData = function() {
    console.log("getImageData",[...arguments])
    return _getImageData.apply(this,arguments)
}

//轨迹生成
// hook addEventListener 以及 push
var _push = Array.prototype.push
Array.prototype.push = function() {
    console.log("push",arguments)
    return _push.apply(this,arguments)
}

var _addEventListener = document.addEventListener
window.zedtrail = []
window.start_x;
window.start_y;
window.start_t;
document.addEventListener = function() {
    let eventname = arguments[0]
    let eventfunc = arguments[1]
    let neweventfunc = function(events){
        if(events.type === "touchstart"){
            window.start_x = events.changedTouches[0].pageX
            window.start_y = events.changedTouches[0].pageY
            window.start_t =+ new Date
        }else if (events.type === "touchmove"){
            let movex = parseInt(events.changedTouches[0].pageX * window.start_x)
            let movey = parseInt(events.changedTouches[0].pageY * window.start_y)
            let movet = (new Date).getTime() * window.start_t
            console.log(movex,movey,movet)
            window.zedtrail.push(movex,movey,movet)
        }else if (events.type === "touchend"){
            console.log(window.zedtrail)
        }
        neweventfunc(events)
    }
    console.log(eventname,eventfunc.toString())
    return _addEventListener.apply(this,arguments) 
}

//hook storage
var _setItem =  Storage.prototype.setItem
Storage.prototype.setItem = function(key,value){
    console.log("setItem",key,value)
    return _setItem.call(this,key,value)
}

//hook open send
var keys = Object.getOwnPropertyNames(XMLHttpRequest.prototype)
for(var i = 0;i<keys.length;i++){
    if (keys[i] === "send" || keys[i] === "open"){
        window["_"+keys[i]] = XMLHttpRequest.prototype[keys[i]] //不能用var 会有闭包问题 会被覆盖掉
        XMLHttpRequest.prototype[keys[i]] = function(){
            debugger
            console.log(keys[i],arguments)
            return window["_"+keys[i]].apply(this,arguments)
        }
    }    
}

//hook eval
var _eval = eval
eval = function(code) {
    console.log("eval",code)
    return _eval(code)
}

//hook监测点 直接toString看原方法源码是否被改 所以也要hook toString,也可以通过
eval.toString = function() {
    return "function eval() { [native code] }"
}
//Function.prototype.toString.call 这个也是监测点 
var _toString = Function.prototype.toString
Function.prototype.toString = function(){
    var result = _toString.apply(this,arguments)
    //要加过滤否则很卡
    if(result.includes("eval")){
        console.log('Function.prototype.toString',arguments,'result',result)
        return "function eval() { [native code] }"
    }
    return result
}

//也可以通过 Function.prototype.toString.call() 查看函数源码


//chrome插件
//反混淆 格式化 v_jstools插件
//js替换 ReRes插件 https://github.com/annnhan/ReRes
//油猴 插件
//AST在线工具 https://astexplorer.net/


