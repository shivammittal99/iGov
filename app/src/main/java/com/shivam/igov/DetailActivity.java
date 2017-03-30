package com.shivam.igov;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private String item;

    private ProgressBar pb_loading;
    private ExpandableListView lv_detail;
    private DetailAdapter mAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        item = getIntent().getStringExtra("ITEM");

        pb_loading = (ProgressBar) findViewById(R.id.pb_loading);
        lv_detail = (ExpandableListView) findViewById(R.id.lv_detail);

        prepareData();

        mAdapter = new DetailAdapter(this, listDataHeader, listDataChild);
        lv_detail.setAdapter(mAdapter);
        pb_loading.setVisibility(View.INVISIBLE);
    }

    private void prepareData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        if (item.equals("Scheme of Scholarship to Students from Non-Hindi Speaking States for Post Matric Studies in Hindi")) {
            listDataHeader.add("Objective");
            listDataHeader.add("Scope");
            listDataHeader.add("Eligibilty Criteria");
            listDataHeader.add("Non - Eligible Candidates");
            listDataHeader.add("Scholarship Amount");
            listDataHeader.add("Method of Application");
            listDataHeader.add("Documents Required");
            listDataHeader.add("Renewal Details");

            List<String> l1 = new ArrayList<String>();
            l1.add("Encourage the practice of learning Hindi in non-Hindi speaking states");

            List<String> l2 = new ArrayList<String>();
            l2.add("2500 Scholarships/year");

            List<String> l3 = new ArrayList<String>();
            l3.add("Academic Criteria");
            l3.add("Economic Criteria");
            l3.add("Physical Criteria");
            l3.add("Social Criteria");
            l3.add("Other Conditions");

            List<String> l4 = new ArrayList<String>();
            l4.add("Temporary Data");

            List<String> l5 = new ArrayList<String>();
            l5.add("Temporary Data");

            List<String> l6 = new ArrayList<String>();
            l6.add("Online");
            l6.add("Offline");
            l6.add("Submission Details");

            List<String> l7 = new ArrayList<String>();
            l7.add("Temporary Data");

            List<String> l8 = new ArrayList<String>();
            l8.add("Renewal happens annually depending on the good conduct, regularity and ...");

            listDataChild.put(listDataHeader.get(0), l1);
            listDataChild.put(listDataHeader.get(1), l2);
            listDataChild.put(listDataHeader.get(2), l3);
            listDataChild.put(listDataHeader.get(3), l4);
            listDataChild.put(listDataHeader.get(4), l5);
            listDataChild.put(listDataHeader.get(5), l6);
            listDataChild.put(listDataHeader.get(6), l7);
            listDataChild.put(listDataHeader.get(7), l8);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
