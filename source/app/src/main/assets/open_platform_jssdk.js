/*!
* webcast_miniapp_jsapi v1.0.9.2
* (c) 2022 bytedance
*/
!function(e){"use strict";
/*! *****************************************************************************
    Copyright (c) Microsoft Corporation.

    Permission to use, copy, modify, and/or distribute this software for any
    purpose with or without fee is hereby granted.

    THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
    REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY
    AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
    INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM
    LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR
    OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
    PERFORMANCE OF THIS SOFTWARE.
    ***************************************************************************** */var t=function(e,n){return(t=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n])})(e,n)};function n(e,n){function r(){this.constructor=e}t(e,n),e.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}var r=function(){return(r=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var i in t=arguments[n])Object.prototype.hasOwnProperty.call(t,i)&&(e[i]=t[i]);return e}).apply(this,arguments)},i=function(){return this||(0,eval)("this")}();function o(e,t,n){switch(n.type){case"async":e.registerAsyncAPI(t);break;case"sync":e.registerSyncAPI(t);break;case"listen":e.registerListenAPI(t)}}var s=function(){function e(){this.listener={}}return e.prototype.on=function(e,t){this.listener[e]||(this.listener[e]=[]),this.listener[e].push(t)},e.prototype.emit=function(e){for(var t=[],n=1;n<arguments.length;n++)t[n-1]=arguments[n];var r=this.listener[e];Array.isArray(r)&&r.forEach((function(e){return e.apply(void 0,t)}))},e}(),a=0,c=-1,d=40001,p=40013,u=40014,l=1,v=-1,f={filename:"live_jssdk",slot:"1.0.9.2"},y=["GET","POST","OPTIONS","PUT","HEAD","DELETE"];function g(e){return"object"!=typeof e?{}:e}function m(e){void 0===e&&(e={});var t=r({},e),n=r({},e);return["success","fail","complete"].forEach((function(e){"function"!=typeof n[e]&&(n[e]=function(){}),delete t[e]})),{apiOptions:n,apiParams:t}}function h(e){return"[object Object]"===Object.prototype.toString.call(e)}function b(e){return"[object String]"===Object.prototype.toString.call(e)}function I(e){return"number"==typeof e&&isFinite(e)&&Math.floor(e)===e}function A(e,t){void 0===t&&(t=!1);var n,r,i=[];if(!h(e))return e;for(var o in e)if(n=e,r=o,Object.prototype.hasOwnProperty.call(n||{},r))if(t)try{i.push(encodeURIComponent(o)+"="+encodeURIComponent(e[o]))}catch(t){i.push(o+"="+e[o])}else i.push(o+"="+e[o]);return i.join("&")}var k=function(e){function t(t,n){var r=e.call(this,t)||this;return n&&(r.stack=n),r}return n(t,e),t}(Error),P=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.kind="INTERNAL_ERROR",t}return n(t,e),t}(k),C=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.kind="USER_ERROR",t}return n(t,e),t}(k),j=(function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.name="USER_VALIDATE_ERROR",t}n(t,e)}(C),function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.name="USER_RUNTIME_ERROR",t}n(t,e)}(C),function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.name="INTERNAL_RUNTIME_ERROR",t}n(t,e)}(P),function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.name="INVOKE_ERROR",t}return n(t,e),t}(P));function M(e,t){var n,r=null===(n=null==i?void 0:i.LynxSDKCore)||void 0===n?void 0:n.report;try{"function"==typeof r&&r(e,t,f)}catch(e){}}var O=["GET","POST","OPTIONS","PUT","HEAD","DELETE"],R=["json","string"],E=["text"],w={options:function(e){var t,n={};return t=e.url,/^(http|https):\/\/.*/i.test(t)?(h(e.header)||(e.header={}),e.header=Object.keys(e.header).reduce((function(t,n){return"content-type"===n.toLowerCase()?t[n.toLowerCase()]=e.header[n]:t[n]=e.header[n],t}),{}),e.header["content-type"]||(e.header["content-type"]="application/json"),void 0===e.method?e.method="GET":e.method=null==e?void 0:e.method.toUpperCase(),-1===O.indexOf(e.method)?(n.errCode=p,n.errMsg="invalid method",n):(void 0===e.dataType&&(e.dataType="json"),-1===R.indexOf(e.dataType)?(n.errCode=p,n.errMsg="invalid dataType",n):(void 0===e.responseType&&(e.responseType="text"),-1===E.indexOf(e.responseType)?(n.errCode=p,n.errMsg="invalid responseType",n):(void 0===e.data&&(e.data={}),h(e.data)?("GET"!==e.method&&"HEAD"!==e.method&&"DELETE"!==e.method||(e.url=function(e,t){if("string"==typeof e&&h(t)&&Object.keys(t).length>0){var n=function(e){if("string"==typeof e){var t=e.split("?");return{urlQueryObj:(t[1]||"").split("&").reduce((function(e,t){if("string"==typeof t&&t.length>0){var n=t.split("=");e[n[0]]=n[1]}return e}),{}),prefix:t[0]}}return{}}(e),i=n.urlQueryObj,o=void 0===i?{}:i,s=n.prefix,a=void 0===s?"":s,c=Object.keys(t).reduce((function(e,n){return"object"==typeof t[n]?e[encodeURIComponent(n)]=encodeURIComponent(JSON.stringify(t[n])):e[encodeURIComponent(n)]=encodeURIComponent(t[n]),e}),{});return a+"?"+A(r(r({},o),c))}return e}(e.url,e.data)),"application/x-www-form-urlencoded"===e.header["content-type"]?e.data=A(e.data,!0):e.data=JSON.stringify(e.data),("number"!=typeof e.timeout||e.timeout>6e4)&&(e.timeout=6e4),n):(n.errCode=p,n.errMsg="invalid data",n))))):(n.errCode=p,n.errMsg="invalid url",n)},callback:function(e,t){var n={};if(Number(t.code)===l&&t.data&&t.data.errCode===a){var r=t.data.data;if("string"===e.dataType&&"string"!=typeof r)n.errCode=u,n.errMsg="invalid response data";else if("json"===e.dataType)try{t.data.data=JSON.parse(r)}catch(e){n.errCode=u,n.errMsg="invalid response data"}}return n}},L={callback:function(e,t){return Number(t.code)===l&&t.data&&t.data.errCode===a&&(t.data.code=t.data.loginCode,delete t.data.loginCode),{}}};function D(e){var t={};return I(e.diamonds)||(t.errCode=d,t.errMsg="diamonds must be integer"),t}var U={options:D},T={options:D},_=Object.freeze({__proto__:null,request:w,login:L,payDiamonds:U,payDiamondsV3:T}),S=function(){function e(e){this.context=e,this.listener=[],this.apiList={},this.eventEmit=new s}return e.prototype.getApiList=function(){return this.apiList},e.prototype.registerSyncAPI=function(e){},e.prototype.registerAsyncAPI=function(e){var t=this;this.apiList[e]=function(n){var i={errMsg:e+":",errCode:a},o=m(n),s=o.apiParams,d=o.apiOptions;try{var p=_[e]||{};if("function"==typeof p.options){var u=p.options(s);if(void 0!==u.errCode)return i.errMsg+="fail "+(u.errMsg||""),i.errCode=u.errCode,d.fail(i),void d.complete(i)}t.context.NativeModules.bridge.call(e,{namespace:"webcast",data:s},(function(e){if("function"==typeof p.callback){var t=p.callback(s,e);if(void 0!==t.errCode)return i.errMsg+="fail "+(t.errMsg||""),i.errCode=t.errCode,d.fail(i),void d.complete(i)}var n=g(e.data),o=n.errCode,c=n.errMsg,u=null;Number(e.code)===l&&o===a?(i.errMsg+="ok",u=r(r({},n),i),d.success(u)):(i.errMsg+="fail "+(c||""),i.errCode=o,u=i,d.fail(u)),d.complete(u)}))}catch(n){i.errMsg+="fail",i.errCode=c,d.fail(i),d.complete(i),M(new j(e+" invoke error: "+n.message,n.stack),t.context.nativeApp)}}},e.prototype.registerListenAPI=function(e){var t=this;this.apiList[e]=function(n){return t.eventEmit.on(e,n)},this.listener.push(e)},e}(),N={$schema:"./schema.schema.json",canIUse:{invoke:"clientAPI",type:"sync",version:{"1.0.0":[]}},getUrlParams:{invoke:"clientAPI",type:"sync",version:{"1.0.0":[]}},stopRefreshViewPullDown:{invoke:"clientAPI",type:"async",version:{"1.0.0":[{object:["id"]}]}},showLoading:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[]}},hideLoading:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[]}},navigateTo:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{object:["url"]}]}},navigateBack:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{object:["delta"]}]}},log:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{object:[{level:["info","warn","debug","error"]},"log"]}]}},sendMessageToAudiences:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{object:[{timeliness:["immediate","follow_av_stream"]},"openUIDs","message"]}]}},onReceiveAudienceMessage:{invoke:"bridgeAPI",type:"listen",version:{"1.0.0":[{callback:["message"]}]}},sendMessageToAnchor:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{object:["message"]}]}},onReceiveAnchorMessage:{invoke:"bridgeAPI",type:"listen",version:{"1.0.0":[{callback:["message"]}]}},showAudiencesPanel:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{object:[{timeliness:["immediate","follow_av_stream"]},"openUIDs"]}]}},hideAudiencesPanel:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{object:[{timeliness:["immediate","follow_av_stream"]},"openUIDs"]}]}},showAnchorPanel:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[]}},hideAnchorPanel:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[]}},getRoomInfo:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{success:[{roomInfo:["roomID","liveDuration"]}]}]}},getUserInfo:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{success:[{userInfo:["openUID","secNickname","secAvatarURL","role"]}]}]}},subscribeSpecifiedContentComment:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{object:["keyWordList"]}]}},unsubscribeAllSpecifiedContentComment:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[]}},subscribeSpecifiedUserComment:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{object:["openUIDList"]}]}},unsubscribeAllSpecifiedUserComment:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[]}},onReceiveSpecifiedComment:{invoke:"bridgeAPI",type:"listen",version:{"1.0.0":[{callback:[{commentList:["openUID","secNickname","secAvatarURL","content","timestamp"]}]}]}},getSelfCommentCountDuringPluginRunning:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{success:["commentCount"]}]}},subscribeAudiencesFollowAction:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[]}},unsubscribeAudiencesFollowAction:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[]}},onReceiveAudiencesFollowAction:{invoke:"bridgeAPI",type:"listen",version:{"1.0.0":[{callback:[{followInfoList:["openUID","secNickname","secAvatarURL","action","timestamp"]}]}]}},isFollowingAnchor:{invoke:"bridgeAPI",type:"async",version:{"1.0.0":[{success:["isFollowing"]}]}},showAllAudienceCornerMark:{invoke:"bridgeAPI",type:"async",version:{"1.0.1":[]}},showSpecifiedAudienceCornerMark:{invoke:"bridgeAPI",type:"async",version:{"1.0.1":[{object:["openUIDList"]}]}},payDiamonds:{invoke:"bridgeAPI",type:"async",version:{"1.0.3":[{object:["diamonds","tag"]},{success:["orderId"]}]}},payDiamondsV3:{invoke:"bridgeAPI",type:"async",version:{"1.0.4":[{object:["diamonds","tag","orderId"]}]}},login:{invoke:"bridgeAPI",type:"async",version:{"1.0.2":[{object:["force"]},{success:["code","isLogin"]}]}},request:{invoke:"bridgeAPI",type:"async",version:{"1.0.2":[{object:["url","header","method","data","dataType","responseType","timeout"]},{success:["statusCode","header","data"]}]}},createCloud:{invoke:"clientAPI",type:"sync",version:{"1.0.9":[{object:["options"]}]}},checkIndividualPlayer:{invoke:"bridgeAPI",type:"async",version:{"1.0.5":[{success:["isIndividualPlayer"]}]}},inviteLiveUser:{invoke:"bridgeAPI",type:"async",version:{"1.0.6":[{object:["openIds"]}]}},kickOffMic:{invoke:"bridgeAPI",type:"async",version:{"1.0.6":[{object:["openIds"]}]}},disableLiveCamera:{invoke:"bridgeAPI",type:"async",version:{"1.0.6":[{object:["openIds"]}]}},enableLiveCamera:{invoke:"bridgeAPI",type:"async",version:{"1.0.6":[{object:["openIds"]}]}},disableLiveMic:{invoke:"bridgeAPI",type:"async",version:{"1.0.6":[{object:["openIds"]}]}},enableLiveMic:{invoke:"bridgeAPI",type:"async",version:{"1.0.6":[{object:["openIds"]}]}},isFavoriteGame:{invoke:"bridgeAPI",type:"async",version:{"1.0.7":[{success:["isFavorited","lastFavoriteTime"]}]}},getUserPropInfo:{invoke:"bridgeAPI",type:"async",version:{"1.0.8":[{object:["propIds"]},{success:["propInfo"]}]}},createPropUsageOrder:{invoke:"bridgeAPI",type:"async",version:{"1.0.8":[{object:["propId","num"]},{success:["orderId"]}]}}};function x(e){var t,n,r=e.split("."),i=r[0],o=r[1],s=r[2],a=r[3],c=function(e,t,n){if(!e)return[];var r=Object.keys(t),i=r.indexOf(e);if(-1===i)return[];var o=t[r[i]].version;return Object.keys(o).filter((function(e){return function(e,t,n){var r=0;if(e!==t)for(var i=e.split("."),o=t.split("."),s=Math.max(i.length,o.length),a=0;a<s;a++){var c=parseInt(i[a],10)||0,d=parseInt(o[a],10)||0;if(c>d){r=1;break}if(c<d){r=-1;break}}if(!n)return r;switch(n){case">":return r>0;case"<":return r<0;case"=":return 0===r;case">=":return r>=0;case"<=":return r<=0}}(e,n)<=0}))}(i,N,"1.0.9");return 0!==c.length&&(!(o&&!(t=function(e,t,n){for(var r,i=0;i<e.length;i++)for(var o=t[e[i]],s=0;s<o.length;s++){var a=o[s];if("string"==typeof a&&a===n){void 0===r&&(r=[]);break}if("object"==typeof a&&a.hasOwnProperty(n)){r=void 0===r?a[n]:r.concat(a[n]);break}}return r}(c,N[i].version,o)))&&!(s&&void 0===(n=F(t,s))||a&&void 0===F(n,a)))}function F(e,t){for(var n=0;n<e.length;n++){if("string"==typeof e[n]&&e[n]===t)return[];if("object"==typeof e[n]&&e[n].hasOwnProperty(t))return e[n][t]}}var G=function(e,t){var n,i,o,s=this;this.envID=h(t)&&b(t.envID)?t.envID:"",this.serviceID=h(t)&&b(t.serviceID)?t.serviceID:"",this.callContainer=(n="callContainer",i=e,o={options:function(e){var t={};return h(e)?b(e.path)?(void 0===e.init&&(e.init={method:"GET",header:{"content-type":"application/json"},timeout:6e4}),h(e.init)?(void 0===e.init.method&&(e.init.method="GET"),b(e.init.method)&&y.includes(e.init.method.toUpperCase())?(e.init.method=e.init.method.toUpperCase(),void 0===e.init.header&&(e.init.header={"content-type":"application/json"}),h(e.init.header)?(void 0===e.init.timeout&&(e.init.timeout=6e4),I(e.init.timeout)?e.init.timeout>6e4?(t.errCode=c,t.errMsg="param.init.timeout must less than 60000",t):["GET","HEAD"].includes(e.init.method)&&e.init.body?(t.errCode=c,t.errMsg="request with GET/HEAD method cannot have body",t):(e.envID=s.envID,e.serviceID=s.serviceID,e.header=e.init.header,e.method=e.init.method,e.body=JSON.stringify(e.init.body),e.timeout=e.init.timeout,delete e.init,t):(t.errCode=c,t.errMsg="param.init.timeout must be integer",t)):(t.errCode=c,t.errMsg="param.init.header must be object",t)):(t.errCode=c,t.errMsg="param.init.method is invalid",t)):(t.errCode=c,t.errMsg="param.init must be object",t)):(t.errCode=c,t.errMsg="param.path must be string",t):(t.errCode=c,t.errMsg="param must be object",t)}},function(e){var t={errMsg:n+":",errCode:a},s=m(e),d=s.apiParams,p=s.apiOptions;try{if("function"==typeof o.options){var u=o.options(d);if(void 0!==u.errCode)return t.errMsg+="fail "+(u.errMsg||""),t.errCode=u.errCode,p.fail(t),void p.complete(t)}i.NativeModules.bridge.call(n,{namespace:"webcast",data:d},(function(e){if("function"==typeof o.callback){var n=o.callback(d,e);if(void 0!==n.errCode)return t.errMsg+="fail "+(n.errMsg||""),t.errCode=n.errCode,p.fail(t),void p.complete(t)}var i=g(e.data),s=i.errCode,c=i.errMsg,u=null;Number(e.code)===l&&s===a?(t.errMsg+="ok",u=r(r({},i),t),p.success(u)):(t.errMsg+="fail "+(c||""),t.errCode=s,u=t,p.fail(u)),p.complete(u)}))}catch(e){t.errMsg+="fail",t.errCode=c,p.fail(t),p.complete(t),M(new j(n+" invoke error: "+e.message,e.stack),i.nativeApp)}})};var V=Object.freeze({__proto__:null,canIUse:function(e,t){var n=t[0];return"string"==typeof n&&Boolean(x(n))},stopRefreshViewPullDown:function(e,t,n){var r=t.id,i={code:l,data:{errCode:a}},o={code:v,data:{errCode:c}};try{e.appInstance.getNodeRef("#"+r).invoke({method:"finishRefresh",success:function(e){n(i)},fail:function(e){o.data.errMsg="string"==typeof e?e:JSON.stringify(e),n(o)}})}catch(e){o.data.errMsg=e.toString(),n(o)}},getUrlParams:function(e){return lynx&&lynx.__globalProps?function(e){var t=e.split("?")[1];if(!t)return{};for(var n=t.split("&"),r={},i="",o="",s=0;s<n.length;s++)i=n[s].split("="),o=decodeURIComponent(i[1]),r[i[0]]=o;return r}(decodeURIComponent(lynx.__globalProps.location)):{}},createCloud:function(e,t){return new G(e,t[0])}}),H=function(){function e(e){this.context=e,this.listener=[],this.apiList={}}return e.prototype.getApiList=function(){return this.apiList},e.prototype.registerSyncAPI=function(e){var t=this;this.apiList[e]=function(){for(var n=[],r=0;r<arguments.length;r++)n[r]=arguments[r];try{return V[e](t.context,n)}catch(n){M(new j(e+" invoke error: "+n.message,n.stack),t.context.nativeApp)}}},e.prototype.registerAsyncAPI=function(e){var t=this;this.apiList[e]=function(n){var i={errMsg:e+":",errCode:a},o=m(n),s=o.apiParams,d=o.apiOptions;try{V[e](t.context,s,(function(e){var t=g(e.data),n=t.errCode,o=t.errMsg;Number(e.code)===l&&n===a?(i.errMsg+="ok",d.success(r(r({},i),t))):(i.errMsg+="fail "+(o||""),i.errCode=n,d.fail(i)),d.complete(i)}))}catch(n){i.errMsg+="fail",i.errCode=c,d.fail(i),d.complete(i),M(new j(e+" invoke error: "+n.message,n.stack),t.context.nativeApp)}}},e.prototype.registerListenAPI=function(e){},e}(),J=null,q=null;function B(){J=new S(this),q=new H(this);var e={bridgeAPI:J,clientAPI:q};for(var t in N)if("$schema"!==t){var n=N[t],i=e[n.invoke];i&&o(i,t,n)}var s={};for(var t in e)s=r(r({},s),e[t].getApiList());return s}i.BDLynxSDKCore={apiInit:B,registerNativeEvent:function(e){J&&Array.isArray(J.listener)&&J.listener.forEach((function(t){e.addListener(t,(function(e){return J.eventEmit.emit(t,e.data||{})}))}))}},e.apiInit=B,Object.defineProperty(e,"__esModule",{value:!0})}({});