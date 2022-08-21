/*
* SHA1.c
*
* Description:
* This file implements the Secure Hashing Algorithm 1 as
* defined in FIPS PUB 180-1 published April 17, 1995.
*
* The SHA-1, produces a 160-bit message digest for a given
* data stream. It should take about 2**n steps to find a
* message with the same digest as a given message and
* 2**(n/2) to find any two messages with the same digest,
* when n is the digest size in bits. Therefore, this
* algorithm can serve as a means of providing a
* "fingerprint" for a message.
*
* Portability Issues:
* SHA-1 is defined in terms of 32-bit "words". This code
* uses <stdint.h> (included via "sha1.h" to define 32 and 8
* bit unsigned integer types. If your C compiler does not
* support 32 bit unsigned integers, this code is not
* appropriate.
*
* Caveats:
* SHA-1 is designed to work with messages less than 2^64 bits
* long. Although SHA-1 allows a message digest to be generated
* for messages of any number of bits less than 2^64, this
* implementation only works with messages with a length that is
* a multiple of the size of an 8-bit character.
*
*/


//SHA1和MD5 都是从md4演进过来的
//https://blog.csdn.net/u012308586/article/details/96113806
//sha1 和 md5 的区别在处理明文时 拼接长度信息时 采用的是大端字节序 处理完明文 也要分段 分成80段 分组长度也是512bit 后64段是扩展出来的
//最明显区别 sha1 初始化常量有5个其中前4个与md5一致

    





#include <stdio.h>
#include "SHA1.h"

#ifdef __cplusplus
extern "C"
{
#endif

/*
* Define the SHA1 circular left shift macro
*/
#define SHA1CircularShift(bits, word) \
    (((word) << (bits)) | ((word) >> (32-(bits))))

/* Local Function Prototyptes */
void SHA1PadMessage(SHA1Context *);

void SHA1ProcessMessageBlock(SHA1Context *);

/*
* SHA1Reset
*
* Description:
* This function will initialize the SHA1Context in preparation
* for computing a new SHA1 message digest.
*
* Parameters:
* context: [in/out]
* The context to reset.
*
* Returns:
* sha Error Code.
*
*/
//初始化
int SHA1Reset(SHA1Context *context)//初始化状态
{
    //初始化函数，有5个初始化常量
    if (!context) {
        return shaNull;
    }
    //先把两个长度的都置为0
    context->Length_Low = 0;
    context->Length_High = 0;
    //将明文索引置为0
    context->Message_Block_Index = 0;
    //前四个与md5一致，最终是20个字节，md5是16字节
    context->Intermediate_Hash[0] = 0x67452301;//取得的HASH结果（中间数据）
    context->Intermediate_Hash[1] = 0xEFCDAB89;
    context->Intermediate_Hash[2] = 0x98BADCFE;
    context->Intermediate_Hash[3] = 0x10325476;
    context->Intermediate_Hash[4] = 0xC3D2E1F0;
    context->Computed = 0;
    context->Corrupted = 0;
    return shaSuccess;
}


/*
* SHA1Result
*
* Description:
* This function will return the 160-bit message digest into the
* Message_Digest array provided by the caller.
* NOTE: The first octet of hash is stored in the 0th element,
* the last octet of hash in the 19th element.
*
* Parameters:
* context: [in/out]
* The context to use to calculate the SHA-1 hash.
* Message_Digest: [out]
* Where the digest is returned.
*
* Returns:
* sha Error Code.
*
*/
int SHA1Result(SHA1Context *context, uint8_t Message_Digest[SHA1HashSize]) {
    //最后计算结果
    //Message_Digest最后的结果
    int i;
    if (!context || !Message_Digest) {
        return shaNull;
    }
    if (context->Corrupted) {
        return context->Corrupted;
    }
    if (!context->Computed) {
        SHA1PadMessage(context); //进行填充工作，并计算
        //进行清0工作 与openssl要求一样 算法计算结束后要进行清空
        for (i = 0; i < 64; ++i) {
            /* message may be sensitive, clear it out */
            context->Message_Block[i] = 0;
        }
        context->Length_Low = 0; /* and clear length */
        context->Length_High = 0;
        context->Computed = 1;
    }
    //打印最终每一个初始化常量计算后的值
    printf("%x\n", context->Intermediate_Hash[0]);
    printf("%x\n", context->Intermediate_Hash[1]);
    printf("%x\n", context->Intermediate_Hash[2]);
    printf("%x\n", context->Intermediate_Hash[3]);
    printf("%x\n", context->Intermediate_Hash[4]);
    //将其直接拼接，md5 最后结果要转换字节序但是sha1 不需要 都是大端序
    for (i = 0; i < SHA1HashSize; ++i) {
        //做的是int到char的转换 没有做字节序的转换
        Message_Digest[i] = context->Intermediate_Hash[i >> 2]
                >> 8 * (3 - (i & 0x03));
    }
    //sha1 计算结果最后也是大端序
    return shaSuccess;
}


/*
* SHA1Input
*
* Description:
* This function accepts an array of octets as the next portion
* of the message.
*
* Parameters:
* context: [in/out]
* The SHA context to update
* message_array: [in]
* An array of characters representing the next portion of
* the message.
* length: [in]
* The length of the message in message_array
*
* Returns:
* sha Error Code.
*
*/

int SHA1Input(SHA1Context *context, const uint8_t *message_array, unsigned length) {
    //压入数据
    //message_array明文数据 length明文长度
    if (!length) {
        return shaSuccess;
    }
    if (!context || !message_array) {
        return shaNull;
    }
    if (context->Computed) {
        context->Corrupted = shaStateError;
        return shaStateError;
    }
    if (context->Corrupted) {
        return context->Corrupted;
    }
    //将数据进行拷贝 拷贝到 c结构体中Message_Block中 
    while (length-- && !context->Corrupted) {
        context->Message_Block[context->Message_Block_Index++] =
                (*message_array & 0xFF);
        context->Length_Low += 8;
        if (context->Length_Low == 0) {
            context->Length_High++;
            if (context->Length_High == 0) {
                /* Message is too long */
                context->Corrupted = 1;
            }
        }
        if (context->Message_Block_Index == 64) {
            //相当于md5的transform 到了64字节才进行计算 没到的话只进行拷贝
            SHA1ProcessMessageBlock(context);
        }
        message_array++;
    }
    return shaSuccess;
}

/*
* SHA1ProcessMessageBlock
*
* Description:
* This function will process the next 512 bits of the message
* stored in the Message_Block array.
*
* Parameters:
* None.
*
* Returns:
* Nothing.
*
* Comments:
* Many of the variable names in this code, especially the
* single character names, were used because those were the
* names used in the publication.
*
*/

void SHA1ProcessMessageBlock(SHA1Context *context) {
    //核心计算过程
    //sha1 核心计算过程和md5差不多
    //区别 k值只有4个
    //sha1 计算结果最后也是大端序


    //Message_Block 存放的是明文

    const uint32_t K[] = { /* Constants defined in SHA-1 */
            //每一个k值只有4个 80轮 或者 20轮4次
            0x5A827999,
            0x6ED9EBA1,
            0x8F1BBCDC,
            0xCA62C1D6
    };
    int t; /* Loop counter */
    uint32_t temp; /* Temporary word value */
    uint32_t W[80]; /* Word sequence */
    uint32_t A, B, C, D, E; /* Word buffers */
    /*
    * Initialize the first 16 words in the array W
    */
    for (t = 0; t < 16; t++) {
        W[t] = context->Message_Block[t * 4] << 24;
        W[t] |= context->Message_Block[t * 4 + 1] << 16;
        W[t] |= context->Message_Block[t * 4 + 2] << 8;
        W[t] |= context->Message_Block[t * 4 + 3];
    }
    for (t = 16; t < 80; t++) {
        //后64段是拓展出来的
        //与sha0的区别就是在拓展这64段的时候增加了左移一位
        //sha0 就是把下面这句注释掉 由于sha0 没有循环位移 导致了有安全问题
        W[t] = SHA1CircularShift(1, W[t - 3] ^ W[t - 8] ^ W[t - 14] ^ W[t - 16]);
        //W[t] = W[t - 3] ^ W[t - 8] ^ W[t - 14] ^ W[t - 16];
    }
    A = context->Intermediate_Hash[0];
    B = context->Intermediate_Hash[1];
    C = context->Intermediate_Hash[2];
    D = context->Intermediate_Hash[3];
    E = context->Intermediate_Hash[4];
    for (t = 0; t < 20; t++) {
        //k0 20轮
        temp = SHA1CircularShift(5, A) +
               ((B & C) | ((~B) & D)) + E + W[t] + K[0];
        E = D;
        D = C;
        C = SHA1CircularShift(30, B);
        B = A;
        A = temp;
    }
    for (t = 20; t < 40; t++) {
        //k1 20轮
        temp = SHA1CircularShift(5, A) + (B ^ C ^ D) + E + W[t] + K[1];
        E = D;
        D = C;
        C = SHA1CircularShift(30, B);
        B = A;
        A = temp;
    }
    for (t = 40; t < 60; t++) {
        //k2 20轮
        temp = SHA1CircularShift(5, A) +
               ((B & C) | (B & D) | (C & D)) + E + W[t] + K[2];
        E = D;
        D = C;
        C = SHA1CircularShift(30, B);
        B = A;
        A = temp;
    }
    for (t = 60; t < 80; t++) {
        //k3 20轮
        temp = SHA1CircularShift(5, A) + (B ^ C ^ D) + E + W[t] + K[3];
        E = D;
        D = C;
        C = SHA1CircularShift(30, B);
        B = A;
        A = temp;
    }
    context->Intermediate_Hash[0] += A;
    context->Intermediate_Hash[1] += B;
    context->Intermediate_Hash[2] += C;
    context->Intermediate_Hash[3] += D;
    context->Intermediate_Hash[4] += E;
    context->Message_Block_Index = 0;
}


/*
* SHA1PadMessage
*
* Description:
* According to the standard, the message must be padded to an even
* 512 bits. The first padding bit must be a ’1’. The last 64
* bits represent the length of the original message. All bits in
* between should be 0. This function will pad the message
* according to those rules by filling the Message_Block array
* accordingly. It will also call the ProcessMessageBlock function
* provided appropriately. When it returns, it can be assumed that
* the message digest has been computed.
*
* Parameters:
* context: [in/out]
* The context to pad
* ProcessMessageBlock: [in]
* The appropriate SHA*ProcessMessageBlock function
* Returns:
* Nothing.
*
*/

void SHA1PadMessage(SHA1Context *context) {
    //填充工作
    
    /*
    * Check to see if the current message block is too small to hold
    * the initial padding bits and length. If so, we will pad the
    * block, process it, and then continue padding into a second
    * block.
    */
    if (context->Message_Block_Index > 55) {
        context->Message_Block[context->Message_Block_Index++] = 0x80; //填充80
        while (context->Message_Block_Index < 64) {
            context->Message_Block[context->Message_Block_Index++] = 0; //填充0
        }
        SHA1ProcessMessageBlock(context);
        while (context->Message_Block_Index < 56) {
            context->Message_Block[context->Message_Block_Index++] = 0;
        }
    } else {
        context->Message_Block[context->Message_Block_Index++] = 0x80;
        while (context->Message_Block_Index < 56) {
            context->Message_Block[context->Message_Block_Index++] = 0;
        }
    }

    /*
    * Store the message length as the last 8 octets
    */
   //进行数值填充高位在前 低位在后 大端子节序
    context->Message_Block[56] = context->Length_High >> 24;
    context->Message_Block[57] = context->Length_High >> 16;
    context->Message_Block[58] = context->Length_High >> 8;
    context->Message_Block[59] = context->Length_High;
    context->Message_Block[60] = context->Length_Low >> 24;
    context->Message_Block[61] = context->Length_Low >> 16;
    context->Message_Block[62] = context->Length_Low >> 8;
    context->Message_Block[63] = context->Length_Low;
    //上面明文拼接完成 下面开始进行真正的计算
    SHA1ProcessMessageBlock(context);
}


#ifdef __cplusplus
}
#endif



void call_sha1() {
    //使用差不多和md5，一共3个函数

    SHA1Context context;
    //初始化
    SHA1Reset(&context);
    unsigned char *plainText = (unsigned char *) "xiaojianbang";
    //压入数据
    SHA1Input(&context, plainText, strlen((const char*)plainText));
    unsigned char result[16];
    //计算结果
    SHA1Result(&context, result);

    //转换16进制
    char temp[2] = {0};
    char finalResult[41] = {0};
    for (int i = 0; i < 20; i++) {
        int index = i;
        sprintf(temp, "%.2x", result[index]);
        strcat(finalResult, temp);
    }
    printf("%s\n", finalResult);
}



int main() {
    call_sha1();
    return 0;
}
