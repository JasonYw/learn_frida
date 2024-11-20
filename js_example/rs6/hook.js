(function () {
    Function.prototype.constructor_bc = Function.prototype.constructor
    Function.prototype.constructor = function () {
        if (arguments[0] === "debugger") { }
        else {
            Function.prototype.constructor_bc.apply(this, arguments)
        }
    }

    Function.prototype.__constructor = Function;
    Function = function (){
    if (arguments && typeof arguments[0] === 'string'){
        if ("debugger" === arguments[0]){
            return
        }
            return Function.apply(this, arguments);
        }
    }
    eval_bc = eval
    eval = function(a) {
    if (a.indexOf('debugger')) {}
    else {
        return eval_bc(a)
    }
    }

    setinval_b= setInterval
    setInterval = function(a, b) {
    if (a.toString().indexOf('debugger') == -1) {
            console.log(a);
        }
    }

    var cookieTemp = '';
    Object.defineProperty(document, 'cookie', {
        set: function (val) {
            console.log('HOOK SET COOKIE:', val)
            debugger
            cookieTemp = val
            return val
        },
        get: function () {
            console.log('HOOK GET COOKIE:', val)
            debugger
            return cookieTemp
        }
    });

})()
