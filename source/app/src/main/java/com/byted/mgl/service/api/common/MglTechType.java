package com.byted.mgl.service.api.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.bdpbase.core.MglOpenParams;
import com.bytedance.minigame.bdpbase.schema.SchemaInfo;

/* loaded from: classes26.dex */
public enum MglTechType {
    UNKNOWN(0),
    MINI_GAME(2),
    H5_GAME(4),
    UC_GAME(7);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int type;

    public final int toInt() {
        return this.type;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static MglTechType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (MglTechType[]) proxy.result;
        }
        return (MglTechType[]) values().clone();
    }

    static {
        Covode.recordClassIndex(9787);
    }

    public static MglTechType parse(int i) {
        if (i != 2) {
            if (i != 4) {
                if (i != 7) {
                    return UNKNOWN;
                }
                return UC_GAME;
            }
            return H5_GAME;
        }
        return MINI_GAME;
    }

    public static MglTechType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (MglTechType) proxy.result;
        }
        return (MglTechType) Enum.valueOf(MglTechType.class, str);
    }

    public static MglTechType parse(SchemaInfo schemaInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{schemaInfo}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (MglTechType) proxy.result;
        }
        return parse(schemaInfo.getTechType());
    }

    public static MglTechType parse(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (MglTechType) proxy.result;
        }
        return parse(str, null);
    }

    public static MglTechType parse(String str, MglOpenParams mglOpenParams) {
        int assignedTechType;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, mglOpenParams}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (MglTechType) proxy.result;
        }
        if (mglOpenParams != null && (assignedTechType = mglOpenParams.getAssignedTechType()) != 0) {
            return parse(assignedTechType);
        }
        SchemaInfo parse = SchemaInfo.parse(str);
        if (parse == null) {
            return UNKNOWN;
        }
        return parse(parse);
    }

    MglTechType(int i) {
        this.type = 2;
        this.type = i;
    }
}
