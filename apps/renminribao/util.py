# appkey = '585e2e0e7666137e67000274'
# time = '1663899022693'
# random = '11'

# appkey_re = ''.join(reversed(appkey))
# print(appkey_re)


import requests
data = {
    'category_id':'1',
    'city':'',
    'citycode':'',
    'device':'71d0518d-09ae-33aa-9ddb-c9d9a37a0cb0',
    'device_model':'Pixel 2',
    'device_os':'Android 10',
    'device_product':'Google',
    'device_size':'1080*1794',
    'device_type':'1',
    'district':'',
    'fake_id':'272854718',
    'id':'6878229',
    'image_height':'1794',
    'image_wide':'1080',
    'interface_code':'7244',
    'latitude':'',	
    'longitude':'',
    'nonce':'YhZptadvsZm[xlcoc',
    'page':'4',
    'province':'',	
    'province_code':'69203651',
    'refresh_ids':'6878197,6878200,6878721,0,6878697,6877744,6878679,6878667,6878663,6878620,6878641,6878632,6878560,6878591,6878574,6878582,6878580,6878576,6877452,6877483,6878549',
    'refresh_time':'1664346154',
    'show_num':'20',
    'timestamp':'1664346154',#1664333883
    'userId':'',
    'ser_gov_id':'0',
    
}

header = {
    'Cookie': 'acw_tc="2760823516643324822624172e87c82214b4a37558f3825b268b2cdf297f91";$Path="/";$Domain="app.peopleapp.com"; SERVERID=f0c2519d15ca3b0cae13b80f9d03fb94|1664333883|1664333860',
    'User-Agent': 'Dalvik/2.1.0 (Linux; U; Android 10; Pixel 2 Build/QP1A.190711.019);DailyNewspaper/7.2.4.4',
    'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8',
    # 'Content-Length': '710',
    'Host': 'app.peopleapp.com',
}

url = 'https://app.peopleapp.com/Api/700/HomeApi/getContentList'


response = requests.post(url,headers=header,data=data)

print(response.text)
 