import requests
from parsel import Selector

session = requests.Session()
import execjs

headers = {
    "Host": "www.shhuangpu.gov.cn",
    "Referer": "https://www.shhuangpu.gov.cn/hpxy/sgsDataList?active=4",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36",
}

params = {
    "active": "4",
}

response = session.get(
    "https://www.shhuangpu.gov.cn/hpxy/sgsDataList", params=params, headers=headers
)

print(response.status_code)


ts_js_url = (
    "https://www.shhuangpu.gov.cn"
    + Selector(response.text).xpath("//script/@src").getall()[0]
)
content = Selector(response.text).xpath("//meta/@content").getall()[1]
html_js = Selector(response.text).xpath("//script/text()").getall()[0]


env = """
var eval_data = ''
var content;




delete __dirname
delete __filename


setinval_b = setInterval
setInterval = function (arguments) {
    console.log("setInterval:", arguments)
}

localStorage = {
    "$_f1": "..AqLU5YSHsixTS4U1DxKYC_ZDa",
    "$_ff": "MUqXnCVAoHhXI96hH9HMFOVezhabKJi1niLAJ.7rZt_8GEzgVV01Elopa_NZKMxX",
    "$_f0": "sB1sFPPWyI9xi8f8AfoOG.n_LMG",
    "$_fh1": "abJRX5qGt_GW5Q3sOLAzug9aM7Q",
    "__#classType": "localStorage",
    "$_nd": "83330",
    "$_cDro": "WOlg",
    "$_YWTU": "ui8RKqIjlCgAurT.om8wufhj1vtIkobkJCvXQJE_oCG"
}

sessionStorage = {
    "IsThisFirstTime_Log_From_LiveServer": "true",
    "$_cDro": "WOlg",
    "$_YWTU": "ui8RKqIjlCgAurT.om8wufhj1vtIkobkJCvXQJE_oCG"
}

document = {
    characterSet: 'UTF-8',
    charset: 'UTF-8',
    cookie: '',
    documentElement: {
        style: {},
        addEventListener: function (arguments) { },
        getAttribute: function (arguments) { }
    },
    createElement: function (arg) {
        console.log("document:createElement", arg)
        if (arg == "div") {
            return document
        }
    },
    getElementsByTagName: function (arg) {
        console.log("document:getElementsByTagName", arg)
        if (arg == "i") {
            return []
        } else if (arg == "meta") {
            return [
                {},
                {
                    "content": content,
                    "parentNode": document
                }
            ]
        } else if (arg == "base") {
            return []
        } else if (arg == "script") {
            return [{
                getAttribute: function (arguments) { }
            }, {
                getAttribute: function (arguments) { }
            }]
        }
    },
    removeChild: function (arg) {
        console.log("document:removeChild", arg)
    },
    getElementById: function (arg) {
        console.log("document:getElementById", arg)
        if (arg == "root-hammerhead-shadow-ui") {
            return null
        }
    },
    addEventListener: function (arguments) { },
    exitFullscreen: function(arguments){}
}

navigator = {
    getBattery:function(){},
    platform:'Win32',
    webdriver:false,
    webkitPersistentStorage:{},
    appCodeName: "Mozilla",
    appName: "Netscape",
    appVersion: "5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36",
    userAgent: "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36",
    mimeTypes: [
        {}, {}
    ],
    languages:[
        "zh-CN",
        "zh",
        "en"
    ],
    connection:{
        "downlink": 5.2
    }
}
location = {
    "ancestorOrigins": {},
    "href": "https://www.shhuangpu.gov.cn/hpxy/sgsDataList?active=4",
    "origin": "https://www.shhuangpu.gov.cn",
    "protocol": "https:",
    "host": "www.shhuangpu.gov.cn",
    "hostname": "www.shhuangpu.gov.cn",
    "port": "",
    "pathname": "/hpxy/sgsDataList",
    "search": "?active=4",
    "hash": ""
}
window = global
Window = function Window(){}
window.indexedDB = {}
window.webkitRequestFileSystem = function(){}
window.HTMLFormElement = function(){}
window.$_ts = []
window.clientInformation = {
    webdriver: false
}
window.sessionStorage = sessionStorage
window.localStorage = localStorage
window.addEventListener = function(arguments){
    return {
        "a": 1, "b": 2
    }
}
window.isFinite = isFinite
window.clearInterval = clearInterval
window.Math = Math
window.parseFloat = parseFloat
window.escape = escape
window.RegExp = RegExp
window.name = ''
window.setInterval = setInterval
window.document = document
window.navigator = navigator
window.location = location
window.TEMPORARY = 0
window.__proto__ = Window.prototype
window.setTimeout = function(arguments){
    console.log("setTimeout:", arguments)
}
window.chrome = {
    "app":{
        "InstallState":{
            "DISABLED": "disabled",
            "INSTALLED": "installed",
            "NOT_INSTALLED": "not_installed"
        }
    },
    "csi":{
        "name":"",
        "length":0,
    }
}
window.setTimeout = setTimeout
window.setInterval = setInterval
window.XMLHttpRequest = function(){}
window.DOMParser = function(){}
window.top = window
window.self = window

function getCookie(){
    return document.cookie
}


""".replace(
    "var content;", f'var content = "{content}"'
)


ts_js = session.get(ts_js_url, headers=headers).text


with open("example.js", "w") as f:
    f.write(env)
    f.write(ts_js)
    f.write("\n")
    f.write(html_js)


js = execjs.compile(open("example.js").read())
cookie = js.call("getCookie").split(";")[0].split("=")
cookies = session.cookies.get_dict()
cookies.update({cookie[0]: cookie[1]})

print(cookies)


response = session.get(
    url="https://www.shhuangpu.gov.cn/hpxy/sgsDataList",
    cookies=cookies,
    headers=headers,
)


print(response.status_code)
