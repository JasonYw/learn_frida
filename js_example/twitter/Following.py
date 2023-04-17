import json
import requests
from Proxy import Proxy
import re
import urllib
from jsonpath import jsonpath
import time


class Following:
    def __init__(
        self, user_id: str = "44196397", user_name: str = "elonmusk", cookie: str = None
    ) -> None:
        self.user_id = user_id
        self.user_name = user_name
        self.variables = {
            "userId": user_id,
            "count": 20,
            "includePromotedContent": False,
            "withDownvotePerspective": False,
            "withReactionsMetadata": False,
            "withReactionsPerspective": False,
        }
        self.features = {
            "blue_business_profile_image_shape_enabled": False,
            # "responsive_web_twitter_blue_verified_badge_is_enabled": True,
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
        self.features = urllib.parse.quote(
            f'{json.dumps(self.features).replace("True","true").replace("False","false").replace(" ","")}'
        )
        self.base_headers = {
            "authority": "twitter.com",
            "accept-language": "zh-CN,zh;q=0.9",
            "authorization": "Bearer AAAAAAAAAAAAAAAAAAAAANRILgAAAAAAnNwIzUejRCOuH5E6I8xnZz4puTs%3D1Zv7ttfk8LF81IUq16cHjhLTvJu4FA33AGWWjCpTnA",
            "content-type": "application/json",
            "x-twitter-auth-type": "OAuth2Session",
            "x-twitter-client-language": "zh-cn",
            "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36",
        }
        self.cookie = cookie
        self.proxies = {}
        self.session = requests.session()
        self.query_id = (
            "0C6NEkU0H0sw5Eyr6DBDfg"  # getApiQueryId("Following", self.session)
        )
        self.next_cursor = None
        self.following_data = None
        self.profile_data = None

    def refreshProxies(self):
        self.proxies = Proxy().getProxies()

    def crawl(self):
        if self.next_cursor:
            self.variables.update({"cursor": self.next_cursor})
        variables = urllib.parse.quote(
            f'{json.dumps(self.variables).replace("True","true").replace("False","false").replace(" ","")}'
        )
        self.url = f"https://twitter.com/i/api/graphql/{self.query_id}/Following?variables={variables}&features={self.features}"
        self.base_headers.update(
            {
                "cookie": self.cookie,
                "x-csrf-token": re.findall(r"ct0=(.+?);", self.cookie)[0],
            }
        )
        res = self.session.get(
            self.url, headers=self.base_headers, proxies=self.proxies
        )
        # open("following_data.json", "wb").write(res.content)
        data = jsonpath(res.json(), "$..entries")
        if data:
            self.next_cursor = data[0][-2]["content"]["value"]
            self.profile_data, self.following_data, rebuild_error = self._rebuild(
                data[0][:-2], int(time.time())
            )
            if rebuild_error:
                raise ValueError("rebuild_error :" + ",".join(rebuild_error))
        else:
            # open("following_data_error.json", "wb").write(res.content)
            raise ValueError(f"no following found and res text -> {res.text}")

    def _rebuild(self, data: list, crawl_time: int) -> list:
        following_data = []
        error_data = []
        profile_data = []
        for i in data:
            try:
                profile = i["content"]["itemContent"]["user_results"]["result"]
                profile["update_time"] = crawl_time
                profile["user_id"] = profile["rest_id"]
                profile_data.append(profile)
                following_data.append(
                    {
                        "user_id": profile["user_id"],
                        "update_time": crawl_time,
                        "user_name": profile["legacy"]["screen_name"],
                    }
                )
            except Exception as e:
                error_message = f'{i["entryId"]}:{e}'
                error_data.append(error_message)
        return profile_data, following_data, error_data
