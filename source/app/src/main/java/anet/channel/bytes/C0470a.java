package anet.channel.bytes;

import android.support.p007v4.media.session.PlaybackStateCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: anet.channel.bytes.a */
/* loaded from: classes10.dex */
public class C0470a {

    /* renamed from: a */
    public final TreeSet<ByteArray> f20423a = new TreeSet<>();

    /* renamed from: b */
    public final ByteArray f20424b = ByteArray.create(0);

    /* renamed from: c */
    public final Random f20425c = new Random();

    /* renamed from: d */
    public long f20426d = 0;

    static {
        Covode.recordClassIndex(2162);
    }

    /* renamed from: anet.channel.bytes.a$a */
    /* loaded from: classes10.dex */
    public static class C0471a {

        /* renamed from: a */
        public static C0470a f20427a = new C0470a();

        static {
            Covode.recordClassIndex(2163);
        }
    }

    /* renamed from: a */
    public synchronized ByteArray m21051a(int i) {
        MethodCollector.m14708i(30);
        if (i >= 524288) {
            ByteArray create = ByteArray.create(i);
            MethodCollector.m14707o(30);
            return create;
        }
        this.f20424b.bufferLength = i;
        ByteArray ceiling = this.f20423a.ceiling(this.f20424b);
        if (ceiling == null) {
            ceiling = ByteArray.create(i);
        } else {
            Arrays.fill(ceiling.buffer, (byte) 0);
            ceiling.dataLength = 0;
            this.f20423a.remove(ceiling);
            this.f20426d -= ceiling.bufferLength;
        }
        MethodCollector.m14707o(30);
        return ceiling;
    }

    /* renamed from: a */
    public synchronized void m21050a(ByteArray byteArray) {
        ByteArray pollLast;
        MethodCollector.m14708i(29);
        if (byteArray != null && byteArray.bufferLength < 524288) {
            this.f20426d += byteArray.bufferLength;
            this.f20423a.add(byteArray);
            while (this.f20426d > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                if (this.f20425c.nextBoolean()) {
                    pollLast = this.f20423a.pollFirst();
                } else {
                    pollLast = this.f20423a.pollLast();
                }
                this.f20426d -= pollLast.bufferLength;
            }
            MethodCollector.m14707o(29);
            return;
        }
        MethodCollector.m14707o(29);
    }

    /* renamed from: a */
    public ByteArray m21049a(byte[] bArr, int i) {
        ByteArray m21051a = m21051a(i);
        System.arraycopy(bArr, 0, m21051a.buffer, 0, i);
        m21051a.dataLength = i;
        return m21051a;
    }
}
