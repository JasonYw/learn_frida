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


//jsdom https://github.com/jsdom/jsdom 也可以帮助补环境 npm install jsdom