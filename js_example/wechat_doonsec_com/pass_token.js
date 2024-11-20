const md5 = require('./hook_js/wechat_doonsec_com/md5.js')


function get_token() {
    var _0x2b0c06 = {};
    a = function(_0x2b8f77, _0x2fdaaa) {
        return _0x2b8f77(_0x2fdaaa);
    }
    ;
    b = function(_0x3c43f2, _0x111efe) {
        return _0x3c43f2 + _0x111efe;
    }
    ;
    // _0x2b0c06[_0x2232('0x17c', '&D9&')] = _0x2232('0xca', 'L[S2');
    _0x2b0c06['lcQxq'] = 'y7KWrgcFg!Dqiwt%NSwle^GGv)%8fCcxdGLk2wM'
    c = function(_0x1a1b53, _0x1a41b0) {
        return _0x1a1b53 + _0x1a41b0;
    }
    ;
    _0x2b0c06['whTbn'] = '&sign='
    _0x2b0c06['mmSvb'] = '&t=';
    var _0x4bfcea = _0x2b0c06;
    var _0x5e3fb0 = new Date()['getTime']();
    // console.log(_0x5e3fb0)
    // var _0x5e3fb0 = 1709882345092
    var _0x187006 = a(md5, b(_0x5e3fb0, _0x4bfcea['lcQxq']));
    return b(b(c(_0x4bfcea['whTbn'], _0x187006), _0x4bfcea['mmSvb']), _0x5e3fb0);
}

// console.log(get_token())
