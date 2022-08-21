#include "HMAC_MD5.h"
#include "MD5.h"

#define LENGTH_MD5_RESULT 16
#define LENGTH_BLOCK 64 //md5是64 sha256是128

void hmac_md5(unsigned char *out, unsigned char *data, int dlen, unsigned char *key, int klen) {

    //初始化变量
    int i;

    unsigned char tempString16[LENGTH_MD5_RESULT];
    unsigned char OneEnding[LENGTH_BLOCK];
    unsigned char TwoEnding[LENGTH_BLOCK];
    unsigned char ThreeEnding[LENGTH_BLOCK + dlen];
    unsigned char FourEnding[LENGTH_MD5_RESULT];    /*如下步骤四生成的结果*/
    unsigned char FiveEnding[LENGTH_BLOCK];    /*步骤五生成的结果*/
    unsigned char SixEnding[LENGTH_BLOCK + LENGTH_MD5_RESULT];

    char ipad;
    char opad;
    MD5_CTX md5;

    ipad = 0x36;
    opad = 0x5c;

    /*
     * (1) 在密钥key后面添加0来创建一个长为B(64字节)的字符串(OneEnding)。如果key的长度klen大于64字节，则先进行md5运算，使其长度klen=16字节。
     * */
    //对初始化密钥进行扩展
    //全部置0
    for (i = 0; i < LENGTH_BLOCK; i++) {
        OneEnding[i] = 0;
    }

    //判断密钥长度
    if (klen > LENGTH_BLOCK) {
        MD5Init(&md5);
        MD5Update(&md5, key, klen);
        MD5Final(&md5, tempString16);
        for (i = 0; i < LENGTH_MD5_RESULT; i++)
            //把结果放到前面
            OneEnding[i] = tempString16[i];
    } else {
        for (i = 0; i < klen; i++)
            OneEnding[i] = key[i];
    }

    /*
     * (2) 将上一步生成的字符串(OneEnding)与ipad(0x36)做异或运算，形成结果字符串(TwoEnding)。
     * */
    //异或
    for (i = 0; i < LENGTH_BLOCK; i++) {
        TwoEnding[i] = OneEnding[i] ^ ipad;
    }

    /*
     * (3) 将数据流data附加到第二步的结果字符串(TwoEnding)的末尾。
     * */

    for (i = 0; i < LENGTH_BLOCK; i++) {
        ThreeEnding[i] = TwoEnding[i];
    }
    for (; i < dlen + LENGTH_BLOCK; i++) {
        ThreeEnding[i] = data[i - LENGTH_BLOCK];
    }

    /*
     * (4) 做md5运算于第三步生成的数据流(ThreeEnding)。
     * */

    MD5Init(&md5);
    MD5Update(&md5, ThreeEnding, LENGTH_BLOCK + dlen);
    MD5Final(&md5, FourEnding);

    /*
     * (5) 将第一步生成的字符串(OneEnding)与opad(0x5c)做异或运算，形成结果字符串(FiveEnding)。
     * */

    for (i = 0; i < LENGTH_BLOCK; i++) {
        FiveEnding[i] = OneEnding[i] ^ opad;
    }

    /*
     * (6) 再将第四步的结果(FourEnding)附加到第五步的结果字符串(FiveEnding)的末尾。
     * */

    for (i = 0; i < LENGTH_BLOCK; i++) {
        SixEnding[i] = FiveEnding[i];
    }
    for (; i < (LENGTH_BLOCK + LENGTH_MD5_RESULT); i++) {
        SixEnding[i] = FourEnding[i - LENGTH_BLOCK];
    }

    /*
     * (7) 做md5运算于第六步生成的数据流(SixEnding)，输出最终结果(out)。
     * */

    MD5Init(&md5);
    MD5Update(&md5, SixEnding, LENGTH_BLOCK + LENGTH_MD5_RESULT);
    MD5Final(&md5, out);
}




void main() {
    unsigned char* plainText = (unsigned char *) "xiaojianbang";
    unsigned char* key = (unsigned char *) "a12345678";
    unsigned char result[16];
    //结果 明文 明文长度 密钥 密钥长度
    hmac_md5(result, plainText, strlen(plainText), (unsigned char *) key, strlen(key));
    char temp[2] = {0};
    char finalResult[32] = {0};
    for (int i = 0; i < 16; i++) {
        int index = i;
        sprintf(temp, "%.2x", result[index]);
        strcat(finalResult, temp);
    }
    printf("hamc_md5：%s\n", finalResult);
}



//hash可能是md5 也可能sha算法 根据开发者自己来决定
// - key
// - a12345678
// - key的Hex形式
// - 61 31 32 33 34 35 36 37 38
// - 扩展到分组长度的key
// - 61313233343536373800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
// - ipad之后的数据
// - 57070405020300010e36363636363636363636363636363636363636363636363636363636363636363636363636363636363636363636363636363636363636
// - 明文
// - xiaojianbang
// - 明文的Hex形式
// - 7869616f6a69616e62616e67
// - ipad之后的数据 和 明文的Hex形式 进行级联
// - 57070405020300010e363636363636363636363636363636363636363636363636363636363636363636363636363636363636363636363636363636363636367869616f6a69616e62616e67
// - 级联后的数据 进行一次hash
// - f573a38d3ea4f054c0b6719c7ab03346
// - opad之后的数据
// - 3d6d6e6f68696a6b645c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c
// - opad之后的数据 与hash结果 进行级联
// - 3d6d6e6f68696a6b645c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5c5cf573a38d3ea4f054c0b6719c7ab03346
// - 级联后的数据 进行一次hash
// - a1cf883260ad4b25f37ae2e572e203d4