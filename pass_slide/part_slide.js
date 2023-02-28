function QBLnx() {}
QBLnx.$_BP = function () {
    var $_DBHFV = 2;
  
    for (; $_DBHFV !== 1;) {
      switch ($_DBHFV) {
        case 2:
          return {
            $_DBHGJ: function $_DBHHP($_DBHIo, $_DBHJn) {
              var $_DBIAD = 2;
  
              for (; $_DBIAD !== 10;) {
                switch ($_DBIAD) {
                  case 4:
                    $_DBIBI[($_DBICi + $_DBHJn) % $_DBHIo] = [];
                    $_DBIAD = 3;
                    break;
  
                  case 13:
                    $_DBIDJ -= 1;
                    $_DBIAD = 6;
                    break;
  
                  case 9:
                    var $_DBIEL = 0;
                    $_DBIAD = 8;
                    break;
  
                  case 8:
                    if ($_DBIEL < $_DBHIo) {
                      $_DBIAD = 7;
                    } else {
                      $_DBIAD = 11;
                    }
  
                    break;
  
                  case 12:
                    $_DBIEL += 1;
                    $_DBIAD = 8;
                    break;
  
                  case 6:
                    if ($_DBIDJ >= 0) {
                      $_DBIAD = 14;
                    } else {
                      $_DBIAD = 12;
                    }
  
                    break;
  
                  case 1:
                    var $_DBICi = 0;
                    $_DBIAD = 5;
                    break;
  
                  case 2:
                    var $_DBIBI = [];
                    $_DBIAD = 1;
                    break;
  
                  case 3:
                    $_DBICi += 1;
                    $_DBIAD = 5;
                    break;
  
                  case 14:
                    $_DBIBI[$_DBIEL][($_DBIDJ + $_DBHJn * $_DBIEL) % $_DBHIo] = $_DBIBI[$_DBIDJ];
                    $_DBIAD = 13;
                    break;
  
                  case 5:
                    if ($_DBICi < $_DBHIo) {
                      $_DBIAD = 4;
                    } else {
                      $_DBIAD = 9;
                    }
  
                    break;
  
                  case 7:
                    var $_DBIDJ = $_DBHIo - 1;
                    $_DBIAD = 6;
                    break;
  
                  case 11:
                    return $_DBIBI;
                    break;
                }
              }
            }(21, 7)
          };
          break;
      }
    }
}();
QBLnx.$_Db = function () {
    return typeof QBLnx.$_BP.$_DBHGJ === "function" ? QBLnx.$_BP.$_DBHGJ.apply(QBLnx.$_BP, arguments) : QBLnx.$_BP.$_DBHGJ;
};

function ct(t) {
  var $_DBECm = QBLnx.$_Db()[3][19];
  for (; $_DBECm !== QBLnx.$_Db()[12][18];) {
    switch ($_DBECm) {
      case QBLnx.$_Db()[3][19]:
        this["$_BCAJ"] = t || [];
        $_DBECm = QBLnx.$_Db()[15][18];
        break;
    }
  }
}

ct["prototype"] = {
  "$_HBq": function (t) {
    return this["$_BCAJ"][t];
  },
  "$_BCCO": function () {
    return this["$_BCAJ"]["length"];
  },
  "$_BJj": function (t, e) {
    return new ct(Q(e) ? this["$_BCAJ"]["slice"](t, e) : this["$_BCAJ"]["slice"](t));
  },
  "$_BCDE": function (t) {
    return this["$_BCAJ"]["push"](t), this;
  },
  "$_BCEy": function (t, e) {
    return this["$_BCAJ"]["splice"](t, e || 1);
  },
  "$_CBT": function (t) {
    return this["$_BCAJ"]["join"](t);
  },
  "$_BCFi": function (t) {
    return new ct(this["$_BCAJ"]["concat"](t));
  },
  "$_CAQ": function (t) {
    var e = this["$_BCAJ"];
    if (e["map"]) return new ct(e["map"](t));
    for (var n = [], r = 0, i = e["length"]; r < i; r += 1) n[r] = t(e[r], r, this);
    return new ct(n);
  },
  "$_BCGY": function (t) {
    var e = this["$_BCAJ"];
    if (e["filter"]) return new ct(e["filter"](t));
    for (var n = [], r = 0, i = e["length"]; r < i; r += 1) t(e[r], r, this) && n["push"](e[r]);
    return new ct(n);
  },
  "$_BCHf": function (t) {
    var e = this["$_BCAJ"];
    if (e["indexOf"]) return e["indexOf"](t);
    for (var n = 0, r = e["length"]; n < r; n += 1) if (e[n] === t) return n;
    return -1;
  },
  "$_BCIN": function (t) {
    var e = this["$_BCAJ"];
    if (!e["forEach"]) for (var n = arguments[1], r = 0; r < e["length"]; r++) r in e && t["call"](n, e[r], r, this);
    return e["forEach"](t);
  }
}
function encode_track(t) {
  function n(t) {
    var $_DBEAP = QBLnx.$_Db()[3][19];
    for (; $_DBEAP !== QBLnx.$_Db()[12][17];) {
      switch ($_DBEAP) {
        case QBLnx.$_Db()[0][19]:
          var e = "()*,-./0123456789:?@ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqr",
            n = e["length"],
            r = "",
            i = Math["abs"](t),
            o = parseInt(i / n);
          n <= o && (o = n - 1), o && (r = e["charAt"](o));
          $_DBEAP = QBLnx.$_Db()[12][18];
          break;
        case QBLnx.$_Db()[9][18]:
          var s = "";
          return t < 0 && (s += "!"), r && (s += "$"), s + r + e["charAt"](i %= n);
          break;
      }
    }
  }

  var t = function() {
      for (var e, n, r, i = [], o = 0, s = 0, a = t["length"] - 1; s < a; s++) e = Math["round"](t[s + 1][0] - t[s][0]), n = Math["round"](t[s + 1][1] - t[s][1]), r = Math["round"](t[s + 1][2] - t[s][2]), 0 == e && 0 == n && 0 == r || (0 == e && 0 == n ? o += r : (i["push"]([e, n, r + o]), o = 0));
      return 0 !== o && i["push"]([e, n, o]), i;
    }(this["$_HCT"]),
    r = [],
    i = [],
    o = [];
  return new ct(t)["$_CAQ"](function (t) {
    var e = function (t) {
      for (var e = [[1, 0], [2, 0], [1, -1], [1, 1], [0, 1], [0, -1], [3, 0], [2, -1], [2, 1]], n = 0, r = e["length"]; n < r; n++) if (t[0] == e[n][0] && t[1] == e[n][1]) return "stuvwxyz~"[n];
      return 0;
    }(t);
    e ? i["push"](e) : (r["push"](n(t[0])), i["push"](n(t[1]))), o["push"](n(t[2]));
  }), r["join"]("") + "!!" + i["join"]("") + "!!" + o["join"]("");
}





// n["$_CICM"]["$_FDU"]()
console.log(encode_track(t=[[37, 42, 0],[2, 0, 98],[6, 0, 17],[10, 0, 15],[11, 0, 17],[8, 0, 17],[6, 0, 16],[4, 0, 17],[0, 0, 18]]))

// [[37, 42, 0],[2, 0, 98],[6, 0, 17],[10, 0, 15],[11, 0, 17],[8, 0, 17],[6, 0, 16],[4, 0, 17],[0, 0, 18]]