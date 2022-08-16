package cn.com.chinatelecom.account.p033a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.umeng.message.proguard.C34037f;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import p003X.C116971W2r;
import p003X.TFG;

/* renamed from: cn.com.chinatelecom.account.a.a */
/* loaded from: classes2.dex */
public class C0625a {
    static {
        Covode.recordClassIndex(2669);
        C0625a.class.getSimpleName();
    }

    /* renamed from: a */
    public static String m20752a(String str, String str2) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        MethodCollector.m14708i(164);
        String str3 = "";
        BufferedReader bufferedReader2 = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) C116971W2r.LIZ(new URL(str));
                C116971W2r.LIZ(httpURLConnection, "accept", "*/*");
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(TFG.LIZIZ);
                httpURLConnection.setReadTimeout(TFG.LIZIZ);
                httpURLConnection.setUseCaches(false);
                C116971W2r.LIZIZ(httpURLConnection, "Accept-Charset", C34037f.f43302f);
                if (!TextUtils.isEmpty(str2)) {
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                    dataOutputStream.write(str2.getBytes(C34037f.f43302f));
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } else {
                    httpURLConnection.connect();
                }
                if (C116971W2r.LIZ(httpURLConnection) == 200) {
                    inputStream = C116971W2r.LIZJ(httpURLConnection);
                    try {
                        StringBuilder sb = new StringBuilder();
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                                sb.append("\n");
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                try {
                                    th.printStackTrace();
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    MethodCollector.m14707o(164);
                                    return str3;
                                } catch (Throwable th2) {
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            MethodCollector.m14707o(164);
                                            throw th2;
                                        }
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    MethodCollector.m14707o(164);
                                    throw th2;
                                }
                            }
                        }
                        str3 = sb.toString();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    inputStream = null;
                    bufferedReader = null;
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        MethodCollector.m14707o(164);
        return str3;
    }
}
