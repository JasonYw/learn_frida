import requests


def login():

    url = "https://ptlogin6.qidian.com/sdk/staticlogin"
    signature = "ZOk/8J13LxuTJ5/qL0NEkUQW56x6UT1hyg11VcioEi7bf7VzSDliMoqOeGdna+Ep3IwiVdItZiu8NrkWOr6qGPpaMbZIPOXiM/yVCyrKMDLg3ouLlLKrUg=="
    password = "ti4LeUASd00utFuDTl/kSgJ1zCc8iZC8n1gv7g8zhNqAE345rMVc5hajnu+iAy9DIXGO7wMZ69F6H2OvJ8AdY2wwyg2kpFQgLddfMuiYTCjJwuKdwlI+ZBLwunD/WJaC4K+1vbUZwG3Q+kTps5FNyxljG9XDxp89cmUzt9h3G2I="
    header = {
        "method":"POST",
        "path":"/sdk/staticlogin",
        "authority":"ptlogin6.qidian.com",
        "scheme":"https",
        "referer":"http://android.qidian.com",
        "content-type":"application/x-www-form-urlencoded",
        "content-length":"637",
        "accept-encoding":"gzip",
        "user-agent":"okhttp/3.12.13",
    }
    data ={
        "areaid":"30",
        "format":"json",
        "returnurl":"http://www.qidian.com",
        "source":"1000009",
        "ticket":"0",
        "username":"15801367777",
        "auto":"1",
        "appid":"12",
        "osversion":"Android10_7.9.198_696",
        "version":"696",
        "sdkversion":"220",
        "devicename":"Pixel 2",
        "devicetype":"google_Pixel 2",
        "signature":signature,
        "referer":"http://android.qidian.com",
        "password":password,
        "autotime":"30",
    }
    res = requests.post(url,headers=header,data=data)
    print(res.json())



if __name__ == "__main__":
    login()