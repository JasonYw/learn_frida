# from Crypto.PublicKey import RSA
# from Crypto.Signature import PKCS1_v1_5
# from Crypto.Hash import SHA1
# from Crypto.Cipher import AES
# from Crypto.Cipher import PKCS1_v1_5 as PKCS1_cipher
# from Crypto.Util.Padding import pad
import base64 
import time
import requests
# import jpype
#rsa加密，通常对加密结果进行base64编码

# def generate_aes() -> str:
#     #h10
#     random_str =""
#     base_str ="ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz0123456789"
#     length =len(base_str) -1
#     for i in range(16):
#         random_str +=base_str[random.randint(0, length)]
#     result = base64.b64encode(random_str.encode()).decode()
#     print("generate_aes=>",result)
#     return result

    

# def make_sign_args(json_):
#     args = ""
#     for key_ in sorted(json_):
#         if(isinstance(json_.get(key_),dict)):
#             args = args + f"{key_}={json.dumps(json_.get(key_)).replace(' ','')}&"
#         else:
#             args = args + f"{key_}={json_.get(key_)}&"
    

#     args = args.strip('&')
#     print("make_sign_args=>",args)
#     return args


# def make_password(password,aes):
#     # AES/CBC/PKCS7Padding
#     plain_text = json.dumps({"password":password}).replace(" ","")
#     plaintext_bytes = plain_text.encode()
#     plaintext_bytes_padded = pad(plaintext_bytes, AES.block_size, "pkcs7")
#     key_ = base64.b64decode(aes.encode())
#     iv = base64.b64decode(aes.encode())
#     aes = AES.new(key_,AES.MODE_CBC,iv) #创建一个aes对象  AES.MODE_CBC 表示模式是CBC模式
#     en_text = aes.encrypt(plaintext_bytes_padded) 
#     b64_en_text = base64.b64encode(en_text).decode()
#     print("make_password=>",plain_text,b64_en_text)
#     return b64_en_text

# def generate_aeskey(h10):
#     # RSA/ECB/PKCS1Padding
#     # ZtgAgzuIRJ53BCZ7VwmJYzaSor7+JIHYPduO30D/b3Nu1Msu7Hi/XSAb6tm15dJZACfoNS8Vu2gV+kVlNVbesIfAzWzRdCaWZJjfaCyfIWoK2ANb5HpfVuY+a0VBGNAGwKOP6gK3BAbx364uNcUk5qPf+raihNVg+U83zvfHol0=
#     # N3PLReiCjOSVDTQ61h7CrtbXR5aFQVeJLl38SLunNRBayE9JCkaQNTPdJsXINaSOpVjWh/EWdtRiXBZGeOzx/86AYwMtM1w3ahiVCHuytkVrpNERWYiDqSpqX07UwdzvhoA5WwD9196Cxtk4ONnHnlxn/uyGuzm9dpZweUurNfg=
#     #d10
#     #'RSA/ECB/PKCS1Padding'
#     key_b64 = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCAqSnnZ9BVOZjIMTkATIn29nM0hLOsQsXlPbqrGE4CUmDCncVBHdkfEIF73tSKjhYfLuPH1gDtHRKeCC1DQ4uYJL83oeHtXSldGUlfuv9rh0Q/2Hxl3iG8TUc1drTKTZFfkQWWseTb3vAx8Ggse9xZNTjI6enOEjNyGlAIF+RKrwIDAQAB"
#     pri_key = base64.b64decode(key_b64)
#     #生成公钥
#     public_pem = RSA.importKey(pri_key).public_key()
#     cipher = PKCS1_cipher.new(public_pem) 
#     rsa_encrypt_text = cipher.encrypt(h10.encode())
#     b64_rsa_encrypt_text = base64.b64encode(rsa_encrypt_text).decode()
#     print("generate_aeskey=>",b64_rsa_encrypt_text)
#     return b64_rsa_encrypt_text


def make_post_data(user_name = None,password = None):
    # h10 = input("h10:")
    # d10 = input("d10:")
    # h10 = generate_aes()
    # d10 = generate_aeskey(h10)
    json_ = {
        "channel_id":"108045",
        "is_mergeme":"1",
        "encrypt_method":"1",
        "device":"Pixel 2",
        "version_id":"17490003",
        "ver":"1.0",
        "data":{
            "AesKey":"cEwVOuaMzimhKEFsoQlWs42niVF/ITbyfcV+jmzB80LooatU7AJNQ0zq2Bx+6DJm4TjhicMiteKWlmB++DsHR3kqHKPU+pUDGWiuigIdJQF0sGjPUla1/WyKcRuYMY7SKzuchYnzu0y2ev8CPyYu78wTJeaQQfS8W/s27iFXsoQ=",
            "Data":"OZAyfZEtR3sHxirNESCXkYCxnHDmBxFilmgHq9enqEg="
        },
        "imei":"__39827dd5eb14217a",
        "timestamp": "1669015093606",
        "user_name":"15801367777",
        "sign":"Hzixq1i6xkW8dGJUi/0F/7tgmbL3r358c6ZMWhcvEY5SAxANMP/vo2oOtN8+lqupGfmFqYdxKMHsY5tdJLFdc2aBgO7eG8LWHN4Ph/YZrDcpUSfLC3AC26YeuK+FJG9DUTUX4DdK541TgX1WSMpIGenzAkqEwFLkh3KRfubW660="
    }
    # print(make_sign_args(json_))
    # sign = input("hash:")
    # json_.update({"sign":rsa_sign(make_sign_args(json_))})
    # json_["sign"] = sign
    # print("make_post_data =>",json_)
    return json_
   

# def rsa_sign(data):
#     jar_path = 'unidbg-android.jar'
#     # 获取jvm.dll 的文件路径
#     jvmPath = jpype.getDefaultJVMPath()
#     # 启动jvm
#     jpype.startJVM(jvmPath, "-ea", "-Djava.class.path=%s" % jar_path)
#     # ②、加载java类（参数是java的长类名）
#     javaClass = jpype.JClass("com.zhangyue.iReader.JNI.util.JNISecurity")
#     # 实例化java对象
#     javaInstance = javaClass()
#     # ③、调用java方法
#     javaInstance.main("C:/Users/wkj/Desktop/com.chaozh.iReaderFree/ireader.apk",data)
#     # ④、关闭jvm:jvm随着python程序的退出而结束
#     jpype.shutdownJVM()

import json
def login():
    json_ = {
        "channel_id":"108045",
        "is_mergeme":"1",
        "encrypt_method":"1",
        "device":"Pixel 2",
        "version_id":"17490003",
        "ver":"1.0",
        "data":'{"AesKey":"H4z\/K5ZnDIsx3ATADEF8vgwPiH6m+SAro+lbLbbDnI8p+22xQVHfAUV618nH2vgbEkGtMBJr3ZCgyuu1XgNpXSd1wLUO4hNipJU9SXgFl7J10JoeRUTGXgWxjKK6Bz9JG7qwt\/rjz2GeWwJQ1wKekS07gdckr\/U9Q1jAWHBNDuw=","Data":"RbO7rs3CSZJl\/oR+9BL1LizEJhr2uG3wvn9uXMhyXnE="}',
        "imei":"__39827dd5eb14217a",
        "sign":"Sc9em/0XNTc2+tX/xR6pM4LJrWPdrcfs5cwxbBdsfgdK4LG1C1kiD2aqznf9ChMzoL6DPeOv85kJNZN4iereKpwbovLcMwc8ADzs2/K2HbfkpY/hNxZnUrQeoa1weOrNY9BGjeeeTdamfUOZ6ZntcKuiBMnFV8MJjam+zlG4GC0=",
        "timestamp": "1669018511832",
        "user_name":"15801367777",
    }
    
    a = f'channel_id=108045&is_mergeme=1&encrypt_method=1&device=Pixel%202&version_id=17490003&ver=1.0&data=%7B%22AesKey%22%3A%22H4z%5C%2FK5ZnDIsx3ATADEF8vgwPiH6m%2BSAro%2BlbLbbDnI8p%2B22xQVHfAUV618nH2vgbEkGtMBJr3ZCgyuu1XgNpXSd1wLUO4hNipJU9SXgFl7J10JoeRUTGXgWxjKK6Bz9JG7qwt%5C%2Frjz2GeWwJQ1wKekS07gdckr%5C%2FU9Q1jAWHBNDuw%3D%22%2C%22Data%22%3A%22RbO7rs3CSZJl%5C%2FoR%2B9BL1LizEJhr2uG3wvn9uXMhyXnE%3D%22%7D&imei=__39827dd5eb14217a&sign=Sc9em%2F0XNTc2%2BtX%2FxR6pM4LJrWPdrcfs5cwxbBdsfgdK4LG1C1kiD2aqznf9ChMzoL6DPeOv85kJNZN4iereKpwbovLcMwc8ADzs2%2FK2HbfkpY%2FhNxZnUrQeoa1weOrNY9BGjeeeTdamfUOZ6ZntcKuiBMnFV8MJjam%2BzlG4GC0%3D&timestamp=1669018511832&user_name=15801367777'


    
    url = "https://uc.ireader.com/user/slogin/passwd/v2?zyeid=6f511bea4bf9427ab88b137637dab7c4&usr=i4413417392&rgt=7&p1=ffffffffffffffffffffffff&pc=10&p2=108045&p3=17490003&p4=501603&p5=19&p7=__39827dd5eb14217a&p9=2&p16=Pixel+2&p21=31303&p22=10&p25=74901&p28=&p29=zye5b814&p30=&p31=__39827dd5eb14217a&p33=com.chaozh.iReaderFree&p34=google"
    header = {
        "Content-Type":"application/x-www-form-urlencoded",
        #"Content-Type":"application/json",
        #"Content-Type": "multipart/form-data",
        "Host": "uc.ireader.com",
        "User-Agent": "okhttp/3.11.0",
        # "Content-Length":"664",
        # "Accept-Encoding":"gzip"
    
    }
    a = 'channel_id=108045&data={"Data":"ihgYg5hmuYlMEbdE5KRzG+Fdzy6wrPoeM/Y8jRg5iWQ=","AesKey":"fo1vLYDzfgi64+KBM8BCtLgPD/Ccgcq0BTviqVfCL/3WwQA9MQf3BBhDqZYkNzH69/imtegjyCIkqGdJyFOvadwCoZ05QcwT59M3fNLl3ImWoLosfAz8oUzY+Xw79ziunEZPgf/j9jUrsFLg5LF3poEwVJwvqMJEqKQJ7rk9VVE="}&device=Pixel 2&encrypt_method=1&imei=__39827dd5eb14217a&is_mergeme=1&sign=p++cL2nuTHLTSXOJa3PuXGTISpwXUkybBM73JUOE69OgjMAQD0aDBB7lkoh4K5ihPzroIp4g34P1POHElJLxVm+P04WJvB5P/eObfGEGFr+kg5tSkboNYstLtvrDddTUywGc9imn+1LXsn/fVBYn13cgBWXIm412phOSsYxIKn0=&timestamp=1669019582599&user_name=15801367777&ver=1.0&version_id=17490003'
    res = requests.post(url=url,headers=header,data=json_)
    # res = requests.post(url=url,headers=header,json=json.dumps(make_post_data("15801367777","0123456789")))
    print(res.json())


"channel_id=108045&is_mergeme=1&encrypt_method=1&device=Pixel%202&version_id=17490003&ver=1.0&data=%7B%22AesKey%22%3A%22H4z%5C%2FK5ZnDIsx3ATADEF8vgwPiH6m%2BSAro%2BlbLbbDnI8p%2B22xQVHfAUV618nH2vgbEkGtMBJr3ZCgyuu1XgNpXSd1wLUO4hNipJU9SXgFl7J10JoeRUTGXgWxjKK6Bz9JG7qwt%5C%2Frjz2GeWwJQ1wKekS07gdckr%5C%2FU9Q1jAWHBNDuw%3D%22%2C%22Data%22%3A%22RbO7rs3CSZJl%5C%2FoR%2B9BL1LizEJhr2uG3wvn9uXMhyXnE%3D%22%7D&imei=__39827dd5eb14217a&sign=Sc9em%2F0XNTc2%2BtX%2FxR6pM4LJrWPdrcfs5cwxbBdsfgdK4LG1C1kiD2aqznf9ChMzoL6DPeOv85kJNZN4iereKpwbovLcMwc8ADzs2%2FK2HbfkpY%2FhNxZnUrQeoa1weOrNY9BGjeeeTdamfUOZ6ZntcKuiBMnFV8MJjam%2BzlG4GC0%3D&timestamp=1669018511832&user_name=15801367777"






 
if __name__ == '__main__':
    login()
    # rsa_sign('channel_id=108045&data={"AesKey":"aBgcuFZbJsArDrptemtXhoCcUeJnlbFW55KIAc66C2vHkb5xCD80L8glqsxPRqFDs9T/xOodxHdIN5vzrJnGkw5UImNkLHEr09SVHmSWf5lJCj9SfSfTMiWifg4iPIsIXbfpAgBsIn3iORIFex9FlA73EuH0CL3dl/tyZvC7FXI=","Data":"7mHPW/avZZKQNabDONASS0nP9hMw5vLNPz4602WVYQk="}&device=Pixel 2&encrypt_method=1&imei=__39827dd5eb14217a&is_mergeme=1&timestamp=1668583815052&user_name=15801367777&ver=1.0&version_id=17490003')

# # channel_id=108045&is_mergeme=1&encrypt_method=1&device=Pixel%202&version_id=17490003&ver=1.0&data=%7B%22AesKey%22%3A%22H4z%5C%2FK5ZnDIsx3ATADEF8vgwPiH6m%2BSAro%2BlbLbbDnI8p%2B22xQVHfAUV618nH2vgbEkGtMBJr3ZCgyuu1XgNpXSd1wLUO4hNipJU9SXgFl7J10JoeRUTGXgWxjKK6Bz9JG7qwt%5C%2Frjz2GeWwJQ1wKekS07gdckr%5C%2FU9Q1jAWHBNDuw%3D%22%2C%22Data%22%3A%22RbO7rs3CSZJl%5C%2FoR%2B9BL1LizEJhr2uG3wvn9uXMhyXnE%3D%22%7D&imei=__39827dd5eb14217a&sign=Sc9em%2F0XNTc2%2BtX%2FxR6pM4LJrWPdrcfs5cwxbBdsfgdK4LG1C1kiD2aqznf9ChMzoL6DPeOv85kJNZN4iereKpwbovLcMwc8ADzs2%2FK2HbfkpY%2FhNxZnUrQeoa1weOrNY9BGjeeeTdamfUOZ6ZntcKuiBMnFV8MJjam%2BzlG4GC0%3D&timestamp=1669018511832&user_name=1580136777
# 'channel_id=108045&data={"Data":"ihgYg5hmuYlMEbdE5KRzG+Fdzy6wrPoeM/Y8jRg5iWQ=","AesKey":"fo1vLYDzfgi64+KBM8BCtLgPD/Ccgcq0BTviqVfCL/3WwQA9MQf3BBhDqZYkNzH69/imtegjyCIkqGdJyFOvadwCoZ05QcwT59M3fNLl3ImWoLosfAz8oUzY+Xw79ziunEZPgf/j9jUrsFLg5LF3poEwVJwvqMJEqKQJ7rk9VVE="}&device=Pixel 2&encrypt_method=1&imei=__39827dd5eb14217a&is_mergeme=1&sign=p++cL2nuTHLTSXOJa3PuXGTISpwXUkybBM73JUOE69OgjMAQD0aDBB7lkoh4K5ihPzroIp4g34P1POHElJLxVm+P04WJvB5P/eObfGEGFr+kg5tSkboNYstLtvrDddTUywGc9imn+1LXsn/fVBYn13cgBWXIm412phOSsYxIKn0=&timestamp=1669019582599&user_name=15801367777&ver=1.0&version_id=17490003'