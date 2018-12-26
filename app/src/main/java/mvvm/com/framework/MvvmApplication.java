package mvvm.com.framework;

/*
 *  ****************************************************************************
 *  * Created by : Md. Moniruzzaman Monir on 12/26/2018 at 5:21 PM.
 *  * Email : moniruzzaman@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md. Moniruzzaman Monir on 12/26/2018.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */

import android.app.Application;
import android.support.annotation.NonNull;

import mvvm.com.framework.datamodel.DataModel;
import mvvm.com.framework.datamodel.IDataModel;
import mvvm.com.framework.scheduler.ISchedulerProvider;
import mvvm.com.framework.scheduler.SchedulerProvider;

public class MvvmApplication extends Application {

    @NonNull
    private final IDataModel mDataModel;

    public MvvmApplication() {
        mDataModel = new DataModel();
    }

    @NonNull
    public IDataModel getDataModel() {
        return mDataModel;
    }

    @NonNull
    public ISchedulerProvider getSchedulerProvider() {
        return SchedulerProvider.getInstance();
    }

    @NonNull
    public MainViewModel getViewModel() {
        return new MainViewModel(getDataModel(), getSchedulerProvider());
    }
}
