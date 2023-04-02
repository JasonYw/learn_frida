import requests
from Proxy import Proxy
import re
import json
import execjs
import time
from Email import Email
from Utils import getGuestToken,getApiQueryId
jsdom = '''
const jsdom = require("jsdom")
const { JSDOM } = jsdom
const dom = new JSDOM ();
window = dom.window;
document = window.document;
'''
class Cookie:
    def __init__(self, user_name: str, login_email: str, password: str, imap_email_password: str, imap_host: str, imap_port: int) -> None:
        self.user_name = user_name
        self.login_email = login_email
        self.password = password
        self.imap_email_password = imap_email_password
        self.imap_host = imap_host
        self.imap_port = imap_port
        self.cookie = {}
        self.flow_token = None
        self.rf = None
        self.email_code = None
        self.x_guest_token = None
        self.send_email_time = None
        self.proxies = Proxy().getProxies()
        self.session = requests.session()
        self.base_headers = {
            'authority': 'api.twitter.com',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'origin': 'https://twitter.com',
            'referer': 'https://twitter.com/',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
            'x-twitter-active-user': 'yes',
            'x-twitter-client-language': 'zh-cn',
        }

    def login(self) -> tuple:
        self.x_guest_token,self.cookie = getGuestToken(self.session,self.proxies)
        self._getFlowToken()
        self._getJsInstrumentation()
        self._subTask()
        next_flow = self._subLoginEmail()
        if next_flow == "7":
            self._subUserName()
        self._subPassword()
        next_flow = self._subVerfyRisk()
        if next_flow == "12":
            self.send_email_time = int(time.time())
            self._subEmailCode()
        self._subAfterLogin()
        print(self.cookie)
        self._close()
        return self.cookie
    
    def _close(self) -> None:
        self.session.close()

    def _getFlowToken(self) -> None:
        url = "https://api.twitter.com/1.1/onboarding/task.json?flow_name=login"
        self.base_headers.update({
            'path': '/1.1/onboarding/task.json?flow_name=login',
            'cookie': self.cookie,
            'x-guest-token': self.x_guest_token,
        })
        payload = {"input_flow_data": {"flow_context": {"debug_overrides": {}, "start_location": {"location": "unknown"}}}, "subtask_versions": {"action_list": 2, "alert_dialog": 1, "app_download_cta": 1, "check_logged_in_account": 1, "choice_selection": 3, "contacts_live_sync_permission_prompt": 0, "cta": 7, "email_verification": 2, "end_flow": 1, "enter_date": 1, "enter_email": 2, "enter_password": 5, "enter_phone": 2, "enter_recaptcha": 1, "enter_text": 5, "enter_username": 2, "generic_urt": 3, "in_app_notification": 1,
                                                                                                                                                 "interest_picker": 3, "js_instrumentation": 1, "menu_dialog": 1, "notifications_permission_prompt": 2, "open_account": 2, "open_home_timeline": 1, "open_link": 1, "phone_verification": 4, "privacy_options": 1, "security_key": 3, "select_avatar": 4, "select_banner": 2, "settings_list": 7, "show_code": 1, "sign_up": 2, "sign_up_review": 4, "tweet_selection_urt": 1, "update_users": 1, "upload_media": 1, "user_recommendations_list": 4, "user_recommendations_urt": 1, "wait_spinner": 3, "web_modal": 1}}
        res = self.session.post(url=url, headers=self.base_headers,
                                proxies=self.proxies, json=payload)
        self.cookie = '; '.join([f'{key}={value}' for key, value in self.session.cookies.get_dict().items()])
        self.flow_token = res.json()["flow_token"][:-1]
        print(self.flow_token)

    def _getJsInstrumentation(self) -> None:
        url = "https://twitter.com/i/js_inst?c_name=ui_metrics"
        self.base_headers.update({
            'path': '/i/js_inst?c_name=ui_metrics',
            'cookie': self.cookie,
        })
        res = self.session.get(url=url, headers=self.base_headers, proxies=self.proxies)
        self.cookie = '; '.join([f'{key}={value}' for key, value in self.session.cookies.get_dict().items()])
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
        self.base_headers.update({
            'path': '/1.1/onboarding/task.json',
            'cookie': self.cookie,
        })
        payload = {"flow_token": self.flow_token + '0', "subtask_inputs": [{"subtask_id": "LoginJsInstrumentationSubtask", "js_instrumentation": {
            "response": json.dumps(self.rf), "link": "next_link"}}]}
        res = self.session.post(url=url, headers=self.base_headers,
                                proxies=self.proxies, json=payload)
        self.cookie = '; '.join([f'{key}={value}' for key, value in self.session.cookies.get_dict().items()])
        print(res.text, payload["flow_token"])

    def _subLoginEmail(self) -> str:
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        self.base_headers.update({
            'path': '/1.1/onboarding/task.json',
            'cookie': self.cookie,
        })
        payload = {"flow_token": self.flow_token + '1', "subtask_inputs": [{"subtask_id": "LoginEnterUserIdentifierSSO", "settings_list": {
            "setting_responses": [{"key": "user_identifier", "response_data": {"text_data": {"result": self.login_email}}}], "link": "next_link"}}]}
        res = self.session.post(url=url, headers=self.base_headers,
                                proxies=self.proxies, json=payload)
        self.cookie = '; '.join([f'{key}={value}' for key, value in self.session.cookies.get_dict().items()])
        print(res.text, payload["flow_token"])
        return res.json()["flow_token"][-1]

    def _subUserName(self) -> None:
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        self.base_headers.update({
            'path': '/1.1/onboarding/task.json',
            'cookie': self.cookie,
        })
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
        res = self.session.post(url=url, headers=self.base_headers,
                                proxies=self.proxies, json=payload)
        self.cookie = '; '.join([f'{key}={value}' for key, value in self.session.cookies.get_dict().items()])
        print(res.text, payload["flow_token"])
        return res.json()["flow_token"]

    def _subPassword(self) -> None:
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        self.base_headers.update({
            'path': '/1.1/onboarding/task.json',
            'cookie': self.cookie,
        })
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
        res = self.session.post(url=url, headers=self.base_headers,
                                proxies=self.proxies, json=payload)
        self.cookie = '; '.join([f'{key}={value}' for key, value in self.session.cookies.get_dict().items()])
        print(res.text, payload["flow_token"])
        return res.json()["flow_token"]

    def _subVerfyRisk(self) -> str:
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        self.base_headers.update({
            'path': '/1.1/onboarding/task.json',
            'cookie': self.cookie,
        })
        payload = {
            "flow_token": self.flow_token + '11',
            "subtask_inputs": [
                {
                    "subtask_id": "AccountDuplicationCheck",
                    "check_logged_in_account": {
                        "link": "AccountDuplicationCheck_False"
                    }
                }
            ]
        }
        res = self.session.post(url=url, headers=self.base_headers,
                                proxies=self.proxies, json=payload)
        self.cookie = '; '.join([f'{key}={value}' for key, value in self.session.cookies.get_dict().items()])
        print(res.text, payload["flow_token"])
        return res.json()["flow_token"][-2:]

    def _subEmailCode(self) -> None:
        time.sleep(30)
        with Email(email_address=self.login_email, password=self.imap_email_password, imap_host=self.imap_host, imap_port=self.imap_port) as email:
            msg_id, msg_subject, msg_detail = email.selectUnSeenEmail(sender="Twitter <info@twitter.com>")
            # Your Twitter confirmation code is 4aweqxkn
            self.email_code = msg_subject[34:]
            email.addSeenFlag(msg_id=msg_id)
        url = "https://api.twitter.com/1.1/onboarding/task.json"
        self.base_headers.update({
            'path': '/1.1/onboarding/task.json',
            'cookie': self.cookie,
        })
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
        res = self.session.post(url=url, headers=self.base_headers,
                                proxies=self.proxies, json=payload)
        self.cookie = '; '.join([f'{key}={value}' for key, value in self.session.cookies.get_dict().items()])
        print(res.text, payload["flow_token"])
    
    def _subAfterLogin(self) -> None:
        query_id = getApiQueryId("Viewer")
        variables = {"withCommunitiesMemberships":True,"withCommunitiesCreation":True}
        features = {"responsive_web_twitter_blue_verified_badge_is_enabled":True,"responsive_web_graphql_exclude_directive_enabled":True,"verified_phone_label_enabled":False,"responsive_web_graphql_skip_user_profile_image_extensions_enabled":False,"responsive_web_graphql_timeline_navigation_enabled":True}
        url = f'https://twitter.com/i/api/graphql/{query_id}/Viewer?variables={json.dumps(variables).replace("True","true").replace("False","false")}&features={json.dumps(features).replace("True","true").replace("False","false")}'
        self.base_headers.update({
            'path': url[19:],
            'cookie': self.cookie,
        })
        self.session.get(url,headers=self.base_headers,proxies=self.proxies)
        self.cookie = '; '.join([f'{key}={value}' for key, value in self.session.cookies.get_dict().items()])
        


if __name__ == "__main__":
    Cookie(user_name="crawler_cookie0", login_email="971341273@qq.com", password="gaijie0318",
           imap_email_password="iyiawkgucdajbcaa", imap_host="imap.qq.com", imap_port=993).login()
