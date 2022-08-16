package cn.com.chinatelecom.account.api.p037d;

import android.content.Context;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p038e.C0666a;
import cn.com.chinatelecom.account.api.p038e.C0668c;
import cn.com.chinatelecom.account.api.p038e.C0671f;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.json.JSONObject;
import p003X.C116971W2r;

/* renamed from: cn.com.chinatelecom.account.api.d.b */
/* loaded from: classes2.dex */
public final class C0657b extends AbstractC0661f {

    /* renamed from: b */
    public static final String f20956b = C0657b.class.getSimpleName();

    static {
        Covode.recordClassIndex(2708);
    }

    public C0657b(Context context) {
        super(context);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x038d: IF  (r5 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:118:0x0392, block:B:117:0x038d */
    /* JADX WARN: Removed duplicated region for block: B:48:0x037b A[Catch: IOException -> 0x0384, TRY_ENTER, TryCatch #14 {IOException -> 0x0384, blocks: (B:34:0x00a6, B:36:0x00ab, B:81:0x0205, B:83:0x020a, B:70:0x0281, B:72:0x0286, B:59:0x02fd, B:61:0x0302, B:48:0x037b, B:50:0x0380), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0380 A[Catch: IOException -> 0x0384, TRY_LEAVE, TryCatch #14 {IOException -> 0x0384, blocks: (B:34:0x00a6, B:36:0x00ab, B:81:0x0205, B:83:0x020a, B:70:0x0281, B:72:0x0286, B:59:0x02fd, B:61:0x0302, B:48:0x037b, B:50:0x0380), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02fd A[Catch: IOException -> 0x0384, TRY_ENTER, TryCatch #14 {IOException -> 0x0384, blocks: (B:34:0x00a6, B:36:0x00ab, B:81:0x0205, B:83:0x020a, B:70:0x0281, B:72:0x0286, B:59:0x02fd, B:61:0x0302, B:48:0x037b, B:50:0x0380), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0302 A[Catch: IOException -> 0x0384, TRY_LEAVE, TryCatch #14 {IOException -> 0x0384, blocks: (B:34:0x00a6, B:36:0x00ab, B:81:0x0205, B:83:0x020a, B:70:0x0281, B:72:0x0286, B:59:0x02fd, B:61:0x0302, B:48:0x037b, B:50:0x0380), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0281 A[Catch: IOException -> 0x0384, TRY_ENTER, TryCatch #14 {IOException -> 0x0384, blocks: (B:34:0x00a6, B:36:0x00ab, B:81:0x0205, B:83:0x020a, B:70:0x0281, B:72:0x0286, B:59:0x02fd, B:61:0x0302, B:48:0x037b, B:50:0x0380), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0286 A[Catch: IOException -> 0x0384, TRY_LEAVE, TryCatch #14 {IOException -> 0x0384, blocks: (B:34:0x00a6, B:36:0x00ab, B:81:0x0205, B:83:0x020a, B:70:0x0281, B:72:0x0286, B:59:0x02fd, B:61:0x0302, B:48:0x037b, B:50:0x0380), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0205 A[Catch: IOException -> 0x0384, TRY_ENTER, TryCatch #14 {IOException -> 0x0384, blocks: (B:34:0x00a6, B:36:0x00ab, B:81:0x0205, B:83:0x020a, B:70:0x0281, B:72:0x0286, B:59:0x02fd, B:61:0x0302, B:48:0x037b, B:50:0x0380), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020a A[Catch: IOException -> 0x0384, TRY_LEAVE, TryCatch #14 {IOException -> 0x0384, blocks: (B:34:0x00a6, B:36:0x00ab, B:81:0x0205, B:83:0x020a, B:70:0x0281, B:72:0x0286, B:59:0x02fd, B:61:0x0302, B:48:0x037b, B:50:0x0380), top: B:2:0x0011 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private cn.com.chinatelecom.account.api.p037d.C0664i m20693d(java.lang.String r15, java.lang.String r16, int r17, cn.com.chinatelecom.account.api.p037d.C0662g r18) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.p037d.C0657b.m20693d(java.lang.String, java.lang.String, int, cn.com.chinatelecom.account.api.d.g):cn.com.chinatelecom.account.api.d.i");
    }

    /* renamed from: e */
    private C0664i m20692e(String str, String str2, int i, C0662g c0662g) {
        BufferedReader bufferedReader;
        MethodCollector.m14708i(178);
        C0664i c0664i = new C0664i();
        InputStream inputStream = null;
        try {
            try {
                try {
                    HttpURLConnection m20679b = m20679b(str, str2, i, c0662g);
                    int LIZ = C116971W2r.LIZ(m20679b);
                    int i2 = 0;
                    if (LIZ == 200) {
                        InputStream LIZJ = C116971W2r.LIZJ(m20679b);
                        try {
                            StringBuilder sb = new StringBuilder();
                            bufferedReader = new BufferedReader(new InputStreamReader(LIZJ));
                            while (true) {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    sb.append(readLine);
                                    sb.append("\n");
                                } catch (SocketTimeoutException e) {
                                    e = e;
                                    inputStream = LIZJ;
                                    c0664i.f20985b = C0676k.m20577a(80005, C0632d.m20735a(C0676k.f21037d) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + c0662g.f20965c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + e.getMessage());
                                    String str3 = f20956b;
                                    StringBuilder sb2 = new StringBuilder("SocketTimeoutException-");
                                    sb2.append(c0662g.f20965c);
                                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                    sb2.append(e.getMessage());
                                    CtAuth.warn(str3, sb2.toString(), e);
                                    C0671f.m20602a(c0662g.f20966d, c0664i.f20985b, "SocketTimeoutException ：" + e.getMessage());
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    MethodCollector.m14707o(178);
                                    return c0664i;
                                } catch (UnknownHostException e2) {
                                    e = e2;
                                    inputStream = LIZJ;
                                    c0664i.f20985b = C0676k.m20577a(80006, C0632d.m20735a(C0676k.f21038e) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + c0662g.f20965c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + e.getMessage());
                                    String str4 = f20956b;
                                    StringBuilder sb3 = new StringBuilder("UnknownHostException-");
                                    sb3.append(c0662g.f20965c);
                                    sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                    sb3.append(e.getMessage());
                                    CtAuth.warn(str4, sb3.toString(), e);
                                    C0671f.m20602a(c0662g.f20966d, c0664i.f20985b, "UnknownHostException ：" + e.getMessage());
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    MethodCollector.m14707o(178);
                                    return c0664i;
                                } catch (IOException e3) {
                                    e = e3;
                                    inputStream = LIZJ;
                                    c0664i.f20985b = C0676k.m20577a(80007, C0632d.m20735a(C0676k.f21039f) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + c0662g.f20965c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + e.getMessage());
                                    String str5 = f20956b;
                                    StringBuilder sb4 = new StringBuilder("IOException-");
                                    sb4.append(c0662g.f20965c);
                                    sb4.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                    sb4.append(e.getMessage());
                                    CtAuth.warn(str5, sb4.toString(), e);
                                    C0671f.m20602a(c0662g.f20966d, c0664i.f20985b, "IOException ：" + e.getMessage());
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    MethodCollector.m14707o(178);
                                    return c0664i;
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream = LIZJ;
                                    c0664i.f20985b = C0676k.m20577a(80001, C0632d.m20735a(C0676k.f21035b) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + c0662g.f20965c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + th.getMessage());
                                    String str6 = f20956b;
                                    StringBuilder sb5 = new StringBuilder("Throwable-");
                                    sb5.append(c0662g.f20965c);
                                    sb5.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                    sb5.append(th.getMessage());
                                    CtAuth.warn(str6, sb5.toString(), th);
                                    C0671f.m20602a(c0662g.f20966d, c0664i.f20985b, "Throwable ：" + th.getMessage());
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    MethodCollector.m14707o(178);
                                    return c0664i;
                                }
                            }
                            c0664i.f20984a = 0;
                            String sb6 = sb.toString();
                            if (!TextUtils.isEmpty(sb6)) {
                                c0664i.f20985b = new JSONObject(sb6);
                                C0671f.m20602a(c0662g.f20966d, c0664i.f20985b, null);
                            }
                            C0671f.m20602a(c0662g.f20966d, c0664i.f20985b, null);
                            C0668c m20653a = C0666a.m20653a(this.f20962a, m20679b, true);
                            if (m20653a != null) {
                                c0664i.f20986c = m20653a.f20993a;
                                C0671f.m20603a(c0662g.f20966d).m20607f(m20653a.f20995c);
                            }
                            bufferedReader.close();
                            if (LIZJ != null) {
                                LIZJ.close();
                            }
                        } catch (SocketTimeoutException e4) {
                            e = e4;
                            bufferedReader = null;
                        } catch (UnknownHostException e5) {
                            e = e5;
                            bufferedReader = null;
                        } catch (IOException e6) {
                            e = e6;
                            bufferedReader = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = null;
                        }
                    } else if (LIZ != 302) {
                        c0664i.f20985b = C0676k.m20577a(80002, C0632d.m20735a(C0676k.f21036c) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + c0662g.f20965c + "-code : " + LIZ);
                        String concat = " Http response code :".concat(String.valueOf(LIZ));
                        C0671f.m20602a(c0662g.f20966d, c0664i.f20985b, concat);
                        CtAuth.info(f20956b, concat);
                    } else if (c0662g.f20964b < 10) {
                        c0662g.f20964b++;
                        c0662g.f20968f = false;
                        String headerField = m20679b.getHeaderField("Location");
                        C0668c m20650a = C0666a.m20650a(m20679b);
                        C0671f.m20603a(c0662g.f20966d).m20607f(m20650a.f20995c);
                        if (!TextUtils.isEmpty(m20650a.f20996d) && !m20650a.f20996d.equals("0")) {
                            i2 = 1;
                        }
                        CtAuth.info(f20956b, " method : ".concat(String.valueOf(i2)));
                        C0664i mo20682a = mo20682a(headerField, null, i2, c0662g);
                        MethodCollector.m14707o(178);
                        return mo20682a;
                    } else {
                        c0664i.f20985b = C0676k.m20577a(80001, C0632d.m20735a(C0676k.f21035b) + "-Redirect more than 10 times");
                        C0671f.m20602a(c0662g.f20966d, c0664i.f20985b, "Redirect more than 10 times");
                    }
                } catch (Throwable th3) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            MethodCollector.m14707o(178);
                            throw th3;
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    MethodCollector.m14707o(178);
                    throw th3;
                }
            } catch (SocketTimeoutException e8) {
                e = e8;
                bufferedReader = null;
            } catch (UnknownHostException e9) {
                e = e9;
                bufferedReader = null;
            } catch (IOException e10) {
                e = e10;
                bufferedReader = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        MethodCollector.m14707o(178);
        return c0664i;
    }

    @Override // cn.com.chinatelecom.account.api.p037d.AbstractC0660e
    /* renamed from: a */
    public final C0664i mo20682a(String str, String str2, int i, C0662g c0662g) {
        return str.startsWith("https") ? m20693d(str, str2, i, c0662g) : m20692e(str, str2, i, c0662g);
    }
}
