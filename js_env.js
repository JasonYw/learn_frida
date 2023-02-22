
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

function getObjhandler(watchname){
    let handler = {
        get:function(target,proKey,receiver){
            let result = Reflect.get(target,proKey,receiver)
            if(result instanceof Object){
                if (typeof result === "function") {
                    console.log(`${watchname} getting proKey is ${proKey} , it is function`)
                } else {
                    console.log(`${watchname} getting proKey is ${proKey}, result is ${JSON.stringify(result)}`);
                }
                return new Proxy(result, getObjhandler(`${watchname}.${proKey}`))
            }
            console.log(`${watchname} getting proKey is ${proKey?.description ?? proKey}, result is ${result}`);
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

let mylocation = {
    "protocol": "https:",
    "href": "http://www.dtasecurity.cn/flightlist",
    "pathname": "/flightlist",
    "host": "www.dtasecurity.cn",
    "hostname": "www.dtasecurity.cn",
}



let rawIndexOf = String.prototype.indexOf
String.prototype.indexOf = function(str) {
    var res = rawIndexOf.call(this,str)
    console.log(`[String] "${this}" is indexof "${str}",res is ${res}`)
    return res
}

let mynavigator = {
    userAgent:"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36",
    cookieEnabled: true,
    appCodeName:"Mozilla",
    languages:["en-US", "en"],
    platform:"Win32",
    webdriver: false,
}

let myscreen = {
    width: 1920, 
    height: 1080,
    colorDepth:24,
}

let Image = function() {}



let mydocument = {
    "head": {},
    "documentElement": {
        "getAttribute": function () {
        }
    },
    "readyState": "complete",
    "addEventListener": function () {
    },
    "createElement": function () {
        return {}
    },
    "getElementsByTagName": function (str) {
        console.log(str)
        if (str === "meta") {
            let metaRes = []
            metaRes["meta-pro"] = {
                "content": {
                    "length": 6
                }
            }
            return metaRes
        }
    }
}

let mywindow = {
    XMLHttpRequest: function(){},
    sessionStorage:{},
    localStorage:{},
    navigator:mynavigator,
    location:mylocation,
    scrollTo:function(){},
    document:mydocument,
}






const window = new Proxy(Object.assign(global,mywindow),getObjhandler("window"))
const navigator = new Proxy(Object.create(mynavigator),getObjhandler("navigator"))
const screen = new Proxy(Object.create(myscreen),getObjhandler("screen"))
const document = new Proxy(mydocument,getObjhandler("document"))
const location = new Proxy(mylocation,getObjhandler("location")) //Object.getOwnPropertyDescriptors(location) 看是否是继承还是自身的方法多
module.exports = {
    window,
    navigator,
    screen,
    location,
    String,
    Image,
    document
}