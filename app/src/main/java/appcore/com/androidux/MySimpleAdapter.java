package appcore.com.androidux;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MySimpleAdapter extends ArrayAdapter<Person> {

    HashMap<Person, Integer> dataTable = new HashMap<Person, Integer>();
    LayoutInflater inflater;
    Context ctx;

    public MySimpleAdapter(Context context, int resource) {
        super(context, resource);
    }

    public MySimpleAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public MySimpleAdapter(Context context, int resource, Person[] objects) {
        super(context, resource, objects);
    }

    public MySimpleAdapter(Context context, int resource, int textViewResourceId, Person[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public MySimpleAdapter(Context context, int resource, List<Person> objects) {
        super(context, resource, objects);

        for (int i = 0; i < objects.size(); ++i)
        {
            Person p = objects.get(i);
            dataTable.put(p, i);
        }
    }

    public MySimpleAdapter(Context context, int resource, int textViewResourceId, List<Person> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
            convertView  = LayoutInflater.from(getContext()).inflate(R.layout.compositerow, parent, false);

        Person person = getItem(position);
        View view = convertView;

        TextView name = (TextView) view.findViewById(R.id.nameTextView);
        if (name != null)
            name.setText(person.getName());

        TextView email = (TextView) view.findViewById(R.id.emailTextView);
        if (email != null)
            email.setText(person.getEmail());

        return view;
    }

    @Override
    public long getItemId(int position) {
        Person p = (Person) getItem(position);
        return dataTable.get(p);
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }
}

