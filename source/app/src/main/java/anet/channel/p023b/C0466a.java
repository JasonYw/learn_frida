package anet.channel.p023b;

import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.cache.Cache;
import com.bytedance.covode.number.Covode;
import com.taobao.alivfssdk.cache.AVFSCache;
import com.taobao.alivfssdk.cache.AVFSCacheConfig;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.IAVFSCache;
import com.xiaomi.clientreport.data.Config;
import p003X.C116971W2r;

/* renamed from: anet.channel.b.a */
/* loaded from: classes13.dex */
public class C0466a implements Cache {

    /* renamed from: a */
    public static boolean f20419a;

    /* renamed from: b */
    public static Object f20420b;

    /* renamed from: c */
    public static Object f20421c;

    /* renamed from: d */
    public static Object f20422d;

    /* renamed from: b */
    private IAVFSCache m21052b() {
        AVFSCache cacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache");
        if (cacheForModule != null) {
            return cacheForModule.getFileCache();
        }
        return null;
    }

    @Override // anetwork.channel.cache.Cache
    public void clear() {
        if (!f20419a) {
            return;
        }
        try {
            IAVFSCache m21052b = m21052b();
            if (m21052b != null) {
                m21052b.removeAllObject((IAVFSCache.OnAllObjectRemoveCallback) f20422d);
            }
        } catch (Exception e) {
            ALog.m20787e("anet.AVFSCacheImpl", "clear cache failed", null, e, new Object[0]);
        }
    }

    static {
        Covode.recordClassIndex(2157);
        f20419a = true;
        try {
            C116971W2r.LIZ("com.taobao.alivfssdk.cache.AVFSCacheManager");
            f20420b = new C0467b();
            f20421c = new C0468c();
            f20422d = new C0469d();
        } catch (ClassNotFoundException unused) {
            f20419a = false;
            ALog.m20783w("anet.AVFSCacheImpl", "no alivfs sdk!", null, new Object[0]);
        }
    }

    /* renamed from: a */
    public void m21053a() {
        AVFSCache cacheForModule;
        if (f20419a && (cacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache")) != null) {
            AVFSCacheConfig aVFSCacheConfig = new AVFSCacheConfig();
            aVFSCacheConfig.limitSize = 5242880L;
            aVFSCacheConfig.fileMemMaxSize = Config.DEFAULT_MAX_FILE_LENGTH;
            cacheForModule.moduleConfig(aVFSCacheConfig);
        }
    }

    @Override // anetwork.channel.cache.Cache
    public Cache.Entry get(String str) {
        if (!f20419a) {
            return null;
        }
        try {
            IAVFSCache m21052b = m21052b();
            if (m21052b != null) {
                return (Cache.Entry) m21052b.objectForKey(StringUtils.md5ToHex(str));
            }
        } catch (Exception e) {
            ALog.m20787e("anet.AVFSCacheImpl", "get cache failed", null, e, new Object[0]);
        }
        return null;
    }

    @Override // anetwork.channel.cache.Cache
    public void remove(String str) {
        if (!f20419a) {
            return;
        }
        try {
            IAVFSCache m21052b = m21052b();
            if (m21052b != null) {
                m21052b.removeObjectForKey(StringUtils.md5ToHex(str), (IAVFSCache.OnObjectRemoveCallback) f20421c);
            }
        } catch (Exception e) {
            ALog.m20787e("anet.AVFSCacheImpl", "remove cache failed", null, e, new Object[0]);
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void put(String str, Cache.Entry entry) {
        if (!f20419a) {
            return;
        }
        try {
            IAVFSCache m21052b = m21052b();
            if (m21052b != null) {
                m21052b.setObjectForKey(StringUtils.md5ToHex(str), entry, (IAVFSCache.OnObjectSetCallback) f20420b);
            }
        } catch (Exception e) {
            ALog.m20787e("anet.AVFSCacheImpl", "put cache failed", null, e, new Object[0]);
        }
    }
}
