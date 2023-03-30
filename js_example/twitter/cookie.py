import requests
import re
import json
import execjs

proxies = {
    "http": "http://127.0.0.1:7890",
    "https": "http://127.0.0.1:7890"
}

jsdom = '''
const jsdom = require("jsdom")
const { JSDOM } = jsdom
const dom = new JSDOM ();
window = dom.window;
document = window.document;
'''


class Cookie:
    def __init__(self, user_name:str = "hehehe54525666" ,login_email: str = "438555093@qq.com", password: str = "gaijie0318") -> None:
        self.user_name = user_name
        self.login_email = login_email
        self.password = password
        self.session = requests.session()
        self.cookie = {}
        self.flow_token = None
        self.rf = None
        self.email_code = None

    def login(self):
        self._reqHost()
        self._getFlowToken()
        self._getJsInstrumentation()
        self._subTask()
        self._subLoginEmail()
        self._subUserName()
        self._subPassword()
        self._getCookies()
        self._subEmailCode()

    def _reqHost(self) -> None:
        url = "https://twitter.com/"
        headers = {
            'authority': 'twitter.com',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36'
        }
        self.session.get(url=url, headers=headers, proxies=proxies)
        self.cookie.update(self.session.cookies.get_dict())

    def _getFlowToken(self) -> None:
        url = "https://api.twitter.com/1.1/onboarding/task.json?flow_name=login"
        headers = {
            'authority': 'api.twitter.com',
            'path': '/1.1/onboarding/task.json?flow_name=login',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'cookie': f'guest_id_ads={self.cookie["guest_id_ads"]}; guest_id_marketing={self.cookie["guest_id_marketing"]}; gt={self.cookie["gt"]}; guest_id={self.cookie["guest_id"]}; personalization_id={self.cookie["personalization_id"]};',
            'origin': 'https://twitter.com',
            'referer': 'https://twitter.com/',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
            'x-guest-token': self.cookie["gt"],
            'x-twitter-active-user': 'yes',
            'x-twitter-client-language': 'zh-cn',
        }
        payload = {"input_flow_data": {"flow_context": {"debug_overrides": {}, "start_location": {"location": "unknown"}}}, "subtask_versions": {"action_list": 2, "alert_dialog": 1, "app_download_cta": 1, "check_logged_in_account": 1, "choice_selection": 3, "contacts_live_sync_permission_prompt": 0, "cta": 7, "email_verification": 2, "end_flow": 1, "enter_date": 1, "enter_email": 2, "enter_password": 5, "enter_phone": 2, "enter_recaptcha": 1, "enter_text": 5, "enter_username": 2, "generic_urt": 3, "in_app_notification": 1,
                                                                                                                                                 "interest_picker": 3, "js_instrumentation": 1, "menu_dialog": 1, "notifications_permission_prompt": 2, "open_account": 2, "open_home_timeline": 1, "open_link": 1, "phone_verification": 4, "privacy_options": 1, "security_key": 3, "select_avatar": 4, "select_banner": 2, "settings_list": 7, "show_code": 1, "sign_up": 2, "sign_up_review": 4, "tweet_selection_urt": 1, "update_users": 1, "upload_media": 1, "user_recommendations_list": 4, "user_recommendations_urt": 1, "wait_spinner": 3, "web_modal": 1}}
        res = self.session.post(url=url, headers=headers,
                                proxies=proxies, json=payload)
        self.cookie.update(self.session.cookies.get_dict())
        self.flow_token = res.json()["flow_token"][:-1]
        print(self.flow_token)

    def _getJsInstrumentation(self) -> None:
        url = "https://twitter.com/i/js_inst?c_name=ui_metrics"
        headers = {
            'authority': 'api.twitter.com',
            'path': '/i/js_inst?c_name=ui_metrics',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'cookie': f'guest_id_ads={self.cookie["guest_id_ads"]}; guest_id_marketing={self.cookie["guest_id_marketing"]}; att={self.cookie["att"]}; gt={self.cookie["gt"]}; guest_id={self.cookie["guest_id"]}; personalization_id={self.cookie["personalization_id"]};',
            'origin': 'https://twitter.com',
            'referer': 'https://twitter.com/',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
            'x-guest-token': self.cookie["gt"],
            'x-twitter-active-user': 'yes',
            'x-twitter-client-language': 'zh-cn',
        }
        res = self.session.get(url=url, headers=headers, proxies=proxies)
        self.cookie.update(self.session.cookies.get_dict())
        open('js_inst.js', 'w').write(jsdom)
        open('js_inst.js', 'ab').write(res.content)
        js_inst = open('js_inst.js', 'r').readlines()
        f = open('js_inst.js', 'w')
        for i in range(len(js_inst)):
            if i == 6 or i == 7:
                continue
            if i >= 9:
                break
            f.write(js_inst[i])
        func_name = re.findall(r'function (.+?)\(\).\{', js_inst[8])[0]
        f.close()
        self.rf = execjs.compile(open('js_inst.js').read()).call(func_name)

    def _subTask(self):
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        headers = {
            'authority': 'api.twitter.com',
            'path': '/1.1/onboarding/task.json',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'cookie': f'guest_id_ads={self.cookie["guest_id_ads"]}; guest_id_marketing={self.cookie["guest_id_marketing"]}; gt={self.cookie["gt"]}; guest_id={self.cookie["guest_id"]}; att={self.cookie["att"]}; _twitter_sess={self.cookie["_twitter_sess"]}; personalization_id={self.cookie["personalization_id"]};',
            'origin': 'https://twitter.com',
            'referer': 'https://twitter.com/',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
            'x-guest-token': self.cookie["gt"],
            'x-twitter-active-user': 'yes',
            'x-twitter-client-language': 'zh-cn',
        }
        payload = {"flow_token": self.flow_token + '0', "subtask_inputs": [{"subtask_id": "LoginJsInstrumentationSubtask", "js_instrumentation": {
            "response": json.dumps(self.rf), "link": "next_link"}}]}
        res = self.session.post(url=url, headers=headers,
                                proxies=proxies, json=payload)
        self.cookie.update(self.session.cookies.get_dict())
   
    def _subLoginEmail(self) -> None:
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        headers = {
            'authority': 'api.twitter.com',
            'path': '/1.1/onboarding/task.json',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'cookie': f'guest_id_ads={self.cookie["guest_id_ads"]}; guest_id_marketing={self.cookie["guest_id_marketing"]}; gt={self.cookie["gt"]}; guest_id={self.cookie["guest_id"]}; att={self.cookie["att"]}; _twitter_sess={self.cookie["_twitter_sess"]}; personalization_id={self.cookie["personalization_id"]};',
            'origin': 'https://twitter.com',
            'referer': 'https://twitter.com/',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
            'x-guest-token': self.cookie["gt"],
            'x-twitter-active-user': 'yes',
            'x-twitter-client-language': 'zh-cn',
        }
        payload = {"flow_token": self.flow_token + '1', "subtask_inputs": [{"subtask_id": "LoginEnterUserIdentifierSSO", "settings_list": {
            "setting_responses": [{"key": "user_identifier", "response_data": {"text_data": {"result": self.login_email}}}], "link": "next_link"}}]}
        res = self.session.post(url=url, headers=headers,
                                proxies=proxies, json=payload)
        self.cookie.update(self.session.cookies.get_dict())
        print(res.text,payload["flow_token"])
 
    def _subUserName(self):
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        headers = {
            'authority': 'api.twitter.com',
            'path': '/1.1/onboarding/task.json',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'cookie': f'guest_id_ads={self.cookie["guest_id_ads"]}; guest_id_marketing={self.cookie["guest_id_marketing"]}; gt={self.cookie["gt"]}; guest_id={self.cookie["guest_id"]}; att={self.cookie["att"]}; _twitter_sess={self.cookie["_twitter_sess"]}; personalization_id={self.cookie["personalization_id"]};',
            'origin': 'https://twitter.com',
            'referer': 'https://twitter.com/',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
            'x-guest-token': self.cookie["gt"],
            'x-twitter-active-user': 'yes',
            'x-twitter-client-language': 'zh-cn',
        }
        payload = {
            "flow_token": self.flow_token + '7',
            "subtask_inputs": [
                {
                    "subtask_id": "LoginEnterAlternateIdentifierSubtask",
                    "enter_text": {
                        "text": self.user_name,
                        "link": "next_link"
                    }
                }
            ]
        }
        res = self.session.post(url=url, headers=headers,
                                proxies=proxies, json=payload)
        self.cookie.update(self.session.cookies.get_dict())
        print(res.text,payload["flow_token"])
        
    def _subPassword(self):
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        headers = {
            'authority': 'api.twitter.com',
            'path': '/1.1/onboarding/task.json',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'cookie': f'guest_id_ads={self.cookie["guest_id_ads"]}; guest_id_marketing={self.cookie["guest_id_marketing"]}; gt={self.cookie["gt"]}; guest_id={self.cookie["guest_id"]}; att={self.cookie["att"]}; _twitter_sess={self.cookie["_twitter_sess"]}; personalization_id={self.cookie["personalization_id"]};',
            'origin': 'https://twitter.com',
            'referer': 'https://twitter.com/',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
            'x-guest-token': self.cookie["gt"],
            'x-twitter-active-user': 'yes',
            'x-twitter-client-language': 'zh-cn',
        }
        payload = {
            "flow_token": self.flow_token + '8',
            "subtask_inputs": [
                {
                    "subtask_id": "LoginEnterPassword",
                    "enter_password": {
                        "password": self.password,
                        "link": "next_link"
                    }
                }
            ]
        }
        res = self.session.post(url=url, headers=headers,
                                proxies=proxies, json=payload)
        self.cookie.update(self.session.cookies.get_dict())
        print(res.text,payload["flow_token"])

    def _getCookies(self):
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        headers = {
            'authority': 'api.twitter.com',
            'path': '/1.1/onboarding/task.json',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'cookie': f'guest_id_ads={self.cookie["guest_id_ads"]}; guest_id_marketing={self.cookie["guest_id_marketing"]}; gt={self.cookie["gt"]}; guest_id={self.cookie["guest_id"]}; att={self.cookie["att"]}; _twitter_sess={self.cookie["_twitter_sess"]}; personalization_id={self.cookie["personalization_id"]};',
            'origin': 'https://twitter.com',
            'referer': 'https://twitter.com/',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
            'x-guest-token': self.cookie["gt"],
            'x-twitter-active-user': 'yes',
            'x-twitter-client-language': 'zh-cn',
        }
        payload = {
            "flow_token": self.flow_token + '11',
            "subtask_inputs": [
                {
                    "subtask_id": "AccountDuplicationCheck",
                    "check_logged_in_account": {
                        "link": "AccountDuplicationCheck_false"
                    }
                }
            ]
        }
        res = self.session.post(url=url, headers=headers,proxies=proxies, json=payload)
        self.cookie.update(self.session.cookies.get_dict())
        print(res.text,payload["flow_token"])
    
    def _subEmailCode(self):
        self.email_code = input("email code:")
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        headers = {
            'authority': 'api.twitter.com',
            'path': '/1.1/onboarding/task.json',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'cookie': f'guest_id_ads={self.cookie["guest_id_ads"]}; guest_id_marketing={self.cookie["guest_id_marketing"]}; gt={self.cookie["gt"]}; guest_id={self.cookie["guest_id"]}; att={self.cookie["att"]}; _twitter_sess={self.cookie["_twitter_sess"]}; personalization_id={self.cookie["personalization_id"]};',
            'origin': 'https://twitter.com',
            'referer': 'https://twitter.com/',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
            'x-guest-token': self.cookie["gt"],
            'x-twitter-active-user': 'yes',
            'x-twitter-client-language': 'zh-cn',
        }
        payload = {
            "flow_token": self.flow_token + '12',
            "subtask_inputs": [
                {
                    "subtask_id": "LoginAcid",
                    "enter_text": {
                        "text": self.email_code,
                        "link": "next_link"
                    }
                }
            ]
        }
        res = self.session.post(url=url, headers=headers,proxies=proxies, json=payload)
        self.cookie.update(self.session.cookies.get_dict())
        print(res.text,payload["flow_token"])
        print(self.cookie)

if __name__ == "__main__":
    Cookie().login()
