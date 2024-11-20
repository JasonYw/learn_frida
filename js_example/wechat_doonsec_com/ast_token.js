const parser = require("@babel/parser");
const traverse = require("@babel/traverse").default;
const types = require("@babel/types");
const { count } = require("console");
const generator = require("@babel/generator").default;
const fs = require("fs");
// 需要解码的文件位置
let encode_file = "token.js"
// 解码后的文件位置
let decode_file = "decode_token.js"
// 读取需要解码的js文件, 注意文件编码为utf-8格式
let jscode = fs.readFileSync(encode_file, {encoding: "utf-8"});
// 将js代码修转成AST语法树
let ast = parser.parse(jscode);
//引入解密函数
var _0xf9ef = ['w7zCmRo9w6k=', 'bcKfwrwzQQ==', 'wpbCqsKdw7Ze', 'asOCDcODTw==', 'd8KVwqYqag==', 'CVLDnDk/', 'w5XCsiASw6U=', 'w7rDvh7CqgfClkUVwooLFg==', 'D8ODKVnDrMOJw6U=', 'w6ZJwqQXIsKgTg==', 'L8OuGjzDkA==', 'wqJWwrnCqMKp', 'e3Y1aH0=', 'QMOdw4x2w6NoOCzCpWXChE3CryQs', 'w494wrXCncOa', 'w7DDminCtCQ=', 'D8OtwoTCilM=', 'fFkEdnU=', 'bsKzw7TCtVg=', 'Yl1BH8Ku', 'P1LCmsOMOA==', 'ZhjCr8KreA==', 'KVXDt8KSHw==', 'DErDgg==', 'ZETCiMKSw64=', 'CMOHw7fCn0Y=', 'UsKPwoM4WMKqwpTClMOjSXnDrmLCim3DoA==', 'bm7CoGjCvg==', 'w5NTwqMFIQ==', 'w7bDrEPDkcO2', 'wrF4RsO8wrg=', 'wrUpOMOWwqw=', 'wqgvw6MCw6w=', 'DsOTw5DCuFM=', 'NsOnKVnDtw==', 'w4RlwrXCr8OB', 'w5wZwrsawqE=', 'P3bDl8KJHA==', 'CMOoDTjDkw==', 'G8KWw5dPwp4=', 'YETCucKxw7E=', 'O8O4w5rCj1I=', 'CsOfAUDDpw==', 'C8K8w7FTwoTCoMODZjA=', 'cW7ChXI=', 'w6TDh8Olw47CksO2', 'wpNowrnCiMKj', 'wq1IwoDCg8KC', 'w5DDqzLCiDc=', 'KnZWFng=', 'SMKnw4LCkXE=', 'UcKBLMOuw68=', 'b3tNCQ==', 'wp8Rw4LCssOEWD15UEwnw73DlMKww5LCglXCmsKzwrbDpQ/DtQZJw5fCoh43PcOYw60=', 'KsOeFS3Dvw==', 'GsKhw6FC', 'w7XDvhc=', 'K8KOc8OHGg==', 'GMOUwpbCl1o=', 'w6ZJwqcUP8K+XsKsWsO9w6E=', 'WMKMIlQ=', 'N8KWY8OQLQ==', 'csOhPMO4dA==', 'w7QyY8KQVg==', 'IU3DrzAS', 'e8KMwooSXg==', 'c8OzLsKTw7wVJA==', 'PVzDuMKVFQ==', 'Jmtpw6LDhA==', 'bxVrOF4=', 'YsKfw4TCqWc=', 'w5pAwpjCvsOi', 'TsKrwqUKRA==', 'RBdZIsO6', 'VlXCglPCmg==', 'wrTDgsKLOcOD', 'Tgt3NGY=', 'C8OLIlg=', 'w7bDkMOww5PCmMOXwqDDssKuw7zCnQ==', 'HsOaw6bCi3s=', 'w63DiMOcLHc=', 'UcOAw4t5w7IhfzbDtzrCvUzCr3UNGQ==', 'LU3DpMKONQ==', 'w6jDkcOGHXQ=', 'w7HDl1fDn8Ob', 'wocDwoLCosOfRDtuVlY2', 'wolawoPChsKt', 'HmnDiMOMfA==', 'H8OpPW7Dlw==', 'R8KcKcOPasO8dsOrJnk0wohVwqcIfQLDpMOk', 'w4HDjcOYBkzCiQc=', 'bcKewq4qdQ==', 'w5wWacKdUw==', 'w4LDnMOew7PCsA==', 'aBRqHcOd', 'w7NxwrEtHw==', 'ZXpFFcKkw44Y', 'dFTCkcKqw4c=', 'w6TDnMO3w7/CuA==', 'wpdBY8OKwrgaKw==', 'IFbCgsOGOA==', 'OWHDrcO7Yw==', 'A8KBacOd', 'w6oZw5PCpMOM', 'w4vCpRc0w7g=', 'w5RZwozCncOX', 'AcOLwo3Ct1U=', 'wqY0JsOUwrrDh2o=', 'w4lVwpAGMg==', 'UMK2w7nCtWo=', 'Lm/DlsKACQIhQMOK', 'wrPDscKtCcOr', 'wo3DscKoNsOF', 'w7ghwr8xwpc=', 'DcKrw7xFwpvCuMOP', 'dUXCvMOpw7s=', 'wqcJwq7CsMOD', 'GVJiAGc=', 'RHHCjMOsw6w=', 'F8KIQ8OWKA==', 'QwrCicK7aQ==', 'wrM1C8OSwoA=', 'WW3CnMOSw5g=', 'T2xdIsKC', 'bUvCusKHw4g=', 'Y8KuA1fDgQ==', 'PMKHWsOFLw==', 'w6fDvsOiw7fCmQ==', 'N8OFAyrDhA==', 'wrLCrsK0w4NE', 'EcOTwrnCu1Q=', 'w6xHwpvCgMOC', 'AlDDrMKkPg==', 'QnJANMKF', 'UsOFw41Nw7Y=', 'DHJSLmU=', 'Kn9Fw7vDuA==', 'w5PCiAQ6w4A=', 'ccKUwqseZA==', 'T8KCE8Oww7Y=', 'VcOyBsKlw5s=', 'C8KMw7lcwq0=', 'H8KhU8OfMA==', 'dSnCg8KJSA==', 'K1FUGVE=', 'ezVZCcOO', 'QMKADsONw7k=', 'XnTCtnrCog==', 'w6bDi8O/w5TCksO0wqc=', 'w7MFwoI1wpM=', 'wpYJwpjCpMOZWG4iABlvwqnDj8KqwpPDkwfDlMOnw6HCuA==', 'QWQRWUI=', 'FcKQa8OfJA==', 'eMKKwrouRg==', 'NkfDogY9', 'CEVjGw==', 'EMO3w4fCil4=', 'IcKKV8OnJg==', 'UsK0wq8UXg==', 'OmfDl8KNNQ==', 'M2HDusKnNw==', 'w5h6wobCgMOZ', 'wrwLw6EKw4A=', 'woTDlsKL', 'FlDDiRcd', 'QMOdw7F4w6g=', 'N8O3BxbDkA==', 'M1Z3Jmc=', 'w4g4SMK+Uw==', 'UsONw4Z/w7Y8eTfCuQ==', 'VMOaw4tpw6kkdQ==', 'DlXDjRM3', 'wpILw4ERw7c=', 'w7zDowLCtgE=', 'wpFEfMO9wpE=', 'w5nDmxLCrSc=', 'wo7DucK2C8OL', 'w7HDtcOfw4TCug==', 'KcOmwpDCnEM=', 'KsOOBUbDqg==', 'ZRdgD8OR', 'CcK3w6FFwq4=', 'wrg7w4QLw7A=', 'KsOjAwfDmA==', 'w7DDlj7CsDk=', 'TnJTK8Kg', 'wpUwwoDCgsKqLnkVwqgjw5HCsGJpwqnDmEbDrwc=', 'w6HCtD8Xw4k=', 'woY1w4ALw7E=', 'wpMRw4A2w5Q=', 'wq57wobChcKl', 'F8KJX8ORNw==', 'w6sGw5zChMO1', 'JXvCscOdEA==', 'w6DDkcO+w67ChQ==', 'Bn3DpMKDDQ==', 'UnXCnMKww6A=', 'wpYJwpjCpMOZWG4lREwqw6rDj8KrwpXDjg/DlsOn', 'cMOBDcOAw41Ofk4UQG9taX3CmEfDi2w0R1Nkw6nDrcOlwq3Dj8O0woY0wprDnsOUCQfCugzDtcKE', 'OcO9FVrDsw==', 'w5kpw4bCig==', 'V8KVwoArRcKvwp4=', 'G8OoGTHDscKoFMKGK8K0OQ==', 'e2jCgnTChQ==', 'w6wkw7/CrsOp', 'OlhZw7jDsQ==', 'wrnCqMKRw69cw7YK', 'eAtnAw==', 'N3t8w4vDgQ==', 'woF8SMOAwr0=', 'wr1Vwr3CvcKW', 'w441worDmcOb', 'KmF0w4zDsg==', 'OlDDosKtDg==', 'w53Cmx4Jw4w=', 'QcOOYw1Lw5vDg07DucKQw5BCbkTDmxxfEwpvFMOjEMOENsOzYsOucxLCkkfDgMK2eEkjw7TDog==', 'wrxJTMOPwqU=', 'b2jCt3/ChQ==', 'w4nDsFbDj8Ol', 'H8OwExTDhA==', 'wqQrOMOLwqw=', 'd0HCpMOyw6U=', 'woI8HcOwwrw=', 'wqsrw4s5w6c=', 'w4jDvhLClCI=', 'R8K5wq/DkcO8', 'UHTCkMO5w50=', 'X3bClsKiw6w=', 'wodeYcOQwqM=', 'wpfCtMKTw798', 'w7DCtyw2w5U=', 'VW9vD8K/', 'OcOrMVvDlA==', 'ZSBaFmjDhA==', 'McKga8OYKQ==', 'dcKuwqM+bQ==', 'wrVlwoDCg8K6', 'wpsOw6Evw4Q=', 'QsOCw49Nw4E=', 'OkhEGFw=', 'w7jCihoMw4g=', 'EcKsaMO4KA==', 'J8KDw4t3wrM=', 'w4hAwpbCv8Ok', 'OEbCvMOlJg==', 'YMKVBMOdw7c=', 'FcONLSfDhw==', 'w6c5wpYywq4=', 'WMKbMEPDvQ==', 'w54Jw4/CusOI', 'cH9gPsKl', 'w7Y2wpQ9wr8=', 'w73Diz/DncOaaBXCrcKCwoXDlMKTUCLCiSxAwrNFwq1VWcOWB03DoXRAw4A+wrDDgg==', 'w6fDhmHDksOM', 'CsOePy3DkA==', 'w7AGTcKxXg==', 'W8KawqDDvsOG', 'V3UMZ0g=', 'WsOVDcKLw5w=', 'azZIMmI=', 'w41twq7Ch8Og', 'wo7Cu8Ktw7li', 'w63DtAPCrQ==', 'OcO/BF7Dug==', 'wrwqJMOiwqQ=', 'wpFLYsOfwrw=', 'Z8OAAsO3Sg==', 'AMO7wpjCh00=', 'w4zDlcOSw6vChw==', 'VsKKw6zCiHk=', 'w6zDk8Oow77CpQ==', 'wpUvwr/CoMOE', 'w5gawpHDtcOy', 'C1vDm8OkfQ==', 'NMOJIgvDog==', 'w4DDnRjCgR8=', 'FEjDjcOufQ==', 'w5cCwogJwpY=', 'w49owpw1IA==', 'FUFLw7vDnw==', 'ay94KFY=', 'w6RWwrkLMg==', 'OsOww6bCl34=', 'w6YYw4DCtcOL', 'R8OHw5Vrw78=', 'UMKfwo8uSw==', 'XsKDNkjDjw==', 'F8KXw5NhwrY=', 'w74nw6LCpsOF', 'woMDwqLCv8Oa', 'SsKyeBhL', 'wpVYYsOuwp0=', 'YsK3DsO7w5I=', 'e8KLP0vDkQ==', 'w5d/wqsIMQ==', 'wqrCrMKHw5dQ', 'SBHCnsKJZg==', 'w6nDp1zDqsOi', 'ZcOzw5V5w7U=', 'CsKCYsOVHA==', 'wrYpJsOQwqw=', 'w709wpPDuA==', 'TsKQEnDDjg==', 'UMOew4F1w6g=', 'DEJFw4XDkA==', 'QcK/J8OEw7U=', 'w4w6w5rCqcOW', 'wp/CpsKGw7Be', 'wq3Cv8KLw4xM', 'w4rDhXjDksOt', 'azjCusKUfQ==', 'QMKTwprDtsOJ', 'w5/CiC8ww7I=', 'DEbDtBgW', 'J3vCvsODAw==', 'wqArIMOwwqU=', 'RcOQw5Fvw7QmMHDCsWXCjwfDuzY+XjMSPg==', 'w55WwpDChA==', 'w5/DvgHCtz0=', 'YcKMWBh/', 'GGDCoMO3FQ==', 'ci1vHsOV', 'w59vwrHCvcOO', 'UsKgwrwwYA==', 'VlPCjsKmw4Y=', 'BcK6XcOhHA==', 'w5EmSsKySg==', 'P8OdMTbDrA==', 'bcKFKcOkw6s=', 'VcKWw7fCjWg=', 'W2ckeVo=', 'V8KFwq/DjMOB', 'VXMkUV8=', 'w6jDicOCw5HCnw==', 'U8Krw6nCrXw=', 'KsKew4VYwrU=', 'B8OGPRLDvA==', 'w7PDlzbChgM=', 'XMKxMMOmw6g=', 'Z8KMwoHDncOZ', 'w79Awo7CosOV', 'aMKGNsO7w4Y=', 'w4dOwrbCjMOV', 'GUDClsOPPQ==', 'dQBjGcOT', 'w4jDvRbCtx8=', 'Hhl3w7fCqFrDn8KVwp84wrReQcKINsKtQUIFccKyw73Cm8K+', 'w43DkFXDs8OY', 'wrheWsOMwr0=', 'IjBHGGnClw==', 'BVLCp8OrPQ==', 'w7Ehw4/DtcOuw75IPMKmVcKjAmwqMMKya8Khw5LDjg/ClcOlPW/DglzDl8KtUsKXwrU=', 'OMKxw7hUwp4=', 'EcOkNQjDjQ==', 'wrDCocKzw4N5', 'bsKlwq3Dq8Og', 'dBdzA8OG', 'R8KwJMOUw60=', 'w70gw57CncOr', 'RcKGwojDr8OX', 'YMKLwqDDisOF', 'dilJF1A=', 'w67DrFPDmcOC', 'IcOte8OoPcOyPzF2bTXCnMKewpvDqA==', 'csKVwoYcRQ==', 'QwXCu8Kpbw==', 'D8O1w5fCrUo=', 'w4IfwoXCtsOFCw==', 'PcKKccOBOw==', 'wooZw6A0', 'FsK8w6BTwpo=', 'wpxhT8ObwpA=', 'w4PDjMOFw5DCtA==', 'T8Kpw7jCh1o=', 'DE98CWE=', 'w7PDjsOQG08=', 'w6cFZMK+dQ==', 'eVbCj8O+w40=', 'fjvCtMKZRg==', 'LsOJETXDrw==', 'NMKzw55gwpA=', 'wqtUwqzCrcK6', 'KcKjT8O2OA==', 'wrhdZMOVwo8=', 'e8OBw6lsw7Q=', 'w5TDl8OaAlk=', 'XsKYUjRA', 'w4kpw5fCiw==', 'NsOofQ==', 'w5bDg8OUGUY=', 'FsO3HzHDlQ==', 'wrsqw5gFw5k=', 'ecKRw43CjmIzw4o=', 'w6cUwq0wwo4=', 'LcOfEWfDlA==', 'wrYkwoc0wqhV', 'bsKfXQ1u', 'IsKow47ChT8fw7tjwrUvP8OfIMKlwq3Dl8KTw6fDjcOwwpzCmmfDgg==', 'ZsODCcOtZw==', 'w5LDqjnCsgY=', 'cUHCisKCw7Q=', 'UcObw7xgw5A=', 'TcK5F8OKLcOTJWVjOl3CvsKIwrrDtz9yAsOaJsKDScOkw78=', 'woUcwpzCvcOS', 'wrvDo8KZJMOi', 'dcOROsKIw6k=', 'w4p0wr/Ci8Or', 'w6cLWcKZVQ==', 'QMKVwoXDjcO6', 'w7fDrMOGw6bCjg==', 'w6Iow5fClsOE', 'w7fDuSfCpD8=', 'McKOTsOfIw==', 'VcO3w6dtw6A=', 'woBLfsON', 'w589woQKwpI=', 'G8Olw6HCj3YvwrU=', 'V8KVwpg1WMKmwok=', 'wrJaWMOewp4=', 'f8K2w4vClFI=', 'W8KUw5LCl00=', 'A1zDqcOcQg==', 'w5bDggPClh4=', 'GlXCgMOSA8OabcKsw7wFW8OhR1FTw6fCuSxZU0I=', 'MsOPwr7CsVc=', 'wo0iwrbCtcOb', 'RsKnOHLDqA==', 'OUDDmMOZRA==', 'bGHCgXHCjg==', 'w5sfwrDDrsON', 'XVEwZmE=', 'w5fDlcOcImQ=', 'JcKBw5d4wpc=', 'dcO2w5Bbw60=', 'TA3Cg8KJU8K3CA==', 'UV5IJMKj', 'w6/DmHjDig==', 'AF/DmA==', 'woV8Y8OewpU=', 'BcOGwqHChknDtMKf', 'wpJOwpDCosKh', 'wrcpw5oTw4E=', 'QcK9FcOhw68=', 'VkUFe10sDRjCjQ==', 'BXJZKHc=', 'LlZoB30=', 'w5UVw63CncO5', 'AWPDhMKEOw==', 'SsOXLsKTw6c=', 'dUk8dV0=', 'wrI1MMOGwr0=', 'KsODNkTDjQ==', 'DHBEP3E=', 'IMOCChbDhA==', 'c8KQw4bCkQ==', 'UFPCj8K7w48=', 'LVpXKW0=', 'Am7Dg8KhMA==', 'fSTCncKZTw==', 'CMKoXMORPw==', 'wrA4wp3CtcOn', 'w7HDo8Ozw6PCpA==', 'w7jDoQDCtQo=', 'WlMAcQ==', 'fsODw61Aw4A=', 'cE/CoX/CrA==', 'D8K0w6Jawo0=', 'R3AyVX4=', 'w5dtwpHCgMOE', 'QsKrwoTDqMOR', 'LMKHw6d3wp8=', 'akgWXGs=', 'fcKXJMO7w5o=', 'DcOrBibDucO4w6g=', 'I8K4bMOBMw==', 'w4sCw7fCscOu', 'F8KzIwLDpMOzw65owrFMRmPDisOOW8KGJ8OnwoZUw4TDlsOBO8KOWMKWw7I5w6sgch17WMOswosyw7U=', 'FMOvEwPDkA==', 'cBVxAMON', 'MEfCnsOeIQ==', 'IsOMGTHDsQ==', 'w4cmwqolwoI=', 'IcKGw6ZewrU=', 'NMOmw6PCulY=', 'c8OzLsKTw6cLNMOgE15u', 'wp/DmcKRDcOdwoLDgw==', 'w4AGw6/Cm8Oe', 'dnpHAMK/', 'UENtH8Km', 'w6DDhVfDlMOR', 'GWHDjcKNEQ==', 'B8KKw4hSwoQ=', 'K8OXGiPDjg==', 'JMOYM23Dsg==', 'w6rDpDLCryY=', 'V3pJK8Ka', 'RWjCk8Kgw7FmAk13w4Yq', 'OMK0ScOwOA==', 'ZVLCv8O/w7k=', 'dG/ChA==', 'HMOvJzzDoA==', 'GcO+AlPDqQ==', 'X8KWZjRI', 'ecO1JsKqw58=', 'H8OsEy3Dqw==', 'wq8Ew7clw6Q=', 'R8K/FGfDgQ==', 'PUhaP2A=', 'L8KCew==', 'XBLCgcKTSA==', 'w7HDl2PDkA==', 'XBbCjMKOWcKUDypJwpPDkQ==', 'VcKkwojDnsOp', 'w69uwp7Ch8OZ', 'PsKCZcOVPgMcbcKu', 'e8K9FsOVw40=', 'TsKuUBBt', 'BEDDhxUA', 'w7bDlMO9w47CiQ==', 'PVNGIkI=', 'LcOYEWjDuQ==', 'ElB4HEU=', 'wr/DgMKHHcOC', 'w67DuVPDnMOy', 'wqZlwqLCmcKr', 'wp1AfcOMwqM=', 'wqgyw7U3w5w=', 'V8KVwoMoQ8Kvwp4=', 'woBcbMOawrI=', 'c8K1bw50', 'csKwZTF2', 'UMKGwqPDssOA', 'w4XDlylwwqLDjsKNIsOjw6PDsGdMaDJywrTCihwHCMKpwq1pw5I8w6QgH0LDk8O+UsK+', 'wp/CucKzw7lP', 'T8O8w7ZRw4E=', 'wqoKBcOzwoI=', 'CcOdMRDDhA==', 'w6o0w7rCqsOR', 'f8O+Kw==', 'w4DDtVXDnMOB', 'D8OBw7bCmVk=', 'wq7CosKJw51B', 'R3fCjcK/w7w=', 'w5jDpRLClzI=', 'D1jDp8OuZg==', 'aFJKO8OGBcKFwp5sPsKkJALCry7DusKnwrfCosK1D8KaUMOzw6h/LsOew6ZHCcOhEcKMWUzCm8OgwqA=', 'ecK6ElTDoQ==', 'V8KbwoE3', 'fMOhw5BRw5E=', 'RH7CvsKDw5M=', 'w5jClxYQw6k=', 'wrLCusK3w6p0', 'L0tHN0w=', 'w7XDhn3Dl8OB', 'w5HDmBHCijk=', 'w5TDiMO9LU0=', 'AUJ6w6TDnw==', 'w7rDvh7CqhzCiFU=', 'UWnChcKyw60=', 'P2DDksOqWA==', 'w4ZFwpsfAQ==', 'XixqPlc=', 'YnfCoFjCkQ==', 'wqBbwq3Cng==', 'wrYxw5EOw7I=', 'w7rCkxsow63CiMOA', 'L1PDrcOzWQ==', 'A03DhAkJ', 'w6rCiTctw5c=', 'wq8pwqnCn8OI', 'DEPCm8OUJQ==', 'MEVZw57DnA==', 'wpvDk8KLKsObwoPDgw==', 'w7XDpMOBJFI=', 'woRBd8ODwoE=', 'dFXCscOVw6Q=', 'YTfCqErCmWM3d8KVd8KsD8KwH8OKC2bCusKcwpBkOQbDjxjCghXCosKwKMKCHcOlJsOlIsOtDsON', 'LkDCh8OrEA==', 'KcOEJjrDiQ==', 'wqnCrMKXw5U=', 'wq5BScO4woc=', 'T8K6EMK/LcKkJnJ5SmfDjcOSwqbDsUwGD8KsJsOtRMKAw6MIBsK4wpHCicOJw7UHw61R', 'A8KGw7Fjwo0=', 'XsKhBmHDqw==', 'w5TDkyLClSI=', 'w5fDvcOzw4jChw==', 'GmPCscOEPQ==', 'VMKefglq', 'N8KfaMOXOh8=', 'LMKCwpDCgj4jwp5swr3Dl8KBTjrClsOx', 'JcOkw5bCqkY=', 'w6kzwo/DpcOuw7xe', 'HsOHCEPDtQ==', 'wrUaw5cNw5s=', 'w4IEwoIqwoQ=', 'PsONHjjDrA==', 'TDDCgcKcaQ==', 'XRvCq8KwUg==', 'w7sqw4DCqcOL', 'VEoCSGw=', 'fFUxbU4=', 'WcK4wqdKw43CqMKadW0qJcKFFMOLVHJvTsO4', 'S8KNWjNXw5s=', 'w6c2wqgywqg=', 'U8KGwp7Dr8OCAcOJw7rDo8OUwq9+w6LDh8OaaB3DpMKW', 'a2nCilHCmQ==', 'ZgRzAg==', 'w4rDgMOzw4/CpQ==', 'YXLCnMOdw6w=', 'XMKcSi8=', 'KsOiw5LCvUU=', 'w6vCmQEuw7DCisKFMsO7wpjCumpCQXZbw4vChWF+Fw==', 'w682wpDDksOH', 'w5M0wrwrwow=', 'ck/CsMOvw7N6w5E=', 'w6/Dmj3CqR8=', 'DcOcN0bDug==', 'w7bDkDbCiwI=', 'IsKmf8O8FA==', 'w4rDtcOQBXo=', 'wqY0JsOUwqHDmXrCm8K7aiA=', 'EXfDiwcl', 'WlMPag==', 'w5PDnRrClATDmSA=', 'wpAMEMOewoQ='];
(function (_0x4138fe, _0xf9ef5b) {
  var _0x2232f0 = function (_0xf194ec) {
    while (--_0xf194ec) {
      _0x4138fe['push'](_0x4138fe['shift']());
    }
  };
  var _0xd82da5 = function () {
    var _0x53e49d = {
      'data': {
        'key': 'cookie',
        'value': 'timeout'
      },
      'setCookie': function (_0xe5b546, _0x371a95, _0x41b326, _0x50163e) {
        _0x50163e = _0x50163e || {};
        // var _0x16c68c = _0x371a95 + '=' + _0x41b326;
        // // console.log(_0x50163e)
        // var _0xe6ec2e = 0x0;
        // for (var _0x3963dd = 0x0, _0x1e45f6 = _0xe5b546['length']; _0x3963dd < _0x1e45f6; _0x3963dd++) {
        //     var _0xab9f18 = _0xe5b546[_0x3963dd];
        //     _0x16c68c += ';\x20' + _0xab9f18;
        //     var _0x3fbcb5 = _0xe5b546[_0xab9f18];
        //     _0xe5b546['push'](_0x3fbcb5);
        //     _0x1e45f6 = _0xe5b546['length'];
        //     if (_0x3fbcb5 !== !![]) {
        //         _0x16c68c += '=' + _0x3fbcb5;
        //     }
        // }
        // _0x50163e['cookie'] = _0x16c68c;
        _0x50163e['cookie'] = 'UM_follow=True; UM_distinctids=rvvr; session=eyJfcGVybWFuZW50Ijp0cnVlLCJjc3JmX3Rva2VuIjoiNDM4ZTI5YWJmMWIxZTkxNGJkNjE2ZTdkNGFhODk5MjY1MTA0ODg5MCIsInZpc3RvciI6IlJ2dnJOY0Q2TkN3bjVEQnBKZFJ3VGcifQ.Zep5gw.Pze-9EMmyqLS24sXEp2Xao5ACaU';
      },
      'removeCookie': function () {
        return 'dev';
      },
      'getCookie': function (_0x46bd00, _0x5a4645) {
        _0x46bd00 = _0x46bd00 || function (_0x387111) {
          return _0x387111;
        };
        var _0x46fa92 = _0x46bd00(new RegExp('(?:^|;\x20)' + _0x5a4645['replace'](/([.$?*|{}()[]\/+^])/g, '$1') + '=([^;]*)'));
        var _0x1f2ec6 = function (_0x46d660, _0x2d71bd) {
          _0x46d660(++_0x2d71bd);
        };
        _0x1f2ec6(_0x2232f0, _0xf9ef5b);
        return _0x46fa92 ? decodeURIComponent(_0x46fa92[0x1]) : undefined;
      }
    };
    var _0x453459 = function () {
      var _0x27f013 = new RegExp('\x5cw+\x20*\x5c(\x5c)\x20*{\x5cw+\x20*[\x27|\x22].+[\x27|\x22];?\x20*}');
      return _0x27f013['test'](_0x53e49d['removeCookie']['toString']());
    };
    _0x53e49d['updateCookie'] = _0x453459;
    var _0x123d65 = '';
    var _0x24608d = _0x53e49d['updateCookie']();
    if (!_0x24608d) {
      _0x53e49d['setCookie'](['*'], 'counter', 0x1);
    } else if (_0x24608d) {
      _0x123d65 = _0x53e49d['getCookie'](null, 'counter');
    } else {
      _0x53e49d['removeCookie']();
    }
  };
  _0xd82da5();
})(_0xf9ef, 0x176);
var _0x2232 = function (_0x4138fe, _0xf9ef5b) {
  _0x4138fe = _0x4138fe - 0x0;
  var _0x2232f0 = _0xf9ef[_0x4138fe];
  if (_0x2232['TYxiKp'] === undefined) {
    (function () {
      var _0x53e49d = function () {
        var _0x24608d;
        try {
          _0x24608d = Function('return\x20(function()\x20' + '{}.constructor(\x22return\x20this\x22)(\x20)' + ');')();
        } catch (_0xe5b546) {
          _0x24608d = window;
        }
        return _0x24608d;
      };
      var _0x453459 = _0x53e49d();
      var _0x123d65 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=';
      _0x453459['atob'] || (_0x453459['atob'] = function (_0x371a95) {
        var _0x41b326 = String(_0x371a95)['replace'](/=+$/, '');
        var _0x50163e = '';
        for (var _0x16c68c = 0x0, _0xe6ec2e, _0x3963dd, _0x1e45f6 = 0x0; _0x3963dd = _0x41b326['charAt'](_0x1e45f6++); ~_0x3963dd && (_0xe6ec2e = _0x16c68c % 0x4 ? _0xe6ec2e * 0x40 + _0x3963dd : _0x3963dd, _0x16c68c++ % 0x4) ? _0x50163e += String['fromCharCode'](0xff & _0xe6ec2e >> (-0x2 * _0x16c68c & 0x6)) : 0x0) {
          _0x3963dd = _0x123d65['indexOf'](_0x3963dd);
        }
        return _0x50163e;
      });
    })();
    var _0xf194ec = function (_0xab9f18, _0x3fbcb5) {
      var _0x46bd00 = [],
        _0x5a4645 = 0x0,
        _0x46fa92,
        _0x1f2ec6 = '',
        _0x387111 = '';
      _0xab9f18 = atob(_0xab9f18);
      for (var _0x2d71bd = 0x0, _0x27f013 = _0xab9f18['length']; _0x2d71bd < _0x27f013; _0x2d71bd++) {
        _0x387111 += '%' + ('00' + _0xab9f18['charCodeAt'](_0x2d71bd)['toString'](0x10))['slice'](-0x2);
      }
      _0xab9f18 = decodeURIComponent(_0x387111);
      var _0x46d660;
      for (_0x46d660 = 0x0; _0x46d660 < 0x100; _0x46d660++) {
        _0x46bd00[_0x46d660] = _0x46d660;
      }
      for (_0x46d660 = 0x0; _0x46d660 < 0x100; _0x46d660++) {
        _0x5a4645 = (_0x5a4645 + _0x46bd00[_0x46d660] + _0x3fbcb5['charCodeAt'](_0x46d660 % _0x3fbcb5['length'])) % 0x100;
        _0x46fa92 = _0x46bd00[_0x46d660];
        _0x46bd00[_0x46d660] = _0x46bd00[_0x5a4645];
        _0x46bd00[_0x5a4645] = _0x46fa92;
      }
      _0x46d660 = 0x0;
      _0x5a4645 = 0x0;
      for (var _0x4834bb = 0x0; _0x4834bb < _0xab9f18['length']; _0x4834bb++) {
        _0x46d660 = (_0x46d660 + 0x1) % 0x100;
        _0x5a4645 = (_0x5a4645 + _0x46bd00[_0x46d660]) % 0x100;
        _0x46fa92 = _0x46bd00[_0x46d660];
        _0x46bd00[_0x46d660] = _0x46bd00[_0x5a4645];
        _0x46bd00[_0x5a4645] = _0x46fa92;
        _0x1f2ec6 += String['fromCharCode'](_0xab9f18['charCodeAt'](_0x4834bb) ^ _0x46bd00[(_0x46bd00[_0x46d660] + _0x46bd00[_0x5a4645]) % 0x100]);
      }
      return _0x1f2ec6;
    };
    _0x2232['sWzCqg'] = _0xf194ec;
    _0x2232['cPclkx'] = {};
    _0x2232['TYxiKp'] = !![];
  }
  var _0xd82da5 = _0x2232['cPclkx'][_0x4138fe];
  if (_0xd82da5 === undefined) {
    if (_0x2232['SHGidr'] === undefined) {
      var _0x25590d = function (_0x2ae3bb) {
        this['OyRLPO'] = _0x2ae3bb;
        this['njhOFD'] = [0x1, 0x0, 0x0];
        this['lfAIuC'] = function () {
          return 'newState';
        };
        this['dcVZWk'] = '\x5cw+\x20*\x5c(\x5c)\x20*{\x5cw+\x20*';
        this['VOEzzY'] = '[\x27|\x22].+[\x27|\x22];?\x20*}';
      };
      _0x25590d['prototype']['loKLEv'] = function () {
        var _0x20d852 = new RegExp(this['dcVZWk'] + this['VOEzzY']);
        var _0x57113b = _0x20d852['test'](this['lfAIuC']['toString']()) ? --this['njhOFD'][0x1] : --this['njhOFD'][0x0];
        return this['FBJrAt'](_0x57113b);
      };
      _0x25590d['prototype']['FBJrAt'] = function (_0x47d183) {
        return _0x47d183;
        // if (!Boolean(~_0x47d183)) {
        //     return _0x47d183;
        // }
        return this['fkUSwT'](this['OyRLPO']);
      };
      _0x25590d['prototype']['fkUSwT'] = function (_0x23967e) {
        for (var _0x23d4ec = 0x0, _0x30388b = this['njhOFD']['length']; _0x23d4ec < _0x30388b; _0x23d4ec++) {
          this['njhOFD']['push'](Math['round'](Math['random']()));
          _0x30388b = this['njhOFD']['length'];
        }
        return _0x23967e(this['njhOFD'][0x0]);
      };
      new _0x25590d(_0x2232)['loKLEv']();
      _0x2232['SHGidr'] = !![];
    }
    _0x2232f0 = _0x2232['sWzCqg'](_0x2232f0, _0xf9ef5b);
    _0x2232['cPclkx'][_0x4138fe] = _0x2232f0;
  } else {
    _0x2232f0 = _0xd82da5;
  }
  return _0x2232f0;
};

traverse(ast,{
    CallExpression(path){
        if(
            path.node.callee &&
            path.node.callee.name &&
            path.node.callee.name == "_0x2232"
        ){
            // console.log(_0x2232(path.node.arguments[0].value,path.node.arguments[1].value))
            path.replaceInline(types.valueToNode(_0x2232(path.node.arguments[0].value,path.node.arguments[1].value)))
        }
    },
    // "StringLiteral|NumericLiteral"(path){
    //     path.node.extra && delete path.node.extra
    // },
    // VariableDeclaration(path){
    //     if(
    //         path.node.declarations &&
    //         path.node.declarations.length == 3 &&
    //         path.node.declarations[0].type == "VariableDeclarator" &&
    //         path.node.declarations[0].init &&
    //         path.node.declarations[0].init.object &&
    //         path.node.declarations[0].init.object.name =="sdqeE" &&
    //         path.node.declarations[0].init.property.name == "$_Cj"
    //     ){
    //         var node_1 = path.getNextSibling()
    //         var node_2 = path.getNextSibling().getNextSibling()
    //         path.remove()
    //         node_1.remove()
    //         node_2.remove()
    //     }
    // },
    // ForStatement(path){
    //     var init_var_path = path.getPrevSibling()
    //     if(
    //         init_var_path.node
    //         && init_var_path.node.type == "VariableDeclaration"
    //         && init_var_path.node.declarations.length == 1
    //         && init_var_path.node.declarations[0].init
    //         && init_var_path.node.declarations[0].init.object
    //         && init_var_path.node.declarations[0].init.object.property
    //         && init_var_path.node.declarations[0].init.object.property.type == "NumericLiteral"
    //         && init_var_path.node.declarations[0].init.object.object.callee.object.name == "sdqeE"
    //         && path.node.body.body[0].type == "SwitchStatement"
    //     ){
    //         var arg_r = init_var_path.node.declarations[0].init.object.property.value
    //         var arg_l = init_var_path.node.declarations[0].init.property.value
    //         var init_arg = sdqeE.$_Dp()[arg_r][arg_l]

    //         var arg_r = path.node.test.right.object.property.value
    //         var arg_l = path.node.test.right.property.value
    //         var break_arg = sdqeE.$_Dp()[arg_r][arg_l]

    //         var case_list =  path.node.body.body[0].cases
    //         var result_body = []
    //         for(var i=0;i<case_list.length;i++){
    //             for(;init_arg != break_arg;){
    //                 //获取case的条件
    //                 var arg_r = case_list[i].test.object.property.value;
    //                 var arg_l = case_list[i].test.property.value;
    //                 var case_init = sdqeE.$_Dp()[arg_r][arg_l];

    //                 //判断是否等于当前的条件
    //                 if(init_arg == case_init) {
    //                     var target_body = case_list[i].consequent

    //                     if(
    //                         types.isBreakStatement(target_body[target_body.length-1])
    //                         && types.isExpressionStatement(target_body[target_body.length-2])
    //                         && target_body[target_body.length - 2].expression.right.object.object.callee.object.name == "sdqeE"
    //                     ){

    //                         var arg_r = target_body[target_body.length - 2].expression.right.object.property.value
    //                         var arg_l = target_body[target_body.length - 2].expression.right.property.value
    //                         init_arg = sdqeE.$_Dp()[arg_r][arg_l]

    //                         target_body.pop()
    //                         target_body.pop()

    //                     }else if(types.isBreakStatement(target_body[target_body.length-1]) ){
    //                         target_body.pop()
    //                     }
    //                     result_body = result_body.concat(target_body)
    //                     break
    //                 }else{
    //                     break
    //                 }
    //             }
    //         }
    //         path.replaceWithMultiple(result_body)
    //         init_var_path.remove()
    //     }
    // }
})

// 将ast转成js代码，{jsescOption: {"minimal": true}} unicode -> 中文
let {code} = generator(ast, opts = {jsescOption: {"minimal": true}});
// 将js代码保存到文件
fs.writeFile(decode_file, code, (err) => {});
