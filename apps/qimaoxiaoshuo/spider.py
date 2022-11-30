from Crypto.Cipher import AES
import base64
import requests
import os
session =requests.session()

def getBookList(page=1000):
    '''
        com.km.encryption.api.Security
    '''
    text = f'book_privacy=1new_user=1page_no={page}read_preference=0uid=8EE0AA7F8CD5'
    sign = os.popen(f'qmSign.exe C:\\Users\\rico\Desktop\\apk\\qimaomianfeixiaoshuo.apk {text}').read().replace('\n','')
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
        'authorization':'eyJhbGciOiJSUzI1NiIsImNyaXQiOlsiaXNzIiwianRpIiwiaWF0IiwiZXhwIl0sImtpZCI6IjE1MzEyMDM3NjkiLCJ0eXAiOiJKV1QifQ.eyJleHAiOjE2NzEwMTY4ODYsImlhdCI6MTY2OTcyMDg4NiwiaXNzIjoiaHR0cHM6Ly94aWFvc2h1by53dHp3LmNvbS9hcGkvdjEvbG9naW4vdG91cmlzdCIsImp0aSI6InRvdXJpc3QiLCJ1c2VyIjp7InVpZCI6NDExNjg0ODgxLCJuaWNrbmFtZSI6Iua4uOWuojExMjk1MzU2NTExMCIsImltZWkiOiIiLCJ1dWlkIjoiMDAwMDAwMDAtMzkyMC04OTQ4LTAwMDAtMDAwMDAwMDAwMDAwIiwiZGV2aWNlSWQiOiIyMDIyMTEyODE1MTgwMWZiYjQzZjJiNGZiNmY1NzRlODJiZDIyM2M0MGEzODZhMDFlM2MwZDFlNmRlZTQ2NiIsInJlZ1RpbWUiOjE2Njk3MTk1MjUsInZpcEV4cGlyZUF0IjowLCJzbV9pZCI6IjIwMjIxMTI4MTUxODAxZmJiNDNmMmI0ZmI2ZjU3NGU4MmJkMjIzYzQwYTM4NmEwMWUzYzBkMWU2ZGVlNDY2IiwibnV0IjowLCJpZnUiOjAsImlzX3JiZiI6MCwiYWN0X2lkIjowLCJiaW5kX2F0IjowLCJ0aWQiOiJEVW9ldF9vWVN1Vl9ISUVwb1BXaTA3ZGtkSF8wMTk3ZGVXZTNSRlZ2WlhSZmIxbFRkVlpmU0VsRmNHOVFWMmt3TjJSclpFaGZNREU1TjJSbFYyVXpjMmgxIiwidF9tb2RlIjoxfX0.G3-IkgnomLp2yDZu-7cDH-AL8VhqImR76sI4oFWZ0GnBrrYX4A989EXcsQN1Efrut2ntQGkiyu3GetucHm80yIqZYF-2sAyvvGqBKwPHJPtpucSNsAR04S9VqJTsi5EwFQTEKRAMfwCDdeZd_eoeO0Sf0uTwvu7a2pRPHXJuM04',
        'qm-params':'cLGeuyoMmqN6OlNDOzf5A5HwtTFUH5w5uCR1paHWHT9wgI9wgI9wthgYgT9QAI-MAaMwgI9wth9wgI9wgI9wgI9wgaHjHzk2uz2Tp3U1paHWHTHwgTHnghHrghfnAI9npzG5NINzgzHMpzHlpTfENyfrgzG-gTHe4eFw4hgrNz0wgqfe4es-gqflpyR2NI4lH5w5BqoTHTZ5A0fWkh9WFf0WNM4WA0gWkIf5taGeBERL4lRUmqF5A5HrkffwFf0EkTxIkIf5taGecCgQuzRLHTZ5gh95taGMOSReuyR-tq2-HTZ5koRDpCk6BU2huRp6302oOyJFRl-wNlkvp0x6gI0YNlk2Rlfef-pqu214fzp5gqnfpopmp2NoB0pTke2kRTGvuMrLfSGmkqxzhfkoNfrLfznqg2RW4eGZg3HjHSsZBlY2tqn2uzRjHTZ5h3HjHz2Qpq-5A5H5taGQBlk2BaHWH2s1cyRjHIH5taGEByHQmqU2m3HWH5HjHSuj45UUmqF5A5HrkffwFf0EkTxIkIf5taGTBy22BSFQmqF5A5HYghgnph0l4e9wgepT4lgYH5w54SGxBzF5A5GSBlJSByf5taGD4q2-HTZ5HSM=',
        'sign':'2fa58d7559729946fa093857edba1927',
        'qm-uaf':'20221130-411684881',
        'qm-ii':'1875337936',
        'qm-it':'1669619881',
        'no-permiss':'3',
        'user-agent':'webviewversion/0',
    }
    url  = f'https://api-bc.wtzw.com/api/v5/book-store/recommend-guess-more?page_no={page}&read_preference=0&book_privacy=1&uid=8EE0AA7F8CD5&new_user=1&sign={sign}'
    res = session.get(url,headers=header)
    print(res.text)

def getChapterList(book_id=103152):
    text = f"chapter_ver=0id={book_id}"
    sign = os.popen(f'qmSign.exe C:\\Users\\rico\Desktop\\apk\\qimaomianfeixiaoshuo.apk {text}').read().replace('\n','')
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
    res = session.get(url,headers=header)
    print(res.text)

def getContent(book_id=103152,chapter_id=26520):
    text = f"chapterId={chapter_id}id={book_id}"
    sign = os.popen(f'qmSign.exe C:\\Users\\rico\Desktop\\apk\\qimaomianfeixiaoshuo.apk {text}').read().replace('\n','')
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
    res = session.get(url,headers=header)
    decrypt(res.json()['data']['content'])
    print(res.text)

def decrypt(data):
    '''
        com.km.encryption.aes.AESManager.decrypt
    '''
    key_ = '242ccb8230d709e1'.encode() #key iv 
    aes = AES.new(key_,AES.MODE_CBC,key_) #创建一个aes对象
    den_text = aes.decrypt(base64.b64decode(data.encode()))
    f = open('a.txt','wb')
    f.write(den_text)
   
if __name__ == "__main__":
    # getContent()
    # getChapterList(141725)
    getBookList()
    # decrypt('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')