package mvvm.com.framework.datamodel;

/*
 *  ****************************************************************************
 *  * Created by : Md. Moniruzzaman Monir on 12/26/2018 at 5:23 PM.
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

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import mvvm.com.framework.model.Language;
import mvvm.com.framework.model.Language.LanguageCode;

public class DataModel implements IDataModel {
    @NonNull
    @Override
    public Observable<List<Language>> getSupportedLanguages() {
        return Observable.fromCallable(this::getLanguages);
    }

    @NonNull
    @Override
    public Observable<String> getGreetingByLanguageCode(@NonNull Language.LanguageCode code) {
        switch (code) {
            case BN:
                return Observable.just("Bangla!");
            case EN:
                return Observable.just("English!");
            case HI:
                return Observable.just("India!");
            default:
                return Observable.empty();
        }

    }

    @NonNull
    private List<Language> getLanguages() {
        return Arrays
                .asList(new Language("English", LanguageCode.EN),
                        new Language("Bangla", LanguageCode.BN),
                        new Language("Hindi", LanguageCode.HI));
    }


}
