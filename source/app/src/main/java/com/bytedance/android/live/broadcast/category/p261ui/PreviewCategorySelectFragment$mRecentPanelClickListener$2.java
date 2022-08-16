package com.bytedance.android.live.broadcast.category.p261ui;

import android.view.View;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C4574547f;
import p003X.C88440Kt0;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategorySelectFragment$mRecentPanelClickListener$2 */
/* loaded from: classes5.dex */
public final class PreviewCategorySelectFragment$mRecentPanelClickListener$2 extends Lambda implements Function0<View.OnClickListener> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2968h this$0;

    static {
        Covode.recordClassIndex(15094);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCategorySelectFragment$mRecentPanelClickListener$2(C2968h c2968h) {
        super(0);
        this.this$0 = c2968h;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ View.OnClickListener mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new View.OnClickListener() { // from class: com.bytedance.android.live.broadcast.category.ui.PreviewCategorySelectFragment$mRecentPanelClickListener$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(15095);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(view, "");
                Object tag = view.getTag();
                if (tag != null && (tag instanceof CategoryNode)) {
                    HashMap hashMap = new HashMap();
                    String value = PreviewCategorySelectFragment$mRecentPanelClickListener$2.this.this$0.m15908LJ().LIZLLL().getValue();
                    if (value != null && value.length() > 0) {
                        hashMap.put("enter_from", value);
                    }
                    CategoryNode categoryNode = (CategoryNode) tag;
                    String str = categoryNode.title;
                    if (str != null) {
                        hashMap.put("category", str);
                    }
                    C4574547f.LIZ().LIZ("livesdk_category_choose", hashMap, new Object[0]);
                    if (!categoryNode.canChoose) {
                        String str2 = categoryNode.unChooseMsg;
                        if (str2 != null) {
                            C88440Kt0.LIZ(str2);
                        }
                    } else if (PreviewCategorySelectFragment$mRecentPanelClickListener$2.this.this$0.LIZLLL() == CategoryScene.GAME) {
                        PreviewCategorySelectFragment$mRecentPanelClickListener$2.this.this$0.m15908LJ().LJIILJJIL().setValue(Boolean.TRUE);
                        PreviewCategorySelectFragment$mRecentPanelClickListener$2.this.this$0.m15908LJ().LJFF().postValue(tag);
                    } else {
                        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BROADCAST_SELECT_TAG;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        Boolean value2 = settingKey.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "");
                        if (value2.booleanValue()) {
                            PreviewCategorySelectFragment$mRecentPanelClickListener$2.this.this$0.m15908LJ().LJIILJJIL().setValue(Boolean.TRUE);
                        }
                        PreviewCategorySelectFragment$mRecentPanelClickListener$2.this.this$0.m15908LJ().LJIIIZ().postValue(tag);
                    }
                }
            }
        };
    }
}
