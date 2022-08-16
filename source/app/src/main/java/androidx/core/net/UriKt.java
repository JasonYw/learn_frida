package androidx.core.net;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class UriKt {
    static {
        Covode.recordClassIndex(1008);
    }

    public static final Uri toUri(File file) {
        C106862S5w.LIZ(file);
        Uri fromFile = Uri.fromFile(file);
        Intrinsics.checkExpressionValueIsNotNull(fromFile, "");
        return fromFile;
    }

    public static final Uri toUri(String str) {
        C106862S5w.LIZ(str);
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "");
        return parse;
    }

    public static final File toFile(Uri uri) {
        C106862S5w.LIZ(uri);
        if (Intrinsics.areEqual(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }
}
