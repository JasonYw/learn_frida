package com.bytedance.android.live.liveinteract.multianchor.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multianchor.model.MicDress;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class _MicDress_VoiceWave_ProtoDecoder implements AbstractC10531b<MicDress.VoiceWave> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28155);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final MicDress.VoiceWave mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (MicDress.VoiceWave) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static MicDress.VoiceWave decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (MicDress.VoiceWave) proxy.result;
        }
        MicDress.VoiceWave voiceWave = new MicDress.VoiceWave();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                QV1.LJII(c10532g);
                            } else {
                                voiceWave.f26352LJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            }
                        } else {
                            voiceWave.LIZLLL = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        }
                    } else {
                        voiceWave.LIZJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                    }
                } else {
                    voiceWave.LIZIZ = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return voiceWave;
            }
        }
    }
}
