package anetwork.channel.cache;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public interface Cache {

    /* loaded from: classes8.dex */
    public static class Entry implements Serializable {
        public byte[] data;
        public String etag;
        public long lastModified;
        public Map<String, List<String>> responseHeaders = Collections.EMPTY_MAP;
        public long serverDate;
        public long ttl;

        static {
            Covode.recordClassIndex(2433);
        }
    }

    static {
        Covode.recordClassIndex(2432);
    }

    void clear();

    Entry get(String str);

    void put(String str, Entry entry);

    void remove(String str);
}
