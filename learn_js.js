//基本类型
console.log(typeof true)
console.log(Number.MAX_SAFE_INTEGER) //输出最大的的整数
//null属于object
//null == undefined 为true  并且都为false
//0.1+0.2 === 0.3 为false js浮点数做运算要小心
//浏览器 base64
console.log(btoa("aaaaaaaa")) //base64 encode
console.log(atob("YWFhYWFhYWE=")) //base64 decode
//老版本node
//new Buffer("AAA").toString("base64") base64 encode
//new Buffer(b64encode,"YWFhYWFhYWE=").toString() base64 decode

//对象 为可变类型 与 python dict 相似
//一组键值对的集合
var jsobj ={
    b:123, //属性
    c:123,
    d:{
        "b":123
    }
}
jsobj.a = 1
delete jsobj.c //删除对象一个属性
console.log(jsobj.a,jsobj["b"],jsobj.c,jsobj.d.b)
console.log(Object.keys(jsobj),Object.values(jsobj),JSON.stringify(jsobj))
console.log("a" in jsobj) //判断属性是否存在
console.log(jsobj.hasOwnProperty("b")) //判断属性是否为自身定义的属性
//遍历jsobj
for(var key in  jsobj){
    if(jsobj.hasOwnProperty(key)){
        console.log(key)
    }
}

//函数
//js中可以不传参数
function a(){}
var b = function(a,b,c,d){
    return arguments.length //返回函数传入的参数个数
}
var c = Function("a","b","return a+b")
console.log(c("1","2"))
console.log(b.name,b.length) //打印参数的名字 入参二点个数
console.log(b("1","2","3","4"))

//闭包 调用
function d(){
    var counter = 0
    function add() {
        counter ++
        console.log(counter)
    }
    return add
}
var d2 = d()
d2()
d2()
d2()

//立即调用表达式 分号是必须的,立即函数表达式目的不必为函数命名，避免污染全局变量。内部形式作用域
var t = function(){console.log("hello")}();
(function() {console.log("hello")}());
(function() {console.log("hello")})();

//eval 将字符串转换成代码执行，一般不推荐使用
eval("console.log('i am eval')");

//数组
var array_a = ["c",2,true,{},[],function(){}]
array_a.forEach(function(key,value){
    //key:为元素
    //value:index
    console.log(key,value)
})

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



//存储器
var obj = Object.defineProperties({},{
    'p':{
        get:function(){
            return 'getter'
        },
        set:function(value){
            console.log('setter: ' + value)
        }
    }
})
console.log(obj.p) // "getter"
obj.p = 123// "setter: 123"
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

//es6 尽量使用let取代var，let没有变量提升，以及块级作用域 const 修饰的变量 只可读不能改



