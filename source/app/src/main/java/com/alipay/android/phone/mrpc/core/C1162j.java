package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.vchannel.C33968a;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* renamed from: com.alipay.android.phone.mrpc.core.j */
/* loaded from: classes2.dex */
public final class C1162j extends AbstractC1141a {

    /* renamed from: g */
    public AbstractC1159g f21887g;

    static {
        Covode.recordClassIndex(4633);
    }

    public C1162j(AbstractC1159g abstractC1159g, Method method, int i, String str, byte[] bArr, boolean z) {
        super(method, i, str, bArr, "application/x-www-form-urlencoded", z);
        this.f21887g = abstractC1159g;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC1175v
    /* renamed from: a */
    public final Object mo19594a() {
        C1168o c1168o = new C1168o(this.f21887g.mo19647a());
        c1168o.m19626a(this.f21856b);
        c1168o.m19630a(this.f21859e);
        c1168o.m19627a(this.f21860f);
        c1168o.m19629a(C33968a.f42937f, String.valueOf(this.f21858d));
        c1168o.m19629a("operationType", this.f21857c);
        c1168o.m19629a("gzip", String.valueOf(this.f21887g.mo19644d()));
        c1168o.m19628a((Header) new BasicHeader("uuid", UUID.randomUUID().toString()));
        List<Header> m19663b = this.f21887g.mo19645c().m19663b();
        if (m19663b != null && !m19663b.isEmpty()) {
            for (Header header : m19663b) {
                c1168o.m19628a(header);
            }
        }
        StringBuilder sb = new StringBuilder("threadid = ");
        sb.append(Thread.currentThread().getId());
        sb.append("; ");
        sb.append(c1168o.toString());
        try {
            C1174u c1174u = this.f21887g.mo19646b().mo19635a(c1168o).get();
            if (c1174u == null) {
                throw new RpcException((Integer) 9, "response is null");
            }
            return c1174u.m19596b();
        } catch (InterruptedException e) {
            throw new RpcException(13, "", e);
        } catch (CancellationException e2) {
            throw new RpcException(13, "", e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null || !(cause instanceof HttpException)) {
                throw new RpcException(9, "", e3);
            }
            HttpException httpException = (HttpException) cause;
            int code = httpException.getCode();
            switch (code) {
                case 1:
                    code = 2;
                    break;
                case 2:
                    code = 3;
                    break;
                case 3:
                    code = 4;
                    break;
                case 4:
                    code = 5;
                    break;
                case 5:
                    code = 6;
                    break;
                case 6:
                    code = 7;
                    break;
                case 7:
                    code = 8;
                    break;
                case 8:
                    code = 15;
                    break;
                case 9:
                    code = 16;
                    break;
            }
            throw new RpcException(Integer.valueOf(code), httpException.getMsg());
        }
    }
}
