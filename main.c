//
// Created by Administrator on 2021-08-10.
//
#include <string.h>
#include <stdio.h>
// #include <iostream>
#include <memory.h>
#include "MD5.h"
#include "SHA1.h"

void call_md5() {
//    void MD5Init(MD5_CTX *context);
    MD5_CTX context;
    MD5Init(&context);
//    void MD5Update(MD5_CTX *context,unsigned char *input,unsigned int inputlen);
    unsigned char *plainText = (unsigned char *) "xiaojianbang";
    MD5Update(&context, plainText, strlen((const char*)plainText));
    // MD5Update(&context, plainText, strlen(plainText));
//    void MD5Final(MD5_CTX *context,unsigned char digest[16]);
    unsigned char result[16];
    MD5Final(&context, result);

    char temp[2] = {0};
    char finalResult[33] = {0};
    for (int i = 0; i < 16; i++) {
        int index = i;
        sprintf(temp, "%.2x", result[index]);
        strcat(finalResult, temp);
    }
    printf("%s\n", finalResult);
}

void call_sha1() {
    SHA1Context context;
    SHA1Reset(&context);
    unsigned char *plainText = (unsigned char *) "xiaojianbang";
    SHA1Input(&context, plainText, strlen((const char*)plainText));
    unsigned char result[16];
    SHA1Result(&context, result);

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
    call_md5();
    call_sha1();

    return 0;
}
