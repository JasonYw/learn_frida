(function(){
    'use strict'
    var cookieTemp = '';
    Object.defineProperty(document, 'cookie', {
        set:function(val){
            console.log('HOOK SET COOKIE:', val)
            debugger
            cookieTemp = val
            return val
        },
        get: function(){
            return cookieTemp
        }
    });
})()
