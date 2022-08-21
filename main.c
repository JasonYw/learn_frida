#include <string.h>
#include <stdio.h>
#include "MD5.h"
#include "SHA1.h"
#include "SHA256.h"
#include "SHA512.h"
#include "HMAC_MD5.h"

void call_md5() {
    MD5_CTX context;
    MD5Init(&context);
    unsigned char *plainText = (unsigned char *) "xiaojianbang";
    MD5Update(&context, plainText, strlen(plainText));
    unsigned char result[16];
    MD5Final(&context, result);

    char temp[2] = {0};
    char finalResult[32] = {0};
    for (int i = 0; i < 16; i++) {
        int index = i;
        sprintf(temp, "%.2x", result[index]);
        strcat(finalResult, temp);
    }
    printf("md5：%s\n", finalResult);
}

void call_sha1() {
    SHA1Context context;
    SHA1Reset(&context);
    unsigned char *plainText = (unsigned char *) "xiaojianbang";
    SHA1Input(&context, plainText, strlen(plainText));
    unsigned char result[20];
    SHA1Result(&context, result);

    char temp[2] = {0};
    char finalResult[40] = {0};
    for (int i = 0; i < 20; i++) {
        int index = i;
        sprintf(temp, "%.2x", result[index]);
        strcat(finalResult, temp);
    }
    printf("sha1：%s\n", finalResult);
}

void call_sha256() {
    SHA256_CTX context;
    sha256_init(&context);
    unsigned char *plainText = (unsigned char *) "xiaojianbang";
    sha256_update(&context, plainText, strlen(plainText));
    unsigned char result[32];
    sha256_final(&context, result);

    char temp[2] = {0};
    char finalResult[64] = {0};
    for (int i = 0; i < 32; i++) {
        int index = i;
        sprintf(temp, "%.2x", result[index]);
        strcat(finalResult, temp);
    }
    printf("sha256：%s\n", finalResult);
}

void call_sha512() {
    SHA512_CB context;
    SHA512Init(&context);
    unsigned char *plainText = (unsigned char *) "xiaojianbang";
    SHA512Update(&context, plainText, strlen(plainText));
    unsigned char result[64];
    SHA512Final(&context, result);

    char temp[2] = {0};
    char finalResult[128] = {0};
    for (int i = 0; i < 64; i++) {
        int index = i;
        sprintf(temp, "%.2x", result[index]);
        strcat(finalResult, temp);
    }
    printf("sha512：%s\n", finalResult);
}

void call_hmac_md5() {
    unsigned char* plainText = (unsigned char *) "xiaojianbang";
    unsigned char* key = (unsigned char *) "a12345678";
    unsigned char result[16];
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

int main() {
    call_md5();
    call_sha1();
    call_sha256();
    call_sha512();
    call_hmac_md5();
    return 0;
}
