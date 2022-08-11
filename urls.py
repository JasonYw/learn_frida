url = 'https://aweme.snssdk.com/aweme/v1/search/item/?iid=1412242872480222&device_id=4033478531512360&ac=wifi&channel=sem_shenma_dy_ls077&aid=1128&app_name=aweme&version_code=210500&version_name=21.5.0&device_platform=android&os=android&ssmix=a&device_type=Pixel+2&device_brand=google&language=zh&os_api=27&os_version=8.1.0&openudid=103464fba0335b6a&manifest_version_code=210501&resolution=1080*1794&dpi=420&update_version_code=21509900&_rticket=1660030885390&package=com.ss.android.ugc.aweme&cpu_support64=true&host_abi=armeabi-v7a&is_guest_mode=0&app_type=normal&minor_status=0&appTheme=light&need_personal_recommend=1&is_android_pad=0&ts=1660030869&cdid=16a4dd61-52b0-4057-8a6e-2ae40809efc3'
header = {
    # 'access-control-expose-headers': 'tt-idc-switch', 
    'content-type': 'application/json; charset=utf-8', 
    # 'tt-idc-switch': '10000@20220804174749', 
    'tt_stable': '1', 
    # 'x-net-info.remoteaddr': '220.243.131.99:443', 
    'x-tt-logid': '2022080915411801014203803827F6AF0F', 
    'x-tt-trace-host': '01115b38b7cbbfcf830c62564dce8549ff80217f9785177bdc81e1ebc782dc079dc85d650f75343764f5d50985d500297ae3a1f1fc28255e283f6104f7d49e8af3ca52d910f304c5b8804bc5bc1c92da7d43955a2d53c03b51d972c537a72f393d', 
    'x-tt-trace-id': '00-818d1f980de546d671478288a6870468-818d1f980de546d6-01', 
    # 'x-tt-trace-tag': 'id=00;cdn-cache=miss'
}

import requests
res = requests.post(url,headers=header)
print(res.text)