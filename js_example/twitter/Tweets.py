import requests
import json
from Utils import getGuestToken,getApiQueryId
from Proxy import proxies

class Tweets:
    def __init__(self, user_id: int = 44196397,user_name : str = "elonmusk") -> None:
        self.query_id = getApiQueryId("UserTweets")
        self.variables = {"userId": str(user_id), "count": 40, "includePromotedContent": True, "withQuickPromoteEligibilityTweetFields": True,
                     "withDownvotePerspective": False, "withReactionsMetadata": False, "withReactionsPerspective": False, "withVoice": True, "withV2Timeline": True}
        self.features = {"responsive_web_twitter_blue_verified_badge_is_enabled": True, "responsive_web_graphql_exclude_directive_enabled": True, "verified_phone_label_enabled": False, "responsive_web_graphql_timeline_navigation_enabled": True, "responsive_web_graphql_skip_user_profile_image_extensions_enabled": False, "tweetypie_unmention_optimization_enabled": True, "vibe_api_enabled": True, "responsive_web_edit_tweet_api_enabled": True, "graphql_is_translatable_rweb_tweet_is_translatable_enabled": True,
                    "view_counts_everywhere_api_enabled": True, "longform_notetweets_consumption_enabled": True, "tweet_awards_web_tipping_enabled": False, "freedom_of_speech_not_reach_fetch_enabled": False, "standardized_nudges_misinfo": True, "tweet_with_visibility_results_prefer_gql_limited_actions_policy_enabled": False, "interactive_text_enabled": True, "responsive_web_text_conversations_enabled": False, "longform_notetweets_richtext_consumption_enabled": False, "responsive_web_enhance_cards_enabled": False}
        self.session = requests.session()
        self.refreshToken()
        self.base_headers = {
            'authority': 'twitter.com',
            'path': self.url[19:],
            'accept-language': 'zh-CN,zh;q=0.9',
            'authorization': 'Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA',
            'content-type': 'application/json',
            'x-twitter-client-language': 'zh-cn',
            'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36',
        }
        self.next_cursor = None
        self.data = None
    
    def refreshToken(self):
        self.x_guest_token,self.cookie = getGuestToken(self.session)
    
    def crawl(self) -> None:
        self.base_headers.update({
            'cookie': self.cookie,
            'x-guest-token': self.x_guest_token,
        })
        if self.next_cursor:
            self.variables.update({
                "cursor":self.next_cursor
            })
        self.url = f'https://twitter.com/i/api/graphql/{self.query_id}/UserTweets?variables={json.dumps(self.variables).replace("True","true").replace("False","false")}&features={json.dumps(self.features).replace("True","true").replace("False","false")}'
        res = self.session.get(self.url, headers=self.base_headers, proxies=proxies)
        data = res.json()["data"]["user"]["result"]["timeline_v2"]["timeline"]["instructions"][-2]["entries"]
        if len(data) < 40:
            self.next_cursor = None
        else:
            self.next_cursor = data[-1]["content"]["value"]
        self.data = data[:-2]

if __name__ == "__main__":
    Tweets().crawl()
