
const parser = require("@babel/parser");
const traverse = require("@babel/traverse").default;
const types = require("@babel/types");
const { count } = require("console");
const generator = require("@babel/generator").default;
const fs = require("fs");
// 需要解码的文件1位置
let encode_file = "vm.js"
// 解码后的文件1位置
let decode_file = "decode_vm.js"
// 读取需要解码的js文件, 注意文件编码为utf-8格式
let jscode = fs.readFileSync(encode_file, { encoding: "utf-8" });
// 将js代码修转成AST语法树
let ast = parser.parse(jscode);

var _$hG = [
    "QtWEenbngei",
    "lmth//",
    "^(\\[object|function) Location\\b",
    "(<\\/OBJECT)",
    "contextmenu",
    "l.S",
    "left",
    "getUniformLocation",
    "errorCode",
    "TouchEvent",
    "MTPE",
    "http-equiv",
    "source",
    "parseError",
    "TK_OPTIONAL_DOT",
    "4",
    "Icon",
    "lBSM",
    "function fetch() { [native code] }",
    "segaugnal",
    "window\\.open = function \\(url, frameName, features\\)",
    "jbscheme://",
    "etiSllaC",
    "http",
    "cookieEnabled",
    "ewkbtiiHddne",
    "SebMFoliFlmoTrlo,ogSoosueM",
    "android",
    "^[\\x00-\\x7F]*$",
    "$_config__.detail__ += 1",
    ".ALKEL_LA",
    "50",
    "subtree",
    "18px 'Arial'",
    "(<\\/OBJECT)_DIV",
    "rance",
    "TK_DO",
    "rface,jesion",
    "0137478142",
    "TK_DEBUGGER",
    "#reload",
    ", decrypted SN: ",
    "TK_NEW",
    "<OBJECT",
    "qcdodecpob",
    "console",
    "#URL",
    "Exce",
    "tGNe",
    "save",
    "boolean",
    "resu",
    "alert",
    "|-hdg",
    "^$\\a[z-{]}3[_-a0z9-{]22_}",
    "tests",
    "__anchor__",
    "precision mediump float;varying vec2 varyinTexCoordinate;void main() {gl_FragColor=vec4(varyinTexCoordinate,0,1);}",
    "getExtension",
    "position",
    "originalTarget",
    "clientX",
    "fine|coarse|none|any",
    "nvagitaro",
    "String",
    "__wpr_ceroedPrreofmrcAitno_,p__werocdrreeSStleceot,r__wpr_feerhsvOreal,y__wpr_ceroedRrceroAdtcoi,n__wpr_ceroedSratet",
    "createBuffer",
    "#showModalDialog",
    "text/xml",
    ">tcejbo/<>\"xp0\"=thgieh \"xp0\"=htdiw \"b0ecdb00aa00-28bb-fc11-5b89-918f0503:dislc\"=dissalc \"jk28bb\"=di tcejbo<",
    "^((?:[\\da-f]{1,4}(?::|)){0,8})(::)?((?:[\\da-f]{1,4}(?::|)){0,8})$",
    "TK_COMMA",
    "Name expected",
    " height=6 width=1 type=application/x-shockwave-flash src=",
    "=true",
    "TK_CLASS",
    "([0-9]{1,3}(\\.[0-9]{1,3}){3}| (([0-9a-f]{1,4}:){7,7}[0-9a-f]{1,4}|([0-9a-f]{1,4}:){1,7}:|([0-9a-f]{1,4}:){1,6}:[0-9a-f]{1,4}|([0-9a-f]{1,4}:){1,5}(:[0-9a-f]{1,4}){1,2}|([0-9a-f]{1,4}:){1,4}(:[0-9a-f]{1,4}){1,3}|([0-9a-f]{1,4}:){1,3}(:[0-9a-f]{1,4}){1,4}|([0-9a-f]{1,4}:){1,2}(:[0-9a-f]{1,4}){1,5}|[0-9a-f]{1,4}:((:[0-9a-f]{1,4}){1,6})|:((:[0-9a-f]{1,4}){1,7}|:)|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-f]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])) )",
    "SykepD.teceitno",
    "TK_LET",
    "{s\\\\*n[tavi eoced]\\s\\}*",
    "OPEN",
    "acol",
    "#referrer",
    "\\r\\n?|[\\u2028\\u2029]",
    "right",
    "onicecandidate",
    "getRandomValues",
    "g_ foepyt nruter",
    "while(",
    "Please enable cookie in your browser before you continue.",
    "linkProgram",
    "loadXML",
    "r|o1dvyqra",
    "webk",
    " new ",
    "x-pw-glass"
]


var _$da = [
    "readyState",
    "=",
    "match",
    "[",
    "push",
    "createElement",
    "XMLHttpRequest",
    "script",
    "test",
    "apply",
    "?",
    "length",
    "g",
    "form",
    "+=",
    "string",
    "join",
    "submit",
    "charCodeAt",
    "(",
    "target",
    ";",
    "abs",
    "{",
    "cookie",
    "onclick",
    "replace",
    ":",
    "round",
    "status",
    "nodeType",
    "tagName",
    "call",
    "responseText",
    "type",
    "getAttribute",
    ",",
    "split",
    "a",
    "slice",
    "appendChild",
    "location",
    "number",
    ")",
    "onload",
    "]",
    "href",
    "splice",
    "function",
    "name",
    "src",
    "toString",
    "&",
    "indexOf",
    "body",
    "action",
    "style",
    "onsubmit",
    "open",
    "addEventListener",
    "setAttribute",
    "prototype",
    "https:",
    "#",
    "async",
    "div",
    "removeEventListener",
    "get",
    "innerHTML",
    "pathname",
    "80",
    "ontimeout",
    "getTime",
    "onerror",
    "ActiveXObject",
    "external",
    "substr",
    "timeStamp",
    "EventTarget",
    "pop",
    "removeChild",
    "concat",
    "search",
    "localStorage",
    "keyCode",
    "iframe",
    "HTMLFormElement",
    "getElementsByTagName",
    "event",
    ".",
    "response",
    "onprogress",
    "getElementById",
    "}",
    "javascript:",
    "headers"
]


var _$aA = [
    "$_nd",
    "i",
    "; Secure",
    "l__",
    "m",
    "attachEvent",
    "data",
    "preload",
    "height",
    "history",
    "pfb2_0",
    "candidate",
    "outerHTML",
    "OverrideMimeType",
    "fonts",
    "(\\r\\n?)|(\\r?\\n)",
    "'",
    "$_YVTX",
    "attributes",
    "preventDefault",
    "month",
    "fillStyle",
    "function ",
    "json",
    "host",
    "setItem",
    "setTimeout",
    "audio",
    "Element",
    "-",
    "mousedown",
    "isNaN",
    "compileShader",
    "mouseup",
    "await",
    "link",
    "width",
    "matches",
    "fetch",
    "enumerateDevices",
    "default ",
    "~",
    "frames",
    "pfa0",
    "touchend",
    "time",
    "load",
    "charAt",
    "___TS___",
    ">",
    "getItem",
    "mediaDevices",
    "description",
    "post",
    "$_ts",
    "Function",
    "append",
    "javascript: void(0);",
    "$b_callHandler",
    "Request",
    "stopPropagation",
    "GetVariable",
    "MediaStreamTrack",
    "Headers",
    "crypto",
    "rwa0",
    "$NWE5NzRkYjhmYzM4",
    "offsetUniform",
    "[object Array]",
    "childList",
    "numItems",
    "addedNodes",
    "Ajax response body decryption failed - ",
    "getSources",
    "day",
    "sessionStorage",
    "parentElement",
    "fromCharCode",
    "timeZone",
    "self",
    "null",
    "scroll",
    "offsetY",
    "offsetHeight",
    "return;",
    "locale",
    "pfb0",
    "abort",
    "HTMLObjectElement",
    "encoding",
    "getResponseHeader",
    "+",
    "checkbox",
    "text/plain",
    "P",
    "message"
]


var _$ix = [
    "\"",
    "object",
    "onreadystatechange",
    "button",
    "443",
    "protocol",
    "canPlayType",
    "userAgent",
    "constructor",
    "text",
    "http:",
    "/",
    "value",
    "undefined",
    "click",
    "responseType",
    "hidden",
    "top",
    "random",
    "eval",
    "parentNode",
    "EkcP",
    "floor",
    "send",
    "*",
    "onloadend",
    "documentElement",
    " from ",
    "sqrt",
    "nodeName",
    "from",
    "input",
    "%",
    "|",
    "stringify",
    "keydown",
    "hostname",
    "now",
    "hasOwnProperty",
    "options",
    "matchMedia",
    "Math",
    "showModalDialog",
    "parse",
    "XMLHttpRequestEventTarget",
    "//",
    "video",
    "image",
    "ceil",
    "setInterval",
    "onabort",
    "getContext",
    "visibility",
    "document",
    "canvas",
    "indexedDB",
    "HTMLGenericElement",
    "toLowerCase",
    "base",
    "<",
    "Response-Type",
    "substring",
    " as ",
    "port",
    "MicroMessenger",
    "onsuccess",
    "statusText",
    "stack",
    "#href",
    "clearInterval",
    "#onsubmit",
    "enctype",
    "assign",
    "responseXML",
    "set",
    "ctl",
    "close",
    "meta",
    "pff0",
    "exec",
    "content",
    "internal",
    "onloadstart",
    "#action",
    "performance",
    "mousemove",
    "method",
    "cloneNode",
    "r",
    "max",
    "#src",
    "result",
    "then",
    "import",
    "datas-ts",
    "0"
]



var _$dU = [
    "#pushState",
    "uct",
    "ECLTENR_OOBWRRS_ENWDI_OCWSLEO",
    "msIndexedDB",
    "yield ",
    "firstChild",
    "{perkyeki",
    "vlaue",
    "mozConnection",
    "http:\\\\",
    "tpircSnuRnolatak",
    "TK_TEMPLATE_NO_SUBSTITUTION",
    "display",
    "#hostname",
    "TK_FROM",
    "Storage",
    "#pathname",
    "input[type=\"submit\"]",
    "hsalFevawkcohS.hsalFevawkcohS",
    "-ws-data-preview-element",
    "irafas",
    "TK_DOT",
    "T",
    "#stopPropagation",
    "TK_THROW",
    "#origin",
    "3",
    "yti",
    "pow",
    "#host",
    "rangeMin",
    "/d(+\\0)-[]9+.a fSia\\rd/+\\",
    "#replaceState",
    "essage",
    "emorhCssel",
    "Msxml2.ServerXMLHTTP.3.0",
    "Intl",
    "#setTimeout",
    "debugger;_$db(",
    "mare",
    "behavior",
    "TK_BIN_OPERATOR",
    "pa",
    "ewsboter",
    "connection",
    "characterSet",
    " host ",
    "catch",
    "resworBQQ",
    "egnahcytilib",
    "#cloneNode",
    "observe",
    "webgl",
    "TK_BREAK_CONTINUE",
    "6e6577206f6c64576562536f636b65742875726c",
    "oanblra",
    "egarotStnetsisrePtikbew",
    "mozRTCPeerConnection",
    "attribute vec2 attrVertex;varying vec2 varyinTexCoordinate;uniform vec2 uniformOffset;void main(){varyinTexCoordinate=attrVertex+uniformOffset;gl_Position=vec4(attrVertex,0,1);}",
    "Txam",
    "m/e(\\+\\)d",
    "loaded",
    "h$oo$k$,dh$x$,ds$x$,iu$e$,l$rs$,l$ps$,l$rs,b$$olggre$,A$XCTULI,SA_XCE_AV_LAPSS_,CA_XOHKO,Sr$aeydoCedlAerdaEyexucetIdTnihFsarem",
    "kcarTtoNoDsm",
    "onupgradeneeded",
    "pp",
    "tenaM caihenU inC;oojlza;zeVdrna;aeHvlteci aeNeuL  TrP o53T ih;natohamL; GmSra_t HettsR geluraD;NIrP-oilhg;teHvlteci aTL4  3iLhg txEetdndeH;leev_MnIid;aESRCbotoLogithB lo;dROM honaytU inocedR geluraD;ordiS na shTiaK;naanadS naag mNMD;CDU hcnec;olkc0261v_.1;1aSsmnuKgnaanadeRugal;rIML NAITGNB lo;daSsmnuSgnaNsmuL3L githv;readanH;leevitaceNeuhTniS;CEaFllabkcS;mausgnmEjo;ieTulugS naag mNMC;raorsiG toih cCSF;ylemL githR boto oiLhg;toSAMD-gitiL githS;Mo CaSsnR geluraH;XYYiauJns;tss;mausgns-na-sun4m;Tmgm_nemgne;goLih taKnnda;aitem sen woram;nassmnu-gassnn-muL4s;refim-nosoapecS;mausgnaSsnuN-mT3T ih;noColOrUS-ITXih;nrDio daNks hhSfi tlA;taSsmnuTgleguRugeluraB;neagilO STM; IaLTnni_gBGO tuisedY ;SZFiMoauWG_1B0803h;leevn-ue-eerugal;rSS TeMidmuC;uoirreN weK;mhreM noudklri ioBdlH;leevitacL  T32U tlarL githE txneed;deHvlteci aTL2  5lUrt aiLhg;toRobotM deui;mrDio daSsnB lo;dogdu;yassns-refic-noedsndel-githS;iFdnren;to-oassnc-kjm-deui;mimiuM;oRkc yRP CoBdlA;dnordilCco keRugal;raSsmnuSgnaNsmu4- LiLhg;tassns-refit-ih;naAaPgnaYrec;saau;lNBM honaytTOB lo;d-xss;toNotaSsnyMnaamZrwayg;ieHvlteci aTL3  3hTniE txneed;dsAlhyecSirtpTMA tlN;to oaSsnD venagara iIUR;boto ooCdnnees doBdlR;boto oeMidmuI atil;cimiuxeN;to oaSsnG ruumhk iIUS;TSV eintmase eiLhg;tGLO_irayh;cyfoef;e-xss-tlurtlagithD;HFieWA-7;AZFWZBXOT_TnUcido;eeDavanagirS naag mNMB lo;dassns-refim-nosoapecP;daua koBkoB lo;dGLF-YZniBgKiiahS-u1S-52V2.L;-GZFiYgniBaKSiuhS-51V-.2;3eHvlteciNaueLe TrP o53T ;hiMrcsofo tiHamalayS;mausgnaSsnaFllabkcS;TSM deui mtIlaciA;dnordimEjo;iaSsmnuSgnaNsmu3-;RTI CtSno eeSir;fassns-refis-amllacspx;s-tsm-deui;mGLS_niahelesR;boto ohTniI atil;cectnru-yoghtciC;olkcpoaiL;muniuo_saSsnF;oliridnaS rcpi tlA;toNotS na suGmrkuihB lo;dTLYHZS KoBdlG;_ShTiaS;mausgneNNomu3__T;2rAbacih;na-sassnn-roam;loLih teTulugH;QYHiie5-S0L githL;nisdyef roS mausgnA; RrCsyathlieD ;BaSsmnu gaSsnM deui;massmnu-gassnn-mu54h;na-sassnb-lo;duLimonsuS_rcpi;tSS ToCdnnees;daSsmnuDgvenagaraRigeluraA;jnlaM layalamaM ;NaSsmnuTgah(ietts;)ZFaLTnniHgieM-G-1B0803H;beer wTO;SSG54A_ar(bnArdioOd)SS;mausgnS na siLhg;thCco oocko;yehvl-eeneut-ih;nNPM honaytTOM deui;mGLF-KZTano-g1M-92V4.D;ordiS refiS;mausgniShnlaRagelurah;leevitacL;-GZFaKoTgnM-91V-.2;2oNotS na seDavanagirU  IoBdlS;TSL githD;PFmEjo;iewtaehfrnontweR geluraR;botoNomuR3D;NIrP-oemidmuS;mausgnS na suN5m;5SS TeHva ytIlaciL;lGco4kR gelura0_08;5eGroig;aonots-na-sjc;keTulugS naag mNMB lo;dIMIUE  XoNmrlaH;QYHiie7-S5B lo;doNotaSsnyMnaamZrwayg ioBdly;nusorp-olbca;kehvl-eeneun-roam;luLimonsuS_refiT; MoMahtnOy ToNmrlaS;mausgnaSsnuN-mL3 viLhg;taSsmnu gaSsnN mu54S;amtroGhtciM deui;megroig;aacuslaf-no-tytepS;mausgnS na soBdls;amllc-patila;sFMninaecP CRB lo;dZFaLTnniHgieG_1B0803S;mausgnrAeminnaR;boto ooBdlc;neutyrg-toih-cobdlx;s-tsh-aeyvS;TSL githI atil;chTraoL;n-xss-tilhg;tiDbnloR geluraS;mausgneBgnlaRigeluraK; NoMahtnOySTamllM deui;myhuperS;mausgnaTimRlgeluraM;layalamaS naag mNMN;to oaSsnK naanadU ;Iehvl-eeneuH;leevitacL  T55R monaN;to oaSsnK naanadB lo;daSpnayS;mausgnuPjnbaRigeluras;mausgns-na-sun4mvLL;_GaKnnda;aaSsmnu gaSsnR geluraZ;wayg-inO;erDio deSir foBdlI atil;cZFAKJT;Wocruei ren;waSsmnuEgomijeRugal;rIMIUE  XoBdlA;dnordiE omijN;to oaNks hrAbaciU ;ICL DoC;muFutarM deui mTBV;vi-oxertca;taBgnalS naag mNMB lo;dahsns-na-serugal;rNSmu3-;RNSmu3-;Tahsns-na;sSS TlUrt aiLhg;toRobotR geluraR;boto oiLhg;taHunam;nenlwggtoih;cFDeHAi5WA-h;na-sassnl-githP;aletG toih;cNSmu3-;LeHvlteci aTL4  5iLhg;tyMnaam raSgnmaZ wayg ioBdll;-gassns-refil-githM;UI IXEL githR;boto ohTniS;Mo AoBdlP;daua;kaSsmnu gaSsnS;apicuo_smSlaClpas;na-sesir;fVDM honaytTOM deui;mtSbaelS_al;pomanocF;ylemL-githf;zzsyd-soypS;rceeSnna;slcco2k10;6oRobotC noedsndeB lo dtIlaciA;irlaK; NoMahtn yeMidmuM;toyoLaaMurW  3omonH;nasdteC noedsndeR;boto otIlaciH;CTH na;dSS TlUrt aiLhg ttIlaciS;TSV eintmase eoRam;noNotN sahkA arib cIUB lo;dhcfnxz-hemidmuS;uNCmno-dT3c;neutyrg-toih-cerugal;redaflu_torobotl-githN;to oaSsnM aymnraM;aymnraS naag mNMA;ppelC loroE omijw;aehtreoftneR;gaSsmnuMglayalamaeRugal;rraai;lrDio deSir foBdlC;oP 3RP CoBdlM; IALTNNI;GaSsmnuKgroae-neRugal;retts54R geluras;ipir_titemD;venagara iaSgnmaM ;NcSerneeSir;foRobotc;ruisevf-no-tytepS;HTieitv_vi;ohcfnxz;haSsmnu glCcoFkno tA3R;boto ooCdnnees deRugal;rassmnu-gen-oun3m;RJGM honaytTOM deui;mhCluohN ue eoLkcr;boto-oun3m;Lehvl-eeneuu-tlariLhgettxneed;daSsmnuOgirayeRugal;raSsmnuSgnaNsmu4-vLL githM;iYgneH_i8130_02CB-lo;dFDSPahNoWv-5BGR;boto olBca;kehvl-eeneuu-tlarilhg;tmgx_hiieL;lGco4kL gith0_08;5uGajaritS naag mNMM;layalamaS naag mNMB lo;dorobotn-muR3S;XThiiev_vi;oZFhZnuuYnaG_1B0803n;to-oassnc-kjl-githc;lorosoN;to oaSsnG ruumhk;ioNotS na sySbmlo;soRobotL githI atil;coLih taTim;lucsrvi;eedaflu_torobotB;ahhstiCamolpxeaSsnB lo;dGLN_mueb_roRobotT ih;nomonpscadew-tiohtus-refi;seHvlteci aTL3  5hTnis;mausgns-na-sun3mVLD;NIrP;ooJomhlra;iassns-refil-githh;leevn-ue-elbca;koLih teBgnla;iyMnaam raSgnmaZ wayg;irDio deSir ftIlaciR;boto ooBdlI atil;caNunGmtoih;coSynM boli eDUG toih ceRugal;reGroig aoBdlI atil;cassmnu-gassnn-muL3;vuyon-shtnis;mausgnn-oen-muT3c-no;doNotS na syMnaam rIUB lo;dglesir;fZFoYHuieR-G-1B0803L;hotiP nuajibb;saekvrliels;mausgns-na-sun4mvTs;mausgns-na-shtniL; GmEjo;inAajileNLwpi;iaSsmnuSgnaNsmu4- ThTniS;mausgnoKernaB-lo;dimiuxel-githN;to oaSsnK naanadR;boto ooNmrlaI atil;ceGroig atIlacis;na-sesir-femidmuS;amtrZ wayg;ioRobotC noedsndeI atil;coNotS na saKnnda aIUB lo;dFD PcSS na seHeu031_30L;_GuNbmreR_boto ooBdlP;daua koBkox;s-tsc-noedsndeS;nuhsni-ecUeh;noRobotB alkcI atil;ciRgn ooCol rmEjo;ieDavanagirO STS;amtrZ wayg irP;oZFaLTnniHgieM-G-KBA;dnordilCco-kaLgr eeRugal;rrpporoitnolayls-apec-diwhtuo-tesirsfC;tuvi eoMont;miseL; GmSra_t HettsB lo;dIDPNorL-giths;na-sesir-flbca;koLih teDavanagirp;oroptroianll-ypscadew-ti-hesirsfs;mausgns-na-sun3m;LYMuognP CRM deui;mFDoGhtciWP-5IB5GKHS-NO;Yahsns-na-semidmuS;TSH aeyvL;-GZFhZnuuYnaM-20V-.2;2yMnaamUreN weRugal;roNotN sahkA arib coBdlS;mausgnuGajarhtRigeluraf;naatysh;leevn-ue-eilhg;teHvlteci aeNeuO STB lo;donots-na-sjc-kobdls;mausgns-na-sun3m;RiLdnes yaSsmnu;gassmnu-gassnn-muT3S;rceeSnrefioMonE;rTmu pyMnaam_rWZh;leevn-ue-ehtnixeetdndeN;to oaNks hrAbaciL;_GuGajaritS;amtrM_nosoapec;daTim laSgnmaM ;NGLE omijN noMA;EoRobotC noedsndeL githI atil;cmgj_nikgiaF;LZnaiTgnaKHnieG_1B0803l;tgarev;lapalitonG;oegraiB lo;drDio daSsnL;_GuPjnba;imSraGttoih coBdlS;mausgnS na shTniS;TSC noedsndeB lo;doCimscN_raor;wocruei;rrOyi aaSgnmaM ;Nehvl-eeneul-githxeetdndeF;LZnaiTgneH-i-RBG8130;0RAC yrtslaehHiSKSCD ;Besir;fTRSWuYReuoGdGov0-1eRugal;riMoauWp_er;vZF1Y;KGLN_mueb_roRobotR geluraA;dnordilCco;koSAMR geluraH;QYHiie4-S0L gith;xgls-na-sesir;faDcnni gcSirtpB lo;dedaflu;tes-corobotl-githC;loroSOIUR-gelurat;se teRugal;raTim laSgnmaM  NoBdlF;YZniBgXiniSguhS-61R;botoNomuL3L githm;nosoapec-diwhts-refi;sassmnu-gassnn-mu53C;oo lajzzS;mausgneNNomu3-;LTSiXgnak;icSerneaSsnoMonD;PFaWaW5WG-;BaSsmnuSgnaNsmu3- LiLhg;taBgnalS naag mNMG;ruumhk iaSgnmaM ;NESRCbotoLogithh;fynorxia;nYMniHgieBG8130C0B-lo;dassmnu-gassnl-githH;leevitacL  T56M deui;mrDio daSsnF lablca;koRobotT se1tB lo;doNotS na syMnaam roBdls;na-sesir-focdnnees-ductsmoS;mausgneNNomu3-;TaSsmnu gaSsnN mu53m;nosoapecT; LoMahtn yeMidmuh;leevn-ue-eemidmuL;HTSYKZR;boto ooCdnnees ductsmo eoBdlM;aymnra;3rDio daSsnD venagara;ihSoavNp_er;vassmnu-gen-oun3m;LZFaLTnniHgieE--LBG;Kuyon;sassmnu-gen-oun3m;TiTem seN woRam;nehvl-eeneub-lo;donots-na-sjc-kerugal;roNotS na suGmrkuihU  IoBdlD;NIrP-olbca;kZFaLTnniHgieE--LBG8130;0SS TiVteanemesM deui;moRobotC noedsndeL githS;TSV eintmase eoBdlA; RJDK-;KrDio daSsnS ME;CoNotS na syMnaam rIUC;moni goSnoM;uYpp yRP CeMidmuR;somera;yoLih tuGajaritR;boto ooCdnnees ductsmoB lo;dZFaLTnniHgie-S-RBGH;leevitacN ue eTO;SaKti_irpveR;boto-oiBCgolkcF;YZKBJS;WaHdnes toCdnnees doBdlS;mausgneGroignaD;naicgnS rcpi;tassns-refic-noedsndeh;na-sassnt-ih;naSsmnuSgnaNsmu4-vTT ih;noLih tdOaiB;ahhstiCamolpxeaSsn",
    "$bf89a016$",
    "#hash",
    "eCSf",
    "precision",
    "MsgN_IUEQ_U",
    "#Submit",
    "leHgith",
    "Ca",
    "menaurb",
    "pe",
    "retu",
    "atemnihplod,ofninihplod,nihplod",
    "Msxml2.ServerXMLHTTP.5.0",
    "DeviceMotionEvent",
    "66",
    "dbs_aecrbhxoi_tnreafec",
    "mozIndexedDB",
    "lineNumber",
    "#clear",
    "Open",
    "orhC",
    "fontFamily",
    "Ct",
    "ewkbtiivisibilythcnaeg",
    "TK_ASSIGN_X",
    "a=candidate:",
    "func",
    "JSON",
    "nntfImoarotni"
]


var _$kk =  [
    "fractionalSecondDigits",
    "__#classType",
    "#search",
    "parseFromString",
    "<div>IE8</div>",
    "pfd0",
    "objectStore",
    "numberingSystem",
    "fa0-",
    "radio",
    "ARRAY_BUFFER",
    "toUpperCase",
    "Unexpected token ",
    "touchmove",
    "b",
    "Unexpected template string ending",
    "beta",
    "fillText",
    "returnValue",
    "alpha",
    "error",
    "write",
    "offsetX",
    "clear",
    "year",
    "frame",
    "overrideMimeType",
    "pfe0",
    "srcElement",
    "toGMTString",
    "calendar",
    "hash",
    "itemSize",
    "gamma",
    "_",
    "anchor",
    "querySelector",
    "DOMParser",
    "#innerHTML",
    "credentials",
    "battery",
    "#outerHTML",
    "vdFm",
    "transaction",
    "escape",
    "run",
    "$",
    "capture",
    "removeAttribute",
    "#value",
    "getShaderPrecisionFormat",
    "FRAGMENT_SHADER",
    "parseInt",
    "vertexPosAttrib",
    "attributeName",
    "$1_DIV",
    "$b_platform",
    "setRequestHeader",
    "attachShader",
    "chargingTime",
    "removeItem",
    "getOwnPropertyDescriptor",
    "touchstart",
    "execScript",
    "$bmF0aXZlRmlVyUHJ",
    "1",
    "acos",
    "(this);",
    "y",
    "#nodeValue",
    "Microsoft.XMLHTTP",
    "contains",
    "keyup",
    "offsetWidth",
    "shaderSource",
    "application/x-www-form-urlencoded",
    "rwb0",
    "objectStoreNames",
    "$_YWTU",
    "getBoundingClientRect",
    "(^\\s*)|(\\s*$)",
    "ownerElement",
    "#onclick",
    "_$rc",
    "localDescription",
    "createShader",
    "application/xml",
    "; expires=",
    "toDataURL",
    "pfc0",
    "rwc0",
    "VERTEX_SHADER",
    "3jeALeSsa6",
    "[0-9a-fA-F]",
    "$b_setup",
    "), expected "
]

traverse(ast, {
    MemberExpression(path) {
        if (
            path.node.object &&
            path.node.object.name &&
            path.node.object.name == "_$kk"
        ) {
            path.replaceInline(types.valueToNode(_$kk[path.node.property.value]))
        }
        if (
            path.node.object &&
            path.node.object.name &&
            path.node.object.name == "_$da"
        ) {
            path.replaceInline(types.valueToNode(_$da[path.node.property.value]))
        }else if (
            path.node.object &&
            path.node.object.name &&
            path.node.object.name == "_$hG"
        ){
            path.replaceInline(types.valueToNode(_$hG[path.node.property.value]))
        }else if(
            path.node.object &&
            path.node.object.name &&
            path.node.object.name == "_$aA"
        ){
            path.replaceInline(types.valueToNode(_$aA[path.node.property.value]))
        }else if(
            path.node.object &&
            path.node.object.name &&
            path.node.object.name == "_$ix"
        ){
            path.replaceInline(types.valueToNode(_$ix[path.node.property.value]))
        }else if(
            path.node.object &&
            path.node.object.name &&
            path.node.object.name == "_$dU"
        ){
            path.replaceInline(types.valueToNode(_$dU[path.node.property.value]))
        }else {

        }
    }
})



let { code } = generator(ast, opts = { jsescOption: { "minimal": true } });
// 将js代码保存到文件
fs.writeFile(decode_file, code, (err) => { });
