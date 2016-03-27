package appcore.com.androidux;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jeremy on 27/3/2016.
 */
public class MySimpleAdapter extends ArrayAdapter<String> {
    public MySimpleAdapter(Context context, int resource) {
        super(context, resource);
    }

    public MySimpleAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public MySimpleAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
    }

    public MySimpleAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    List<String> objectslist;


    public MySimpleAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        objectslist = objects;

        for (int i=0; i < objects.size(); i++)
        {
            mIdMap.put(objects.get(i), i);
        }
    }

    public MySimpleAdapter(Context context, int resource, int textViewResourceId, List<String> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

    /*@Override
    public long getItemId(int position) {
        String item = getItem(position);
        return mIdMap.get(item);
    }*/

    @Override
    public String getItem(int position) {
        //return super.getItem(position);
        return objectslist.get(position);

    }

    @Override
    public boolean hasStableIds() {
        return true;
    }
}

