import requests
import json
from Utils import getGuestToken, getApiQueryId
from Proxy import Proxy
import time
from jsonpath import jsonpath


class Tweets:
    def __init__(self, user_id: str = "37174612", user_name: str = "4nqr34z") -> None:
        self.user_id = user_id
        self.user_name = user_name
        self.variables = {
            "userId": self.user_id,
            "count": 40,
            "includePromotedContent": True,
            "withQuickPromoteEligibilityTweetFields": True,
            "withDownvotePerspective": False,
            "withReactionsMetadata": False,
            "withReactionsPerspective": False,
            "withVoice": True,
            "withV2Timeline": True,
        }
        self.features = {
            "responsive_web_twitter_blue_verified_badge_is_enabled": True,
            # "blue_business_profile_image_shape_enabled": False,
            "responsive_web_graphql_exclude_directive_enabled": True,
            "verified_phone_label_enabled": False,
            "responsive_web_graphql_timeline_navigation_enabled": True,
            "responsive_web_graphql_skip_user_profile_image_extensions_enabled": False,
            "tweetypie_unmention_optimization_enabled": True,
            "vibe_api_enabled": True,
            "responsive_web_edit_tweet_api_enabled": True,
            "graphql_is_translatable_rweb_tweet_is_translatable_enabled": True,
            "view_counts_everywhere_api_enabled": True,
            "longform_notetweets_consumption_enabled": True,
            "tweet_awards_web_tipping_enabled": False,
            "freedom_of_speech_not_reach_fetch_enabled": False,
            "standardized_nudges_misinfo": True,
            "tweet_with_visibility_results_prefer_gql_limited_actions_policy_enabled": False,
            "interactive_text_enabled": True,
            "responsive_web_text_conversations_enabled": False,
            "longform_notetweets_richtext_consumption_enabled": False,
            "responsive_web_enhance_cards_enabled": False,
        }
        self.base_headers = {
            "authority": "twitter.com",
            "accept-language": "zh-CN,zh;q=0.9",
            "authorization": "Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA",
            "content-type": "application/json",
            "x-twitter-client-language": "zh-cn",
            "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36",
            "referer": f"https://twitter.com/{self.user_name}"
        }
        self.proxies = {}
        self.session = requests.session()
        self.refreshToken()
        self.query_id = getApiQueryId(self.session, "UserTweets", self.proxies)
        self.next_cursor = None
        self.data = None
        self.user_profile = None
        self.res_error_info = None

    def refreshToken(self):
        self.proxies = Proxy().getProxies()
        self.x_guest_token, self.cookie = getGuestToken(self.session, self.proxies)

    def crawl(self) -> None:
        if self.next_cursor:
            self.variables.update({"cursor": self.next_cursor})
        self.url = f'https://twitter.com/i/api/graphql/{self.query_id}/UserTweets?variables={json.dumps(self.variables).replace("True","True").replace("False","False")}&features={json.dumps(self.features).replace("True","True").replace("False","False")}'
        self.base_headers.update(
            {
                "path": self.url.replace("https://twitter.com",""),
                "cookie": self.cookie,
                "x-guest-token": self.x_guest_token,
            }
        )
        res = self.session.get(
            self.url, headers=self.base_headers, proxies=self.proxies
        )
        self.cookie = "; ".join([f"{key}={value}" for key, value in self.session.cookies.get_dict().items()])
        data = jsonpath(res.json(), "$..entries")
        if data:
            if self.next_cursor == 0:
                self.user_profile = data[0][0]["content"]["itemContent"][
                    "tweet_results"
                ]["result"]["core"]["user_results"]["result"]
                self.user_profile.update({"crawl_time": int(time.time())})
            if len(data[0]) < 40:
                self.next_cursor = None
            else:
                self.next_cursor = data[0][-1]["content"]["value"]
                print(self.next_cursor)
            self.data = self._rebuild(data[0][:-2], int(time.time()))
        else:
            self.res_error_info = res.text
            print(self.res_error_info)
            raise

    def _rebuild(self, data: list, crawl_time: int) -> list:
        new_data = []
        for i in data:
            i["user_name"] = self.user_name
            i["crawl_time"] = crawl_time
            del i["content"]["itemContent"]["tweet_results"]["result"]["core"]
            new_data.append(i)
        return new_data


if __name__ == "__main__":
    a = Tweets()
    a.crawl()
    a.crawl()
    a.crawl()

