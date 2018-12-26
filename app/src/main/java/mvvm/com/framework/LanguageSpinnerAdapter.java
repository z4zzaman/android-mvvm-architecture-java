package mvvm.com.framework;

/*
 *  ****************************************************************************
 *  * Created by : Md. Moniruzzaman Monir on 12/26/2018 at 6:27 PM.
 *  * Email : moniruzzaman@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md. Moniruzzaman Monir on 12/26/2018.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import mvvm.com.framework.model.Language;

public class LanguageSpinnerAdapter extends ArrayAdapter<Language> {
    public LanguageSpinnerAdapter(final Context context, final int resource,
                                  final List<Language> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {
        return getCustomView(position, convertView);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView);
    }

    private View getCustomView(int position, View convertView) {
        ViewHolder holder;
        View view = convertView;

        if (view == null) {
            view = inflateView();
            TextView textView = (TextView) view.findViewById(android.R.id.text1);
            holder = new ViewHolder(textView);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Language language = getItem(position);
        holder.bind(language.getName());

        return view;
    }
    @NonNull
    private View inflateView() {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return inflater.inflate(R.layout.language_item, null);
    }


    private class ViewHolder {

        @NonNull
        private final TextView mText;

        public ViewHolder(@NonNull final TextView text) {
            mText = text;
        }

        public void bind(@NonNull final String text) {
            mText.setText(text);
        }
    }

}
