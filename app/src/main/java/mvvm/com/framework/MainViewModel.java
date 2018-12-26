package mvvm.com.framework;

/*
 *  ****************************************************************************
 *  * Created by : Md. Moniruzzaman Monir on 12/26/2018 at 5:20 PM.
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
import io.reactivex.subjects.BehaviorSubject;
import mvvm.com.framework.datamodel.IDataModel;
import mvvm.com.framework.model.Language;
import mvvm.com.framework.scheduler.ISchedulerProvider;

public class MainViewModel {
    @NonNull
    private final IDataModel mDataModel;
    @NonNull
    private final ISchedulerProvider mSchedulerProvider;
    @NonNull
    private final BehaviorSubject<Language> mSelectedLanguage = BehaviorSubject.create();

    public MainViewModel(@NonNull final IDataModel dataModel,
                         @NonNull final ISchedulerProvider schedulerProvider) {
        mDataModel = dataModel;
        mSchedulerProvider = schedulerProvider;
    }

    @NonNull
    public Observable<String> getGreeting() {
        return mSelectedLanguage
                .observeOn(mSchedulerProvider.computation())
                .map(Language::getCode)
                .flatMap(mDataModel::getGreetingByLanguageCode);
    }

    @NonNull
    public Observable<List<Language>> getSupportedLanguages() {
        return mDataModel.getSupportedLanguages();
    }


    public void languageSelected(@NonNull final Language language) {
        mSelectedLanguage.onNext(language);
    }
}
