## md5
- 初始化常量4个 
- k表64个 64轮每轮一个
- 输出长度16字节 32个16进制数 有时候输出16个进制数
## sha1
- 初始化常量5个 前四个与md5相同
- k表4个 80轮 
- 输出长度20个字节 40个16进制数
## sha256
- 初始化常量8个
- k表64个 每轮一个 64轮
- 输出长度32个字节 或者是 64个16进制数
## sha512
- 初始化常量8个 每个8字节 所以在ida反编译时有可能编译后是16个初始化常量 每个初始化常量与sha256前面部分是一样的
- k表80个 每轮一个k值
- 输出长度为64字节 或者说 128个16进制数
## mac算法
- 两次加盐 两次哈希的算法
- 特征都是哈希算法 
- 0x36 0x5c 这两个常量 十进制是54和92
- ipad = 0x36;
- opad = 0x5c;
## des的魔改
- 明文的初始置换 和 末置换 去除或者修改 都不影响des的安全性
- s盒 
- 白盒 一般白盒会出现在aes 一般处理方式 就是算法转发 或者主动调用 因为无法拿到密钥 想拿到密钥只能 扣代码 很难还原
## 3des算法
- 密钥是24个字节 等同于与3个des密钥
- 处理流程每次使用一个des密钥，des加密->des解密->des加密 第一段密钥用于加密 第二段用于解密 第三段用于加密
- 若3段密钥都一样 相当于 做一次 des加密  
## AES
- AES128 -> 密钥128位 16字节 10轮运算
- AES192 -> 密钥192位 24字节 12轮运算
- AES256 -> 密钥256位 32字节 14轮运算
- GaloisMultiplication的乘法运算 (0x1B 0x80) 是一个特征
## OPENSSL 
- aes：https://github.com/openssl/openssl
- openssl evp的使用 https://blog.csdn.net/liao20081228/article/details/76285896/
## AES 和 DES 的区别与联系
- 都是对称加密算法 加密解密使用同一密钥
- 都是分组加密算法 DES分组长度是64bit AES是128bit
- DES的密钥是64bit AES是128bit 192bit 256bit
- DES的基本运算单位是bit AES是byte(8bit)
- DES和AES 都可以分为密钥的编排 都会生成子密钥 和明文的运算
- DES和AES 都通过对密钥的处理生成一系列的subkey，每轮运算用一个
- DES有16轮运算 在密钥编排中 生成了16个组组密钥
- AES有10、12、14轮运算，也生成10、12、14组轮密钥，都是每轮用一个
- DES中有很多置换 AES没有
- AES每轮都会有四个步骤 字节代换 16*16的S盒 加解密用不同的S盒
- DES也存在S盒 4*16S盒 共8个 加解密用一样的S盒
- AES第二步循环左移 哈希和DES都有循环左移操作 
- AES按照字节循环左移 哈希和DES按照bit进行循环左移
- AES第三步为列混合 是特有的
- AES第四步密钥异或 DES也有
- 白盒AES的核心是直接把密钥融入到一个表中 这样AES算法演变成一个查表的过程 很难拿到密钥
- 白盒是可以看到源码
- 应对白盒最好主动调用，算法转发，缺点无法脱机，或者unidbg直接加载so