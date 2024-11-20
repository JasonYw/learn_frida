import requests
import execjs


headers = {
    "accept": "application/json, text/plain, */*",
    "accept-language": "zh-CN,zh;q=0.9,en;q=0.8",
    "cache-control": "no-cache",
    "cookie": "ttwid=1%7C7k4Ep6ZCkfypc-yWDrQKiXXJfoD7RyDYvEeOgnNgUJk%7C1705051675%7C366fd8b0e2b5f25e9adaa72ca33ac6133859391b8d4847829709ad057dc4b410; bd_ticket_guard_client_web_domain=2; xgplayer_user_id=353435085996; odin_tt=ccb198296c060d658bd60297055af71d0ab74148b78686064e15373b23a9756db8a7a5c457fe2899fc52ba4bb173bf662accc96ae8048f7087381a2a7bfd20dc0b577e259208838f921814744c92f061; s_v_web_id=verify_lwh7v0x5_2UU5HJR7_efWE_41Ff_BnCQ_cs7u5GSfDYS4; SEARCH_RESULT_LIST_TYPE=%22single%22; douyin.com; device_web_cpu_core=4; device_web_memory_size=8; architecture=amd64; dy_swidth=1920; dy_sheight=1080; csrf_session_id=31e0915b99adb633435c854269092107; FORCE_LOGIN=%7B%22videoConsumedRemainSeconds%22%3A180%7D; volume_info=%7B%22isUserMute%22%3Afalse%2C%22isMute%22%3Atrue%2C%22volume%22%3A0.7%7D; stream_player_status_params=%22%7B%5C%22is_auto_play%5C%22%3A0%2C%5C%22is_full_screen%5C%22%3A0%2C%5C%22is_full_webscreen%5C%22%3A0%2C%5C%22is_mute%5C%22%3A1%2C%5C%22is_speed%5C%22%3A1%2C%5C%22is_visible%5C%22%3A1%7D%22; passport_csrf_token=70af7e11afe64a292fd736b528b7b8f7; passport_csrf_token_default=70af7e11afe64a292fd736b528b7b8f7; xg_device_score=6.979237670192787; download_guide=%223%2F20240613%2F0%22; strategyABtestKey=%221718329974.027%22; __ac_signature=_02B4Z6wo00f01Sl6KqgAAIDAB.3ngVkuoY0pWi4AACw4V00GRNbdlx-ht.pAMDix6BROQTI2E6wqKZv10qFIpnjUEs17wqrhdqx.pq4bsSNzXd9Xjn3JBFlXsyuxG7Doy3JBmmIbUklWCqXsb9; stream_recommend_feed_params=%22%7B%5C%22cookie_enabled%5C%22%3Atrue%2C%5C%22screen_width%5C%22%3A1920%2C%5C%22screen_height%5C%22%3A1080%2C%5C%22browser_online%5C%22%3Atrue%2C%5C%22cpu_core_num%5C%22%3A4%2C%5C%22device_memory%5C%22%3A8%2C%5C%22downlink%5C%22%3A10%2C%5C%22effective_type%5C%22%3A%5C%224g%5C%22%2C%5C%22round_trip_time%5C%22%3A150%7D%22; home_can_add_dy_2_desktop=%221%22; bd_ticket_guard_client_data=eyJiZC10aWNrZXQtZ3VhcmQtdmVyc2lvbiI6MiwiYmQtdGlja2V0LWd1YXJkLWl0ZXJhdGlvbi12ZXJzaW9uIjoxLCJiZC10aWNrZXQtZ3VhcmQtcmVlLXB1YmxpYy1rZXkiOiJCR2xucjRPL29aVnFTZjduR1U3YzdVWC84ZXpxQ21IZzZaQmw5Wjk1czFWSjBhUlZ4dHNhMDRSSS80ZWk0YWtTZWdBbmphRGdGVFI5bTVaaDZlZVhCTnM9IiwiYmQtdGlja2V0LWd1YXJkLXdlYi12ZXJzaW9uIjoxfQ%3D%3D; WallpaperGuide=%7B%22showTime%22%3A1718346800928%2C%22closeTime%22%3A0%2C%22showCount%22%3A1%2C%22cursor1%22%3A7%2C%22cursor2%22%3A0%7D; pwa2=%220%7C0%7C3%7C0%22; __ac_nonce=0666bedf4001df919a644; msToken=AFUeDsd0Tpb-LQJe08kEu_8VIXVoMPB7i3QXzZw598vJ9tYl3BzpI6G4-WGHhdAE9ZVDEH8vVQkQWayENi_GxAB6khSrewAXffH46r5q8_OG20CYWg==; IsDouyinActive=true",
    "pragma": "no-cache",
    "priority": "u=1, i",
    "referer": "https://www.douyin.com/user/MS4wLjABAAAA_py8TGmFe6t8KDY04LU0JH9Yr9ml54dCjRFi0mc1lwI?showTab=post",
    "sec-ch-ua": '"Google Chrome";v="125", "Chromium";v="125", "Not.A/Brand";v="24"',
    "sec-ch-ua-mobile": "?0",
    "sec-ch-ua-platform": '"Windows"',
    "sec-fetch-dest": "empty",
    "sec-fetch-mode": "cors",
    "sec-fetch-site": "same-origin",
    "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36",
}

# device_platform=webapp&aid=6383&channel=channel_pc_web&sec_user_id=MS4wLjABAAAA_py8TGmFe6t8KDY04LU0JH9Yr9ml54dCjRFi0mc1lwI&max_cursor=0&locate_query=false&show_live_replay_strategy=1&need_time_list=1&time_list_query=0&whale_cut_token=&cut_version=1&count=18&publish_video_strategy_type=2&update_version_code=170400&pc_client_type=1&version_code=290100&version_name=29.1.0&cookie_enabled=true&screen_width=1920&screen_height=1080&browser_language=zh-CN&browser_platform=Win32&browser_name=Chrome&browser_version=125.0.0.0&browser_online=true&engine_name=Blink&engine_version=125.0.0.0&os_name=Windows&os_version=10&cpu_core_num=4&device_memory=8&platform=PC&downlink=10&effective_type=4g&round_trip_time=150&webid=7323141122875213323&msToken=GviXb5NSGJLWgp8lV-gLvBm0wVv1uMbxFJSKtY55aWYIrsmru9RtKeUuKU1R-8LlUMbE9H__9_dfUhNervGiWn7UzguvNJYAzV_eXIFsOvRHWP92BQ%3D%3D&
# device_platform=webapp
# &aid=6383&channel=channel_pc_web&
# sec_user_id=MS4wLjABAAAA_py8TGmFe6t8KDY04LU0JH9Yr9ml54dCjRFi0mc1lwI
# &req_from=channel_pc_web&cursor=0&count=6&update_version_code=170400&pc_client_type=1&version_code=170400&version_name=17.4.0
# &cookie_enabled=true&screen_width=1920&screen_height=1080&browser_language=zh-CN
# &browser_platform=Win32&browser_name=Chrome&browser_version=125.0.0.0
# &browser_online=true&engine_name=Blink&engine_version=125.0.0.0&os_name=Windows&os_version=10&cpu_core_num=4&device_memory=8
# &platform=PC&downlink=10&effective_type=4g&round_trip_time=150&webid=7323141122875213323
# &msToken=geQ8iSh7W8tfXxp_cY_dUMlOJpNiLNqX07f7-REaMFuqS1aaQmuijZEIGEKYTvg8knJ101CtpspD1z5M2XZsIX5DseQc6on3qyLWPCXCEc1wUyxDSQ%3D%3D
# &msToken=geQ8iSh7W8tfXxp_cY_dUMlOJpNiLNqX07f7-REaMFuqS1aaQmuijZEIGEKYTvg8knJ101CtpspD1z5M2XZsIX5DseQc6on3qyLWPCXCEc1wUyxDSQ%3D%3D",

params = {
    "device_platform": "webapp",
    "aid": "6383",
    "channel": "channel_pc_web",
    "sec_user_id": "MS4wLjABAAAA_py8TGmFe6t8KDY04LU0JH9Yr9ml54dCjRFi0mc1lwI",
    "max_cursor": "0",
    "locate_query": "false",
    "show_live_replay_strategy": "1",
    "need_time_list": "1",
    "time_list_query": "0",
    "whale_cut_token": "",
    "cut_version": "1",
    "count": "18",
    "publish_video_strategy_type": "2",
    "update_version_code": "170400",
    "pc_client_type": "1",
    "version_code": "290100",
    "version_name": "29.1.0",
    "cookie_enabled": "true",
    "screen_width": "1920",
    "screen_height": "1080",
    "browser_language": "zh-CN",
    "browser_platform": "Win32",
    "browser_name": "Chrome",
    "browser_version": "125.0.0.0",
    "browser_online": "true",
    "engine_name": "Blink",
    "engine_version": "125.0.0.0",
    "os_name": "Windows",
    "os_version": "10",
    "cpu_core_num": "4",
    "device_memory": "8",
    "platform": "PC",
    "downlink": "10",
    "effective_type": "4g",
    "round_trip_time": "150",
    "webid": "7323141122875213323",
    "msToken": "GviXb5NSGJLWgp8lV-gLvBm0wVv1uMbxFJSKtY55aWYIrsmru9RtKeUuKU1R-8LlUMbE9H__9_dfUhNervGiWn7UzguvNJYAzV_eXIFsOvRHWP92BQ==",
    "a_bogus": "Ef8M/Q0kdkVPfd6k542LfY3qVIl3Yded0SVkMDhernfd9639HMYw9exEw7zvMIueZsQDIeujy4hbO3xprQCJMZwf7Wsx/2CZsg00t-P2so0j53intL6mE0hN5kb3SaBB5vrlrPw8yyOcSYEh09FeQflsChKwuIE4Qj==",
    "verifyFp": "verify_lwh7v0x5_2UU5HJR7_efWE_41Ff_BnCQ_cs7u5GSfDYS4",
    "fp": "verify_lwh7v0x5_2UU5HJR7_efWE_41Ff_BnCQ_cs7u5GSfDYS4",
}

res = response = requests.get(
    "https://www.douyin.com/aweme/v1/web/aweme/post/", params=params, headers=headers
)
print(res.text)
