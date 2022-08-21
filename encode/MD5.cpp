// md5算法在c中的实现
// md5
// md5_init
// md5_update
// md5_final 
//https://www.runoob.com/cprogramming/c-strings.html

//魔改md5 最容易改的 初始化常量和k值 其他的不会轻易动 

#include <iostream>
#include <memory.h>
#include <string.h>
#include "MD5.h"

using namespace std;

unsigned char PADDING[] = {0x80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                           0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                           0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                           0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

void MD5Init(MD5_CTX *context) {
    //首先清0
    context->count[0] = 0;
    context->count[1] = 0;
    //MD5四个初始化常量
    //01234567
    //89abcdef
    //fedcba98
    //76543210
    //初始化常量可以随意更改，会影响最后结果 但是不会报错
    context->state[0] = 0x67452301;
    context->state[1] = 0xEFCDAB89;
    context->state[2] = 0x98BADCFE;
    context->state[3] = 0x10325476;
}

void MD5Update(MD5_CTX *context, unsigned char *input, unsigned int inputlen) {
    //一个字节8bit 1bit 一位
    //8个bite 一个byte
    //1个byte分为高4bit 和低4bit
    //hex编码
    //假定有 1Byte，里面存放的是字符 "g"
    //那么它存储的 8 位二进制值是 0110'0111
    //高4位是 0110
    //低4位是 0111
    //Hex编码的时候，先取高 4 位 0110 转成十六进制的 6 ，然后去寻找字符 "6" 对应的 ascii 码，即为 0011'0110
    //再取低 4 位 0111 转成十六进制的 7 ，然后去寻找字符 "7" 对应的 ascii 码，即为 0011'0111
    //最终转换后的数据是 0011'0110 0011'0111
    //按照字符串显示就是 67
    //首先要对明文进行hex编码，编码后将其填充到488个比特位 先填充1后面填充0，之后后面的64个比特位用于附加消息的长度，用64bit表示消息长度
    //大端字节序 60 00 00 00 
    //小端字节序 00 00 00 60
    //MD5使用小端字节序
    //所以之后转换为小端字节序
    //如果内容过长，64bit放不下，就去低64bit，所以md5可以无限长，sha3 算法也是无限大，其他哈希算法不是
    //最终明文处理成 xx xx xx xx xx xx xx xx xx xx xx xx 80 00 00 00 00... 60 00 00 00 00 00 00 00 
    //前面是明文的16进制，后面补80 和 00 一直 明文和80 00 要占到488bit 后面64个bit是消息长度是数值
    //MD5是分组处理的 分组长度为512bit 如果明文长度刚好是448bit,那么就再填充512bit
    //之后将明文分为m1-m16 分成16块 512/16 是 32bit 4字节


    unsigned int i = 0, index = 0, partlen = 0;
    index = (context->count[0] >> 3) & 0x3F;
    partlen = 64 - index;
    context->count[0] += inputlen << 3;
    if (context->count[0] < (inputlen << 3))
        context->count[1]++;
    context->count[1] += inputlen >> 29;

    if (inputlen >= partlen) {
        //当数据大于512bit 64字节 就会进行循环计算
        //会把数据拷贝
        memcpy(&context->buffer[index], input, partlen);
        MD5Transform(context->state, context->buffer);
        for (i = partlen; i + 64 <= inputlen; i += 64)
            MD5Transform(context->state, &input[i]);
        index = 0;
    } else {
        i = 0;
    }
    //如果不满足 512bit 64字节是不进行字段的 先拷贝到buffer
    memcpy(&context->buffer[index], &input[i], inputlen - i); 
}

void MD5Final(MD5_CTX *context, unsigned char digest[16]) {
    //将计算过后得到的新ABCD 初始化常量进行拼接
    unsigned int index = 0, padlen = 0;
    unsigned char bits[8];
    index = (context->count[0] >> 3) & 0x3F;
    //判断需要填充的长度
    padlen = (index < 56) ? (56 - index) : (120 - index);
    MD5Encode(bits, context->count, 8);
    //开始填充80 00 00 00 00 00 00 一直到512比特位
    MD5Update(context, PADDING, padlen);
    //压入附加消息长度
    MD5Update(context, bits, 8);
    //把transform计算好的state初始化数组做一个字节序的转换
    MD5Encode(digest, context->state, 16);
}

void MD5Encode(unsigned char *output, unsigned int *input, unsigned int len) {
    //大端序到小端序的转换
    unsigned int i = 0, j = 0;
    while (j < len) {
        output[j] = input[i] & 0xFF;
        output[j + 1] = (input[i] >> 8) & 0xFF;
        output[j + 2] = (input[i] >> 16) & 0xFF;
        output[j + 3] = (input[i] >> 24) & 0xFF;
        i++;
        j += 4;
    }
}

void MD5Decode(unsigned int *output, unsigned char *input, unsigned int len) {
    //完成处理后的明文 m1-m16的分组 并且转换小端序
    unsigned int i = 0, j = 0;
    while (j < len) {
        output[i] = (input[j]) |
                    (input[j + 1] << 8) |
                    (input[j + 2] << 16) |
                    (input[j + 3] << 24);
        i++;
        j += 4;
    }
}

void MD5Transform(unsigned int state[4], unsigned char block[64]) {
    //MD5最核心的部分 
    //abcd就是初始化常量
    //一共有64轮 一轮只计算一个值，每一轮只计算第二个值
    //明文不一样 Mi不一样\
    //ki是k表是一系列的常量
    //A+F(B,C,D) + Mi + Ki 得出的结果进行循环左移 左移的位数每一轮都不一样 s和k都是常量，k值很容被改 s一般不会被改 循环左移之后加B
    //F代表了FF GG HH  II 4个函数 每一个函数使用16轮 一共64轮
    //FF(a, b, c, d, m, s, k);
    //64轮之后得到的新ABCD 之后进入final函数
    //一般不会去 改循环左移位数 在sha1 之前的sha0 有安全性问题，sha1的代码就比sha0 多一行代码 左移一位
    
    unsigned int a = state[0];
    unsigned int b = state[1];
    unsigned int c = state[2];
    unsigned int d = state[3];
    unsigned int x[64];
    //完成m1-m16的分组
    MD5Decode(x, block, 64);

    //前16个是按顺序来的
    FF(a, b, c, d, x[0], 7, 0xd76aa478); /* 1 */
    FF(d, a, b, c, x[1], 12, 0xe8c7b756); /* 2 */
    FF(c, d, a, b, x[2], 17, 0x242070db); /* 3 */
    FF(b, c, d, a, x[3], 22, 0xc1bdceee); /* 4 */
    FF(a, b, c, d, x[4], 7, 0xf57c0faf); /* 5 */
    FF(d, a, b, c, x[5], 12, 0x4787c62a); /* 6 */
    FF(c, d, a, b, x[6], 17, 0xa8304613); /* 7 */
    FF(b, c, d, a, x[7], 22, 0xfd469501); /* 8 */
    FF(a, b, c, d, x[8], 7, 0x698098d8); /* 9 */
    FF(d, a, b, c, x[9], 12, 0x8b44f7af); /* 10 */
    FF(c, d, a, b, x[10], 17, 0xffff5bb1); /* 11 */
    FF(b, c, d, a, x[11], 22, 0x895cd7be); /* 12 */
    FF(a, b, c, d, x[12], 7, 0x6b901122); /* 13 */
    FF(d, a, b, c, x[13], 12, 0xfd987193); /* 14 */
    FF(c, d, a, b, x[14], 17, 0xa679438e); /* 15 */
    FF(b, c, d, a, x[15], 22, 0x49b40821); /* 16 */


    //后面是乱来的 但是也是规定好的
    /* Round 2 */
    GG(a, b, c, d, x[1], 5, 0xf61e2562); /* 17 */
    GG(d, a, b, c, x[6], 9, 0xc040b340); /* 18 */
    GG(c, d, a, b, x[11], 14, 0x265e5a51); /* 19 */
    GG(b, c, d, a, x[0], 20, 0xe9b6c7aa); /* 20 */
    GG(a, b, c, d, x[5], 5, 0xd62f105d); /* 21 */
    GG(d, a, b, c, x[10], 9, 0x2441453); /* 22 */
    GG(c, d, a, b, x[15], 14, 0xd8a1e681); /* 23 */
    GG(b, c, d, a, x[4], 20, 0xe7d3fbc8); /* 24 */
    GG(a, b, c, d, x[9], 5, 0x21e1cde6); /* 25 */
    GG(d, a, b, c, x[14], 9, 0xc33707d6); /* 26 */
    GG(c, d, a, b, x[3], 14, 0xf4d50d87); /* 27 */
    GG(b, c, d, a, x[8], 20, 0x455a14ed); /* 28 */
    GG(a, b, c, d, x[13], 5, 0xa9e3e905); /* 29 */
    GG(d, a, b, c, x[2], 9, 0xfcefa3f8); /* 30 */
    GG(c, d, a, b, x[7], 14, 0x676f02d9); /* 31 */
    GG(b, c, d, a, x[12], 20, 0x8d2a4c8a); /* 32 */

    /* Round 3 */
    HH(a, b, c, d, x[5], 4, 0xfffa3942); /* 33 */
    HH(d, a, b, c, x[8], 11, 0x8771f681); /* 34 */
    HH(c, d, a, b, x[11], 16, 0x6d9d6122); /* 35 */
    HH(b, c, d, a, x[14], 23, 0xfde5380c); /* 36 */
    HH(a, b, c, d, x[1], 4, 0xa4beea44); /* 37 */
    HH(d, a, b, c, x[4], 11, 0x4bdecfa9); /* 38 */
    HH(c, d, a, b, x[7], 16, 0xf6bb4b60); /* 39 */
    HH(b, c, d, a, x[10], 23, 0xbebfbc70); /* 40 */
    HH(a, b, c, d, x[13], 4, 0x289b7ec6); /* 41 */
    HH(d, a, b, c, x[0], 11, 0xeaa127fa); /* 42 */
    HH(c, d, a, b, x[3], 16, 0xd4ef3085); /* 43 */
    HH(b, c, d, a, x[6], 23, 0x4881d05); /* 44 */
    HH(a, b, c, d, x[9], 4, 0xd9d4d039); /* 45 */
    HH(d, a, b, c, x[12], 11, 0xe6db99e5); /* 46 */
    HH(c, d, a, b, x[15], 16, 0x1fa27cf8); /* 47 */
    HH(b, c, d, a, x[2], 23, 0xc4ac5665); /* 48 */

    /* Round 4 */
    II(a, b, c, d, x[0], 6, 0xf4292244); /* 49 */
    II(d, a, b, c, x[7], 10, 0x432aff97); /* 50 */
    II(c, d, a, b, x[14], 15, 0xab9423a7); /* 51 */
    II(b, c, d, a, x[5], 21, 0xfc93a039); /* 52 */
    II(a, b, c, d, x[12], 6, 0x655b59c3); /* 53 */
    II(d, a, b, c, x[3], 10, 0x8f0ccc92); /* 54 */
    II(c, d, a, b, x[10], 15, 0xffeff47d); /* 55 */
    II(b, c, d, a, x[1], 21, 0x85845dd1); /* 56 */
    II(a, b, c, d, x[8], 6, 0x6fa87e4f); /* 57 */
    II(d, a, b, c, x[15], 10, 0xfe2ce6e0); /* 58 */
    II(c, d, a, b, x[6], 15, 0xa3014314); /* 59 */
    II(b, c, d, a, x[13], 21, 0x4e0811a1); /* 60 */
    II(a, b, c, d, x[4], 6, 0xf7537e82); /* 61 */
    II(d, a, b, c, x[11], 10, 0xbd3af235); /* 62 */
    II(c, d, a, b, x[2], 15, 0x2ad7d2bb); /* 63 */
    II(b, c, d, a, x[9], 21, 0xeb86d391); /* 64 */
    state[0] += a;
    state[1] += b;
    state[2] += c;
    state[3] += d;
}

int md5_main(){

    //void MD5Init(MD5_CTX *context);
    //首先要进行初始化
    //执行md5init，接收一个结构体指针
    MD5_CTX context;
    //结构体一级指针取地址 给结构体赋值
    MD5Init(&context);

    //void MD5Update(MD5_CTX *context,unsigned char *input,unsigned int inputlen);
    unsigned char* plainText = (unsigned char *) "a12345678";
    //context要和MD5init用同一个 ，将明文给MD5update， 明文的长度
    MD5Update(&context, plainText, strlen(reinterpret_cast<const char *>(plainText)));
    //void MD5Final(MD5_CTX *context,unsigned char digest[16]);
    unsigned char result[16];
    //final用来计算最终的结果，第一个还是给context指针的地址，result是返回值，穿的是指针
    MD5Final(&context, result);


    //对加密后的结果进行编码 因为解密后的结果会有不可见字符  hx编码
    char temp[2] = {0};
    char finalResult[33] = {0};
    for(int i = 0; i < 16; i++){
        int index = i;
        sprintf(temp, "%.2x", result[index]);
        strcat(finalResult, temp); //拼接字符串
    }

    cout << finalResult << endl;

    return 0;
}





