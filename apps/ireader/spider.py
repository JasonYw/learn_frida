import os
import requests
import time
import json
import urllib
import zipfile
from lxml import etree
session = requests.session()
USR = None


def bytesToString(data):
    plain = []
    for i in data:
        if i < 0:
            plain.append(i+256)
        else:
            plain.append(i)
    print(plain)
    print(bytearray(plain).decode())
        


def jsonToUrl(params_dict):
    params = ''
    for k in params_dict:
        params = params + f'{k}={params_dict[k]}&'
    params = params.strip('&')
    return params

def login(username, password):
    res = list(map(lambda x: x.replace("\n", ""), os.popen(
        f"iReaderSign.exe login C:\\Users\\rico\Desktop\\apk\\com.chaozh.iReaderFree.apk {username} {password}").readlines()))
    json_ = {
        "channel_id": "108045",
        "is_mergeme": "1",
        "encrypt_method": "1",
        "device": "Pixel 2",
        "version_id": "17490003",
        "ver": "1.0",
        "data": res[0],
        "imei": "__39827dd5eb14217a",
        "sign": res[2],
        "timestamp": res[1],
        "user_name": "17600539891",
    }
    url = "https://uc.ireader.com/user/slogin/passwd/v2?zyeid=6f511bea4bf9427ab88b137637dab7c4&usr=i4413417392&rgt=7&p1=ffffffffffffffffffffffff&pc=10&p2=108045&p3=17490003&p4=501603&p5=19&p7=__39827dd5eb14217a&p9=2&p16=Pixel+2&p21=31303&p22=10&p25=74901&p28=&p29=zye5b814&p30=&p31=__39827dd5eb14217a&p33=com.chaozh.iReaderFree&p34=google"
    header = {
        "Content-Type": "application/x-www-form-urlencoded",
        "Host": "uc.ireader.com",
        "User-Agent": "okhttp/3.11.0",

    }
    res = session.post(url=url, headers=header, data=json_)
    global USR
    USR = res.json()['body']['name']
    print(USR)

def getBookList(categoryId=1592):
    '''
        分类
    '''
    params_dict = {
        'usr': USR,
        'sign': 'H3Fn3x5dQna454p4wyovqhcUjb8T3aFV2CDwCJKXINOjp6wWpvj6VE6rjzgthbuoxKwnUZ3j+TRGDoluZ567AjDNAeLcP4zZlIVaZ5LTT4fTUdGHTGHqvwFLxAzXXAWWMW13Q3lK3bkg+RCsvGfsiWi6nHutAVR9QeMW8qNiLFU=',
        'categoryId': '1592',
        'timestamp': str(round(time.time(), 3)).replace(".", ""),
        'resourcesId': '56',
        'categoryType': 'women',
        'page': '1',
        'pageSize': '15',
        'styleType': '1',
        'filterInfo': '{"1":"","2":"","4":""}',
        'order': '1',
        'needAll': '1',
        'pluginVersion': '391',
        'a0': 'null',
        'pk': 'null',
        'today': '0',
        'zysid': '887cf6ce3998fa583cb171faa9d214bf',
        'usr': USR,
        'rgt': '7',
        'p1': 'fffffffffffffffffffffff',
        'pc': '10',
        'p2': '108045',
        'p3': '17490003',
        'p4': '501603',
        'p5': '19',
        'p7': '__39827dd5eb14217a',
        'p9': '2',
        'p16': 'Pixel 2',
        'p21': '31303',
        'p22': '10',
        'p25': '74901',
        'p28': '',
        'p29': 'zye5b814',
        'p30': '',
        'p31': '__39827dd5eb14217a',
        'p33': 'com.chaozh.iReaderFree',
        'p34': 'google',
    }
    header = {
        'Content-Type': 'application/json; charset=utf-8'
    }
    res = os.popen(
        f'iReaderSign.exe sign C:\\Users\\rico\Desktop\\apk\\com.chaozh.iReaderFree.apk categoryId={categoryId}"&"timestamp={params_dict["timestamp"]}"&"usr={USR}').read().strip('\n')
    params_dict.update({'sign': res})
    url = f'https://ah2.zhangyue.com/zybk/api/categoryNew/index?{jsonToUrl(params_dict)}'
    res = session.get(url, headers=header)
    print(res.json())


def getBookInfo(bid):
    '''
        图书详情
    '''
    params_dict ={
        'bid':bid,
        'style':'3',
        'pluginVersion':'164',
        'zysid':'887cf6ce3998fa583cb171faa9d214bf',
        'usr':USR,
        'rgt':'7',
        'p1':'ffffffffffffffffffffffff',
        'pc':'10',
        'p2':'108045',
        'p3':'17490003',
        'p4':'501603',
        'p5':'19',
        'p7':'__39827dd5eb14217a',
        'p9':'2',
        'p16':'Pixel 2',
        'p21':'31303',
        'p22':'10',
        'p25':'74901',
        'p28':'',
        'p29':'zye5b814',
        'p30':'',
        'p31':'__39827dd5eb14217a',
        'p33':'com.chaozh.iReaderFree',
        'p34':'google'
    }
    url =  f'https://ah2.zhangyue.com/zybk/api/detail/index?{jsonToUrl(params_dict)}'
    header = {
        'Content-Type': 'application/json; charset=utf-8'
    }
    res = session.get(url, headers=header)
    DownloadUrl = res.json()['body']['buttonInfo']['cmd']['Data']['DownloadInfo']['DownloadUrl']
    params_dict ={
        'epubversion':'2',
        'bookId':bid,
        'zysid':'887cf6ce3998fa583cb171faa9d214bf',
        'usr':USR,
        'rgt':'7',
        'p1':'ffffffffffffffffffffffff',
        'pc':'10',
        'p2':'108045',
        'p3':'17490003',
        'p4':'501603',
        'p5':'19',
        'p7':'__39827dd5eb14217a',
        'p9':'2',
        'p16':'Pixel 2',
        'p21':'31303',
        'p22':'10',
        'p25':'74901',
        'p28':'',
        'p29':'zye5b814',
        'p30':'',
        'p31':'__39827dd5eb14217a',
        'p33':'com.chaozh.iReaderFree',
        'p34':'google'
    }
    url =  f'https://ah2.zhangyue.com/r/book_pre_url?{jsonToUrl(params_dict)}'
    header = {
        'Range':'bytes=0-',
        'Host':'ah2.zhangyue.com',
        'User-Agent':'okhttp/3.11.0',
        'Connection':'Keep-alive',
    }
      #https://serial.d.ireader.com/group1/M00/99/5B/wKgHhVk0zqqEXLEhAAAAACetYQA94379845.ezip?v=3o_z25zO&t=CmQVd2FfpmQ.
    res = session.get(url, headers=header,allow_redirects=True)
    book_ezip_url = res.url



def parseEpbu(book_id=11286072):
    '''
        处理epub
    '''
    params_dict ={
        'epubversion':'2',
        'bookId':book_id,
        'zysid':'887cf6ce3998fa583cb171faa9d214bf',
        'usr':USR,
        'rgt':'7',
        'p1':'ffffffffffffffffffffffff',
        'pc':'10',
        'p2':'108045',
        'p3':'17490003',
        'p4':'501603',
        'p5':'19',
        'p7':'__39827dd5eb14217a',
        'p9':'2',
        'p16':'Pixel 2',
        'p21':'31303',
        'p22':'10',
        'p25':'74901',
        'p28':'',
        'p29':'zye5b814',
        'p30':'',
        'p31':'__39827dd5eb14217a',
        'p33':'com.chaozh.iReaderFree',
        'p34':'google'
    }
    url =  f'https://ah2.zhangyue.com/r/book_pre_url?{jsonToUrl(params_dict)}'
    header = {
        'Range':'bytes=0-',
        'Host':'ah2.zhangyue.com',
        'User-Agent':'okhttp/3.11.0',
        'Connection':'Keep-alive',
    }
      #https://serial.d.ireader.com/group1/M00/99/5B/wKgHhVk0zqqEXLEhAAAAACetYQA94379845.ezip?v=3o_z25zO&t=CmQVd2FfpmQ.
    res = session.get(url, headers=header,allow_redirects=True)
    book_ezip_url = res.url
    print(book_ezip_url)


if __name__ == '__main__':
    # login("17600539891","a0123456789")
    # getBookList()
    # getBookInfo(11286072)
    # parseEpbu()

    bytesToString([55,20,71,-92,-23,51,-94,31,113,-4,-67,-127,56,16,43,42,115,-88,-91,-6,-62,124,3,-104,84,48,112,66,56,5,-62,62,10,-49,-96,12,-105,-114,-87,12,107,-91,-97,-29,85,45,-42,66,-18,53,107,-50,75,27,115,-1,18,46,-80,-82,24,49,-100,16,51,-74,-88,86,27,-113,115,95,-95,-16,-63,-122,39,-26,-103,83,52,121,-49,-37,65,-15,-70,-18,-32,-92,-34,45,-26,-9,60,30,-19,-100,-64,-100,53,-100,87,123,28,-35,-8,-103,-90,-34,-5,108,41,67,-45,78,-14,74,17,-36,-115,-121,-120,7,-19,-45,39,-105])
