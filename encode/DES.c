

//文档 https://www.anquanke.com/post/id/177808#h3-5
//第一步 密钥生成
//第二步 明文重排
//第三步 明文的运算

#include <stdio.h>
/*------------------------
     定义枚举型全局变量
------------------------*/
typedef enum
{
    false = 0,
    true = 1
} bool;

// 十六轮子密钥
static bool SubKey[16][48] = {0};

/*---------------------*/
/*-------------------------------------------------------------
     各种置换表
-------------------------------------------------------------*/
// IP置换表
const char IP_Table[64] = {
    //明文的编排 初始重排 也可以做成特征 从1开始 编程语言从0开始
    58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4,
    62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8,
    57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3,
    61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7};
// IP-1置换表
const char IPR_Table[64] = {
    40, 8, 48, 16, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31,
    38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29,
    36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27,
    34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25};

// E扩展表
static char E_Table[48] = {
    //用于扩展 明文的运算 扩展
    32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9,
    8, 9, 10, 11, 12, 13, 12, 13, 14, 15, 16, 17,
    16, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25,
    24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1};
// PC1置换表
static char PC1_Table[56] = {

    //用于生成子密钥 常量表 可用于算法识别
    57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18,
    10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36,
    63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22,
    14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4};

// pc2表
static char PC2_Table[48] = {
    //用于生成子密钥 常量表 可用于算法识别
    14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10,
    23, 19, 12, 4, 26, 8, 16, 7, 27, 20, 13, 2,
    41, 52, 31, 37, 47, 55, 30, 40, 51, 34, 33, 48,
    44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32};
//  移位表
static char Move_Table[16] = {
    1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1};
// S盒
static char S_Box[8][4][16] = {
    //有可能会魔改 需要一定的水平
    // S1
    14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7,
    0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8,
    4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0,
    15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13,
    // S2
    15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10,
    3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5,
    0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15,
    13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9,
    // S3
    10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8,
    13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1,
    13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7,
    1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12,
    // S4
    7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15,
    13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9,
    10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4,
    3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14,
    // S5
    2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9,
    14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6,
    4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14,
    11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3,
    // S6
    12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11,
    10, 15, 4, 2, 7, 12, 0, 5, 6, 1, 13, 14, 0, 11, 3, 8,
    9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6,
    4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13,
    // S7
    4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1,
    13, 0, 11, 7, 4, 0, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6,
    1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2,
    6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12,
    // S8
    13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7,
    1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2,
    7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8,
    2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11};
// P置换表
static char P_Table[32] = {
    16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10,
    2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25};
/*-------------------------------------------------------------------*/

/*-----------------------------自定义函数-----------------------------*/
void SetKey(char My_key[8]);                                                  //生成16轮的子密钥；
void ByteToBit(bool *Data_out, char *Data_in, int Num);                       //字节转换成位；
void Change_bit(bool *Data_out, int Num);                                     //二进制的位置进行转换；
void BitToByte(char My_message[8], bool *Message_in, int Num);                //位转换成字节；
void TableReplace(bool *Data_out, bool *Data_in, const char *Table, int Num); //各种表的置换算法；
void Bitcopy(bool *Data_out, bool *Data_in, int Num);                         //二进制数组的拷贝
void Loop_bit(bool *Data_out, int movstep, int len);                          //左移位；
void Run_Des(char My_message[8], char HexMssage[16]);                         // des的轮加密算法
void Xor(bool *Message_out, bool *Message_in, int Num);                       //执行异或
void S_change(bool *Data_out, bool *Data_in);                                 // S盒变换；
void HexToBit(bool *Data_out, char *Data_in, int Num);                        // 十六进制转二进制
void BitToHex(char *Data_out, bool *Data_in, int Num);                        //二进制转换成十六进制；
void Run_desDes(char My_message[8], char HexMessage[16]);                     // DES轮解密算法；

/*--------------------------*/

/*--------------------具体函数定义----------------------*/
void Bitcopy(bool *Data_out, bool *Data_in, int Num) //二进制数组拷贝
{
    int i = 0;
    for (i = 0; i < Num; i++)
    {
        Data_out[i] = Data_in[i];
    }
}

void Change_bit(bool *Data_out, int Num) //二进制的位置进行转换；
{
    int i, j;
    static bool Temp[8] = {0};
    for (i = 0; i < Num / 8; i++)
    {
        Bitcopy(Temp, Data_out, Num / 8);
        for (j = 0; j < Num / 8; j++)
        {
            Data_out[j] = Temp[Num / 8 - 1 - j];
        }
        Data_out += Num / 8;
    }
}

void ByteToBit(bool *Data_out, char *Data_in, int Num) //字节转位
                                                       //字节与比特位转换
{
    int i, j;
    for (i = 0; i < Num; i++)
    {
        Data_out[i] = (Data_in[i / 8] >> (i % 8)) & 0x01;
    }
    // Change_bit(Data_out,Num);
}

void BitToHex(char *Data_out, bool *Data_in, int Num) //二进制转十六进制
{
    int i;
    for (i = 0; i < Num / 4; i++)
    {
        Data_out[i] = 0;
    }
    for (i = 0; i < Num / 4; i++)
    {
        Data_out[i] = Data_in[4 * i] + Data_in[4 * i + 1] * 2 + Data_in[4 * i + 2] * 4 + Data_in[4 * i + 3] * 8;
        if (Data_out[i] % 16 > 9)
        {
            Data_out[i] = Data_out[i] % 16 + '7';
        }
        else
            Data_out[i] = Data_out[i] % 16 + '0';
    }
}

void HexToBit(bool *Data_out, char *Data_in, int Num) //十六进制转二进制
{
    int i;
    for (i = 0; i < Num; i++)
    {
        if (Data_in[i / 4] <= '9')
        {
            Data_out[i] = ((Data_in[i / 4] - '0') >> (i % 4)) & 0x01;
        }
        else
        {
            Data_out[i] = ((Data_in[i / 4] - '7') >> (i % 4)) & 0x01;
        }
    }
}

void BitToByte(char My_message[8], bool *Message_in, int Num) //位转换成字节
{
    int i = 0;
    for (i = 0; i < (Num / 8); i++)
    {
        My_message[i] = 0;
    }
    for (i = 0; i < Num; i++)
    {
        My_message[i / 8] |= Message_in[i] << (i % 8);
    }
}

void TableReplace(bool *Data_out, bool *Data_in, const char *Table, int Num) // 置换算法
                                                                             //由于 重拍算法在des里经常用到 所以封装一个函数了
{
    int i = 0;
    static bool Temp[256] = {0};
    for (i = 0; i < Num; i++)
    {
        Temp[i] = Data_in[Table[i] - 1];
    }
    //把temp数据放到data_out指针中
    Bitcopy(Data_out, Temp, Num);
}

void Loop_bit(bool *Data_out, int movstep, int len)
{
    //循环左移
    static bool Temp[256] = {0};
    Bitcopy(Temp, Data_out, movstep);
    Bitcopy(Data_out, Data_out + movstep, len - movstep);
    Bitcopy(Data_out + len - movstep, Temp, movstep);
    /*Temp=Data_out;
    Temp[movstep]='\0';
    Data_out=Data_out+movstep;
    Data_out+(len-movstep)=Temp;*/
}

void Xor(bool *Message_out, bool *Message_in, int Num)
//执行异或
{
    int i;
    for (i = 0; i < Num; i++)
    {
        Message_out[i] = Message_out[i] ^ Message_in[i];
    }
}

void SetKey(char My_key[8])
{
    //子密钥的生成
    int i, j;
    static bool Key_bit[64] = {0};      // Key的二进制缓存；c语言没有bool 所以用了枚举 表示二进制位
    static bool *Key_bit_L, *Key_bit_R; // C0 D0 分段
    Key_bit_L = &Key_bit[0];            // key的左边28位；
    Key_bit_R = &Key_bit[28];           // key的右边28位；
    ByteToBit(Key_bit, My_key, 64);     //字节与比特位进行转换
                                        /* Change_bit(Key_bit,64) ;//二进制的位置进行转换；
                                         for(i=0;i<64;i++)
                                         {
                                          printf("%d ",Key_bit[i]);
                                         }
                                         printf("\n");
                                         printf("\n");*/
    // pc-1表置换
    TableReplace(Key_bit, Key_bit, PC1_Table, 56); // pc-1 置换
    //进行16轮操作
    for (i = 0; i < 16; i++)
    {
        Loop_bit(Key_bit_L, Move_Table[i], 28);
        Loop_bit(Key_bit_R, Move_Table[i], 28);
        TableReplace(SubKey[i], Key_bit, PC2_Table, 48); // pc-2置换
    }
}

void S_change(bool *Data_out, bool *Data_in) // S盒变换
{
    int i;
    int r = 0, c = 0; // S盒的行和列；
    for (i = 0; i < 8; i++, Data_in = Data_in + 6, Data_out = Data_out + 4)
    {
        r = Data_in[0] * 2 + Data_in[5] * 1;
        c = Data_in[1] * 8 + Data_in[2] * 4 + Data_in[3] * 2 + Data_in[4] * 1;
        ByteToBit(Data_out, &S_Box[i][r][c], 4);
    }
}

void F_change(bool Data_out[32], bool Data_in[48]) // f函数；
//关键算法
{
    int i;
    static bool Message_E[48] = {0};                //存放E置换的结果；
    TableReplace(Message_E, Data_out, E_Table, 48); // E表置换
    Xor(Message_E, Data_in, 48); //异或密钥混合

    S_change(Data_out, Message_E);                 // S盒变换
    TableReplace(Data_out, Data_out, P_Table, 32); // P置换
}

void Run_Des(char My_message[8], char HexMssage[16]) // des轮加密算法；
//明文的初始置换 和莫置换 可以 进行魔改
{
    int i;
    static bool Message_bit[64] = {0};
    static bool *Message_bit_L = &Message_bit[0], *Message_bit_R = &Message_bit[32];
    static bool Temp[32] = {0};
    ByteToBit(Message_bit, My_message, 64);
    /*Change_bit(Message_bit,64) ;//二进制的位置进行转换；
    for(i=0;i<64;i++)
    {
     printf("%d ",Message_bit[i]);
    }
    printf("\n");
    printf("\n");*/
    //进行ip表重排 明文的初始置换
    TableReplace(Message_bit, Message_bit, IP_Table, 64);

    //进行明文的运算
    for (i = 0; i < 16; i++)
    {
        Bitcopy(Temp, Message_bit_R, 32);
        F_change(Message_bit_R, SubKey[i]);
        Xor(Message_bit_R, Message_bit_L, 32);
        Bitcopy(Message_bit_L, Temp, 32);
    }
    //明文的末置换
    TableReplace(Message_bit, Message_bit, IPR_Table, 64);
    BitToHex(HexMssage, Message_bit, 64); //二进制转换成十六进制；得出密文
}

void Run_desDes(char My_message[8], char HexMessage[16]) // DES轮解密算法；
{
    int i = 0;
    static bool Message_bit[64] = {0};
    static bool *Message_bit_L = &Message_bit[0], *Message_bit_R = &Message_bit[32];
    static bool Temp[32] = {0};
    HexToBit(Message_bit, HexMessage, 64);
    TableReplace(Message_bit, Message_bit, IP_Table, 64);
    for (i = 15; i >= 0; i--)
    {
        Bitcopy(Temp, Message_bit_L, 32);
        F_change(Message_bit_L, SubKey[i]);
        Xor(Message_bit_L, Message_bit_R, 32);
        Bitcopy(Message_bit_R, Temp, 32);
    }
    TableReplace(Message_bit, Message_bit, IPR_Table, 64);
    BitToByte(My_message, Message_bit, 64);
}

int main()
{
    int i = 0, j;
    char My_key[8] = "87654321";     //记录加密密钥；
    char You_key[8] = "87654321";    //解密密钥
    char My_message[8] = "12345678"; //明文
    char Message_hex[16] = {0};      // 16进制的密文
    //当明文长度不够一个分组时就需要填充 此脚本 没有 关于填充的 部分
    //pkcs47填充为例
    //当明文没有内容或者明文刚好是一个分组时 会自动填充一个分组 填充的是 08 。。。。
    //如果明文是7个字节 则会填充 02 明文是6个字节就会填02 1个字节 就是 07 知道 8个字节
    //如果输入的是半个字节  会默认 前面补0 凑成一个字节 之后再填充 
    //des的密文长度是8字节的倍数 密钥不存在填充 des密钥必须是8字节 如果不是8字节 会报错 因为 子密钥 无法生成

    //若明文超过8字节时 就需要了解一下加密模式
    //加密模式有ecb cbc cfb ofb ctr
    //ecb 和 cbc 比较常用 最常用的的是 cbc 其次是 ecb 之后是cfb ofb 
    //ecb 每个分组 单独加密 互不干涉 先加密 明文前8个 之后在加密后8个字节 所以当 两个分组的明文一样时 结果也一样 所以 ecb 很少用了 可以分段解密
    //cbc模式 引入了一个iv初始化向量  cbc 可以用ecb方式实现
    //cfb模式 也引用了iv 先对iv进行des加密 将加密的结果 与 明文做异或 得到最终加密结果 而且不会进行 填充
    //ofb模式 也引用iv 一个分组时与cfb是一样的 如果是多个分组 把iv加密两次 之后 与明文做异或
    //cfb或者ofb均可以做流加密





    SetKey(My_key); //生成16轮的加密子密钥； 生成子密钥
    // My_message明文 Message_hex 一个用来接收加密后的结果
    Run_Des(My_message, Message_hex); // des的轮加密过程 明文编排 明文的运算
    printf("经过加密的密文为:\n");
    for (i = 0; i < 16; i++)
    {
        printf("%c", Message_hex[i]);
    }
    printf("\n");

    SetKey(You_key);                     //生成16轮的解密子密钥；
    Run_desDes(My_message, Message_hex); //解密;
    printf("解密结果为:\n");
    for (i = 0; i < 8; i++)
    {
        printf("%c", My_message[i]);
    }
    printf("\n");
    return 0;
}