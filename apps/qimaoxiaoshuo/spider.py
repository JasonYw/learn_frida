'''
    com.km.encryption.api.Security

'''

def getBookList(page):
    sign = ''
    url  = f'https://api-bc.wtzw.com/api/v5/book-store/recommend-guess-more?page_no={page}&read_preference=0&book_privacy=1&uid=8EE0AA7F8CD5&new_user=1&sign={sign}'
    '''
    AUTHORIZATION=
    app-version=71005
    application-id=com.kmxs.reader
    channel=qm-wy2yd058_wm
    is-white=1
    net-env=1
    platform=android
    qm-params=
    cLGeuyoMmqN6OlNDOzf5A5HwtTFUH5w5uCR1paHWHT9wgI9wgI9wthgYgT9QAI-MAaMwgI9wth9wgI9wgI9wgI9wgaHjHzk2uz2Tp3U1paHWHTHwgTHnghHrghfnAI9npzG5NINzgzHMpzHlpTfENyfrgzG-gTHe4eFw4hgrNz0wgqfe4es-gqflpyR2NI4lH5w5BqoTHTZ5A0fWkh9WFf0WNM4WA0gWkIf5taGeBERL4lRUmqF5A5H5taGecCgQuzRLHTZ5gh95taGMOSReuyR-tq2-HTZ5H5w5OyxDBzfQByRlpqw5A5GNH5w5mqU2m3HWH5HjHzUDpyRjHTZ5fy2rpqwKg5HjHSuj45U1BqR1HTZ5H5w5uln5tCR1paHWHTxokhssFhuyA0N0N3HjHzNjmqR7uaU1paHWHT-ngeo2ghpTgI9eNzNT4e-5taG5Ozo7paHWHzuDBlujp3HjHzJxmqF5A5H56F==
    cLGeuyoMmqN6OlNDOzf5A5HwtTFUH5w5uCR1paHWHT9wgI9wgI9wthgYgT9QAI-MAaMwgI9wth9wgI9wgI9wgI9wgaHjHzk2uz2Tp3U1paHWHTHwgTHnghHrghfnAI9npzG5NINzgzHMpzHlpTfENyfrgzG-gTHe4eFw4hgrNz0wgqfe4es-gqflpyR2NI4lH5w5BqoTHTZ5A0fWkh9WFf0WNM4WA0gWkIf5taGeBERL4lRUmqF5A5H5taGecCgQuzRLHTZ5gh95taGMOSReuyR-tq2-HTZ5H5w5OyxDBzfQByRlpqw5A5GNH5w5mqU2m3HWH5HjHzUDpyRjHTZ5fy2rpqwKg5HjHSuj45U1BqR1HTZ5H5w5uln5tCR1paHWHTxokhssFhuyA0N0N3HjHzNjmqR7uaU1paHWHT-ngeo2ghpTgI9eNzNT4e-5taG5Ozo7paHWHzuDBlujp3HjHzJxmqF5A5H56F==
    reg=
    '''


'''
    key iv = 242ccb8230d709e1
    public static byte[] decrypt(String str, String str2) throws Exception {
        try {
            byte[] decode = Base64.decode(str.getBytes("UTF-8"), 0);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(decode, 0, 16);
            byte[] copyOfRange = Arrays.copyOfRange(decode, 16, decode.length);
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), b.b), ivParameterSpec);
            return cipher.doFinal(copyOfRange);
        } catch (Exception unused) {
            return ITagManager.FAIL.getBytes();
        }
    }
'''