from Crypto.Cipher import AES
import base64
import requests
import os
from fspider import utils
session =requests.session()
file_path = os.path.dirname(os.path.realpath(__file__))
apk_path =f'{file_path}\\qimaomianfeixiaoshuo.apk'
exe_path =f'{file_path}\\qmSign.exe'


def getBookList(page=1000):
    '''
        com.km.encryption.api.Security
    '''
    text = f'book_privacy=1new_user=1page_no={page}read_preference=0uid=8EE0AA7F8CD5'
    hedaer_text = 'AUTHORIZATION=app-version=71005application-id=com.kmxs.readerchannel=qm-wy2yd058_wmis-white=1net-env=1platform=androidqm-params=cLGeuyoMmqN6OlNDOzf5A5HwtTFUH5w5uCR1paHWHT9wgI9wgI9wthgYgT9QAI-MAaMwgI9wth9wgI9wgI9wgI9wgaHjHzk2uz2Tp3U1paHWHTHwgTHnghHrghfnAI9npzG5NINzgzHMpzHlpTfENyfrgzG-gTHe4eFw4hgrNz0wgqfe4es-gqflpyR2NI4lH5w5BqoTHTZ5A0fWkh9WFf0WNM4WA0gWkIf5taGeBERL4lRUmqF5A5HrkffwFf0EkTxIkIf5taGecCgQuzRLHTZ5gh95taGMOSReuyR-tq2-HTZ5koRDpCk6BU2huRp6302oOyJFRl-wNlkvp0x6gI0YNlk2Rlfef-pqu214fzp5gqnfpopmp2NoB0pTke2kRTGvuMrLfSGmkqxzhfkoNfrLfznqg2RW4eGZg3HjHSsZBlY2tqn2uzRjHTZ5h3HjHz2Qpq-5A5H5taGQBlk2BaHWH2s1cyRjHIH5taGEByHQmqU2m3HWH5HjHSuj45UUmqF5A5HrkffwFf0EkTxIkIf5taGTBy22BSFQmqF5A5HYghgnph0l4e9wgepT4lgYH5w54SGxBzF5A5GSBlJSByf5taGD4q2-HTZ5HSM=reg='
    sign = os.popen(f'{exe_path} {apk_path} {text}').read().replace('\n','')
    header = {
        'method':'GET',
        'path':f'/api/v5/book-store/recommend-guess-more?page_no={page}&read_preference=0&book_privacy=1&uid=8EE0AA7F8CD5&new_user=1&sign={sign}',
        'authority':'api-bc.wtzw.com',
        'scheme':'https',
        'net-env':'1',
        'channel':'qm-wy2yd058_wm',
        'is-white':'1',
        'platform':'android',
        'app-version':'71005',
        'reg':'',
        'application-id':'com.kmxs.reader',
        'authorization':'',
        'qm-params':'cLGeuyoMmqN6OlNDOzf5A5HwtTFUH5w5uCR1paHWHT9wgI9wgI9wthgYgT9QAI-MAaMwgI9wth9wgI9wgI9wgI9wgaHjHzk2uz2Tp3U1paHWHTHwgTHnghHrghfnAI9npzG5NINzgzHMpzHlpTfENyfrgzG-gTHe4eFw4hgrNz0wgqfe4es-gqflpyR2NI4lH5w5BqoTHTZ5A0fWkh9WFf0WNM4WA0gWkIf5taGeBERL4lRUmqF5A5HrkffwFf0EkTxIkIf5taGecCgQuzRLHTZ5gh95taGMOSReuyR-tq2-HTZ5koRDpCk6BU2huRp6302oOyJFRl-wNlkvp0x6gI0YNlk2Rlfef-pqu214fzp5gqnfpopmp2NoB0pTke2kRTGvuMrLfSGmkqxzhfkoNfrLfznqg2RW4eGZg3HjHSsZBlY2tqn2uzRjHTZ5h3HjHz2Qpq-5A5H5taGQBlk2BaHWH2s1cyRjHIH5taGEByHQmqU2m3HWH5HjHSuj45UUmqF5A5HrkffwFf0EkTxIkIf5taGTBy22BSFQmqF5A5HYghgnph0l4e9wgepT4lgYH5w54SGxBzF5A5GSBlJSByf5taGD4q2-HTZ5HSM=',
        'sign': os.popen(f'{exe_path} {apk_path} {hedaer_text}').read().replace('\n',''),
        'qm-uaf':'20221130-411684881',
        'qm-ii':'1875337936',
        'qm-it':'1669619881',
        'no-permiss':'3',
        'user-agent':'webviewversion/0',
    }
    url  = f'https://api-bc.wtzw.com/api/v5/book-store/recommend-guess-more?page_no={page}&read_preference=0&book_privacy=1&uid=8EE0AA7F8CD5&new_user=1&sign={sign}'
    res = utils.send_req('GET',url,header)
    # res = session.get(url,headers=header)
    return res.json()['data']['list']
    
def getChapterList(book_id=103152):
    text = f"chapter_ver=0id={book_id}"
    sign = os.popen(f'{exe_path} {apk_path} {text}').read().replace('\n','')
    header = {
        'net-env':'1',
        'channel':'qm-wy2yd058_wm',
        'is-white':'1',
        'platform':'android',
        'app-version':'71005',
        'reg':'',
        'application-id':'com.kmxs.reader',
        'AUTHORIZATION':'eyJhbGciOiJSUzI1NiIsImNyaXQiOlsiaXNzIiwianRpIiwiaWF0IiwiZXhwIl0sImtpZCI6IjE1MzEyMDM3NjkiLCJ0eXAiOiJKV1QifQ.eyJleHAiOjE2NzEwODc0MjYsImlhdCI6MTY2OTc5MTQyNiwiaXNzIjoiaHR0cHM6Ly94aWFvc2h1by53dHp3LmNvbS9hcGkvdjEvbG9naW4vdG91cmlzdCIsImp0aSI6InRvdXJpc3QiLCJ1c2VyIjp7InVpZCI6NDExNjg0ODgxLCJuaWNrbmFtZSI6Iua4uOWuojExMjk1MzU2NTExMCIsImltZWkiOiIiLCJ1dWlkIjoiMDAwMDAwMDAtMzkyMC04OTQ4LTAwMDAtMDAwMDAwMDAwMDAwIiwiZGV2aWNlSWQiOiIyMDIyMTEyODE1MTgwMWZiYjQzZjJiNGZiNmY1NzRlODJiZDIyM2M0MGEzODZhMDFlM2MwZDFlNmRlZTQ2NiIsInJlZ1RpbWUiOjE2Njk3MTk1MjUsInZpcEV4cGlyZUF0IjowLCJzbV9pZCI6IjIwMjIxMTI4MTUxODAxZmJiNDNmMmI0ZmI2ZjU3NGU4MmJkMjIzYzQwYTM4NmEwMWUzYzBkMWU2ZGVlNDY2IiwibnV0IjowLCJpZnUiOjAsImlzX3JiZiI6MCwiYWN0X2lkIjowLCJiaW5kX2F0IjowLCJ0aWQiOiJEVW9ldF9vWVN1Vl9ISUVwb1BXaTA3ZGtkSF8wMTk3ZGVXZTNSRlZ2WlhSZmIxbFRkVlpmU0VsRmNHOVFWMmt3TjJSclpFaGZNREU1TjJSbFYyVXpjMmgxIiwidF9tb2RlIjoxfX0.GoWE23EZeSks7N2OLbQ0cHYR0rr9OHKWosqIePe8vwi72_pJk0hHj36Lw8ISnIcctSZ5JI8ZJ-iUlEO2gYPwhsbY3w4fH9Pg_LAezOrWcBalJ6d3C1d1t8rLgU3AK8VqUKqTata36-hzLIBYFfIY8yv2eUecdSyTKs1_b0zRjNA',
        'qm-params':'cLGeuyoMmqN6OlNDOzf5A5HwtTFUH5w5uCR1paHWHT9wgI9wgI9wthgYgT9QAI-MAaMwgI9wth9wgI9wgI9wgI9wgaHjHzk2uz2Tp3U1paHWHTHwgTHnghHrghfnAI9npzG5NINzgzHMpzHlpTfENyfrgzG-gTHe4eFw4hgrNz0wgqfe4es-gqflpyR2NI4lH5w5BqoTHTZ5A0fWkh9WFf0WNM4WA0gWkIf5taGeBERL4lRUmqF5A5HrkffwFf0EkTxIkIf5taGecCgQuzRLHTZ5gh95taGMOSReuyR-tq2-HTZ5koRDpCk6BU2huRp6302oOyJFRl-wNlkvp0x6gI0YNlk2Rlfef-pqu214fzp5gqnfpopmp2NoB0pTke2kRTGvuMrLfSGmkqxzhfkoNfrLfznqg2RW4eGZg3HjHSsZBlY2tqn2uzRjHTZ5h3HjHz2Qpq-5A5H5taGQBlk2BaHWH2s1cyRjHIH5taGEByHQmqU2m3HWH5HjHSuj45UUmqF5A5HrkffwFf0EkTxIkIf5taGTBy22BSFQmqF5A5HYghgnph0l4e9wgepT4lgYH5w54SGxBzF5A5GSBlJSByf5taGD4q2-HTZ5HSM=',
        'sign':'e33c9e9b613ff130c57ee839e300739c',
        'QM-uaf':'20221130-411684881',
        'QM-ii':'1875337936',
        'QM-it':'1669619881',
        'no-permiss':'3',
        'User-Agent':'webviewversion/0',
        'Host':'api-ks.wtzw.com'
    }
    url = f'https://api-ks.wtzw.com/api/v1/chapter/chapter-list?chapter_ver=0&id={book_id}&sign={sign}'
    # res = session.get(url,headers=header)
    res = utils.send_req('GET',url,header)
    return res.json()['data']['chapter_lists']

def getContent(book_id=103152,chapter_id=26520):
    text = f"chapterId={chapter_id}id={book_id}"
    sign = os.popen(f'{exe_path} {apk_path} {text}').read().replace('\n','')
    header = {
        'net-env':'1',
        'channel':'qm-wy2yd058_wm',
        'is-white':'1',
        'platform':'android',
        'app-version':'71005',
        'reg':'',
        'application-id':'com.kmxs.reader',
        'AUTHORIZATION':'eyJhbGciOiJSUzI1NiIsImNyaXQiOlsiaXNzIiwianRpIiwiaWF0IiwiZXhwIl0sImtpZCI6IjE1MzEyMDM3NjkiLCJ0eXAiOiJKV1QifQ.eyJleHAiOjE2NzEwODc0MjYsImlhdCI6MTY2OTc5MTQyNiwiaXNzIjoiaHR0cHM6Ly94aWFvc2h1by53dHp3LmNvbS9hcGkvdjEvbG9naW4vdG91cmlzdCIsImp0aSI6InRvdXJpc3QiLCJ1c2VyIjp7InVpZCI6NDExNjg0ODgxLCJuaWNrbmFtZSI6Iua4uOWuojExMjk1MzU2NTExMCIsImltZWkiOiIiLCJ1dWlkIjoiMDAwMDAwMDAtMzkyMC04OTQ4LTAwMDAtMDAwMDAwMDAwMDAwIiwiZGV2aWNlSWQiOiIyMDIyMTEyODE1MTgwMWZiYjQzZjJiNGZiNmY1NzRlODJiZDIyM2M0MGEzODZhMDFlM2MwZDFlNmRlZTQ2NiIsInJlZ1RpbWUiOjE2Njk3MTk1MjUsInZpcEV4cGlyZUF0IjowLCJzbV9pZCI6IjIwMjIxMTI4MTUxODAxZmJiNDNmMmI0ZmI2ZjU3NGU4MmJkMjIzYzQwYTM4NmEwMWUzYzBkMWU2ZGVlNDY2IiwibnV0IjowLCJpZnUiOjAsImlzX3JiZiI6MCwiYWN0X2lkIjowLCJiaW5kX2F0IjowLCJ0aWQiOiJEVW9ldF9vWVN1Vl9ISUVwb1BXaTA3ZGtkSF8wMTk3ZGVXZTNSRlZ2WlhSZmIxbFRkVlpmU0VsRmNHOVFWMmt3TjJSclpFaGZNREU1TjJSbFYyVXpjMmgxIiwidF9tb2RlIjoxfX0.GoWE23EZeSks7N2OLbQ0cHYR0rr9OHKWosqIePe8vwi72_pJk0hHj36Lw8ISnIcctSZ5JI8ZJ-iUlEO2gYPwhsbY3w4fH9Pg_LAezOrWcBalJ6d3C1d1t8rLgU3AK8VqUKqTata36-hzLIBYFfIY8yv2eUecdSyTKs1_b0zRjNA',
        'qm-params':'cLGeuyoMmqN6OlNDOzf5A5HwtTFUH5w5uCR1paHWHT9wgI9wgI9wthgYgT9QAI-MAaMwgI9wth9wgI9wgI9wgI9wgaHjHzk2uz2Tp3U1paHWHTHwgTHnghHrghfnAI9npzG5NINzgzHMpzHlpTfENyfrgzG-gTHe4eFw4hgrNz0wgqfe4es-gqflpyR2NI4lH5w5BqoTHTZ5A0fWkh9WFf0WNM4WA0gWkIf5taGeBERL4lRUmqF5A5HrkffwFf0EkTxIkIf5taGecCgQuzRLHTZ5gh95taGMOSReuyR-tq2-HTZ5koRDpCk6BU2huRp6302oOyJFRl-wNlkvp0x6gI0YNlk2Rlfef-pqu214fzp5gqnfpopmp2NoB0pTke2kRTGvuMrLfSGmkqxzhfkoNfrLfznqg2RW4eGZg3HjHSsZBlY2tqn2uzRjHTZ5h3HjHz2Qpq-5A5H5taGQBlk2BaHWH2s1cyRjHIH5taGEByHQmqU2m3HWH5HjHSuj45UUmqF5A5HrkffwFf0EkTxIkIf5taGTBy22BSFQmqF5A5HYghgnph0l4e9wgepT4lgYH5w54SGxBzF5A5GSBlJSByf5taGD4q2-HTZ5HSM=',
        'sign':'e33c9e9b613ff130c57ee839e300739c',
        'QM-uaf':'20221130-411684881',
        'QM-ii':'1875337936',
        'QM-it':'1669619881',
        'no-permiss':'3',
        'User-Agent':'webviewversion/0',
        'Host':'api-ks.wtzw.com'
    }
    url = f'https://api-ks.wtzw.com/api/v1/chapter/content?chapterId={chapter_id}&id={book_id}&sign={sign}'
    # res = session.get(url,headers=header)
    res = utils.send_req('GET',url,header)
    return decrypt(res.json()['data']['content'])
    

def decrypt(data):
    '''
        com.km.encryption.aes.AESManager.decrypt
    '''
    key_ = '242ccb8230d709e1'.encode() #key iv 
    aes = AES.new(key_,AES.MODE_CBC,key_) #创建一个aes对象
    den_text = aes.decrypt(base64.b64decode(data.encode()))
    return den_text.decode(errors='ignore')

def main():
    for page in range(100):
        for book_info in getBookList(page):
            # f = open(f'{book_info["title"]}.txt','a',errors='ignore')
            # result = {'book_name':book_info["title"],'book_id':book_info["id"],'chapter_info':[]}
            for chapter_info in getChapterList(book_info["id"]):
                result = {
                    'book_name':book_info["title"],
                    'book_id':book_info["id"],
                    'chapter_id':chapter_info["id"],
                    'chapter_title':chapter_info["title"],
                    'chapter_content':getContent(book_info["id"],chapter_info["id"]),
                }
                utils.pipeline(item_ = result)
                # f.write(f'{chapter_info["title"]}\n')
                # f.write(getContent(book_info["id"],chapter_info["id"]))
            # f.close()
            

if __name__ == "__main__":
    utils.run(main)




    