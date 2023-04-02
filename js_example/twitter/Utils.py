import re

def getApiQueryId(session,operation_name:str = "UserTweets",proxies:dict = None) -> str or None:
    res = session.get(url="https://abs.twimg.com/responsive-web/client-web/api.d46908ca.js",proxies=proxies,timeout=10)
    ans = re.findall(rf'queryId:"([0-9A-Za-z\-\_]+?)",operationName:"{operation_name}"',res.text)
    if ans:
        return ans[0]
    else:
        return None

def getGuestToken(session,proxies:dict = None) -> tuple:
    url = "https://twitter.com/"
    headers = {
        'authority': 'twitter.com',
        'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36'
    }
    session.get(url=url, headers=headers, proxies=proxies)
    cookie = '; '.join([f'{key}={value}' for key, value in session.cookies.get_dict().items()])
    x_guest_token = session.cookies.get_dict()["gt"]
    return x_guest_token,cookie


if __name__ == "__main__":
    pass
