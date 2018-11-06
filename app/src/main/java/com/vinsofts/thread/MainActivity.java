package com.vinsofts.thread;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.vinsofts.thread.Adapter.Myadapter;
import com.vinsofts.thread.Inteface.IHandle;
import com.vinsofts.thread.Model.Song;
import com.vinsofts.thread.ThreadPool.ThreadPoolManager;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements IHandle {
    private List<Song> list1;
    private List<Song> list2;
    private List<Song> list3;
    private List<Song> list4;
    private List<Song> list5;
    private List<Song> list6;
    private Myadapter myadapter1;
    private Myadapter myadapter2;
    private Myadapter myadapter3;
    private Myadapter myadapter4;
    private Myadapter myadapter5;
    private Myadapter myadapter6;
    @BindView(R.id.rc_Main1)
    RecyclerView rcMain1;
    @BindView(R.id.rc_Main2)
    RecyclerView rcMain2;
    @BindView(R.id.rc_Main3)
    RecyclerView rcMain3;
    @BindView(R.id.rc_Main4)
    RecyclerView rcMain4;
    @BindView(R.id.rc_Main5)
    RecyclerView rcMain5;
    @BindView(R.id.rc_Main6)
    RecyclerView rcMain6;
    @BindView(R.id.linearLayout)
    LinearLayout linearLayout;
    @BindView(R.id.scrollview)
    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        list4 = new ArrayList<>();
        list5 = new ArrayList<>();
        list6 = new ArrayList<>();

        myadapter1 = new Myadapter(this, list1);
        myadapter2 = new Myadapter(this, list2);
        myadapter3 = new Myadapter(this, list3);
        myadapter4 = new Myadapter(this, list4);
        myadapter5 = new Myadapter(this, list5);
        myadapter6 = new Myadapter(this, list6);

        ThreadPoolManager.newInstance(this);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager4 = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager5 = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager6 = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);

        rcMain1.setLayoutManager(layoutManager1);
        rcMain2.setLayoutManager(layoutManager2);
        rcMain3.setLayoutManager(layoutManager3);
        rcMain4.setLayoutManager(layoutManager4);
        rcMain5.setLayoutManager(layoutManager5);
        rcMain6.setLayoutManager(layoutManager6);

        rcMain1.setAdapter(myadapter1);
        rcMain2.setAdapter(myadapter2);
        rcMain3.setAdapter(myadapter3);
        rcMain4.setAdapter(myadapter4);
        rcMain5.setAdapter(myadapter5);
        rcMain6.setAdapter(myadapter6);
    }

    @Override
    public void getData1(ArrayList<Song> list) {
        list1.clear();
        list1.addAll(list);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadapter1.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void getData2(ArrayList<Song> list) {
        list2.clear();
        list2.addAll(list);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadapter2.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void getData3(ArrayList<Song> list) {
        list3.clear();
        list3.addAll(list);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadapter3.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void getData4(ArrayList<Song> list) {
        list4.clear();
        list4.addAll(list);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadapter4.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void getData5(ArrayList<Song> list) {
        list5.clear();
        list5.addAll(list);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadapter5.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void getData6(ArrayList<Song> list) {
        list6.clear();
        list6.addAll(list);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadapter6.notifyDataSetChanged();
            }
        });
    }
}
