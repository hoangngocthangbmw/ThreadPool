package com.vinsofts.thread.ThreadPool;

import android.content.Context;
import android.util.Log;

import com.vinsofts.thread.Constant;
import com.vinsofts.thread.Inteface.IHandle;
import com.vinsofts.thread.Model.Song;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class LoadInforRunnable implements Runnable {
    private IHandle handle;
    private int number;

     LoadInforRunnable(int number, Context context) {
        this.number = number;
        this.handle = (IHandle) context;
    }

    @Override
    public void run() {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Song> listSong = new ArrayList<>();
        android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_BACKGROUND);
        try {
            URL url = new URL(Constant.list[number]);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            String all = String.valueOf(stringBuilder);
            JSONObject Object_all = new JSONObject(all);
            JSONArray collection = Object_all.getJSONArray("collection");
            int length = collection.length();
            for (int i = 0; i < length; i++) {
                JSONObject item_collection = collection.getJSONObject(i);
                JSONObject track = item_collection.getJSONObject("track");
                String artwork_url = track.getString("artwork_url");
                String score = item_collection.getString("score");
                listSong.add(new Song(artwork_url,score));
                Log.d("AAAAA", i+"");
                Thread.sleep(1000);
            }
            switch (number) {
                case 0:
                    handle.getData1(listSong);
                    break;
                case 1:
                    handle.getData2(listSong);
                    break;
                case 2:
                    handle.getData3(listSong);
                    break;
                case 3:
                    handle.getData4(listSong);
                    break;
                case 4:
                    handle.getData5(listSong);
                    break;
                case 5:
                    handle.getData6(listSong);
                    break;
            }
        } catch (IOException | JSONException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
