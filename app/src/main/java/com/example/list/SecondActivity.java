package com.example.list;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    GameListAdapter gameListAdapter;
    ArrayList<Game> gameList;
    private RecyclerView.LayoutManager linearLayoutManager, gridLayoutManager;
    Button btnChange;
    Boolean layoutType = false;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerView);
        btnChange = findViewById(R.id.btnChange);
        gameList = new ArrayList<>();
        gameListAdapter = new GameListAdapter(gameList, this);
        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(gameListAdapter);

        gameList.add(new Game("https://upload.wikimedia.org/wikipedia/ru/9/99/Stalkercover.jpg", "S.T.A.L.K.E.R", "«S.T.Á.L.K.E.R — компьютерная игра в жанре шутера от первого лица с элементами RPG и survival horror, разработанная и выпущенная украинской компанией GSC Game World для Microsoft Windows в 2007 году. За пределами СНГ издателем выступила американская компания THQ.", "Shooter"));
        gameList.add(new Game("https://static.wikia.nocookie.net/cnc/images/2/20/Cncgzh-win-cover.jpg/revision/latest?cb=20170714200121", "Generals: Zero Hour", "Command and Conquer: Generals - Zero Hour (C&C:G-ZH) - Компьютерная игра в жанре RTS, официальное дополнение к игре Generals. Из-за большого количества нововведений в ней существенно поменялось ведение боя.", "Strategy"));
        gameList.add(new Game("https://cdn.igromania.ru/mnt/news/7/4/4/a/8/c/82455/cf926bcb47405360_1200xH.jpg", "TES V: Skyrim", "The Elder Scrolls V: Skyrim (дословно с англ. — «Древние свитки 5: Скайрим») — мультиплатформенная компьютерная ролевая игра с открытым миром, разработанная студией Bethesda Game Studios и выпущенная компанией Bethesda Softworks. Это пятая часть в серии The Elder Scrolls.", "Fantasy"));
        gameList.add(new Game("https://i1.sndcdn.com/artworks-000074746211-lt2x0h-t500x500.jpg", "NFS: Most Wanted", "Need for Speed: Most Wanted (рус. Жажда скорости: Самый разыскиваемый; сокр. NFSMW) — компьютерная игра серии Need for Speed в жанре аркадной автогонки, разработанная студией EA Canada и изданная компанией Electronic Arts.", "Racing"));
        gameList.add(new Game("https://zikurat.media/wp-content/uploads/2020/07/CSGO-packet-loss-820x394.jpg", "CS:GO", "Counter-Strike: Global Offensive (CS:GO; с англ. — «Контрудар: глобальное наступление») — многопользовательская компьютерная игра, разработанная компаниями Valve и Hidden Path Entertainment.", "Shooter"));
        gameList.add(new Game("https://games.mail.ru/hotbox/content_files/article/2020/11/27/585c8d4859d748438b1762efe76eeebd.jpg", "GTA", "Grand Theft Auto (сокр. GTA) — серия мультиплатформенных компьютерных игр в жанре action-adventure, созданных и разрабатываемых главным образом британской компанией-разработчиком Rockstar North (бывшая DMA Design) и выпускаемых компанией Rockstar Games.", "Action Adventure"));
        gameList.add(new Game("https://upload.wikimedia.org/wikipedia/ru/4/4e/Mortal_Kombat_11.jpg", "MK: 11", "Mortal Kombat 11 (сокр. MK11; с англ. — «Смертельная битва 11») — компьютерная игра в жанре файтинг, разработанная американской студией NetherRealm Studios под издательством WB Games.", "Fighting"));
        gameList.add(new Game("https://upload.wikimedia.org/wikipedia/ru/thumb/8/8e/%D0%9E%D0%B1%D0%BB%D0%BE%D0%B6%D0%BA%D0%B0_Dota_2.jpg/266px-%D0%9E%D0%B1%D0%BB%D0%BE%D0%B6%D0%BA%D0%B0_Dota_2.jpg", "DOTA 2", "Dota 2 — компьютерная многопользовательская командная игра в жанре multiplayer online battle arena, разработанная корпорацией Valve.", "Battle Arena"));

        btnChange.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                layoutType =! layoutType;
                if (layoutType){
                    recyclerView.setLayoutManager(gridLayoutManager);
                    gameList.remove(0);
                }else{
                    recyclerView.setLayoutManager(linearLayoutManager);
                }


                gameListAdapter.notifyDataSetChanged();
            }
        });
    }
}
