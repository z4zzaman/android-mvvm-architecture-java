package mvvm.com.framework.model;

/*
 *  ****************************************************************************
 *  * Created by : Md. Moniruzzaman Monir on 12/26/2018 at 5:26 PM.
 *  * Email : moniruzzaman@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md. Moniruzzaman Monir on 12/26/2018.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */

import android.support.annotation.NonNull;

public class Language {
    public enum LanguageCode {
        EN, BN, HI
    }

    @NonNull
    private final String mName;

    @NonNull
    private final LanguageCode mCode;

    public Language(@NonNull final String name, @NonNull final LanguageCode code) {
        mName = name;
        mCode = code;
    }

    @NonNull
    public String getName() {
        return mName;
    }

    @NonNull
    public LanguageCode getCode() {
        return mCode;
    }
}
