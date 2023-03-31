import requests
import re
from Proxy import proxies
import urllib

def getApiQueryId(operation_name:str = "UserTweets") -> str or None:
    res = requests.get(url="https://abs.twimg.com/responsive-web/client-web/api.d46908ca.js",proxies={"http":"http://127.0.0.1:7890","https":"http://127.0.0.1:7890"},timeout=10)
    ans = re.findall(rf'queryId:"([0-9A-Za-z\-\_]+?)",operationName:"{operation_name}"',res.text)
    if ans:
        return ans[0]
    else:
        return None

def getGuestToken(session) -> tuple:
    url = "https://twitter.com/"
    headers = {
        'authority': 'twitter.com',
        'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36'
    }
    session.get(url=url, headers=headers, proxies=proxies)
    cookie = '; '.join([f'{key}={value}' for key, value in session.cookies.get_dict().items()])
    x_guest_token = session.cookies.get_dict()["gt"]
    return x_guest_token,cookie

def customEncodeUrl(params) -> str:
    encoded_params = []
    for key, value in params.items():
        if isinstance(value, bool):
            value_str = str(value).lower()  # 转换为小写字符串
        else:
            value_str = str(value)
        encoded_key = urllib.parse.quote_plus(str(key))
        encoded_value = urllib.parse.quote_plus(value_str)
        encoded_params.append(encoded_key + '=' + encoded_value)
    return '&'.join(encoded_params)


if __name__ == "__main__":
    print(getGuestToken())
