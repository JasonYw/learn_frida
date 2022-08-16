package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.help.Inputtips;
import com.amap.api.services.help.InputtipsQuery;
import com.amap.api.services.help.Tip;
import com.amap.api.services.interfaces.IInputtipsSearch;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.amap.api.services.a.aw */
/* loaded from: classes19.dex */
public class C1831aw implements IInputtipsSearch {

    /* renamed from: a */
    public Context f24294a;

    /* renamed from: b */
    public Inputtips.InputtipsListener f24295b;

    /* renamed from: c */
    public Handler f24296c = HandlerC2019t.m16280a();

    /* renamed from: d */
    public InputtipsQuery f24297d;

    static {
        Covode.recordClassIndex(5442);
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public InputtipsQuery getQuery() {
        return this.f24297d;
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public ArrayList<Tip> requestInputtips() {
        return m17023a(this.f24297d);
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public void requestInputtipsAsyn() {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.aw.1
                static {
                    Covode.recordClassIndex(5443);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.obj = C1831aw.this.f24295b;
                    obtainMessage.arg1 = 5;
                    try {
                        try {
                            ArrayList<? extends Parcelable> m17023a = C1831aw.this.m17023a(C1831aw.this.f24297d);
                            Bundle bundle = new Bundle();
                            bundle.putParcelableArrayList("result", m17023a);
                            obtainMessage.setData(bundle);
                            obtainMessage.what = 1000;
                        } catch (AMapException e) {
                            obtainMessage.what = e.getErrorCode();
                        }
                    } finally {
                        C1831aw.this.f24296c.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "Inputtips", "requestInputtipsAsynThrowable");
        }
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public void setInputtipsListener(Inputtips.InputtipsListener inputtipsListener) {
        this.f24295b = inputtipsListener;
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public void setQuery(InputtipsQuery inputtipsQuery) {
        this.f24297d = inputtipsQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public ArrayList<Tip> m17023a(InputtipsQuery inputtipsQuery) {
        try {
            C2015r.m16283a(this.f24294a);
            if (inputtipsQuery != null) {
                if (inputtipsQuery.getKeyword() != null && !inputtipsQuery.getKeyword().equals("")) {
                    return new C2013p(this.f24294a, inputtipsQuery).m17087c();
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (Throwable th) {
            C2007j.m16371a(th, "Inputtips", "requestInputtips");
            if (!(th instanceof AMapException)) {
                return null;
            }
            throw th;
        }
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public void requestInputtips(String str, String str2) {
        requestInputtips(str, str2, null);
    }

    public C1831aw(Context context, Inputtips.InputtipsListener inputtipsListener) {
        this.f24294a = context.getApplicationContext();
        this.f24295b = inputtipsListener;
    }

    public C1831aw(Context context, InputtipsQuery inputtipsQuery) {
        this.f24294a = context.getApplicationContext();
        this.f24297d = inputtipsQuery;
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public void requestInputtips(String str, String str2, String str3) {
        if (str != null && !str.equals("")) {
            this.f24297d = new InputtipsQuery(str, str2);
            this.f24297d.setType(str3);
            requestInputtipsAsyn();
            return;
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }
}
