package app.law.testgitprj2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI()
    {
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        mainlistview = (ListView) findViewById(R.id.mainlistview);
        mainlistview.setAdapter(new TLawAdapater());
        initListeners();

    }

    private void initListeners()
    {
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, TAnotherActivity.class));

            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "This is a Test !!!", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private class TLawAdapater extends BaseAdapter
    {

        @Override
        public int getCount()
        {
            return lawStore.size();
        }

        @Override
        public Object getItem(int i)
        {
            return lawStore.get(i);
        }

        @Override
        public long getItemId(int i)
        {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
           View rootView;
            rootView = getLayoutInflater().inflate(R.layout.rowlayout, null);
            return rootView;
        }
    }


    private ArrayList lawStore = new ArrayList<String>();
    private Button button1, button2;
    private ListView mainlistview;
}
