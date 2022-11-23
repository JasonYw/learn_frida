import os
import requests
import time
import json
import urllib
import zipfile
from lxml import etree
session = requests.session()
USR = None

def jsonToUrl(params_dict):
    params = ''
    for k in sorted(params_dict):
        params = params + f'{k}={params_dict[k]}&'
    params = params.strip('&')
    return params


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
    # https://ah2.zhangyue.com/zybk/api/detail/index?bid=12335723&style=3&pluginVersion=164&zysid=887cf6ce3998fa583cb171faa9d214bf&usr=i4413417392&rgt=7&p1=ffffffffffffffffffffffff&pc=10&p2=108045&p3=17490003&p4=501603&p5=19&p7=__39827dd5eb14217a&p9=2&p16=Pixel+2&p21=31303&p22=10&p25=74901&p28=&p29=zye5b814&p30=&p31=__39827dd5eb14217a&p33=com.chaozh.iReaderFree&p34=google
    url =  f'https://ah2.zhangyue.com/zybk/api/detail/index?{jsonToUrl(params_dict)}'
    header = {
        'Content-Type': 'application/json; charset=utf-8'
    }
    res = session.get(url, headers=header)
    print(res.json())

def parseEpbu(fname ='C:\\Users\\rico\\Downloads\\wKgHhVjfmOiENDljAAAAAFKHtw090503188.epub'):
    # ns = {
    #     'n':'urn:oasis:names:tc:opendocument:xmlns:container',
    #     'pkg':'http://www.idpf.org/2007/opf',
    #     'dc':'http://purl.org/dc/elements/1.1/'
    # }
    # prepare to read from the .epub file
    zip = zipfile.ZipFile(fname)
    # find the contents metafile
    txt = zip.read('META-INF/container.xml')
    tree = etree.fromstring(txt)
    # cfname = tree.xpath('n:rootfiles/n:rootfile/@full-path',namespaces=ns)[0]
    # # grab the metadata block from the contents metafile
    # cf = zip.read(cfname)
    # tree = etree.fromstring(cf)
    # p = tree.xpath('/pkg:package/pkg:metadata',namespaces=ns)[0]
    # repackage the data
    # res = {}
    # for s in ['title','language','creator','date','identifier']:
    #     res[s] = p.xpath('dc:%s/text()'%(s),namespaces=ns)[0]
    print(txt,tree)

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
    USR = res.json()['body']['name']


if __name__ == '__main__':
    # login("17600539891","a0123456789")
    # getBookList()
    # getBookInfo(11286072)
    parseEpbu()
