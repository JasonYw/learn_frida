import requests
import time
import hashlib
from Crypto.Cipher import AES
import base64
import random
import string
def gettime():
    return int(time.time())

def getmd5(plantext):
    m = hashlib.md5()
    m.update(plantext.encode('utf-8'))
    return m.hexdigest()

def get_aes(password):
    key='a3266bc937f6e301' 
    iv='b1e794f0a2bbf283'
    #4C196B29E085E57269FC151945F559B9
    cipher = AES.new(key.encode('utf8'), AES.MODE_CBC, iv.encode('utf8'))
    pad = lambda s: s + (16 - len(s) % 16) * chr(16 - len(s) % 16)
    data = pad(password)
    encryptedbytes = cipher.encrypt(data.encode('utf8'))
    return encryptedbytes.hex().upper()
    

def get_nonce():
    return ''.join(random.sample(string.ascii_letters + string.digits, 16))
    


def login_send():
    int_time = gettime()
    password = get_aes('0123456789abc')
    nonce = get_nonce()
    plantext = f"||71d0518d-09ae-33aa-9ddb-c9d9a37a0cb0|Pixel 2|Pixel 2|Android 10|Google|1080*1794|1||272854718|7244|||15801367777|{nonce}|{password}||147342235|{int_time}|7.2.4.4rmrbsecurity$#%sutf3d247a75d9c7c4"
    securitykey = getmd5(plantext)
    print(locals())
    data = {
        'city':'',
        'citycode':'',	
        'device':'71d0518d-09ae-33aa-9ddb-c9d9a37a0cb0',
        'device_model':'Pixel 2',
        'device_name':'Pixel 2',
        'device_os':'Android 10',
        'device_product':'Google',
        'device_size':'1080*1794',
        'device_type':'1',
        'district':'',
        'fake_id':'272854718',
        'interface_code':'7244',
        'latitude':'',	
        'longitude':'',	
        'mobile':'15801367777',
        'nonce':nonce,
        'password':password,
        'province':'',	
        'province_code':'147342235',
        'timestamp':int_time,
        'version':'7.2.4.4',
        'securitykey':securitykey,
    }
    print(data)
    header = {
        # 'Cookie': 'acw_tc="2760823516643324822624172e87c82214b4a37558f3825b268b2cdf297f91";$Path="/";$Domain="app.peopleapp.com"; SERVERID=f0c2519d15ca3b0cae13b80f9d03fb94|1664333883|1664333860',
        'User-Agent': 'Dalvik/2.1.0 (Linux; U; Android 10; Pixel 2 Build/QP1A.190711.019);DailyNewspaper/7.2.4.4',
        'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8',
        # 'Content-Length': '710',
        'Host': 'app.peopleapp.com',
    }
    url = 'https://app.peopleapp.com/Api/700/MineApi/login'
    response = requests.post(url,headers=header,data=data)
    print(response.text)





def get_content_list(page,refresh_ids):
    '''
        category_id
        1:热点
        2:锐评
        8:视频
        234:推荐
    '''
    int_time = gettime()
    refresh_time = gettime()
    nonce = get_nonce()
    show_num = '20'
    plantext = f"1|||71d0518d-09ae-33aa-9ddb-c9d9a37a0cb0|Pixel 2|Android 10|Google|1080*1794|1||272854718|0|1794|1080|7244|||{nonce}|{page}||151564383|{refresh_ids}|{refresh_time}|{show_num}|{int_time}||0|7.2.4.4rmrbsecurity$#%sutf3d247a75d9c7c4"
    securitykey = getmd5(plantext)
    data ={
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
        'id':'0',
        'image_height':'1794',
        'image_wide':'1080',
        'interface_code':'7244',
        'latitude':'',
        'longitude':'',
        'nonce':nonce,
        'page':page,
        'province':'',
        'province_code':'151564383',
        'refresh_ids':refresh_ids,
        'refresh_time':refresh_time,
        'show_num':show_num,
        'timestamp':int_time,
        'userId':'',
        'user_gov_id':'0',
        'version':'7.2.4.4',
        'securitykey':securitykey
    }
    header = {
        # 'Cookie': 'acw_tc="2760823516643324822624172e87c82214b4a37558f3825b268b2cdf297f91";$Path="/";$Domain="app.peopleapp.com"; SERVERID=f0c2519d15ca3b0cae13b80f9d03fb94|1664333883|1664333860',
        'User-Agent': 'Dalvik/2.1.0 (Linux; U; Android 10; Pixel 2 Build/QP1A.190711.019);DailyNewspaper/7.2.4.4',
        'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8',
        # 'Content-Length': '710',
        'Host': 'app.peopleapp.com',
    }
    url = 'https://app.peopleapp.com/Api/700/HomeApi/getContentList'
    response = requests.post(url,headers=header,data=data)
    f = open(f'util{page}.log','w')
    f.write(response.text)
    # print(response.text)

if __name__ == "__main__":
    get_content_list('0','')


 