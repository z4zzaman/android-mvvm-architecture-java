package mvvm.com.framework.datamodel;

/*
 *  ****************************************************************************
 *  * Created by : Md. Moniruzzaman Monir on 12/26/2018 at 5:25 PM.
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

import java.util.List;

import io.reactivex.Observable;
import mvvm.com.framework.model.Language;
import mvvm.com.framework.model.Language.LanguageCode;

public interface IDataModel {
    @NonNull
    Observable<List<Language>> getSupportedLanguages();

    @NonNull
    Observable<String> getGreetingByLanguageCode(@NonNull final LanguageCode code);
}
