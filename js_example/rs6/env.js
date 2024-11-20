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
                    try{
                        console.log(`${watchname} getting proKey is ${proKey}, result is ${JSON.stringify(result)}`);
                    }catch(e){
                        console.log(`${watchname} getting proKey is ${proKey}, result is ${result}`);
                    }

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
            // try{
            //     console.log(`${watchname} getOwnPropertyDescriptor proKey is ${proKey}, result is ${JSON.stringify(result)}`)
            // }catch(e){
            //     console.log(`${watchname} getOwnPropertyDescriptor proKey is ${proKey}, result is ${result}`)
            // }
            try{
                console.log(`${watchname} getOwnPropertyDescriptor proKey is ${proKey}, result is ${result}`)
            }catch(e){
                // console.log(`${watchname} getOwnPropertyDescriptor proKey is ${Symbol(proKey).toString()}, result is ${result}`)
            }

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


// function proxy(proxy_array) {
//     for (let i = 0; i < proxy_array.length; i++) {
//         eval(
//             proxy_array[i] +
//                 `= new Proxy(` +
//                 proxy_array[i] +
//                 `, {
//                 get(target, key) {
//                     if(key == 'parentElement'){
//                     // debugger;
//                     }
//                     console.log('----------------------')
//                     console.log( '【` +
//                 proxy_array[i] +
//                 `】取属性 ' + key + ' 值: ' + target[key] + ', 详细位置debugger查看');
//                     console.log('----------------------')
//                     if (target[key]==clearInterval){
//                     debugger;
//                     }
//                     return target[key];
//                 }
//             });`
//         );
//     }
// }

function proxy(obj,obj_name) {
    return new Proxy(obj,{
        set(target, property, value, receiver) {
            console.log(`${obj_name} set ${property}, type: ${typeof value}`);
            return Reflect.set(...arguments);
        },
        get(target, property, receiver) {
            // console.log(`${obj_name} get ${property}, type: ${typeof target[property]}`);
            console.log(`${obj_name} get ${property?.description ?? property}, type: ${typeof target[property]}`);
            if (target[property]==undefined){}
            return target[property]
        }
    })
}



// let result = Reflect.get(target,proKey,receiver)
// if(result instanceof Object){
//     if (typeof result === "function") {
//         console.log(`${watchname} getting proKey is ${proKey} , it is function`)
//     } else {
//         try{
//             console.log(`${watchname} getting proKey is ${proKey}, result is ${JSON.stringify(result)}`);
//         }catch(e){
//             console.log(`${watchname} getting proKey is ${proKey}, result is ${result}`);
//         }

//     }
//     return new Proxy(result, getObjhandler(`${watchname}.${proKey}`))
// }
// console.log(`${watchname} getting proKey is ${proKey?.description ?? proKey}, result is ${result}`);
// return result




module.exports.getObjhandler = getObjhandler

module.exports.getMethodHandler = getMethodHandler

module.exports.proxy = proxy
