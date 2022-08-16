package anet.channel.util;

import anet.channel.request.Request;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anet.channel.util.h */
/* loaded from: classes18.dex */
public class C0595h {

    /* renamed from: a */
    public static Map<String, Integer> f20843a;

    static {
        Covode.recordClassIndex(2379);
        HashMap hashMap = new HashMap();
        f20843a = hashMap;
        hashMap.put("tpatch", 3);
        f20843a.put("so", 3);
        f20843a.put("json", 3);
        f20843a.put("html", 4);
        f20843a.put("htm", 4);
        f20843a.put("css", 5);
        f20843a.put("js", 5);
        f20843a.put("webp", 6);
        f20843a.put("png", 6);
        f20843a.put("jpg", 6);
        f20843a.put("do", 6);
        f20843a.put("zip", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f20843a.put("bin", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f20843a.put("apk", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
    }

    /* renamed from: a */
    public static int m20755a(Request request) {
        Integer num;
        if (request != null) {
            if (request.getHeaders().containsKey("x-pv")) {
                return 1;
            }
            String trySolveFileExtFromUrlPath = HttpHelper.trySolveFileExtFromUrlPath(request.getHttpUrl().path());
            if (trySolveFileExtFromUrlPath == null || (num = f20843a.get(trySolveFileExtFromUrlPath)) == null) {
                return 6;
            }
            return num.intValue();
        }
        throw new NullPointerException("url is null!");
    }
}
