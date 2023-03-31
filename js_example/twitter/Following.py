from Cookie import Cookie
from Utils import getApiQueryId
import json
import requests
from Proxy import proxies
import re
class Following:
    def __init__(self,user_id: int = 44196397,user_name : str = "elonmusk") -> None:
        query_id = getApiQueryId("Following")
        base_url = f"https://twitter.com/i/api/graphql/{query_id}/Following"
        variables = {"userId":str(user_id),"count":20,"includePromotedContent":False,"withDownvotePerspective":False,"withReactionsMetadata":False,"withReactionsPerspective":False}
        features = {"responsive_web_twitter_blue_verified_badge_is_enabled":True,"responsive_web_graphql_exclude_directive_enabled":True,"verified_phone_label_enabled":False,"responsive_web_graphql_timeline_navigation_enabled":True,"responsive_web_graphql_skip_user_profile_image_extensions_enabled":False,"tweetypie_unmention_optimization_enabled":True,"vibe_api_enabled":True,"responsive_web_edit_tweet_api_enabled":True,"graphql_is_translatable_rweb_tweet_is_translatable_enabled":True,"view_counts_everywhere_api_enabled":True,"longform_notetweets_consumption_enabled":True,"tweet_awards_web_tipping_enabled":False,"freedom_of_speech_not_reach_fetch_enabled":False,"standardized_nudges_misinfo":True,"tweet_with_visibility_results_prefer_gql_limited_actions_policy_enabled":False,"interactive_text_enabled":True,"responsive_web_text_conversations_enabled":False,"longform_notetweets_richtext_consumption_enabled":False,"responsive_web_enhance_cards_enabled":False}
        self.url = f'{base_url}?variables={json.dumps(variables).replace("True","true").replace("False","false")}&features={json.dumps(features).replace("True","true").replace("False","false")}'
        self.session = requests.session()
        self.base_headers = {
            'authority': 'twitter.com',
            'path': self.url[19:],
            'accept-language': 'zh-CN,zh;q=0.9',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'x-twitter-auth-type': 'OAuth2Session',
            'x-twitter-client-language': 'zh-cn',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
        }

    def crawl(self):
        cookie = Cookie(user_name="crawler_cookie0", login_email="971341273@qq.com", password="gaijie0318",imap_email_password="iyiawkgucdajbcaa", imap_host="imap.qq.com", imap_port=993).login()
        self.base_headers.update({
            'cookie':cookie,
            'x-csrf-token': re.findall(r'ct0=(.+?);',cookie)[0]
        })
        res = self.session.get(self.url, headers=self.base_headers, proxies=proxies)
        open('following_data.json', 'wb').write(res.content)

if __name__ == '__main__':
    Following().crawl()

